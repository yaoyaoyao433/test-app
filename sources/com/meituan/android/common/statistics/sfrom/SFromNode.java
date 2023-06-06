package com.meituan.android.common.statistics.sfrom;

import com.meituan.robust.ChangeQuickRedirect;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SFromNode {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String cid;
    private JSONObject sfrom;

    public void setCid(String str) {
        this.cid = str;
    }

    public void setSfrom(JSONObject jSONObject) {
        this.sfrom = jSONObject;
    }

    public String getCid() {
        return this.cid;
    }

    public JSONObject getSfrom() {
        return this.sfrom;
    }
}
