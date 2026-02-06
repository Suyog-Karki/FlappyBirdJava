# Flappy Bird Game

A classic Flappy Bird game implementation in Java using Swing for graphics and game mechanics.

## Description

This is a recreation of the popular Flappy Bird mobile game. Guide your bird through gaps between pipes by controlling its vertical movement. The game features smooth animations, collision detection, score tracking, and persistent high score saving.

## Features

- **Classic Gameplay**: Navigate through pipes by making the bird jump
- **Smooth Graphics**: 60 FPS game loop for fluid animations
- **Score Tracking**: Real-time score display as you pass through pipes
- **High Score System**: Automatically saves and loads your best score
- **Game Over & Restart**: Easy restart functionality with space bar
- **Collision Detection**: Accurate hit detection for pipes and boundaries

## Requirements

- Java Development Kit (JDK) 8 or higher
- Java Runtime Environment (JRE) to run the compiled game

## Project Structure

```
FlappyBird/
├── FlappyBird.java       # Main game class with game logic
├── App.java              # Application entry point (if separate)
├── flappybirdbg.png      # Background image
├── flappybird.png        # Bird sprite
├── toppipe.png           # Top pipe image
├── bottompipe.png        # Bottom pipe image
├── flappybird_highscore.txt  # High score storage (auto-generated)
└── README.md             # This file
```

## Installation

1. **Clone or download the project** to your local machine

2. **Ensure you have the required image files** in the same directory as the Java files:
    - `flappybirdbg.png`
    - `flappybird.png`
    - `toppipe.png`
    - `bottompipe.png`

3. **Compile the Java files**:
   ```bash
   javac FlappyBird.java
   javac App.java  # If you have a separate App.java file
   ```

## How to Run

### Option 1: If you have a separate App.java file
```bash
java App
```

### Option 2: If FlappyBird.java contains the main method
```bash
java FlappyBird
```

### Option 3: Create a simple launcher
If you don't have an App.java file, create one:

```java
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
```

Then compile and run:
```bash
javac App.java FlappyBird.java
java App
```

## How to Play

1. **Start the Game**: The game starts automatically when you launch it
2. **Control the Bird**: Press the `SPACE` bar to make the bird jump
3. **Avoid Obstacles**: Navigate through the gaps between pipes
4. **Score Points**: You earn 1 point for each set of pipes you pass
5. **Game Over**: The game ends if you hit a pipe or the ground
6. **Restart**: Press `SPACE` after game over to restart

## Game Controls

| Key | Action |
|-----|--------|
| `SPACE` | Make the bird jump / Restart after game over |

## Gameplay Mechanics

- **Gravity**: The bird constantly falls due to gravity
- **Jump**: Pressing space gives the bird an upward velocity
- **Pipes**: Pipes move from right to left at a constant speed
- **Scoring**: Pass through pipe gaps to earn points
- **Collision**: Game ends on collision with pipes, top, or bottom boundaries

## Game Settings

You can modify these values in the `FlappyBird.java` file to customize gameplay:

```java
// Board dimensions
int boardWidth = 360;
int boardHeight = 640;

// Bird physics
int velocityX = -4;      // Pipe speed (higher = faster)
int velocityY = 0;       // Initial bird velocity
int gravity = 1;         // Gravity strength
int jumpVelocity = -9;   // Jump strength (in keyPressed method)

// Pipe timing
Timer placePipeTimer = new Timer(1500, ...);  // Pipe spawn interval (ms)

// Pipe spacing
int openingSpace = boardHeight/4;  // Gap size between pipes
```

## High Score System

- High scores are automatically saved to `flappybird_highscore.txt`
- The file is created in the same directory as the game
- Your best score persists between game sessions
- High score is displayed during gameplay and on the game over screen

## Troubleshooting

### Images not loading
- Ensure all image files are in the same directory as the compiled `.class` files
- Check that image filenames match exactly (case-sensitive)
- Verify image files are valid PNG format

### Game window doesn't appear
- Make sure you have a main method that creates a JFrame
- Check that `frame.setVisible(true)` is called
- Ensure `flappyBird.requestFocus()` is called for keyboard input

### High score not saving
- Check write permissions in the game directory
- Look for error messages in the console
- The file will be created automatically on first run

## Technical Details

- **Language**: Java
- **GUI Framework**: Java Swing
- **Graphics**: Java AWT (Graphics2D)
- **Game Loop**: Timer-based (60 FPS)
- **Collision Detection**: Axis-Aligned Bounding Box (AABB)
- **File I/O**: BufferedReader/BufferedWriter for high score persistence

## Code Structure

### Main Classes

**FlappyBird (JPanel)**
- Main game panel and logic controller
- Handles rendering, game loop, and input

**Bird (Inner Class)**
- Represents the player character
- Stores position, size, and sprite

**Pipe (Inner Class)**
- Represents obstacle pipes
- Tracks position, size, and pass status

### Key Methods

- `paintComponent(Graphics g)`: Renders all game elements
- `move()`: Updates positions and checks collisions
- `collision(Bird a, Pipe b)`: Detects collisions
- `placePipes()`: Spawns new pipe pairs
- `loadHighScore()` / `saveHighScore()`: Persistent score management

## Future Enhancements

Potential features to add:
- Sound effects and background music
- Difficulty levels (varying pipe speeds)
- Multiple bird skins
- Animated bird sprite
- Pause functionality
- Score leaderboard with multiple entries
- Particle effects on collision
- Day/night theme toggle

## Credits

- Original Flappy Bird game concept by Dong Nguyen
- Java implementation by Suyog-Karki

## License

This project is created for educational purposes. Feel free to use and modify as needed.

## Contributing

Feel free to fork this project and submit pull requests with improvements!

---

**Enjoy the game and try to beat your high score! 🐦**