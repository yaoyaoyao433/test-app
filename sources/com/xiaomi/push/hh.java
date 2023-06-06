package com.xiaomi.push;
/* loaded from: classes6.dex */
public enum hh {
    MISC_CONFIG(1),
    PLUGIN_CONFIG(2);
    
    public final int c;

    hh(int i) {
        this.c = i;
    }

    public static hh a(int i) {
        switch (i) {
            case 1:
                return MISC_CONFIG;
            case 2:
                return PLUGIN_CONFIG;
            default:
                return null;
        }
    }
}
