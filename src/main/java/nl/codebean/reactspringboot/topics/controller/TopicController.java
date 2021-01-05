package nl.codebean.reactspringboot.topics.controller;

import nl.codebean.reactspringboot.topics.model.Topic;
import nl.codebean.reactspringboot.topics.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/topics")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @GetMapping("/{id}")
    public Optional<Topic> getTopic(@PathVariable Long id){
        return topicService.getTopicById(id);
    }

    @PostMapping
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);

    }
    @PutMapping
    public void updateTopic(@RequestBody Topic topic){
        topicService.updateTopic(topic);

    }
    @DeleteMapping("/{id}")
    public void deleteTopic(@PathVariable Long id){
        topicService.deleteTopic(id);
    }
}

