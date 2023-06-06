package com.sankuai.waimai.business.user.comment.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CropTopImageView extends ImageView {
    public static ChangeQuickRedirect a;

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public CropTopImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebc76e7c44224734eb9e3750a8ed7b74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebc76e7c44224734eb9e3750a8ed7b74");
        } else {
            a();
        }
    }

    public CropTopImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09c31af9c78d9b77d494f8b4f1669713", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09c31af9c78d9b77d494f8b4f1669713");
        } else {
            a();
        }
    }

    public CropTopImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c9101061cca361384003814c84b83d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c9101061cca361384003814c84b83d8");
        } else {
            a();
        }
    }

    @TargetApi(21)
    public CropTopImageView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5713f75af3fc16951e45e73fc8c6af6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5713f75af3fc16951e45e73fc8c6af6f");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2438fb0ade3cc9e964a5987d2c79584", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2438fb0ade3cc9e964a5987d2c79584");
        } else {
            super.setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17286bdb851b1e44782a9b35c191137f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17286bdb851b1e44782a9b35c191137f")).booleanValue();
        }
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        if (getScaleType() == ImageView.ScaleType.MATRIX && drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            float width = getWidth() / drawable.getIntrinsicWidth();
            imageMatrix.setScale(width, width, 0.0f, 0.0f);
            imageMatrix.postTranslate(0.0f, -(((int) (drawable.getIntrinsicHeight() * width)) - getHeight()));
            setImageMatrix(imageMatrix);
        }
        return frame;
    }
}
