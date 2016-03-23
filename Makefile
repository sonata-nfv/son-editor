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

.PHONY: all son-validate-cli son-validate-web
