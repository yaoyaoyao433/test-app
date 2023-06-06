package com.sankuai.waimai.foundation.core.utils;

import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public final b b;
    public Lock c;
    public final a d;
    private final Handler.Callback e;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b7236772bad7aa97187a43941be384d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b7236772bad7aa97187a43941be384d");
            return;
        }
        this.c = new ReentrantLock();
        this.d = new a(this.c, null);
        this.e = null;
        this.b = new b();
    }

    public f(@Nullable Handler.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a29367c2ccf88aa5c2c47ae70dd44f27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a29367c2ccf88aa5c2c47ae70dd44f27");
            return;
        }
        this.c = new ReentrantLock();
        this.d = new a(this.c, null);
        this.e = callback;
        this.b = new b(new WeakReference(callback));
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02c3a9970d4fea475ea76d043447604a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02c3a9970d4fea475ea76d043447604a");
            return;
        }
        c a2 = this.d.a(runnable);
        if (a2 != null) {
            this.b.removeCallbacks(a2);
        }
    }

    public final boolean a(int i, long j) {
        Object[] objArr = {1, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b65b668f6b8c6ae16d888cc2494e01", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b65b668f6b8c6ae16d888cc2494e01")).booleanValue() : this.b.sendEmptyMessageDelayed(1, j);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @Nullable
        public a b;
        @Nullable
        public a c;
        @NonNull
        public final Runnable d;
        @NonNull
        public final c e;
        @NonNull
        public Lock f;

        public a(@NonNull Lock lock, @NonNull Runnable runnable) {
            Object[] objArr = {lock, runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ce741eb35be5a7432f8fdc4289241bd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ce741eb35be5a7432f8fdc4289241bd");
                return;
            }
            this.d = runnable;
            this.f = lock;
            this.e = new c(new WeakReference(runnable), new WeakReference(this));
        }

        public final c a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d94a86bbc84fe8da575fb9c26b26b9e", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d94a86bbc84fe8da575fb9c26b26b9e");
            }
            this.f.lock();
            try {
                if (this.c != null) {
                    this.c.b = this.b;
                }
                if (this.b != null) {
                    this.b.c = this.c;
                }
                this.c = null;
                this.b = null;
                this.f.unlock();
                return this.e;
            } catch (Throwable th) {
                this.f.unlock();
                throw th;
            }
        }

        public final void a(@NonNull a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dce10e25a63e357b62734eb97c132d4f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dce10e25a63e357b62734eb97c132d4f");
                return;
            }
            this.f.lock();
            try {
                if (this.b != null) {
                    this.b.c = aVar;
                }
                aVar.b = this.b;
                this.b = aVar;
                aVar.c = this;
            } finally {
                this.f.unlock();
            }
        }

        @Nullable
        public final c a(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65387f7a380c6b3915033eddc1c37cfb", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65387f7a380c6b3915033eddc1c37cfb");
            }
            this.f.lock();
            try {
                for (a aVar = this.b; aVar != null; aVar = aVar.b) {
                    if (aVar.d == runnable) {
                        return aVar.a();
                    }
                }
                this.f.unlock();
                return null;
            } finally {
                this.f.unlock();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements Runnable {
        public static ChangeQuickRedirect a;
        private final WeakReference<Runnable> b;
        private final WeakReference<a> c;

        public c(WeakReference<Runnable> weakReference, WeakReference<a> weakReference2) {
            Object[] objArr = {weakReference, weakReference2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae80dda8f4065ec5d895c26cf2ccdae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae80dda8f4065ec5d895c26cf2ccdae");
                return;
            }
            this.b = weakReference;
            this.c = weakReference2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7948ab69ba09bfc66489b5097c45f86", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7948ab69ba09bfc66489b5097c45f86");
                return;
            }
            Runnable runnable = this.b.get();
            a aVar = this.c.get();
            if (aVar != null) {
                aVar.a();
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b extends Handler {
        public static ChangeQuickRedirect a;
        private final WeakReference<Handler.Callback> b;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e4fcc0aaeaba9e4c97d631c28240bdb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e4fcc0aaeaba9e4c97d631c28240bdb");
            } else {
                this.b = null;
            }
        }

        public b(WeakReference<Handler.Callback> weakReference) {
            Object[] objArr = {weakReference};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53758ac9ce13912e2c92c137ecf92443", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53758ac9ce13912e2c92c137ecf92443");
            } else {
                this.b = weakReference;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            Handler.Callback callback;
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c50bd99a3474d88a3e2bbf907720c246", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c50bd99a3474d88a3e2bbf907720c246");
            } else if (this.b == null || (callback = this.b.get()) == null) {
            } else {
                callback.handleMessage(message);
            }
        }
    }
}
