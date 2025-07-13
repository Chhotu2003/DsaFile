public class VowelValuesCharPrint {
    public static void VowelValuesCheck(char ch){
        boolean vowel = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
        if(vowel){
            System.out.println("Vowel value: "+ch);
        }
        else{
            System.out.println("Consonant Value: "+ch);
        }
        
    }
    public static void main(String[] args) {
        char c='o';
        VowelValuesCheck(c);
    }
}
