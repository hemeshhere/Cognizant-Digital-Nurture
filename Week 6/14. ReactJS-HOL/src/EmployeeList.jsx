import React from 'react';
import EmployeeCard from './EmployeeCard';

function EmployeeList() {
  const employees = [
    { id: 1, name: 'Raj', designation: 'Software Engineer' },
    { id: 2, name: 'Himesh', designation: 'Quality Assurance' },
    { id: 3, name: 'Yash', designation: 'React Architect' }
  ];

  return (
    <div>
      {employees.map((employee) => (
        <EmployeeCard key={employee.id} employee={employee} />
      ))}
    </div>
  );
}

export default EmployeeList;