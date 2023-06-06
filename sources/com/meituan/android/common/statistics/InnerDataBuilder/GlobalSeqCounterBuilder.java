package com.meituan.android.common.statistics.InnerDataBuilder;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.StatisticsHandler;
import com.meituan.android.common.statistics.utils.SharedPreferencesHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GlobalSeqCounterBuilder extends BaseBuilder {
    private static final String APP_LAUNCHER_ID = "app_launch_id";
    private static final String GLOBAL_SEQUENCE_COUNTER = "gseq";
    private static final String GLOBAL_SEQUENCE_ID = "gseq_id";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static Lock lock = new ReentrantLock();
    private static String mAppLauncherId = UUID.randomUUID().toString();
    private static volatile long mSeq = -1;
    private static volatile String mSeqID;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static GlobalSeqCounterBuilder instance = new GlobalSeqCounterBuilder();
    }

    public static GlobalSeqCounterBuilder getInstance() {
        return Holder.instance;
    }

    public static final long getSeq(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "836ccf05131a001b0803fea62a91398a", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "836ccf05131a001b0803fea62a91398a")).longValue();
        }
        lock.lock();
        try {
            if (mSeq == -1) {
                long seqFromCache = getSeqFromCache(context);
                mSeq = seqFromCache;
                if (seqFromCache == -1) {
                    createGlobalSeqID(context);
                }
            }
            mSeq++;
            saveSeqToCacheAsync(context, mSeq);
        } catch (Throwable unused) {
        }
        lock.unlock();
        return mSeq;
    }

    private static void saveSeqToCacheAsync(final Context context, final long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8abedebc59b02948542870d8a524972d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8abedebc59b02948542870d8a524972d");
        } else {
            StatisticsHandler.getInstance().innerStatistic(new Runnable() { // from class: com.meituan.android.common.statistics.InnerDataBuilder.GlobalSeqCounterBuilder.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d158d7a536237d80b88359c5f2543b94", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d158d7a536237d80b88359c5f2543b94");
                        return;
                    }
                    try {
                        SharedPreferencesHelper.getInstance(context).saveGlobalSeqCounter(j);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private static long getSeqFromCache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64eda0dff325253e6de145a7d3d4d851", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64eda0dff325253e6de145a7d3d4d851")).longValue() : SharedPreferencesHelper.getInstance(context).getGlobalSeqCounter();
    }

    private static void createGlobalSeqID(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "11d84bc1c46c4d74c761800d98acd6f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "11d84bc1c46c4d74c761800d98acd6f3");
            return;
        }
        String uuid = UUID.randomUUID().toString();
        SharedPreferencesHelper.getInstance(context).saveGlobalSeqID(uuid + System.currentTimeMillis());
    }

    public static String getGlobalSeqID(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d7a63b1a1699ec43da3364a6bc4f2591", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d7a63b1a1699ec43da3364a6bc4f2591");
        }
        lock.lock();
        try {
            if (TextUtils.isEmpty(mSeqID)) {
                mSeqID = SharedPreferencesHelper.getInstance(context).getGlobalSeqID();
            }
            String str = mSeqID;
            lock.unlock();
            return str;
        } catch (Throwable unused) {
            lock.unlock();
            return mSeqID == null ? "" : mSeqID;
        }
    }

    @Override // com.meituan.android.common.statistics.InnerDataBuilder.BaseBuilder
    public boolean checkIfNeedReport() {
        return this.mNeedReport;
    }

    @Override // com.meituan.android.common.statistics.InnerDataBuilder.BaseBuilder
    public JSONObject onProcessData(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, long j) {
        Object[] objArr = {jSONObject, jSONObject2, jSONObject3, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d77423610ca8c0a76af27effd1906e20", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d77423610ca8c0a76af27effd1906e20");
        }
        if (jSONObject2 == null) {
            return null;
        }
        try {
            jSONObject2.put(GLOBAL_SEQUENCE_COUNTER, getSeq(getContext()));
            jSONObject2.put(GLOBAL_SEQUENCE_ID, getGlobalSeqID(getContext()));
            jSONObject2.put(APP_LAUNCHER_ID, mAppLauncherId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject2;
    }
}
