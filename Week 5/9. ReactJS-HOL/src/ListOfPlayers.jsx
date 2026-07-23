import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat Kohli', score: 120 },
    { name: 'Rohit Sharma', score: 45 },
    { name: 'MS Dhoni', score: 85 },
    { name: 'Sachin Tendulkar', score: 100 },
    { name: 'Shikhar Dhawan', score: 65 },
    { name: 'KL Rahul', score: 55 },
    { name: 'Hardik Pandya', score: 90 },
    { name: 'Ravindra Jadeja', score: 30 },
    { name: 'Rishabh Pant', score: 75 },
    { name: 'Jasprit Bumrah', score: 10 },
    { name: 'Yuvraj Singh', score: 150 }
  ];
  const playersBelow70 = players.filter(player => player.score < 70);

  return (
    <div style={{ padding: '20px' }}>
      <h2>All Players</h2>
      <ul>
        {players.map((item, index) => (
          <div key={index}>
            <li>Mr. {item.name} <span> {item.score}</span></li>
          </div>
        ))}
      </ul>

      <h2>Players with Scores Below 70</h2>
      <ul>
        {playersBelow70.map((item, index) => (
          <div key={index}>
            <li>Mr. {item.name} <span> {item.score}</span></li>
          </div>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;