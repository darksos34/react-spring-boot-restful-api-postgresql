package nl.codebean.reactspringboot.profile.controller;

import nl.codebean.reactspringboot.profile.model.Profile;
import nl.codebean.reactspringboot.profile.services.ProfileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping
    public List<Profile> getAllProfiles(){
        return profileService.getAllProfiles();
    }

    @GetMapping("/{id}")
    public Profile getProfile(@PathVariable Long id){
        return profileService.getProfile(id);
    }

    @PostMapping
    public void addProfile(@RequestBody Profile profile){
        profileService.addProfile(profile);

    }
    @PutMapping
    public void updateProfile(@RequestBody Profile profile, @PathVariable Long id){
        profileService.updateProfile(id, profile);

    }
    @DeleteMapping("/{id}")
    public void deleteProfile(@PathVariable Long id){
        profileService.deleteProfile(id);
    }
}

