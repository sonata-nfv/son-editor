# son-editor [![Build Status](http://jenkins.sonata-nfv.eu/buildStatus/icon?job=son-editor)](http://jenkins.sonata-nfv.eu/job/son-editor/)

For the SONATA editor we envision an Eclipse or IntelliJ plugin that supports function and service developers. This, however, is our vision on the long run. For now, this repository contains some Java libraries and tools that validate SONATA descriptors using the SONATA schema.

## Development

To contribute to the development of the SONATA editor, you may use the very same development workflow as for any other SONATA Github project. That is, you have to fork the repository and create pull requests.

#### Contributing

You may contribute to the editor similar to other SONATA (sub-) projects, i.e. by creating pull requests.

#### Building

The SONATA editor is written in Java and uses the Maven build tool. Thus, you can build the whole editor by typing:

```
 $ mvn clean package
```

In addition (and because I am a lazy person), there is a Makefile that allows you to build the whole projects, and also sub-projects, like the *-cli and *-web sub-projects, individually.

```
 $ make son-validate-cli
```

---
#### Lead Developers

The following lead developers are responsible for this repository and have admin rights. They can, for example, merge pull requests.

- Michael Bredel (mbredel)

---
#### License

The license of the SONATA editor is BSD for now. However, we intend to change it to Apache 2.0 later.
