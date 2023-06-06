package com.meituan.android.customerservice.kit.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.android.customerservice.kit.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AutoFitTextView extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private float b;
    private float c;

    public AutoFitTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53cbc6d68d8dd794d794370a4e268378", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53cbc6d68d8dd794d794370a4e268378");
        } else {
            a(context, null);
        }
    }

    public AutoFitTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f205da83dc30fa9d1063bad07e17250", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f205da83dc30fa9d1063bad07e17250");
        } else {
            a(context, attributeSet);
        }
    }

    public AutoFitTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e243e7d4537bd8d52048b7888c36ecbd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e243e7d4537bd8d52048b7888c36ecbd");
        } else {
            a(context, attributeSet);
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e0c8186088f6dd1a7e949227431b610", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e0c8186088f6dd1a7e949227431b610");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.cs_min_textSize, R.attr.cs_right_padding});
        this.b = obtainStyledAttributes.getFloat(0, 17.5f);
        this.c = obtainStyledAttributes.getFloat(1, 2.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98111e558a268fc14022b1321f5f4688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98111e558a268fc14022b1321f5f4688");
            return;
        }
        super.onDraw(canvas);
        String charSequence = getText().toString();
        int width = getWidth();
        Object[] objArr2 = {charSequence, Integer.valueOf(width)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a90c15b8ba81c04148248c95b2fa5cc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a90c15b8ba81c04148248c95b2fa5cc5");
        } else if (charSequence != null && width > 0) {
            Paint paint = new Paint();
            paint.set(getPaint());
            int width2 = ((getWidth() - getPaddingLeft()) - getPaddingRight()) - c.a(getContext(), this.c);
            float[] fArr = new float[charSequence.length()];
            Rect rect = new Rect();
            paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
            float textSize = getTextSize();
            for (int width3 = rect.width(); width3 > width2 && textSize > c.b(getContext(), this.b); width3 = paint.getTextWidths(charSequence, fArr)) {
                textSize -= 1.0f;
                paint.setTextSize(textSize);
            }
            if (textSize <= c.b(getContext(), this.b) && getEllipsize() != TextUtils.TruncateAt.START) {
                setEllipsize(TextUtils.TruncateAt.START);
            }
            setTextSize(0, textSize);
        }
    }
}
