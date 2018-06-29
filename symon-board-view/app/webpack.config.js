var webpack = require('webpack');
var path = require('path');
var packageJson = require('./package.json');

var APP_SRC_DIR = path.resolve(__dirname, 'main/jsx');

const APP_BUILD_PATHS = {
		  build: path.join(__dirname, '../src', 'main', 'resources','public', packageJson.name)
		};
console.log("__dirname : " ,__dirname);
console.log("path.join() : " ,APP_BUILD_PATHS);
var config = {
   entry: APP_SRC_DIR + '/main.jsx',
   output: {
      path:APP_BUILD_PATHS.build,
      filename: 'signing-board-bundle.js',
   },
   devServer: {
      inline: true,
      port: 8081
   },
   module: {
      rules: [
         {
            test: /\.jsx?$/,
            exclude: /node_modules/,
            loader: 'babel-loader',
            query: {
               presets: ['es2015', 'react']
            }
         },
         {
             test: /\.css$/,
             use: ['style-loader', 'css-loader']
         },
         {
             test: /\.(png|woff|woff2|eot|ttf|svg)$/,
             use: 'url-loader?limit=100000'
         },
         {
             test: /\.png$/,
             use: 'url-loader?limit=100000'
         },
         {
             test: /\.jpg$/,
             use: 'file-loader'
         },
         {
             test: /\.(woff|woff2) (\?v=\d+\.\d+\.\d+)?$/,
             use: 'url-loader?limit=10000&mimetype=application/font-woff'
         },
         {
             test: /\.ttf(\?v=\d+\.\d+\.\d+)?$/,
             use: 'url-loader?limit=10000&mimetype=application/octet-stream'
         },
         {
             test: /\.eot(\?v=\d+\.\d+\.\d+)?$/, 
             use: 'file-loader'
         },
         {
             test: /\.svg(\?v=\d+\.\d+\.\d+)?$/, 
             use: 'url-loader?limit=10000&mimetype=image/svg+xml'
         }
      ]
   }
}
module.exports = config;