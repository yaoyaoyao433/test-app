package com.xiaomi.clientreport.data;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class c extends d {
    public int a;
    public long b = -1;
    public long c = -1;

    @Override // com.xiaomi.clientreport.data.d
    public final JSONObject a() {
        try {
            JSONObject a = super.a();
            if (a == null) {
                return null;
            }
            a.put("code", this.a);
            a.put("perfCounts", this.b);
            a.put("perfLatencies", this.c);
            return a;
        } catch (JSONException e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            return null;
        }
    }

    @Override // com.xiaomi.clientreport.data.d
    public final String b() {
        return super.b();
    }
}
