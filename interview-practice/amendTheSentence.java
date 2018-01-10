String amendTheSentence(String s) {
    StringBuilder sb = new StringBuilder();
    char [] sChar = s.toCharArray();

    if(s.length() == 0) {
        return "";
    } else if (s.length() == 1) {
        return sb.append(Character.toLowerCase(sChar[0])).toString();
    }
    
    sb.append(Character.toLowerCase(sChar[0]));
    
    for(int i = 1; i < s.length(); i++) {
        if(Character.isUpperCase(sChar[i])) {
            sb.append(' ');
            sb.append(Character.toLowerCase(sChar[i]));
        } else {
            sb.append(sChar[i]);
        }
    }
    
    return sb.toString();
}
