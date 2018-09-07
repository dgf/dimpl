package org.aplatanao.dimpl.valid;

import org.aplatanao.dimpl.Context;

import java.util.HashMap;

public class Storage extends HashMap<String, Entry> {

    private Context context;

    public Storage(Context context) {
        super();
        this.context = context;
    }

    public Context getContext() {
        return context;
    }
}