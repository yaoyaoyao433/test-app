package com.sankuai.waimai.bussiness.order.base.widget.extendlist;

import android.content.Context;
import android.widget.BaseAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class d<T> extends BaseAdapter {
    public static ChangeQuickRedirect b;
    protected int c;
    protected List<T> d;
    protected Context e;

    public final void a(int i) {
        this.c = i;
    }

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6d107290009c89ebba84cc535de99a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6d107290009c89ebba84cc535de99a6");
            return;
        }
        this.c = -1;
        this.e = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95c79736633a6ea5bf9864e7c88f6d81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95c79736633a6ea5bf9864e7c88f6d81")).intValue();
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f15bc415748867fff34e8b4fc513b37", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f15bc415748867fff34e8b4fc513b37");
        }
        if (this.d == null || i >= this.d.size() || i < 0) {
            return null;
        }
        return this.d.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ee4ab43c276aeb9d3901b86001b25e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ee4ab43c276aeb9d3901b86001b25e8")).longValue();
        }
        if (i < 0 || this.d == null || i >= this.d.size()) {
            return 0L;
        }
        return i;
    }

    public final void a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1b94bf9d94d4355cb0c83ba6fd55a96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1b94bf9d94d4355cb0c83ba6fd55a96");
            return;
        }
        if (this.d != null) {
            this.d.clear();
        } else {
            this.d = new ArrayList();
        }
        this.d.addAll(list);
    }
}
