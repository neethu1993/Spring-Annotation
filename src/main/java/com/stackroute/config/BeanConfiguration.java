//package com.stackroute.config;
//
//import com.stackroute.domain.Actor;
//import com.stackroute.domain.MovieSample;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.annotation.Scope;
//
//@Configuration
//public class BeanConfiguration {
//    @Bean(name="actor")
//    public Actor getActorBean(){
//        Actor actor1 = new Actor();
//        actor1.setName("DQ");
//        actor1.setGender("male");
//        actor1.setAge(33);
//        return actor1;
//    }
//    @Bean(name="actorA")
//    public Actor getActorABean(){
//        Actor actor1 = new Actor();
//        actor1.setName("Sharukh");
//        actor1.setGender("male");
//        actor1.setAge(50);
//        return actor1;
//    }
//    @Bean(name = "movie")
//    public MovieSample getMovieBean(){
//        MovieSample movie1 = new MovieSample();
//        movie1.setActor(getActorABean());
//        return movie1;
//    }
//}
