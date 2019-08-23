import React, { Component } from "react";
import axios from "axios";
import { Button, Input } from "antd";

class Trans extends Component {
  constructor(props) {
    super(props);
    this.state = {
      trans: ""
    };
    this.translations = this.translations.bind(this);
  }

  translations() {
    //将插入的值插入到"Input_word"中
    var word = document.getElementById("Input_word").value;
    axios.get("http://localhost:8080/trans/" + word).then(response => {
      console.log(response);
      this.setState({
        trans: response.data.Translation_word.replace(/\|/g, "\n")
      });
    });
  }
  render() {
    return (
      <div style={{marginLeft:"500px"}}>
        <Input id="Input_word" style={{margin: "10px",width: "300px"}}/>
        <Button size="large" onClick={this.translations} style={{background:"blue",color:"white"}}>
          中英翻译
        </Button>
          <br/>
        <Input.TextArea
          value={this.state.trans}
          style={{
            height: "120px",
            width:"530px"
          }}
        />
      </div>
    );
  }
}
export default Trans;
