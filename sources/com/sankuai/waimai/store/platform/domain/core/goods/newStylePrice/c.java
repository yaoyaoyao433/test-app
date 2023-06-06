package com.sankuai.waimai.store.platform.domain.core.goods.newStylePrice;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public final BaseHandPriceView a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bcc9022189979d7f7326e685e2b3d07", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseHandPriceView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bcc9022189979d7f7326e685e2b3d07");
        }
        switch (i) {
            case 0:
                return new HandPriceLayoutOneRow(context);
            case 1:
                return new HandPriceLayoutTwoRowLeft(context);
            case 2:
            default:
                return null;
            case 3:
                return new HandPriceLayoutOneRowBottom(context);
            case 4:
                return new TwoRowLeftOriginTop(context);
        }
    }
}
