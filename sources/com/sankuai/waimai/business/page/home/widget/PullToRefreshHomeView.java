package com.sankuai.waimai.business.page.home.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.pullrefresh.DefaultPullRefreshHeader;
import com.sankuai.waimai.platform.widget.pullrefresh.PullToRefreshView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PullToRefreshHomeView extends PullToRefreshView {
    public static ChangeQuickRedirect a;

    public PullToRefreshHomeView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8011bd6140505fa6db2ec256db18f4e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8011bd6140505fa6db2ec256db18f4e3");
        }
    }

    public PullToRefreshHomeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50fe5fbd3a6a6348d302c3990792fafd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50fe5fbd3a6a6348d302c3990792fafd");
        }
    }

    @Override // com.sankuai.waimai.platform.widget.pullrefresh.AbsScrollPullRefresh
    public final View a(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "250713f900e7b0eb727b5a6dcddd4adb", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "250713f900e7b0eb727b5a6dcddd4adb") : new DefaultPullRefreshHeader(context);
    }
}
