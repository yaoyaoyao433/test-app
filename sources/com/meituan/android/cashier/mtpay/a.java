package com.meituan.android.cashier.mtpay;

import android.text.TextUtils;
import com.meituan.android.cashier.bean.ClientRouterInfoBean;
import com.meituan.android.paybase.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    ClientRouterInfoBean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ClientRouterInfoBean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e843dabd1745494efab298480ead5f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ClientRouterInfoBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e843dabd1745494efab298480ead5f8");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (new JSONObject(str).length() == 0) {
                return null;
            }
            try {
                return (ClientRouterInfoBean) n.a().fromJson(str, (Class<Object>) ClientRouterInfoBean.class);
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "HybridPrePosedMTCashierConfigManager_getClientRouterInfoBean", (Map<String, Object>) null);
                return null;
            }
        } catch (Exception e2) {
            com.meituan.android.paybase.common.analyse.a.a(e2, "HybridPrePosedMTCashierConfigManager_getClientRouterInfoBean", (Map<String, Object>) null);
            return null;
        }
    }
}
