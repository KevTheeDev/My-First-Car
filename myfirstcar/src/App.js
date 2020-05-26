import './App.css';
import React, { Component } from 'react';

const apiKey = 'Q7ETUV8Rk5nafySLHsgCddQslFgI8xWI';

class App extends Component {

  state = {
    isLoading: true,
    employees: []
  };

  async componentDidMount() {
    const response = await fetch('my_cars_api/v1/urcars');
    const body = await response.json();
    this.setState({ urcars: body, isLoading: false });
    console.log(this.state.urcars)
  }

  async thirdPartyApi(){
    const response = await fetch('my_cars_api/v1/urcars');
    const body = await response.json();
    this.setState({ urcars: body, isLoading: false });
    console.log(this.state.urcars)
  }

  render() {
    const {urcars, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }

    return (
      <div className="App">
        <header className="App-header">
          <div className="App-intro">
            <h2>Car List</h2>
            {urcars.map(car =>
              <div key={car.id}>
                <li> {car.carMake} {car.carModel} {car.carYear}</li>
              </div>
            )}
          </div>
        </header>
      </div>
    );
  }
}

export default App;