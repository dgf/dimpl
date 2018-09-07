package org.aplatanao.dimpl.valid;

import org.aplatanao.dimpl.Context;

public class Application {

    private Context context;

    private ServiceA serviceA;

    private ServiceB serviceB;

    public Application(Context context, ServiceA serviceA, ServiceB serviceB) {
        this.context = context;
        this.serviceA = serviceA;
        this.serviceB = serviceB;
    }

    public String get(String key) {
        return serviceA.get(key).getValue();
    }

    public void set(String key, String value) {
        Context factory = context.createFactory();
        serviceA.add(factory.get(Entry.class).setKey(key).setValue(value));
    }

    public ServiceA getServiceA() {
        return serviceA;
    }

    public ServiceB getServiceB() {
        return serviceB;
    }
}