package com.meituan.msc.lib.interfaces;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    public Activity h;
    public boolean i;
    public View j;

    public c(a aVar) {
        this.a = aVar.b;
        this.b = aVar.c;
        this.c = aVar.d;
        this.d = aVar.e;
        this.e = aVar.f;
        this.f = aVar.g;
        this.g = aVar.h;
        this.h = aVar.i;
        this.i = aVar.j;
        this.j = aVar.k;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        public int f;
        public String g;
        public String h;
        public Activity i;
        public boolean j;
        public View k;

        public a(String str, String str2, String str3) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5239a6a7c056737eab3639460e8db4ee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5239a6a7c056737eab3639460e8db4ee");
                return;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final c a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99e4c0cf24927f7e3addab047a3476cc", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99e4c0cf24927f7e3addab047a3476cc") : new c(this);
        }
    }
}
