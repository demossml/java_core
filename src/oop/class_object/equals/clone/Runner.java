package oop.class_object.equals.clone;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Agent agent = new Agent("Мистер Сит");
//        System.out.println(agent);
        Agent[] agents = make1000Clones(agent);
        for (Agent clone : agents) {
            System.out.println(clone);
        }


    }

    public static Agent[] make1000Clones(Agent agent) throws CloneNotSupportedException {
        Agent[] agents = new Agent[1000];
        for (int i = 0; i < 1000; i++) {
            agents[i] = (Agent) agent.clone();
        }
        System.out.println(agent);
        return agents;
    }


}
