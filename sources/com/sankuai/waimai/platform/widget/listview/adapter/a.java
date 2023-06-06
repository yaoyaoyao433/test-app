package com.sankuai.waimai.platform.widget.listview.adapter;

import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.BaseAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> extends BaseAdapter {
    public static ChangeQuickRedirect a;
    @NonNull
    protected final ArrayList<T> b;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3151e4ed896dba592028fba784e19a4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3151e4ed896dba592028fba784e19a4e");
        } else {
            this.b = new ArrayList<>();
        }
    }

    @NonNull
    public final ArrayList<T> a() {
        return this.b;
    }

    @MainThread
    public boolean a(@Nullable List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec3cbb1e6bee43375e833a16640a3443", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec3cbb1e6bee43375e833a16640a3443")).booleanValue();
        }
        if (list != this.b) {
            this.b.clear();
            if (list != null && !list.isEmpty()) {
                this.b.addAll(list);
            }
            notifyDataSetChanged();
            return true;
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74a0ea49850042095da74637a965f322", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74a0ea49850042095da74637a965f322")).intValue() : this.b.size();
    }

    @Override // android.widget.Adapter
    public T getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8adb18a662968d2069762f08184acf36", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8adb18a662968d2069762f08184acf36") : this.b.get(i);
    }
}
