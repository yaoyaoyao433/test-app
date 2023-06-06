package com.meituan.android.pay.process.ntv.pay;

import android.app.Activity;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.desk.component.bean.standardcomponent.CashDesk;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.utils.s;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.fingerprint.bean.FingerprintPayResponse;
import com.meituan.android.paybase.utils.ak;
import com.meituan.android.paycommon.lib.fingerprint.VerifyFingerprintActivity;
import com.meituan.android.paycommon.lib.model.bean.CommonGuide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements c, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    public DeskData b;
    public FragmentActivity c;
    public HashMap<String, String> d;
    public String e;

    @Override // com.meituan.android.pay.process.ntv.pay.c
    public final boolean a() {
        return true;
    }

    public a(FragmentActivity fragmentActivity, DeskData deskData) {
        Object[] objArr = {fragmentActivity, deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75e3059fc5e7737314a51e7f61ff9087", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75e3059fc5e7737314a51e7f61ff9087");
            return;
        }
        this.c = fragmentActivity;
        this.b = deskData;
    }

    @Override // com.meituan.android.pay.process.ntv.pay.c
    public final void b() {
        FingerprintPayResponse fingerprintPayResponse;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da15a40ffd6edfa8f3a81bddd57311bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da15a40ffd6edfa8f3a81bddd57311bc");
        } else if (this.b == null) {
        } else {
            com.meituan.android.pay.common.payment.data.c desk = this.b.getDesk();
            CommonGuide b = com.meituan.android.pay.desk.component.data.a.b(desk);
            com.meituan.android.pay.analyse.a.b(this.c, "FingerprintMode");
            FragmentActivity fragmentActivity = this.c;
            Object[] objArr2 = {desk};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.desk.component.data.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8e65de211bc0564839cdb12546a53f09", RobustBitConfig.DEFAULT_VALUE)) {
                fingerprintPayResponse = (FingerprintPayResponse) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8e65de211bc0564839cdb12546a53f09");
            } else {
                fingerprintPayResponse = desk instanceof CashDesk ? ((CashDesk) desk).getFingerprintPayResponse() : null;
            }
            VerifyFingerprintActivity.a(fragmentActivity, fingerprintPayResponse, b, com.meituan.android.pay.utils.c.a(this.c, desk), 5);
            com.meituan.android.pay.desk.component.analyse.a.b(this.c, 21, ak.a(this.c));
        }
    }

    @Override // com.meituan.android.pay.process.ntv.pay.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "906902580bdc2d5d8d85f4ed6547b01e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "906902580bdc2d5d8d85f4ed6547b01e");
            return;
        }
        com.meituan.android.pay.common.payment.data.c desk = this.b.getDesk();
        if (desk != null) {
            com.meituan.android.pay.utils.e.a(this.c, desk);
            if (!com.meituan.android.paybase.utils.i.a((Collection) com.meituan.android.pay.desk.component.data.a.c(desk))) {
                com.meituan.android.pay.utils.e.a(this.c, desk, com.meituan.android.pay.desk.component.discount.a.a(desk));
            } else {
                com.meituan.android.pay.utils.e.a(this.c, desk, this.b.getSelectPayment());
            }
        }
        this.e = com.meituan.android.pay.desk.component.data.a.c(this.b);
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        PayActivity.a(this.c, this.e, this.d, this.b.getExtraParams(), 8, this);
        com.meituan.android.pay.analyse.a.a(this.e, (Map<String, Object>) null, ak.a(this.c));
        com.meituan.android.paybase.common.analyse.a.a("b_kx2q9bxa", new a.c().a("verify_type", this.c.getString(R.string.mpay__request_scene_fingerprint)).b);
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aa597ce156a3d760796d84fdb93773c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aa597ce156a3d760796d84fdb93773c");
            return;
        }
        m.a().b = l.a(this.c, "1", this.b);
        m.a().b();
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97f177cfbedcc3c3058b2e9458b47df0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97f177cfbedcc3c3058b2e9458b47df0");
            return;
        }
        com.meituan.android.pay.analyse.a.a(this.e, i, obj, null, ak.a(this.c));
        if (i != 8 && i != 228) {
            if (i == 6) {
                com.meituan.android.pay.utils.i.a(this.c, obj);
                return;
            }
            return;
        }
        BankInfo bankInfo = (BankInfo) obj;
        if (bankInfo.isPayed()) {
            com.meituan.android.paybase.common.analyse.a.e(this.c.getString(R.string.paycommon__fingerprint_pay), this.c.getString(R.string.paycommon__fingerprint_pay_success), null);
        }
        com.meituan.android.pay.process.f.a((Activity) this.c).c(this.c, bankInfo);
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "356e6348dacb5328462339f7d499291b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "356e6348dacb5328462339f7d499291b");
            return;
        }
        com.meituan.android.pay.analyse.a.a(this.e, i, exc, ak.a(this.c));
        if (i == 8 || i == 228) {
            if (com.meituan.android.pay.utils.h.a(this.c, exc, this.d, this)) {
                return;
            }
            s.b(this.c, exc, 3);
        } else if (i == 6) {
            com.meituan.android.pay.utils.i.a(this.c, exc);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9d58c8d06d96496ad8c23035adeec6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9d58c8d06d96496ad8c23035adeec6e");
        } else {
            ((PayActivity) this.c).onRequestFinal(i);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb42a86d8b5b5fbb17e6a6c2940856fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb42a86d8b5b5fbb17e6a6c2940856fd");
        } else if (TextUtils.equals(com.meituan.android.pay.common.payment.utils.b.b(this.c, "pay_type"), "valuecard")) {
            ((PayActivity) this.c).b(false);
        } else {
            ((PayActivity) this.c).b(com.meituan.android.paybase.common.utils.b.a());
        }
    }
}
