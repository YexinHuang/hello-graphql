package com.yh.domain;

import javax.xml.bind.annotation.*;

/**
 * Created by yhuang on 11/21/16.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "message"
})
@XmlRootElement(name = "ImportResponse")
public class TestObject {
    public TestObject() {
        // do nothing
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @XmlElement(required = true)
    private String message = "Hello World!!";


}
