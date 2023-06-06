package com.sankuai.waimai.store.base;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseRelativeLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public final List<f> b;
    private e c;

    public BaseRelativeLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50985e20741f3d0cdaaa7cdc73781681", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50985e20741f3d0cdaaa7cdc73781681");
        } else {
            this.b = new ArrayList();
        }
    }

    public BaseRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f61c468c4a063d4daa92cdf2ee253ecf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f61c468c4a063d4daa92cdf2ee253ecf");
        } else {
            this.b = new ArrayList();
        }
    }

    public BaseRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39058291fa83108971d61aa6b0cffe2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39058291fa83108971d61aa6b0cffe2e");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f6e6e1522be7aad50ed3c0583412587", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f6e6e1522be7aad50ed3c0583412587")).booleanValue();
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.b)) {
            int childCount = getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = getChildAt(i);
                Object[] objArr2 = {childAt, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b0737bf39fbc230288968d79aa47e420", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b0737bf39fbc230288968d79aa47e420")).booleanValue();
                } else {
                    if (childAt != null && motionEvent != null) {
                        float x = childAt.getX();
                        float y = childAt.getY();
                        if (motionEvent.getX() >= x && motionEvent.getX() <= x + childAt.getWidth() && motionEvent.getY() >= y && motionEvent.getY() <= y + childAt.getHeight()) {
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    for (f fVar : this.b) {
                        fVar.a(childAt, motionEvent);
                    }
                } else {
                    i++;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Activity activity;
        Window window;
        View decorView;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb31fb70e362e6441d046fa3fdfcdc55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb31fb70e362e6441d046fa3fdfcdc55");
            return;
        }
        if (this.c != null) {
            Object[] objArr2 = {this, this.c};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45e4b6f9bce7df4685f8339d7e6fabfd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45e4b6f9bce7df4685f8339d7e6fabfd");
            } else if ((getContext() instanceof Activity) && (window = (activity = (Activity) getContext()).getWindow()) != null && (decorView = window.getDecorView()) != null) {
                com.sankuai.shangou.stone.util.h.d(activity);
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                int i5 = rect.bottom;
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setKeyboardStatusChangeListener(e eVar) {
        this.c = eVar;
    }
}
