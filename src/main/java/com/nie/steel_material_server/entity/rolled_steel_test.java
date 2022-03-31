package com.nie.steel_material_server.entity;

import java.io.Serializable;

public class rolled_steel_test implements Serializable {
    private Long id;
    private float x31;
    private float x32;
    private float x33;
    private float x34;
    private float x35;
    private float x36;
    private float Rc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getX31() {
        return x31;
    }

    public void setX31(float x31) {
        this.x31 = x31;
    }

    public float getX32() {
        return x32;
    }

    public void setX32(float x32) {
        this.x32 = x32;
    }

    public float getX33() {
        return x33;
    }

    public void setX33(float x33) {
        this.x33 = x33;
    }

    public float getX34() {
        return x34;
    }

    public void setX34(float x34) {
        this.x34 = x34;
    }

    public float getX35() {
        return x35;
    }

    public void setX35(float x35) {
        this.x35 = x35;
    }

    public float getX36() {
        return x36;
    }

    public void setX36(float x36) {
        this.x36 = x36;
    }

    public float getRc() {
        return Rc;
    }

    public void setRc(float rc) {
        Rc = rc;
    }

    public String getString() {
        return this.id+","+this.Rc+","+this.x31+","+this.x32+","+this.x33+","+this.x34+","+this.x35+","+this.x36;
    }
}
