import React, { Component } from 'react';
import './../css/styles.css';
import TwoExTable from './TwoExTable.jsx';
import FourExTable from './FourExTable.jsx';
  
export default class App extends React.Component{
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div className="">
                <TwoExTable />
                <FourExTable />
            </div>
        );
    }
};