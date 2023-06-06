package com.sankuai.waimai.store.monitor;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class AbstractSnifferNetMonitor<T> implements b<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract T convertBean(@NonNull JSONObject jSONObject);

    public void analysisRawData(final String str, final String str2, final String str3, final String str4, final int i) {
        Object[] objArr = {str, str2, str3, str4, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58456db0b3da24922f3ccf5a433b7111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58456db0b3da24922f3ccf5a433b7111");
        } else {
            al.a(new al.a() { // from class: com.sankuai.waimai.store.monitor.AbstractSnifferNetMonitor.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.sankuai.waimai.store.util.al.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6e2b7725d87acc0eedb73fdaad8e8116", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6e2b7725d87acc0eedb73fdaad8e8116");
                        return;
                    }
                    try {
                        BaseResponse<T> baseResponse = new BaseResponse<>();
                        if (TextUtils.isEmpty(str3)) {
                            baseResponse.code = -1;
                        } else {
                            JSONObject jSONObject = new JSONObject(str3);
                            baseResponse.code = jSONObject.optInt("code", -1);
                            baseResponse.msg = jSONObject.optString("msg");
                            JSONObject optJSONObject = jSONObject.optJSONObject("data");
                            baseResponse.data = optJSONObject != null ? AbstractSnifferNetMonitor.this.convertBean(optJSONObject) : 0;
                        }
                        AbstractSnifferNetMonitor.this.collect(str, str2, str3, baseResponse);
                    } catch (Exception e) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("traceID", str);
                        hashMap.put("reqParams", str2);
                        hashMap.put("rawString", str3);
                        hashMap.put("path", str4);
                        hashMap.put("code", String.valueOf(i));
                        com.sankuai.waimai.store.base.log.a.a("error:" + e.getMessage() + ";params:" + i.a(hashMap));
                    }
                }
            }, "");
        }
    }
}
