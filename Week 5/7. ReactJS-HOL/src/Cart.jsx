import React, { Component } from 'react';

class Cart extends Component {
  render() {
    const { itemname, price } = this.props;
    return (
      <div style={{ border: '1px solid #ccc', margin: '10px', padding: '10px', width: '200px' }}>
        <h3>{itemname}</h3>
        <p>Price: ₹{price}</p>
      </div>
    );
  }
}
Cart.defaultProps = {
  itemname: "Unknown Item",
  price: 0
};

export default Cart;