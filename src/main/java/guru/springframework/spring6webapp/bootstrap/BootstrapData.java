package com.spring.learning.spring6webapp.bootstrap;

import com.spring.learning.spring6webapp.domain.Publisher;
import com.spring.learning.spring6webapp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final PublisherRepository publisherRepository;

    public BootstrapData(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher adamsPublishing = new Publisher();
        adamsPublishing.setAddress("Krotka 5");
        adamsPublishing.setCity("Lodz");
        adamsPublishing.setPublisherName("AdamsIndustry");
        adamsPublishing.setState("Poland");
        adamsPublishing.setZip("97-300");

        Publisher adamsPublishingSaved = publisherRepository.save(adamsPublishing);

        System.out.println("In Bootstrap:");
        System.out.println("Publisher count: " + publisherRepository.count());
    }
}
