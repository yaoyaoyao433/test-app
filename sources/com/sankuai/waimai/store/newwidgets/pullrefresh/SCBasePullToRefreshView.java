package com.sankuai.waimai.store.newwidgets.pullrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCBasePullToRefreshView extends PullToRefreshView {
    public static ChangeQuickRedirect g;

    public SCBasePullToRefreshView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adab26bba4b6728a6cdfa94b8c987195", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adab26bba4b6728a6cdfa94b8c987195");
        }
    }

    public SCBasePullToRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0486f81e39a24d7497dc35ed437a4c99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0486f81e39a24d7497dc35ed437a4c99");
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.SCAbsScrollPullRefresh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f84d5a28976dd370671ff01b4c08c06", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f84d5a28976dd370671ff01b4c08c06")).booleanValue();
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return false;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.PullToRefreshView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c478f23a8e6143104995539554067f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c478f23a8e6143104995539554067f")).booleanValue();
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return false;
        }
    }
}
