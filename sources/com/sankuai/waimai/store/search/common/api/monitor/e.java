package com.sankuai.waimai.store.search.common.api.monitor;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.search.model.GlobalPageResponse;
import com.sankuai.waimai.store.util.i;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements a {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Type inference failed for: r0v17, types: [D, java.lang.Object] */
    @Override // com.sankuai.waimai.store.search.common.api.monitor.a
    public final c a(int i, String str) {
        BaseResponse baseResponse;
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfb10b64bf4e5d2e7341f015b8be80ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfb10b64bf4e5d2e7341f015b8be80ce");
        }
        if (TextUtils.isEmpty(str)) {
            return c.a("store_search_api", "data_error", "net code:" + i + " responseStr is " + str);
        } else if (i < 200 || i >= 300) {
            return c.a("store_search_api", "data_error", "net code:" + i + " responseStr is " + str);
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                baseResponse = new BaseResponse();
                baseResponse.code = jSONObject.optInt("code", -1);
                baseResponse.msg = jSONObject.optString("msg");
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null && !TextUtils.isEmpty(optJSONObject.toString())) {
                    baseResponse.data = i.a(jSONObject.toString(), GlobalPageResponse.class);
                } else {
                    baseResponse.data = null;
                }
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
            if (baseResponse.code == 0 && baseResponse.data == 0) {
                return c.a("store_search_api", "data_error", "response:" + str);
            }
            if (baseResponse.code != 0 && baseResponse.code != 401 && baseResponse.code != 100) {
                return c.a("store_search_api", "bussiness_code_error", "response:" + str);
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a6983cfcecf7daf9d2b6a036bea56c97", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a6983cfcecf7daf9d2b6a036bea56c97") : new c();
        }
    }
}
