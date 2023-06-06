package com.sankuai.waimai.business.page.home.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HomePullToRefreshView extends BaseHomePullToRefreshView {
    public static ChangeQuickRedirect b;

    public HomePullToRefreshView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7d5d6686a75d38415ca7b5d3dc8861f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7d5d6686a75d38415ca7b5d3dc8861f");
        }
    }

    public HomePullToRefreshView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18d6dfe60d110c3ceed5b3dfc264888c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18d6dfe60d110c3ceed5b3dfc264888c");
        }
    }

    public HomePullToRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf777bc4b53142725d3994fef22607be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf777bc4b53142725d3994fef22607be");
        }
    }

    @TargetApi(21)
    public HomePullToRefreshView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9bcce56a70b2c3f9e376e08a962660d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9bcce56a70b2c3f9e376e08a962660d");
        }
    }

    @Override // com.sankuai.waimai.platform.widget.pullrefresh.AbsScrollPullRefresh
    public final View a(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cf40ffd6ae4267277a0117cb9e7487e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cf40ffd6ae4267277a0117cb9e7487e") : new HomePullRefreshHeader(context);
    }
}
