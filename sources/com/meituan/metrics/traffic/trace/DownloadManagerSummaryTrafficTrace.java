package com.meituan.metrics.traffic.trace;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.text.TextUtils;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.traffic.MetricsTrafficManager;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DownloadManagerSummaryTrafficTrace extends SummaryTrafficTrace {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DownloadManager downloadManager;
    private DownloadReceiver receiver;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class DownloadReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public DownloadReceiver() {
            Object[] objArr = {DownloadManagerSummaryTrafficTrace.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7aaf27b5d9479bf460b5b63ef6471197", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7aaf27b5d9479bf460b5b63ef6471197");
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb40a4cefbe0e1f5cbab38042c94b039", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb40a4cefbe0e1f5cbab38042c94b039");
                return;
            }
            final long a = f.a(intent, "extra_download_id", -1L);
            if (a == -1 || DownloadManagerSummaryTrafficTrace.this.downloadManager == null) {
                return;
            }
            MetricsTrafficManager.TrafficHandler.post(new Runnable() { // from class: com.meituan.metrics.traffic.trace.DownloadManagerSummaryTrafficTrace.DownloadReceiver.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f4db0d14a56df30fd0f7965919e177fc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f4db0d14a56df30fd0f7965919e177fc");
                        return;
                    }
                    DownloadManager.Query query = new DownloadManager.Query();
                    query.setFilterById(a);
                    Cursor query2 = DownloadManagerSummaryTrafficTrace.this.downloadManager.query(query);
                    if (query2 == null) {
                        return;
                    }
                    while (query2.moveToNext()) {
                        try {
                            int columnIndex = query2.getColumnIndex("local_uri");
                            String string = columnIndex != -1 ? query2.getString(columnIndex) : "";
                            int columnIndex2 = query2.getColumnIndex("bytes_so_far");
                            long j = columnIndex2 != -1 ? query2.getLong(columnIndex2) : 0L;
                            if (!TextUtils.isEmpty(string) && j > 0) {
                                TrafficRecord trafficRecord = new TrafficRecord("");
                                trafficRecord.setKey(string);
                                trafficRecord.rxBytes = j;
                                TrafficRecord.Detail detail = new TrafficRecord.Detail();
                                detail.networkTunnel = "downloadManager";
                                trafficRecord.setDetail(detail);
                                MetricsTrafficManager.getInstance().addCustomTraffic(trafficRecord);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    query2.close();
                }
            }, "handleDownloadTraffic");
        }
    }

    public DownloadManagerSummaryTrafficTrace() {
        super("downloadManager");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74df50a60bb0950d84011c3cbb1c0651", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74df50a60bb0950d84011c3cbb1c0651");
            return;
        }
        this.receiver = new DownloadReceiver();
        this.downloadManager = null;
        MetricsTrafficManager.TrafficHandler.postDelayed(new Runnable() { // from class: com.meituan.metrics.traffic.trace.DownloadManagerSummaryTrafficTrace.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0db25e1b63b471666206f5dafd217c70", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0db25e1b63b471666206f5dafd217c70");
                    return;
                }
                try {
                    Context context = Metrics.getInstance().getContext();
                    DownloadManagerSummaryTrafficTrace.this.downloadManager = (DownloadManager) context.getSystemService("download");
                    context.registerReceiver(DownloadManagerSummaryTrafficTrace.this.receiver, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
                } catch (Throwable unused) {
                }
            }
        }, 8000L, "registerDownloadReceiver");
    }

    @Override // com.meituan.metrics.traffic.trace.SummaryTrafficTrace, com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficInterceptedManager.ITrafficInterceptedListener
    public void onTrafficIntercepted(TrafficRecord trafficRecord, int i) {
        Object[] objArr = {trafficRecord, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11e87197e1312574cbe68d136cf69777", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11e87197e1312574cbe68d136cf69777");
        } else if (trafficRecord.getDetail() == null || !TextUtils.equals("downloadManager", trafficRecord.getDetail().networkTunnel)) {
        } else {
            super.onTrafficIntercepted(trafficRecord, i);
        }
    }
}
