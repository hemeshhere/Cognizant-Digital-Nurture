import React, { useState } from 'react';
import EmployeeList from './EmployeeList';
import ThemeContext from './ThemeContext';

function App() {
  const [theme, setTheme] = useState('light');
  const toggleTheme = () => {
    setTheme(theme === 'light' ? 'dark' : 'light');
  };
  return (
    <ThemeContext.Provider value={theme}>
      <div style={{ padding: '20px' }}>
        <h2>Apps Centric Solutions</h2>
        <button onClick={toggleTheme} style={{ marginBottom: '20px' }}>
          Toggle Theme
        </button>
        <EmployeeList />
      </div>
    </ThemeContext.Provider>
  );
}

export default App;