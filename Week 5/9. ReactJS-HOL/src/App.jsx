import React from 'react';
import ListofPlayers from './ListofPlayers';
import IndianPlayers from './IndianPlayers';

function App() {
  const flag = true; 

  if (flag) {
    return (
      <div>
        <h1>Cricket App (Flag is True)</h1>
        <ListofPlayers />
      </div>
    );
  } else {
    return (
      <div>
        <h1>Cricket App (Flag is False)</h1>
        <IndianPlayers />
      </div>
    );
  }
}

export default App;