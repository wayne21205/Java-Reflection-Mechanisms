package test;

import java.util.List;

public class ReflectionTest {
	
	public static void main(String args[]) {
		try {
			// forName的使用
			Class c = Class.forName("test.ReflectionTest");
			System.out.println("getName : " + c.getName());
			System.out.println("isInterface : " + c.isInterface());
			System.out.println("isPrimitive : " + c.isPrimitive());
			System.out.println("isArray : " + c.isArray());
			System.out.println("SuperClass : " + c.getCanonicalName());

//			// newInstance的使用
//			List lst = (List) c.newInstance();
//			for (int i = 0; i < 10; i++)
//				lst.add("element" + i);
//			for (Object o : lst.toArray())
//				System.out.println(o);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
