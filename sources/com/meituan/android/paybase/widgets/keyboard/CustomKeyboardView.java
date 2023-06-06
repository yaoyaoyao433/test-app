package com.meituan.android.paybase.widgets.keyboard;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.support.constraint.R;
import android.util.AttributeSet;
import com.meituan.android.paybase.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CustomKeyboardView extends KeyboardView {
    public static ChangeQuickRedirect a;
    private Paint b;
    private Rect c;
    private int d;
    private int e;
    private int f;
    private int g;

    public CustomKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04a278f3f7b91b740123260800343e93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04a278f3f7b91b740123260800343e93");
        } else {
            a(context, attributeSet);
        }
    }

    public CustomKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ec50f0249308370a4718e747b5f3564", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ec50f0249308370a4718e747b5f3564");
        } else {
            a(context, attributeSet);
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aa3570d93e0b115accaee9c8a395c61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aa3570d93e0b115accaee9c8a395c61");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.keyFontSize, R.attr.keyFontColor});
        this.d = obtainStyledAttributes.getDimensionPixelSize(0, 26);
        this.e = obtainStyledAttributes.getColor(1, -16777216);
        obtainStyledAttributes.recycle();
        this.b = a();
        this.c = new Rect();
    }

    private Paint a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd31aa9d732377e2ebcceb522fa3afcb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Paint) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd31aa9d732377e2ebcceb522fa3afcb");
        }
        Paint paint = new Paint();
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        paint.setTextSize(this.d);
        paint.setColor(this.e);
        Typeface a2 = m.a(getContext());
        if (a2 != null) {
            paint.setTypeface(a2);
        }
        return paint;
    }

    @Override // android.inputmethodservice.KeyboardView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ae4640f068419e159e54d62dc26d301", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ae4640f068419e159e54d62dc26d301");
            return;
        }
        super.onDraw(canvas);
        Keyboard keyboard = getKeyboard();
        if (keyboard != null) {
            List<Keyboard.Key> keys = keyboard.getKeys();
            if (com.meituan.android.paybase.utils.i.a((Collection) keys)) {
                return;
            }
            for (Keyboard.Key key : keys) {
                int i = key.codes[0];
                if (i == 46 || i == 88 || i == -5) {
                    if (i == -5 && this.g > 0) {
                        a(this.g, canvas, key);
                    } else {
                        a(this.f, canvas, key);
                    }
                    key.icon.setBounds((key.x + (key.width / 2)) - (key.icon.getIntrinsicWidth() / 2), (key.y + (key.height / 2)) - (key.icon.getIntrinsicHeight() / 2), key.x + (key.width / 2) + (key.icon.getIntrinsicWidth() / 2), key.y + (key.height / 2) + (key.icon.getIntrinsicHeight() / 2));
                    key.icon.draw(canvas);
                } else if (i == 0) {
                    if (this.g > 0) {
                        a(this.g, canvas, key);
                    } else {
                        a(R.color.paybase__white, canvas, key);
                    }
                } else {
                    a(this.f, canvas, key);
                }
                this.c.left = key.x;
                this.c.top = key.y;
                this.c.right = key.x + key.width;
                this.c.bottom = key.y + key.height;
                if (key.label != null) {
                    Paint.FontMetricsInt fontMetricsInt = this.b.getFontMetricsInt();
                    this.b.setTextAlign(Paint.Align.CENTER);
                    canvas.drawText(key.label.toString(), this.c.centerX(), (((this.c.bottom - fontMetricsInt.bottom) + this.c.top) - fontMetricsInt.top) / 2, this.b);
                }
            }
        }
    }

    private Drawable a(int i, Keyboard.Key key) {
        Object[] objArr = {Integer.valueOf(i), key};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e8c7f873f86f3369ba867af68b817cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e8c7f873f86f3369ba867af68b817cd");
        }
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.paybase__password_keyboard_button);
        int i2 = key.codes[0];
        if (i == 0) {
            return i2 == 0 ? getContext().getResources().getDrawable(R.color.paybase__white) : drawable;
        }
        try {
            return getContext().getResources().getDrawable(i);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "CustomKeyboardView_getKeyBackgroundDrawable", (Map<String, Object>) null);
            return drawable;
        }
    }

    private void a(int i, Canvas canvas, Keyboard.Key key) {
        Object[] objArr = {Integer.valueOf(i), canvas, key};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a2e8d83c747931542ec3b197dc122f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a2e8d83c747931542ec3b197dc122f1");
            return;
        }
        Drawable a2 = a(i, key);
        int[] currentDrawableState = key.getCurrentDrawableState();
        if (key.codes[0] != 0) {
            a2.setState(currentDrawableState);
        }
        a2.setBounds(key.x, key.y, key.x + key.width, key.y + key.height);
        a2.draw(canvas);
    }

    public void setKeyDrawableId(int i) {
        this.f = i;
    }

    public void setSpecialKeyBackground(int i) {
        this.g = i;
    }
}
