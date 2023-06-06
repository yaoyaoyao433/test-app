package com.sankuai.waimai.touchmatrix.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SafeTouchDialog extends Dialog {
    public static ChangeQuickRedirect a;

    public SafeTouchDialog(@NonNull Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1db8eec7f0fa98b3b67612461e187d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1db8eec7f0fa98b3b67612461e187d6");
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14e69a0bb020bbc48d78314cf4d06b86", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14e69a0bb020bbc48d78314cf4d06b86")).booleanValue();
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
            return false;
        }
    }
}
