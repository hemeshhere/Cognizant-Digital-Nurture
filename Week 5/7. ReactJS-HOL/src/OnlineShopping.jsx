import React, { Component } from 'react';
import Cart from './Cart';
class OnlineShopping extends Component {
  constructor(props) {
    super(props);
    this.state = {
      items: [
        { id: 1, itemname: 'Laptop', price: 65000 },
        { id: 2, itemname: 'Smartphone', price: 30000 },
        { id: 3, itemname: 'Wireless Headphones', price: 2500 },
        { id: 4, itemname: 'Mechanical Keyboard', price: 4000 },
        { id: 5, itemname: 'Gaming Mouse', price: 1500 }
      ]
    };
  }
  render() {
    return (
      <div style={{ padding: '20px' }}>
        <h1>Shopping Cart</h1>
        <div style={{ display: 'flex', flexWrap: 'wrap' }}>
          {this.state.items.map((item) => (
            <Cart 
              key={item.id} 
              itemname={item.itemname} 
              price={item.price} 
            />
          ))}
        </div>
      </div>
    );
  }
}

export default OnlineShopping;
