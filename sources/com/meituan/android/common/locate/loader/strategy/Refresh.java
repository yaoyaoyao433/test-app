package com.meituan.android.common.locate.loader.strategy;

import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
@Deprecated
/* loaded from: classes2.dex */
public class Refresh extends Normal {
    public static ChangeQuickRedirect changeQuickRedirect;

    public Refresh() {
        super(LocationLoaderFactory.LoadStrategy.refresh);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86d90075360f07cf7cf0cea0382ec222", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86d90075360f07cf7cf0cea0382ec222");
        }
    }

    @Override // com.meituan.android.common.locate.loader.strategy.Normal, com.meituan.android.common.locate.loader.BaseLocationStrategy, com.meituan.android.common.locate.loader.LocationStrategy
    public String getName() {
        return "Refresh";
    }
}
