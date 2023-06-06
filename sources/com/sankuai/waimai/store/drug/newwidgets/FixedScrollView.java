package com.sankuai.waimai.store.drug.newwidgets;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2e3352364f4cf5bd6648d553dbda7e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2e3352364f4cf5bd6648d553dbda7e0");
        }
    }

    public FixedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c5e78f92c4355e22572c186d49bf263", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c5e78f92c4355e22572c186d49bf263");
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52b87916ecc1e7a97d380bef852fc2e7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52b87916ecc1e7a97d380bef852fc2e7")).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            a.a(e);
            return true;
        }
    }
}
