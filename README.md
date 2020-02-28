# study
Mini Code Test - LetterCombination

The LetterCombinationUtil class can support the 2 stage:
1. convert the digits from 0 to 9 into letters
2. convert the digits from 0 to 99 into letters

The main method "com.itnet.study.util.LetterCombinationUtil.main" is provided here for doing test easier : 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer array separated by spaces(eg. 2 23 26): ");
        while(sc.hasNext()) {
            String str = sc.nextLine();
            String[] strs = str.trim().split("\\s{1,}");
            Integer[] arr = new Integer[strs.length];
            for (int i = 0; i < strs.length; i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            System.out.println("Input: arr[] = " + Arrays.toString(arr) + "");
            System.out.println("Output: " + letterCombination(arr).toString());
        }
    }


Also, you can run the LetterCombinationUtilTest for test case.
