import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [activeTab, setActiveTab] = useState('books');
  const renderContent = () => {
    switch (activeTab) {
      case 'books':
        return <BookDetails />;
      case 'blogs':
        return <BlogDetails />;
      case 'courses':
        return <CourseDetails />;
      default:
        return <BookDetails />;
    }
  };

  return (
    <div style={{ fontFamily: 'Arial, sans-serif', maxWidth: '800px', margin: '20px auto' }}>
      <h1>Blogger App</h1>
      <div style={{ marginBottom: '20px', display: 'flex', gap: '10px' }}>
        <button onClick={() => setActiveTab('books')}>Book Details</button>
        <button onClick={() => setActiveTab('blogs')}>Blog Details</button>
        <button onClick={() => setActiveTab('courses')}>Course Details</button>
      </div>

      <div style={{ border: '1px solid #ccc', padding: '20px', minHeight: '200px' }}>
        {renderContent()}
      </div>
    </div>
  );
}

export default App;