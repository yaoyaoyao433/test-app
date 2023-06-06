package com.meituan.android.paymentchannel.utils;

import android.content.Context;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static IWXAPI b;

    @MTPaySuppressFBWarnings({"LI_LAZY_INIT_UPDATE_STATIC"})
    public static IWXAPI a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68ae12813932f8e590e5672415578098", RobustBitConfig.DEFAULT_VALUE)) {
            return (IWXAPI) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68ae12813932f8e590e5672415578098");
        }
        String p = com.meituan.android.paycommon.lib.config.a.a().p();
        if (b == null) {
            if (context == null) {
                return null;
            }
            IWXAPI createWXAPI = WXAPIFactory.createWXAPI(context.getApplicationContext(), p);
            b = createWXAPI;
            createWXAPI.registerApp(p);
        }
        return b;
    }
}
