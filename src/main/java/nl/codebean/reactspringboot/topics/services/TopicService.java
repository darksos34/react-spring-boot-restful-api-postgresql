package nl.codebean.reactspringboot.topics.services;

import nl.codebean.reactspringboot.topics.model.Topic;
import nl.codebean.reactspringboot.topics.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public Topic topic;

    @Transactional
    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopicById(Long id) {
        return topicRepository.findById(id);

    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic) {
        topicRepository.save(topic);

    }

    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }

}
