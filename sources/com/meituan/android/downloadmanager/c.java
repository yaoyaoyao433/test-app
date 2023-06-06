package com.meituan.android.downloadmanager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static Object b = new Object();
    private static b c = null;

    public static b a() {
        b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70b74d6472bb7722e23672c110b8f43e", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70b74d6472bb7722e23672c110b8f43e");
        }
        synchronized (b) {
            if (c == null) {
                c = new b();
            }
            bVar = c;
        }
        return bVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        private a b;
        private int c;
        private int d;

        private b(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e0acb4fb4c7735a4820081f9d91df74", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e0acb4fb4c7735a4820081f9d91df74");
                return;
            }
            this.c = i;
            this.d = i2;
        }

        public final synchronized void a(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f10d671c1d2f1d76394e0e5437dbe3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f10d671c1d2f1d76394e0e5437dbe3");
            } else if (runnable == null) {
            } else {
                if (this.b == null || this.b.isShutdown()) {
                    this.b = new a(this.c, this.d);
                }
                this.b.execute(runnable);
            }
        }

        public final synchronized void cancel(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "328e5555d880e14e93ecf3ed423cc573", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "328e5555d880e14e93ecf3ed423cc573");
                return;
            }
            if (this.b != null && (!this.b.isShutdown() || this.b.isTerminating())) {
                this.b.getQueue().remove(runnable);
            }
        }

        public final synchronized boolean b(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "100a61b12dc2c770dec5da18e692ce36", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "100a61b12dc2c770dec5da18e692ce36")).booleanValue();
            } else if (this.b == null || (this.b.isShutdown() && !this.b.isTerminating())) {
                return false;
            } else {
                if (!this.b.getQueue().contains(runnable)) {
                    a aVar = this.b;
                    Object[] objArr2 = {runnable};
                    ChangeQuickRedirect changeQuickRedirect2 = a.a;
                    if (!(PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f4b95bd07ab9b99f0733b9722f9ea9c6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f4b95bd07ab9b99f0733b9722f9ea9c6")).booleanValue() : aVar.b.contains(runnable))) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a extends com.sankuai.android.jarvis.a {
        public static ChangeQuickRedirect a;
        List<Runnable> b;

        public a(int i, int i2) {
            super("DownloadManager-download", i, i2, 1000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.AbortPolicy());
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c24ecaa2dd58aee17db39fbfaa37d7c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c24ecaa2dd58aee17db39fbfaa37d7c");
            } else {
                this.b = new ArrayList();
            }
        }

        @Override // com.sankuai.android.jarvis.a, java.util.concurrent.ThreadPoolExecutor
        public final void beforeExecute(Thread thread, Runnable runnable) {
            Object[] objArr = {thread, runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1640f87e29562a65d01e0bf8453a5aa3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1640f87e29562a65d01e0bf8453a5aa3");
            } else {
                this.b.add(runnable);
            }
        }

        @Override // com.sankuai.android.jarvis.a, java.util.concurrent.ThreadPoolExecutor
        public final void afterExecute(Runnable runnable, Throwable th) {
            Object[] objArr = {runnable, th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7a834a2407f51ad94f836f8e63a6b84", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7a834a2407f51ad94f836f8e63a6b84");
            } else {
                this.b.remove(runnable);
            }
        }
    }
}
