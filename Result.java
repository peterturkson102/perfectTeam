
class Result {


    /*
     * Complete the 'perfectTeam' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING skills as parameter.
     */


    public static int perfectTeam(String skills) {
        Map<Character, Integer> skillMap = new HashMap<>();
        for(int i= 0;i<skills.length();i++){
            char skill = skills.charAt(i);
            if(skillMap.containsKey(skill)){
                skillMap.put(skill, skillMap.get(skill)+1);
            }else{
                skillMap.put(skill, 1);
            }
        }
        
        return skillMap.size()==5 ?Collections.min(skillMap.values()):0;
    }


}
