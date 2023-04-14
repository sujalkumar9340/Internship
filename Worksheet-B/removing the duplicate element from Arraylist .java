public static void main(String[]args) {
		
		ArrayList<Integer> obj=new ArrayList<>();	
		obj.add(54);
		obj.add(90);
		obj.add(9);
		obj.add(10);
		obj.add(50);
		obj.add(65);
		obj.add(89);
		obj.add(90);
		obj.add(9);
		HashSet <Integer> obj2=new HashSet<>(obj);
		ArrayList <Integer>obj3=new ArrayList<>(obj2);
		System.out.println(obj3);
		
