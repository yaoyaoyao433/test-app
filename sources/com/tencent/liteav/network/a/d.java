package com.tencent.liteav.network.a;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static final d a = new d(a.NO_NETWORK, 0);
    public static final d b = new d(a.WIFI, 0);
    public final int c;
    public final a d;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum a {
        NO_NETWORK,
        WIFI,
        MOBILE
    }

    public d(a aVar, int i) {
        this.d = aVar;
        this.c = i;
    }
}
