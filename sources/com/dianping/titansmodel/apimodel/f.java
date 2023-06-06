package com.dianping.titansmodel.apimodel;

import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f implements d {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public int m;
    public boolean n;
    public String o;
    public int[] p;

    @Override // com.dianping.titansmodel.apimodel.d
    public final void initParamWithJSON(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d1cee5c1b8f3e5bf557612802b885a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d1cee5c1b8f3e5bf557612802b885a0");
        } else if (jSONObject != null) {
            this.b = jSONObject.optInt("shareType");
            this.c = jSONObject.optString("image");
            this.d = jSONObject.optString("url");
            this.e = jSONObject.optInt("feed");
            this.f = jSONObject.optString("desc");
            this.g = jSONObject.optString("title");
            this.h = jSONObject.optString("content");
            this.i = jSONObject.optString("extra");
            this.o = jSONObject.optString("panel");
            this.j = jSONObject.optString(JsBridgeResult.ARG_KEY_SHARE_MINI_PROGRAM_ID);
            this.k = jSONObject.optString("miniProgramPath");
            this.l = jSONObject.optString("miniProgramImage");
            this.m = jSONObject.optInt("miniProgramType", 0);
            this.n = jSONObject.optBoolean("miniProgramWithShareTicket", false);
            JSONArray optJSONArray = jSONObject.optJSONArray("channelV2s");
            if (optJSONArray != null) {
                this.p = new int[optJSONArray.length()];
                for (int i = 0; i < this.p.length; i++) {
                    this.p[i] = optJSONArray.optInt(i);
                }
            }
        }
    }
}
