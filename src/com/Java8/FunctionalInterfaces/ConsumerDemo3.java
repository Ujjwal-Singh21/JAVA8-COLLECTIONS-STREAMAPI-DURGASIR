package com.Java8.FunctionalInterfaces;
import java.util.function.Consumer;

//Consumer Chaining -> using andThen() method
class Movie {
    String movieName;

    Movie(String movieName) {
        this.movieName = movieName;
    }
}

public class ConsumerDemo3 {
    public static void main(String[] args) {

        //creating multiple Consumers
        Consumer<Movie> consumer1 = m ->
                System.out.println(m.movieName + " is ready to release");
        Consumer<Movie> consumer2 = m ->
                System.out.println(m.movieName + " is released but super flop..!!");
        Consumer<Movie> consumer3 = m ->
                System.out.println("Storing " + m.movieName + " in DataBase");

        //Creating another rootConsumer to combine all 3 Consumers
        Consumer<Movie> rootConsumer = consumer1.andThen(consumer2).andThen(consumer3);

        //Creating Movie object
        Movie movie = new Movie("Spyder");
        //now just simply calling rootConsumer
        rootConsumer.accept(movie);
    }
}
