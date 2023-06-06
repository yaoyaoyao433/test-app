package com.meituan.android.screenshot.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RoundImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private float b;
    private a c;

    public RoundImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbc5825e0f04f428a10dd87ba48065cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbc5825e0f04f428a10dd87ba48065cb");
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a261c9f0417f6a081fcc4bd7f3fc25d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a261c9f0417f6a081fcc4bd7f3fc25d");
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "899020486a93b58da047db08b11d52c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "899020486a93b58da047db08b11d52c7");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.riv_radius}, i, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (this.b < 0.0f) {
            this.b = 0.0f;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "046d97773f6cf5036e727f1b6fe9953b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "046d97773f6cf5036e727f1b6fe9953b");
            return;
        }
        this.c = a.a(bitmap, this.b);
        super.setImageDrawable(this.c);
    }
}
