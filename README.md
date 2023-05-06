# Book Scrabble Game

Book Scrabble is a word game in which two to four players score points by placing tiles, each bearing a single letter, onto a game board divided into a 15×15 grid of squares. The tiles must form words that, in crossword fashion, read left to right in rows or downward in columns.  However, the legal words are not all the words in the dictionary English, but only words that appear in the books chosen for the game. 



## Overview
The Book Scrabble Game is a Desktop application that allows players to create an account, join or start a game, and play against other players online. The game board consists of a grid of letter tiles, and players take turns placing tiles on the board to form words. Points are awarded based on the length and complexity of the words, as well as any bonus tiles that are used.

The game also includes a dictionary of book-related words and phrases, so players can easily find inspiration for their next move.



## Collaborators
- [alonx5050](https://github.com/alonx5050)
- [RoeeShemesh](https://github.com/RoeeShemesh)
- [Shlomi90](https://github.com/RoeeShemesh)



## Video links

-  Demo video - will be added
- Project presentation video - will be added



## Features

- Create an account and log into the game.
- Join other players or start a new game.
- Compete against other players in real-time.
- Look at the game board and the words played by other players.
- Use the dictionary to find words and phrases related to books.
- Earn points based on the length and complexity of the words played.
- Bonus points can be earned by using certain tiles or forming certain parts of speech.


# Gantt
<img src="https://user-images.githubusercontent.com/94148094/236623415-3b62e2fc-d0e9-44c6-9d38-3417890a7147.png" width="1089" height="2000" />




## Game instructions

### Definitions:
#### Tile:
* A small board containing a letter (in English) and its value in the game - the amount of points the letter is worth.
* In the following diagram you can see how much each letter is worth in the game:
<img src="https://user-images.githubusercontent.com/118439273/229486188-1f5ab09f-8f78-4e12-b2d1-8aea60616c7c.png" width="360" height="180" />

#### Bag:
* A bag containing 98 tiles 
* Allows you to randomize tiles
* The number of tiles in the bag for each letter at the beginning of the game:
<img src="https://user-images.githubusercontent.com/118439273/229486334-5985074d-ffa1-4366-bc21-8acfd1d4445d.png" width="1080" height="120" />

#### Board:
* 15 x 15 2D board
* The board has some bonus slots:
o The central square (marked with a star) doubles the value of the word written on it
o Squares that double the value of the letter on them (light blue)
o Squares that triple the value of the letter on them (blue)
o Squares that double the value of the entire word (yellow)
o Squares that triple the value of the entire word (red)
* The bonus slots are distributed as in the following diagram:
<img src="https://user-images.githubusercontent.com/118439273/229484247-4854a0a0-7e4f-4f2d-9e87-60fadd52d077.png" width="520" height="520" />



### Rules:

For the project, we will define a slightly simpler set of rules than the original game:
1. Each player randomly draws a tile from the bag
2. The order of the players is determined by the order of the letters drawn (from smallest to largest)
a. If an empty tile is drawn, we will return it to the bag and draw another one.
3. All the tiles return to the bag
4. Each player randomly draws 7 tiles
5. The first player (the one who drew the smallest letter in the lottery) must form a legal word
that passes through the central slot (the star) on the board.
a. Only he gets a double score for it.
b. He completes from the bag so that he has 7 tiles again.
6. Gradually, each player, in turn, assembles a legal word from the tiles in his possession
a. When, as in a crossword puzzle, each word must rest on one of the tiles on the board.
b. After writing the word, the player adds 7 tiles from the sack
c. His score is accumulated according to all the words created on the board following the placement of the tiles
i. Tiles that are placed on double or triple letter squares, their value will be doubled or tripled respectively
ii. Then the word gets the sum of its tile value
iii. This amount will be doubled or tripled for each word multiplication or tripling slot that is one of the tiles
superimposed on it (that is, it is possible, for example, to multiply by 4 or 9 if the word took two).
double word or triple word slots respectively (
iv. The above calculation is true for every new word created on the board following the placement in the queue
7. A player who cannot form a legal word gives up his turn.
8. The game will end after N rounds.

A legal word must meet all of the following conditions:
* Written from left to right or from top to bottom (and not in any other way)
* A word that appears in one of the books chosen for the game
* Leans on one of the existing tiles on the board
* Does not produce other illegal words on the board


### Game Example


<img src="https://github.com/alonx5050/Book-Scrabble-Game/blob/main/Server%20side/Book%20Scarbble/Example%20Book%20Scrabble.jpg" width="1080" height="120" />


Let's assume for the  example that there are 2 players and the letter R sits on the star.
- Player A wrote the word Horn,  that worth 7 points, but received a double score (star bonus) and completed 4 from the bag.
- Player B wrote the word Farm, that worth 9 points and completed 3 from the bag.
- Player A wrote the word Paste which alone is worth 7 points, however  The letters P and E fell on the "triple letter" slot, so the word is worth 15 points.
  In addition, the word Farms was created, which is worth 10 points, so he received a total of 25 points.
  
- Player B wrote the word Mob (and completed from bag 2)
    Besides her, the words Not and Be were also created on the board, And together with the bonus slots on the board he got 18 points in total.
- Player A  wrote Bit and similarly received a cumulative score of 22 points for Pi, Bit and At.

  
  
 
  
