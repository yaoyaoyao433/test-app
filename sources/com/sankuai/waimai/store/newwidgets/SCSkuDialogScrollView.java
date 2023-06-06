package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.store.util.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCSkuDialogScrollView extends SCCompatibleScrollView {
    public static ChangeQuickRedirect c;

    public SCSkuDialogScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "172104c3dbd95fefe79e43a4907dc9ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "172104c3dbd95fefe79e43a4907dc9ba");
        }
    }

    public SCSkuDialogScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ca3403607f1b4419efbc785e3605a7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ca3403607f1b4419efbc785e3605a7d");
        }
    }

    public SCSkuDialogScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98f13a855341f8937a88c2be0373c276", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98f13a855341f8937a88c2be0373c276");
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11814a05a5fec14497aecbf408c1e894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11814a05a5fec14497aecbf408c1e894");
            return;
        }
        try {
            i2 = View.MeasureSpec.makeMeasureSpec((int) (h.a(b.a(), 295.0f) + 0.5f), Integer.MIN_VALUE);
        } catch (Exception e) {
            a.a(e);
        }
        super.onMeasure(i, i2);
    }
}
