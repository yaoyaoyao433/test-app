package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DynamicHeightScrollView extends ScrollView {
    public static ChangeQuickRedirect a;
    private int b;

    public DynamicHeightScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3037b443fc2210d2d5debbd632011c71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3037b443fc2210d2d5debbd632011c71");
        } else {
            a(context);
        }
    }

    public DynamicHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a57bc031c0708653768138b579e63606", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a57bc031c0708653768138b579e63606");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c75174416b49482cb2f39b8b0eea19b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c75174416b49482cb2f39b8b0eea19b");
        } else {
            this.b = (int) (g.b(context) * 0.55d);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c59ab6132f74cce37e60c2c6b91102ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c59ab6132f74cce37e60c2c6b91102ce");
            return;
        }
        super.onMeasure(i, i2);
        setMeasuredDimension(i, Math.min(getMeasuredHeight(), this.b) | Integer.MIN_VALUE);
    }

    public void setDynamicHeight(int i) {
        this.b = i;
    }
}
