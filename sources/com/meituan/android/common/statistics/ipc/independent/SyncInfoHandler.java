package com.meituan.android.common.statistics.ipc.independent;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.StatisticsDelegate;
import com.meituan.android.common.statistics.StatisticsHandler;
import com.meituan.android.common.statistics.pageinfo.PageInfoManager;
import com.meituan.android.common.statistics.session.ScidManager;
import com.meituan.android.common.statistics.session.SessionManager;
import com.meituan.android.common.statistics.tag.LocalTagManager;
import com.meituan.android.common.statistics.tag.TagList;
import com.meituan.android.common.statistics.tag.TagNode;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SyncInfoHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String syncInfoStr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class SyncInfoHandlerHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static SyncInfoHandler instance = new SyncInfoHandler();
    }

    public SyncInfoHandler() {
    }

    public String getSyncInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2689e7b488267028da28d931bd968050", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2689e7b488267028da28d931bd968050");
        }
        TagList tagList = LocalTagManager.getInstance().getTagList();
        List<TagNode> nodeList = tagList != null ? tagList.getNodeList() : null;
        Map<String, String> environment = StatisticsDelegate.getInstance().getDefaultEnvironment().getEnvironment();
        HashMap hashMap = new HashMap();
        if (environment != null) {
            hashMap.put(Constants.Environment.KEY_CH, environment.get(Constants.Environment.KEY_CH));
            hashMap.put("lch", environment.get("lch"));
            hashMap.put(Constants.Environment.KEY_PUSHID, environment.get(Constants.Environment.KEY_PUSHID));
            hashMap.put(Constants.Environment.KEY_PUSH_EXT, environment.get(Constants.Environment.KEY_PUSH_EXT));
            hashMap.put(Constants.Environment.KEY_APP_SESSION, SessionManager.getAppSession());
            hashMap.put("msid", SessionManager.getMSID(Statistics.getContext()));
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("seq", String.valueOf(ScidManager.getCurrentScid()));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("start_request_id", StatisticsDelegate.getInstance().getAppStartRequestId());
        Map<String, JSONObject> serializePageInfoMap = PageInfoManager.getInstance().getSerializePageInfoMap();
        String lastPageInfoKey = PageInfoManager.getInstance().getLastPageInfoKey();
        String prePageInfoKey = PageInfoManager.getInstance().getPrePageInfoKey();
        HashMap hashMap4 = new HashMap();
        hashMap4.put(ProcessController.KEY_LAST_PAGE_INFO_KEY, lastPageInfoKey);
        hashMap4.put(ProcessController.KEY_PRE_PAGE_INFO_KEY, prePageInfoKey);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tag", ConvertTagUtils.tagListToJSONArray(nodeList));
            jSONObject.put("env", JsonUtil.mapToJSONObject(hashMap));
            jSONObject.put("evs", JsonUtil.mapToJSONObject(hashMap2));
            jSONObject.put("as", JsonUtil.mapToJSONObject(hashMap3));
            jSONObject.put(ProcessController.KEY_PAGE_INFO_MAP, JsonUtil.mapToJSONObject(serializePageInfoMap));
            jSONObject.put(ProcessController.KEY_LAST_PRE_PAGE_INFO_KEY, JsonUtil.mapToJSONObject(hashMap4));
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public synchronized String getSyncInfoStr() {
        return this.syncInfoStr;
    }

    public synchronized void setSyncInfoStr(String str) {
        this.syncInfoStr = str;
    }

    public void handleSyncInfoOnStart(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1529a9a88f622fa4ba69714c65752701", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1529a9a88f622fa4ba69714c65752701");
        } else {
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.ipc.independent.SyncInfoHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "661eeba8b0c0fddf4d49607e4d8ffe37", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "661eeba8b0c0fddf4d49607e4d8ffe37");
                    } else if (!TextUtils.isEmpty(str)) {
                        try {
                            LogUtil.log("independence:start handleSyncInfoOnStart");
                            JSONObject jSONObject = new JSONObject(str);
                            List<TagNode> tagNodeList = ConvertTagUtils.toTagNodeList(jSONObject.getJSONArray("tag"));
                            Map<String, String> valueStrMap = JsonUtil.toValueStrMap(jSONObject.optJSONObject("env"));
                            Map<String, String> valueStrMap2 = JsonUtil.toValueStrMap(jSONObject.optJSONObject("evs"));
                            Map<String, String> valueStrMap3 = JsonUtil.toValueStrMap(jSONObject.optJSONObject("as"));
                            Map<String, JSONObject> valueJsonObjectMap = JsonUtil.toValueJsonObjectMap(jSONObject.optJSONObject(ProcessController.KEY_PAGE_INFO_MAP));
                            Map<String, String> valueStrMap4 = JsonUtil.toValueStrMap(jSONObject.optJSONObject(ProcessController.KEY_LAST_PRE_PAGE_INFO_KEY));
                            if (!CollectionUtils.isEmpty(tagNodeList)) {
                                for (TagNode tagNode : tagNodeList) {
                                    if (tagNode != null) {
                                        String pageName = tagNode.getPageName();
                                        LocalTagManager.getInstance().insertPageName(pageName, null, false);
                                        Map<String, Map<String, Object>> dataNode = tagNode.getDataNode();
                                        if (!TextUtils.isEmpty(pageName) && dataNode != null && !dataNode.isEmpty()) {
                                            for (Map.Entry<String, Map<String, Object>> entry : dataNode.entrySet()) {
                                                if (entry != null) {
                                                    LocalTagManager.getInstance().writeTag(pageName, entry.getKey(), entry.getValue());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (valueStrMap != null && !valueStrMap.isEmpty()) {
                                StatisticsDelegate.getInstance().updateDefaultEnvironment(valueStrMap);
                                SessionManager.setMSID(valueStrMap.get("msid"));
                                SessionManager.setAppMSID(valueStrMap.get(Constants.Environment.KEY_APP_SESSION));
                            }
                            if (valueStrMap2 != null && !valueStrMap2.isEmpty()) {
                                ScidManager.setScid(Integer.parseInt(valueStrMap2.get("seq")));
                            }
                            if (valueStrMap3 != null && !valueStrMap3.isEmpty()) {
                                StatisticsDelegate.getInstance().setAppStartRequestId(valueStrMap3.get("start_request_id"));
                            }
                            if (TextUtils.isEmpty(PageInfoManager.getInstance().getPrePageInfoKey())) {
                                PageInfoManager.getInstance().setPrePageInfoKey(valueStrMap4.get(ProcessController.KEY_PRE_PAGE_INFO_KEY));
                            }
                            if (TextUtils.isEmpty(PageInfoManager.getInstance().getLastPageInfoKey())) {
                                PageInfoManager.getInstance().setLastPageInfoKey(valueStrMap4.get(ProcessController.KEY_LAST_PAGE_INFO_KEY));
                            }
                            PageInfoManager.getInstance().parsePageInfoMap(valueJsonObjectMap);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    public static SyncInfoHandler getInstance() {
        return SyncInfoHandlerHolder.instance;
    }
}
