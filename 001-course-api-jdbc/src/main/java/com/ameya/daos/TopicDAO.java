package com.ameya.daos;

import java.util.List;

import com.ameya.models.Topic;

public interface TopicDAO {

	public List<Topic>getAllTopics();
	public void addTopic(Topic topic);
	public void updateTopic(String id,Topic topic);
	public Topic getTopic(String id);
	public void deleteTopic(String id);
}
