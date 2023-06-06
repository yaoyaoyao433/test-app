package com.sankuai.waimai.business.im.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ContentLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    private boolean b;
    private float c;
    private boolean d;
    private int e;

    public ContentLinearLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c5fa3d84f777b6f3590409bfb295497", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c5fa3d84f777b6f3590409bfb295497");
        }
    }

    public ContentLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "992e70e051142c794b695623b52420cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "992e70e051142c794b695623b52420cf");
        }
    }

    public ContentLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "820e52895ed9175cf8e3106d7c185904", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "820e52895ed9175cf8e3106d7c185904");
            return;
        }
        this.c = 0.68f;
        this.d = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.WidthRatio, R.attr.isWidthFixed});
        this.c = obtainStyledAttributes.getFloat(0, this.c);
        this.b = obtainStyledAttributes.getBoolean(1, false);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45d18fe1555d2f6973408d9551357201", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45d18fe1555d2f6973408d9551357201");
        } else {
            this.e = (int) (getResources().getDisplayMetrics().widthPixels * this.c);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd4c41e9e8c27ded914a4218684f9e6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd4c41e9e8c27ded914a4218684f9e6a");
            return;
        }
        if (this.d) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            if (this.b) {
                size = this.e;
                mode = 1073741824;
            } else if (size > this.e) {
                size = this.e;
            }
            i = View.MeasureSpec.makeMeasureSpec(size, mode);
        }
        super.onMeasure(i, i2);
    }
}
