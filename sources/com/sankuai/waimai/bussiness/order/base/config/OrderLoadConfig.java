package com.sankuai.waimai.bussiness.order.base.config;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.constants.a;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.foundation.utils.e;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.config.ILoadConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderLoadConfig implements ILoadConfig {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.config.ILoadConfig
    public void loadConfig(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b69b32e337a0e6e420c687681974c8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b69b32e337a0e6e420c687681974c8b");
        } else if (jSONObject != null) {
            setOrderRefreshInterval(context, jSONObject);
            setPushPopConfig(jSONObject);
        }
    }

    private void setOrderRefreshInterval(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edcfc8d9442510622e18245283754e81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edcfc8d9442510622e18245283754e81");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "order_refresh_interval", jSONObject.optInt("order_status_refresh_time"));
        }
    }

    private void setPushPopConfig(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1b1ecc80ed23a940c6db0053431a089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1b1ecc80ed23a940c6db0053431a089");
            return;
        }
        e eVar = new e("order_detail_status_push_nofity_pop_file_name");
        String optString = jSONObject.optString("client_push_notify");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        Map<String, String> a = i.a(optString);
        if (a != null) {
            if (a.containsKey("client_push_notify_days") && a.containsKey("client_push_notify_times")) {
                eVar.a((e) a.b.EnumC0884a.PUSH_NOTIFY_DAYS, r.a(a.get("client_push_notify_days"), 60L));
                eVar.a((e) a.b.EnumC0884a.PUSH_NOTIFY_TIMES, r.a(a.get("client_push_notify_times"), 2));
                return;
            }
            eVar.b(a.b.EnumC0884a.PUSH_NOTIFY_DAYS);
            eVar.b(a.b.EnumC0884a.PUSH_NOTIFY_TIMES);
            return;
        }
        eVar.b(a.b.EnumC0884a.PUSH_NOTIFY_DAYS);
        eVar.b(a.b.EnumC0884a.PUSH_NOTIFY_TIMES);
    }
}
