package com.sankuai.waimai.store.drug.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
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
    public final List<a> b;

    public BaseRelativeLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2682607cfa206bd6adb9f087b1e0c711", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2682607cfa206bd6adb9f087b1e0c711");
        } else {
            this.b = new ArrayList();
        }
    }

    public BaseRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6de376cfb4cc431625654cee557f08f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6de376cfb4cc431625654cee557f08f6");
        } else {
            this.b = new ArrayList();
        }
    }

    public BaseRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11d519551976db92bae29f9373510c41", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11d519551976db92bae29f9373510c41");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f4bc06399c8838735fae5a7e3c770ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f4bc06399c8838735fae5a7e3c770ed")).booleanValue();
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
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4b6f6998b2832212983dffe2747109b3", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4b6f6998b2832212983dffe2747109b3")).booleanValue();
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
                    for (a aVar : this.b) {
                        aVar.a(childAt, motionEvent);
                    }
                } else {
                    i++;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
