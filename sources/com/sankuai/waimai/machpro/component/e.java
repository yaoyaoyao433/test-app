package com.sankuai.waimai.machpro.component;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    c b;
    View.OnTouchListener c;

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6751e5e7103272cc4329ba8f59211d8c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6751e5e7103272cc4329ba8f59211d8c")).booleanValue();
        }
        boolean onTouch = this.b != null ? false | this.b.onTouch(view, motionEvent) : false;
        return this.c != null ? onTouch | this.c.onTouch(view, motionEvent) : onTouch;
    }
}
