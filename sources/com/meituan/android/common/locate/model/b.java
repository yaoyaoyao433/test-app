package com.meituan.android.common.locate.model;

import android.annotation.SuppressLint;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.locate.controller.e;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long a;
    public double b;
    public double c;
    public int d;
    public String e;
    public String f;
    public String g;
    public double h;

    /* loaded from: classes2.dex */
    public static class a extends b {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a(long j, double d, double d2, float f, String str) {
            super(j, d, d2, (int) f, JsBridgeResult.LOCATION_TYPE_WGS84, str);
            Object[] objArr = {new Long(j), Double.valueOf(d), Double.valueOf(d2), Float.valueOf(f), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c0318c61ebfa2b1258a19ecd4a29925", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c0318c61ebfa2b1258a19ecd4a29925");
            }
        }

        @Override // com.meituan.android.common.locate.model.b
        public boolean a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "287cb6cdeda474b409e118675853fc3c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "287cb6cdeda474b409e118675853fc3c")).booleanValue() : this.a - bVar.a >= ((long) e.a) * 1000;
        }
    }

    /* renamed from: com.meituan.android.common.locate.model.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0216b extends b {
        public static ChangeQuickRedirect changeQuickRedirect;

        public C0216b(long j, double d, double d2, float f) {
            super(j, d, d2, (int) f, JsBridgeResult.LOCATION_TYPE_WGS84, "gps");
            Object[] objArr = {new Long(j), Double.valueOf(d), Double.valueOf(d2), Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "513df40b48890e30a669be957829b3ab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "513df40b48890e30a669be957829b3ab");
            }
        }

        @Override // com.meituan.android.common.locate.model.b
        public boolean a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bfb78ae80fa547ce5a46dce579deb40", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bfb78ae80fa547ce5a46dce579deb40")).booleanValue() : this.a - bVar.a >= ((long) e.a) * 1000;
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends C0216b {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.android.common.locate.model.b.C0216b, com.meituan.android.common.locate.model.b
        public boolean a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae35655aac4d92171a163d0b73a934d3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae35655aac4d92171a163d0b73a934d3")).booleanValue() : com.meituan.android.common.locate.util.e.a(this, bVar) && LocationUtils.meterDistanceBetweenPoints(this.c, this.b, bVar.c, bVar.b) >= e.b;
        }
    }

    @SuppressLint({"DefaultLocale"})
    public b(long j, double d, double d2, int i, String str, String str2) {
        Object[] objArr = {new Long(j), Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a340291f39ecd86ec032523a8124c50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a340291f39ecd86ec032523a8124c50");
            return;
        }
        this.a = j;
        try {
            this.c = Double.parseDouble(String.format("%.6f", Double.valueOf(d)));
        } catch (Exception unused) {
            this.c = d;
        }
        try {
            this.b = Double.parseDouble(String.format("%.6f", Double.valueOf(d2)));
        } catch (Exception unused2) {
            this.b = d2;
        }
        this.d = i;
        this.e = str;
        this.f = str2;
    }

    public void a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "424cd5ebd3976745967b18d67f017c23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "424cd5ebd3976745967b18d67f017c23");
        } else {
            this.h = d;
        }
    }

    public boolean a(b bVar) {
        return false;
    }
}
