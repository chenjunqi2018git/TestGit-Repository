package test.show.tools;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("test1111 git From MainClass!!"); // local add

		TestClass testClass = new TestClass();
		testClass.show();

		System.out.println("test2222 git From MainClass!!");

		System.out.println("test3333 git From MainClass!!");// develop_chenjunqiで修正しました。

		User user = new User();
		user.setAge(18);
		user.setName("chenjunqi");
		user.setChnName("陳　駿祺　ちんしゅんき");

	}

}
