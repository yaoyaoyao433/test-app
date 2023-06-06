package com.meituan.met.mercury.load.report;

import android.text.TextUtils;
import com.meituan.met.mercury.load.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e {
    public static ChangeQuickRedirect a;
    private static volatile e c;
    private ThreadPoolExecutor b;
    private Random d;
    private Random e;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aabf18c706448f1718a038033616195", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aabf18c706448f1718a038033616195");
            return;
        }
        this.b = g.a("DDReporter", 1, 2, 10L, TimeUnit.SECONDS, new PriorityBlockingQueue());
        if (this.d == null) {
            this.d = new Random();
        }
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f601cf5ba15a3dfc5078d41b308d947d", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f601cf5ba15a3dfc5078d41b308d947d");
        }
        if (c == null) {
            synchronized (e.class) {
                if (c == null) {
                    c = new e();
                }
            }
        }
        return c;
    }

    private boolean a(String str) {
        int nextDouble;
        int nextDouble2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dde5a3635e1b025ddcae8e0e66de62f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dde5a3635e1b025ddcae8e0e66de62f")).booleanValue();
        }
        if (TextUtils.equals("DDDBundleVisit", str)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7dcbf51fc70f0db33966d54739571bd", RobustBitConfig.DEFAULT_VALUE)) {
                nextDouble2 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7dcbf51fc70f0db33966d54739571bd")).intValue();
            } else {
                if (this.d == null) {
                    this.d = new Random();
                }
                nextDouble2 = (int) (this.d.nextDouble() * 100.0d);
            }
            return nextDouble2 < com.meituan.met.mercury.load.core.c.g;
        } else if (TextUtils.equals("DDDBundleClear", str)) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca2322b8ecdbf9166a9622e38a4649ee", RobustBitConfig.DEFAULT_VALUE)) {
                nextDouble = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca2322b8ecdbf9166a9622e38a4649ee")).intValue();
            } else {
                if (this.e == null) {
                    this.e = new Random();
                }
                nextDouble = (int) (this.e.nextDouble() * 100.0d);
            }
            return nextDouble < com.meituan.met.mercury.load.core.c.h;
        } else {
            return true;
        }
    }

    public final void a(String str, String str2, String str3, String str4, Float f, Map<String, String> map) {
        Object[] objArr = {str, str2, str3, str4, f, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7282ed81d7f8b75b6210eaeb2f429fa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7282ed81d7f8b75b6210eaeb2f429fa3");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str4) || f == null || !com.meituan.met.mercury.load.core.c.f || !a(str4)) {
        } else {
            b bVar = new b(str, str2, str3, str4, f, map);
            if (this.b != null) {
                this.b.execute(bVar);
            }
        }
    }
}
