package com.sankuai.waimai.business.search.adapterdelegates;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d<T> {
    public static ChangeQuickRedirect a;
    private static final List<Object> d = Collections.emptyList();
    protected SparseArrayCompat<c<T>> b;
    protected c<T> c;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3a41b564e6d781fbf693b56b089cc23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3a41b564e6d781fbf693b56b089cc23");
        } else {
            this.b = new SparseArrayCompat<>();
        }
    }

    public final d<T> a(@NonNull c<T> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5561dc10fe0b75a0a631cc6739e92285", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5561dc10fe0b75a0a631cc6739e92285");
        }
        int size = this.b.size();
        while (this.b.get(size) != null) {
            size++;
            if (size == 2147483646 && com.sankuai.waimai.foundation.core.a.a()) {
                throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
            }
        }
        Object[] objArr2 = {Integer.valueOf(size), (byte) 0, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1198255e13d23335103ddb5e07b87093", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1198255e13d23335103ddb5e07b87093");
        }
        if (cVar == null && com.sankuai.waimai.foundation.core.a.a()) {
            throw new NullPointerException("AdapterDelegate is null!");
        }
        if (size == 2147483646 && com.sankuai.waimai.foundation.core.a.a()) {
            throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
        }
        if (this.b.get(size) != null && com.sankuai.waimai.foundation.core.a.a()) {
            throw new IllegalArgumentException("An AdapterDelegate is already registered for the viewType = " + size + ". Already registered AdapterDelegate is " + this.b.get(size));
        }
        this.b.put(size, cVar);
        return this;
    }

    public final int a(@NonNull T t, int i) {
        Object[] objArr = {t, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c1005c36ba273f8ab439fa1916b6e80", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c1005c36ba273f8ab439fa1916b6e80")).intValue();
        }
        if (t == null && com.sankuai.waimai.foundation.core.a.a()) {
            throw new NullPointerException("Items datasource is null!");
        }
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.b.valueAt(i2).a(t, i)) {
                return this.b.keyAt(i2);
            }
        }
        if (this.c != null) {
            return 2147483646;
        }
        if (com.sankuai.waimai.foundation.core.a.a()) {
            throw new NullPointerException("No AdapterDelegate added that matches position=" + i + " in data source");
        }
        return -1;
    }

    @NonNull
    public final RecyclerView.s a(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c9e56f748a23ad187faf4e9f076fb5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c9e56f748a23ad187faf4e9f076fb5a");
        }
        c<T> a2 = a(i);
        if (a2 == null && com.sankuai.waimai.foundation.core.a.a()) {
            throw new NullPointerException("No AdapterDelegate added for ViewType " + i);
        }
        RecyclerView.s a3 = a2.a(viewGroup);
        if (a3 == null && com.sankuai.waimai.foundation.core.a.a()) {
            throw new NullPointerException("ViewHolder returned from AdapterDelegate " + a2 + " for ViewType =" + i + " is null!");
        }
        return a3;
    }

    public final void a(@NonNull T t, int i, @NonNull RecyclerView.s sVar) {
        Object[] objArr = {t, Integer.valueOf(i), sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d02e63a092fd806fd7c11dd89594d3b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d02e63a092fd806fd7c11dd89594d3b9");
            return;
        }
        List<Object> list = d;
        Object[] objArr2 = {t, Integer.valueOf(i), sVar, list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97b594f863a551613c913e28b36fe844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97b594f863a551613c913e28b36fe844");
            return;
        }
        c<T> a2 = a(sVar.getItemViewType());
        if (a2 != null || !com.sankuai.waimai.foundation.core.a.a()) {
            if (list == null) {
                list = d;
            }
            a2.a(t, i, sVar, list);
            return;
        }
        throw new NullPointerException("No delegate found for item at position = " + i + " for viewType = " + sVar.getItemViewType());
    }

    public final void a(@NonNull RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8e23c67ee4e802f4e2c0862b04c2fe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8e23c67ee4e802f4e2c0862b04c2fe1");
            return;
        }
        c<T> a2 = a(sVar.getItemViewType());
        if (a2 == null) {
            if (com.sankuai.waimai.foundation.core.a.a()) {
                throw new NullPointerException("No delegate found for " + sVar + " for item at position = " + sVar.getAdapterPosition() + " for viewType = " + sVar.getItemViewType());
            }
            return;
        }
        a2.a(sVar);
    }

    public final void b(@NonNull RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf5d3f45a804e3de545db42ca69bd8a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf5d3f45a804e3de545db42ca69bd8a3");
            return;
        }
        c<T> a2 = a(sVar.getItemViewType());
        if (a2 == null) {
            if (com.sankuai.waimai.foundation.core.a.a()) {
                throw new NullPointerException("No delegate found for " + sVar + " for item at position = " + sVar.getAdapterPosition() + " for viewType = " + sVar.getItemViewType());
            }
            return;
        }
        a2.b(sVar);
    }

    @Nullable
    private c<T> a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "568162b59c515d3127f341781aee9ee0", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "568162b59c515d3127f341781aee9ee0") : this.b.get(i, this.c);
    }
}
