package com.meituan.android.pay.process.ntv.sign;

import android.support.v4.app.FragmentActivity;
import com.meituan.android.pay.fragment.VerifyBankInfoFragment;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.process.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    FragmentActivity b;
    private BankInfo c;

    @Override // com.meituan.android.pay.process.d
    public final String a() {
        return "SignPayCenter";
    }

    public a(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2b1bb635ab1ab3ed092af99f49b031e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2b1bb635ab1ab3ed092af99f49b031e");
        } else {
            this.b = fragmentActivity;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01af  */
    @Override // com.meituan.android.pay.process.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.process.ntv.sign.a.a(java.lang.Object):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(BankInfo bankInfo) {
        Object[] objArr = {bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29fdf1eb508741ea6d74a9ae332240d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29fdf1eb508741ea6d74a9ae332240d9");
            return;
        }
        com.meituan.android.paybase.metrics.a.b("BankInfo_launch_time", getClass().getName() + "request_end");
        VerifyBankInfoFragment verifyBankInfoFragment = new VerifyBankInfoFragment();
        if (com.meituan.android.pay.desk.component.data.b.e(this.b)) {
            com.meituan.android.pay.fragment.b.c(this.b, verifyBankInfoFragment, bankInfo);
        } else if (com.meituan.android.pay.utils.c.e(bankInfo)) {
            com.meituan.android.pay.fragment.b.a(this.b, verifyBankInfoFragment, bankInfo);
        } else {
            com.meituan.android.pay.fragment.b.b(this.b, verifyBankInfoFragment, bankInfo);
        }
    }
}
