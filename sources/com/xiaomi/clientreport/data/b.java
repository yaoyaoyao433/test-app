package com.xiaomi.clientreport.data;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class b extends d {
    public String a;
    public int b;
    public long c;
    public String d;

    @Override // com.xiaomi.clientreport.data.d
    public final JSONObject a() {
        try {
            JSONObject a = super.a();
            if (a == null) {
                return null;
            }
            a.put("eventId", this.a);
            a.put("eventType", this.b);
            a.put("eventTime", this.c);
            a.put("eventContent", this.d == null ? "" : this.d);
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
