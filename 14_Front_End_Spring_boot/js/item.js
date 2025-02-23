const getAllCustomer=()=>{
  $.ajax({
    url: 'http://localhost:8080/api/v1/item/getAll',
    type: "GET",
    success:(res) =>{
      console.log(res)
      $('#customer_table_body').empty()
      res.data.forEach(item => {
        $('#customer_table_body').append(`
                 <tr>
                    <td>${item.id}</td>//display customer id
                    <td>${item.name}</td>
                    <td>${item.description}</td>
                    <td>${item.qty}</td>
                    <td>${item.price}</td>

                     <td>
                          <button class="btn btn-light btn-sm" onclick="editCustomer('${item.id}','${item.name}','${item.description}','${item.qty}','${item.price}')">
                           Update
                           </button>
                      </td>
                       <td>
                            <button class="btn btn-light btn-sm" onclick="deleteCustomer('${item.id}')">
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
  const id=$("#id").val();
  const name=$('#name').val();
  const  customerDesc=$('#desc').val();
  const  qty=$('#qty').val();
  const  price=$('#price').val();

  const customerData ={
    id:id,
    name: name,
    description: customerDesc,
    qty: qty,
    price:price
  };

  $.ajax({
    url:'http://localhost:8080/api/v1/item/save',
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
    url:`http://localhost:8080/api/v1/item/delete/${id}`,
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

const editCustomer=(id,name,description,qty,price) =>{
  $('#updated_customer_id').val(id)
  $('#updated_name').val(name)
  $('#update_desc').val(description)  // Notice 'update_desc'
  $('#update_qty').val(qty)
  $('#update_price').val(price)
  $('#updateCustomerModal').modal('show')
}

$('#btn_update_customer').click((e) =>{
  e.preventDefault()
  const id=$('#updated_customer_id').val()
  const name=$('#updated_name').val()
  const description = $('#update_desc').val()  // Notice 'updated_desc' - different from above
  const qty = $('#update_qty').val()
  const  price=$('#update_price').val()

  const updateCustomerData={
    id,
    name,
    description,
    qty,
    price


  }
  $.ajax({
    url:'http://localhost:8080/api/v1/item/update',
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
