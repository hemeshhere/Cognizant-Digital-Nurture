import React from 'react';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import Home from './Home';
import TrainersList from './TrainersList';
import TrainerDetails from './TrainerDetails';
import { trainersData } from './TrainersMock';
import './App.css'; 

function App() {
  return (
    <BrowserRouter>
      <div style={{ padding: '20px', fontFamily: 'Arial' }}>
        <nav style={{ backgroundColor: '#f4f4f4', padding: '10px', marginBottom: '20px' }}>
          <Link to="/" style={{ marginRight: '20px', textDecoration: 'none', color: 'blue' }}>Home</Link>
          <Link to="/trainers" style={{ textDecoration: 'none', color: 'blue' }}>Trainers List</Link>
        </nav>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/trainers" element={<TrainersList trainers={trainersData} />} />
          <Route path="/trainers/:id" element={<TrainerDetails />} />
        </Routes>
      </div>
    </BrowserRouter>
  );
}

export default App;