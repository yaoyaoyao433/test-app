package com.meituan.android.mrn.router;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public Uri b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public String i;
    public boolean j;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    public String o;
    private boolean p;
    private boolean q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;

    public d(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70956a26a7dd243dbf115a179fbe8f1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70956a26a7dd243dbf115a179fbe8f1d");
            return;
        }
        this.b = uri;
        Object[] objArr2 = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d59ef1b32281a77589212fa07ac4295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d59ef1b32281a77589212fa07ac4295");
            return;
        }
        this.c = uri.getQueryParameter("mrn_biz");
        this.d = uri.getQueryParameter("mrn_entry");
        this.e = uri.getQueryParameter("mrn_component");
        this.f = uri.getQueryParameter("mrn_title");
        this.g = uri.getBooleanQueryParameter("mrn_hideNavigationBar", true);
        this.h = uri.getBooleanQueryParameter("mrn_translucent", false);
        this.p = uri.getBooleanQueryParameter("mrn_blockLoad", false);
        this.q = uri.getBooleanQueryParameter("mrn_force", false);
        this.j = uri.getBooleanQueryParameter("mrn_debug", false);
        this.k = uri.getQueryParameter("mrn_debug_server");
        this.i = String.format(Locale.ENGLISH, "%s_%s_%s", "rn", this.c, this.d);
        this.l = uri.getQueryParameter("mrn_skeleton");
        this.m = uri.getBooleanQueryParameter("mrn_disable_skeleton_animation", false);
        this.n = uri.getBooleanQueryParameter("mrn_disable_skeleton_gone_animation", false);
        this.r = uri.getQueryParameter("mrn_min_version");
        this.s = uri.getQueryParameter("mrn_version");
        this.t = uri.getQueryParameter("mrn_bundle_server");
        this.u = uri.getQueryParameter("mrn_box");
        this.v = uri.getQueryParameter("mrn_box_data");
        this.w = uri.getQueryParameter("mrn_box_data_key");
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4a7458d7a004df50bd97d82db6ab29e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4a7458d7a004df50bd97d82db6ab29e")).booleanValue() : (TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.c)) ? false : true;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final boolean e() {
        return this.q || this.p;
    }

    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8d8fcd7e856498a5909c64b5a879ed5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8d8fcd7e856498a5909c64b5a879ed5");
        }
        if (com.meituan.android.mrn.utils.e.a(this.r, this.o) >= 0) {
            return this.r;
        }
        return this.o;
    }

    public final String g() {
        return this.i;
    }
}
