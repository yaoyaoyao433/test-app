package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import com.sankuai.xm.monitor.report.db.TraceBean;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class rq extends JsonComposer {
    private static final String i = "default";
    private static final int k = 0;
    private static final int l = 1;
    @Json(name = "logo_night")
    public String e;
    @Json(ignore = true)
    public Bitmap f;
    @Json(ignore = true)
    public Bitmap g;
    public boolean h;
    @Json(name = TraceBean.RULE)
    public int a = 0;
    @Json(name = "priority")
    private int j = 0;
    @Json(name = "frontier")
    public String b = "default";
    @Json(name = "logo_name")
    public String c = "";
    @Json(name = "logo")
    public String d = "";

    public final int a() {
        return (this.a * 10) + this.j;
    }

    public final boolean a(ft ftVar) {
        boolean b;
        switch (this.a) {
            case 0:
                b = b(ftVar);
                break;
            case 1:
                b = c(ftVar);
                break;
            default:
                b = false;
                break;
        }
        return this.h ? !b : b;
    }

    private boolean b() {
        return this.h;
    }

    private void c() {
        this.h = true;
    }

    private void d() {
        this.a = 1;
    }

    private void a(int i2) {
        this.j = i2;
    }

    private void a(String str) {
        this.b = str;
    }

    private void b(String str) {
        this.c = str;
    }

    private void c(String str) {
        this.d = str;
    }

    private void d(String str) {
        this.e = str;
    }

    private String e() {
        return this.c;
    }

    private String f() {
        return this.d;
    }

    private String g() {
        return this.e;
    }

    public final Bitmap a(boolean z) {
        return z ? this.g : this.f;
    }

    private void a(Bitmap bitmap) {
        this.f = bitmap;
    }

    private void b(Bitmap bitmap) {
        this.g = bitmap;
    }

    private boolean b(ft ftVar) {
        if ("default".equals(this.b)) {
            return true;
        }
        if (ftVar == null) {
            return false;
        }
        fu fuVar = ftVar.a;
        rj.a();
        return rj.a(fuVar, rj.c(this.b));
    }

    private boolean c(ft ftVar) {
        if ("default".equals(this.b)) {
            return true;
        }
        if (ftVar == null) {
            return false;
        }
        rj.a();
        fu[] c = rj.c(this.b);
        fu[] fuVarArr = ftVar.b;
        if (fuVarArr == null || c == null) {
            return true;
        }
        return rj.a(fuVarArr, c);
    }
}
