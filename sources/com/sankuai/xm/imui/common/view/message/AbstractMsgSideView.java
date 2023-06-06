package com.sankuai.xm.imui.common.view.message;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.session.entity.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class AbstractMsgSideView extends RelativeLayout implements a {
    public static ChangeQuickRedirect c;
    @Deprecated
    protected b d;

    private static boolean a(int i, int i2) {
        return (i & i2) == i2;
    }

    public void b(b bVar) {
    }

    public void c(b bVar) {
    }

    public void d(b bVar) {
    }

    public void e(b bVar) {
    }

    public AbstractMsgSideView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20fd27686466f4fb6fc3572e83dfc40e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20fd27686466f4fb6fc3572e83dfc40e");
        }
    }

    public AbstractMsgSideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49fae27faf5009803f0312c00396893c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49fae27faf5009803f0312c00396893c");
        }
    }

    public AbstractMsgSideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "811dee1171a0d29c20ae0bc6631114c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "811dee1171a0d29c20ae0bc6631114c1");
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        int measuredWidth;
        int measuredWidth2;
        int measuredHeight2;
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc7a157d2ea82e829981dfb76fa27be8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc7a157d2ea82e829981dfb76fa27be8");
            return;
        }
        super.onMeasure(i, i2);
        boolean z2 = getLayoutParams().width == -2 && View.MeasureSpec.getMode(i) != 1073741824;
        z = (getLayoutParams().height != -2 || View.MeasureSpec.getMode(i2) == 1073741824) ? false : false;
        if (z2 || z) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) childAt.getLayoutParams();
                    if (childAt.getMeasuredHeight() > 0 && (measuredHeight2 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin) > i3) {
                        i3 = measuredHeight2;
                    }
                    if (childAt.getMeasuredWidth() > 0 && (measuredWidth2 = childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin) > i4) {
                        i4 = measuredWidth2;
                    }
                }
            }
            if (i3 > 0 && z) {
                measuredHeight = i3 + getPaddingTop() + getPaddingBottom();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            if (i4 > 0 && z2) {
                measuredWidth = i4 + getPaddingLeft() + getPaddingRight();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            if (measuredWidth <= 0 || measuredHeight <= 0) {
                return;
            }
            setMeasuredDimension(measuredWidth, measuredHeight);
        }
    }

    @CallSuper
    public void a(b bVar) {
        this.d = bVar;
    }

    @CallSuper
    public final void a(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcf611a901ee3ffdbd5c92b4bd82cc65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcf611a901ee3ffdbd5c92b4bd82cc65");
            return;
        }
        if (a(i, 1)) {
            d(bVar);
        }
        if (a(i, 4)) {
            e(bVar);
        }
        if (a(i, 8)) {
            c(bVar);
        }
        if (a(i, 16)) {
            b(bVar);
        }
    }

    public b getMessage() {
        return this.d;
    }
}
