package catringTask;

public class CastringTask {

	public void hunt(Monster monster) {
		if(monster instanceof Ork) {
			Ork ork = (Ork)monster;
			System.out.println(ork.get() + "�� ������ϴ�"); 
		}
		else if(monster instanceof Fairy) {
			Fairy fairy = (Fairy)monster;
			System.out.println(fairy.get() + "�� ������ϴ�"); 
		}
		else if(monster instanceof Human) {
			Human human = (Human)monster;
			System.out.println(human.get() + "�� ������ϴ�");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CastringTask cast = new CastringTask();
		cast.hunt(new Ork());
		cast.hunt(new Fairy());
		cast.hunt(new Human());
	}

}
