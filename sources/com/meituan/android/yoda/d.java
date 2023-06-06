package com.meituan.android.yoda;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements com.meituan.android.yoda.config.ui.b {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public String d;
    public int e;
    private int f;
    private JSONObject g;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5182081ec71c688db4a841d10f388ae5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5182081ec71c688db4a841d10f388ae5");
            return;
        }
        this.f = 1;
        this.b = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.g = new JSONObject();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1dfe7bc8385f7d3255e06f48485eb35", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1dfe7bc8385f7d3255e06f48485eb35") : new d();
    }

    @Override // com.meituan.android.yoda.config.ui.b
    public final int b() {
        return this.b;
    }

    @Override // com.meituan.android.yoda.config.ui.b
    public final String c() {
        return this.c;
    }

    public final d a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.g = jSONObject;
        }
        return this;
    }

    @Override // com.meituan.android.yoda.config.ui.b
    public final JSONObject d() {
        return this.g;
    }

    @Override // com.meituan.android.yoda.config.ui.b
    public final String e() {
        return this.d;
    }

    @Override // com.meituan.android.yoda.config.ui.b
    public final int f() {
        return this.e;
    }
}
