let player = {
    name: "Andrea",
    chips: 300
}
let cards = []
let sum = 0
let hasBlackJack = false
let isAlive = false
let message = ""
let messageEl = document.querySelector("#message-el")
let sumEl = document.querySelector("#sum-el")
let cardsEl = document.querySelector("#cards-el")
let playerEl = document.querySelector("#player-el")

playerEl.textContent = player.name + " : $ " + player.chips

function getRandomCard() {
    let randomNumber = Math.round(Math.random() * 13) + 1
    if(randomNumber > 10) {
        return 10
    } else if(randomNumber === 1) {
        return 11
    } else 
    return randomNumber
}

function startGame() {
    isAlive = true;
    let firstCard = getRandomCard()
    let secondCard = getRandomCard()
    cards = [firstCard, secondCard]
    sum = firstCard + secondCard
    renderGame()
}

function renderGame() {
    sumEl.textContent = "Sum: " + sum
    cardsEl.textContent = "Cards: "

    for(let i = 0; i < cards.length; i++) {
        cardsEl.textContent += cards[i] + " "
    }

    if(sum <= 20) {
        message = "Do you want to a new card?"
    } else if (sum === 21) {
        message = "Wohoo! You got Blackjack!"
        hasBlackJack = true
    } else {
        message = "You are out of the game!"
        isAlive = false
    }
    messageEl.textContent = message
}

function newCard() {
    if(isAlive === true && hasBlackJack === false) {
        let card = getRandomCard()
        cards.push(card)
        sum += card
        renderGame()
    }
}

//CASH OUT
console.log(hasBlackJack)
console.log(isAlive)
