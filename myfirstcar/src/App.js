import './App.css';
import React, { Component } from 'react';

class App extends Component {

  
  state = {
    isLoading: true,
    employees: []
  };

  async componentDidMount() {
    const response = await fetch('my_cars_api/v1/urcars');
    const body = await response.json();
    this.setState({ employees: body, isLoading: false });
    console.log(this.state.employees)
  }

  render() {
    const {employees, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }

    return (
      <div className="App">
        <header className="App-header">
          <div className="App-intro">
            <h2>Employee List</h2>
            {employees.map(employee =>
              <div key={employee.id}>
                <li>

                {employee.firstName}
                <br></br>
                {employee.lastName}
                <br></br>
                {employee.email}
                </li>
              </div>
            )}
          </div>
        </header>
      </div>
    );
  }
}

export default App;