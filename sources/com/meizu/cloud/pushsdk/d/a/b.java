package com.meizu.cloud.pushsdk.d.a;

import com.meizu.cloud.pushsdk.d.f.d;
import com.meizu.cloud.pushsdk.d.f.e;
import com.sankuai.xm.im.message.bean.MsgAddition;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class b implements a {
    private final String b = b.class.getSimpleName();
    public final HashMap<String, Object> a = new HashMap<>();

    @Override // com.meizu.cloud.pushsdk.d.a.a
    public final Map<String, Object> a() {
        return this.a;
    }

    @Override // com.meizu.cloud.pushsdk.d.a.a
    @Deprecated
    public final void a(String str, String str2) {
        com.meizu.cloud.pushsdk.d.f.c.c(this.b, "Payload: add(String, String) method called - Doing nothing.", new Object[0]);
    }

    @Override // com.meizu.cloud.pushsdk.d.a.a
    public final long b() {
        return e.a(toString());
    }

    public String toString() {
        return e.a((Map) this.a).toString();
    }

    public b(String str, Object obj) {
        if (str != null) {
            d.a(!str.isEmpty(), "schema cannot be empty.");
            this.a.put("sa", str);
            if (obj == null) {
                return;
            }
            this.a.put(MsgAddition.DT, obj);
            return;
        }
        throw new NullPointerException(String.valueOf("schema cannot be null"));
    }
}
