skeleton rest webapp for heroku.com

- locally: can be run as a regular webapp, e.g. with JettyRunner plugin in IntelliJ.
However you will need to specify an env variable (datasource_prefix=h2) to make it use H2 when running locally.
See persistence.xml, and how xxx-datasource.xml is imported.

- deployment to heroku is done using Heroku Maven Plugin.
Reason: I wanted to use heroku ONLY as a runtime platform, not a VCS or build machine.
Ofc you need a heroku account, with created application and postgres DB.

