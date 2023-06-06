package com.dianping.gcmrnmodule.components.horizontalScrollBarrier;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.react.views.view.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends f {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private int d;
    private int e;
    private double f;
    private String g;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14168476eb5c66023a49425810274604", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14168476eb5c66023a49425810274604");
            return;
        }
        this.f = 2.0d;
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void setScrollBarrierScale(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbf9a0384d91b2931471cf60c3279fdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbf9a0384d91b2931471cf60c3279fdd");
        } else {
            this.f = d;
        }
    }

    public final void setScrolBarrierDirection(String str) {
        this.g = str;
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74b07ccca0d8f6811964fe3a98bc3728", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74b07ccca0d8f6811964fe3a98bc3728")).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.d = motionEvent.getPointerId(0);
            this.b = (int) (motionEvent.getX() + 0.5f);
            this.c = (int) (motionEvent.getY() + 0.5f);
        } else if (motionEvent.getAction() == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.d);
            if (findPointerIndex < 0) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int abs = Math.abs(this.b - ((int) (motionEvent.getX(findPointerIndex) + 0.5f)));
            int abs2 = Math.abs(this.c - ((int) (motionEvent.getY(findPointerIndex) + 0.5f)));
            if (TextUtils.equals(this.g, "horizontal")) {
                if (abs2 > abs / this.f && abs2 > this.e) {
                    return true;
                }
            } else if (abs > abs2 / this.f && abs > this.e) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
