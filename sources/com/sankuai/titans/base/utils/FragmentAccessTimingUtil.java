package com.sankuai.titans.base.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.Titans;
import com.sankuai.titans.protocol.services.IStatisticsService;
import com.sankuai.titans.protocol.services.statisticInfo.AccessTimingInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FragmentAccessTimingUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final IStatisticsService mStatisticsService = Titans.serviceManager().getStatisticsService();

    public static AccessTimingInfo initContainerTiming(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ffb95b7473fc05ae5ebd148a708edfc", RobustBitConfig.DEFAULT_VALUE)) {
            return (AccessTimingInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ffb95b7473fc05ae5ebd148a708edfc");
        }
        AccessTimingInfo accessTimingInfo = new AccessTimingInfo("20.14.1");
        accessTimingInfo.setIsTitansInited(i);
        return accessTimingInfo;
    }

    public static void containerStartPoint(AccessTimingInfo accessTimingInfo) {
        Object[] objArr = {accessTimingInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5477d60fe231009e5ce9e4d41b519938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5477d60fe231009e5ce9e4d41b519938");
        } else if (accessTimingInfo == null) {
        } else {
            accessTimingInfo.startPoint("onContainerStart", System.currentTimeMillis());
        }
    }

    public static void containerEndPoint(AccessTimingInfo accessTimingInfo, String str, String str2, int i) {
        Object[] objArr = {accessTimingInfo, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95d4ea25d723eda64cee3eab4491a0e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95d4ea25d723eda64cee3eab4491a0e7");
        } else if (accessTimingInfo != null && accessTimingInfo.getDurationStartTime() > 0) {
            long currentTimeMillis = System.currentTimeMillis() - accessTimingInfo.getDurationStartTime();
            if (currentTimeMillis < 0) {
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                accessTimingInfo.setPageUrl(str2);
            }
            accessTimingInfo.setIsTitansInited(i);
            accessTimingInfo.endPoint(str, currentTimeMillis);
            mStatisticsService.reportTimingInfo(accessTimingInfo);
        }
    }

    public static AccessTimingInfo initPageAccessTiming(String str, String str2, String str3, int i, String str4) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "00eeae82ee13ca06f6ac0c0edfb3e9ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (AccessTimingInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "00eeae82ee13ca06f6ac0c0edfb3e9ab");
        }
        AccessTimingInfo accessTimingInfo = new AccessTimingInfo("20.14.1");
        accessTimingInfo.setPageUrl(str);
        if (!TextUtils.isEmpty(str2)) {
            accessTimingInfo.setPageReferer(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            accessTimingInfo.setPageRefererSource(str3);
        }
        accessTimingInfo.setIsTitansInited(i);
        accessTimingInfo.setScheme(str4);
        return accessTimingInfo;
    }

    public static void pageStartPoint(AccessTimingInfo accessTimingInfo) {
        Object[] objArr = {accessTimingInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a1a120b27a3a4f1320ddcc9190283c27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a1a120b27a3a4f1320ddcc9190283c27");
        } else if (accessTimingInfo == null) {
        } else {
            accessTimingInfo.startPoint("loadURL", System.currentTimeMillis());
        }
    }

    public static void pageEndPoint(AccessTimingInfo accessTimingInfo, String str, long j) {
        Object[] objArr = {accessTimingInfo, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "50b46a1b998a38dd843f29b5170c4d38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "50b46a1b998a38dd843f29b5170c4d38");
        } else if (accessTimingInfo != null && accessTimingInfo.getDurationStartTime() > 0) {
            long timeCost = ((accessTimingInfo.getTimeCost() + System.currentTimeMillis()) - accessTimingInfo.getDurationStartTime()) - j;
            if (timeCost < 0) {
                return;
            }
            accessTimingInfo.endPoint(str, timeCost);
            mStatisticsService.reportTimingInfo(accessTimingInfo);
        }
    }

    public static void reportVisitInfo(AccessTimingInfo accessTimingInfo, String str) {
        Object[] objArr = {accessTimingInfo, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "62c49ab9074e2b68c7949617644a7cb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "62c49ab9074e2b68c7949617644a7cb1");
        } else if (accessTimingInfo == null) {
        } else {
            mStatisticsService.reportVisitInfo(str, accessTimingInfo);
        }
    }
}
