package com.dianping.picasso.view.scroller;

import android.content.Context;
import com.dianping.picassocontroller.widget.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoScrollView extends a<CustomizedScrollView> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public PicassoScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d79e19ca4cd0b3706331ca44a52e1551", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d79e19ca4cd0b3706331ca44a52e1551");
        }
    }

    @Override // com.dianping.picassocontroller.widget.a
    public CustomizedScrollView setInnerView(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ba3a7378f8524c7e01a1a1b3c40254b", RobustBitConfig.DEFAULT_VALUE) ? (CustomizedScrollView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ba3a7378f8524c7e01a1a1b3c40254b") : new CustomizedScrollView(context);
    }
}
