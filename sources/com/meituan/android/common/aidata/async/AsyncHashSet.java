package com.meituan.android.common.aidata.async;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AsyncHashSet<E> extends HashSet<E> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Lock lock;

    public AsyncHashSet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "913ba72327f81222dabeb350fe5c42da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "913ba72327f81222dabeb350fe5c42da");
        } else {
            this.lock = new ReentrantLock();
        }
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        Object[] objArr = {e};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26fd417325ee682987c7a4b9a270c9c0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26fd417325ee682987c7a4b9a270c9c0")).booleanValue();
        }
        try {
            this.lock.lock();
            return super.add(e);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31a3b62255872d3d30bda9059045d1ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31a3b62255872d3d30bda9059045d1ef")).booleanValue();
        }
        try {
            this.lock.lock();
            return super.remove(obj);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c15fd570d63c8b8d91aedf874b5ad227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c15fd570d63c8b8d91aedf874b5ad227");
            return;
        }
        try {
            this.lock.lock();
            super.clear();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        Iterator<E> it;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b30882217e137a7083e54818a537c214", RobustBitConfig.DEFAULT_VALUE)) {
            return (Iterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b30882217e137a7083e54818a537c214");
        }
        try {
            if (this.lock.tryLock(10L, TimeUnit.MILLISECONDS)) {
                it = new AsyncListIterator<>(this.lock, super.iterator());
            } else {
                it = new ArrayList(this).iterator();
            }
            return it;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return new ArrayList(this).iterator();
        }
    }

    public void unLock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1321c95dcda06d854170a0ab13a12b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1321c95dcda06d854170a0ab13a12b8");
        } else {
            this.lock.unlock();
        }
    }
}
