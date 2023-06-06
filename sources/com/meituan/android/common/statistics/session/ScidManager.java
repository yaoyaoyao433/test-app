package com.meituan.android.common.statistics.session;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ScidManager {
    private static final int INIT_VALUE = -1;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int qseq = -1;
    private static int scid = -1;

    public static synchronized int getScid() {
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

    public static synchronized int getQseq() {
        int i;
        synchronized (ScidManager.class) {
            if (qseq < Integer.MAX_VALUE) {
                qseq++;
            } else {
                qseq = 0;
            }
            i = qseq;
        }
        return i;
    }

    public static synchronized void reset() {
        synchronized (ScidManager.class) {
            scid = -1;
            qseq = -1;
        }
    }

    public static synchronized void setScid(int i) {
        synchronized (ScidManager.class) {
            scid = i;
        }
    }

    public static synchronized int getCurrentScid() {
        int i;
        synchronized (ScidManager.class) {
            i = scid;
        }
        return i;
    }
}
