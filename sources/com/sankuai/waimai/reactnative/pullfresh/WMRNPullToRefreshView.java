package com.sankuai.waimai.reactnative.pullfresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.pullrefresh.NestedPullRefreshView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNPullToRefreshView extends NestedPullRefreshView {
    public static ChangeQuickRedirect a;

    public WMRNPullToRefreshView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c36984ad521a338130c4f4b4e1806273", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c36984ad521a338130c4f4b4e1806273");
        }
    }

    public WMRNPullToRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df0269ff86c6ab15292724b6f43bfa84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df0269ff86c6ab15292724b6f43bfa84");
        }
    }

    @Override // com.sankuai.waimai.platform.widget.pullrefresh.AbsScrollPullRefresh
    public final View a(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4095a278128a8756df753a483a9744c", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4095a278128a8756df753a483a9744c") : new WMRNPullToRefreshHeader(context);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1725de3d493e953693cb5b83f10a4bd8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1725de3d493e953693cb5b83f10a4bd8")).booleanValue();
        }
        com.sankuai.waimai.foundation.utils.log.a.b("test", "onTouchEvent event:" + motionEvent, new Object[0]);
        return super.onTouchEvent(motionEvent);
    }
}
