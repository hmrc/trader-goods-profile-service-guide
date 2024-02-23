
# Trader Goods Profile Service Guide

## Running the Scala Application

Requirements:
* Scala/sbt

### Build the HTML files
```
./batect build
```
### Run the Scala Application
```
sbt run
```

The local URL and port where the files can be previewed will be output, this is normally http://localhost:9000

## Building

Create a [build job](https://github.com/hmrc/build-jobs) like:
```
new SbtMicroserviceJobBuilder(TEAM, 'service-guide-skeleton')
        .withTests("test")
        .withNodeJs(version = '16.11.0')
        .build(this as DslFactory)
```

NB the version of Ruby is automatically picked up from `.ruby-version`. But the Node version isn't! Make sure that the
version you specify on the build job is the same as what is in `.node-version`.

### License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").
