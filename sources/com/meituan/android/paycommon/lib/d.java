package com.meituan.android.paycommon.lib;

import android.content.DialogInterface;
import com.meituan.android.paycommon.lib.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements DialogInterface.OnCancelListener {
    public static ChangeQuickRedirect a;
    private final a.InterfaceC0339a b;

    private d(a.InterfaceC0339a interfaceC0339a) {
        this.b = interfaceC0339a;
    }

    public static DialogInterface.OnCancelListener a(a.InterfaceC0339a interfaceC0339a) {
        Object[] objArr = {interfaceC0339a};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0548688b676b9c76cf3a850a5ed9edbe", RobustBitConfig.DEFAULT_VALUE) ? (DialogInterface.OnCancelListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0548688b676b9c76cf3a850a5ed9edbe") : new d(interfaceC0339a);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71fcc5b9bd709d040e62e04649f2ad19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71fcc5b9bd709d040e62e04649f2ad19");
            return;
        }
        a.InterfaceC0339a interfaceC0339a = this.b;
        Object[] objArr2 = {interfaceC0339a, dialogInterface};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1d93ee2a0a2422df95b87c6cd25878a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1d93ee2a0a2422df95b87c6cd25878a7");
        } else {
            interfaceC0339a.a();
        }
    }
}
