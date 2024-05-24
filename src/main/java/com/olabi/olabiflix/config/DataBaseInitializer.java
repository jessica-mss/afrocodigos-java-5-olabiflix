package com.olabi.olabiflix.config;

import com.olabi.olabiflix.repository.MovieRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseInitializer implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(DataBaseInitializer.class);

    private final MovieRepository movieRepository;

    public DataBaseInitializer(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Deu certo!!!!!!");
        movieRepository.saveAll(MoviesList);

    }
}
