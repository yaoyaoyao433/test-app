package com.meituan.android.paybase.widgets.keyboard;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    private static final i b = new i();

    public static View.OnTouchListener a() {
        return b;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b955c357706f1b7942041ae434431b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b955c357706f1b7942041ae434431b")).booleanValue() : SafeKeyBoardView.a(view, motionEvent);
    }
}
