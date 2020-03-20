package ru.khaliullin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.khaliullin.DAO.TableWordInH2DBDAO;
import ru.khaliullin.model.TableWordInH2DB;

@Service
public class KafkaConsumer {

    @Autowired
    private TableWordInH2DBDAO tableWordInH2DBDAO;

    @KafkaListener(topics = "java_topic", groupId = "newTopic")
    public void consume(String name){
        System.out.println("Сообщение принято: " + name);
        TableWordInH2DB tableWordInH2DB = new TableWordInH2DB();
        tableWordInH2DB.setWord(name);
        tableWordInH2DBDAO.save(tableWordInH2DB);
    }
}
