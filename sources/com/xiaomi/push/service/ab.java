package com.xiaomi.push.service;

import com.xiaomi.push.hh;
import com.xiaomi.push.hi;
/* loaded from: classes6.dex */
public final /* synthetic */ class ab {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b = new int[hi.values().length];

    static {
        try {
            b[hi.INT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[hi.LONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[hi.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[hi.BOOLEAN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = new int[hh.values().length];
        try {
            a[hh.MISC_CONFIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[hh.PLUGIN_CONFIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
