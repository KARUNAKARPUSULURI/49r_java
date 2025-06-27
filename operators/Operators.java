class Operators{
	public static void main(String [] args){
		int score = 85;
		float ilets_score = 7.6f;
		String bg = "java";
		String bG = "java";
		System.out.print((score > 80 && score < 100) && (ilets_score > 7.5 && ilets_score < 9) && bg == "Java" ? "pass" : "fail");
	} 
}		