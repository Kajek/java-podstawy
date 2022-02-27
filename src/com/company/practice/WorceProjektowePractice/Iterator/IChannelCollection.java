package com.company.practice.WorceProjektowePractice.Iterator;

public interface IChannelCollection {

    void addChannel(Channel channel);

    void removeChannel(Channel channel);

    IChannelIterator iterator();
}