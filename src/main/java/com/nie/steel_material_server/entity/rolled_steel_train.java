package com.nie.steel_material_server.entity;

import java.io.Serializable;

public class rolled_steel_train implements Serializable {
    private Long id;
    private String x31;
    private String x32;
    private String x33;
    private String x34;
    private String x35;
    private String x36;
    private String Rc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getX31() {
        return x31;
    }

    public void setX31(String x31) {
        this.x31 = x31;
    }

    public String getX32() {
        return x32;
    }

    public void setX32(String x32) {
        this.x32 = x32;
    }

    public String getX33() {
        return x33;
    }

    public void setX33(String x33) {
        this.x33 = x33;
    }

    public String getX34() {
        return x34;
    }

    public void setX34(String x34) {
        this.x34 = x34;
    }

    public String getX35() {
        return x35;
    }

    public void setX35(String x35) {
        this.x35 = x35;
    }

    public String getX36() {
        return x36;
    }

    public void setX36(String x36) {
        this.x36 = x36;
    }

    public String getRc() {
        return Rc;
    }

    public void setRc(String rc) {
        Rc = rc;
    }
}
