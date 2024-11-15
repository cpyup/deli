# Deli Application

## Project Summary

Deli is a command line application designed for use as a deli order processor, generating order information based on user selections.

### Class Diagram

> Class diagram, minus the floating classes to save on space/improve visibility

![Diagram](https://www.plantuml.com/plantuml/png/XPLPRjim48RVTGg-MMwH2mX1a3PB4w26ZSGzm5WQEqGbKYMfj6cHkvVBY9OeLVM3HSx_SPc5vBKse4pNr5cMhTWj7hb0LjQWDUhCVzbEoPE2Xlt9cFrzP0rmaQyBzYfvbRrdH3s3g7xoyiLZ5-oW4AhzMui5syksvUBaEbuoeQyBzfLhSqdobTUutalG1gk2VPQoHX2PM_A4XZ2ThzDn3j03W1hhmTxuIO3f52QR5D3O_JqRPV4pVVE2gD4YpWG7RHIKXWMDvhOYRSjvbQ_7JiQPdl3KrQ26WmO1c4PdkjvEOSEx9fr1yzzku_P_USh1NZO8XdoQkXbps9LZorPLg2XQqhKV3JPzvhQz8UG0gYfQScx_2XRxiLmc7aPajAvp3Gur3jN4SSjoOL0TmUxvyGkQRzgYektCEJiXjTwOLrotDRnjK6iunRIlFLfASUIgkP72SD7XlrXomey0KMAzLVyVSg0wdkntfxXjqLwfwqgfaftrFE4VG5klHwLd-vvtNs_JP3i7QN06RXKNtocAnnfUfQBqtFqo2lImBdYh2InjsvNHF1gC6nJTi4A8zJjI-AD3RJvLrLvwQqv5D2uEpxRAkkicsxQ6Iw5pssnkt3e5yv_B_LKWATIEZVVGm1xdrL5DH0frUeLjW0loPgPGIPbVVuRtLVS0eghz2R9Hbwe1SsUz2XxcqdzYgVIDsMj0DgshQvVa6ijnxgC3DiuXHO6FryLSq4aoFhkqC6DKMf5oQyGEwNgiH__Z7lfRThIB6BPu6IVvewNxmKxfs-VPxofk9jCxELi5u9xNk0419xgsLZRkrhG3ynBTzDOA3DxxZ1JirhRtlA6-SSMxSex2ApvXYRmreMx3-FGwMBqFdaw5DVZoTQSe2sVfyk9YSCqLZ6i6sVI6cyN2iNNIT00XVJoMgHZs4HuxH2KlbaEetHFXZN12mf9EBzR23FJmE8NW171FrQ8iEYUFJbWKWOi8-0O9FY2p2jLHQXuT9jAfISIqrASC5MmAJOSIlw81oxFs4VbWbVYKEB5fQsnG61tyNGQeGfQWOOWZ5n_QCPkM7aqSNwundUHs2NM_QnHLrzJPNm00)

## User Stories

Collection of user stories that guided the design of my application:

> As a user, I want to see a home screen so that I can choose to begin my order or leave the application.
>
>As a user, I need to be able to add a new drink to a customers order so that their selection can be tracked.
>
>As a user, I need to be able to add chips to a customers order, so that their choices can be processed.
>
>As a user, I would like to be able to select a pre-determined signature sandwich, so that customers can choose from our most popular options.
>
>As a user, I need to be able to cancel a customers order before checkout, so that if they decide they no longer want it, I do not have to waste much time before taking the next order.
>
>As a user, I need to be able to process checkout for a customers order, so that I can complete the order process.
>
>As an employee, I need to be able to add a new sandwich to a customers order so that I can process their desired options as an order entry.
>
>As a user, I would like to be able to customize signature sandwiches, so that users can modify desired options with our pre-made sandwiches.
>As a user, I need to be able to edit selections on a customers order before checkout, so that if they want to make changes I do not have to make a new order.
>
>As a user, I need to be able to edit selections on a customers order before checkout, so that if they want to make changes I do not have to make a new order.

## Setup Instructions

Instructions on how to set up and run the project using IntelliJ IDEA.

### Prerequisites

- IntelliJ IDEA: Ensure you have IntelliJ IDEA installed, which you can download from [here](https://www.jetbrains.com/idea/download/).
- Java SDK: Make sure Java SDK is installed and configured in IntelliJ.

### Running the Application in IntelliJ

Follow these steps to get your application running within IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select "Open" and navigate to the directory where you cloned or downloaded the project.
3. After the project opens, wait for IntelliJ to index the files and set up the project.
4. Find the main class with the `public static void main(String[] args)` method.
5. Right-click on the file and select 'Run 'Program.main()'' to start the application.

## Technologies Used

- IntelliJ IDEA Community Edition 2022.3.2.0
- Java Version 17

## Additional Tools

- [Notepad++](https://notepad-plus-plus.org/) (script edits, README.md creation)
- [CherryTree](https://www.giuspen.net/cherrytree/) (hierarchical note taking application)
- [Google](https://www.google.com/) (always and forever)
- [PlantUML](https://www.plantuml.com/) (for class diagram)

## Display Examples

[TODO]

## Project Highlights

> I think the most interesting part of this project is the handling of signature sandwiches. Signature sandwiches are stored as string values attached to enum values representing the specific signature sandwiches. Example enum:

```java
PHILLY_CHEESE_STEAK("WHITE","MEDIUM","STEAK|AMERICAN|PEPPERS|MAYO","YES");
```

> Bread and size were easy enough to parse, as they correspond to specific enum values already. Toasted option is actually what gave me the most trouble, and did required some refactoring between how I was originally handling it. The more interesting portion was the parsing of the different toppings, as they each need to be initialized as their respective classes from the single string. Topping parsing method from SignatureSandwich:

```java
private List<Topping> parseToppingString(String toppingString){
        String[] toppingNames = toppingString.split("\\|");
        List<Topping> toppingList = new ArrayList<>();

        for(String tString : toppingNames){

            ToppingType thisType = Arrays.stream(ToppingType.values())
                    .filter(toppingType -> toppingType.toString().equalsIgnoreCase(tString))
                    .findFirst()
                    .orElse(null);

            if(thisType != null){
                switch (thisType.getType()){
                    case "meat" -> toppingList.add(new Meat(thisType,size));
                    case "cheese" -> toppingList.add(new Cheese(thisType,size));
                    case "regular_topping" -> toppingList.add(new RegularTopping(thisType));
                    case "sauce" -> toppingList.add(new Sauce(thisType));
                }
            }else{
                throw new RuntimeException("Error Parsing Topping");
            }
        }
        return toppingList;
    }
```

## Future Work

### General Improvements

 - Improve Project Cohesion
 - Reduce Redundancies
 - Implement More Polymorphic Handling Of Objects
 - Finish implementing Javadoc where missing
 - A few of the newer methods with text output still need to be formatted to match the others
 
### Feature Implementations

 - Condense prompt outputs by utilizing style elements in topping selection to indicate current status, reducing the need for separate display screens
 - Implement menu option to edit the current order - all of the pieces are there and functioning, they just need to be implemented as new menu option
- Refactoring of current enums to have more commonality, allowing for reduced code and further modularity. Potential vector for this involves utilization of a new interface enforcing implementation of some sort of identifying getter
- Test case implementations, did not have time for it on this one
- Implementing options to cancel order process from ANY point in the process

## Resources

> What I found myself using more than anything else were the previous workbooks. They helped to keep myself more in line with the focus on our previously covered concepts.