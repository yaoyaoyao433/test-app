package com.tencent.mapsdk.internal;

import android.support.v4.app.NotificationCompat;
import com.meituan.android.common.kitefly.KiteFlyConstants;
import com.meituan.metrics.traffic.trace.TraceSQLHelper;
import com.tencent.map.tools.net.NetResponse;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ge extends ln {
    public ge() {
    }

    private ge(HashMap<String, String> hashMap) {
        super(hashMap);
    }

    @Override // com.tencent.mapsdk.internal.ln, com.tencent.map.tools.net.processor.ResponseProcessor
    public void onResponse(NetResponse netResponse) throws Exception {
        super.onResponse(netResponse);
        if (this.a) {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            hashMap.put(TraceSQLHelper.KEY_UP, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.d);
            hashMap.put("dw", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f - this.e);
            hashMap.put(KiteFlyConstants.RT_NAME, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.g);
            hashMap.put(NotificationCompat.CATEGORY_ERROR, sb4.toString());
            u.a();
            new sb(this.b, hashMap);
        }
    }

    private void a() {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        hashMap.put(TraceSQLHelper.KEY_UP, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.d);
        hashMap.put("dw", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f - this.e);
        hashMap.put(KiteFlyConstants.RT_NAME, sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.g);
        hashMap.put(NotificationCompat.CATEGORY_ERROR, sb4.toString());
        u.a();
        new sb(this.b, hashMap);
    }
}
