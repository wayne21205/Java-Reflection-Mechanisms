import java.util.List;



public class ClassDemo {
	
	
   public static void main(String args[]) {
       
	   String name = "godleon";
       Class stringClass = name.getClass();

       System.out.println("類別名稱：" + stringClass.getName());
       System.out.println("是否為介面：" + stringClass.isInterface());
       System.out.println("是否為基本型態：" + stringClass.isPrimitive());
       System.out.println("是否為陣列物件：" + stringClass.isArray());
       System.out.println("父類別名稱：" + stringClass.getSuperclass().getName());
       System.out.println("\n\n\n");
       
       try {
           //forName的使用
           Class c = Class.forName("ClassDemo");
           System.out.println("getName : " + c.getName());
           System.out.println("isInterface : " + c.isInterface());
           System.out.println("isPrimitive : " + c.isPrimitive());
           System.out.println("isArray : " + c.isArray());
           System.out.println("SuperClass : " + c.getCanonicalName());

           //newInstance的使用
           List lst = (List) c.newInstance();
           for(int i = 0 ; i < 10 ; i++)
               lst.add("element" + i);
           for(Object o : lst.toArray())
               System.out.println(o);
       }
       catch(Exception e) {
           e.printStackTrace();
       }
   }
}
