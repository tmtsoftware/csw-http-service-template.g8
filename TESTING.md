# Testing latest template

To test:

1. Take latest pull of `esw` repository
2. In `esw` repository, run `sbt publishLocal`
3. Generate project using command `g8 tmtsoftware/csw-http-service-template.g8 --branch dev`
4. Tests can be run using `sbt clean test`

If you want to run the service, you need to start `csw-services` with the version that is being used in the `esw` repository on your machine.
