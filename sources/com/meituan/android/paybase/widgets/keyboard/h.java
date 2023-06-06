package com.meituan.android.paybase.widgets.keyboard;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    private final SafeEditText b;

    public h(SafeEditText safeEditText) {
        this.b = safeEditText;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64e7d6129b7a51a204757a9925367f09", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64e7d6129b7a51a204757a9925367f09")).booleanValue() : SafeEditText.a(this.b, view, motionEvent);
    }
}
