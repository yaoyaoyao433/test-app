package com.sankuai.waimai.bussiness.order.confirm.verify;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.yoda.YodaConfirm;
import com.meituan.android.yoda.YodaResponseListener;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.verify.yoda.YodaVerificationContract;
import com.sankuai.waimai.bussiness.order.confirm.verify.yoda.b;
import com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate;
import com.sankuai.waimai.foundation.core.base.activity.transfer.LaunchModeProvider;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.platform.capacity.immersed.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class VerificationActivityDelegate extends BaseActivityDelegate implements YodaVerificationContract.View, LaunchModeProvider {
    public static ChangeQuickRedirect a;
    private Bundle b;
    private int c;
    private String d;
    private String e;
    private int f;

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate
    public final boolean aG_() {
        return true;
    }

    public VerificationActivityDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9964764ba3df00c6f63e6dcb5402ebba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9964764ba3df00c6f63e6dcb5402ebba");
        } else {
            this.f = 0;
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void a(TransferActivity transferActivity, @Nullable Bundle bundle) {
        YodaConfirm yodaConfirm;
        Object[] objArr = {transferActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ede5cb8fc454d8c56377cd9c5168a1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ede5cb8fc454d8c56377cd9c5168a1c");
            return;
        }
        super.a(transferActivity, bundle);
        this.b = transferActivity.getIntent().getExtras();
        if (this.b == null) {
            transferActivity.finish();
            return;
        }
        this.d = this.b.getString("order_token");
        this.c = this.b.getInt("wm_verify_user_type");
        this.e = this.b.getString("phone");
        this.f = this.b.getInt("source", 0);
        String string = this.b.getString("yoda_request_code", "");
        a.b(transferActivity, false);
        Object[] objArr2 = {string};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6a504610a5c97a1e83d2d28366bafdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6a504610a5c97a1e83d2d28366bafdb");
            return;
        }
        final com.sankuai.waimai.bussiness.order.confirm.verify.yoda.a aVar = new com.sankuai.waimai.bussiness.order.confirm.verify.yoda.a(this.c, this.e, this.d, this.f, k());
        try {
            TransferActivity transferActivity2 = this.h;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.confirm.verify.yoda.a.a;
            yodaConfirm = YodaConfirm.getInstance(transferActivity2, PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "c0fef7c45e8adec66d65d7b6caac9bbe", RobustBitConfig.DEFAULT_VALUE) ? (YodaResponseListener) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "c0fef7c45e8adec66d65d7b6caac9bbe") : new YodaResponseListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.verify.yoda.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.yoda.YodaResponseListener
                public final void onYodaResponse(String str, String str2) {
                    Object[] objArr4 = {str, str2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6b5ef577dce8ad7007b09f6981121cec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6b5ef577dce8ad7007b09f6981121cec");
                        return;
                    }
                    aVar.h = str;
                    aVar.i = str2;
                    if (aVar.g != null) {
                        aVar.g.a();
                    }
                }

                @Override // com.meituan.android.yoda.YodaResponseListener
                public final void onCancel(String str) {
                    Object[] objArr4 = {str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5aeaec4947f6a0ca9101fa42c70f2200", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5aeaec4947f6a0ca9101fa42c70f2200");
                    } else if (aVar.g != null) {
                        aVar.g.b();
                    }
                }

                @Override // com.meituan.android.yoda.YodaResponseListener
                public final void onError(String str, Error error) {
                    Object[] objArr4 = {str, error};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8859affb8f3b24da71888dad06ee6e41", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8859affb8f3b24da71888dad06ee6e41");
                    } else if (aVar.g != null) {
                        aVar.g.c();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            yodaConfirm = null;
        }
        aVar.f = yodaConfirm;
        new b(this, aVar).a(string);
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.verify.yoda.YodaVerificationContract.View
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58f26214df7637b32d6b87c4bcffa51b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58f26214df7637b32d6b87c4bcffa51b");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = BaseActivityDelegate.g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d1c62633bb76c93e17bb79327320520", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d1c62633bb76c93e17bb79327320520")).booleanValue();
        } else {
            this.h.u();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.verify.yoda.YodaVerificationContract.View
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e3513ae3d475251fa5f1fdb5d7b6c5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e3513ae3d475251fa5f1fdb5d7b6c5f");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = BaseActivityDelegate.g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32db49ab427a61ccde827663759a4067", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32db49ab427a61ccde827663759a4067")).booleanValue();
        } else {
            this.h.v();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.verify.yoda.YodaVerificationContract.View
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e70b7b0c980b7e82aec8bea6a11929f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e70b7b0c980b7e82aec8bea6a11929f");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "098c99e2f2db74b2fd4699abab0f3f05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "098c99e2f2db74b2fd4699abab0f3f05");
            return;
        }
        this.h.setResult(-1);
        i();
        this.h.finish();
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.verify.yoda.YodaVerificationContract.View
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f42542d02d966432610a931926b3085", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f42542d02d966432610a931926b3085");
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.verify.VerificationActivityDelegate.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3706e05ba66f4d59a8de62a3fed73dbd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3706e05ba66f4d59a8de62a3fed73dbd");
                    } else {
                        VerificationActivityDelegate.this.h();
                    }
                }
            }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1e42065c0ac1d91134fb9ae1cc17dfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1e42065c0ac1d91134fb9ae1cc17dfe");
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
            View currentFocus = this.h.getCurrentFocus();
            if (currentFocus == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        } catch (Exception unused) {
            com.sankuai.waimai.foundation.utils.log.a.e("VerificationActivityDelegate", "closeKeybordError", new Object[0]);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.verify.yoda.YodaVerificationContract.View
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d2b1ded004b80889035c38fc0748b62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d2b1ded004b80889035c38fc0748b62");
            return;
        }
        this.h.setResult(0);
        i();
        this.h.finish();
    }
}
