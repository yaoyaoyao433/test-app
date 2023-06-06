package com.meituan.android.common.locate.loader.strategy;

import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public class NaviInstant extends Instant {
    public static ChangeQuickRedirect changeQuickRedirect;

    public NaviInstant() {
        super(LocationLoaderFactory.LoadStrategy.navi_instant);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee96daf5cc7e954a05e35d2385950188", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee96daf5cc7e954a05e35d2385950188");
        }
    }

    @Override // com.meituan.android.common.locate.loader.strategy.Instant, com.meituan.android.common.locate.loader.strategy.Normal, com.meituan.android.common.locate.loader.BaseLocationStrategy, com.meituan.android.common.locate.loader.LocationStrategy
    public String getName() {
        return "NaviInstant";
    }
}
