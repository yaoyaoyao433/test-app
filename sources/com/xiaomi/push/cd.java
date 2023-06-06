package com.xiaomi.push;

import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class cd implements Comparable<cd> {
    String a;
    protected int b;
    private final LinkedList<bt> c;
    private long d;

    public cd() {
        this(null, 0);
    }

    public cd(String str) {
        this(str, 0);
    }

    public cd(String str, int i) {
        this.c = new LinkedList<>();
        this.d = 0L;
        this.a = str;
        this.b = i;
    }

    public final String toString() {
        return this.a + CommonConstant.Symbol.COLON + this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void a(bt btVar) {
        if (btVar != null) {
            this.c.add(btVar);
            int i = btVar.a;
            if (i > 0) {
                this.b += btVar.a;
            } else {
                int i2 = 0;
                for (int size = this.c.size() - 1; size >= 0 && this.c.get(size).a < 0; size--) {
                    i2++;
                }
                this.b += i * i2;
            }
            if (this.c.size() > 30) {
                this.b -= this.c.remove().a;
            }
        }
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, this.d);
        jSONObject.put("wt", this.b);
        jSONObject.put("host", this.a);
        JSONArray jSONArray = new JSONArray();
        Iterator<bt> it = this.c.iterator();
        while (it.hasNext()) {
            bt next = it.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cost", next.b);
            jSONObject2.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, next.e);
            jSONObject2.put("ts", next.c);
            jSONObject2.put("wt", next.a);
            jSONObject2.put("expt", next.d);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("ah", jSONArray);
        return jSONObject;
    }

    public final synchronized cd a(JSONObject jSONObject) {
        this.d = jSONObject.getLong(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP);
        this.b = jSONObject.getInt("wt");
        this.a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            LinkedList<bt> linkedList = this.c;
            bt btVar = new bt();
            btVar.b = jSONObject2.getLong("cost");
            btVar.e = jSONObject2.getLong(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE);
            btVar.c = jSONObject2.getLong("ts");
            btVar.a = jSONObject2.getInt("wt");
            btVar.d = jSONObject2.optString("expt");
            linkedList.add(btVar);
        }
        return this;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(cd cdVar) {
        cd cdVar2 = cdVar;
        if (cdVar2 == null) {
            return 1;
        }
        return cdVar2.b - this.b;
    }
}
