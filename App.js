import React, { Component } from 'react';
import {
    AppRegistry,
    StyleSheet,
    Text,
    View
} from 'react-native';

class Greeting extends Component {
    render() {
        return (
            <Text>Hello {this.props.name}!</Text>
        );
    }
}

class HelloWorld extends Component {
    render() {
        return (
            <View style={styles.container}>
                <View style={styles.hello}>
                    <Greeting name={权晓峰}/>
                </View>
                <View style={styles.hello}>
                    <Greeting name={王桐}/>
                </View>
            </View>
        )
    }
}

var styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
    },
    hello: {
        fontSize: 20,
        textAlign: 'center',
        margin: 10,
    },
});

AppRegistry.registerComponent('HelloWorld', () => HelloWorld);