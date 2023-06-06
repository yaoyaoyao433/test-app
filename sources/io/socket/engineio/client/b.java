package io.socket.engineio.client;

import com.sankuai.xm.im.message.bean.Message;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b {
    public String a;
    public String[] b;
    public long c;
    public long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str) throws JSONException {
        this(new JSONObject(str));
    }

    private b(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("upgrades");
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.getString(i);
        }
        this.a = jSONObject.getString(Message.SID);
        this.b = strArr;
        this.c = jSONObject.getLong("pingInterval");
        this.d = jSONObject.getLong("pingTimeout");
    }
}
