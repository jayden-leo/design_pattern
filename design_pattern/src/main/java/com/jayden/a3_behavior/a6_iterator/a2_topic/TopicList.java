package com.jayden.a3_behavior.a6_iterator.a2_topic;

/**
 * 具体集合类
 **/
public class TopicList implements ListList<Topic> {

    private Topic[] topics;

    public TopicList(Topic[] topics) {
        this.topics = topics;
    }

    @Override
    public IteratorIterator<Topic> Iterator() {
        return new TopicIterator(topics);
    }
}