import React, { Component } from "react";
import Trans from "./trans";

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      test: "中英文双向翻译"
    };
  }
  render() {
    return (
      <div>
        <h1 style={{textAlign:"center"}}>{this.state.test}</h1>
        <Trans />
      </div>
    );
  }
}
export default App;
