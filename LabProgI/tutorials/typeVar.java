int var = 1;
String varType = ((String)((Object)var).getClass().getName()).replace("java.lang.","").replace("Integer","Int");
		
if(varType.equals("Int")) {
	System.out.println(true);
}
