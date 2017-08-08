import React from 'react';
import './Square.css';

export class Square extends React.Component {
    
    render() {
	const values = Object.values(this.props.data);
	return (
		<div className="square" onClick={this.props.onClick} style={this.props.style}>
		{values.map((i,index) => {return(
			<p key={index}>{i}</p>)})}
		</div>
	);
    }
}
