package com.meituan.android.common.statistics.external;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.WebNativeCommunicationStore;
import com.meituan.android.common.statistics.session.SessionManager;
import com.meituan.android.common.statistics.sfrom.SFromManager;
import com.meituan.android.common.statistics.tag.TagManager;
import com.meituan.android.common.statistics.utils.ABCHelper;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class CommonDataHandler {
    protected static final String CLEAR_TAG = "clearTag";
    protected static final String GET_ENV = "getEnv";
    protected static final String GET_PAGE_INFO = "getPageInfo";
    protected static final String GET_REQ_ID = "getReqId";
    protected static final String GET_SFROM = "getSFrom";
    protected static final String GET_TAG = "getTag";
    protected static final String KEY_DATA = "data";
    protected static final String SET_ENV = "setEnv";
    protected static final String SET_EVS = "setEvs";
    protected static final String SET_TAG = "setTag";
    protected static final String SET_WEB_PAGE_DATA = "setWebPageData";
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Context mContext;

    public abstract int getFailCode();

    public abstract int getSuccessCode();

    public CommonDataHandler(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e27d5b0bf9c28794799823edb46c370", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e27d5b0bf9c28794799823edb46c370");
            return;
        }
        this.mContext = null;
        this.mContext = context;
    }

    public JSONObject handleData(String str, String str2, JSONObject jSONObject) {
        Object[] objArr = {str, str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da2ce13bf63b7413e64a252448009cd7", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da2ce13bf63b7413e64a252448009cd7");
        }
        JSONObject jSONObject2 = null;
        try {
            if (SET_TAG.equals(str2)) {
                if (jSONObject != null) {
                    return setTag(jSONObject.optJSONObject("data"));
                }
            } else if (SET_EVS.equals(str2)) {
                if (jSONObject != null) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("data");
                    JSONObject optJSONObject = jSONObject.optJSONObject("options");
                    JSONObject optJSONObject2 = jSONObject.optJSONObject(Constants.JSNative.WEB_ENV);
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    optJSONObject.put(Constants.JSNative.WEB_ENV, optJSONObject2);
                    return setEvs(str, optJSONArray, optJSONObject);
                }
            } else if (SET_ENV.equals(str2)) {
                if (jSONObject != null) {
                    return setEnv(str, jSONObject.optJSONObject("data"));
                }
            } else if (GET_ENV.equals(str2)) {
                return getEnv(str);
            } else {
                if (GET_TAG.equals(str2)) {
                    return getTag();
                }
                if (GET_SFROM.equals(str2)) {
                    return getSf();
                }
                if (GET_REQ_ID.equals(str2)) {
                    return getReqId();
                }
                if (SET_WEB_PAGE_DATA.equals(str2)) {
                    return setWebPageData(jSONObject);
                }
                if (GET_PAGE_INFO.equals(str2)) {
                    if (jSONObject != null) {
                        return getPageInfo(jSONObject.optJSONObject("data"));
                    }
                } else if (CLEAR_TAG.equals(str2) && jSONObject != null) {
                    jSONObject2 = clearTag(jSONObject.optJSONObject("data"));
                }
            }
        } catch (Exception e) {
            LogUtil.log("statistics", "CommonDataHandler - parse: " + e.getMessage());
        }
        return jSONObject2;
    }

    public JSONObject setEnv(String str, JSONObject jSONObject) throws JSONException {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ac3f7934229fb4df0b5400951f7050e", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ac3f7934229fb4df0b5400951f7050e");
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject2.put("code", getFailCode());
            return jSONObject2;
        }
        filterEnv(jSONObject);
        if (Statistics.getChannel(str).updateEnvironment(jSONObject.toString())) {
            jSONObject2.put("code", getSuccessCode());
        } else {
            jSONObject2.put("code", getFailCode());
        }
        return jSONObject2;
    }

    public void filterEnv(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12880b56e0755f82e3fe3c8098d39ecd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12880b56e0755f82e3fe3c8098d39ecd");
        } else if (jSONObject == null) {
        } else {
            if (jSONObject.has(Constants.Environment.KEY_UNION_ID)) {
                jSONObject.remove(Constants.Environment.KEY_UNION_ID);
            }
            if (jSONObject.has("uuid")) {
                jSONObject.remove("uuid");
            }
            if (jSONObject.has("dpid")) {
                jSONObject.remove("dpid");
            }
            if (jSONObject.has("msid")) {
                jSONObject.remove("msid");
            }
            if (jSONObject.has(Constants.Environment.KEY_APP_SESSION)) {
                jSONObject.remove(Constants.Environment.KEY_APP_SESSION);
            }
            if (jSONObject.has(Constants.Reporter.KEY_PACKAGE_TM)) {
                jSONObject.remove(Constants.Reporter.KEY_PACKAGE_TM);
            }
            if (jSONObject.has("checksum")) {
                jSONObject.remove("checksum");
            }
        }
    }

    public JSONObject setTag(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc7eb752f04cb1824e409fecda1174c7", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc7eb752f04cb1824e409fecda1174c7");
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject2.put("code", getFailCode());
            return jSONObject2;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            TagManager.getInstance().writeTag(next, jSONObject.getJSONObject(next));
        }
        jSONObject2.put("code", getSuccessCode());
        return jSONObject2;
    }

    public JSONObject setEvs(String str, JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        Object[] objArr = {str, jSONArray, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87f12c2207aa901389f19fae71df5707", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87f12c2207aa901389f19fae71df5707");
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONArray == null) {
            jSONObject2.put("code", getFailCode());
            return jSONObject2;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            Statistics.getChannel(str).writeEventThroughWeb(jSONArray.getJSONObject(i), jSONObject);
        }
        jSONObject2.put("code", getSuccessCode());
        return jSONObject2;
    }

    private JSONObject getPageInfo(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b70dcea415fd7aa66dd17be32eb0f611", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b70dcea415fd7aa66dd17be32eb0f611");
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            jSONObject2.put("code", getFailCode());
            LogUtil.log("mmpToNative", "error getPageInfo() data==null");
            return jSONObject2;
        }
        String optString = jSONObject.optString("pageId");
        String optString2 = jSONObject.optString("mmpId");
        if (!TextUtils.isEmpty(optString2)) {
            if (TextUtils.isEmpty(optString)) {
                LogUtil.log("mmpToNative", "getPageInfo() mmpId=" + optString2);
                TagManager.getInstance().clearMmpTag(optString2, TagManager.getInstance().getCurrentTagNodePageName());
            } else {
                LogUtil.log("mmpToNative", "getPageInfo() mmpId=" + optString + ", pageId=" + optString);
                String str = "LX_IOR->" + optString2 + "->" + optString;
                if (!TextUtils.isEmpty(TagManager.getInstance().getCurrentTagNodePageName()) && TagManager.getInstance().getCurrentTagNodePageName().equals(str)) {
                    jSONObject2.put("code", getSuccessCode());
                    jSONObject3.put(Constants.JSNative.DATA_IS_JUMP_BACK, false);
                    jSONObject2.put("data", jSONObject3);
                    return jSONObject2;
                }
                TagManager.getInstance().insertPageName(str);
            }
            jSONObject2.put("code", getSuccessCode());
            jSONObject3.put(Constants.JSNative.DATA_IS_JUMP_BACK, true);
            jSONObject2.put("data", jSONObject3);
        } else {
            LogUtil.log("mmpToNative", "error getPageInfo() mmpId==null || pageId==null");
            jSONObject2.put("code", getFailCode());
        }
        return jSONObject2;
    }

    private JSONObject clearTag(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dd3695cb07db211f4ed9803b6515897", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dd3695cb07db211f4ed9803b6515897");
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            LogUtil.log("mmpToNative", "error clearTag() data==null");
            jSONObject2.put("code", getFailCode());
            return jSONObject2;
        }
        String optString = jSONObject.optString("mmpId");
        if (TextUtils.isEmpty(optString)) {
            LogUtil.log("mmpToNative", "error clearTag() mmpId=null");
            jSONObject2.put("code", getFailCode());
            return jSONObject2;
        }
        String optString2 = jSONObject.optString("pageId");
        LogUtil.log("mmpToNative", "clearTag() pageId=" + optString2);
        if (TextUtils.isEmpty(optString2)) {
            TagManager.getInstance().clearMmpTag(optString);
        } else {
            TagManager.getInstance().clearMmpTag(optString, optString2);
        }
        jSONObject2.put("code", getSuccessCode());
        return jSONObject2;
    }

    public JSONObject getEnv(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0086e9551fe68f4f784e8ece1539600", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0086e9551fe68f4f784e8ece1539600");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject(Statistics.getChannel(str).getEnvironment());
        try {
            jSONObject2.put("msid", SessionManager.getSession());
            jSONObject2.put(Constants.Environment.KEY_APP_SESSION, SessionManager.getAppSession());
            jSONObject2.put("ps", AppUtil.areNotificationsEnabled(this.mContext) ? "7" : "0");
            if (jSONObject2.has(DataConstants.RTT_ENV)) {
                jSONObject2.remove(DataConstants.RTT_ENV);
            }
        } catch (Exception unused) {
        }
        ABCHelper.process(jSONObject2);
        jSONObject.put("data", jSONObject2);
        jSONObject.put("code", getSuccessCode());
        return jSONObject;
    }

    private JSONObject getReqId() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6fddeb1e2e25981861b16a71e4bfecb", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6fddeb1e2e25981861b16a71e4bfecb");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("val_ref", Statistics.getRefPageName(null));
        jSONObject2.put(Constants.EventInfoConsts.KEY_REQ_ID, Statistics.getRequestId(null));
        jSONObject2.put(Constants.EventInfoConsts.KEY_REFER_REQ_ID, Statistics.getRefRequestId(null));
        jSONObject.put("data", jSONObject2);
        jSONObject.put("code", getSuccessCode());
        return jSONObject;
    }

    public JSONObject getTag() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71d458dc0a5e9711a26d808e861b50ea", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71d458dc0a5e9711a26d808e861b50ea");
        }
        JSONObject jSONObject = new JSONObject();
        Map<String, Object> tags = TagManager.getInstance().getTags();
        if (tags != null && tags.size() > 0) {
            jSONObject.put("data", JsonUtil.mapToJSONObject(tags));
        }
        jSONObject.put("code", getSuccessCode());
        return jSONObject;
    }

    private JSONObject getSf() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0ff84a6d8ffe8ff814760f29089f658", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0ff84a6d8ffe8ff814760f29089f658");
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray sFrom = SFromManager.getInstance().getSFrom();
        if (sFrom != null && sFrom.length() > 0) {
            jSONObject.put("data", sFrom);
        }
        jSONObject.put("code", getSuccessCode());
        return jSONObject;
    }

    private JSONObject setWebPageData(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39676e7699cb8c8249f4a82c88703eef", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39676e7699cb8c8249f4a82c88703eef");
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject2.put("code", getFailCode());
            return jSONObject2;
        }
        WebNativeCommunicationStore.StoreData storeData = new WebNativeCommunicationStore.StoreData();
        storeData.webCid = jSONObject.optString(Constants.Web.KEY_WEB_CID);
        storeData.webReqId = jSONObject.optString(Constants.Web.KEY_WEB_REQ_ID);
        WebNativeCommunicationStore.setStoreData(storeData);
        jSONObject2.put("code", getSuccessCode());
        return jSONObject2;
    }

    public boolean isOpValid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "faa952f9ca55191e9ba1928517c2e0d1", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "faa952f9ca55191e9ba1928517c2e0d1")).booleanValue() : !TextUtils.isEmpty(str) && (SET_TAG.equals(str) || GET_TAG.equals(str) || SET_EVS.equals(str) || GET_SFROM.equals(str) || SET_ENV.equals(str) || GET_ENV.equals(str) || GET_REQ_ID.equals(str) || SET_WEB_PAGE_DATA.equals(str));
    }
}
