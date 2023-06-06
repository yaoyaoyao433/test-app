package com.dianping.jscore;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class SimpleSettableFuture<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final CountDownLatch mReadyLatch;
    private volatile T mResult;

    public SimpleSettableFuture() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa9ca8b3337452f8951aa8568eedbfec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa9ca8b3337452f8951aa8568eedbfec");
        } else {
            this.mReadyLatch = new CountDownLatch(1);
        }
    }

    public void set(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cda12ec3b1ddfb90329bf783d6775a6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cda12ec3b1ddfb90329bf783d6775a6b");
        } else if (this.mReadyLatch.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        } else {
            this.mResult = t;
            this.mReadyLatch.countDown();
        }
    }

    public T get(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a82750d4981fc77e4869b97815262e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a82750d4981fc77e4869b97815262e4");
        }
        try {
            if (!this.mReadyLatch.await(j, TimeUnit.MILLISECONDS)) {
                throw new TimeoutException();
            }
            return this.mResult;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class TimeoutException extends RuntimeException {
        public static ChangeQuickRedirect changeQuickRedirect;

        public TimeoutException() {
            super("Timed out waiting for future");
        }
    }
}
