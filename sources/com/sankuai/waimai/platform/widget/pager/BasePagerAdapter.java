package com.sankuai.waimai.platform.widget.pager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class BasePagerAdapter<T> extends PagerAdapter {
    public static ChangeQuickRedirect f;
    protected LayoutInflater g;
    protected List<T> h;
    protected SparseArray<View> i;
    public Context j;

    public abstract View a(ViewGroup viewGroup, T t, int i);

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public BasePagerAdapter(@NonNull Context context, @NonNull List<T> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee4f8b8ef110504cdc6ec1c7026cfaf3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee4f8b8ef110504cdc6ec1c7026cfaf3");
            return;
        }
        this.g = LayoutInflater.from(context);
        this.h = list;
        this.j = context;
        this.i = new SparseArray<>(list.size());
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14a0a1cae36874f8094ca39ed1f7e63e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14a0a1cae36874f8094ca39ed1f7e63e")).intValue();
        }
        if (this.h == null) {
            return 0;
        }
        return this.h.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f30fbc941accb1210116b336bfa308a5", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f30fbc941accb1210116b336bfa308a5");
        }
        com.sankuai.waimai.foundation.utils.log.a.e("MMM", "instantiateItem::position=" + i, new Object[0]);
        View view = this.i.get(i);
        if (view == null) {
            view = a(viewGroup, this.h.get(i), i);
            this.i.put(i, view);
        } else {
            this.h.get(i);
        }
        viewGroup.addView(view);
        return view;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cdfe1a4da178b6d106f8aa7e7b766df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cdfe1a4da178b6d106f8aa7e7b766df");
        } else {
            viewGroup.removeView(this.i.get(i));
        }
    }

    public final void a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d1f27ac13cc98d134b90aaddce36a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d1f27ac13cc98d134b90aaddce36a2");
        } else if (b.b(list)) {
        } else {
            this.h.clear();
            this.h.addAll(list);
            notifyDataSetChanged();
        }
    }

    public final View c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1704d919d1a56d49783505c460756a3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1704d919d1a56d49783505c460756a3f");
        }
        if (this.i != null) {
            return this.i.get(i);
        }
        return null;
    }
}
