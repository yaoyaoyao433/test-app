package com.meituan.android.cube.pga.viewmodel;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class b<DataType> extends a<DataType> {
    public static ChangeQuickRedirect o;

    public abstract <T> a<T> b(int i);

    public abstract int n();

    public RecyclerView.LayoutManager o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd6bbe8be7b29091a94cde4207fb59f", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.LayoutManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd6bbe8be7b29091a94cde4207fb59f") : new LinearLayoutManager(this.d, 1, false);
    }
}
