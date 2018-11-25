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
    for(int i = 0; i < data.length; i = i + 1 ){
      ans = ans + data[i];
    }
    return ans;
  }

}
