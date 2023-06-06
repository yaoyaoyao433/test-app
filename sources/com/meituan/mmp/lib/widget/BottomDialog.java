package com.meituan.mmp.lib.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.support.constraint.R;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BottomDialog extends Dialog {
    public static ChangeQuickRedirect e;
    private Context a;

    public BottomDialog(Context context) {
        super(context, R.style.MMPBackgroundDialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41e4b559eb693972829e1ea7259ff13a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41e4b559eb693972829e1ea7259ff13a");
        } else {
            this.a = context;
        }
    }

    @Override // android.app.Dialog
    public void show() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73738513eb89fcfd9361131243948b42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73738513eb89fcfd9361131243948b42");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c82a5f33bad9e37138c0e198dae1e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c82a5f33bad9e37138c0e198dae1e51");
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
            ChangeQuickRedirect changeQuickRedirect3 = e;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f6615a00c0cbd34baef074b75682c3c7", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f6615a00c0cbd34baef074b75682c3c7")).booleanValue();
            } else if (this.a != null && (this.a instanceof Activity) && !((Activity) this.a).isFinishing()) {
                z = true;
            }
            if (z) {
                super.show();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d400082895e9d5279ae89f49801dd906", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d400082895e9d5279ae89f49801dd906");
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
