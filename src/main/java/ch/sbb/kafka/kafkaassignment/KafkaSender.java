package ch.sbb.kafka.kafkaassignment;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class KafkaSender {

    private static final String TOPIC_NAME = "kafka.applicant-assignment";

    public static void main(String[] args) {

    }

    private Properties createConnectionProperties() {
        Properties props = new Properties();

        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "pkc-zpjg0.eu-central-1.aws.confluent.cloud:9092");
        props.put("sasl.jaas.config", "org.apache.kafka.common.security.plain.PlainLoginModule required username=\"REPLACEME\" password=\"REPLACEME\";");
        props.put("sasl.mechanism", "PLAIN");
        props.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SASL_SSL");

        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        return props;
    }

}
