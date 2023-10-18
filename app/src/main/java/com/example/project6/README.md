# Midterm Project - Game App
<span style="font-size: smaller;"><strong>Ashley Steitz is the Author of this project</strong></span>

---
<span style="font-size: smaller;"><strong> Description </strong> </span>
In my effort to complete the Midterm Project, I implemented an interactive Ui (User Interface) that allows the user to select a language and translate into one of the 3 options.

This app allows for a user to:
- Select a Game
- Look at the updating scoreboard
- And looking at the leader board

To begin we integrated SQL into our data handling to store our user entries. We used a recycler view to store the notes and display them on the main note page (screen) 
and it allows for users to scroll and view all posted notes without fear of losing the content when it goes off the page!
<br>
<br>



## Functionality
'*' indicates tested in GIF  
The following **required** functionality is completed:
<br>
Safeargs and View Groups were implemented to transfer data from MainActivity.kt to Fragment1.kt. This allows us to gather the user data and translate it in real time!

**Demonstrated**
<br>
**START** 
<br>
* [Add Note] -> [TITLE:Names ] [Typed: Ashley, Jacob, Anna, Clarissa, Jenna, John, Kyle] [SAVE]
* [Add Note] -> [TITLE:Cities] [Typed: New York, Miami, Seattle, Chicago, Paris, Madrid, Copenhagen] [BACK] 
* [Add Note]  -> [TITLE:Food] [Typed: Pizza, Hot Dog, Popcorn, Salad, Fruit, Vegtable, Pasta, Hummus ] [SAVE]
* [Cities]  -> [TITLE:Cities] [Typed: New York, Miami, Seattle ] [SAVE]
* [Add Note] -> [TITLE:Animals]  [Typed: Cat, Dog, Elepant, Snake, Zebra ] [SAVE]
* [Add Note]  -> [TITLE:Hello] [Typed: Hi, Aloha, Hola, Bonjour, Ni Hao, Halo ] [SAVE] 
* [Animals] -> [TITLE:Animals]  [Typed: Cat] [BACK]
* [Cities] [BACK]
* [Animals] [BACK]
* [Add Note]  -> [TITLE:Classes] [Typed: C322, C323, B461, D351, D321, C343, C200 ] [DELETE] 
<br>

**END**


---
## Video Walkthrough
Watch a demonstration of the different options when working with the notes app in the gif available on Github
Here's a walkthrough of a few translations:
<img src='' title='Project5 Video Walkthrough' width='50%' height = '50%' alt='Video Walkthrough' />

GIF created with [CloudConvert](https://cloudconvert.com/).

## Notes
UI Challenges:
- Integrating a recycler View into the UI for the main
- Adding in the data from the buttons

Backend Challenges:
- I ran out of time but linking the aspects of other projects into one
- I struggled connecting them with all the passing of data

## License

    Copyright [2023] [Ashley Steitz, Jacob Fritz]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.