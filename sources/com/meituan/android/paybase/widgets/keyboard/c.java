package com.meituan.android.paybase.widgets.keyboard;

import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final EditText c;

    private c(a aVar, EditText editText) {
        this.b = aVar;
        this.c = editText;
    }

    public static Runnable a(a aVar, EditText editText) {
        Object[] objArr = {aVar, editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab3baf8f9c309e91ee1c1f674a733d72", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab3baf8f9c309e91ee1c1f674a733d72") : new c(aVar, editText);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eec2f80af17f6c90940429156abaced4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eec2f80af17f6c90940429156abaced4");
            return;
        }
        a aVar = this.b;
        EditText editText = this.c;
        Object[] objArr2 = {aVar, editText};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6e5586f2728113c0acac6a628d361334", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6e5586f2728113c0acac6a628d361334");
            return;
        }
        aVar.b(editText);
        aVar.h = false;
    }
}
