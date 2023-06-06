package com.meituan.android.common.aidata.utils;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ScidManager {
    private static final int INIT_VALUE = -1;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int scid = -1;

    public static synchronized int getSeq() {
        int i;
        synchronized (ScidManager.class) {
            if (scid < Integer.MAX_VALUE) {
                scid++;
            } else {
                scid = 0;
            }
            i = scid;
        }
        return i;
    }

    public static synchronized void reset() {
        synchronized (ScidManager.class) {
            scid = -1;
        }
    }
}
