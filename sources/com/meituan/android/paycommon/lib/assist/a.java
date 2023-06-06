package com.meituan.android.paycommon.lib.assist;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a<T> extends BaseAdapter {
    public static ChangeQuickRedirect h;
    public Context i;
    protected LayoutInflater j;
    public ArrayList<T> k;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7a9ff9a820b20029dc2fa21469f8a7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7a9ff9a820b20029dc2fa21469f8a7e");
            return;
        }
        this.k = new ArrayList<>();
        this.i = context;
        this.j = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public a(Context context, ArrayList<T> arrayList) {
        this(context);
        Object[] objArr = {context, arrayList};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c627cf2f8cd08eebd3ad6d827b096d74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c627cf2f8cd08eebd3ad6d827b096d74");
        } else {
            a(arrayList);
        }
    }

    public final void a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "234fc69d6d221d1387e854b6ac42b28a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "234fc69d6d221d1387e854b6ac42b28a");
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.k = new ArrayList<>(list);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeef018567cd0c2e297fbac0a841e712", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeef018567cd0c2e297fbac0a841e712")).intValue();
        }
        if (this.k == null) {
            return 0;
        }
        return this.k.size();
    }

    @Override // android.widget.Adapter
    public T getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5046d2d3b8d7406552e42584047f3508", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5046d2d3b8d7406552e42584047f3508");
        }
        if (this.k == null) {
            return null;
        }
        return this.k.get(i);
    }
}
