import React, { Component } from 'react';

export default class TwoExTable extends React.Component{
  render() {
    var listItems = this.props.data.map(function(item) {
      return ( 
        <tr>
            <th>{item.KEY}</th>
            <td>{item.VALUE}</td>
        </tr>
      ); 
    }); 
    return (
      <table width="30%" align="left" className="font1x5">
        <tbody>
          {/* <tr>
            <th>Chutes</th>
            <th>0</th>
          </tr> */}
          {listItems} 
        </tbody>
      </table>
    );
  }
};