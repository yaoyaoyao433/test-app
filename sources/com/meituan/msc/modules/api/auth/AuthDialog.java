package com.meituan.msc.modules.api.auth;

import com.meituan.msc.modules.api.auth.a;
import com.meituan.msc.modules.page.widget.BottomDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AuthDialog extends BottomDialog {
    public static ChangeQuickRedirect a;
    private a c;

    @Override // com.meituan.msc.modules.page.widget.BottomDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49a6caa70338e0c4dfa3db8256bc48d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49a6caa70338e0c4dfa3db8256bc48d6");
        } else {
            super.dismiss();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11b79b6cf29d5f33518f190e8fe394f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11b79b6cf29d5f33518f190e8fe394f3");
            return;
        }
        super.cancel();
        this.c.a(0);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements a.InterfaceC0453a {
        public static ChangeQuickRedirect a;
        public a.InterfaceC0453a b;
        public final /* synthetic */ AuthDialog c;

        @Override // com.meituan.msc.modules.api.auth.a.InterfaceC0453a
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78bb87f603f579acd3603053a212a8a5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78bb87f603f579acd3603053a212a8a5");
                return;
            }
            if (i == 1 || i == -1) {
                this.c.dismiss();
            }
            if (this.b != null) {
                this.b.a(i);
            }
        }
    }
}
