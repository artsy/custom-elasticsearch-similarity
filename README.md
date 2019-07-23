# Custom similarity Plugin

Implements a custom similarity plugin "artsy_similarity" to override the `queryNorm` of the default similarity modiule for Elasticsearch 5.6

### Setup

`brew install maven`

### Compile

`mvn compile`

### Package

`mvn package` will create a .jar in target

`mvn package assembly:single` to create a .zip file for ES installation in `./target/releases`

### Install the plugin to ES

https://www.elastic.co/guide/en/elasticsearch/plugins/5.6/plugin-management-custom-url.html
