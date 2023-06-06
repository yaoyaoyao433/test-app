package com.sankuai.android.spawn.base;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import com.handmark.pulltorefresh.library.c;
import com.handmark.pulltorefresh.library.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class PullToRefreshListFragment<D, I> extends ModelItemListFragment<D, I> implements c.d<ListView> {
    public static ChangeQuickRedirect q;
    private d m;

    @Override // com.sankuai.android.spawn.base.BaseListFragment
    public final View d() {
        KeyEvent.Callback callback;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a51ddaa253a509333a1556bb585fed39", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a51ddaa253a509333a1556bb585fed39");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = q;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f188f1a848fe7739e3b023bfa7f6da91", 6917529027641081856L)) {
            callback = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f188f1a848fe7739e3b023bfa7f6da91");
        } else {
            d dVar = new d(getActivity());
            ((ListView) dVar.getRefreshableView()).setDrawSelectorOnTop(true);
            callback = dVar;
        }
        this.m = (d) callback;
        return this.m;
    }

    @Override // com.sankuai.android.spawn.base.BaseListFragment
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a0e4e7ed5feaf534dcdaaa1c6bb7b84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a0e4e7ed5feaf534dcdaaa1c6bb7b84");
            return;
        }
        super.b();
        if (this.m != null) {
            this.m.setOnRefreshListener(this);
        }
    }

    @Override // com.sankuai.android.spawn.base.BaseListFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "665d187711dafabbfb52632dbbf4d829", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "665d187711dafabbfb52632dbbf4d829");
            return;
        }
        super.onDestroyView();
        this.m = null;
    }
}
