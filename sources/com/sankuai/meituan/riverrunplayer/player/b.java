package com.sankuai.meituan.riverrunplayer.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtliveqos.common.c;
import com.sankuai.meituan.riverrunplayer.player.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b implements c {
    public static ChangeQuickRedirect a = null;
    private static final String q = "b";
    public float b;
    public d c;
    public com.sankuai.meituan.riverrunplayer.views.b d;
    AudioManager e;
    h f;
    c.d g;
    AudioManager.OnAudioFocusChangeListener h;
    int i;
    int j;
    int k;
    int l;
    SurfaceTexture m;
    boolean n;
    public Surface o;
    int p;
    private Context r;
    private final BroadcastReceiver s;
    private c.b t;
    private c.a u;
    private c.InterfaceC0639c v;
    private boolean w;
    private boolean x;

    public abstract void a(Surface surface);

    public boolean a(String str) {
        return false;
    }

    public boolean a(String str, int i) {
        return false;
    }

    public abstract void b();

    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32de5bf1eeab027c94b5c2a1e9f9b516", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32de5bf1eeab027c94b5c2a1e9f9b516");
        }
    }

    public abstract void d();

    public abstract void f();

    public abstract void j();

    public abstract void k();

    public static /* synthetic */ String a(b bVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "75dfa2cfebdb619f6c62dd0a40e614fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "75dfa2cfebdb619f6c62dd0a40e614fd");
        }
        switch (i) {
            case -1:
                return "unknown";
            case 0:
                return "wifi";
            case 1:
            default:
                return "";
            case 2:
                return "2G";
            case 3:
                return "3G";
            case 4:
                return "4G";
        }
    }

    public static /* synthetic */ void e(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "8f76d65ffcb50e2de01d7ade89f3a618", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "8f76d65ffcb50e2de01d7ade89f3a618");
            return;
        }
        bVar.b("refreshSurface mSurfaceTexture: " + bVar.m);
        if (bVar.d != null) {
            com.sankuai.meituan.riverrunplayer.views.b bVar2 = bVar.d;
            SurfaceTexture surfaceTexture = bVar.m;
            Object[] objArr2 = {surfaceTexture};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.riverrunplayer.views.b.a;
            if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "01f9df086dc7ca5eb277cda587033e33", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "01f9df086dc7ca5eb277cda587033e33")).booleanValue();
            } else {
                bVar2.b.a(surfaceTexture);
            }
        }
    }

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f26f02257d5187492a40e09014fe054", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f26f02257d5187492a40e09014fe054");
            return;
        }
        this.b = 1.0f;
        this.s = new BroadcastReceiver() { // from class: com.sankuai.meituan.riverrunplayer.player.BaseRiverRunPlayer$1
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Context context3;
                Object[] objArr2 = {context2, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6cd1da8de2dea109c32a01e50f074cb4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6cd1da8de2dea109c32a01e50f074cb4");
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    context3 = b.this.r;
                    String a2 = b.a(b.this, com.sankuai.meituan.mtliveqos.utils.network.a.a(context3));
                    if (TextUtils.isEmpty(a2)) {
                        b.this.b("onNetworkChanged no active network");
                        return;
                    }
                    b bVar = b.this;
                    bVar.b("onNetworkChanged active network: " + a2);
                }
            }
        };
        this.r = context.getApplicationContext();
        if (!this.x) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.r.registerReceiver(this.s, intentFilter);
            this.x = true;
        }
        this.f = new h();
        this.c = new d();
        this.e = (AudioManager) this.r.getSystemService("audio");
        this.h = new AudioManager.OnAudioFocusChangeListener() { // from class: com.sankuai.meituan.riverrunplayer.player.b.1
            public static ChangeQuickRedirect a;

            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2d67a1ea73572c30700334d8a4a60d3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2d67a1ea73572c30700334d8a4a60d3");
                    return;
                }
                String unused = b.q;
                new StringBuilder("onAudioFocusChange focusChange: ").append(i);
                if (i == 1) {
                    if (b.this.w) {
                        b.this.w = false;
                        if (b.this.c.b == 4) {
                            b.this.g();
                            return;
                        }
                        return;
                    }
                    return;
                }
                switch (i) {
                    case -3:
                    case -2:
                        if (b.this.h()) {
                            b.this.w = true;
                            b.this.e();
                            return;
                        }
                        return;
                    case -1:
                        b.this.c();
                        return;
                    default:
                        return;
                }
            }
        };
    }

    public boolean a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f66d127f12b835bf4489b89d55b35889", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f66d127f12b835bf4489b89d55b35889")).booleanValue();
        }
        b("onError what: " + i + " , extra: " + i2);
        this.c.a(-1, -1);
        b(-1);
        a(false);
        l();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SurfaceTexture surfaceTexture) {
        Object[] objArr = {surfaceTexture};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2e12e1fa66c05400bd5ab773bdf4bd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2e12e1fa66c05400bd5ab773bdf4bd9");
            return;
        }
        b("surfaceTexture: " + surfaceTexture);
        this.o = new Surface(surfaceTexture);
        a(this.o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c6908cde042d1ff0d2575406c3994ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c6908cde042d1ff0d2575406c3994ff");
        } else if (this.c.b()) {
            n();
            this.c.c = 3;
        }
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a67af6268941c230b4ed1d98c0d88f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a67af6268941c230b4ed1d98c0d88f4");
            return;
        }
        b(3);
        this.c.b = 3;
        a(true);
        b();
    }

    public void c() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "850d7efa000b4b54080fa689e0cd2896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "850d7efa000b4b54080fa689e0cd2896");
            return;
        }
        b("stopPlay");
        a(false);
        this.c.b = 5;
        b(5);
        d();
        o();
        if (this.f.b) {
            this.e.abandonAudioFocus(this.h);
        }
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65bb7f8b4432229b38aec0a968eff9f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65bb7f8b4432229b38aec0a968eff9f0");
        } else if (this.o != null) {
            this.o.release();
            this.o = null;
        }
    }

    public void e() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0672f64e0888d20c068fc17fd53c2f0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0672f64e0888d20c068fc17fd53c2f0f");
            return;
        }
        b("pause");
        if (this.c.a()) {
            b(4);
            this.c.b = 4;
            a(false);
            f();
        }
        this.c.c = 4;
    }

    public void g() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "668bf05f0a4b3060cd1ebb581a61778b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "668bf05f0a4b3060cd1ebb581a61778b");
            return;
        }
        b("resume");
        if (this.c.a()) {
            b(3);
            this.c.b = 3;
            a(true);
            b();
        }
        this.c.c = 3;
    }

    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70093c70aff2f31d2e1282e582916365", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70093c70aff2f31d2e1282e582916365")).booleanValue();
        }
        switch (this.c.b) {
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public void i() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7d6269d5d88d62d2f8130b8dc4a01d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7d6269d5d88d62d2f8130b8dc4a01d3");
            return;
        }
        b("release ");
        this.v = null;
        this.t = null;
        this.u = null;
        this.g = null;
        if (this.d != null) {
            this.d.setRenderCallback(null);
        }
        d();
        j();
        o();
        if (this.m != null) {
            this.m.release();
            this.m = null;
        }
        this.c.a(0, 0);
        a(false);
        if (this.x) {
            this.r.unregisterReceiver(this.s);
            this.x = false;
        }
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9c94708c7350e0183e4aebb069a961", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9c94708c7350e0183e4aebb069a961");
            return;
        }
        b("reset");
        b(0);
        this.c.a(0, 0);
        k();
    }

    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "268608557b5d50ff10c137c949624ed9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "268608557b5d50ff10c137c949624ed9")).booleanValue();
        }
        b("setRenderMode: " + i);
        if (this.d == null) {
            b("unable to setRenderMode when playerView is null");
            return false;
        }
        this.p = i;
        this.d.getRenderView().setAspectRatio(i);
        return true;
    }

    public final void a(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "611e368049d12a6780140df9e63db47a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "611e368049d12a6780140df9e63db47a");
            return;
        }
        b("updateSurfaceScreenOn isScreenOnWhilePlaying: " + this.n + ", stayAwake: " + z);
        if (this.d != null) {
            this.d.setKeepScreenOn((this.n && z) ? false : false);
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e46d1781e334075182e143f9a305353d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e46d1781e334075182e143f9a305353d");
            return;
        }
        b("notifyPlayStateChanged: " + i);
        if (this.g != null) {
            this.g.a(i);
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6662729e25da2ebae340e11b865e07a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6662729e25da2ebae340e11b865e07a");
            return;
        }
        StringBuilder sb = new StringBuilder("reportEvent2Es eventKey: ");
        sb.append(str);
        sb.append(" ,eventValue: ");
        sb.append(str2);
        com.sankuai.meituan.mtliveqos.statistic.b bVar = new com.sankuai.meituan.mtliveqos.statistic.b();
        bVar.d = c.f.PLAY;
        bVar.e = c.g.RIVER_RUN;
        bVar.f = true;
        com.sankuai.meituan.mtliveqos.c.a(this.r, bVar, str, str2);
    }
}
