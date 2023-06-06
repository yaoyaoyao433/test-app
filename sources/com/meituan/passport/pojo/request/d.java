package com.meituan.passport.pojo.request;

import android.os.Build;
import android.support.annotation.RestrictTo;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.service.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import java.util.Map;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class d extends j {
    public static ChangeQuickRedirect a;
    public com.meituan.passport.clickaction.d<String> b;
    public ai c;

    @Override // com.meituan.passport.pojo.request.j, com.meituan.passport.pojo.request.b
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0af37cfcb50809064ab91dbf7cf7acc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0af37cfcb50809064ab91dbf7cf7acc")).booleanValue() : super.a() && this.b != null;
    }

    @Override // com.meituan.passport.pojo.request.j, com.meituan.passport.pojo.request.b
    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "390355be48126a6bc326eb6679e75a71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "390355be48126a6bc326eb6679e75a71");
            return;
        }
        a(map, OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, this.i.b());
        a(map, Constant.KEY_COUNTRY_CODE, this.j.b().countryCode);
        a(map, "encryptMobile", com.meituan.passport.encryption.a.b(this.j.b().number));
        a(map, "code", this.b.b());
        a(map, "unionid", OneIdHandler.getInstance(com.meituan.android.singleton.b.a()).getLocalOneId());
        a(map, "device_name", Build.MANUFACTURER + StringUtil.SPACE + Build.MODEL);
        a(map, "device_type", Build.MODEL);
        a(map, "device_os", "Android");
        a(map, "notify_unionid", com.dianping.nvnetwork.g.j());
        StringBuilder sb = new StringBuilder();
        sb.append(com.dianping.nvnetwork.g.a());
        a(map, "notify_appid", sb.toString());
        a(map, "sdkType", "android");
        a(map, "token_id", PassportConfig.h());
        a(map, "sim_mask_mobile", StorageUtil.getSharedValue(com.meituan.android.singleton.b.a(), "Channel.Account.SIMMaskMobile"));
    }

    @Override // com.meituan.passport.pojo.request.j, com.meituan.passport.pojo.request.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58636fe131552316525205d85ad1ab0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58636fe131552316525205d85ad1ab0e");
            return;
        }
        super.b();
        this.b.a();
    }
}
