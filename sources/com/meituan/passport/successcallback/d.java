package com.meituan.passport.successcallback;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.passport.converter.m;
import com.meituan.passport.pojo.YodaResult;
import com.meituan.passport.pojo.response.SmsRequestCode;
import com.meituan.passport.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements m<YodaResult> {
    public static ChangeQuickRedirect a;
    private FragmentActivity b;
    private m<SmsRequestCode> c;

    @Override // com.meituan.passport.converter.m
    public final /* synthetic */ void a(YodaResult yodaResult) {
        YodaResult yodaResult2 = yodaResult;
        Object[] objArr = {yodaResult2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "676d1af549b84ce6ac93f8ce5ceff7c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "676d1af549b84ce6ac93f8ce5ceff7c8");
            return;
        }
        if (yodaResult2 != null && yodaResult2.error != null && yodaResult2.error.code != 101190) {
            ai.a().a(this.b, 0, yodaResult2.error.code);
        }
        if (yodaResult2 == null || yodaResult2.data == null) {
            return;
        }
        String str = (String) yodaResult2.getValue("type");
        String str2 = (String) yodaResult2.getValue(OtherVerifyTypeConstants.REQUEST_CODE);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            SmsRequestCode smsRequestCode = new SmsRequestCode();
            smsRequestCode.value = str2;
            int parseInt = Integer.parseInt(str);
            if (parseInt == 40) {
                smsRequestCode.type = 1;
            } else if (parseInt == 4) {
                smsRequestCode.type = 2;
            }
            String str3 = (String) yodaResult2.getValue("action");
            if (TextUtils.equals(str3, "login")) {
                smsRequestCode.action = 2;
            } else if (TextUtils.equals(str3, "signup")) {
                smsRequestCode.action = 3;
            }
            if (this.c != null) {
                this.c.a(smsRequestCode);
            }
        } catch (Exception unused) {
        }
    }

    public d(m<SmsRequestCode> mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c1a6428f9d7659fdb5f226086158227", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c1a6428f9d7659fdb5f226086158227");
        } else {
            this.c = mVar;
        }
    }

    public d(FragmentActivity fragmentActivity, m<SmsRequestCode> mVar) {
        Object[] objArr = {fragmentActivity, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aa633f3e2dcfdbf35eac5ff6e92488f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aa633f3e2dcfdbf35eac5ff6e92488f");
            return;
        }
        this.c = mVar;
        this.b = fragmentActivity;
    }
}
