public class String_program {

    public static void main(String[] args) {
        
        String name="jayendra";
        String name1="jayendra";
        String name2="Chandan";
        String name3="Jeyendra";
        String surname=" mishra";
        String name4="      jayendra        ";
        // System.out.println(name);
        System.out.println("real string:"+name);
        System.out.println("While replaceing:"+name.replace('r', 'R'));
        System.out.println("After replace to check the string:"+name);
        System.out.println("string at:"+name.charAt(0));
        System.out.println("string at:"+name.charAt(5));
        System.out.println("unicode:"+name.codePointAt(0));
        System.out.println("unicode before:"+name.codePointBefore(1));
        System.out.println("codepoint:"+name.codePointCount(0,5));
        System.out.println("compare name and name1:"+name.compareTo(name1));
        System.out.println("compare name1 and name2:"+name1.compareTo(name2));
        System.out.println("compare name1 and name2 for ignore:"+name1.compareToIgnoreCase(name2));
        System.out.println("compare name1 and name2 for ignore:"+name1.compareToIgnoreCase(name3));
        System.out.println("concating to string:"+name.concat(surname));
        System.out.println("it contain given given string or not:"+name.contains("j"));
        System.out.println("it contain given given string or not:"+name.contains("k"));
        System.out.println("it contain given given string or not:"+name.contentEquals("jayendra"));
        System.out.println("it contain given given string or not:"+name.contentEquals("jay"));
        System.out.println("end of string:"+name.endsWith("dra"));
        System.out.println("end of string:"+name.endsWith("ja"));
        System.out.println("equal:"+name.equals("jayendra"));
        System.out.println("hashcode:"+name.hashCode());
        System.out.println("trim:"+name4.trim());
        System.out.println("upper:"+name2.toUpperCase());
        System.out.println("lower"+name2.toLowerCase());


        









    }
    
}