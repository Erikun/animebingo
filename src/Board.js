import React, {Component} from 'react';
import {Square} from './Square';
import './Board.css';
import json from './anime.json';

//var g = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25]
 

export class Board extends Component {
    constructor(props) {
	super(props);
	this.state = { grid: [], rows: 5, cols: 5, foundCount: 0 };
	this.handleClick.bind(this);
    }

    componentDidMount() {
	let j = json;
	j.forEach((entry) => {
	    entry.clicked = false;
	});
	this.setState({grid: j});
    }

    handleClick = (i) => {
	let c = this.state.foundCount;
	let g = this.state.grid.slice();
	g[i].clicked = !g[i].clicked;
	if (g[i].clicked){
	    c +=1;
	}
	else {
	    c-=1;
	}
	this.setState({grid: g, foundCount:c});
    }

    render() {
	let g = this.state.grid.slice();
	if (g.length > 0) {
	    console.log(JSON.stringify(this.state.grid[0]));
	    console.log(this.state.foundCount);
	}
	return (
		<div className="bingoboard">
		{this.state.grid.map((data,index) => {
		    let sqstyle = { backgroundColor: data.clicked ? "blue" : "grey" };
		    return(
			    <Square style={sqstyle} key={index} data = {data}  onClick = {this.handleClick.bind(null, index)}/>)})}
	    </div>

	)
    }

}
