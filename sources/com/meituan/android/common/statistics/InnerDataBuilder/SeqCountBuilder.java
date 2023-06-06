package com.meituan.android.common.statistics.InnerDataBuilder;

import android.content.Context;
import com.meituan.android.common.statistics.StatisticsHandler;
import com.meituan.android.common.statistics.utils.SharedPreferencesHelper;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SeqCountBuilder extends BaseBuilder {
    private static final String SEQUENCE_NAME = "seq";
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile long mSeq;
    private volatile long mSeqTimeLastSaved;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static SeqCountBuilder instance = new SeqCountBuilder();
    }

    public SeqCountBuilder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9ac6e8bc001ffbc88ef85833176615c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9ac6e8bc001ffbc88ef85833176615c");
            return;
        }
        this.mSeq = -1L;
        this.mSeqTimeLastSaved = 0L;
    }

    public static SeqCountBuilder getInstance() {
        return Holder.instance;
    }

    public synchronized long getSeq() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2ef458e529963ec5bd25119bed832ae", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2ef458e529963ec5bd25119bed832ae")).longValue();
        }
        if (checkDateOverDue(getContext())) {
            reset();
        } else if (this.mSeq == -1) {
            this.mSeq = getSeqFromCache(getContext());
        }
        this.mSeq++;
        saveSeqToCacheAsync(this.mSeq);
        return this.mSeq;
    }

    private void saveSeqToCacheAsync(final long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f9f957aed843fdfd1832b75acf1ee18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f9f957aed843fdfd1832b75acf1ee18");
        } else {
            StatisticsHandler.getInstance().innerStatistic(new Runnable() { // from class: com.meituan.android.common.statistics.InnerDataBuilder.SeqCountBuilder.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "59f5f4370d2a4c34d30f878d570960e0", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "59f5f4370d2a4c34d30f878d570960e0");
                        return;
                    }
                    try {
                        SharedPreferencesHelper.getInstance(SeqCountBuilder.this.getContext()).saveSequenceCounter(j);
                        if (AppUtil.checkOverdue(SeqCountBuilder.this.mSeqTimeLastSaved)) {
                            SharedPreferencesHelper.getInstance(SeqCountBuilder.this.getContext()).saveSequenceTime(System.currentTimeMillis());
                            SeqCountBuilder.this.mSeqTimeLastSaved = System.currentTimeMillis();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private long getSeqFromCache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d71a1998af997cad99d6570bb39c0abf", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d71a1998af997cad99d6570bb39c0abf")).longValue() : SharedPreferencesHelper.getInstance(context).getSequenceCounter();
    }

    private synchronized void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f906bc1fbc04b7d62a686ae696a5c4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f906bc1fbc04b7d62a686ae696a5c4a");
        } else {
            this.mSeq = -1L;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b894fa436642f4825c1a16cb24b2a4f4", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b894fa436642f4825c1a16cb24b2a4f4");
        }
        if (jSONObject2 == null) {
            return null;
        }
        try {
            jSONObject2.put("seq", getSeq());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject2;
    }

    private boolean checkDateOverDue(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fedd216edeac330a7b9fe8f9f90b13b9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fedd216edeac330a7b9fe8f9f90b13b9")).booleanValue();
        }
        if (this.mSeqTimeLastSaved == 0) {
            this.mSeqTimeLastSaved = SharedPreferencesHelper.getInstance(context).getSequenceTime();
        }
        if (this.mSeqTimeLastSaved == 0) {
            return true;
        }
        return AppUtil.checkOverdue(this.mSeqTimeLastSaved);
    }
}
