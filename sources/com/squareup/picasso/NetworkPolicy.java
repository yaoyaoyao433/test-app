package com.squareup.picasso;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    final int d;

    public static boolean a(int i) {
        return (i & OFFLINE.d) != 0;
    }

    NetworkPolicy(int i) {
        this.d = i;
    }
}
