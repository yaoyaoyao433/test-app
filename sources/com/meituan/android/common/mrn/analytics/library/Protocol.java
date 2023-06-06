package com.meituan.android.common.mrn.analytics.library;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Protocol {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class EventBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String bid;
        public String category;
        public String cid;
        public String containerId;
        public String mreq_id;
        public String orderid;
        public String pageInfoKey;
        public HashMap vallab;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class ExposureBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String containerId;
        public int mduration;
        public int mduration_cnt;
        public int mduration_total;
        public String mreq_id;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class TagBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String key;
        public ReadableMap value;
    }

    public static EventBean parseEvent(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54772c1c6eb49ebb73bdeb6a69f0d605", RobustBitConfig.DEFAULT_VALUE)) {
            return (EventBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54772c1c6eb49ebb73bdeb6a69f0d605");
        }
        if (readableMap == null) {
            return null;
        }
        EventBean eventBean = new EventBean();
        if (checkTypeValid(readableMap, "pageInfoKey", ReadableType.String).booleanValue()) {
            eventBean.pageInfoKey = readableMap.getString("pageInfoKey");
        }
        if (checkTypeValid(readableMap, "category", ReadableType.String).booleanValue()) {
            eventBean.category = readableMap.getString("category");
        }
        if (checkTypeValid(readableMap, "cid", ReadableType.String).booleanValue()) {
            eventBean.cid = readableMap.getString("cid");
        }
        if (checkTypeValid(readableMap, "bid", ReadableType.String).booleanValue()) {
            eventBean.bid = readableMap.getString("bid");
        }
        if (checkTypeValid(readableMap, Constants.EventConstants.KEY_ORDER_ID, ReadableType.String).booleanValue()) {
            eventBean.orderid = readableMap.getString(Constants.EventConstants.KEY_ORDER_ID);
        }
        if (checkTypeValid(readableMap, "valLab", ReadableType.Map).booleanValue()) {
            eventBean.vallab = NativeStasticsProxy.getMapFromRN(readableMap.getMap("valLab"));
        }
        if (checkTypeValid(readableMap, "mreqID", ReadableType.String).booleanValue()) {
            eventBean.mreq_id = readableMap.getString("mreqID");
        }
        if (checkTypeValid(readableMap, "containerID", ReadableType.String).booleanValue()) {
            eventBean.containerId = readableMap.getString("containerID");
        }
        return eventBean;
    }

    public static TagBean parseTag(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b903220124dc64f031e5859ec9a86b63", RobustBitConfig.DEFAULT_VALUE)) {
            return (TagBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b903220124dc64f031e5859ec9a86b63");
        }
        if (readableMap == null) {
            return null;
        }
        TagBean tagBean = new TagBean();
        if (checkTypeValid(readableMap, "key", ReadableType.String).booleanValue()) {
            tagBean.key = readableMap.getString("key");
        }
        if (checkTypeValid(readableMap, Constants.TagConstants.TAG_VALUE, ReadableType.Map).booleanValue()) {
            tagBean.value = readableMap.getMap(Constants.TagConstants.TAG_VALUE);
        }
        return tagBean;
    }

    public static ExposureBean parseExposure(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cfe3a10738ef64ad28941c269cdfed0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExposureBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cfe3a10738ef64ad28941c269cdfed0d");
        }
        if (readableMap == null) {
            return null;
        }
        ExposureBean exposureBean = new ExposureBean();
        if (checkTypeValid(readableMap, "mreqID", ReadableType.String).booleanValue()) {
            exposureBean.mreq_id = readableMap.getString("mreqID");
        }
        if (checkTypeValid(readableMap, Constants.ExposureConstants.KEY_MDURATION, ReadableType.Number).booleanValue()) {
            exposureBean.mduration = readableMap.getInt(Constants.ExposureConstants.KEY_MDURATION);
        }
        if (checkTypeValid(readableMap, Constants.ExposureConstants.KEY_MDURATION_TOTAL, ReadableType.Number).booleanValue()) {
            exposureBean.mduration_total = readableMap.getInt(Constants.ExposureConstants.KEY_MDURATION_TOTAL);
        }
        if (checkTypeValid(readableMap, Constants.ExposureConstants.KEY_MDURATION_CNT, ReadableType.Number).booleanValue()) {
            exposureBean.mduration_cnt = readableMap.getInt(Constants.ExposureConstants.KEY_MDURATION_CNT);
        }
        if (checkTypeValid(readableMap, "containerID", ReadableType.String).booleanValue()) {
            exposureBean.containerId = readableMap.getString("containerID");
        }
        return exposureBean;
    }

    private static Boolean checkTypeValid(ReadableMap readableMap, String str, ReadableType readableType) {
        boolean z = false;
        Object[] objArr = {readableMap, str, readableType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "04b37909d708f88841544302c9520da0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "04b37909d708f88841544302c9520da0");
        }
        if (readableMap.hasKey(str) && readableType == readableMap.getType(str)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
