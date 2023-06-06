package com.sankuai.android.spawn.base;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ModelItemListFragment<D, I> extends BaseListFragment implements LoaderManager.LoaderCallbacks<D> {
    public static ChangeQuickRedirect l;

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8759bd3d966ec08251b438d3df44430c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8759bd3d966ec08251b438d3df44430c");
        } else {
            super.onActivityCreated(bundle);
        }
    }
}
