package com.meituan.android.neohybrid.neo.breathe;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    private final a b;

    private b(a aVar) {
        this.b = aVar;
    }

    public static View.OnTouchListener a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb96b4482ee721937e74f4854bb488aa", RobustBitConfig.DEFAULT_VALUE) ? (View.OnTouchListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb96b4482ee721937e74f4854bb488aa") : new b(aVar);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d7ec6894af6d2d360988b073da61675", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d7ec6894af6d2d360988b073da61675")).booleanValue() : a.a(this.b, view, motionEvent);
    }
}
