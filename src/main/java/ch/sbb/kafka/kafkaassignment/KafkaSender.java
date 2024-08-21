package ch.sbb.kafka.kafkaassignment;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class KafkaSender {

    private static final String TOPIC_NAME = "kafka.applicant-assignment";

    public static void main(String[] args) {

    }

    private Properties createConnectionProperties() {
        Properties props = new Properties();

        // Insert connection properties here. You'll get them in the meeting.

        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        return props;
    }

}
