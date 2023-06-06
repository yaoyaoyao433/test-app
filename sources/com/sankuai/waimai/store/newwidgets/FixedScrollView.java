package com.sankuai.waimai.store.newwidgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.log.a;
/* compiled from: ProGuard */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes5.dex */
public class FixedScrollView extends ScrollView {
    public static ChangeQuickRedirect a;

    public FixedScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c5dbbd56fb7de1f34caafcd3e917921", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c5dbbd56fb7de1f34caafcd3e917921");
        }
    }

    public FixedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1504eda5ca0cd5b57cb8f7a1a74ee54f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1504eda5ca0cd5b57cb8f7a1a74ee54f");
        }
    }

    public FixedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c2ebe685a56e1d8d3cd9031bec4c4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c2ebe685a56e1d8d3cd9031bec4c4a");
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "438779640680b7ab0936b2129cec70eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "438779640680b7ab0936b2129cec70eb")).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            a.a(e);
            return true;
        }
    }
}
