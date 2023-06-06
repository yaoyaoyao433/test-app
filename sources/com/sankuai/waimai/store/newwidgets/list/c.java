package com.sankuai.waimai.store.newwidgets.list;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c<T, Contract extends b> extends BaseAdapter {
    public static ChangeQuickRedirect c;
    @NonNull
    private Contract a;
    @NonNull
    public final List<T> d;

    public abstract g a(int i);

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public c(@NonNull Contract contract) {
        Object[] objArr = {contract};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50092b275d5771aaec299fcc5ce60900", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50092b275d5771aaec299fcc5ce60900");
            return;
        }
        this.d = new ArrayList();
        this.a = contract;
    }

    public final void a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77417d44ff46c4f4fb762735aef586a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77417d44ff46c4f4fb762735aef586a0");
            return;
        }
        this.d.clear();
        if (list != null) {
            this.d.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d754590684f462c3d288da283a30785e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d754590684f462c3d288da283a30785e")).intValue() : this.d.size();
    }

    @Override // android.widget.Adapter
    public T getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83d7f08791b2347e36cdb0f80de35fe1", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83d7f08791b2347e36cdb0f80de35fe1");
        }
        if (i < 0 || i >= this.d.size()) {
            return null;
        }
        return this.d.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        g gVar;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09d3e9ecc013d1e06cc8f18dbcc7525e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09d3e9ecc013d1e06cc8f18dbcc7525e");
        }
        if (view == null) {
            gVar = a(getItemViewType(i));
            if (gVar == null) {
                gVar = new a();
            }
            gVar.a((g) this.a);
            view2 = gVar.c(viewGroup);
            view2.setTag(gVar);
        } else {
            view2 = view;
            gVar = (g) view.getTag();
        }
        gVar.b(getItem(i), i);
        return view2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends g {
        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(@NonNull View view) {
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.g
        public final void a(Object obj, int i) {
        }

        public a() {
        }
    }
}
