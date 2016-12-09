 /*
    https://github.com/MartinSnyder/monadic-logging
    from meetup talk @ Comcast
    
    Use monadic containers instead of throwing exceptions

    Monad is:
    - piece of data that lets you control the execution flow
    - Programable semicolon
    - Try Type functer tutorial/Applicative

    Ex. create an option. function pass in an int even

    neophytes guide to scala

 */
 val resultWithLog = for (
      sum <- loggedAdder(5, 7);
      converted <- loggedToString(sum)
    ) yield s"--> $converted <--"

    var resultWithLog2 = loggedadder(5, 7)
      .flatmap(sum => loggedToString(sum))
      .map(converted => s"--> $converted <--")