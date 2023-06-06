package com.meituan.android.cashier.mtpay;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import com.meituan.android.cashier.common.s;
import com.meituan.android.cashier.common.t;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.paybase.utils.ah;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paycommon.lib.IInitSDK;
import com.meituan.android.paycommon.lib.utils.b;
import com.meituan.android.paycommon.lib.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HybridPrePosedMTCashierInit implements IInitSDK {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paycommon.lib.IInitSDK
    public final void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "927db42be801c17477871224ad3ac32f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "927db42be801c17477871224ad3ac32f");
            return;
        }
        s a2 = s.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = s.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "f5a301db58d70623ce13e1c608f55f58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "f5a301db58d70623ce13e1c608f55f58");
            return;
        }
        Context a3 = com.meituan.android.paybase.config.a.d().a();
        HornCallback a4 = t.a(a2);
        Object[] objArr3 = {a3, null, "hybrid_meituanpay_individual", a4};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "576084b38faa4bdf30291a31e02becc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "576084b38faa4bdf30291a31e02becc7");
            return;
        }
        if (ah.a(a3)) {
            Horn.debug(a3, "hybrid_meituanpay_individual", true ^ com.meituan.android.paybase.downgrading.a.b());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app", com.meituan.android.paybase.config.a.d().k());
        hashMap.put("appVersion", com.meituan.android.paybase.config.a.d().l());
        hashMap.put("channel", com.meituan.android.paybase.config.a.d().c());
        hashMap.put("city", com.meituan.android.paybase.config.a.d().g());
        hashMap.put(DeviceInfo.DEVICE_MODEL, Build.MODEL);
        hashMap.put(AppUtil.CacheKey.DEVICEID, com.meituan.android.paybase.config.a.d().j());
        hashMap.put("uuid", com.meituan.android.paybase.config.a.d().j());
        hashMap.put("osVersion", com.meituan.android.paybase.config.a.d().e());
        hashMap.put("platform", com.meituan.android.paybase.config.a.d().d());
        hashMap.put("os", com.meituan.android.paybase.config.a.d().d());
        hashMap.put("net_status", com.meituan.android.common.statistics.utils.AppUtil.getNetWorkType(com.meituan.android.paybase.config.a.d().a()));
        hashMap.put("hybrid_net_type", com.meituan.android.common.statistics.utils.AppUtil.getNetWorkType(com.meituan.android.paybase.config.a.d().a()));
        hashMap.put("user_id", com.meituan.android.paybase.config.a.d().i());
        hashMap.put("hybrid_user_id", com.meituan.android.paybase.config.a.d().i());
        hashMap.put("pay_sdk_version", "10.1.0");
        hashMap.put("packageName", com.meituan.android.paybase.config.a.d().a().getPackageName());
        hashMap.put("device_type", Build.MODEL);
        if (!i.a((Map) null)) {
            hashMap.putAll(null);
        }
        Horn.register("hybrid_meituanpay_individual", c.a(a4, "hybrid_meituanpay_individual"), hashMap);
    }
}
