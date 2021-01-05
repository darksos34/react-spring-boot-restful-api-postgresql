package nl.codebean.reactspringboot.topics.repository;

import nl.codebean.reactspringboot.topics.model.Topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Long> {

}
