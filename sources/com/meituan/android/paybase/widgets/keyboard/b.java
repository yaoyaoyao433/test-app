package com.meituan.android.paybase.widgets.keyboard;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    private static final b b = new b();

    public static View.OnTouchListener a() {
        return b;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object accessDispatch;
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a2d273abc2e766a0a7ded5a7f48c854", RobustBitConfig.DEFAULT_VALUE)) {
            accessDispatch = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a2d273abc2e766a0a7ded5a7f48c854");
        } else {
            Object[] objArr2 = {view, motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ee5967a00dfde27f40e3fbdbd4be7d95", RobustBitConfig.DEFAULT_VALUE)) {
                return motionEvent.getAction() == 2;
            }
            accessDispatch = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ee5967a00dfde27f40e3fbdbd4be7d95");
        }
        return ((Boolean) accessDispatch).booleanValue();
    }
}
