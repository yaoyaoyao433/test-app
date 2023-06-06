package com.meituan.android.widget;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ScaleFontTextView extends TextView {
    public static ChangeQuickRedirect a;

    public ScaleFontTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6f3fe8e25eadd81cda3fc8deae0e36c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6f3fe8e25eadd81cda3fc8deae0e36c");
        }
    }

    public ScaleFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca85ce5ac9a8b723dad13057e70fab8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca85ce5ac9a8b723dad13057e70fab8e");
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "458d1efe7427a4883b3917db494e34e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "458d1efe7427a4883b3917db494e34e4");
            return;
        }
        super.onTextChanged(charSequence, i, i2, i3);
        a(this, charSequence.toString());
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "872ae6b1577f27540bc3d289684e200a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "872ae6b1577f27540bc3d289684e200a");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            a(this, getText().toString());
        }
    }

    private void a(TextView textView, String str) {
        float f;
        float measureText;
        char c = 2;
        char c2 = 1;
        Object[] objArr = {textView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "824498af8041cb19f00121ab09e829ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "824498af8041cb19f00121ab09e829ff");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            float width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
            float f2 = 0.0f;
            if (width <= 0.0f) {
                return;
            }
            float textSize = textView.getTextSize();
            if (textSize <= 0.0f) {
                return;
            }
            Paint paint = new Paint();
            float f3 = textSize / 15.0f;
            float f4 = f3 > 1.0f ? f3 : 1.0f;
            float f5 = textSize;
            while (true) {
                if (f5 <= f2) {
                    f = f5;
                    break;
                }
                Object[] objArr2 = new Object[3];
                objArr2[0] = paint;
                objArr2[c2] = Float.valueOf(f5);
                objArr2[c] = str;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                f = f5;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7cf8e66ce86a7cf568be87bb27bc862", RobustBitConfig.DEFAULT_VALUE)) {
                    measureText = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7cf8e66ce86a7cf568be87bb27bc862")).floatValue();
                } else {
                    paint.setTextSize(f);
                    measureText = paint.measureText(str);
                }
                if (measureText < width) {
                    break;
                }
                f5 = f - f4;
                c = 2;
                c2 = 1;
                f2 = 0.0f;
            }
            Object[] objArr3 = {this, Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b49d1695de4476c1fce5bf0899e7ef1d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b49d1695de4476c1fce5bf0899e7ef1d");
            } else if (Float.compare(f, getTextSize()) != 0) {
                setTextSize(0, f);
            }
        }
    }
}
