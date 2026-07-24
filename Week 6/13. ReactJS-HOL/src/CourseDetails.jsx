import React, { useState } from 'react';

const CourseDetails = () => {
  const [isEnrolled, setIsEnrolled] = useState(false);

  // Conditional Rendering Method 3: if/else blocks with early return
  if (isEnrolled) {
    return (
      <div>
        <h2>Course Details</h2>
        <div style={{ borderLeft: '4px solid green', paddingLeft: '10px' }}>
          <h3>React Masterclass: Enrolled</h3>
          <p>Welcome to the course! You have full access to all video materials.</p>
          <button onClick={() => setIsEnrolled(false)}>Drop Course</button>
        </div>
      </div>
    );
  } else {
    return (
      <div>
        <h2>Course Details</h2>
        <div style={{ borderLeft: '4px solid blue', paddingLeft: '10px' }}>
          <h3>React Masterclass</h3>
          <p>Learn React from the ground up. Enroll today to access the materials.</p>
          <button onClick={() => setIsEnrolled(true)}>Enroll Now</button>
        </div>
      </div>
    );
  }
};

export default CourseDetails;