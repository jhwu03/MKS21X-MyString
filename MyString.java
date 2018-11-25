public class MyString implements CharSequence{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for(int i =0; i < s.length(); i = i + 1 ){
      data[i] = s.charAt(i);
    }
  }

  public char charAt(int index){
    if(index < 0 || index >= data.length){
      throw new IndexOutOfBoundsException();
    }
    char ans = ' ';
  //loops and Returns the char value at the specified index.
  for(int i = 0; i < data.length; i = i + 1 ){
    if (i == index){
      ans = data[i];
    }
  }
  return ans;
}

  public int length(){
    //loops and Returns the length of this character sequence.
    int a = 0;
    for(int i = 0; i < data.length; i = i + 1 ){
      a = a + 1;
  }
  return a;
}

  public CharSequence subSequence(int start, int end){
    if(start < 0 || end < 0 || end > data.length || end < start){
      throw new IndexOutOfBoundsException();
    }
    //loops and returns part of the sequence
    String ans = "";
    for(int i = start; i < end; i = i + 1 ){
      ans = ans + data[i];
  }
  return ans;
}

  public String toString(){
    //loops through data and print
    String ans = "";
    for(int i = 0; i < this.length(); i = i + 1 ){
      ans = ans + data[i];
    }
    return ans;
  }

  public int compareTo(CharSequence s){
    //campares the two sequences and returns -1,0 or 1
    if(s == null){
      throw new NullPointerException();
    }
    if (this.length() == 0 && s.length() == 0){
      return 0;
    }
    if(this.length() > s.length()){
      return 1;
    }
    if(this.length() < s.length()){
      return -1;
    }
    for(int i = 0; i < s.length() ; i= i + 1){
      if(this.charAt(i) > s.charAt(i)){
        return 1;
      }
      if(this.charAt(i) < s.charAt(i)){
        return -1;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    //tests for MyString
    MyString s = new MyString("What's nine plus ten");
    System.out.println(s);
    System.out.println(s.charAt(1));
    System.out.println(s.charAt(7));
    System.out.println(s.length());
    System.out.println(s.subSequence(0,11));
    System.out.println(s.subSequence(0,6));
    System.out.println(s.compareTo("What's nine plus ten"));
    System.out.println(s.compareTo("What's"));
    System.out.println(s.compareTo("Whot's nine plus ten"));
    System.out.println(s.compareTo("waht's nine plus ten"));
    System.out.println(s.compareTo("What's nine plus teen"));
  }

}
