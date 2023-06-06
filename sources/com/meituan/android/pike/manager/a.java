package com.meituan.android.pike.manager;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    String c;
    short d;
    HashMap<String, String> e;
    public com.meituan.android.pike.a f;
    String g;
    int h;
    int i;
    int j;
    public int k;
    public int l;
    public int m;
    private String n;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.pike.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0344a {
        public static final a a = new a();
    }

    public final HashMap<String, String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e874d274dc633142585544eba37c27f", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e874d274dc633142585544eba37c27f") : this.e == null ? new HashMap<>() : this.e;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa1ed357baf29f206787ade42e929482", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa1ed357baf29f206787ade42e929482");
            return;
        }
        this.b = "";
        this.c = "unknown";
        this.n = "";
        this.f = com.meituan.android.pike.a.ENV_PROD;
        this.h = 1000;
        this.i = 60000;
        this.j = 30000;
        this.k = 3;
        this.l = 3;
        this.m = 30000;
    }

    public final int b() {
        int i = this.j;
        if (this.j <= this.h) {
            i = this.h;
        }
        return this.j >= this.i ? this.i : i;
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "670a25947be03f808ee1b513459f5cab", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "670a25947be03f808ee1b513459f5cab") : !TextUtils.isEmpty(this.g) ? this.g : (this.f == com.meituan.android.pike.a.ENV_PROD || this.f == com.meituan.android.pike.a.ENV_STAGING) ? "https://pike0.dianping.com" : "http://pike0-test.sankuai.com";
    }
}
