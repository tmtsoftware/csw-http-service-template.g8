# Releasing

Steps to release:

1. Update `esw` and `embedded-keycloak` version in `project/Libs.scala` in `dev` branch
2. Update `sbt-docs` version in top level `plugins.sbt` in `dev` branch
3. Commit and push changes to `dev` branch
4. Make sure `dev` workflow is green in actions tab in github repo
5. Rebase dev branch with master branch
6. Merge dev branch to master branch using PR
7. Make sure workflow is green in actions tab in github repo for `master` branch
8. Run ./release.sh `VERSION` script by providing version number argument
    **Note:** `PROD=true` environment variable needs to be set before running `release.sh`
9. After release is complete, change the `esw` version back to `0.1.0-SNAPSHOT` in `project/Libs.scala` in dev branch
10. Tagging csw-http-service-template.g8 will trigger `release` workflow in github actions tab. Make sure that `release` workflow is green
