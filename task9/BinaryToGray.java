package task9;

import java.util.*;
public class BinaryToGray {
    static ArrayList<Integer> binaryList=new ArrayList<Integer>();
	
	public static ArrayList<Integer> iToB(int num) {
        int binary[] = new int[40];
        int index = 0;
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            binaryList.add(binary[i]);
        }
        //listToString(binaryList);
        return binaryList;
        
	}
	
    public static String listToString(ArrayList<Integer> list) {
        StringBuilder strbul = new StringBuilder();
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            strbul.append(iter.next());
            if (iter.hasNext()) {
                strbul.append(",");
            }
        }
        return strbul.toString();
    }
    
    public static int xOR(char a, char b)
    {
        if (a != b)
            return 1;
        return 0;
    }

    public static String toGray(String binary)
    {
        String gray = new String();
        gray += binary.charAt(0);
        for (int i = 1; i < binary.length(); i++) {
            gray += xOR(binary.charAt(i - 1), binary.charAt(i));
        }
        return gray;
        // System.out.println("The gray code of " + binary + " is : " + gray);
    }

    public static int binaryToInt(String string) {
        int num = Integer.parseInt(string, 2);
        //System.out.println(num);
        return num;
    }
    public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter num");
			int num = sc.nextInt();
			ArrayList<Integer>  list = iToB(num);
			String binarystr = listToString(list);
			String graycode = toGray(binarystr);
			int btoInt = binaryToInt(graycode);
			
			System.out.println("Integer to binary list:"+list);
			System.out.println("List to String:"+binarystr);
			System.out.println("Graycode:"+graycode);
			System.out.println("Equivalent binary for graycode:"+btoInt);
		}
    
}