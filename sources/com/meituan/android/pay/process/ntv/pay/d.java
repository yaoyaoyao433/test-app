package com.meituan.android.pay.process.ntv.pay;

import android.app.Activity;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.retrofit.PayRequestService;
import com.meituan.android.pay.utils.s;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.utils.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements c, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    private FragmentActivity b;
    private DeskData c;
    private String d;

    @Override // com.meituan.android.pay.process.ntv.pay.c
    public final boolean a() {
        return false;
    }

    @Override // com.meituan.android.pay.process.ntv.pay.c
    public final void b() {
    }

    public d(FragmentActivity fragmentActivity, DeskData deskData) {
        Object[] objArr = {fragmentActivity, deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "371278b8defa3db9ece12ae2dc1e52ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "371278b8defa3db9ece12ae2dc1e52ff");
            return;
        }
        this.b = fragmentActivity;
        this.c = deskData;
    }

    @Override // com.meituan.android.pay.process.ntv.pay.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d323aeece57ba53ca37a174445dc070", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d323aeece57ba53ca37a174445dc070");
        } else if (this.c == null) {
        } else {
            String noPasswordPayUrl = this.c.getNoPasswordPayUrl();
            com.meituan.android.pay.analyse.a.b(this.b, "NoPasswordMode");
            if (TextUtils.isEmpty(noPasswordPayUrl)) {
                noPasswordPayUrl = com.meituan.android.pay.desk.component.data.a.c(this.c);
            }
            String str = noPasswordPayUrl;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16898a3ce41cbf356a7948b12ce953bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16898a3ce41cbf356a7948b12ce953bb");
                return;
            }
            com.meituan.android.pay.common.payment.utils.b.a(this.b, "current_url", str);
            this.d = str;
            ((PayRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(PayRequestService.class, this, TbsListener.ErrorCode.STARTDOWNLOAD_4)).startHelloPayRequest(str, com.meituan.android.pay.common.payment.utils.b.c(this.b), null, com.meituan.android.paybase.fingerprint.util.c.a(this.b, ""), !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.a(this.b)) ? com.meituan.android.pay.common.payment.utils.b.a(this.b) : com.meituan.android.pay.common.payment.utils.b.b(this.b, "nb_source"), com.meituan.android.paycommon.lib.config.a.a().o());
            com.meituan.android.pay.analyse.a.a(this.d, (Map<String, Object>) null, ak.a(this.b));
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6cde147055a18a2fedf3b445ece51de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6cde147055a18a2fedf3b445ece51de");
            return;
        }
        BankInfo bankInfo = (BankInfo) obj;
        if (i == 163) {
            com.meituan.android.pay.analyse.a.a(this.d, i, obj, null, ak.a(this.b));
        }
        com.meituan.android.pay.process.f.a((Activity) this.b).c(this.b, bankInfo);
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c25676df496fdcef7e2b9c7a092d3877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c25676df496fdcef7e2b9c7a092d3877");
            return;
        }
        if (i == 163) {
            com.meituan.android.pay.analyse.a.a(this.d, i, exc, ak.a(this.b));
        }
        if (com.meituan.android.pay.utils.h.a(this.b, exc, null, this)) {
            return;
        }
        if (com.meituan.android.pay.desk.component.data.b.f(this.b)) {
            s.a(this.b, exc, 3);
        } else {
            s.b(this.b, exc, 3);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da745bd63528283cf2782b65c6ff507a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da745bd63528283cf2782b65c6ff507a");
        } else {
            ((PayActivity) this.b).onRequestFinal(i);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec31136e120959a351f1c63f71bb0c91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec31136e120959a351f1c63f71bb0c91");
            return;
        }
        String b = com.meituan.android.pay.common.payment.utils.b.b(this.b, "pay_type");
        if (TextUtils.equals("4", com.meituan.android.pay.common.payment.utils.b.b(this.b, "verify_type"))) {
            if (TextUtils.equals(b, "valuecard")) {
                ((PayActivity) this.b).a(false, this.b.getString(R.string.mpay__no_pwd_pay_tip));
                return;
            } else if (TextUtils.equals(b, "cardpay") || TextUtils.equals(b, "bankselectpay")) {
                ((PayActivity) this.b).b(false, this.b.getString(R.string.mpay__no_pwd_pay_tip));
                return;
            } else {
                ((PayActivity) this.b).a(com.meituan.android.paybase.common.utils.b.a(), this.b.getString(R.string.mpay__no_pwd_pay_tip));
                return;
            }
        }
        ((PayActivity) this.b).b(com.meituan.android.paybase.common.utils.b.a());
        PayBaseActivity.q();
    }
}
