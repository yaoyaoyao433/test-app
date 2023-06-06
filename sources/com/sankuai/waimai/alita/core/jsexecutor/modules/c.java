package com.sankuai.waimai.alita.core.jsexecutor.modules;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.tasklistener.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return "addBundlesAutoRunning";
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(String str, String str2, String str3, m mVar) {
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cdd7b9f7106851833095992232eabe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cdd7b9f7106851833095992232eabe3");
        } else if (!TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                a(jSONObject.optString("biz"), a(jSONObject));
                a(str, mVar, str3, "");
            } catch (Exception e) {
                a(mVar, str3, e.getMessage());
            }
        } else {
            a(mVar, str3, "args is empty");
        }
    }

    private void a(String str, List<String> list) throws Exception {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f63da45469a2b3d8e3871ec69c4821d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f63da45469a2b3d8e3871ec69c4821d6");
        } else if (!TextUtils.isEmpty(str) && !com.sankuai.waimai.alita.core.utils.f.a(list)) {
            com.sankuai.waimai.alita.core.event.autorunner.b a = com.sankuai.waimai.alita.core.event.autorunner.b.a();
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    a.a(str, str2);
                }
            }
            a.a(new com.sankuai.waimai.alita.core.tasklistener.b<String, Boolean, Exception>() { // from class: com.sankuai.waimai.alita.core.jsexecutor.modules.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.tasklistener.b
                public final void a(@NonNull Map<String, b.d<Boolean>> map) {
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84fe5194e36f65c171c311dc6f7ef084", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84fe5194e36f65c171c311dc6f7ef084");
                        return;
                    }
                    c cVar = c.this;
                    Object[] objArr3 = {map};
                    ChangeQuickRedirect changeQuickRedirect3 = c.b;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "614e16f3b1ee82e35b1433b8d9e66c48", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "614e16f3b1ee82e35b1433b8d9e66c48");
                    } else if (com.sankuai.waimai.alita.platform.debug.a.a().b()) {
                        com.sankuai.waimai.alita.core.utils.c.a("AddBundlesAutoRunningMethod : onAllTaskComplete(): JsBundle加载完成: ");
                        for (Map.Entry<String, b.d<Boolean>> entry : map.entrySet()) {
                            b.d<Boolean> value = entry.getValue();
                            StringBuilder sb = new StringBuilder("AddBundlesAutoRunningMethod : onAllTaskComplete(): JsBundle加载完成: bundle名称 = ");
                            sb.append(entry.getKey());
                            sb.append(", 加载结果 = ");
                            sb.append((value.b == null || !value.b.booleanValue()) ? "失败" : "成功");
                            sb.append(", 加载状态 = ");
                            sb.append(com.sankuai.waimai.alita.core.tasklistener.b.a(value.a));
                            com.sankuai.waimai.alita.core.utils.c.a(sb.toString());
                        }
                        com.sankuai.waimai.alita.core.utils.c.a("AddBundlesAutoRunningMethod : onAllTaskComplete(): JsBundle加载完成: ----------------");
                    }
                }
            });
        } else {
            throw new Exception("addBundlesAutoRunning invoke params error");
        }
    }

    private List<String> a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f58ba997167f659aff82ae44c59d77a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f58ba997167f659aff82ae44c59d77a8");
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("bundle_list");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                Object opt = optJSONArray.opt(i);
                if (opt instanceof String) {
                    arrayList.add((String) opt);
                }
            }
        }
        return arrayList;
    }
}
