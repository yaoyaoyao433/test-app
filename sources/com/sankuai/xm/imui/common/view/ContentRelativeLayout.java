package com.sankuai.xm.imui.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ContentRelativeLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public boolean b;
    private float c;
    private int d;

    public void setMaxWidthRate(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "222c59b8122dd7a1c013c395c3cb42d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "222c59b8122dd7a1c013c395c3cb42d4");
            return;
        }
        this.c = f;
        setMaxWidthWithRatio(f);
    }

    public void setMaxWidth(int i) {
        this.d = i;
    }

    public ContentRelativeLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c9c99e369cdbeb5fbbebf2804655436", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c9c99e369cdbeb5fbbebf2804655436");
        }
    }

    public ContentRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5db72c4c2771a211458d86b3d1b4b00b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5db72c4c2771a211458d86b3d1b4b00b");
        }
    }

    public ContentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ca2a05f04800ecf714fa9ebec7111b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ca2a05f04800ecf714fa9ebec7111b4");
            return;
        }
        this.b = true;
        this.d = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.msgContentWidthRatio});
        this.c = obtainStyledAttributes.getFloat(0, 0.68f);
        setMaxWidthWithRatio(this.c);
        obtainStyledAttributes.recycle();
    }

    private void setMaxWidthWithRatio(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3efef25bc2d59ba0eae62d581334cf08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3efef25bc2d59ba0eae62d581334cf08");
        } else if (f <= 0.0f) {
        } else {
            this.d = (int) (getResources().getDisplayMetrics().widthPixels * f);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3c6c7bce6b66caa5ec3f6de0a1fe6ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3c6c7bce6b66caa5ec3f6de0a1fe6ab");
            return;
        }
        if (this.b && this.d > 0) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            if (size > this.d) {
                size = this.d;
            }
            i = View.MeasureSpec.makeMeasureSpec(size, mode);
        }
        super.onMeasure(i, i2);
    }
}
