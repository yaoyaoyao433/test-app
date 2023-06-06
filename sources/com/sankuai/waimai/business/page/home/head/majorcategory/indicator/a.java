package com.sankuai.waimai.business.page.home.head.majorcategory.indicator;

import android.graphics.drawable.GradientDrawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends GradientDrawable {
    public static ChangeQuickRedirect a;
    private int b;

    @Override // android.graphics.drawable.GradientDrawable
    public final void setColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5be0cf950451ff64525e8ccd5a133312", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5be0cf950451ff64525e8ccd5a133312");
            return;
        }
        super.setColor(i);
        this.b = i;
    }
}
