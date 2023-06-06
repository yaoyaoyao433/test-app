package com.sankuai.eh.component.web.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.web.module.c;
import com.sankuai.eh.component.web.plugins.core.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHRelativeLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private c b;

    public EHRelativeLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ec8da6bea9283ac5cc7c4cd24647645", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ec8da6bea9283ac5cc7c4cd24647645");
        } else {
            this.b = b.a(context);
        }
    }

    public EHRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27cd3e5933877d122c0365146356d3a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27cd3e5933877d122c0365146356d3a9");
        } else {
            this.b = b.a(context);
        }
    }

    public EHRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a62399fb84bc9531386b5608d2b8bc08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a62399fb84bc9531386b5608d2b8bc08");
        } else {
            this.b = b.a(context);
        }
    }

    public EHRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ee147272c101fbce079a1927bf4dce8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ee147272c101fbce079a1927bf4dce8");
        } else {
            this.b = b.a(context);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378fe97525127d85d6570f14ecf1f0b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378fe97525127d85d6570f14ecf1f0b2")).booleanValue();
        }
        if (this.b != null) {
            this.b.r = motionEvent.getFlags();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
