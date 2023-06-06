package com.meituan.android.common.statistics.exposure;

import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ExposureInfoLocal extends AbstractExposureInfo {
    private static final String TAG = ExposureInfo.class.getSimpleName();
    public static ChangeQuickRedirect changeQuickRedirect;

    public ExposureInfoLocal(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, Object> map, int i, String str9, long j, EventName eventName) {
        super(str, str2, str3, str4, str5, str6, str7, str8, map, i, str9, j, eventName);
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, map, Integer.valueOf(i), str9, new Long(j), eventName};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40f736582b5563db6bd4bf81821aad03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40f736582b5563db6bd4bf81821aad03");
        }
    }

    @Override // com.meituan.android.common.statistics.exposure.AbstractExposureInfo
    public void mv() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31c7812cd5e25687572c8446292b01fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31c7812cd5e25687572c8446292b01fd");
            return;
        }
        super.mv();
        ExposureStatisticsManager.getInstance().putExposureStatisticMv(this);
    }

    @Override // com.meituan.android.common.statistics.exposure.AbstractExposureInfo
    public void md() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "991b850680e0ffada3a94bec07d0e601", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "991b850680e0ffada3a94bec07d0e601");
        } else if (!ConfigManager.getInstance(Statistics.getContext()).isModelExposureOn() || this.curEventName == EventName.MODEL_DISAPPEAR) {
        } else {
            this.curEventName = EventName.MODEL_DISAPPEAR;
            super.md();
            ExposureStatisticsManager.getInstance().putExposureStatisticMd(this);
            writeModelDisappear(this.mPageInfoKey, this.val_bid, null, this.val_cid, this.mreq_id);
        }
    }

    @Override // com.meituan.android.common.statistics.exposure.AbstractExposureInfo
    public void md(AbstractExposureInfo abstractExposureInfo) {
        Object[] objArr = {abstractExposureInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9487edd01b2935977d6c84b78d53f2d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9487edd01b2935977d6c84b78d53f2d6");
        } else if (abstractExposureInfo == null || !ConfigManager.getInstance(Statistics.getContext()).isModelExposureOn() || this.curEventName == EventName.MODEL_DISAPPEAR) {
        } else {
            this.curEventName = EventName.MODEL_DISAPPEAR;
            super.md();
            ExposureStatisticsManager.getInstance().putExposureStatisticMd(abstractExposureInfo);
            writeModelDisappear(this.mPageInfoKey, this.val_bid, null, this.val_cid, this.mreq_id);
        }
    }

    @Override // com.meituan.android.common.statistics.exposure.AbstractExposureInfo
    public void mrnModelDisappear(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "497f4ce5763de646e556b89375c7b94c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "497f4ce5763de646e556b89375c7b94c");
        } else if (ConfigManager.getInstance(Statistics.getContext()).isModelExposureOn()) {
            super.mrnModelDisappear(j, j2, i);
            ExposureStatisticsManager.getInstance().putExposureStatisticMd(this);
            writeModelDisappear(this.mPageInfoKey, this.val_bid, null, this.val_cid, this.mreq_id);
        }
    }

    @Override // com.meituan.android.common.statistics.exposure.AbstractExposureInfo
    public void modelDisappear(AbstractExposureInfo abstractExposureInfo) {
        Object[] objArr = {abstractExposureInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64c761dad3380b1bf32ba0e2f2f8d28d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64c761dad3380b1bf32ba0e2f2f8d28d");
        } else if (abstractExposureInfo == null || !ConfigManager.getInstance(Statistics.getContext()).isModelExposureOn() || this.curEventName == EventName.MODEL_DISAPPEAR) {
        } else {
            this.curEventName = EventName.MODEL_DISAPPEAR;
            super.mrnModelDisappear(abstractExposureInfo.duration, abstractExposureInfo.mduration_total, abstractExposureInfo.mduration_cnt);
            ExposureStatisticsManager.getInstance().putExposureStatisticMd(abstractExposureInfo);
            writeModelDisappear(this.mPageInfoKey, this.val_bid, null, this.val_cid, this.mreq_id);
        }
    }

    @Override // com.meituan.android.common.statistics.exposure.AbstractExposureInfo
    public void commit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f61e56b370d985b40b308e2d21cc01a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f61e56b370d985b40b308e2d21cc01a2");
        } else if (ConfigManager.getInstance(Statistics.getContext()).isModelExposureOn()) {
            ExposureInfoCache.getInstance().removeExposureInfo(this.mreq_id);
        }
    }
}
