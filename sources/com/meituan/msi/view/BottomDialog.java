package com.meituan.msi.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.support.constraint.R;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.msi.util.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BottomDialog extends Dialog {
    public static ChangeQuickRedirect b;
    private Context a;

    public BottomDialog(Context context) {
        super(context, R.style.MSIBackgroundDialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0987f75dc84a0ca19c1a97b3eca001e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0987f75dc84a0ca19c1a97b3eca001e");
        } else {
            this.a = context;
        }
    }

    @Override // android.app.Dialog
    public void show() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcd24f8db125a46af017102af3bd7d20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcd24f8db125a46af017102af3bd7d20");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ffc367ce8c7b91e9e2446f40d775e223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ffc367ce8c7b91e9e2446f40d775e223");
        } else {
            Window window = getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Rect rect = new Rect();
                ((ViewGroup) getWindow().getDecorView()).getWindowVisibleDisplayFrame(rect);
                attributes.width = rect.right - rect.left;
                attributes.gravity = 80;
                window.setAttributes(attributes);
            }
        }
        try {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a6246297f3e2290552ffa78a90e1c006", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a6246297f3e2290552ffa78a90e1c006")).booleanValue();
            } else if (this.a != null && (this.a instanceof Activity) && !((Activity) this.a).isFinishing()) {
                z = true;
            }
            if (z) {
                super.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
            com.meituan.msi.log.a.a(ae.a("dialog", e));
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c71a92769ecdedad8bebafadd78b634a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c71a92769ecdedad8bebafadd78b634a");
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
            com.meituan.msi.log.a.a(ae.a("dialog", e));
        }
    }
}
