package springboot.service;

import org.springframework.stereotype.Service;

@Service("message")
public class MessageImpl implements Message{
    @Override
    public void getName() {
        System.out.println("hello spring!");
    }
}
