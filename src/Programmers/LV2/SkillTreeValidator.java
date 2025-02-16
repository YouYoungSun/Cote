package Programmers.LV2;

import java.util.HashSet;
import java.util.Set;

public class SkillTreeValidator {
    public static int solution(String skill,String[] skill_trees){
        int validCount = 0;
        Set<Character> skillSet = new HashSet<>();
        for(char c : skill.toCharArray()){
            skillSet.add(c);
        }

        for(String s : skill_trees){
            StringBuilder sb = new StringBuilder();

            for(char c : s.toCharArray()){
                if(skillSet.contains(c)){
                    sb.append(c);
                }
            }

            if(skill.startsWith(sb.toString())){
                validCount++;
            }
        }
        return validCount;
    }

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees={"BACDE","CBADF","AECB","BDA"};
        System.out.println(solution(skill,skill_trees));
    }
}
