package com.meizu.cloud.pushsdk.handler.a.c;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
/* loaded from: classes3.dex */
public final class d {
    public String a;
    public String b;
    public String c;
    public String d;

    /* loaded from: classes3.dex */
    public static class a {
        public String a;
        public String b;
        public String c;
        public String d;

        public final d a() {
            return new d(this);
        }
    }

    public d() {
    }

    public final String a() {
        com.meizu.cloud.pushsdk.d.a.c cVar = new com.meizu.cloud.pushsdk.d.a.c();
        cVar.a(PushConstants.TASK_ID, this.a);
        cVar.a("seq_id", this.b);
        cVar.a("push_timestamp", this.c);
        cVar.a("device_id", this.d);
        return cVar.toString();
    }

    public d(a aVar) {
        this.a = !TextUtils.isEmpty(aVar.a) ? aVar.a : "";
        this.b = !TextUtils.isEmpty(aVar.b) ? aVar.b : "";
        this.c = !TextUtils.isEmpty(aVar.c) ? aVar.c : "";
        this.d = !TextUtils.isEmpty(aVar.d) ? aVar.d : "";
    }
}
