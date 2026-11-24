//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
   /*1.Develop a program that takes the weight (in kilograms) and height (in meters)
    as input and calculates the BMI, then prints it.  */
    Scanner input = new Scanner(System.in);
    System.out.println("enter your weight in kg");
    float weight = input.nextFloat();
    System.out.println("enter your height in meters");
    float height = input.nextFloat();
    float BMI = weight / (height * height);
    System.out.printf("BMI= %.2f%n", BMI);

    /*2 Write a program that takes the obtained marks and total marks as input and
calculates the percentage, then prints it.  */
    System.out.println("enter obtained marks");
    double obtained = input.nextDouble();
    System.out.println("enter total marks");
    double total_marks = input.nextDouble();
    double percentage = (obtained / total_marks) * 100;
    System.out.println(" percentage = " + percentage + "%");

   /*3 Create a program that takes an amount in one currency and an exchange rate
as input, then converts and prints the amount in another currency.  */
    System.out.println("enter  amount in usd");
    double amount_in_usd = input.nextDouble();
    System.out.println("enter  exchange rate ");
    double rate =input.nextDouble();
    double amount_in_EUR = amount_in_usd * rate;
    System.out.println("USD to EUR " + amount_in_EUR);

    /*4 Create a program that takes a string as input, calculates its length, and then
reverses the string using the StringBuilder class, finally printing both the length and
reversed string. */
    System.out.println("enter the text ");
    input.nextLine();
    String txt = input.nextLine();

    System.out.println("length of the text is = " + txt.length());
    String sb = new StringBuilder(txt).reverse().toString();
    System.out.println("reverse of the text is = " + sb);

    /* 5.
Develop a program that takes a sentence as input and extracts a substring from
it, then prints the extracted substring.  */
    System.out.println("enter string value");
    String sentence =input.nextLine();
    System.out.println("enter start value");
    int start= input.nextInt();
    System.out.println("enter end value");
    int end= input.nextInt();
input.nextLine();
    String sentence_substring = sentence.substring(start,end);
System.out.println("SENTENCE SUBSTRING IS "+sentence_substring);
/*6.
Write a program that takes a sentence and a keyword as input, then check if
the keyword is present in the sentence and prints the result. */
    System.out.println("enter sentence ");
    String new_sentence = input.nextLine();
    System.out.println("enter keyword ");
    String keyword =input.nextLine();
   boolean contain_or_not = new_sentence.contains(keyword);
    System.out.println("the keyword  "+keyword +(contain_or_not ));

    /*7.
Develop a program that takes a sentence and a word to replace as input, then
replace all occurrences of the word with another word and prints the modified
sentence.  */
    System.out.println("enter sentence to replace word");
String sentence_t=input.nextLine();

    System.out.println("enter the word  want to replace ");
String old_word =input.nextLine();
    System.out.println("enter the  new word ");
    String new_word =input.nextLine();

    String newSentence =sentence_t.replace(old_word,new_word);

    System.out.println(" update sentence "+newSentence);

/*8.
Write a program that takes two strings as input and check if they are equal,
ignoring the case, then prints whether they are equal or not. */
    System.out.println("enter first word");
    String F_word=input.nextLine();
    System.out.println("enter second word");
    String S_word=input.nextLine();
    System.out.println(F_word.equalsIgnoreCase(S_word));










}



