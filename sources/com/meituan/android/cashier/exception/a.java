package com.meituan.android.cashier.exception;

import android.support.constraint.R;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.activity.MTCashierWrapperActivity;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paycommon.lib.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a extends com.meituan.android.paycommon.lib.exception.a {
    public static ChangeQuickRedirect c;
    MTCashierActivity d;

    public abstract void b(Exception exc);

    public a(MTCashierActivity mTCashierActivity) {
        super(mTCashierActivity);
        Object[] objArr = {mTCashierActivity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acf4a74592e5a85ded7d6555c59be1e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acf4a74592e5a85ded7d6555c59be1e6");
        } else {
            this.d = mTCashierActivity;
        }
    }

    @Override // com.meituan.android.paycommon.lib.exception.a
    public final void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8db453d48d44f7570d058e490dcbcfb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8db453d48d44f7570d058e490dcbcfb4");
            return;
        }
        b(exc);
        if (exc instanceof PayException) {
            PayException payException = (PayException) exc;
            Object[] objArr2 = {payException};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07c5978885d94666a2c40d8b07078fa7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07c5978885d94666a2c40d8b07078fa7");
                return;
            }
            int code = payException.getCode();
            String message = payException.getMessage();
            com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "dealPayException", com.meituan.android.paybase.common.analyse.a.a("errorCode:" + code, "errorMsg:" + message), "");
            if (code != 117003) {
                if (code == 118021) {
                    a(R.string.cashier__error_msg_pay_later);
                    return;
                } else {
                    super.a((Exception) payException);
                    return;
                }
            }
            BasePayDialog.b d = new PayDialog.a(this.d).c(message).d(payException.getErrorCodeStr());
            Object[] objArr3 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            d.b("知道了", PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "318dda759c42245ef6d98ec470880c79", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "318dda759c42245ef6d98ec470880c79") : new b(this)).a().show();
            return;
        }
        super.a(exc);
    }

    @Override // com.meituan.android.paycommon.lib.exception.a
    public final void c(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "073e4eac6bd3e874f8d9bddb37585b7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "073e4eac6bd3e874f8d9bddb37585b7c");
            return;
        }
        a(R.string.cashier__error_msg_pay_later);
        com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "onGotPayException", this.d.getString(R.string.cashier__error_msg_pay_later), "");
    }

    @Override // com.meituan.android.paycommon.lib.exception.a
    public final void a(PayException payException) {
        Object[] objArr = {payException};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d25920cf449e9e849e624c520eaa7a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d25920cf449e9e849e624c520eaa7a1");
        } else if (com.meituan.android.cashier.util.a.a().b()) {
            d.a(this.g, payException.getMessage(), payException.getErrorCodeStr(), MTCashierActivity.class);
        } else {
            d.a(this.g, payException.getMessage(), payException.getErrorCodeStr(), MTCashierWrapperActivity.class);
        }
    }
}
