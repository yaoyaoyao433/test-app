package com.squareup.picasso;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);
    
    final int c;

    public static boolean a(int i) {
        return (i & NO_CACHE.c) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(int i) {
        return (i & NO_STORE.c) == 0;
    }

    MemoryPolicy(int i) {
        this.c = i;
    }
}
