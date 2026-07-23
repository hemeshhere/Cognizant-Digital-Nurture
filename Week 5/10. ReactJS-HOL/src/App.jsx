import React from 'react';

function App() {
  const officeSpaces = [
    {
      id: 1,
      name: "Downtown Business Hub",
      rent: 55000,
      address: "123 Main Street, City Center",
      image: "https://images.unsplash.com/photo-1497366216548-37526070297c?auto=format&fit=crop&w=300&q=80"
    },
    {
      id: 2,
      name: "Tech Park Flex Workspace",
      rent: 85000,
      address: "45 Innovation Drive, Tech Park",
      image: "https://images.unsplash.com/photo-1524758631624-e2822e304c36?auto=format&fit=crop&w=300&q=80"
    },
    {
      id: 3,
      name: "Startup Garage Studio",
      rent: 40000,
      address: "88 Maker Lane, Westside",
      image: "https://images.unsplash.com/photo-1556761175-5973dc0f32b7?auto=format&fit=crop&w=300&q=80"
    }
  ];

  return (
    <div style={{ fontFamily: 'Arial, sans-serif', padding: '20px' }}>
      <h1 style={{ textAlign: 'center', color: '#333' }}>Office Space Rentals</h1>
      <div style={{ display: 'flex', gap: '20px', flexWrap: 'wrap', justifyContent: 'center' }}>
        {officeSpaces.map((office) => (
          <div 
            key={office.id} 
            style={{ 
              border: '1px solid #ddd', 
              padding: '15px', 
              borderRadius: '8px',
              width: '300px',
              boxShadow: '0 4px 8px rgba(0,0,0,0.1)'
            }}
          >
            <h2>{office.name}</h2>
            <img 
              src={office.image} 
              alt={office.name} 
              style={{ width: '100%', height: '200px', objectFit: 'cover', borderRadius: '4px' }}
            />
            
            <p><strong>Address:</strong> {office.address}</p>
            <p style={{ 
              color: office.rent <= 60000 ? 'red' : 'green',
              fontWeight: 'bold',
              fontSize: '1.2rem'
            }}>
              Rent: ₹{office.rent.toLocaleString()}
            </p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;