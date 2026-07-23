import React from 'react';

const UserPage = () => {
  return (
    <div style={{ padding: '20px', border: '1px solid #4CAF50', marginTop: '20px', backgroundColor: '#f9fff9' }}>
      <h2>User View - Book Tickets</h2>
      <p>Welcome back! You have full access to book your flights.</p>
      
      <ul style={{ listStyleType: 'none', padding: 0 }}>
        <li style={{ marginBottom: '10px' }}>
          <strong>Flight IND-101:</strong> Delhi to Mumbai 
          <button style={{ marginLeft: '15px', cursor: 'pointer' }}>Book Now</button>
        </li>
        <li style={{ marginBottom: '10px' }}>
          <strong>Flight IND-202:</strong> Bangalore to Chennai 
          <button style={{ marginLeft: '15px', cursor: 'pointer' }}>Book Now</button>
        </li>
        <li style={{ marginBottom: '10px' }}>
          <strong>Flight IND-303:</strong> Hyderabad to Kolkata 
          <button style={{ marginLeft: '15px', cursor: 'pointer' }}>Book Now</button>
        </li>
      </ul>
    </div>
  );
};

export default UserPage;