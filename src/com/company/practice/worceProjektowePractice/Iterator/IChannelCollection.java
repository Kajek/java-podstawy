package com.company.practice.worceProjektowePractice.Iterator;

public interface IChannelCollection {

    void addChannel(Channel channel);

    void removeChannel(Channel channel);

    IChannelIterator iterator();
}