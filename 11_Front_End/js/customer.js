const getAllCustomer=()=>{
  $.ajax({
    url: 'http://localhost:8080/10_Back_End_Web_exploded/api/v1/customer/getAll',
    type: "GET",
    success:(res) =>{
      console.log(res)
      $('#customer_table_body').empty()
      res.forEach(customer => {
        $('#customer_table_body').append(`
                 <tr>
                    <td>${customer.id}</td>//display customer id
                    <td>${customer.name}</td>
                    <td>${customer.address}</td>
                    <td>${customer.age}</td>

                     <td>
                          <button class="btn btn-light btn-sm" onclick="editCustomer('${customer.id}','${customer.name}','${customer.address}',${customer.age})">
                           Update
                           </button>
                      </td>
                       <td>
                            <button class="btn btn-light btn-sm" onclick="deleteCustomer('${customer.id}')">
                              Dalete
                             </button>-
                        </td>
                     </tr>

          `)
      })

    },
    errors:(err) =>{
      console.log(err)
    }

  })
}
$(document).ready(function (){
  getAllCustomer();
})

  $('#btn_save_customer').click((e) =>{
  e.preventDefault();
  const customerId=$("#id").val();
  const customerName=$('#name').val();
  const  customerAddress=$('#address').val();
  const customerAge=$('#age').val();

  const customerData ={
  id:customerId,
  name: customerName,
  address: customerAddress,
  age: customerAge
};

  $.ajax({
  url:'http://localhost:8080/10_Back_End_Web_exploded/api/v1/customer/save',
  type:"POST",
  data:JSON.stringify(
  customerData
  ),
  contentType:"application/json",
  success:(res) =>{
  getAllCustomer()
  console.log(res)
},
  errors:(err) =>{
  console.log(err)
}

})
})

  const deleteCustomer=(id) =>{
  $.ajax({
    url:`http://localhost:8080/10_Back_End_Web_exploded/api/v1/customer/delete/${id}`,
    type:'DELETE',
    success:(res)=>{
      console.log(res)
      getAllCustomer()

    },
    error:(err) =>{
      console.log(err)
    }

  })
}

  const editCustomer=(id,name,address,age) =>{
  $('#updated_customer_id').val(id)
  $('#updated_name').val(name)
  $('#updated_address').val(address)
  $('#updated_age').val(age)
  $('#updateCustomerModal').modal('show')
}

  $('#btn_update_customer').click((e) =>{
  e.preventDefault()
  const id=$('#updated_customer_id').val()
  const name=$('#updated_name').val()
  const address=$('#updated_address').val()
  const age=$('#updated_age').val()

  const updateCustomerData={
  id,
  name,
  address,
  age

}
  $.ajax({
  url:'http://localhost:8080/10_Back_End_Web_exploded/api/v1/customer/update',
  type:'PUT',
  data: JSON.stringify(updateCustomerData),
  contentType:"application/json",
  success:(res)=>{
  getAllCustomer()
  console.log(res)
},
  error:(res)=>{
  console.log(err)
}


})
})
