import React, { Component } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: false
    };
    this.handleLogin = this.handleLogin.bind(this);
    this.handleLogout = this.handleLogout.bind(this);
  }

  handleLogin() {
    this.setState({ isLoggedIn: true });
  }

  handleLogout() {
    this.setState({ isLoggedIn: false });
  }

  render() {
    let pageContent;
    let authButton;
    if (this.state.isLoggedIn) {
      pageContent = <UserPage />;
      authButton = <button onClick={this.handleLogout} style={{ padding: '8px 16px' }}>Logout</button>;
    } else {
      pageContent = <GuestPage />;
      authButton = <button onClick={this.handleLogin} style={{ padding: '8px 16px' }}>Login</button>;
    }

    return (
      <div style={{ fontFamily: 'Arial, sans-serif', maxWidth: '600px', margin: '0 auto', padding: '20px' }}>
        <h1>Ticket Booking App</h1>
        <div style={{ marginBottom: '20px' }}>
          {authButton}
        </div>
        
        {pageContent}
      </div>
    );
  }
}

export default App;