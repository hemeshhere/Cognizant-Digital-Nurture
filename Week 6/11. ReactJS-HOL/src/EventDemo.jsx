import React, { Component } from 'react';

class EventDemo extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0,
      message: ""
    };
    this.handleIncrement = this.handleIncrement.bind(this);
    this.handleDecrement = this.handleDecrement.bind(this);
    this.sayHello = this.sayHello.bind(this);
    this.handleMultipleMethods = this.handleMultipleMethods.bind(this);
    this.handleWelcome = this.handleWelcome.bind(this);
    this.onPress = this.onPress.bind(this);
  }
  handleIncrement() {
    this.setState((prevState) => ({ counter: prevState.counter + 1 }));
  }
  handleDecrement() {
    this.setState((prevState) => ({ counter: prevState.counter - 1 }));
  }
  sayHello() {
    this.setState({ message: "Hello! This is a static message." });
  }
  handleMultipleMethods() {
    this.handleIncrement();
    this.sayHello();
  }
  handleWelcome(greeting) {
    this.setState({ message: `Message: ${greeting}` });
  }
  onPress(event) {
    console.log("Synthetic Event Details:", event);
    alert("I was clicked");
  }
  render() {
    return (
      <div style={{ padding: '20px', borderBottom: '2px solid #ccc' }}>
        <h2>Event Handling Demo</h2>
        
        <div style={{ marginBottom: '20px' }}>
          <h3>Counter: {this.state.counter}</h3>
          <p style={{ color: 'blue', fontWeight: 'bold' }}>{this.state.message}</p>
        </div>

        <div style={{ display: 'flex', gap: '10px', flexWrap: 'wrap' }}>
          <button onClick={this.handleMultipleMethods}>
            Increment (Multiple Methods)
          </button>
          <button onClick={this.handleDecrement}>
            Decrement
          </button>
          <button onClick={() => this.handleWelcome("Welcome")}>
            Say Welcome
          </button>
          <button onClick={this.onPress}>
            OnPress (Synthetic Event)
          </button>
        </div>
      </div>
    );
  }
}

export default EventDemo;