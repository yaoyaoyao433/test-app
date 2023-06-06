package com.dianping.picasso;

import com.dianping.picasso.creator.BaseViewWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes.dex */
public class PicassoViewMap {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static BaseViewWrapper getViewWrapper(Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8fad3852f43b1f0f1d2ea9331c3f0cea", RobustBitConfig.DEFAULT_VALUE) ? (BaseViewWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8fad3852f43b1f0f1d2ea9331c3f0cea") : PicassoViewWrapperUtil.viewWrapperByType(num);
    }
}
