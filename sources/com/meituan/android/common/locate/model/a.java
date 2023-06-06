package com.meituan.android.common.locate.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private long h;
    private long i;
    private String j;
    private String k;
    private String l;
    private String m;
    private boolean n;

    public a() {
    }

    public a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "529723e4021c677ffd2dd80a62c52d4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "529723e4021c677ffd2dd80a62c52d4b");
            return;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.a = "country: " + str + "province: " + str2 + "district: " + str4 + "city: " + str3;
    }

    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84d186cfa2c616599843c7b46e7243e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84d186cfa2c616599843c7b46e7243e2");
        } else {
            this.h = j;
        }
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(boolean z) {
        this.n = z;
    }

    public boolean a() {
        return this.n;
    }

    public String b() {
        return this.a;
    }

    public void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa19e4f5343c7ddf03a11f479aa89905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa19e4f5343c7ddf03a11f479aa89905");
        } else {
            this.i = j;
        }
    }

    public void b(String str) {
        this.b = str;
    }

    public String c() {
        return this.b;
    }

    public void c(String str) {
        this.c = str;
    }

    public String d() {
        return this.c;
    }

    public void d(String str) {
        this.d = str;
    }

    public String e() {
        return this.d;
    }

    public void e(String str) {
        this.e = str;
    }

    public String f() {
        return this.e;
    }

    public void f(String str) {
        this.f = str;
    }

    public String g() {
        return this.f;
    }

    public void g(String str) {
        this.g = str;
    }

    public String h() {
        return this.g;
    }

    public void h(String str) {
        this.j = str;
    }

    public long i() {
        return this.h;
    }

    public void i(String str) {
        this.k = str;
    }

    public long j() {
        return this.i;
    }

    public void j(String str) {
        this.l = str;
    }

    public String k() {
        return this.j;
    }

    public void k(String str) {
        this.m = str;
    }

    public String l() {
        return this.k;
    }

    public String m() {
        return this.l;
    }

    public String n() {
        return this.m;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d8176ddda2a3706098470350f0913eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d8176ddda2a3706098470350f0913eb");
        }
        return "GeoCoderInfo{info='" + this.a + "', country='" + this.b + "', province='" + this.c + "', city='" + this.d + "', district='" + this.e + "', detail='" + this.f + "', adcode='" + this.g + "', mtCityID=" + this.h + ", dpCityID=" + this.i + ", townCode='" + this.j + "', townShip='" + this.k + "', dpName='" + this.l + "', openCityStr='" + this.m + "'}";
    }
}
