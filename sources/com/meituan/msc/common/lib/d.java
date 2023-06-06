package com.meituan.msc.common.lib;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public View f;
    public c g;
    public int h;
    public Activity i;

    public d(a aVar) {
        this.a = aVar.b;
        this.b = aVar.c;
        this.c = aVar.d;
        this.d = aVar.e;
        this.e = aVar.f;
        this.f = aVar.g;
        this.g = aVar.h;
        this.i = aVar.j;
        this.h = aVar.i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public View g;
        public c h;
        public int i;
        public Activity j;

        public final d a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2136277bde43243457df3ab87296072", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2136277bde43243457df3ab87296072") : new d(this);
        }
    }
}
