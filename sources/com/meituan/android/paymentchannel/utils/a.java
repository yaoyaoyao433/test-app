package com.meituan.android.paymentchannel.utils;

import android.content.Context;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65f7709da87f1e2b4e43a95d3455596b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65f7709da87f1e2b4e43a95d3455596b")).intValue();
        }
        boolean b = b(context);
        ?? r0 = b;
        if (c(context)) {
            r0 = (b ? 1 : 0) | true;
        }
        return b.c(context) ? r0 | 64 : r0;
    }

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d0fcfae6050333095b615fc5a976e53", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d0fcfae6050333095b615fc5a976e53")).booleanValue() : com.meituan.android.paybase.utils.a.a(context, "com.eg.android.AlipayGphone");
    }

    private static boolean c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5eaa3aee90a33a8a9867dbe069075cc2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5eaa3aee90a33a8a9867dbe069075cc2")).booleanValue();
        }
        try {
            IWXAPI createWXAPI = WXAPIFactory.createWXAPI(context, com.meituan.android.paycommon.lib.config.a.a().p());
            if (createWXAPI.isWXAppInstalled()) {
                if (createWXAPI.getWXAppSupportAPI() >= 570425345) {
                    return true;
                }
            }
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "PaymentInstallInfoUtils_isWechatInstalled", new a.c().a("message", e.getMessage()).b);
        }
        return false;
    }
}
