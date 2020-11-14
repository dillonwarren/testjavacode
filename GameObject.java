package game;
//abstract classes exist to be extended, they cannot be instantiated
public abstract class GameObject {
	private int x;
	public void blah() {
		
	}
	//this method must be implemented by any class that extends game object.
	public abstract void draw();

	public static void main(String[] args) {
		Player player = new Player();
		player.someMethod();
		player.draw();
		menu menu = new menu();
		menu.draw();
		
		GameObject[] gameObjects = new GameObject[2];
		gameObjects[0] = player;
		gameObjects[1] = menu;
		
		for(GameObject obj : gameObjects) {
			obj.draw();
		}
		
		//GameObject myObject = new GameObject();
	}

}
