package com.meituan.android.legwork.common.jarvis;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RequireJarvisConfigReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        RequireJarvisConfigParamBean requireJarvisConfigParamBean;
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc896fdceeea0c13625349dc6262de82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc896fdceeea0c13625349dc6262de82");
            return;
        }
        Map<String, Object> map = new HashMap<String, Object>() { // from class: com.meituan.android.legwork.common.jarvis.RequireJarvisConfigReceiver.1
            {
                put("code", "0");
                put("message", "未降级");
            }
        };
        if (intent != null) {
            String a2 = f.a(intent, "data");
            if (a2 == null) {
                a(map);
                return;
            }
            map.put("originData", a2);
            try {
                requireJarvisConfigParamBean = (RequireJarvisConfigParamBean) com.meituan.android.legwork.net.util.b.a().fromJson(a2, (Class<Object>) RequireJarvisConfigParamBean.class);
            } catch (Exception e) {
                x.e("RequireJarvisConfigReceiver.onReceive()", "处理广播消息失败，exception msg:", e);
                x.a(e);
                requireJarvisConfigParamBean = null;
            }
            if (requireJarvisConfigParamBean == null) {
                a(map);
                return;
            } else if (TextUtils.isEmpty(requireJarvisConfigParamBean.uri)) {
                map.put("code", "2");
                map.put("message", "uri参数为空");
                a(map);
                return;
            } else if (!TextUtils.equals(requireJarvisConfigParamBean.degradeType, "pageDegradeConfig") && !TextUtils.equals(requireJarvisConfigParamBean.degradeType, "scrollBarConfig")) {
                map.put("code", "3");
                map.put("message", "degradeType需要是[scrollBarConfig, pageDegradeConfig]一种");
                a(map);
                return;
            } else if (requireJarvisConfigParamBean.pageType != 1 && requireJarvisConfigParamBean.pageType != 2 && requireJarvisConfigParamBean.pageType != 9) {
                map.put("code", "4");
                map.put("message", "pageType值是错误，1:Native; 2:H5; 9:MRN");
                a(map);
                return;
            } else {
                Object a3 = a.a().a(requireJarvisConfigParamBean.uri, requireJarvisConfigParamBean.pageType, requireJarvisConfigParamBean.degradeType);
                if (a3 != null) {
                    map.put("code", "1");
                    map.put("message", "降级了");
                    map.put("data", a3);
                }
            }
        }
        a(map);
    }

    private void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c0076b03ce1929aef4d1c0d41249cde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c0076b03ce1929aef4d1c0d41249cde");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", "paotui_c:get_degradeInfo_callback");
            jSONObject.put("result", new JSONObject(map).toString());
            JsHandlerFactory.publish(jSONObject);
        } catch (Exception e) {
            x.e("RequireJarvisConfigReceiver", "sendJarvisConfig exception " + e);
            x.a(e);
        }
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf95ff63c3d084d2ae610e45f42eaa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf95ff63c3d084d2ae610e45f42eaa6");
        } else if (context != null) {
            try {
                context.registerReceiver(this, new IntentFilter("paotui_c:get_degradeInfo"));
            } catch (Exception e) {
                x.e("RequireJarvisConfigReceiver.register() 异常", "exception msg:", e);
            }
        }
    }

    public final void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "933db9811e19e4cd46102d3939f45a6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "933db9811e19e4cd46102d3939f45a6f");
        } else if (context != null) {
            try {
                context.unregisterReceiver(this);
            } catch (Exception e) {
                x.e("RequireJarvisConfigReceiver.unregister() 异常", "exception msg:", e);
            }
        }
    }
}
