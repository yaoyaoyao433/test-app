package com.meituan.android.paycommon.lib.exception;

import android.app.Activity;
import android.support.constraint.R;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a {
    public static ChangeQuickRedirect f;
    protected Activity g;

    public abstract void a(PayException payException);

    public a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "731dbebcc6d96900b27690c216cb6fef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "731dbebcc6d96900b27690c216cb6fef");
        } else {
            this.g = activity;
        }
    }

    private void b(PayException payException) {
        Object[] objArr = {payException};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f282f9a10f7231760d763796e25e135a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f282f9a10f7231760d763796e25e135a");
        } else {
            a(payException.getMessage(), payException.getErrorCodeStr());
        }
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8395a1a42f1665ff5fbef94e97f3e391", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8395a1a42f1665ff5fbef94e97f3e391");
        } else {
            e.a(this.g, (Object) str);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf((int) R.string.cashier__error_msg_pay_later)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0db8ea97df4701ff638472571d6c58fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0db8ea97df4701ff638472571d6c58fb");
        } else {
            a(com.meituan.android.paycommon.lib.config.a.a().a.getString(R.string.cashier__error_msg_pay_later));
        }
    }

    public void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1d8b417968fb164f6cbcb3405ba884f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1d8b417968fb164f6cbcb3405ba884f");
        } else {
            e.a(this.g, str, str2);
        }
    }

    public void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84d7e30e02cc2a41334cb80f3de72d1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84d7e30e02cc2a41334cb80f3de72d1c");
        } else if (exc instanceof PayException) {
            PayException payException = (PayException) exc;
            Object[] objArr2 = {payException};
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec9dff97733ef8d3ac00c46eb9676e60", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec9dff97733ef8d3ac00c46eb9676e60");
            } else {
                com.meituan.android.paybase.common.analyse.a.a("b_dfqxkh81", new a.c().a("code", Integer.valueOf(payException.getCode())).a("level", Integer.valueOf(payException.getLevel())).a("message", payException.getMessage()).b);
            }
            switch (payException.getLevel()) {
                case 1:
                    Object[] objArr3 = {payException};
                    ChangeQuickRedirect changeQuickRedirect3 = f;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "864327797459fc7c0d7b3ac67dddd005", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "864327797459fc7c0d7b3ac67dddd005");
                        return;
                    } else {
                        b(payException);
                        return;
                    }
                case 2:
                    a(payException);
                    return;
                case 3:
                    Object[] objArr4 = {payException};
                    ChangeQuickRedirect changeQuickRedirect4 = f;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "90cdb7f25f5b8558d1dc80f378ddbdab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "90cdb7f25f5b8558d1dc80f378ddbdab");
                        return;
                    } else {
                        new PayDialog.a(this.g).c(payException.getMessage()).d(payException.getErrorCodeStr()).a().show();
                        return;
                    }
                case 4:
                    Object[] objArr5 = {payException};
                    ChangeQuickRedirect changeQuickRedirect5 = f;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "cf5e74e1d603b2b9235a7ef046bdb206", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "cf5e74e1d603b2b9235a7ef046bdb206");
                        return;
                    } else {
                        b(payException);
                        return;
                    }
                case 5:
                    Object[] objArr6 = {payException};
                    ChangeQuickRedirect changeQuickRedirect6 = f;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f8f1a39e9515962beef37a10102167cd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f8f1a39e9515962beef37a10102167cd");
                        return;
                    } else {
                        b(payException);
                        return;
                    }
                case 6:
                    Object[] objArr7 = {payException};
                    ChangeQuickRedirect changeQuickRedirect7 = f;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "4d8050e776884ddddfd141fa33a67867", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "4d8050e776884ddddfd141fa33a67867");
                        return;
                    } else {
                        b(payException);
                        return;
                    }
                default:
                    Object[] objArr8 = {payException};
                    ChangeQuickRedirect changeQuickRedirect8 = f;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "d38f68b3736343b415250bfe068d740a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "d38f68b3736343b415250bfe068d740a");
                        return;
                    } else {
                        b(payException);
                        return;
                    }
            }
        } else {
            c(exc);
        }
    }

    public void c(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef6d51e0cbd321bb16ebf9a63d3c1aa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef6d51e0cbd321bb16ebf9a63d3c1aa7");
        } else {
            a(com.meituan.android.paycommon.lib.config.a.a().a.getString(R.string.paycommon__error_msg_load_later));
        }
    }
}
