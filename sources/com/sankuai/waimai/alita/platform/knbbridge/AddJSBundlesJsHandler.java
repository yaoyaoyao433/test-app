package com.sankuai.waimai.alita.platform.knbbridge;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.autorunner.b;
import com.sankuai.waimai.alita.core.tasklistener.b;
import com.sankuai.waimai.alita.core.utils.c;
import com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AddJSBundlesJsHandler extends AbstractAlitaJsHandler {
    public static String NAME = "AddJSBundlesJsHandler";
    public static final String PARAM_NAME_BIZ = "biz";
    public static final String PARAM_NAME_BUNDLE_ID_LIST = "bundle_ids";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isOpSupported() {
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public AbstractAlitaJsHandler.BaseParamBean parseData(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30c076510afd648074b1612e7b9b5402", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractAlitaJsHandler.BaseParamBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30c076510afd648074b1612e7b9b5402");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("biz");
            JSONArray optJSONArray = jSONObject.optJSONArray("bundle_ids");
            return new a(optString, (optJSONArray == null || optJSONArray.length() <= 0) ? null : (List) com.sankuai.waimai.alita.platform.utils.a.a().fromJson(optJSONArray.toString(), new TypeToken<List<String>>() { // from class: com.sankuai.waimai.alita.platform.knbbridge.AddJSBundlesJsHandler.1
            }.getType()));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isParamValid(AbstractAlitaJsHandler.BaseParamBean baseParamBean) throws IllegalArgumentException {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6345ebcf7524dfa8a875a356a987b499", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6345ebcf7524dfa8a875a356a987b499")).booleanValue();
        }
        if (baseParamBean == null || !(baseParamBean instanceof a)) {
            throw new IllegalArgumentException();
        }
        a aVar = (a) baseParamBean;
        if (TextUtils.isEmpty(aVar.mBiz) || aVar.a == null || aVar.a.size() <= 0) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public void execInner(AbstractAlitaJsHandler.BaseParamBean baseParamBean) {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7dac12197a2c9f92f2261961f3ae599a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7dac12197a2c9f92f2261961f3ae599a");
            return;
        }
        a aVar = (a) baseParamBean;
        if (aVar.a == null || aVar.a.size() <= 0) {
            return;
        }
        b a2 = b.a();
        for (String str : aVar.a) {
            if (!TextUtils.isEmpty(str)) {
                a2.a(aVar.mBiz, str);
            }
        }
        a2.a(new com.sankuai.waimai.alita.core.tasklistener.b<String, Boolean, Exception>() { // from class: com.sankuai.waimai.alita.platform.knbbridge.AddJSBundlesJsHandler.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.tasklistener.b
            public final void a(@NonNull Map<String, b.d<Boolean>> map) {
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "51116e9ae28209911d76f22386def5af", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "51116e9ae28209911d76f22386def5af");
                    return;
                }
                if (com.sankuai.waimai.alita.platform.debug.a.a().b()) {
                    c.a("AddJSBundlesJsHandler.exec: onAllTaskComplete(): JsBundle加载完成: ");
                    for (Map.Entry<String, b.d<Boolean>> entry : map.entrySet()) {
                        b.d<Boolean> value = entry.getValue();
                        StringBuilder sb = new StringBuilder("AddJSBundlesJsHandler.exec: onAllTaskComplete(): JsBundle加载完成: bundle名称 = ");
                        sb.append(entry.getKey());
                        sb.append(", 加载结果 = ");
                        sb.append((value.b == null || !value.b.booleanValue()) ? "失败" : "成功");
                        sb.append(", 加载状态 = ");
                        sb.append(com.sankuai.waimai.alita.core.tasklistener.b.a(value.a));
                        c.a(sb.toString());
                    }
                    c.a("AddJSBundlesJsHandler.exec: onAllTaskComplete(): JsBundle加载完成: ----------------");
                }
                AddJSBundlesJsHandler.this.jsCallback();
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put("method", "addJSBundles");
        hashMap.put("params", aVar);
        c.b("alita_knb", (String) null, "success", (Map<String, Object>) hashMap);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractAlitaJsHandler.BaseParamBean {
        public List<String> a;

        public a(String str, List<String> list) {
            super(str);
            this.a = list;
        }
    }
}
