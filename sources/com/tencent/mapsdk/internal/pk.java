package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonParser;
import com.tencent.map.tools.json.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class pk implements JsonParser {
    public boolean a;
    public List<pm> b;

    @Override // com.tencent.map.tools.json.JsonParser
    public void parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.a = jSONObject.optInt("enable", 0) == 1;
            JSONArray optJSONArray = jSONObject.optJSONArray("layers");
            if (optJSONArray != null) {
                this.b = JsonUtils.parseToList(optJSONArray, pm.class, new Object[0]);
            }
        }
    }

    private boolean a() {
        return this.a;
    }

    private List<pm> b() {
        return this.b;
    }
}
