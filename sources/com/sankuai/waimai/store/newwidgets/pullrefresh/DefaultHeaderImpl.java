package com.sankuai.waimai.store.newwidgets.pullrefresh;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DefaultHeaderImpl implements DefaultHeaderService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService
    public View createDefaultHeader(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1616583e5ed88903dfb24f642a1351e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1616583e5ed88903dfb24f642a1351e") : new DefaultPullRefreshHeader(context);
    }
}
