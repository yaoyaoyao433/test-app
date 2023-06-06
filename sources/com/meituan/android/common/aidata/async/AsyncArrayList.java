package com.meituan.android.common.aidata.async;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AsyncArrayList<E> extends ArrayList<E> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Lock lock;

    public AsyncArrayList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e12ad4a2ffccb913630b01b9c497d2ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e12ad4a2ffccb913630b01b9c497d2ac");
        } else {
            this.lock = new ReentrantLock();
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        Object[] objArr = {e};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5da0f3875315c1fd64ca035611120239", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5da0f3875315c1fd64ca035611120239")).booleanValue();
        }
        try {
            this.lock.lock();
            return super.add(e);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        Object[] objArr = {Integer.valueOf(i), e};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a26ccc9e0bc40f94f5f395a2e50a6f7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a26ccc9e0bc40f94f5f395a2e50a6f7e");
            return;
        }
        try {
            this.lock.lock();
            super.add(i, e);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        Object[] objArr = {Integer.valueOf(i), e};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b387a307970e80b3eb3f440eb7f58271", RobustBitConfig.DEFAULT_VALUE)) {
            return (E) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b387a307970e80b3eb3f440eb7f58271");
        }
        try {
            return (E) super.set(i, e);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3387c4bdcb436bbc20bee80c07c757f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3387c4bdcb436bbc20bee80c07c757f")).booleanValue();
        }
        try {
            this.lock.lock();
            return super.addAll(collection);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        Object[] objArr = {Integer.valueOf(i), collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b16aac0dc7d10d34adf840910c0ba2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b16aac0dc7d10d34adf840910c0ba2c")).booleanValue();
        }
        try {
            this.lock.lock();
            return super.addAll(i, collection);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72ddd9d1e3b04354c7b02fada95e5870", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72ddd9d1e3b04354c7b02fada95e5870");
            return;
        }
        try {
            this.lock.lock();
            super.clear();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a7a44164ab21b2ef78bd112034ff2a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a7a44164ab21b2ef78bd112034ff2a1")).booleanValue();
        }
        try {
            this.lock.lock();
            return super.remove(obj);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public E remove(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc898c740554972bbe2f91c3e8d8661a", RobustBitConfig.DEFAULT_VALUE)) {
            return (E) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc898c740554972bbe2f91c3e8d8661a");
        }
        try {
            this.lock.lock();
            return (E) super.remove(i);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfa7050a7fbb573e2cbf01b76b74ac78", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfa7050a7fbb573e2cbf01b76b74ac78")).booleanValue();
        }
        try {
            this.lock.lock();
            return super.removeAll(collection);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NonNull
    public Iterator<E> iterator() {
        Iterator<E> it;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fd98796653c4f2ae00371348e92217f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Iterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fd98796653c4f2ae00371348e92217f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c870aaa2dc063ac60c52aab1ff1addb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c870aaa2dc063ac60c52aab1ff1addb");
        } else {
            this.lock.unlock();
        }
    }
}
