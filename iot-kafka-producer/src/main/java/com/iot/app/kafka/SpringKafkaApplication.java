package com.iot.app.kafka;

import com.iot.app.kafka.producer.IoTDataProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringKafkaApplication {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = SpringApplication.run(SpringKafkaApplication.class, args);
        IoTDataProducer ioTDataProducer = ctx.getBean(IoTDataProducer.class);
        ioTDataProducer.generateIoTEvent("iot-data-event");
    }
}
