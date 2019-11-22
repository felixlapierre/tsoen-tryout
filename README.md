# CSGames Tryout - Team Software Engineering
Team Software Engineering tryout for Concordia's CSGames delegation.
* Create a fork of this repository
* Your last commit at 9:00PM will be evaluated

## Overview
You have joined a team that is developing the Immortuos application, an app for helping survivors of a zombie apocalypse communicate with each other. You are responsible for developing the notification system of the application. Unfortunately, the Survivor module has not been created yet, so your code must be written using only the interface.
Survivors may register to the notification system. Once a survivor is registered, they will be notified of relevant events. There are 3 types of survivor: citizen, merchant and soldier. The type of a survivor determines which events they are interested in being notified about.

### File Structure
* You may only modify the `Application` class. You are also permitted to create new classes. All other modifications will be reverted when your solution is evaluated. 
* The `Driver` and `PrintSurvivor` classes has been created for you to use in manual testing, but the evaluation of your code will be done using only automated acceptance tests. Some sample tests have been provided in the `ApplicationTest` class.

## Requirements
### Register Survivors
* When `Application.registerSurvivor` is called, you must notify the passed survivor with an event of type registered at the location of the survivor. 
* Example: See `ApplicationTest.testRegisterSurvivor()`
### Water
* When `Application.onEvent` is called with an event of type `water`, a new source of drinkable water has been discovered at the event location. You must notify every type of survivor within a distance of 5.
* Example: See ApplicationTest.testWaterFound()
### Trades
* When `Application.onEvent` is called with an event of type trade, a new trading spot has been established at the event location. You must notify nearby survivors of type `citizen` or `merchant`.
* Citizens should be notified if they are within a distance of 3 of the trading spot, while merchants should be notified if they are within a distance of 6. Survivors of type `soldier` should not be notified of nearby trades.
* Example: See `ApplicationTest.testTradeCloseToMerchant()`
### Zombies
* When Application.onEvent is called with an event of type `zombie`, a pack of zombies has been spotted at the event location. You must do the following:
   * Notify every `soldier` within distance 7 with event type zombie and the location of the zombie
   * Notify every `citizen` or `merchant` within distance 4 with event type `run`. The event location should be exactly 1 distance unit away from the survivor, in the opposite direction of the zombie.
* Examples: `ApplicationTest.testZombieCloseSoldier()` and `ApplicationTest.testZombieCloseCitizen()`
