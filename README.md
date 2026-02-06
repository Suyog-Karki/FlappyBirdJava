# 🐦 Flappy Bird Game - Java Implementation

A classic Flappy Bird game recreation in Java using Swing for graphics and game mechanics with smooth 60 FPS gameplay.

<div align="center">

## 🎮 Game Preview

### Game Assets
<table>
<tr>
<td align="center" width="33%">
<img src="src/flappybird.png" alt="Bird Sprite" width="100"/><br/>
<b>Bird Sprite</b><br/>
Your flappy companion
</td>
<td align="center" width="33%">
<img src="src/toppipe.png" alt="Top Pipe" width="80"/><br/>
<b>Top Pipe</b><br/>
Navigate carefully!
</td>
<td align="center" width="33%">
<img src="src/bottompipe.png" alt="Bottom Pipe" width="80"/><br/>
<b>Bottom Pipe</b><br/>
Avoid collision
</td>
</tr>
</table>

### 🎯 How to Run the Game

```bash
# 1. Clone the repository
git clone https://github.com/Suyog-Karki/FlappyBirdJava.git
cd FlappyBirdJava/src

# 2. Compile
javac App.java FlappyBird.java

# 3. Run!
java App
```

**Game Window Size:** 360x640 pixels | **Frame Rate:** 60 FPS

</div>

---

## 📖 Description

This is a faithful recreation of the viral Flappy Bird mobile game. Guide your bird through gaps between pipes by precisely timing your jumps. The game features:
- Smooth 60 FPS animations
- Real-time collision detection
- Persistent high score tracking
- Instant restart capability

## ✨ Features

| Feature | Description |
|---------|-------------|
| 🎮 **Classic Gameplay** | Navigate through pipes with simple one-button control |
| 🎬 **Smooth Graphics** | 60 FPS game loop for fluid animations |
| 📊 **Score Tracking** | Real-time score display as you pass through pipes |
| 🏆 **High Score System** | Automatically saves and loads your best score |
| 🔄 **Quick Restart** | Press SPACE after game over to restart instantly |
| 💥 **Collision Detection** | Accurate AABB hit detection for pipes and boundaries |
| 💾 **Persistent Storage** | High scores saved between gaming sessions |

## 🎯 Quick Start Guide

### Prerequisites
- ☕ Java Development Kit (JDK) 8 or higher
- 🖥️ Java Runtime Environment (JRE)

### Installation & Running

**Step 1: Get the Code**
```bash
git clone https://github.com/Suyog-Karki/FlappyBirdJava.git
cd FlappyBirdJava/src
```

**Step 2: Compile**
```bash
javac App.java FlappyBird.java
```

**Step 3: Play!**
```bash
java App
```

### 🎮 Alternative - Run from IDE

<details>
<summary><b>IntelliJ IDEA</b></summary>

1. Open project folder
2. Navigate to `src/App.java`
3. Right-click → **Run 'App.main()'**
4. Game window appears - Press SPACE to start!

</details>

<details>
<summary><b>Eclipse</b></summary>

1. File → Import → Existing Project
2. Select FlappyBirdJava folder
3. Right-click `App.java`
4. **Run As** → **Java Application**

</details>

<details>
<summary><b>VS Code</b></summary>

1. Install "Extension Pack for Java"
2. Open project folder
3. Open `App.java`
4. Click **Run** button above `main` method

</details>

## 🕹️ How to Play

| Action | Control |
|--------|---------|
| **Make Bird Jump** | Press `SPACE` |
| **Start Game** | Automatic on launch |
| **Restart After Game Over** | Press `SPACE` |

### Gameplay Loop
1. 🚀 Game starts automatically with bird in center
2. ⬆️ Press **SPACE** to make the bird jump upward
3. 🎯 Navigate through gaps between green pipes
4. 📈 Earn +1 point for each pipe set you pass
5. 💥 Game ends on collision with pipes or boundaries
6. 🔄 Press **SPACE** to restart and beat your high score!

## 📊 Gameplay Mechanics

