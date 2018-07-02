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
        this.initializeInjection(this);
    }
    initializeInjection(currentThis){
        setInterval(function(){
            axios.get("/getLEDOffice/")
            .then(function (response) {
                if (response.data.statusCode === 200) {
                    //purgeData(response.data);
                } else {
                    //purgeData(response.data.statusCode);
                }
            })
            .catch(function (error) {
                const data = 
                    {
                        q1:[{KEY:"srtd",VALUE:3},{KEY:"occrtns",VALUE:5},{KEY:"avBufln",VALUE:5},{KEY:"srate1",VALUE:4},{KEY:"srate2",VALUE:3},{KEY:"ttl_RT",VALUE:4},{KEY:"compCht1",VALUE:2},{KEY:"compCht2",VALUE:54},{KEY:"avChts1",VALUE:4},{KEY:"avChts2",VALUE:5}],
                        s1h:["Sorter1","PKD","SRT"],
                        s1d:[{"sorter":"0","pkd":"0","srt":"0"},{"sorter":"0","pkd":"0","srt":"0"},{"sorter":"0","pkd":"0","srt":"0"},{"sorter":"0","pkd":"0","srt":"0"},{"sorter":"0","pkd":"0","srt":"0"},{"sorter":"0","pkd":"0","srt":"0"},{"sorter":"0","pkd":"0","srt":"0"}],
                        s2h:["Sorter2","PKD","SRT"],
                        s2d:[{"sorter":"0","pkd":"0","srt":"0"},{"sorter":"0","pkd":"0","srt":"0"},{"sorter":"0","pkd":"0","srt":"0"},{"sorter":"0","pkd":"0","srt":"0"},{"sorter":"0","pkd":"0","srt":"0"},{"sorter":"0","pkd":"0","srt":"0"},{"sorter":"0","pkd":"0","srt":"0"}]
                };
                currentThis.updateView(data);
            });
        }, 10000);
    }
    updateView(viewData) {
        this.setState({ 
            showView: true,
            Q: viewData.q1,
            sorter1_data: viewData.s1d,
            sorter2_data: viewData.s2d,
            sorter1_header: viewData.s2h,
            sorter2_header: viewData.s2h
         });
    }
    render() {
        if(!this.state.showView){
            return (
                <ReactLoading type="cubes" color="red" height={667} width={375} />
            );
        }else{
            return (
                <div className="">
                    <TwoExTable data={this.state.Q} />
                    <FourExTable hdata={this.state.sorter1_header} data={this.state.sorter1_data}/>
                    <FourExTable hdata={this.state.sorter2_header} data={this.state.sorter2_data}/>
                    <Time/>
                </div>
            );
        }
    }
};