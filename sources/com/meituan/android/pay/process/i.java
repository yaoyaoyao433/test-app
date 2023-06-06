package com.meituan.android.pay.process;

import android.support.v4.app.FragmentActivity;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.paybase.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements f.InterfaceC0337f {
    public static ChangeQuickRedirect a;
    private final FragmentActivity b;
    private final BankInfo c;

    public i(FragmentActivity fragmentActivity, BankInfo bankInfo) {
        this.b = fragmentActivity;
        this.c = bankInfo;
    }

    @Override // com.meituan.android.paybase.utils.f.InterfaceC0337f
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a8c3a70c928a80f301fd3c8dda6e594", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a8c3a70c928a80f301fd3c8dda6e594");
        } else {
            g.a(this.b, this.c, z);
        }
    }
}
