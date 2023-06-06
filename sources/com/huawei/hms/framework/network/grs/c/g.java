package com.huawei.hms.framework.network.grs.c;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.meituan.metrics.traffic.report.NetLogConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ Context b;
    final /* synthetic */ ArrayList c;
    final /* synthetic */ JSONArray d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(long j, Context context, ArrayList arrayList, JSONArray jSONArray) {
        this.a = j;
        this.b = context;
        this.c = arrayList;
        this.d = jSONArray;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        LinkedHashMap b;
        LinkedHashMap<String, String> b2;
        LinkedHashMap<String, String> b3;
        com.huawei.hms.framework.network.grs.c.b.a aVar = new com.huawei.hms.framework.network.grs.c.b.a();
        aVar.put("total_time", this.a);
        aVar.put(NetLogConstants.Tags.NETWORK_TYPE, NetworkUtil.getNetworkType(this.b));
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            f fVar = (f) it.next();
            if (fVar.m()) {
                b3 = h.b(fVar);
                aVar.put(b3);
                it.remove();
                z = true;
                break;
            }
        }
        if (!z && this.c.size() > 0) {
            ArrayList arrayList = this.c;
            f fVar2 = (f) arrayList.get(arrayList.size() - 1);
            b2 = h.b(fVar2);
            aVar.put(b2);
            this.c.remove(fVar2);
        }
        if (this.c.size() > 0) {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                b = h.b((f) it2.next());
                this.d.put(new JSONObject(b));
            }
        }
        if (this.d.length() > 0) {
            aVar.put("failed_info", this.d.toString());
        }
        Logger.d("HaReportHelper", "grssdk report data to aiops is: %s", new JSONObject(aVar.get()));
        HianalyticsHelper.getInstance().onEvent(aVar.get(), "networkkit_grs");
    }
}
