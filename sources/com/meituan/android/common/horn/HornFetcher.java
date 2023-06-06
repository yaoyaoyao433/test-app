package com.meituan.android.common.horn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.NetWorkUtils;
import java.util.Date;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HornFetcher {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile HornFetcher singleFetcher = null;
    private static volatile boolean withoutNetError = false;
    private HornCacheCenter mCenter;
    private Context mContext;

    public static synchronized HornFetcher getInstance(Context context) {
        synchronized (HornFetcher.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "668d4c590174fc0127d1793e5508794b", 6917529027641081856L)) {
                return (HornFetcher) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "668d4c590174fc0127d1793e5508794b");
            }
            if (singleFetcher == null) {
                singleFetcher = new HornFetcher(context);
            }
            return singleFetcher;
        }
    }

    public HornFetcher(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea59c7fa3efe45cc74253b73244cf638", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea59c7fa3efe45cc74253b73244cf638");
            return;
        }
        this.mContext = context;
        this.mCenter = HornCacheCenter.getInstance(context);
    }

    public synchronized void loadConfig(HornRequest hornRequest) {
        boolean z = true;
        Object[] objArr = {hornRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "722c9d7a8dd539ee5cca38105fcc3c57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "722c9d7a8dd539ee5cca38105fcc3c57");
        } else if (hornRequest == null) {
        } else {
            String str = hornRequest.mType;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            HornCallback hornCallback = hornRequest.mHornCallback;
            if (hornCallback == null) {
                return;
            }
            this.mCenter.optCallback(str, hornCallback);
            MonitorRecord monitorRecord = new MonitorRecord(hornRequest.mType);
            String str2 = (String) hornRequest.mHornQueryMap.get("horn_source");
            monitorRecord.setSource(str2);
            if (TextUtils.isEmpty(str2) || !"push".equals(str2)) {
                z = false;
            }
            if ("cache".equals(str2)) {
                monitorRecord.setMode("cache");
                applyConfigFromCache(hornRequest, monitorRecord);
                return;
            }
            if (!HornUtils.isHighPriorityProcess(this.mContext) && !z) {
                monitorRecord.setMode(MonitorRecord.MODE_LOW_PRIORITY);
                applyConfigFromCache(hornRequest, monitorRecord);
                return;
            }
            if (NetWorkUtils.isNetworkConnected(InnerHorn.context)) {
                applyConfigFromNet(hornRequest, monitorRecord);
            } else {
                monitorRecord.setMode(MonitorRecord.MODE_NO_NET);
                applyConfigFromCache(hornRequest, monitorRecord);
            }
        }
    }

    private void applyConfigFromCache(HornRequest hornRequest, @NonNull MonitorRecord monitorRecord) {
        boolean z = false;
        Object[] objArr = {hornRequest, monitorRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a66ced17938cdd32b39fec1509e2305e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a66ced17938cdd32b39fec1509e2305e");
            return;
        }
        Map<String, Object> map = hornRequest.mHornQueryMap;
        if (map == null) {
            return;
        }
        String str = (String) hornRequest.mHornQueryMap.remove("horn_source");
        if (!TextUtils.isEmpty(str) && "poll".equals(str)) {
            z = true;
        }
        boolean applyConfigFromCache = this.mCenter.applyConfigFromCache((String) map.get("from"), z, monitorRecord);
        Logw.d(Logw.TAG, "::applyConfigFromCache::" + new Date(System.currentTimeMillis()));
        Logw.d(Logw.TAG, "::applyConfigFromCache::" + applyConfigFromCache);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private void applyConfigFromNet(com.meituan.android.common.horn.HornRequest r34, @android.support.annotation.NonNull com.meituan.android.common.horn.MonitorRecord r35) {
        /*
            Method dump skipped, instructions count: 1285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.horn.HornFetcher.applyConfigFromNet(com.meituan.android.common.horn.HornRequest, com.meituan.android.common.horn.MonitorRecord):void");
    }

    private boolean isInterceptRequest(String str, String str2, boolean z, long j, long j2, int i, @NonNull MonitorRecord monitorRecord) {
        boolean z2;
        boolean contains;
        int obtainCacheDuration;
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), new Long(j2), Integer.valueOf(i), monitorRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "028869ff42381910166b296ba17bf2b8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "028869ff42381910166b296ba17bf2b8")).booleanValue();
        }
        try {
            contains = str.contains("push");
            obtainCacheDuration = this.mCenter.obtainCacheDuration(str2);
            z2 = withoutNetError;
        } catch (Throwable th) {
            th = th;
            z2 = false;
        }
        try {
            if (z2 || contains || z) {
                Logw.d(Logw.TAG, "due to without network or belong to push request, load it!");
                this.mCenter.cacheRequestInfo(j, str2, 0);
                return false;
            }
            long j3 = j - j2;
            if (j3 <= obtainCacheDuration * 60 * 1000 && j3 > 0) {
                Logw.d(Logw.TAG, "request duration " + j3 + " less than " + obtainCacheDuration + " mins, load config from cache");
                monitorRecord.setMode(MonitorRecord.MODE_CACHE_DURATION);
                this.mCenter.applyConfigFromCache(str2, str.contains("poll"), monitorRecord);
                if (i >= 10) {
                    String obtainData = this.mCenter.obtainData(this.mCenter.getAlertFile(str2));
                    if (System.currentTimeMillis() - (!TextUtils.isEmpty(obtainData) ? Long.valueOf(obtainData).longValue() : 0L) > DDLoadConstants.TIME_HOURS_MILLIS) {
                        this.mCenter.cacheData(HornMonitor.reportAlertLog(InnerHorn.context, str2) ? String.valueOf(System.currentTimeMillis()) : "", this.mCenter.getAlertFile(str2));
                    }
                } else {
                    this.mCenter.cacheRequestInfo(j2, str2, i + 1);
                }
                return true;
            }
            Logw.d(Logw.TAG, "request duration more than " + obtainCacheDuration + " mins, load it!");
            this.mCenter.cacheRequestInfo(j, str2, 0);
            return false;
        } catch (Throwable th2) {
            th = th2;
            if (InnerHorn.isDebug) {
                th.printStackTrace();
                return z2;
            }
            return z2;
        }
    }
}
