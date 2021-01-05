package nl.codebean.reactspringboot.profile.repository;

import nl.codebean.reactspringboot.profile.model.Profile;

import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {

}

