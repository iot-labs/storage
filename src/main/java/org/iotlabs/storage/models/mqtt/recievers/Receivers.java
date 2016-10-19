package org.iotlabs.storage.models.mqtt.recievers;

import com.google.gson.annotations.SerializedName;
import org.iotlabs.storage.models.BaseModel;

import java.util.List;

/**
 * Simple {@link Receiver} list wrapped class
 */
public class Receivers extends BaseModel {
    @SerializedName("receivers")
    List<Receiver> receiverList;

    public List<Receiver> getReceiverList() {
        return receiverList;
    }
}
