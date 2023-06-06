package com.google.archivepatcher.shared;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        DEFAULT_DEFLATE((byte) 0);
        
        public final byte b = 0;

        a(byte b) {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum b {
        BSDIFF((byte) 0);
        
        public final byte b = 0;

        b(byte b) {
        }

        public static b a(byte b) {
            if (b != 0) {
                return null;
            }
            return BSDIFF;
        }
    }
}
