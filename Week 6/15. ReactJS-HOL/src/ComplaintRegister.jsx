import React, { useState } from 'react';

const ComplaintRegister = () => {
  const [empName, setEmpName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const referenceNumber = Math.floor(Math.random() * 1000000);
    alert(`Complaint registered successfully!\nReference Number: REF-${referenceNumber}`);
    setEmpName('');
    setComplaint('');
  };

  return (
    <div style={{ padding: '20px', maxWidth: '400px', margin: '0 auto', fontFamily: 'sans-serif' }}>
      <h2>Complaint Register</h2>
      <form onSubmit={handleSubmit} style={{ display: 'flex', flexDirection: 'column', gap: '15px' }}>
        <div>
          <label style={{ display: 'block', marginBottom: '5px' }}>Employee Name:</label>
          <input 
            type="text" 
            value={empName} 
            onChange={(e) => setEmpName(e.target.value)} 
            required 
            style={{ width: '100%', padding: '8px', boxSizing: 'border-box' }}
          />
        </div>
        
        <div>
          <label style={{ display: 'block', marginBottom: '5px' }}>Complaint:</label>
          <textarea 
            value={complaint} 
            onChange={(e) => setComplaint(e.target.value)} 
            required 
            rows="5"
            style={{ width: '100%', padding: '8px', boxSizing: 'border-box' }}
          />
        </div>

        <button type="submit" style={{ padding: '10px', backgroundColor: '#007BFF', color: 'white', border: 'none', cursor: 'pointer' }}>
          Submit Complaint
        </button>
      </form>
    </div>
  );
};

export default ComplaintRegister;