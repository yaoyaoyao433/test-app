package com.meituan.android.common.aidata.mrn;

import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.meituan.android.common.aidata.feature.GetFeatureRequest;
import com.meituan.android.common.aidata.feature.bean.SqlBean;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Protocol {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static SqlBean parseSqlClause(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9373ea3d3c89b6d674f922894a94b044", RobustBitConfig.DEFAULT_VALUE)) {
            return (SqlBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9373ea3d3c89b6d674f922894a94b044");
        }
        if (readableMap == null) {
            return null;
        }
        SqlBean sqlBean = new SqlBean();
        if (checkTypeValid(readableMap, Constants.SQLConstants.KEY_SELECT, ReadableType.String).booleanValue()) {
            sqlBean.select = readableMap.getString(Constants.SQLConstants.KEY_SELECT);
            if (TextUtils.isEmpty(sqlBean.select)) {
                sqlBean.select = "*";
            }
            sqlBean.select = sqlBean.replaceHolder(sqlBean.select);
        }
        if (checkTypeValid(readableMap, "from", ReadableType.String).booleanValue()) {
            sqlBean.from = readableMap.getString("from");
            if (TextUtils.isEmpty(sqlBean.from)) {
                sqlBean.from = "BaseTable";
            }
            sqlBean.from = sqlBean.replaceHolder(sqlBean.from);
        }
        if (checkTypeValid(readableMap, Constants.SQLConstants.KEY_WHERE, ReadableType.String).booleanValue()) {
            sqlBean.where = readableMap.getString(Constants.SQLConstants.KEY_WHERE);
            sqlBean.where = sqlBean.replaceHolder(sqlBean.where);
        }
        if (checkTypeValid(readableMap, Constants.SQLConstants.KEY_GROUP_BY, ReadableType.String).booleanValue()) {
            sqlBean.groupBy = readableMap.getString(Constants.SQLConstants.KEY_GROUP_BY);
            sqlBean.groupBy = sqlBean.replaceHolder(sqlBean.groupBy);
        }
        if (checkTypeValid(readableMap, Constants.SQLConstants.KEY_HAVING, ReadableType.String).booleanValue()) {
            sqlBean.having = readableMap.getString(Constants.SQLConstants.KEY_HAVING);
            sqlBean.having = sqlBean.replaceHolder(sqlBean.having);
        }
        if (checkTypeValid(readableMap, Constants.SQLConstants.KEY_ORDER_BY, ReadableType.String).booleanValue()) {
            sqlBean.orderBy = readableMap.getString(Constants.SQLConstants.KEY_ORDER_BY);
            sqlBean.orderBy = sqlBean.replaceHolder(sqlBean.orderBy);
        }
        if (checkTypeValid(readableMap, "limit", ReadableType.String).booleanValue()) {
            sqlBean.limit = readableMap.getString("limit");
            sqlBean.limit = sqlBean.replaceHolder(sqlBean.limit);
        }
        return sqlBean;
    }

    public static FeatureRequestBean parseFeatureRequest(ReadableMap readableMap) {
        ReadableArray array;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb51b515ee6151c16b2b4a7b54322ce2", RobustBitConfig.DEFAULT_VALUE)) {
            return (FeatureRequestBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb51b515ee6151c16b2b4a7b54322ce2");
        }
        if (readableMap == null) {
            return null;
        }
        FeatureRequestBean featureRequestBean = new FeatureRequestBean();
        if (checkTypeValid(readableMap, Constants.FeatureConstants.KEY_CONFIG_LIST, ReadableType.Array).booleanValue() && (array = readableMap.getArray(Constants.FeatureConstants.KEY_CONFIG_LIST)) != null && array.size() > 0) {
            for (int i = 0; i < array.size(); i++) {
                GetFeatureRequest getFeatureRequest = new GetFeatureRequest();
                ReadableMap map = array.getMap(i);
                if (checkTypeValid(map, "featureName", ReadableType.String).booleanValue()) {
                    getFeatureRequest.feature = map.getString("featureName");
                }
                if (checkTypeValid(map, Constants.FeatureConstants.KEY_REAL_TIME, ReadableType.Boolean).booleanValue()) {
                    getFeatureRequest.isRealTime = map.getBoolean(Constants.FeatureConstants.KEY_REAL_TIME);
                }
                featureRequestBean.featureRequests.add(getFeatureRequest);
            }
        }
        if (checkTypeValid(readableMap, "jsFeatureParam", ReadableType.Map).booleanValue()) {
            try {
                featureRequestBean.jsFeatureParam = new JSONObject(readableMap.getMap("jsFeatureParam").toHashMap());
            } catch (Exception unused) {
            }
        }
        return featureRequestBean;
    }

    public static SubscriberBean parseCEPSubscriber(ReadableMap readableMap) {
        ReadableArray array;
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0732a34c4c299d168f3ceed48ca2ac5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (SubscriberBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0732a34c4c299d168f3ceed48ca2ac5f");
        }
        if (readableMap == null) {
            return null;
        }
        SubscriberBean subscriberBean = new SubscriberBean();
        if (checkTypeValid(readableMap, "containerID", ReadableType.String).booleanValue()) {
            subscriberBean.mRnContainerID = readableMap.getString("containerID");
        }
        if (checkTypeValid(readableMap, "subscriberID", ReadableType.String).booleanValue()) {
            subscriberBean.mSubscribeId = readableMap.getString("subscriberID");
        }
        if (checkTypeValid(readableMap, Constants.SubscriberConstants.KEY_CEP_ID_LIST, ReadableType.Array).booleanValue() && (array = readableMap.getArray(Constants.SubscriberConstants.KEY_CEP_ID_LIST)) != null && array.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < array.size(); i++) {
                arrayList.add(array.getString(i));
            }
            subscriberBean.mCepIdList = arrayList;
        }
        return subscriberBean;
    }

    public static SubscriberBean parseCEPUnsubscriber(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d697afdab8834acd3e5c362ceab0a3ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (SubscriberBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d697afdab8834acd3e5c362ceab0a3ae");
        }
        if (readableMap == null) {
            return null;
        }
        SubscriberBean subscriberBean = new SubscriberBean();
        if (checkTypeValid(readableMap, "containerID", ReadableType.String).booleanValue()) {
            subscriberBean.mRnContainerID = readableMap.getString("containerID");
        }
        if (checkTypeValid(readableMap, "subscriberID", ReadableType.String).booleanValue()) {
            subscriberBean.mSubscribeId = readableMap.getString("subscriberID");
        }
        return subscriberBean;
    }

    private static Boolean checkTypeValid(ReadableMap readableMap, String str, ReadableType readableType) {
        boolean z = false;
        Object[] objArr = {readableMap, str, readableType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "47685f4ef8fac7b9aaf90fe1f86ef812", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "47685f4ef8fac7b9aaf90fe1f86ef812");
        }
        if (readableMap.hasKey(str) && readableType == readableMap.getType(str)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static ModelBean parseModelBean(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae6dbe3badfe02335e24645226835c09", RobustBitConfig.DEFAULT_VALUE)) {
            return (ModelBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae6dbe3badfe02335e24645226835c09");
        }
        if (readableMap == null) {
            return null;
        }
        ModelBean modelBean = new ModelBean();
        if (checkTypeValid(readableMap, Constants.ModelBeanConstants.KEY_BUNDLE_NAME, ReadableType.String).booleanValue()) {
            modelBean.bundleName = readableMap.getString(Constants.ModelBeanConstants.KEY_BUNDLE_NAME);
        }
        if (checkTypeValid(readableMap, "jsFeatureParam", ReadableType.Map).booleanValue()) {
            try {
                modelBean.jsFeatureParam = new JSONObject(readableMap.getMap("jsFeatureParam").toHashMap());
            } catch (Exception unused) {
            }
        }
        if (checkTypeValid(readableMap, Constants.ModelBeanConstants.KEY_OUT_FEATURE, ReadableType.Map).booleanValue()) {
            try {
                modelBean.outFeature = new JSONObject(readableMap.getMap(Constants.ModelBeanConstants.KEY_OUT_FEATURE).toHashMap());
            } catch (Exception unused2) {
            }
        }
        return modelBean;
    }

    public static LxEventBean parseLxEventBean(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3937b3a0fcb6f1864ae53fa4cea1d076", RobustBitConfig.DEFAULT_VALUE)) {
            return (LxEventBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3937b3a0fcb6f1864ae53fa4cea1d076");
        }
        if (readableMap == null) {
            return null;
        }
        LxEventBean lxEventBean = new LxEventBean();
        int checkLxEventValid = checkLxEventValid(readableMap, "nm", ReadableType.String);
        if (checkLxEventValid == 1) {
            lxEventBean.nm = readableMap.getString("nm");
        } else if (checkLxEventValid == -1) {
            return null;
        }
        int checkLxEventValid2 = checkLxEventValid(readableMap, "pageInfoKey", ReadableType.String);
        if (checkLxEventValid2 == 1) {
            lxEventBean.pageInfoKey = readableMap.getString("pageInfoKey");
        } else if (checkLxEventValid2 == -1) {
            return null;
        }
        int checkLxEventValid3 = checkLxEventValid(readableMap, "bid", ReadableType.String);
        if (checkLxEventValid3 == 1) {
            lxEventBean.bid = readableMap.getString("bid");
        } else if (checkLxEventValid3 == -1) {
            return null;
        }
        int checkLxEventValid4 = checkLxEventValid(readableMap, "category", ReadableType.String);
        if (checkLxEventValid4 == 1) {
            lxEventBean.category = readableMap.getString("category");
        } else if (checkLxEventValid4 == -1) {
            return null;
        }
        int checkLxEventValid5 = checkLxEventValid(readableMap, "cid", ReadableType.String);
        if (checkLxEventValid5 == 1) {
            lxEventBean.cid = readableMap.getString("cid");
        } else if (checkLxEventValid5 == -1) {
            return null;
        }
        int checkLxEventValid6 = checkLxEventValid(readableMap, Constants.LxEventBeanConstants.KEY_IS_CUSTOM_EVENT, ReadableType.Boolean);
        if (checkLxEventValid6 == 1) {
            lxEventBean.isCustomEvent = readableMap.getBoolean(Constants.LxEventBeanConstants.KEY_IS_CUSTOM_EVENT);
        } else if (checkLxEventValid6 == -1) {
            return null;
        }
        int checkLxEventValid7 = checkLxEventValid(readableMap, "isLocal", ReadableType.Boolean);
        if (checkLxEventValid7 == 1) {
            lxEventBean.isLocal = readableMap.getBoolean("isLocal");
        } else if (checkLxEventValid7 == -1) {
            return null;
        }
        int checkLxEventValid8 = checkLxEventValid(readableMap, "valLab", ReadableType.Map);
        if (checkLxEventValid8 == 1) {
            lxEventBean.val_lab = readableMap.getMap("valLab").toHashMap();
        } else if (checkLxEventValid8 == -1) {
            return null;
        }
        return lxEventBean;
    }

    private static int checkLxEventValid(ReadableMap readableMap, String str, ReadableType readableType) {
        Object[] objArr = {readableMap, str, readableType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1dae5416144ac57f13daed1f5b393494", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1dae5416144ac57f13daed1f5b393494")).intValue();
        }
        if (!readableMap.hasKey(str) || readableMap.getType(str) == ReadableType.Null) {
            return 0;
        }
        return readableMap.getType(str) == readableType ? 1 : -1;
    }

    public static AutoRunnerObserverBean parseAutoRunnerObserver(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af5c26037b1d4a024516f9ab23d516df", RobustBitConfig.DEFAULT_VALUE)) {
            return (AutoRunnerObserverBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af5c26037b1d4a024516f9ab23d516df");
        }
        if (readableMap == null) {
            return null;
        }
        AutoRunnerObserverBean autoRunnerObserverBean = new AutoRunnerObserverBean();
        if (checkTypeValid(readableMap, "containerID", ReadableType.String).booleanValue()) {
            autoRunnerObserverBean.containerID = readableMap.getString("containerID");
        }
        if (checkTypeValid(readableMap, "subscriberID", ReadableType.String).booleanValue()) {
            autoRunnerObserverBean.subscriberID = readableMap.getString("subscriberID");
        }
        if (checkTypeValid(readableMap, "type", ReadableType.Number).booleanValue()) {
            autoRunnerObserverBean.type = readableMap.getInt("type");
        }
        if (checkTypeValid(readableMap, Constants.AutoRunnerConstants.KEY_RESOURCE_ID, ReadableType.String).booleanValue()) {
            autoRunnerObserverBean.resourceID = readableMap.getString(Constants.AutoRunnerConstants.KEY_RESOURCE_ID);
        }
        if (checkTypeValid(readableMap, Constants.AutoRunnerConstants.KEY_INTERCEPT_ID, ReadableType.String).booleanValue()) {
            autoRunnerObserverBean.interceptID = readableMap.getString(Constants.AutoRunnerConstants.KEY_INTERCEPT_ID);
        }
        if (checkTypeValid(readableMap, Constants.AutoRunnerConstants.KEY_SHOULD_INTERCEPT, ReadableType.Boolean).booleanValue()) {
            autoRunnerObserverBean.shouldIntercept = readableMap.getBoolean(Constants.AutoRunnerConstants.KEY_SHOULD_INTERCEPT);
        }
        autoRunnerObserverBean.customParam = getMultipleTypeParam(readableMap, "customParam");
        return autoRunnerObserverBean;
    }

    public static JSBundleBean parseJSBundleBean(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "27749851357e8b596fa3019e7d6baa20", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSBundleBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "27749851357e8b596fa3019e7d6baa20");
        }
        if (readableMap == null) {
            return null;
        }
        JSBundleBean jSBundleBean = new JSBundleBean();
        if (checkTypeValid(readableMap, Constants.JSBundleConstants.KEY_BUNDLE_ID, ReadableType.String).booleanValue()) {
            jSBundleBean.bundleID = readableMap.getString(Constants.JSBundleConstants.KEY_BUNDLE_ID);
        }
        jSBundleBean.param = getMultipleTypeParam(readableMap, "parameters");
        return jSBundleBean;
    }

    private static JSONObject convertMapToJson(ReadableMap readableMap) throws JSONException {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d5c9b7f6036c927a97ffa80cbc40d28", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d5c9b7f6036c927a97ffa80cbc40d28");
        }
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (readableMap.getType(nextKey)) {
                case Null:
                    jSONObject.put(nextKey, JSONObject.NULL);
                    break;
                case Boolean:
                    jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case Number:
                    jSONObject.put(nextKey, readableMap.getDouble(nextKey));
                    break;
                case String:
                    jSONObject.put(nextKey, readableMap.getString(nextKey));
                    break;
                case Map:
                    jSONObject.put(nextKey, convertMapToJson(readableMap.getMap(nextKey)));
                    break;
                case Array:
                    jSONObject.put(nextKey, convertArrayToJson(readableMap.getArray(nextKey)));
                    break;
            }
        }
        return jSONObject;
    }

    private static JSONArray convertArrayToJson(ReadableArray readableArray) throws JSONException {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d5de0cc21a4eb7b54a106c817303d249", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d5de0cc21a4eb7b54a106c817303d249");
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (readableArray.getType(i)) {
                case Boolean:
                    jSONArray.put(readableArray.getBoolean(i));
                    break;
                case Number:
                    jSONArray.put(readableArray.getDouble(i));
                    break;
                case String:
                    jSONArray.put(readableArray.getString(i));
                    break;
                case Map:
                    jSONArray.put(convertMapToJson(readableArray.getMap(i)));
                    break;
                case Array:
                    jSONArray.put(convertArrayToJson(readableArray.getArray(i)));
                    break;
            }
        }
        return jSONArray;
    }

    private static Object getMultipleTypeParam(ReadableMap readableMap, String str) {
        Object[] objArr = {readableMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b2eff8bb33ee9098f18319e33fd8c6ad", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b2eff8bb33ee9098f18319e33fd8c6ad");
        }
        if (readableMap.hasKey(str)) {
            ReadableType type = readableMap.getType(str);
            if (type == ReadableType.Number) {
                return Double.valueOf(readableMap.getDouble(str));
            }
            if (type == ReadableType.String) {
                return readableMap.getString(str);
            }
            if (type == ReadableType.Boolean) {
                return Boolean.valueOf(readableMap.getBoolean(str));
            }
            if (type == ReadableType.Map) {
                try {
                    return convertMapToJson(readableMap.getMap(str));
                } catch (JSONException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            ReadableType readableType = ReadableType.Null;
            return null;
        }
        return null;
    }
}
