# Clojure ja ClojureScript koulutus 2023-01-24 - Esitehtävät

Varmista että sinulla on kaikki tässä esitellyt työkalut asennettuna ennen koulutusta.

## Työkalujen asennus

Varmista että sinulla on seuraavat työkalut asennettuna:

- Java

  - LTS versio 11 riittää, mutta on suositeltavaa käyttää uudempaa versiota
  - Clojure dokumentaatio suosittelee Eclipse Temurin JDK versio 17:ta [https://adoptium.net/](https://adoptium.net/en-GB/)
  - MacOS riittää `brew install java`
  - Kätevä työkalu eri JDK (ja sen päälle tehtyjen SDK) versioiden hallintaan: [https://sdkman.io/](https://sdkman.io/)

- Clojure

  - Seuraa asennusohjeet täältä: [https://clojure.org/guides/install_clojure](https://clojure.org/guides/install_clojure)
  - Asennettu versio voi olla eri kuin yllä

- NodeJS

  - Versio 6 riittää, mutta tässäkin on suositeltavaa käyttää uudempaa versiota
  - Asennus ohjeet ja lataukset löytyy täältä: [https://nodejs.org/en/download/](https://nodejs.org/en/download/)
  - MacOS riittää `brew install nodejs`
  - Node Version Manager: [https://github.com/nvm-sh/nvm](https://github.com/nvm-sh/nvm)

- GIT

  - [https://git-scm.com/book/en/v2/Getting-Started-Installing-Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
  - [https://git-scm.com/book/en/v2/Getting-Started-First-Time-Git-Setup](https://git-scm.com/book/en/v2/Getting-Started-First-Time-Git-Setup)

- Docker

  - [https://docs.docker.com/get-docker/](https://docs.docker.com/get-docker/)

- Kun edellä mainitut työkalut on asennettu pitää komentoriviltä toimia seuraavat komennot:

  ```bash
  $ java -version
  openjdk version "19.0.1" 2022-10-18
  OpenJDK Runtime Environment Temurin-19.0.1+10 (build 19.0.1+10)
  OpenJDK 64-Bit Server VM Temurin-19.0.1+10 (build 19.0.1+10, mixed mode, sharing)

  $ clj --version
  Clojure CLI version 1.11.1.1208

  $ node --version
  v16.18.0

  $ npm --version
  8.19.2

  $ git --version
  git version 2.39.0

  $ docker version
  Client:
    Cloud integration: v1.0.29
    Version:           20.10.21
    ...
  ```

  - Huomaa että asennetut versiot voivat poiketa ylläolevasta

- IDE
  - Clojure kehitys poikkeaa merkittävästi muista kielistä sen interaktiivisuuden takia. Interaktiivisuus toimii tehokkaasti vain hyvän IDE:n kanssa. Siksi on tärkeää että osallistujilla on IDE joka tukee interaktiivista kehitystä Clojure kiellellä.
  - Visual Studio for Code: [https://code.visualstudio.com](https://code.visualstudio.com/)
    - Suositeltava IDE
    - Calva plugin tuo Clojure tuen vscode:lle [https://calva.io](https://calva.io/)
    - Suosittelen myös asentamaan pluginit web kehitystä varten, esim:
      - HTML CSS Support: [https://marketplace.visualstudio.com/items?itemName=ecmel.vscode-html-css](https://marketplace.visualstudio.com/items?itemName=ecmel.vscode-html-css)
      - HTMLHint: [https://marketplace.visualstudio.com/items?itemName=HTMLHint.vscode-htmlhint](https://marketplace.visualstudio.com/items?itemName=HTMLHint.vscode-htmlhint)
      - SQLTools: [https://marketplace.visualstudio.com/items?itemName=mtxr.sqltools](https://marketplace.visualstudio.com/items?itemName=mtxr.sqltools)
      - SQLTools PostgreSQL driver: [https://marketplace.visualstudio.com/items?itemName=mtxr.sqltools-driver-pg](https://marketplace.visualstudio.com/items?itemName=mtxr.sqltools-driver-pg)
  - IntelliJ IDEA: [https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/)
    - Cursive plugin: [https://cursive-ide.com](https://cursive-ide.com/)
    - Huom, sekä IDEA että Cursive edellyttävät kaupallista lisenssiä

## Esitehtävä projekti

Varmistetaan vielä että kaikki toimii.

- Kloonaa tämä projekti omalle koneellesi
  ```bash
  git clone git@github.com:metosin/clojure-koulutus-2023-01-24-esitehtavat.git
  ```
- Käännä frontednd
  ```bash
  cd clojure-koulutus-2023-01-24-esitehtavat
  npm i
  npm run release
  ```
- Käännä backend ja paketoi se überjar pakettiin
  ```bash
  clj -Muberjar
  ```
- Käynnistä serveri
  ```bash
  java -cp ./target/clojure-koulutus-2023-01-24-esitehtavat.jar clojure.main -m server.main
  ```
- Avaa selaimessa http://localhost:3000

Työkalut ovat nyt kunnossa!

## Muuta valmisteltavaa

Koulutuksessa käytetään Dockeria, mutta sen käytön osaamista ei koulutuksessa tarvita. Docker on kuitenkin erittäin hyvä työkalu jonka tunteminen on varmasti eduksi jatkossa. Dockerista lisää täällä: https://docs.docker.com/get-started/

Jos et ole aikaisemmin käyttänyt ReactJS kirjastoa siihen kannattaa tutustua lukaisemalla sen dokumentaatiota täältä: https://reactjs.org Vaikka emme koulutuksessa käytä ReactJS kirjastoa suoraan, sen toiminnan tunteminen auttaa ymmärtämään Clojure kirjastoja jotka tukeutuvat siihen.

## Clojuresta verkossa

Clojureen voi tutustua ennekolta seuraavien linkkien kautta:

- Clojuren suunnittelu periaatteet: https://clojure.org/about/rationale
- ClojureTV youtube kanava: https://www.youtube.com/@ClojureTV
- Metosin youtube kanava: https://www.youtube.com/@Metosin
