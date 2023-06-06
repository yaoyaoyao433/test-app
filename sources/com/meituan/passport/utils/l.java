package com.meituan.passport.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l<E> extends LinkedList<E> {
    public static ChangeQuickRedirect a;
    public final Object b;
    private int c;

    public l(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f33fcf585574243e9ac30df99d3433d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f33fcf585574243e9ac30df99d3433d");
            return;
        }
        this.c = i;
        this.b = new Object();
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        Object[] objArr = {Integer.valueOf(i), e};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82a20616a7000fffc8f1ad1e18bfd528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82a20616a7000fffc8f1ad1e18bfd528");
            return;
        }
        synchronized (this.b) {
            if (size() >= this.c) {
                remove(size() - 1);
            }
            super.add(i, e);
        }
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final boolean remove(Object obj) {
        boolean remove;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0b9e80f2356c68847dab4372548ac5e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0b9e80f2356c68847dab4372548ac5e")).booleanValue();
        }
        synchronized (this.b) {
            remove = super.remove(obj);
        }
        return remove;
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final boolean contains(Object obj) {
        boolean contains;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dd58f8b5f0f1a7523c6b269c1af7d72", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dd58f8b5f0f1a7523c6b269c1af7d72")).booleanValue();
        }
        synchronized (this.b) {
            contains = super.contains(obj);
        }
        return contains;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c40bfc8c86d7e4c9a81e55d29c07ccf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c40bfc8c86d7e4c9a81e55d29c07ccf");
        }
        synchronized (this.b) {
            Iterator it = iterator();
            if (it.hasNext()) {
                JSONArray jSONArray = new JSONArray();
                do {
                    Object next = it.next();
                    if (next != null) {
                        try {
                            jSONArray.put(new JSONObject(next.toString()));
                        } catch (JSONException e) {
                            f.a(e);
                        }
                    }
                } while (it.hasNext());
                return jSONArray.toString();
            }
            return "";
        }
    }
}
