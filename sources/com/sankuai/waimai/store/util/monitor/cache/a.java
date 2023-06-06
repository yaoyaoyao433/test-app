package com.sankuai.waimai.store.util.monitor.cache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a<E> extends LinkedList<E> {
    public static ChangeQuickRedirect a;
    private final int b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a25e8250dfef1ae11f003e26322ab3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a25e8250dfef1ae11f003e26322ab3e");
        } else {
            this.b = 5;
        }
    }

    public a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39bcba6675a03f87338a37793021e154", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39bcba6675a03f87338a37793021e154");
        } else {
            this.b = i;
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        Object[] objArr = {Integer.valueOf(i), e};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ed6baaa41585268b44efb2e8758ef97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ed6baaa41585268b44efb2e8758ef97");
            return;
        }
        super.add(i, e);
        a();
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public final boolean add(E e) {
        Object[] objArr = {e};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3d47cb9e62c7ec082cfeb610634a5c9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3d47cb9e62c7ec082cfeb610634a5c9")).booleanValue();
        }
        boolean add = super.add(e);
        a();
        return add;
    }

    @Override // java.util.LinkedList, java.util.Deque
    public final void addLast(E e) {
        Object[] objArr = {e};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0161b185c6a8f04ed2ce53b3c96c39d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0161b185c6a8f04ed2ce53b3c96c39d2");
            return;
        }
        super.addLast(e);
        a();
    }

    @Override // java.util.LinkedList, java.util.Deque
    public final void addFirst(E e) {
        Object[] objArr = {e};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b6e8fdab028fd2b907d90370797de7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b6e8fdab028fd2b907d90370797de7f");
            return;
        }
        super.addFirst(e);
        a();
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        Object[] objArr = {Integer.valueOf(i), collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c936ba4784d43483ae522af63db968e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c936ba4784d43483ae522af63db968e")).booleanValue();
        }
        boolean addAll = super.addAll(i, collection);
        a();
        return addAll;
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efb30c1196c935e230aea07c319c3f7a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efb30c1196c935e230aea07c319c3f7a")).booleanValue();
        }
        boolean addAll = super.addAll(collection);
        a();
        return addAll;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8685948c7204af3aeb92141a1b66d3fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8685948c7204af3aeb92141a1b66d3fd");
            return;
        }
        while (size() > this.b) {
            try {
                removeFirst();
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a("trim:" + e.getMessage());
            }
        }
    }
}
