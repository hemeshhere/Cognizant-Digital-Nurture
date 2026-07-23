import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: '',
      euros: 0
    };
    this.handleInputChange = this.handleInputChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleInputChange(event) {
    this.setState({ rupees: event.target.value });
  }
  handleSubmit(event) {
    event.preventDefault(); 
    const conversionRate = 0.011;
    const convertedAmount = parseFloat(this.state.rupees) * conversionRate;
    
    this.setState({ euros: convertedAmount.toFixed(2) });
  }

  render() {
    return (
      <div style={{ padding: '20px' }}>
        <h2>Currency Convertor (INR to EUR)</h2>
        
        <form onSubmit={this.handleSubmit}>
          <div style={{ marginBottom: '10px' }}>
            <label style={{ marginRight: '10px' }}>Indian Rupees (₹): </label>
            <input 
              type="number" 
              value={this.state.rupees} 
              onChange={this.handleInputChange} 
              placeholder="Enter amount in INR"
              required
            />
          </div>
          <button type="submit">Convert</button>
        </form>

        <div style={{ marginTop: '20px' }}>
          <h3>Converted Amount: € {this.state.euros}</h3>
        </div>
      </div>
    );
  }
}

export default CurrencyConvertor;