```
Physics System:
├── Gravity: 1 pixel/frame² (constant downward force)
├── Jump Velocity: -9 pixels/frame (upward thrust)
├── Pipe Speed: -4 pixels/frame (moves left)
└── Bird Size: 34x24 pixels
```

### Game Rules
- ⚡ **Gravity** constantly pulls the bird downward
- 🚀 **Jump** gives an instant upward velocity boost
- ⬅️ **Pipes** scroll continuously from right to left
- ✅ **Score** increases by 1 for each pipe set cleared
- ❌ **Collision** with pipes, ceiling, or floor = Game Over
- 🏆 **High Score** automatically saved when beaten

## ⚙️ Customization

Want to modify game difficulty? Edit these values in `FlappyBird.java`:

```java
// Game Window
int boardWidth = 360;      // Window width
int boardHeight = 640;     // Window height

// Physics (lines ~56-59)
int velocityX = -4;        // Pipe speed (increase = harder)
int gravity = 1;           // Gravity strength (increase = harder)
int jumpVelocity = -9;     // Jump power (in keyPressed method)

// Difficulty Settings
Timer placePipeTimer = new Timer(1500, ...);  // Pipe spawn rate (ms)
int openingSpace = boardHeight/4;             // Gap size (decrease = harder)
```

**Try these presets:**

| Difficulty | velocityX | gravity | openingSpace | spawn rate |
|-----------|-----------|---------|--------------|------------|
| Easy | -3 | 1 | 200 | 2000ms |
| **Normal** | **-4** | **1** | **160** | **1500ms** |
| Hard | -5 | 1 | 140 | 1200ms |
| Expert | -6 | 2 | 120 | 1000ms |

## 📁 Project Structure

```
FlappyBirdJava/
├── src/
│   ├── App.java                 # 🚀 Main entry point
│   ├── FlappyBird.java          # 🎮 Core game logic
│   ├── flappybirdbg.png         # 🌅 Background image
│   ├── flappybird.png           # 🐦 Bird sprite (34x24)
│   ├── toppipe.png              # 🟢 Top pipe (64x512)
│   └── bottompipe.png           # 🟢 Bottom pipe (64x512)
├── .idea/                       # IntelliJ IDEA config
├── flappybird_highscore.txt     # 🏆 High score storage (auto-generated)
├── flappybird.iml               # IntelliJ module file
└── README.md                    # 📖 This file
```

## 🏆 High Score System

- 💾 Scores automatically saved to `flappybird_highscore.txt`
- 📍 File created in game directory on first run
- ♾️ Persists between game sessions
- 📺 Displayed during gameplay and game over screen
- 📝 Plain text format for easy viewing/editing

**File Format:**
```
5  ← Your best score
```

## 🔧 Troubleshooting

<details>
<summary><b>❌ Images not loading</b></summary>

- ✅ Verify all PNG files are in `src/` directory
- ✅ Check exact filenames (case-sensitive):
    - `flappybirdbg.png`
    - `flappybird.png`
    - `toppipe.png`
    - `bottompipe.png`
- ✅ Confirm files are valid PNG format
- ✅ Images loaded via `getClass().getResource("./filename.png")`

</details>

<details>
<summary><b>🖥️ Game window doesn't appear</b></summary>

- ✅ Run `App.java` (contains main method)
- ✅ Verify Java installation: `java -version`
- ✅ Check `frame.setVisible(true)` is called
- ✅ Ensure `flappyBird.requestFocus()` enables input
- ✅ Try running from terminal instead of IDE

</details>

<details>
<summary><b>💾 High score not saving</b></summary>

- ✅ Check directory write permissions
- ✅ Look for console error messages
- ✅ File auto-creates on first game over
- ✅ Verify you're in correct directory

</details>

<details>
<summary><b>⚡ Compilation errors</b></summary>

```bash
# Verify you're in src/ directory
cd FlappyBirdJava/src

# Check Java version (needs 8+)
javac -version

# Compile both files
javac App.java FlappyBird.java

# Run
java App
```

</details>

<details>
<summary><b>🏎️ Game too fast/slow</b></summary>

