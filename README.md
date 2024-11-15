# Deli Application

## Project Summary

Deli is a command line application designed for use as a deli order processor, generating order information based on user selections.

### Class Diagram

> Class diagram, due to the size I split it into two diagrams to show the inheritance between my classes, floating classes such as Program (entrypoint), FileManager (static helper), and project enums not shown to save on space

#### Order Related:

![Diagram](https://www.plantuml.com/plantuml/png/VPHTRjim383VTGgzBTcG2nZ5K6mTjW8RMYov06CngJ1PCaIv-nbszuanNSjAuJwu8lcHuW-LMqeGqz0vfTGRVOSdwr6t3eYGrEM_teCtFstxfFyghNVw617CuNUFZJw4lhV-pCB5b4QP6ltLKheHy_kBpT8X02KqZVuGWaFmMVrEdp49HfjjxSS05O0SjkgVcdApPmzfY5WbwQ73HkzJp3ZJ2ewK8hH9ZtuIYMb98jUmsIvAcc_vZkV1GIoTfdA5hHth-nuZTdRewWXa_t2Q-RiQiipb6qBA_hFYunCYuKArXw5TQXwYmIYz2No-JzXDStgO56F7mPWNpSRcJwDVvDoXvs3DTOKpihYNIuEZmz9Q5PvPwnF64xIexpzZUemsdsGo8l9eJ1YEhkQ_0EKeYr5cEVCIdNKakldIOeFkelK_9AkJW-SGfTnFlr84AljiUnAmpMSUIuqMRoYYWsI39tPJe_FDRbVqgT6MDAYh5hsEZNcogNAOaUaDh5Fran5y4eIgLfwHwIp4k6Hig5YnoyglH93DPKi52y2xlc9Ma_ms8_FcP6lNE-pG9rANyjS1wSyQL3TJu7dvIhggV1NblrlqXd-0_mC0)

#### Menu Related:

![Diagram](https://www.plantuml.com/plantuml/png/XLHTZjD037wVK_YDm2eNY5PeqL917wgkrEK0iudR7IdnXB435CJTwJYfguGW-ZAElyy_dpsT1nQVPEXQvzmR-8Z7G0XrwvcHNI31TFGrmlOJoXV6jAL-4FZb0ExWX7AG5EYapg89tBV-l4DcVy8AHkojKkj8nv2wnqWIQC1_SIlu5aCpHdYgiTsd_uUynDYY9_VREUqRzgd1j4CQjCyIOlwkHhVcJlXrG9OFJVCSrLiePIlOAMqqnyxx54Xoidql8H8N5xDxp7KgqEF--Vt8j0PfA6vAp6zvsT05-9H2ZGQQd9qFDAd9Jl_2admjCA4Zibv_XQ-x-kofQJ5TuaeunjHvsLnKZGgBg8SD-6giv7fAiUlpRRW3nXPhEOIVAY2VDm6NEMz-IF9iV03RosBe4oJdtbQiBhrjnierx6F2UOwRVklXuAdv7khNMHSsjaCuaPSXuMn-LleQd96hVSk-QOBybJx3zezAs7gzFw-XPwTBko_B-JOg20pUsRupGOq9K7cho5HpwLuCNl7HDCPiBEiS4pSdBKEDxsQYtfNbxF5GMjUts249E_qz83Nv1Ve3)

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

### Menu Examples

![Menu Displays - Main](https://github.com/cpyup/deli/blob/main/screenshots/menus.png?raw=true)

### Adding Signature Sandwich

![Add Signature Sandwich Menu Display](https://github.com/cpyup/deli/blob/main/screenshots/signature_menu.png?raw=true)

### Add Drinks Display

![Add Drink Menu Display](https://github.com/cpyup/deli/blob/main/screenshots/add_drinks.png?raw=true)

### Error Display Example

![Input Error Handling Display](https://github.com/cpyup/deli/blob/main/screenshots/error_examples.png?raw=true)


## Project Highlights

> I think the most interesting part of this project is the handling of signature sandwiches. Signature sandwiches are stored as string values attached to enum values representing the specific signature sandwiches. Example enum:

```java
PHILLY_CHEESE_STEAK("WHITE","MEDIUM","STEAK|AMERICAN|PEPPERS|MAYO","YES");
```

> Bread and size were easy enough to parse, as they correspond to specific enum values already. Toasted option is actually what gave me the most trouble, and did required some refactoring between how I was originally handling it. The more interesting portion was the parsing of the different toppings, as they each need to be initialized as their respective classes from the single string. Topping parsing method from SignatureSandwich:

```java
private List<Topping> parseToppingString(String toppingString){
        // First, convert the passed string to an array of strings passed on separator
        String[] toppingNames = toppingString.split("\\|");
        List<Topping> toppingList = new ArrayList<>();

        for(String tString : toppingNames){
            // Iterate the new array of topping name strings, comparing each name to the ToppingType enum values 
            ToppingType thisType = Arrays.stream(ToppingType.values())
                    .filter(toppingType -> toppingType.toString().equalsIgnoreCase(tString))
                    .findFirst()
                    .orElse(null);

            if(thisType != null){
                switch (thisType.getType()){
                // Construct new toppings from valid strings
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
 - Finish reducing unnecessary abstracts/parents, project still has room to be further reduced 
 - Reduce abstract InputHandler functionality into abstract Menu
 
### Feature Implementations

 - Condense prompt outputs by utilizing style elements in topping selection to indicate current status, reducing the need for separate display screens
 - Implement menu option to edit the current order - all of the pieces are there and functioning, they just need to be implemented as new menu option
- Refactoring of current enums to have more commonality, allowing for reduced code and further modularity. Potential vector for this involves utilization of a new interface enforcing implementation of some sort of identifying getter
- Test case implementations, did not have time for it on this one
- Implementing options to cancel order process from ANY point in the process

## Resources

> What I found myself using more than anything else were the previous workbooks. They helped to keep me more focused on the material we have been covering. 