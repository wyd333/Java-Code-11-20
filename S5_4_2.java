public class S5_4_2 {
	public static void main(String[] args) {
		int[] array = {123,345,567,789,666};

		//用String做拼接
		String str1 = arrayToString(array);
		System.out.println("str1"+str1);

		//用StringBuffer做拼接
		String str2 = arrToString2(array);
		System.out.println("str2"+str2);
	}

	//用StringBuffer做拼接
	public static String arrToString2(int[] array) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int x = 0;x < array.length;x++) {
			if(x == array.length - 1) {
				sb.append(array[x]);
			}else{
				sb.append(array[x]).append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

	//用String做拼接
	public static String arrayToString(int[] array) {
		String str = "";
		str += "[";
		
		for(int x = 0;x < array.length;x++) {
			if(x == array.length - 1) {
					str += array[x];
			}else{
				str += array[x];
				str += ", ";
			}
		}
		str += "]";
		return str;
	}
}
