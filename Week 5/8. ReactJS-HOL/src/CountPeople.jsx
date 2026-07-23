import React, { Component } from 'react';
class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entrycount: 0,
      exitcount: 0
    };
    this.UpdateEntry = this.UpdateEntry.bind(this);
    this.UpdateExit = this.UpdateExit.bind(this);
  }

  UpdateEntry() {
    this.setState((prevState) => ({
      entrycount: prevState.entrycount + 1
    }));
  }

  UpdateExit() {
    this.setState((prevState) => ({
      exitcount: prevState.exitcount + 1
    }));
  }

  render() {
    return (
      <div style={{ margin: '20px', fontFamily: 'Arial, sans-serif' }}>
        <h2>Mall Traffic Counter</h2>
        <div style={{ marginBottom: '15px' }}>
          <button 
            onClick={this.UpdateEntry} 
            style={{ padding: '8px 16px', marginRight: '15px', cursor: 'pointer' }}
          >
            Login
          </button>
          <span>{this.state.entrycount} people entered!!</span>
        </div>
        <div>
          <button 
            onClick={this.UpdateExit} 
            style={{ padding: '8px 16px', marginRight: '15px', cursor: 'pointer' }}
          >
            Exit
          </button>
          <span>{this.state.exitcount} people left!!</span>
        </div>
      </div>
    );
  }
}

export default CountPeople;