package com.meituan.android.common.horn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.horn.HornCacheCenter;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.NetWorkUtils;
import java.util.Date;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HornFetcherBatch {
    private static volatile HornFetcherBatch batchFetcher = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static boolean netError = false;
    public static boolean wasErrror;
    private HornCacheCenter mCenter;
    private Context mContext;

    public static synchronized HornFetcherBatch getInstance(Context context) {
        synchronized (HornFetcherBatch.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dbfe8d46327f76310d41b7a6ed2d6953", 6917529027641081856L)) {
                return (HornFetcherBatch) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dbfe8d46327f76310d41b7a6ed2d6953");
            }
            if (batchFetcher == null) {
                batchFetcher = new HornFetcherBatch(context);
            }
            return batchFetcher;
        }
    }

    public HornFetcherBatch(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1584f5c142a6d7f8ff1d9ea882d3b8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1584f5c142a6d7f8ff1d9ea882d3b8f");
            return;
        }
        this.mContext = context;
        this.mCenter = HornCacheCenter.getInstance(this.mContext);
    }

    public synchronized void loadConfig(HornRequest hornRequest) {
        Object[] objArr = {hornRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a43f05318cc42ed59745aa77914b742", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a43f05318cc42ed59745aa77914b742");
        } else if (hornRequest != null) {
            Map<String, HornCallback> map = hornRequest.mCallbacks;
            if (map != null && map.size() != 0) {
                for (Map.Entry<String, HornCallback> entry : map.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        this.mCenter.optCallback(entry.getKey(), entry.getValue());
                    }
                    Logw.e(Logw.TAG, "callback setting error, the theKey=" + entry.getKey() + ", theValue" + entry.getValue());
                }
                if (HornUtils.isHighPriorityProcess(this.mContext)) {
                    if (NetWorkUtils.isNetworkConnected(this.mContext)) {
                        applyConfigFromNet(hornRequest);
                    } else {
                        applyFromCacheWithRecord(hornRequest, MonitorRecord.MODE_NO_NET);
                    }
                    return;
                }
                applyFromCacheWithRecord(hornRequest, MonitorRecord.MODE_LOW_PRIORITY);
            }
        }
    }

    private void applyFromCacheWithRecord(HornRequest hornRequest, String str) {
        Object[] objArr = {hornRequest, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "941f55a552d9c0d90a827f8d531f4a0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "941f55a552d9c0d90a827f8d531f4a0a");
            return;
        }
        MonitorRecord monitorRecord = new MonitorRecord();
        try {
            monitorRecord.setSource((String) hornRequest.mHornQueryMap.get("horn_source"));
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
        }
        monitorRecord.setMode(str);
        applyConfigFromCache(hornRequest, monitorRecord);
    }

    private boolean overCacheDuraion(long j, @NonNull String str, boolean z, boolean z2, @NonNull MonitorRecord monitorRecord) {
        Object[] objArr = {new Long(j), str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), monitorRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48ad6778976d759db44a0f52d8433c6d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48ad6778976d759db44a0f52d8433c6d")).booleanValue();
        }
        try {
            Logw.d(Logw.TAG, "obtain " + str + " config from net::requestTime::" + new Date(j));
            HornCacheCenter.TypeInfo obtainRequestInfo = this.mCenter.obtainRequestInfo(str);
            if (obtainRequestInfo == null) {
                return false;
            }
            long j2 = obtainRequestInfo.lastTime;
            int i = obtainRequestInfo.count;
            Logw.d(Logw.TAG, "batch obtain " + str + " config from net::last requestTime::" + new Date(j2));
            if (!netError && !z2) {
                int obtainCacheDuration = this.mCenter.obtainCacheDuration(str);
                long j3 = j - j2;
                if (j3 <= obtainCacheDuration * 60 * 1000) {
                    if (j3 > 0) {
                        Logw.d(Logw.TAG, "batch " + str + " request duration " + j3 + " less than " + obtainCacheDuration + " mins, load config from cache");
                        MonitorRecord childRecord = monitorRecord.childRecord(str);
                        childRecord.setMode(MonitorRecord.MODE_CACHE_DURATION);
                        this.mCenter.applyConfigFromCache(str, z, childRecord);
                        if (i >= 10) {
                            String obtainData = this.mCenter.obtainData(this.mCenter.getAlertFile(str));
                            if (System.currentTimeMillis() - (TextUtils.isEmpty(obtainData) ? 0L : Long.valueOf(obtainData).longValue()) > DDLoadConstants.TIME_HOURS_MILLIS) {
                                this.mCenter.cacheData(HornMonitor.reportAlertLog(InnerHorn.context, str) ? String.valueOf(System.currentTimeMillis()) : "", this.mCenter.getAlertFile(str));
                            }
                        } else {
                            this.mCenter.cacheRequestInfo(j2, str, i + 1);
                        }
                        return false;
                    }
                }
                Logw.d(Logw.TAG, "batch " + str + " request duration more than " + obtainCacheDuration + " mins, load it!");
                this.mCenter.cacheRequestInfo(j, str, 0);
                return true;
            }
            Logw.d(Logw.TAG, "due to without network, load it!");
            this.mCenter.cacheRequestInfo(j, str, 0);
            return true;
        } catch (Throwable th) {
            if (InnerHorn.isDebug) {
                th.printStackTrace();
            }
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private void applyConfigFromNet(com.meituan.android.common.horn.HornRequest r31) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.horn.HornFetcherBatch.applyConfigFromNet(com.meituan.android.common.horn.HornRequest):void");
    }

    private void applyConfigFromCache(HornRequest hornRequest, @NonNull MonitorRecord monitorRecord) {
        boolean z = false;
        Object[] objArr = {hornRequest, monitorRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "206855681a8739b60fa8a575b35ca781", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "206855681a8739b60fa8a575b35ca781");
        } else if (hornRequest.mHornQueryMap != null) {
            String str = (String) hornRequest.mHornQueryMap.remove("horn_source");
            if (!TextUtils.isEmpty(str) && "batch_poll".equals(str)) {
                z = true;
            }
            for (Map.Entry<String, String> entry : hornRequest.mParams.entrySet()) {
                String key = entry.getKey();
                boolean applyConfigFromCache = this.mCenter.applyConfigFromCache(key, z, monitorRecord.childRecord(key));
                Logw.d(Logw.TAG, "::applyConfigFromCache::" + new Date(System.currentTimeMillis()));
                Logw.d(Logw.TAG, "::applyConfigFromCache::" + applyConfigFromCache);
            }
        }
    }
}
