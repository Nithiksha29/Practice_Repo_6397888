import React from 'react';
import CohortDetails from './components/CohortDetails';

// Sample static data
const cohorts = [
  {
    name: 'React Bootcamp',
    trainer: 'John Doe',
    status: 'ongoing',
    startDate: '2025-07-01',
    endDate: '2025-08-01'
  },
  {
    name: 'Java Spring Cohort',
    trainer: 'Jane Smith',
    status: 'completed',
    startDate: '2025-05-01',
    endDate: '2025-06-01'
  }
];

function App() {
  return (
    <div className="App">
      <h1>Cognizant Academy - Cohort Dashboard</h1>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
