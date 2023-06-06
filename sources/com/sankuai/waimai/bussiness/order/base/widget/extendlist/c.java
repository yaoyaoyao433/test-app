package com.sankuai.waimai.bussiness.order.base.widget.extendlist;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class c<T> extends BaseAdapter {
    public static ChangeQuickRedirect b;
    protected int c;
    protected View d;
    protected List<T> e;
    protected Context f;

    public abstract List a(int i);

    public final void b(int i) {
        this.c = i;
    }

    public c(Context context, List<T> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86da8c8cb115853bbef72a8ef7fbdd67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86da8c8cb115853bbef72a8ef7fbdd67");
            return;
        }
        this.c = -1;
        this.e = list;
        if (list == null) {
            this.e = new ArrayList();
        }
        this.f = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f315ad666b239d286ea1881226fb3f70", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f315ad666b239d286ea1881226fb3f70")).intValue();
        }
        if (this.e == null) {
            return 0;
        }
        return this.e.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b05578d53ee41f03f68708bec23b1771", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b05578d53ee41f03f68708bec23b1771");
        }
        if (this.e == null || i >= this.e.size() || i < 0) {
            return null;
        }
        return this.e.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac6f3710715d72e2a9aa64d070a32b1e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac6f3710715d72e2a9aa64d070a32b1e")).longValue();
        }
        if (i < 0 || this.e == null || i >= this.e.size()) {
            return 0L;
        }
        return i;
    }

    public final void a(View view) {
        this.d = view;
    }
}
