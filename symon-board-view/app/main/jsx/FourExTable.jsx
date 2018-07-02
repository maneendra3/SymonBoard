import React, { Component } from 'react';

export default class FourExTable extends React.Component{

  render() {

    var listItems = this.props.data.map(function(item) {
      return ( 
        <tr>
            <td>{item["sorter"]}</td>
            <td>{item["pkd"]}</td>
            <td>{item["srt"]}</td>
        </tr>
      ); 
    }); 

    return (
      <table width="60%" align="right" className="font1x5 line-first-col red-head">
        <tbody><tr>
            <th width="30%">{this.props.hdata[0]}</th>
            <th width="30%">{this.props.hdata[1]}</th>
            <th width="20%">{this.props.hdata[2]}</th>
          </tr>
          {listItems}
        </tbody></table>
    );
  }
};