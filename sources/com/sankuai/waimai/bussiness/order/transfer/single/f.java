package com.sankuai.waimai.bussiness.order.transfer.single;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class f extends com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a {
    public static ChangeQuickRedirect ab;
    transient JsonObject ac;

    @Override // com.sankuai.waimai.bussiness.order.confirm.model.preview.param.a
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = ab;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c111f53bc0c7d66e94ff5208157ab299", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c111f53bc0c7d66e94ff5208157ab299");
        }
        JsonElement jsonTree = new GsonBuilder().excludeFieldsWithModifiers(128, 8).create().toJsonTree(this);
        if (this.ac != null && this.ac.size() != 0) {
            for (Map.Entry<String, JsonElement> entry : this.ac.entrySet()) {
                ((JsonObject) jsonTree).add(entry.getKey(), entry.getValue());
            }
        }
        return new Gson().toJson(jsonTree);
    }
}
