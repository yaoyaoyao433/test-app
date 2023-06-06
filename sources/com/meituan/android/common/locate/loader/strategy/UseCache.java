package com.meituan.android.common.locate.loader.strategy;

import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
@Deprecated
/* loaded from: classes2.dex */
public class UseCache extends Normal {
    public static ChangeQuickRedirect changeQuickRedirect;

    public UseCache() {
        super(LocationLoaderFactory.LoadStrategy.useCache);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21a7bafa60ca4d12d5b1451b894a670c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21a7bafa60ca4d12d5b1451b894a670c");
        }
    }

    @Override // com.meituan.android.common.locate.loader.strategy.Normal, com.meituan.android.common.locate.loader.BaseLocationStrategy, com.meituan.android.common.locate.loader.LocationStrategy
    public String getName() {
        return "UseCache";
    }
}
