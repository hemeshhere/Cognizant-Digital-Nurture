import React from 'react';

const BookDetails = () => {
  const books = [
    { id: 1, title: 'Mastering React', author: 'Hemesh Raj', isBestseller: true },
    { id: 2, title: 'JavaScript Fundamentals', author: 'Saurav Tiwari', isBestseller: false },
    { id: 3, title: 'Advanced CSS', author: 'Yash', isBestseller: true }
  ];

  return (
    <div>
      <h2>Book Details</h2>
      <ul>
        {books.map((book) => (
          <li key={book.id} style={{ marginBottom: '10px' }}>
            <strong>{book.title}</strong> by {book.author}
            {book.isBestseller && <span style={{ color: 'gold', marginLeft: '10px' }}>★ Bestseller</span>}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default BookDetails;