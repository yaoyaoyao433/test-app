package com.meituan.android.common.aidata.async;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AsyncListIterator<E> implements Iterator<E> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Iterator<E> iterator;
    private final Lock lock;

    public AsyncListIterator(Lock lock, Iterator<E> it) {
        Object[] objArr = {lock, it};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ad7f893961c53bbcc85e80e4758f022", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ad7f893961c53bbcc85e80e4758f022");
            return;
        }
        this.lock = lock;
        this.iterator = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "865ccd3a8ff5803f66b35689cd37a1cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "865ccd3a8ff5803f66b35689cd37a1cc")).booleanValue();
        }
        if (this.iterator == null || !this.iterator.hasNext()) {
            if (this.lock != null) {
                this.lock.unlock();
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public E next() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fd64c6a1a7701bfec64e11bf923c9f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (E) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fd64c6a1a7701bfec64e11bf923c9f8");
        }
        if (this.iterator == null) {
            return null;
        }
        return this.iterator.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3900986d78ec33ca47f4ed8d03c1d44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3900986d78ec33ca47f4ed8d03c1d44");
        } else if (this.iterator == null) {
        } else {
            this.iterator.remove();
        }
    }
}
