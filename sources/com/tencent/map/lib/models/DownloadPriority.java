package com.tencent.map.lib.models;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum DownloadPriority {
    NONE(-1),
    HIGH(0),
    MIDDLE(1),
    LOW(2);
    
    private final int mValue;

    DownloadPriority(int i) {
        this.mValue = i;
    }

    public static DownloadPriority get(int i) {
        DownloadPriority[] values;
        for (DownloadPriority downloadPriority : values()) {
            if (downloadPriority.mValue == i) {
                return downloadPriority;
            }
        }
        return NONE;
    }

    public static int getThreadPriority(int i) {
        switch (get(i)) {
            case HIGH:
                return 10;
            case LOW:
                return 1;
            case MIDDLE:
                return 5;
            default:
                return 5;
        }
    }

    public final int getValue() {
        return this.mValue;
    }
}
