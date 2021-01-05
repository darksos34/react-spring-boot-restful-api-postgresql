package nl.codebean.reactspringboot.profile.services;

import nl.codebean.reactspringboot.profile.model.Profile;
import nl.codebean.reactspringboot.profile.repository.ProfileRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public Profile profile;

    public List<Profile> getAllProfiles() {
        List<Profile> profiles = new ArrayList<>();
        profileRepository.findAll().forEach(profiles::add);
        return profiles;
    }
    public Profile getProfile(Long id) {
        return getProfile(id);
    }


    public void addProfile(Profile profile) {
        profileRepository.save(profile);
    }

    public void updateProfile(Long id, Profile profile) {
        profileRepository.save(profile);

    }

    public void deleteProfile(Long id) {
        deleteProfile(id);
    }


}
