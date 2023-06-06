package com.sankuai.waimai.bussiness.order.detailnew.widget.prioritydialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PriorityDialog extends Dialog {
    public static ChangeQuickRedirect b;
    public String c;
    public a d;
    public Object e;
    d f;
    public c g;
    public b h;

    public PriorityDialog(@NonNull Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eae7d3a07d0dbc57fc27df7b237d078", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eae7d3a07d0dbc57fc27df7b237d078");
        } else {
            this.d = a.NORMAL;
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "982b6cabd095211929e494f318dbf45d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "982b6cabd095211929e494f318dbf45d");
        } else if (e.a(this.c, this, this.e, this.d)) {
            try {
                super.show();
            } catch (WindowManager.BadTokenException e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05b7744cab429e446f715353032cf212", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05b7744cab429e446f715353032cf212");
            return;
        }
        super.dismiss();
        e.a(this.c, (Dialog) this);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z = true;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9b40fde842a6e91c1e89bad30863b20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9b40fde842a6e91c1e89bad30863b20")).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            View decorView = getWindow().getDecorView();
            int scaledWindowTouchSlop = ViewConfiguration.get(decorView.getContext()).getScaledWindowTouchSlop();
            int i = -scaledWindowTouchSlop;
            if (x >= i && y >= i && x <= decorView.getWidth() + scaledWindowTouchSlop && y <= decorView.getHeight() + scaledWindowTouchSlop) {
                z = false;
            }
            if (z && this.g != null) {
                this.g.a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2335441d4ced2ca31469ab26948fd28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2335441d4ced2ca31469ab26948fd28");
            return;
        }
        super.onBackPressed();
        if (this.h != null) {
            this.h.a();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a37d36521fae7bdea4f2d7aedbcd247", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a37d36521fae7bdea4f2d7aedbcd247")).booleanValue();
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return false;
        }
    }
}
