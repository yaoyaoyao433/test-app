package com.meituan.metrics.traffic.trace;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.TrafficInterceptedManager;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTWebviewSummaryTrafficTrace extends SummaryTrafficTrace {
    private static final String TAG = "mtebviewError";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Gson gson;

    public MTWebviewSummaryTrafficTrace() {
        super(Constants.TRACE_MTWEBVIEW);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b09a865483611f5582795c50e5f2e1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b09a865483611f5582795c50e5f2e1d");
        } else {
            this.gson = new Gson();
        }
    }

    @Override // com.meituan.metrics.traffic.trace.SummaryTrafficTrace, com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficInterceptedManager.ITrafficInterceptedListener
    public void onTrafficIntercepted(TrafficRecord trafficRecord, int i) {
        Object[] objArr = {trafficRecord, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f83377afbfcfb1094f4f15a7295bd2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f83377afbfcfb1094f4f15a7295bd2a");
        } else if (trafficRecord.getDetail() == null || !TextUtils.equals(TrafficRecord.Detail.TUNNEL_MTWEBVIEW, trafficRecord.getDetail().networkTunnel)) {
        } else {
            super.onTrafficIntercepted(trafficRecord, i);
        }
    }

    public void onMTWebviewReceiveValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e61021c163eb34e31a04d13400db83f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e61021c163eb34e31a04d13400db83f");
            return;
        }
        try {
            ArrayList arrayList = (ArrayList) this.gson.fromJson(str, new TypeToken<ArrayList<MTWebviewTrafficUnit>>() { // from class: com.meituan.metrics.traffic.trace.MTWebviewSummaryTrafficTrace.1
                public static ChangeQuickRedirect changeQuickRedirect;
            }.getType());
            if (arrayList != null && arrayList.size() != 0) {
                Context context = ContextProvider.getInstance().getContext();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ArrayList<ResourceUnit> arrayList2 = ((MTWebviewTrafficUnit) it.next()).resources;
                    if (arrayList2 != null && arrayList2.size() != 0) {
                        recordDetailTraffic(context, arrayList2);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void recordDetailTraffic(Context context, ArrayList<ResourceUnit> arrayList) {
        Object[] objArr = {context, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "253d94fb81e16711fdfcc4d92b74322f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "253d94fb81e16711fdfcc4d92b74322f");
            return;
        }
        Iterator<ResourceUnit> it = arrayList.iterator();
        while (it.hasNext()) {
            ResourceUnit next = it.next();
            if (!TextUtils.isEmpty(next.url) && next.url.startsWith("http")) {
                TrafficRecord trafficRecord = new TrafficRecord(next.url);
                trafficRecord.total = next.size;
                trafficRecord.rxBytes = next.size;
                trafficRecord.setMTWebviewReferer(TextUtils.isEmpty(next.referer) ? "nil" : next.referer);
                TrafficRecord.Detail detail = new TrafficRecord.Detail();
                detail.networkTunnel = TrafficRecord.Detail.TUNNEL_MTWEBVIEW;
                trafficRecord.setDetail(detail);
                TrafficInterceptedManager.getInstance().handleNewRecord(context, trafficRecord, 1000);
            }
        }
    }

    public void reportError(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01a7152d7c8582753bd37da7a1e2df9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01a7152d7c8582753bd37da7a1e2df9c");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i));
        hashMap.put("action", str);
        Babel.log(new Log.Builder("").optional(hashMap).tag(TAG).generalChannelStatus(true).build());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class MTWebviewTrafficUnit {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int count;
        public ArrayList<ResourceUnit> resources;
        public long total_size;

        public MTWebviewTrafficUnit() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class ResourceUnit {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean finished;
        public long size;
        public int times;
        public String referer = "";
        public String url = "";

        public ResourceUnit() {
        }
    }
}