Edit `FlappyBird.java`:
- Line ~57: `velocityX` (pipe speed)
- Line ~59: `gravity` (fall speed)
- Line ~103: `Timer(1000/60, ...)` (FPS)

</details>

## 💻 Technical Details

| Component | Technology |
|-----------|-----------|
| **Language** | Java (JDK 8+) |
| **GUI Framework** | Java Swing (JFrame, JPanel) |
| **Graphics** | Java AWT (Graphics2D) |
| **Game Loop** | Timer-based (60 FPS) |
| **Collision** | AABB Algorithm |
| **File I/O** | BufferedReader/Writer |
| **Input** | KeyListener Interface |
| **Threading** | Swing EDT + Timer |

### Code Architecture

**App.java** - Application Bootstrap
- Creates 360x640 JFrame window
- Initializes FlappyBird panel
- Configures window properties

**FlappyBird.java** - Game Engine
- Extends JPanel for rendering
- Implements ActionListener (game loop)
- Implements KeyListener (input)
- Contains Bird and Pipe inner classes

### Key Methods

| Method | Purpose |
|--------|---------|
| `paintComponent(Graphics g)` | Renders all visual elements |
| `move()` | Updates positions, checks collisions |
| `collision(Bird, Pipe)` | AABB collision detection |
| `placePipes()` | Spawns randomized pipe pairs |
| `loadHighScore()` | Reads saved high score |
| `saveHighScore()` | Persists new high score |
| `actionPerformed(ActionEvent)` | 60 FPS game loop callback |
| `keyPressed(KeyEvent)` | Handles SPACE input |

## 🚀 Future Enhancements

- [ ] 🔊 Sound effects (jump, score, collision)
- [ ] 🎵 Background music with volume control
- [ ] 📊 Multiple difficulty levels
- [ ] 🎨 Unlockable bird skins/themes
- [ ] 🎬 Animated bird sprite (wing flapping)
- [ ] ⏸️ Pause functionality (ESC key)
- [ ] 🏆 Leaderboard with top 10 scores
- [ ] ✨ Particle effects on collision
- [ ] 🌙 Day/night theme toggle
- [ ] 📈 Statistics (games played, average score)
- [ ] 🎮 Gamepad/controller support
- [ ] 📱 Android/iOS mobile port

## 🎯 Pro Tips for High Scores

| Tip | Strategy |
|-----|----------|
| ⏱️ **Timing** | Don't spam SPACE - find your rhythm |
| 🎯 **Focus** | Watch the gap, not the pipes |
| 📈 **Momentum** | Bird accelerates when falling - anticipate |
| 🧘 **Stay Calm** | Panicking leads to mistakes |
| 🔄 **Practice** | Muscle memory improves with repetition |
| 📊 **Consistency** | Aim for steady progress, not risky shortcuts |

## 👥 Credits

- 🎮 **Original Concept**: Dong Nguyen (Flappy Bird)
- 💻 **Java Implementation**: [Suyog-Karki](https://github.com/Suyog-Karki)
- 🎨 **Game Assets**: Flappy Bird sprite assets

## 📄 License

This project is created for **educational purposes**. Feel free to:
- ✅ Use for learning Java game development
- ✅ Modify and extend functionality
- ✅ Fork and create your own versions
- ✅ Share with others

## 🤝 Contributing

Contributions are welcome! Here's how:

1. 🍴 Fork the repository
2. 🌿 Create feature branch (`git checkout -b feature/AmazingFeature`)
3. 💾 Commit changes (`git commit -m 'Add AmazingFeature'`)
4. 📤 Push to branch (`git push origin feature/AmazingFeature`)
5. 🎉 Open Pull Request

**Contribution Ideas:**
- Add sound effects/music
- Implement new themes
- Create difficulty modes
- Improve collision detection
- Add power-ups
- Create level progression system

---

<div align="center">

### 🐦 **Enjoy the game and beat your high score!** 🏆

**Star ⭐ this repo if you enjoyed playing!**

Made by [Suyog-Karki](https://github.com/Suyog-Karki)

</div>