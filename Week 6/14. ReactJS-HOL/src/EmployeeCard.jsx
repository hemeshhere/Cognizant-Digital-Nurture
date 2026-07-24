import React, { useContext } from 'react';
import ThemeContext from './ThemeContext';
import './App.css'; 

function EmployeeCard({ employee }) {
  const theme = useContext(ThemeContext);

  return (
    <div style={{ border: '1px solid gray', padding: '10px', margin: '10px 0' }}>
      <h3>{employee.name}</h3>
      <p>{employee.designation}</p>
      <button className={`btn-${theme}`}>
        View Profile
      </button>
    </div>
  );
}

export default EmployeeCard;