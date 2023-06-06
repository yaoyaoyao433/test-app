package com.meituan.android.common.statistics.external;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.StatisticsDelegate;
import com.meituan.android.common.statistics.session.SessionManager;
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
public class MmpToNative {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static JSONObject mmpToNative(Context context, JSONObject jSONObject) {
        Object[] objArr = {context, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b09541df13acb9db0947a9024a19118a", 6917529027641081856L) ? (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b09541df13acb9db0947a9024a19118a") : new MmpNativeDataHandler(context).parse(jSONObject);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class MmpNativeDataHandler extends CommonDataHandler {
        private static final int FAILED = 1001;
        private static final int INVALID_PARAMS = 1005;
        private static final int METHOD_NOT_FOUND = 1004;
        private static final int SUCCESSFUL = 200;
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static boolean needClear = false;

        @Override // com.meituan.android.common.statistics.external.CommonDataHandler
        public int getFailCode() {
            return 1001;
        }

        @Override // com.meituan.android.common.statistics.external.CommonDataHandler
        public int getSuccessCode() {
            return 200;
        }

        public MmpNativeDataHandler(Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5f23f44da09c02a701f6d6f8eb3fa5d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5f23f44da09c02a701f6d6f8eb3fa5d");
            }
        }

        public static void setNeedClear(boolean z) {
            needClear = z;
        }

