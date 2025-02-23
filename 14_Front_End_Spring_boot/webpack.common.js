const path = require('path');

module.exports = {
  entry: {
    app: './js/customer.js',
  },
  output: {
    path: path.resolve(__dirname, 'dist'),
    clean: true,
    filename: './js/customer.js',
  },
};
