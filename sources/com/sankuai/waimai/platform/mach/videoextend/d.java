package com.sankuai.waimai.platform.mach.videoextend;

import android.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public boolean b;
    b c;
    VideoView d;
    public int e;
    private boolean f;
    private boolean g;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0cf14a7b4c14fbe726c067783102d9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0cf14a7b4c14fbe726c067783102d9c");
            return;
        }
        this.e = -1;
        this.f = false;
        this.g = false;
    }

    public final boolean a() {
        return this.b && this.d != null;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7016993a4b9981e617d48fa4f3f6b6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7016993a4b9981e617d48fa4f3f6b6c");
        } else if (this.d != null) {
            this.d.d();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4094882606592c920a49c9f1bb99ac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4094882606592c920a49c9f1bb99ac9");
        } else if (this.d != null) {
            this.d.e();
            this.d = null;
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e03217bfbe9f93a86cd5b9d4d9a105ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e03217bfbe9f93a86cd5b9d4d9a105ea");
        } else if (this.d != null) {
            this.d.b();
            this.f = false;
            this.g = true;
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbae9fd5d870369047a6f4d201f17d86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbae9fd5d870369047a6f4d201f17d86");
        } else if (this.d != null) {
            this.d.c();
        }
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f18af16cc39099634fe07d62cc954e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f18af16cc39099634fe07d62cc954e2")).booleanValue();
        }
        if (this.d != null) {
            return this.d.b;
        }
        return false;
    }

    public final b g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "758446d65f189f7e80d5f522b2dca0af", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "758446d65f189f7e80d5f522b2dca0af") : this.c != null ? this.c : new b();
    }

    public final int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "527ccd01f706278da2080f1003824225", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "527ccd01f706278da2080f1003824225")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.getVideoPlayTime();
    }

    private int i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5a00562c021f48ed2c95694a4a74a05", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5a00562c021f48ed2c95694a4a74a05")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.getVideoPlayStatus();
    }

    private int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6a70759d94cea275e72bf34812f02f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6a70759d94cea275e72bf34812f02f0")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.getLoadNetState();
    }

    public final void a(String str, ArrayMap<String, Long> arrayMap) {
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "257bc4ac4f10b793da21f8a882ca9988", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "257bc4ac4f10b793da21f8a882ca9988");
        } else if (!a() || g() == null || aa.a(g().c) || this.f) {
        } else {
            this.f = true;
            JudasManualManager.b(g().c).a(str).a("ad_video_time", h()).a("ad_video_status", i()).a("ad_video_parm", this.e).a("net_type_load", j()).a("ad_video_id", g().g).a("poi_id", g().f).a();
        }
    }
}
