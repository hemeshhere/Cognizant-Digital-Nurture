import React from 'react';

const IndianPlayers = () => {
  const T20players = ['First Player', 'Second Player', 'Third Player'];
  const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
  const indianPlayers = [...T20players, ...RanjiTrophyPlayers];
  const [odd1, even1, odd2, even2, odd3, even3] = indianPlayers;
  return (
    <div style={{ padding: '20px' }}>
      <h2>Merged Indian Players (T20 & Ranji)</h2>
      <ul>
        {indianPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Odd Team Players</h2>
      <ul>
        <li>{odd1}</li>
        <li>{odd2}</li>
        <li>{odd3}</li>
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        <li>{even1}</li>
        <li>{even2}</li>
        <li>{even3}</li>
      </ul>
    </div>
  );
};

export default IndianPlayers;