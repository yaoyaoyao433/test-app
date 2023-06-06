package com.meituan.android.quickpass.uptsm.common.utils;

import com.meituan.android.quickpass.uptsm.web.TSMBaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static void a(TSMBaseJsHandler tSMBaseJsHandler, int i, int i2, String str, JSONObject jSONObject) {
        Object[] objArr = {tSMBaseJsHandler, Integer.valueOf(i), Integer.valueOf(i2), str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8bb11892afafcff8391b49efafe01d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8bb11892afafcff8391b49efafe01d8");
        } else if (tSMBaseJsHandler != null) {
            tSMBaseJsHandler.jsCallBack(i, i2, str, jSONObject);
        }
    }

    public static void a(TSMBaseJsHandler tSMBaseJsHandler, int i, String str, String str2) {
        Object[] objArr = {tSMBaseJsHandler, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a8c48ce97fb1405b39a09248a12a642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a8c48ce97fb1405b39a09248a12a642");
        } else if (tSMBaseJsHandler != null) {
            tSMBaseJsHandler.jsCallBackError(i, str, str2);
        }
    }
}
