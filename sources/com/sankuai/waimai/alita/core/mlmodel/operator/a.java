package com.sankuai.waimai.alita.core.mlmodel.operator;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public ArrayList<Object> d;

    @Nullable
    public static a a(@Nullable JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        a aVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3f8a3fa4b7c31633fe3a0b738d1428f", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3f8a3fa4b7c31633fe3a0b738d1428f");
        }
        if (jSONObject != null) {
            aVar = new a();
            String[] split = jSONObject.optString("function").split("\\.");
            if (split.length == 2) {
                aVar.b = split[0];
                aVar.c = split[1];
                JSONArray optJSONArray = jSONObject.optJSONArray("params");
                if (optJSONArray != null) {
                    aVar.d = new ArrayList<>();
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        aVar.d.add(optJSONArray.opt(i));
                    }
                }
            }
        }
        return aVar;
    }
}
