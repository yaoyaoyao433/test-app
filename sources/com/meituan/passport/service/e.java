package com.meituan.passport.service;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static volatile e g;
    public int b;
    public String c;
    public String d;
    public boolean e;
    private int f;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e688e4de59e99cf3cbc4d52150647cc0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e688e4de59e99cf3cbc4d52150647cc0");
            return;
        }
        this.b = -1;
        this.c = "";
        this.f = 0;
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7e6895cdf8783025d7b76683353d4f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7e6895cdf8783025d7b76683353d4f0");
        }
        if (g == null) {
            synchronized (e.class) {
                if (g == null) {
                    g = new e();
                }
            }
        }
        return g;
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e075f875992dc6315f169218a2ef87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e075f875992dc6315f169218a2ef87");
        } else if (this.e) {
        } else {
            this.f++;
            if (context == null || Thread.currentThread() != Looper.getMainLooper().getThread()) {
                return;
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    this.b = packageInfo.versionCode;
                    this.c = packageInfo.versionName;
                    this.d = context.getString(context.getApplicationInfo().labelRes);
                }
                this.e = true;
                Sniffer.normal("passport", "passport_exception", "success in" + this.f + "times");
            } catch (PackageManager.NameNotFoundException e) {
                Sniffer.smell("passport", "passport_exception", e.getClass().getSimpleName(), "", "");
            } catch (RuntimeException e2) {
                Sniffer.smell("passport", "passport_exception", e2.getClass().getSimpleName(), "", "");
            }
        }
    }
}
