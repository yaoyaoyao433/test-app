package com.sankuai.xm.imui.session.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.app.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.g;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SafeDialog extends AlertDialog {
    public static ChangeQuickRedirect b;

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9a2b0a3aa967577d3f9426728166b1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9a2b0a3aa967577d3f9426728166b1a");
        } else {
            g.a((Dialog) this);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends AlertDialog.a {
        public static ChangeQuickRedirect b;
        private Context c;

        public a(@NonNull Context context) {
            super(context, R.style.xm_sdk_alert_dialog);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2321ff153385d80c3c3a7674e788164", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2321ff153385d80c3c3a7674e788164");
            } else {
                this.c = context;
            }
        }

        @Override // android.support.v7.app.AlertDialog.a
        public final AlertDialog a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "288f4ea25721bf4376c4bbdc6cbbd9ce", 6917529027641081856L) ? (AlertDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "288f4ea25721bf4376c4bbdc6cbbd9ce") : (AlertDialog) g.a(super.a(), this.c);
        }

        @Override // android.support.v7.app.AlertDialog.a
        public final AlertDialog b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eff01e990a0cc1ca9c3d520ddd731aa2", 6917529027641081856L)) {
                return (AlertDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eff01e990a0cc1ca9c3d520ddd731aa2");
            }
            AlertDialog a = a();
            Object[] objArr2 = {a};
            ChangeQuickRedirect changeQuickRedirect2 = g.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b2360f2145d762d0dc7e50e2cbf0384d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b2360f2145d762d0dc7e50e2cbf0384d");
            } else {
                Activity b2 = g.b(a);
                if (ActivityUtils.a(b2)) {
                    g.b(a, b2);
                }
            }
            return a;
        }
    }
}
