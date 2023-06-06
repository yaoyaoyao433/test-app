package com.meituan.android.yoda.monitor;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.meituan.android.yoda.monitor.a {
    public static ChangeQuickRedirect a;
    private final String b;
    private String c;
    private boolean d;
    private a e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a {
        public static ChangeQuickRedirect a;
        String b;
        boolean c;
        int d;

        public a() {
            a();
        }

        void a() {
            this.b = null;
            this.c = true;
        }

        boolean a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b00640291d451415754a830be217d864", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b00640291d451415754a830be217d864")).booleanValue() : (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(str) || !str.equals(this.b)) ? false : true;
        }
    }

    public b(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30f16c64154495ce8281fb47b5ebb54a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30f16c64154495ce8281fb47b5ebb54a");
            return;
        }
        this.b = "PageLoadMonitor";
        this.c = str;
        this.d = z;
        this.e = new a();
    }

    @Override // com.meituan.android.yoda.monitor.a
    public final synchronized void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7821f1a7f4b9cf1240c47c48a23c5401", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7821f1a7f4b9cf1240c47c48a23c5401");
            return;
        }
        this.e.b = str2;
        com.meituan.android.yoda.monitor.report.b.a(str, 0L, 0, this.c);
        if (this.d) {
            com.meituan.android.yoda.monitor.report.b.a("yoda_mtsi_launch", 0L, 0, this.c);
        }
    }

    @Override // com.meituan.android.yoda.monitor.a
    public final synchronized void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb4efd87a049fda529b437dc3fb0669", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb4efd87a049fda529b437dc3fb0669");
        } else if (this.e.a(str2)) {
            if (this.e.c) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac2061ec992f86f8ff9a95a914f9fd96", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac2061ec992f86f8ff9a95a914f9fd96");
                } else {
                    com.meituan.android.yoda.monitor.report.b.a("yoda_page_launch_status", 700, 0L, 0, this.c);
                    com.meituan.android.yoda.monitor.report.b.a(str, 700, 0L, 0, this.c);
                    if (this.d) {
                        com.meituan.android.yoda.monitor.report.b.a("yoda_mtsi_launch_status", 700, 0L, 0, this.c);
                    }
                    com.meituan.android.yoda.monitor.log.a.a("PageLoadMonitor", "reportLoadSuccess, api = " + str, true);
                }
            } else {
                int i = this.e.d;
                Object[] objArr3 = {str, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "60eb5ff6cc19ad34e50179da9470953a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "60eb5ff6cc19ad34e50179da9470953a");
                } else {
                    com.meituan.android.yoda.monitor.report.b.a(str, i, 0L, 0, this.c);
                    com.meituan.android.yoda.monitor.log.a.a("PageLoadMonitor", "reportLoadFail, api = " + str + ", errorCode = " + i, true);
                }
            }
            this.e.a();
        }
    }

    @Override // com.meituan.android.yoda.monitor.a
    public final synchronized void a(String str, String str2, boolean z, int i, String str3) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c4be198cd4e706dc76bcd4e7105f954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c4be198cd4e706dc76bcd4e7105f954");
        } else if (this.e.a(str2)) {
            if (z) {
                a aVar = this.e;
                aVar.c = false;
                aVar.d = i;
            }
        }
    }
}
