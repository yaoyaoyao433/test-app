package com.meituan.android.common.locate.loader.strategy;

import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
@Deprecated
/* loaded from: classes2.dex */
public class Newest extends Normal {
    public static ChangeQuickRedirect changeQuickRedirect;

    public Newest() {
        super(LocationLoaderFactory.LoadStrategy.newest);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ad9cd149358703c922e22174e36810f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ad9cd149358703c922e22174e36810f");
        }
    }

    @Override // com.meituan.android.common.locate.loader.strategy.Normal, com.meituan.android.common.locate.loader.BaseLocationStrategy, com.meituan.android.common.locate.loader.LocationStrategy
    public String getName() {
        return "Newest";
    }

    public void updateLoadTime() {
    }
}
