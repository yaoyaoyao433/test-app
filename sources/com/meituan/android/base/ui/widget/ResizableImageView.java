package com.meituan.android.base.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ResizableImageView extends ImageView {
    public static ChangeQuickRedirect a;

    public ResizableImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aadad61740c0d05716b43d7d87589f9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aadad61740c0d05716b43d7d87589f9f");
        }
    }

    public ResizableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06c3534bfc88b3349399a7f52136ebac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06c3534bfc88b3349399a7f52136ebac");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe31dadc84585b4d9caa227b8dc65945", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe31dadc84585b4d9caa227b8dc65945");
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int size = View.MeasureSpec.getSize(i);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > 0) {
                setMeasuredDimension(size, (drawable.getIntrinsicHeight() * size) / intrinsicWidth);
                return;
            } else {
                super.onMeasure(i, i2);
                return;
            }
        }
        super.onMeasure(i, i2);
    }
}
