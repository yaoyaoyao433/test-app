package com.sankuai.waimai.sa.ui.assistant.view.multiperson;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RoundCornerImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private Path b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private RectF h;
    private float[] i;

    public RoundCornerImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d298468eceffcc64f571c7e576d07b7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d298468eceffcc64f571c7e576d07b7a");
        }
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e6c3a576de8368a3596646926421a48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e6c3a576de8368a3596646926421a48");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.round, R.attr.leftTopRound, R.attr.leftBottomRound, R.attr.rightTopRound, R.attr.rightBottomRound});
        this.c = obtainStyledAttributes.getDimension(0, 0.0f);
        this.d = obtainStyledAttributes.getDimension(3, 0.0f);
        if (this.d == 0.0f) {
            this.d = this.c;
        }
        this.e = obtainStyledAttributes.getDimension(4, 0.0f);
        if (this.e == 0.0f) {
            this.e = this.c;
        }
        this.f = obtainStyledAttributes.getDimension(2, 0.0f);
        if (this.f == 0.0f) {
            this.f = this.c;
        }
        this.g = obtainStyledAttributes.getDimension(1, 0.0f);
        if (this.g == 0.0f) {
            this.g = this.c;
        }
        this.i = new float[]{this.g, this.g, this.d, this.d, this.e, this.e, this.f, this.f};
        obtainStyledAttributes.recycle();
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef91f3fc6ea5217159ba78bd853a6aa1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef91f3fc6ea5217159ba78bd853a6aa1");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f46a9250018fc31c38943469c3e890ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f46a9250018fc31c38943469c3e890ef");
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (this.b == null) {
            this.b = new Path();
        }
        this.b.reset();
        if (this.h == null) {
            this.h = new RectF();
        }
        this.h.set(0.0f, 0.0f, width, height);
        this.b.addRoundRect(this.h, this.i, Path.Direction.CW);
        canvas.clipPath(this.b);
        super.onDraw(canvas);
    }

    public void setRightTopRound(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad8bc0afc7ec929725b48a0728a63e19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad8bc0afc7ec929725b48a0728a63e19");
            return;
        }
        this.d = f;
        this.i = new float[]{this.g, this.g, this.d, this.d, this.e, this.e, this.f, this.f};
    }

    public void setRightBottomRound(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "812b2de08763af382f284ccbef49d473", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "812b2de08763af382f284ccbef49d473");
            return;
        }
        this.e = f;
        this.i = new float[]{this.g, this.g, this.d, this.d, this.e, this.e, this.f, this.f};
    }

    public void setLeftBottomRound(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "617dd6f92fc96b44c204ef26436d336e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "617dd6f92fc96b44c204ef26436d336e");
            return;
        }
        this.f = f;
        this.i = new float[]{this.g, this.g, this.d, this.d, this.e, this.e, this.f, this.f};
    }

    public void setLeftTopRound(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3610b4fcb5efa3a48b99a20fc881b6c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3610b4fcb5efa3a48b99a20fc881b6c9");
            return;
        }
        this.g = f;
        this.i = new float[]{this.g, this.g, this.d, this.d, this.e, this.e, this.f, this.f};
    }

    public void setRound(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dc5bd90b63ba138936efada376690a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dc5bd90b63ba138936efada376690a7");
            return;
        }
        this.c = f;
        this.d = f;
        this.e = f;
        this.f = f;
        this.g = f;
        this.i = new float[]{this.c, this.c, this.c, this.c, this.c, this.c, this.c, this.c};
    }
}
