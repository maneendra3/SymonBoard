import Clock from 'react-digital-clock';
import React, { Component } from 'react';
 
export default class LiveTime extends React.Component {
  render() {
    return (
      <div class="bottom-left font2x5 red time">
        <Clock />
      </div>
    )
  }
}