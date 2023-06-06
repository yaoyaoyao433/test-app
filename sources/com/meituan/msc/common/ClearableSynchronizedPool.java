package com.meituan.msc.common;

import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ClearableSynchronizedPool<T> implements Pools.Pool<T> {
    public static ChangeQuickRedirect a;
    private final Object[] b;
    private int c;

    public ClearableSynchronizedPool(int i) {
        Object[] objArr = {1024};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b5a544606816f23f194b887f37fd067", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b5a544606816f23f194b887f37fd067");
            return;
        }
        this.c = 0;
        this.b = new Object[1024];
    }

    @Override // android.support.v4.util.Pools.Pool
    public synchronized T acquire() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f7cdb597352b913ff3b0cb2623ff189", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f7cdb597352b913ff3b0cb2623ff189");
        } else if (this.c == 0) {
            return null;
        } else {
            this.c--;
            int i = this.c;
            T t = (T) this.b[i];
            this.b[i] = null;
            return t;
        }
    }

    @Override // android.support.v4.util.Pools.Pool
    public synchronized boolean release(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f688d065aeff4b046e2ee0acbee738b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f688d065aeff4b046e2ee0acbee738b0")).booleanValue();
        } else if (this.c == this.b.length) {
            return false;
        } else {
            this.b[this.c] = t;
            this.c++;
            return true;
        }
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e94faf66ab7665d69432e2f97a61c5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e94faf66ab7665d69432e2f97a61c5f");
            return;
        }
        for (int i = 0; i < this.c; i++) {
            this.b[i] = null;
        }
        this.c = 0;
    }
}
