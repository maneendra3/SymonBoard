import React, { Component } from 'react';
import './../css/styles.css';
import TwoExTable from './TwoExTable.jsx';
import FourExTable from './FourExTable.jsx';
import Time from './LiveTime.jsx';
import axios from 'axios';

import ReactLoading from 'react-loading';

  
export default class App extends React.Component{
    constructor(props) {
        super(props);
        this.updateView = this.updateView.bind(this);
        this.initializeInjection = this.initializeInjection.bind(this);
        this.state = {
            showView: false,
            Q: [],
            sorter1_data:[],
            sorter2_data: [],
            sorter1_header: [],
            sorter2_header: []
        }
        this.inject = function (curThis) {
            axios.get("/getLEDOffice/")
                .then(function (response) {
                    if(response.status==200) {
                        const data =
                            {
                                q1: response.data.ledOffice,
                                s1h: ["Sorter1", "PKD", "SRT"],
                                s1d: response.data.LEDBoardWest,
                                s2h: ["Sorter2", "PKD", "SRT"],
                                s2d: response.data.LEDBoardEast
                            }
                        curThis.updateView(data);
                    }else{
                        console.log('Serivce Error'+response.status);
                        curThis.updateView(response);
                    }


                })
                .catch(function (error) {
                    curThis.updateView(error);
                });
        }.bind(this);
        this.inject(this);
        this.initializeInjection(this);
    }
    initializeInjection(currentThis){
        var refThis = currentThis;
        setInterval(function(){
            console.log('Interval..')
            refThis.inject(refThis);
        }, 60000);
    }
    updateView(viewData) {
        this.setState({ 
            showView: true,
            Q: viewData.q1,
            sorter1_data: viewData.s1d,
            sorter2_data: viewData.s2d,
            sorter1_header: viewData.s1h,
            sorter2_header: viewData.s2h
         });
    }
    render() {
        return (
            <div>
                { 
                    this.state.showView ? (
                        <div className="">
                            <TwoExTable data={this.state.Q} />
                            <FourExTable hdata={this.state.sorter1_header} data={this.state.sorter1_data}/>
                            <FourExTable hdata={this.state.sorter2_header} data={this.state.sorter2_data}/>
                            <Time/>
                        </div>
                    ) : (
                        <ReactLoading type="cubes" color="red" height={100} width={650} />
                    )
                }
            </div>
        );
    }
};
