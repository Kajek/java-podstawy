package com.company.practice.WorceProjektowePractice.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        IChannelCollection channels = new ChannelCollection();
        channels.addChannel(new Channel("mtv"));
        channels.addChannel(new Channel("sport channel"));
        channels.addChannel(new Channel("news channel"));

        IChannelIterator iterator = channels.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
