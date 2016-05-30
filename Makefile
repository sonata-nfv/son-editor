##
## Makefile for son-editor and sub-modules.
##
## The Makefile exists because I am old and
## crotchety and my fingers can't stop from
## running make commands. Obviously, everting
## can be done running maven directly.
##

all:
	mvn clean compile install

son-validate-cli:
	mvn clean package -am -pl son-validate-cli

son-validate-web:
	mvn clean package -am -pl son-validate-web

install-son-validate-cli:
	@mkdir /opt/son-editor
	@cp son-validate-cli/target/son-validate-cli-*.jar /opt/son-editor/
	@cp son-validate-cli/src/main/bash/son-validate /usr/bin/
	@sed -i -- 's/$${BASE_DIR}\/..\/..\/..\/target/\/opt\/son-editor/g' /usr/bin/son-validate

install: install-son-validate-cli

.PHONY: all son-validate-cli son-validate-web