        public JSONObject parse(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe39f463e03f287f6231e5ce502cee3a", 6917529027641081856L)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe39f463e03f287f6231e5ce502cee3a");
            }
            try {
                if (jSONObject == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", 1005);
                    return jSONObject2;
                }
                String optString = jSONObject.optString(Constants.JSNative.DATA_METHOD, "");
                if (!TextUtils.isEmpty(optString) && isOpValid(optString)) {
                    String optString2 = jSONObject.optString("cn", "");
                    if (TextUtils.isEmpty(optString2)) {
                        optString2 = StatisticsDelegate.getInstance().getDefaultChannelName();
                    }
                    return handleData(optString2, optString, jSONObject);
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1004);
                return jSONObject3;
            } catch (Exception e) {
                LogUtil.log("statistics", "MmpNativeDataHandler - parse: " + e.getMessage());
                return null;
            }
        }

        @Override // com.meituan.android.common.statistics.external.CommonDataHandler
        public boolean isOpValid(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1d8a213acce68f8a1b17ccd11c15643", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1d8a213acce68f8a1b17ccd11c15643")).booleanValue() : !TextUtils.isEmpty(str) && ("setTag".equals(str) || "getTag".equals(str) || "setEvs".equals(str) || "setEnv".equals(str) || "getEnv".equals(str) || "getPageInfo".equals(str) || "clearTag".equals(str));
        }

        @Override // com.meituan.android.common.statistics.external.CommonDataHandler
        public JSONObject setEnv(String str, JSONObject jSONObject) throws JSONException {
            Object[] objArr = {str, jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c08e148ee56fe94fc28d36f495760d6", 6917529027641081856L)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c08e148ee56fe94fc28d36f495760d6");
            }
            JSONObject jSONObject2 = new JSONObject();
            if (TextUtils.isEmpty(str)) {
                jSONObject2.put("code", getFailCode());
                return jSONObject2;
            } else if (jSONObject == null) {
                jSONObject2.put("code", getFailCode());
                return jSONObject2;
            } else {
                filterEnv(jSONObject);
                if (Statistics.getChannel(str).updateEnvironment(jSONObject.toString())) {
                    jSONObject2.put("code", getSuccessCode());
                } else {
                    jSONObject2.put("code", getFailCode());
                }
                return jSONObject2;
            }
        }

        @Override // com.meituan.android.common.statistics.external.CommonDataHandler
        public JSONObject getEnv(String str) throws JSONException {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40cfdb47ca216f1135f33c8e9b014b3c", 6917529027641081856L)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40cfdb47ca216f1135f33c8e9b014b3c");
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject(Statistics.getChannel(str).getEnvironment());
            try {
                jSONObject2.put("msid", SessionManager.getSession());
                jSONObject2.put(Constants.Environment.KEY_APP_SESSION, SessionManager.getAppSession());
                jSONObject2.put("ps", AppUtil.areNotificationsEnabled(this.mContext) ? "7" : "0");
            } catch (Exception unused) {
            }
            ABCHelper.process(jSONObject2);
            try {
                if (jSONObject2.has(DataConstants.RTT_ENV)) {
                    Object obj = jSONObject2.get(DataConstants.RTT_ENV);
                    if (obj instanceof String) {
                        jSONObject2.put(DataConstants.RTT_ENV, new JSONObject((String) obj));
                    }
                }
            } catch (Exception unused2) {
            }
            jSONObject.put("data", jSONObject2);
            jSONObject.put("code", getSuccessCode());
            return jSONObject;
        }

        @Override // com.meituan.android.common.statistics.external.CommonDataHandler
        public JSONObject getTag() throws JSONException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba67874515df5f7570a2d8f2505893b9", 6917529027641081856L)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba67874515df5f7570a2d8f2505893b9");
            }
            JSONObject jSONObject = new JSONObject();
            Map<String, Object> tags = TagManager.getInstance().getTags();
            if (tags != null && tags.size() > 0) {
                jSONObject.put("data", JsonUtil.mapToJSONObject(tags));
            }
            jSONObject.put("needClear", needClear);
            jSONObject.put("code", getSuccessCode());
            LogUtil.log("mmpToNative", "getTag() result=" + jSONObject.toString());
            needClear = false;
            return jSONObject;
        }

        @Override // com.meituan.android.common.statistics.external.CommonDataHandler
        public JSONObject setTag(JSONObject jSONObject) throws JSONException {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b1342149c4c4bc971ec275baa667a2d", 6917529027641081856L)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b1342149c4c4bc971ec275baa667a2d");
            }
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject == null) {
                jSONObject2.put("code", getFailCode());
                LogUtil.log("mmpToNative", "error setTag() data==null");
                return jSONObject2;
            }
            LogUtil.log("mmpToNative", "setTag() data=" + jSONObject.toString());
            JSONObject optJSONObject = jSONObject.optJSONObject("tags");
            String optString = jSONObject.optString("mmpId");
            String optString2 = jSONObject.optString("pageId");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                jSONObject2.put("code", getFailCode());
                return jSONObject2;
            } else if (optJSONObject == null) {
                jSONObject2.put("code", getFailCode());
                return jSONObject2;
            } else {
                String str = "LX_IOR->" + optString + "->" + optString2;
                if (TextUtils.isEmpty(TagManager.getInstance().getCurrentTagNodePageName()) || !TagManager.getInstance().getCurrentTagNodePageName().equals(str)) {
                    TagManager.getInstance().insertPageName(str);
                }
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (optJSONObject.get(next) instanceof JSONObject) {
                        TagManager.getInstance().writeTag(next, optJSONObject.optJSONObject(next));
                    } else {
                        LogUtil.log("mmpToNative", "error setTag() key=" + next + ", value can only be JSONObject");
                    }
                }
                jSONObject2.put("code", getSuccessCode());
                return jSONObject2;
            }
        }

        @Override // com.meituan.android.common.statistics.external.CommonDataHandler
        public JSONObject setEvs(String str, JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
            Object[] objArr = {str, jSONArray, jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d578b961e1e91c62bfcd1e57af6a809", 6917529027641081856L)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d578b961e1e91c62bfcd1e57af6a809");
            }
            JSONObject jSONObject2 = new JSONObject();
            if (jSONArray == null) {
                jSONObject2.put("code", getFailCode());
                return jSONObject2;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 != null) {
                    Statistics.getChannel(str).writeEventThroughMMP(jSONObject3, jSONObject);
                }
            }
            jSONObject2.put("code", getSuccessCode());
            return jSONObject2;
        }
    }
}
