package com.debuggeando_ideas.seccion10.predicate.hosting05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate06App {

    public static void main(String[] args) {
        description();

        Hosting h1 = new Hosting(1, "amazon", "aws.amazon.com");
        Hosting h2 = new Hosting(2, "linode", "linode.com");
        Hosting h3 = new Hosting(3, "liquidweb", "liquidweb.com");
        Hosting h4 = new Hosting(4, "google", "google.com");

        List<Hosting> list = Arrays.asList(h1,h2,h3,h4);

        List<Hosting> result = HostingRepository.filterHosting(list, x -> x.getName().startsWith("g"));
        System.out.println("result : " + result);  // google

        List<Hosting> result2 = HostingRepository.filterHosting(list, isDeveloperFriendly());
        System.out.println("result2 : " + result2); // linode

    }

    public static Predicate<Hosting> isDeveloperFriendly() {
        return n -> n.getName().equals("linode");
    }

    public static void description(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, Predicate is a functional interface, which accepts an argument and returns a boolean. Usually, it used to apply in a filter for a collection of objects.");
        System.out.println("2.4 Dynamic Predicate()");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
