package com.meituan.android.common.statistics.utils;

import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.entity.BusinessInfo;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.exposure.ExposureStatisticInfo;
import com.meituan.android.common.statistics.exposure.ExposureStatisticsManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StatisticsUtils {
    private static final int EXPOSURE_REPORT_DATA_LIMIT = 20;
    private static final String SC_EXPOSURE_BID = "b_techportal_rc597jbn_sc";
    private static final String SC_EXPOSURE_CID = "c_techportal_6z8t8npy";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Deprecated
    public static void mgeViewEvent(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "07ff22692bb50274c8cd2a216ba0326f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "07ff22692bb50274c8cd2a216ba0326f");
        } else {
            mgeEvent(Constants.EventType.VIEW, str, map, null, null, null, null);
        }
    }

    @Deprecated
    public static void mgeClickEvent(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "388280ce608c50bc8683afcdd2f1e75b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "388280ce608c50bc8683afcdd2f1e75b");
        } else {
            mgeEvent("click", str, map, null, null, null, null);
        }
    }

    private static void mgeEvent(String str, String str2, Map<String, Object> map, String str3, BusinessInfo businessInfo, String str4, String str5) {
        Object[] objArr = {str, str2, map, str3, businessInfo, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b74db0722ea7b5ebbb904e5e9b689638", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b74db0722ea7b5ebbb904e5e9b689638");
            return;
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.MGE;
        eventInfo.event_type = str;
        eventInfo.val_bid = str2;
        eventInfo.index = str3;
        if (map != null) {
            eventInfo.val_lab = map;
        }
        if (businessInfo != null) {
            eventInfo.val_val = businessInfo;
        }
        eventInfo.val_act = str4;
        eventInfo.element_id = str5;
        Channel channel = Statistics.getChannel();
        if (channel != null) {
            channel.writeEvent((String) null, eventInfo);
        }
    }

    public static void commitExposureStatisticInfo(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f512218700d9265ea4986f2a6a95428", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f512218700d9265ea4986f2a6a95428");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap<String, ExposureStatisticInfo> statisticsMap = ExposureStatisticsManager.getInstance().getStatisticsMap();
        if (statisticsMap != null) {
            LogUtil.log("lxsdktest", "get expose statis info list:");
            for (Map.Entry<String, ExposureStatisticInfo> entry : statisticsMap.entrySet()) {
                LogUtil.log("lxsdktest", "get expose statis info item:" + entry.getKey() + " value:" + entry.getValue().toJSonObject().toString());
            }
        } else {
            LogUtil.log("lxsdktest", "get expose statis info is empty");
        }
        if (statisticsMap != null) {
            Iterator<Map.Entry<String, ExposureStatisticInfo>> it = statisticsMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, ExposureStatisticInfo> next = it.next();
                next.getKey();
                ExposureStatisticInfo value = next.getValue();
                if (value != null && value.isPageInfoReady()) {
                    arrayList.add(value.toJSonObject());
                    it.remove();
                }
            }
        }
        int size = arrayList.size();
        if (size > 0) {
            int i2 = size / 20;
            if (i2 <= 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("mod_exp_list", arrayList);
                Statistics.getChannel("techportal").writeSystemCheck(str, SC_EXPOSURE_BID, hashMap, SC_EXPOSURE_CID);
                return;
            }
            while (i < i2) {
                HashMap hashMap2 = new HashMap();
                int i3 = i * 20;
                i++;
                hashMap2.put("mod_exp_list", arrayList.subList(i3, i * 20));
                Statistics.getChannel("techportal").writeSystemCheck(str, SC_EXPOSURE_BID, hashMap2, SC_EXPOSURE_CID);
            }
            if (i2 * 20 < size) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("mod_exp_list", arrayList.subList(i * 20, size));
                Statistics.getChannel("techportal").writeSystemCheck(str, SC_EXPOSURE_BID, hashMap3, SC_EXPOSURE_CID);
            }
        }
    }
}
