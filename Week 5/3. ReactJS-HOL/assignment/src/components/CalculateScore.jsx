import React from "react";
import "../Stylesheets/mystyle.css";

function CalculateScore(props) {
  const average = props.total / props.goal;

  return (
    <div className="container">
      <h2>Student Score Calculator</h2>

      <p><b>Name:</b> {props.name}</p>
      <p><b>School:</b> {props.school}</p>
      <p><b>Total Score:</b> {props.total}</p>
      <p><b>Goals:</b> {props.goal}</p>
      <p><b>Average Score:</b> {average.toFixed(2)}</p>
    </div>
  );
}

export default CalculateScore;