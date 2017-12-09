package com.iot.app.spark.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iot.app.spark.vo.IoTData;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

/**
 * Class to represent the IoT vehicle data.
 *
 * @author abaghel
 */
public class IoTDataDeserializer implements Deserializer<IoTData> {
    private static ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void close() {

    }

    @Override
    public void configure(Map<String, ?> arg0, boolean arg1) {

    }

    @Override
    public IoTData deserialize(String s, byte[] bytes) {
        try {
            return objectMapper.readValue(bytes, IoTData.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}