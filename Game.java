
public class Game extends Member {
   int gameId;
   double price;
   String description;
   
public Game(int gameId, double price, String description) {
	this.gameId = gameId;
	this.price = price;
	this.description = description;
}
public int getGameId() {
	return gameId;
}
public void setGameId(int gameId) {
	this.gameId = gameId;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}
