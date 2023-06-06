package com.meituan.android.cashier.common;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.cashier.common.mesh.CashierService;
import com.meituan.android.common.aidata.ai.bundle.AiDownloadEnv;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.paybase.utils.ah;
import com.meituan.android.paycommon.lib.IInitSDK;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CashierInit implements IInitSDK {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paycommon.lib.IInitSDK
    public final void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f6cb915575a3fc38756608f8c68b54a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f6cb915575a3fc38756608f8c68b54a");
            return;
        }
        com.sankuai.mesh.core.f.a("cashier", CashierService.class);
        m a2 = m.a();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = m.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "10b2d6981399f1d5b4b2bf1255823d1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "10b2d6981399f1d5b4b2bf1255823d1c");
        } else {
            if (ah.a(context)) {
                Horn.debug(context, "cashier_router", true ^ m.b);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("channel", com.meituan.android.paybase.config.a.d().c());
            hashMap.put(Constants.Environment.KEY_CITYID, com.meituan.android.paybase.config.a.d().g());
            hashMap.put("net_status", AppUtil.getNetWorkType(com.meituan.android.paybase.config.a.d().a()));
            hashMap.put("userid", com.meituan.android.paybase.config.a.d().i());
            hashMap.put("pay_sdk_version", "10.1.0");
            hashMap.put("env", m.b ? AiDownloadEnv.ENV_ONLINE : "debug");
            Horn.register("cashier_router", a2.c, hashMap);
        }
        b.a().a(context);
    }
}
