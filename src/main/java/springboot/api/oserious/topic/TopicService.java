package springboot.api.oserious.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<TopicObject> topics = new ArrayList<>(Arrays.asList(new TopicObject("1", "name 1 ", "descripytion 1"),
			new TopicObject("2", "name 2 ", "descripytion 2"), new TopicObject("3", "name 3 ", "descripytion 3"),
			new TopicObject("4", "name 4 ", "descripytion 4"), new TopicObject("5", "name 5 ", "descripytion 5")));

	public List<TopicObject> getTopics() {
		return topics;
	}

	public void setTopics(List<TopicObject> topics) {
		this.topics = topics;
	}

	public TopicObject getTopics(String id) {

		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(TopicObject topic) {

		topics.add(topic);
		
	}

	public void updateTopic(String id, TopicObject topic) {

		for (int i = 0; i < topics.size(); i++) {
			TopicObject t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void removeTopic(String id) {
		for (int i = 0; i < topics.size(); i++) {
			TopicObject t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.remove(i);
				return;
			}
		}
	}
}
