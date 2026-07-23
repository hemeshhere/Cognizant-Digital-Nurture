import React from 'react';

const GuestPage = () => {
  return (
    <div style={{ padding: '20px', border: '1px solid #ccc', marginTop: '20px' }}>
      <h2>Guest View - Flight Details</h2>
      <p>Welcome! Here are the available flights. <strong>You must log in to book tickets.</strong></p>
      
      <ul>
        <li><strong>Flight IND-101:</strong> Delhi to Mumbai - 10:00 AM</li>
        <li><strong>Flight IND-202:</strong> Bangalore to Chennai - 02:30 PM</li>
        <li><strong>Flight IND-303:</strong> Hyderabad to Kolkata - 06:45 PM</li>
      </ul>
    </div>
  );
};

export default GuestPage;