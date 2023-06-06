package com.tencent.mapsdk.internal;

import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.tencent.map.tools.json.JsonParser;
import java.security.SecureRandom;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class pm implements JsonParser {
    public String a;
    public String b;
    public int c;
    public int d;
    public boolean e;
    private String f;
    private String[] g;
    private JSONObject h;

    @Override // com.tencent.map.tools.json.JsonParser
    public void parse(JSONObject jSONObject) {
        this.h = jSONObject;
        if (jSONObject != null) {
            this.a = jSONObject.optString("layerid");
            this.b = jSONObject.optString("version");
            this.f = jSONObject.optString("url");
            this.c = jSONObject.optInt("zoom_max", 20);
            this.d = jSONObject.optInt("zoom_min", 1);
            JSONArray optJSONArray = jSONObject.optJSONArray("params");
            if (optJSONArray != null) {
                this.g = new String[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.g[i] = optJSONArray.optString(i);
                }
            }
        }
    }

    public final String a(int i, int i2, int i3) {
        String[] strArr;
        if (this.g == null || this.g.length == 0) {
            return this.f;
        }
        String replace = this.f.replace("{x}", String.valueOf(i)).replace("{y}", String.valueOf(i2)).replace("{z}", String.valueOf(i3));
        String str = replace;
        for (String str2 : this.g) {
            Object opt = this.h.opt(str2);
            if (opt instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) opt;
                int length = jSONArray.length() - 0;
                str = str.replace(CommonConstant.Symbol.BIG_BRACKET_LEFT + str2 + CommonConstant.Symbol.BIG_BRACKET_RIGHT, jSONArray.optString(length > 0 ? new SecureRandom().nextInt(length) + 0 : 0, ""));
            } else if ((opt instanceof String) || (opt instanceof Number)) {
                str = str.replace(CommonConstant.Symbol.BIG_BRACKET_LEFT + str2 + CommonConstant.Symbol.BIG_BRACKET_RIGHT, String.valueOf(opt));
            }
        }
        return str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("CustomLayerModel{");
        stringBuffer.append("mLayerId='");
        stringBuffer.append(this.a);
        stringBuffer.append('\'');
        stringBuffer.append(", mVersion='");
        stringBuffer.append(this.b);
        stringBuffer.append('\'');
        stringBuffer.append(", mMaxZoomLevel=");
        stringBuffer.append(this.c);
        stringBuffer.append(", mMinZoomLevel=");
        stringBuffer.append(this.d);
        stringBuffer.append(", mUrl='");
        stringBuffer.append(this.f);
        stringBuffer.append('\'');
        stringBuffer.append(", mParamsHolders=");
        stringBuffer.append(this.g == null ? StringUtil.NULL : Arrays.asList(this.g).toString());
        stringBuffer.append(", mVersionUpdated=");
        stringBuffer.append(this.e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
