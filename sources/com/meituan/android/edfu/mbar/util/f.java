package com.meituan.android.edfu.mbar.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ArrayBlockingQueue;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f<E> extends ArrayBlockingQueue<E> {
    public static ChangeQuickRedirect a;
    private int b;

    public f(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1edd644aa334509e5a357027bdf0b45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1edd644aa334509e5a357027bdf0b45");
        } else {
            this.b = i;
        }
    }

    @Override // java.util.concurrent.ArrayBlockingQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean add(E e) {
        Object[] objArr = {e};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0cba734579d33adf41a0f1b6f2b7e29", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0cba734579d33adf41a0f1b6f2b7e29")).booleanValue();
        }
        super.add(e);
        while (size() > this.b) {
            super.remove();
        }
        return true;
    }

    @Override // java.util.concurrent.ArrayBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean offer(E e) {
        Object[] objArr = {e};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "369ff4a05d70d2bd6e650ff7b8ea6921", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "369ff4a05d70d2bd6e650ff7b8ea6921")).booleanValue();
        }
        super.offer(e);
        while (size() > this.b) {
            super.remove();
        }
        return true;
    }
}
