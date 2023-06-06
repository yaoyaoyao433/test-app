package com.meituan.msc.jse.common.futures;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SimpleSettableFuture<T> implements Future<T> {
    public static ChangeQuickRedirect a;
    public final CountDownLatch b;
    @Nullable
    public Exception c;
    @Nullable
    private T d;

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    public SimpleSettableFuture() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b06c63f24f5afe0d25f5eadbb64a16e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b06c63f24f5afe0d25f5eadbb64a16e2");
        } else {
            this.b = new CountDownLatch(1);
        }
    }

    public final void a(@Nullable T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24921c631f647f623d88304f2b48a31d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24921c631f647f623d88304f2b48a31d");
            return;
        }
        b();
        this.d = t;
        this.b.countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eaded1f33d1c2fe972b1ad283073622", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eaded1f33d1c2fe972b1ad283073622")).booleanValue();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cacdf1a2e94f708054c46f64512cd3b2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cacdf1a2e94f708054c46f64512cd3b2")).booleanValue() : this.b.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public T get() throws InterruptedException, ExecutionException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a18f3f853985a34c34e75141171f1007", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a18f3f853985a34c34e75141171f1007");
        }
        this.b.await();
        if (this.c != null) {
            throw new ExecutionException(this.c);
        }
        return this.d;
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        Object[] objArr = {new Long(j), timeUnit};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd0a8c1308dd300c5b400aac1730d2d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd0a8c1308dd300c5b400aac1730d2d2");
        }
        if (!this.b.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for result");
        }
        if (this.c != null) {
            throw new ExecutionException(this.c);
        }
        return this.d;
    }

    @Nullable
    public final T a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ebb59249fce9ddbe721c0f75031e428", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ebb59249fce9ddbe721c0f75031e428");
        }
        try {
            return get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb90356a9ac2f2fb4ee3893293164f22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb90356a9ac2f2fb4ee3893293164f22");
        } else if (this.b.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }
}
