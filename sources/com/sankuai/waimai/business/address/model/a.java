package com.sankuai.waimai.business.address.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public double d;
    public double e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;

    public a(String str, String str2, double d, double d2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Object[] objArr = {str, str2, Double.valueOf(d), Double.valueOf(d2), str3, str4, str5, str6, str7, str8, str9};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76e172cd3110d1aa0f43a9dc75165564", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76e172cd3110d1aa0f43a9dc75165564");
            return;
        }
        this.b = "";
        this.c = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = d2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
    }
}
