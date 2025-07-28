def get_choice(player):
    choice = input(f"{player}, enter Rock, Paper, or Scissors: ").strip().lower()
    while choice not in ["rock", "paper", "scissors"]:
        choice = input("Invalid choice. Please enter Rock, Paper, or Scissors: ").strip().lower()
    return choice

def determine_winner(p1_choice, p2_choice):
    if p1_choice == p2_choice:
        return "It's a tie!"
    elif (p1_choice == "rock" and p2_choice == "scissors") or \
         (p1_choice == "scissors" and p2_choice == "paper") or \
         (p1_choice == "paper" and p2_choice == "rock"):
        return "Player 1 wins!"
    else:
        return "Player 2 wins!"

# Game loop
print("🎮 Welcome to Rock-Paper-Scissors Game!")
while True:
    player1 = get_choice("Player 1")
    player2 = get_choice("Player 2")

    result = determine_winner(player1, player2)

    print(f"\nPlayer 1 chose: {player1.capitalize()}")
    print(f"Player 2 chose: {player2.capitalize()}")
    print(result)

    # Ask if they want to play again
    play_again = input("\nDo you want to play another round? (Yes/No): ").strip().lower()
    if play_again != "yes":
        print("Thanks for playing! Goodbye 👋")
        break
