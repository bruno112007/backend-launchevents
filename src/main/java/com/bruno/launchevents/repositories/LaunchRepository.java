package com.bruno.launchevents.repositories;

import com.bruno.launchevents.entities.Launch;
import com.bruno.launchevents.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaunchRepository extends JpaRepository<Launch, Integer> {
}
