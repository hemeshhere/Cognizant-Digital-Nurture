import React, { useState } from 'react';

const Register = () => {
  const [formData, setFormData] = useState({
    name: '',
    email: '',
    password: ''
  });

  const [errors, setErrors] = useState({
    name: '',
    email: '',
    password: ''
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value
    });
    
    setErrors({
      ...errors,
      [name]: ''
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    
    let isValid = true;
    const newErrors = { name: '', email: '', password: '' };

    if (formData.name.length < 5) {
      newErrors.name = 'Name should have at least 5 characters';
      isValid = false;
    }

    if (!formData.email.includes('@') || !formData.email.includes('.')) {
      newErrors.email = 'Email should have @ and .';
      isValid = false;
    }

    if (formData.password.length < 8) {
      newErrors.password = 'Password should have at least 8 characters';
      isValid = false;
    }

    setErrors(newErrors);

    if (isValid) {
      alert('Registration Successful!');
      setFormData({ name: '', email: '', password: '' });
    }
  };

  return (
    <div style={{ padding: '20px', maxWidth: '400px', margin: '0 auto', fontFamily: 'sans-serif' }}>
      <h2>Register</h2>
      <form onSubmit={handleSubmit} style={{ display: 'flex', flexDirection: 'column', gap: '15px' }}>
        <div>
          <label style={{ display: 'block', marginBottom: '5px' }}>Name:</label>
          <input
            type="text"
            name="name"
            value={formData.name}
            onChange={handleChange}
            style={{ width: '100%', padding: '8px', boxSizing: 'border-box' }}
          />
          {errors.name && <span style={{ color: 'red', fontSize: '14px' }}>{errors.name}</span>}
        </div>

        <div>
          <label style={{ display: 'block', marginBottom: '5px' }}>Email:</label>
          <input
            type="text"
            name="email"
            value={formData.email}
            onChange={handleChange}
            style={{ width: '100%', padding: '8px', boxSizing: 'border-box' }}
          />
          {errors.email && <span style={{ color: 'red', fontSize: '14px' }}>{errors.email}</span>}
        </div>

        <div>
          <label style={{ display: 'block', marginBottom: '5px' }}>Password:</label>
          <input
            type="password"
            name="password"
            value={formData.password}
            onChange={handleChange}
            style={{ width: '100%', padding: '8px', boxSizing: 'border-box' }}
          />
          {errors.password && <span style={{ color: 'red', fontSize: '14px' }}>{errors.password}</span>}
        </div>

        <button type="submit" style={{ padding: '10px', backgroundColor: '#28a745', color: 'white', border: 'none', cursor: 'pointer' }}>
          Register
        </button>
      </form>
    </div>
  );
};

export default Register;