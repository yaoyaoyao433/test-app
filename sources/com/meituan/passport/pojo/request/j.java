package com.meituan.passport.pojo.request;

import android.support.annotation.IntRange;
import android.support.annotation.RestrictTo;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.passport.pojo.Mobile;
import com.meituan.passport.pojo.response.SmsResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class j extends b {
    public static ChangeQuickRedirect h;
    public com.meituan.passport.clickaction.d<String> i;
    public com.meituan.passport.clickaction.d<Mobile> j;
    @IntRange(from = 1, to = 3)
    public int k;
    public com.meituan.passport.clickaction.d<Boolean> l;

    public final void a(SmsResult smsResult) {
        Object[] objArr = {smsResult};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "543ff62642403fc97969bfa92f249cb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "543ff62642403fc97969bfa92f249cb7");
            return;
        }
        smsResult.action = this.k;
        smsResult.countryCode = this.j.b().countryCode;
        smsResult.requestCode = this.i.b();
        smsResult.mobile = this.j.b().number;
        smsResult.isVoice = this.l.b();
    }

    public final void b(SmsResult smsResult) {
        Object[] objArr = {smsResult};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73a11b9e8360e48575faa8d5f5a42570", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73a11b9e8360e48575faa8d5f5a42570");
            return;
        }
        this.i = com.meituan.passport.clickaction.d.a(smsResult.requestCode);
        this.j = com.meituan.passport.clickaction.d.a(new Mobile(smsResult.mobile, smsResult.countryCode));
        this.k = smsResult.action;
        this.l = com.meituan.passport.clickaction.d.a(smsResult.isVoice);
    }

    @Override // com.meituan.passport.pojo.request.b
    public boolean a() {
        return (this.i == null || this.j == null || this.l == null) ? false : true;
    }

    @Override // com.meituan.passport.pojo.request.b
    public void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "205805d8db25e0c03984acfe04482b5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "205805d8db25e0c03984acfe04482b5f");
            return;
        }
        a(map, OtherVerifyTypeConstants.REQUEST_CODE, this.i.b());
        a(map, "mobileInterCode", this.j.b().countryCode);
        a(map, "mobile", this.j.b().number);
        a(map, "id", Integer.valueOf(this.l.b().booleanValue() ? 40 : 4));
        a(map, "sim_mask_mobile", StorageUtil.getSharedValue(com.meituan.android.singleton.b.a(), "Channel.Account.SIMMaskMobile"));
    }

    @Override // com.meituan.passport.pojo.request.b
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f49cd8867f6ea8dee17d4f6064988700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f49cd8867f6ea8dee17d4f6064988700");
            return;
        }
        this.i.a();
        this.j.a();
        this.l.a();
    }

    public final String e() {
        int i = this.k;
        return i != 1 ? i != 3 ? "login" : "signup" : "setbindmobile";
    }

    public final j f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "522a11657d0f4cfe69745f054b3a74d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "522a11657d0f4cfe69745f054b3a74d5");
        }
        j jVar = new j();
        a(jVar);
        return jVar;
    }

    public final void a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a40672886a55d9804f0ab0d9cd8d20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a40672886a55d9804f0ab0d9cd8d20");
        } else if (jVar == null) {
        } else {
            jVar.k = this.k;
            jVar.i = this.i;
            jVar.j = this.j;
            jVar.l = this.l;
        }
    }
}
