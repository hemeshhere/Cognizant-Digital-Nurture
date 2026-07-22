import React from 'react';
import { useParams, Link } from 'react-router-dom';
import { trainersData } from './TrainersMock';

function TrainerDetails() {
  const { id } = useParams();
  const trainer = trainersData.find(t => t.TrainerId === parseInt(id));
  if (!trainer) {
    return <div><h2>Trainer not found!</h2></div>;
  }
  return (
    <div style={{ border: '1px solid black', padding: '20px', width: '300px', borderRadius: '5px' }}>
      <h2>Trainer Details</h2>
      <p><strong>ID:</strong> {trainer.TrainerId}</p>
      <p><strong>Name:</strong> {trainer.Name}</p>
      <p><strong>Email:</strong> {trainer.Email}</p>
      <p><strong>Phone:</strong> {trainer.Phone}</p>
      <p><strong>Technology:</strong> {trainer.Technology}</p>
      <p><strong>Skills:</strong> {trainer.Skills}</p>
      <br />
      <Link to="/trainers">Back to List</Link>
    </div>
  );
}

export default TrainerDetails;