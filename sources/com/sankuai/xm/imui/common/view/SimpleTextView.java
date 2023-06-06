package com.sankuai.xm.imui.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SimpleTextView extends View {
    public static ChangeQuickRedirect a;
    private TextView b;

    public SimpleTextView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bccbe0969e50258bf8012ddbf0a30f97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bccbe0969e50258bf8012ddbf0a30f97");
        }
    }

    public SimpleTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f62e43c8460b8b3215bab99bbc13dd72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f62e43c8460b8b3215bab99bbc13dd72");
        }
    }

    public SimpleTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "890e2c1364e17da451fed5bd54554cd9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "890e2c1364e17da451fed5bd54554cd9");
        } else {
            this.b = new TextView(context, attributeSet, i);
        }
    }

    public void setText(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46785baf85065886595dab5592f22361", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46785baf85065886595dab5592f22361");
        } else {
            this.b.setText(charSequence);
        }
    }

    public void setText(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b690b3ac0094cb0b4396b55f1d5a708", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b690b3ac0094cb0b4396b55f1d5a708");
        } else {
            this.b.setText(i);
        }
    }

    public void setTextSize(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52c2f713cfd2c01a7a09fc6f2cab9782", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52c2f713cfd2c01a7a09fc6f2cab9782");
        } else {
            this.b.setTextSize(f);
        }
    }

    public void setTextColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f42868e12ca3ba6633c99d16ded7fe57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f42868e12ca3ba6633c99d16ded7fe57");
        } else {
            this.b.setTextColor(i);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba9f83504f95f4222c3a1544789e8889", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba9f83504f95f4222c3a1544789e8889");
            return;
        }
        super.setLayoutParams(layoutParams);
        this.b.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac5504c6d1a1a7cf8b34a079fa801373", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac5504c6d1a1a7cf8b34a079fa801373");
            return;
        }
        super.setEnabled(z);
        this.b.setEnabled(z);
    }

    @Override // android.view.View
    public void layout(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c14c493f6f3c5ff01efb6daa7a32394", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c14c493f6f3c5ff01efb6daa7a32394");
            return;
        }
        super.layout(i, i2, i3, i4);
        this.b.layout(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb1ca0ffabb6344b0bb28080079e4815", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb1ca0ffabb6344b0bb28080079e4815");
            return;
        }
        super.onMeasure(i, i2);
        this.b.measure(i, i2);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55acfd48f3f91355f3aa3352753d43ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55acfd48f3f91355f3aa3352753d43ac");
        } else {
            this.b.draw(canvas);
        }
    }
}
