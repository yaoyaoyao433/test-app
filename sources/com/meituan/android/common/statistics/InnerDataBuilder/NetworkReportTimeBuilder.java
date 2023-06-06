package com.meituan.android.common.statistics.InnerDataBuilder;

import android.content.Context;
import com.meituan.android.common.statistics.utils.SntpUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NetworkReportTimeBuilder extends BaseBuilder {
    private static final String NTP_TIME_SYNCED_NAME = "stm_sync";
    private static final String REPORT_NAME = "rtm";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isTimeSynced;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static NetworkReportTimeBuilder instance = new NetworkReportTimeBuilder();
    }

    public NetworkReportTimeBuilder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "254c85cf57d6f16af1f731966353231c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "254c85cf57d6f16af1f731966353231c");
        } else {
            this.isTimeSynced = false;
        }
    }

    public static NetworkReportTimeBuilder getInstance() {
        return Holder.instance;
    }

    @Override // com.meituan.android.common.statistics.InnerDataBuilder.BaseBuilder
    public void onPreProcessData(Context context, JSONObject jSONObject, JSONObject jSONObject2, long j) {
        Object[] objArr = {context, jSONObject, jSONObject2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a88e375e3afe8e9d9260d3792e45ca76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a88e375e3afe8e9d9260d3792e45ca76");
        } else if (jSONObject != null) {
            try {
                if (jSONObject.has(NTP_TIME_SYNCED_NAME)) {
                    this.isTimeSynced = ((Boolean) jSONObject.remove(NTP_TIME_SYNCED_NAME)).booleanValue();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.meituan.android.common.statistics.InnerDataBuilder.BaseBuilder
    public JSONObject onProcessData(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, long j) {
        Object[] objArr = {jSONObject, jSONObject2, jSONObject3, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5046ac77fce733eb67b207810b7bd454", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5046ac77fce733eb67b207810b7bd454");
        }
        if (jSONObject2 == null) {
            return jSONObject2;
        }
        try {
            if (SntpUtil.isTimeSynchronized()) {
                jSONObject2.put(REPORT_NAME, SntpUtil.currentTimeMillis());
            }
            if (this.isTimeSynced) {
                jSONObject2.put(NTP_TIME_SYNCED_NAME, this.isTimeSynced);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject2;
    }

    @Override // com.meituan.android.common.statistics.InnerDataBuilder.BaseBuilder
    public boolean checkIfNeedReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dc879cdc10940b959e35c20788057ae", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dc879cdc10940b959e35c20788057ae")).booleanValue();
        }
        if (this.mNeedReport) {
            return SntpUtil.isTimeSynchronized() || this.isTimeSynced;
        }
        return false;
    }

    @Override // com.meituan.android.common.statistics.InnerDataBuilder.BaseBuilder
    public void onPostProcessData(Context context, JSONObject jSONObject) {
        this.isTimeSynced = false;
    }
}
