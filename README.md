# GemMatching
The game involves two players taking turns to place gems. Gems, randomly assigned one of three colors with a random point value, can be placed in a player's own row to boost their score or in the opponent's row to disrupt consecutive gems of the same color, known as a "block."

The game involves two players placing gems, each randomly assigned a color and point value. Players aim to maximize their scores, calculated as the sum of gem point totals in their rows. A score multiplier is applied to blocks of consecutive gems of the same color, determined by the number of gems in the block. The game concludes when either player accumulates 16 gems, and the higher scorer wins.

To implement the game, three Java classes are provided: GemGame.java (finished), Gem.java (to represent a gem), and GemList.java (to manage a player's gems). The Gem class has methods for creating a random gem, specifying color and point value, obtaining gem information, and drawing gems using StdDraw. GemList uses a linked list data structure to manage gems, allowing insertion at specified indices, drawing gems at a given Y-coordinate, calculating total score with multipliers, and providing a string representation of the list.

The Gem class API includes methods such as Gem(), Gem(GemType type, int points), toString(), getType(), getPoints(), and draw(double x, double y).

The GemList class API includes methods such as int size(), void draw(double y), String toString(), void insertBefore(Gem gem, int index), and int score(). The nested Node class in GemList represents nodes in the linked list, containing a Gem and a reference to the next Node.
