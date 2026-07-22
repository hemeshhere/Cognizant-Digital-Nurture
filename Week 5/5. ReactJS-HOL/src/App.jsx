import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    { 
      id: 1, 
      name: 'Java Full Stack', 
      status: 'ongoing', 
      startDate: 'Aug 2026', 
      endDate: 'Dec 2026' 
    },
    { 
      id: 2, 
      name: 'React Development', 
      status: 'completed', 
      startDate: 'Jan 2026', 
      endDate: 'Jun 2026' 
    }
  ];

  return (
    <div>
      <h2>Academy Dashboard</h2>
      {cohorts.map(cohort => (
        <CohortDetails key={cohort.id} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;