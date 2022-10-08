<h1 align="center">Hi 👋, This is Kodlama.io Simulation</h1>
<h3 align="center">Simulation of kodlama.io website </h3>

### 👉 Description
`Business` layer is used instead of the `Application` layer. Therefore, it was considered correct to code interfaces in the `Data Access` layer.

I gave the `I` prefix in the interfaces only for the repository interfaces in the `Data Access` layer. Because Hibernate and JDBC implementation were requested to have a common and understandable interface.

In the `Data Access` layer, the repositories are separated as `Hibernate` and `JDBC`. Classes were given the same names. Thus, when the ORM infrastructure changes, it will be sufficient to change only the important package. (***Incorrect***. It is better to write the ORM name at the beginning. Otherwise there will be confusion.)

Log messages were manually encoded, but constants could be used. This was not required in this application. It can be implemented in database and Spring uses in future applications.

<hr>

### 📚 Layers 📚
#### Business
- Managers
- Rules
#### Core
- Base Repositories
- Logging
#### Data Access
- Repositories
  - Hibernate
  - JDBC
#### Domain
- Entities
#### Presentation
- Console/*Web*/*Mobile*/*...*


<h3 align="center">Languages and Tools:</h3>
<p align="center"> <a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a> <a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> </p>

<hr>

<h3 align="center">Connect with me:</h3>
<p align="center">
<a href="https://twitter.com/sirrikomur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/twitter.svg" alt="sirrikomur" height="30" width="40" /></a>
<a href="https://linkedin.com/in/sirrikomur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="sirrikomur" height="30" width="40" /></a>
<a href="https://instagram.com/sirrikomur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" alt="sirrikomur" height="30" width="40" /></a>
<a href="https://medium.com/@sirrikomur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/medium.svg" alt="@sirrikomur" height="30" width="40" /></a>
</p>
