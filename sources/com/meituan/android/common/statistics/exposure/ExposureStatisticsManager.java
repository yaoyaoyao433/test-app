package com.meituan.android.common.statistics.exposure;

import android.text.TextUtils;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ExposureStatisticsManager {
    private static final String TAG = "ExposureStatisticsManager";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile ExposureStatisticsManager mInstance;
    public ConcurrentHashMap<String, ExposureStatisticInfo> mInfoMap;

    public ExposureStatisticsManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "598db23c13693c993dd0eae3fd46b1a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "598db23c13693c993dd0eae3fd46b1a6");
        } else {
            this.mInfoMap = new ConcurrentHashMap<>();
        }
    }

    public static ExposureStatisticsManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d47cce55bc794878351d0f0807fb885d", 6917529027641081856L)) {
            return (ExposureStatisticsManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d47cce55bc794878351d0f0807fb885d");
        }
        if (mInstance == null) {
            synchronized (ExposureInfoCache.class) {
                if (mInstance == null) {
                    mInstance = new ExposureStatisticsManager();
                }
            }
        }
        return mInstance;
    }

    public ConcurrentHashMap<String, ExposureStatisticInfo> getStatisticsMap() {
        return this.mInfoMap;
    }

    public ExposureStatisticInfo getExposureStatistic(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a926bcc2593f10ad0d9bc16ae4c8cc1", 6917529027641081856L) ? (ExposureStatisticInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a926bcc2593f10ad0d9bc16ae4c8cc1") : this.mInfoMap.get(str);
    }

    public void updateStatistic(String str, int i, int i2, long j) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12ac8398f7b947b62bd64741a5ce98e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12ac8398f7b947b62bd64741a5ce98e3");
            return;
        }
        ExposureStatisticInfo exposureStatisticInfo = this.mInfoMap.get(str);
        if (exposureStatisticInfo != null) {
            exposureStatisticInfo.updateStatisticInfoMd(i, i2, j);
        }
    }

    public void updateExposureInfo(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7513b1c2bd5f2146f3f219e25ed55406", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7513b1c2bd5f2146f3f219e25ed55406");
            return;
        }
        LogUtil.log("lxsdktest", "ExposureInfo updateExposureInfo: mreq_id:" + str + " req_id:" + str2 + " sessionID:" + str3 + " cid:" + str5);
        ExposureStatisticInfo exposureStatisticInfo = this.mInfoMap.get(str);
        if (exposureStatisticInfo != null) {
            exposureStatisticInfo.req_id = str2;
            exposureStatisticInfo.msid = str3;
            exposureStatisticInfo.app_msid = str4;
            if (TextUtils.isEmpty(exposureStatisticInfo.val_cid)) {
                exposureStatisticInfo.val_cid = str5;
            }
        }
    }

    public void putExposureStatisticMv(AbstractExposureInfo abstractExposureInfo) {
        Object[] objArr = {abstractExposureInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23744a3971fd4dc4f031c45afd1cb2c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23744a3971fd4dc4f031c45afd1cb2c3");
            return;
        }
        LogUtil.log("lxsdktest", "ExposureInfo jsonObject: " + abstractExposureInfo.toString());
        ExposureStatisticInfo exposureStatisticInfo = this.mInfoMap.get(abstractExposureInfo.getMreqId());
        if (exposureStatisticInfo != null && abstractExposureInfo.mv_end_time > 0) {
            exposureStatisticInfo.updateStatisticInfoMv(abstractExposureInfo.getDurationGap(), abstractExposureInfo.isFirstMv());
        }
        LogUtil.log("lxsdktest", "exposure info report cache: " + this.mInfoMap);
    }

    public void putExposureStatisticMd(AbstractExposureInfo abstractExposureInfo) {
        Object[] objArr = {abstractExposureInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3f47b97fadfc58fecb5f80469387628", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3f47b97fadfc58fecb5f80469387628");
            return;
        }
        LogUtil.log("lxsdktest", "ExposureInfo jsonObject: " + abstractExposureInfo.toString());
        ExposureStatisticInfo exposureStatisticInfo = this.mInfoMap.get(abstractExposureInfo.getMreqId());
        if (exposureStatisticInfo != null) {
            exposureStatisticInfo.updateStatisticInfoMd(abstractExposureInfo.getMdurationCnt(), abstractExposureInfo.getMdurationTotal(), abstractExposureInfo.getDuration());
        } else {
            this.mInfoMap.put(abstractExposureInfo.getMreqId(), new ExposureStatisticInfo(abstractExposureInfo));
        }
        LogUtil.log("lxsdktest", "exposure info report cache: " + this.mInfoMap);
    }

    public void removeExposureInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da64f18c95379c90db83e95cce9aa310", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da64f18c95379c90db83e95cce9aa310");
        } else {
            this.mInfoMap.remove(str);
        }
    }
}
