package com.dianping.live.live.mrn;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    com.sankuai.meituan.mtlive.player.library.c b;
    public String c;
    public boolean d;
    private com.sankuai.meituan.mtlive.player.library.d e;
    private int f;

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56f9547a35839f0b9777a9ff046018d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56f9547a35839f0b9777a9ff046018d1");
            return;
        }
        this.c = "";
        this.f = 0;
        this.b = com.sankuai.meituan.mtlive.player.library.f.a(context, 141374);
        this.d = false;
    }

    public final void a(com.sankuai.meituan.mtlive.player.library.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ce22dfd54b361bda952022e0e77d3a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ce22dfd54b361bda952022e0e77d3a2");
            return;
        }
        this.e = dVar;
        this.b.a(this.e);
    }

    public final void a(com.sankuai.meituan.mtlive.player.library.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ad606b9ecc5e0e609e696e11bb781f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ad606b9ecc5e0e609e696e11bb781f6");
        } else {
            this.b.a(bVar);
        }
    }

    public final void a(MLivePlayerView mLivePlayerView) {
        Object[] objArr = {mLivePlayerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b539d805f70ea419151210c12468674", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b539d805f70ea419151210c12468674");
        } else {
            this.b.a(mLivePlayerView);
        }
    }

    public final int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18a9bc86803eebcde64ba6719e54e5e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18a9bc86803eebcde64ba6719e54e5e8")).intValue();
        }
        this.c = str;
        return this.b.a(str, i);
    }

    public final int a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d4043fced366a8303980f7249abb2a0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d4043fced366a8303980f7249abb2a0")).intValue() : this.b.b(z);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f3d44802aaf1338c7f2bc3979972b71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f3d44802aaf1338c7f2bc3979972b71");
            return;
        }
        this.b.e();
        this.d = true;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abf7078f5101a40ad53acc9797436cbe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abf7078f5101a40ad53acc9797436cbe")).booleanValue() : this.b.b();
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f6545edd29f32a3d8e2b6d6d8dbc825", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f6545edd29f32a3d8e2b6d6d8dbc825");
        } else {
            this.b.c();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "225bdb5d48b7e1bd87c452e0ef9e0942", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "225bdb5d48b7e1bd87c452e0ef9e0942");
        } else {
            this.b.d();
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bde7ba1a923bc78f2a5838e9cad289bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bde7ba1a923bc78f2a5838e9cad289bf");
        } else {
            this.b.a(i);
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88acb788aeda2f3444fdb61f11dbfd16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88acb788aeda2f3444fdb61f11dbfd16");
        } else {
            this.b.b(i);
        }
    }

    public final boolean b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e37af8611e798750ebcf48ec65d1166d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e37af8611e798750ebcf48ec65d1166d")).booleanValue() : this.b.c(z);
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df74fbb15af3d5c9a578eab904e9a3ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df74fbb15af3d5c9a578eab904e9a3ed");
        } else if (this.b == null || this.d) {
        } else {
            this.b.d(z);
        }
    }
}
