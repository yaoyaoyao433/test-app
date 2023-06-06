package com.meituan.mmp.lib.api.auth;

import android.app.Activity;
import android.support.constraint.R;
import android.view.Window;
import android.widget.RelativeLayout;
import com.meituan.mmp.lib.widget.BottomDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AuthDialog extends BottomDialog {
    public static ChangeQuickRedirect a;
    a b;
    Activity c;
    RelativeLayout d;

    public AuthDialog(Activity activity, i iVar) {
        super(activity);
        Object[] objArr = {activity, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe8c70cad3beb5ecd77f9765b9f50079", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe8c70cad3beb5ecd77f9765b9f50079");
            return;
        }
        this.c = activity;
        a aVar = new a();
        aVar.b = iVar;
        this.b = aVar;
        this.d = new RelativeLayout(this.c);
        setContentView(this.d);
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.MMPDialogExitAnimation);
        }
    }

    @Override // com.meituan.mmp.lib.widget.BottomDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb636863229da0a3e098bc4a67263d64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb636863229da0a3e098bc4a67263d64");
        } else {
            super.dismiss();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d0e464bd41846d997d41f59b1257cb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d0e464bd41846d997d41f59b1257cb7");
            return;
        }
        super.cancel();
        this.b.a(0);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class a implements i {
        public static ChangeQuickRedirect a;
        public i b;

        public a() {
        }

        @Override // com.meituan.mmp.lib.api.auth.i
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eb8ed6ce87c79948d60d67f204fd740", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eb8ed6ce87c79948d60d67f204fd740");
                return;
            }
            if (i == 1 || i == -1) {
                AuthDialog.this.dismiss();
            }
            if (this.b != null) {
                this.b.a(i);
            }
        }
    }
}
