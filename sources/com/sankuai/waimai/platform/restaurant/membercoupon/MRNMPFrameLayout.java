package com.sankuai.waimai.platform.restaurant.membercoupon;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MRNMPFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a;

    public MRNMPFrameLayout(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e687b29c3b366010cba8ebf59ec4d9f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e687b29c3b366010cba8ebf59ec4d9f5");
        }
    }

    public MRNMPFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c07e3929d2c9c004e8a4fe6eaea2611", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c07e3929d2c9c004e8a4fe6eaea2611");
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6d181011e162fcc5b06671d0979b522", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6d181011e162fcc5b06671d0979b522");
            return;
        }
        super.requestLayout();
        post(new Runnable() { // from class: com.sankuai.waimai.platform.restaurant.membercoupon.MRNMPFrameLayout.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d45f0b1b30d5cf9d0587ccc8ec5cc6a6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d45f0b1b30d5cf9d0587ccc8ec5cc6a6");
                    return;
                }
                MRNMPFrameLayout.this.measure(View.MeasureSpec.makeMeasureSpec(MRNMPFrameLayout.this.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(MRNMPFrameLayout.this.getHeight(), 1073741824));
                MRNMPFrameLayout.this.layout(MRNMPFrameLayout.this.getPaddingLeft() + MRNMPFrameLayout.this.getLeft(), MRNMPFrameLayout.this.getPaddingTop() + MRNMPFrameLayout.this.getTop(), MRNMPFrameLayout.this.getWidth() + MRNMPFrameLayout.this.getPaddingLeft() + MRNMPFrameLayout.this.getLeft(), MRNMPFrameLayout.this.getHeight() + MRNMPFrameLayout.this.getPaddingTop() + MRNMPFrameLayout.this.getTop());
            }
        });
    }
}
