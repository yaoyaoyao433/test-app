package com.sankuai.waimai.store.drug.alita.marketing.guesture;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends FrameLayout {
    public static ChangeQuickRedirect a;
    private a b;

    public b(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efa67e4aec91575d4324ed7589d62bad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efa67e4aec91575d4324ed7589d62bad");
        }
    }

    public final void setGestureDelegate(a aVar) {
        this.b = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0149, code lost:
        if (java.lang.Math.abs(r1) <= android.view.ViewConfiguration.get(com.meituan.android.singleton.b.a).getScaledMinimumFlingVelocity()) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015a, code lost:
        if (java.lang.Math.abs(r3) > com.sankuai.shangou.stone.util.h.a(com.meituan.android.singleton.b.a, 20.0f)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015c, code lost:
        r1 = true;
     */
    @Override // android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.drug.alita.marketing.guesture.b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe104b800124bf81012637bba1c82efd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe104b800124bf81012637bba1c82efd")).booleanValue();
        }
        if (this.b != null) {
            a aVar = this.b;
            Object[] objArr2 = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "51c2690661fade10d6c59b6418f91de5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "51c2690661fade10d6c59b6418f91de5")).booleanValue();
            }
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                aVar.c = rawX;
                aVar.d = rawY;
            } else if (actionMasked == 2 && Math.abs(rawY - aVar.d) > Math.abs(rawX - aVar.c)) {
                aVar.e = rawY;
                aVar.f = aVar.b.getTranslationY();
                return true;
            }
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
