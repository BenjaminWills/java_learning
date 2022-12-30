# Welcome to the ben ATM

As a java project, I made an **ATM**. This atm has the following functions:

- Local storage in the form of serialised hashmaps that contain user data, each named after the user id.
- Interactive terminal that users can:
  - use to make accounts
  - use to withdraw or deposit money

To start the ATM up run the command:

```shell
javac atm/Atm.java \
    atm/AtmSession.java \
    atm/StorageSystem.java \
    atm/User.java
-- ^^ compiling the package
java atm.Atm
-- ^^ running the package
```
