package com.meituan.android.common.statistics.entity;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BaseEventInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String category;
    public String element_id;
    public String event_type;
    public String index;
    public int isAuto;
    public boolean isStmSynced;
    public String lat;
    public EventLevel level;
    public String lng;
    public String locateTime;
    public int nt;
    public String pageInfoKey;
    public String process;
    public String refer_req_id;
    @Deprecated
    public int report_num;
    public String req_id;
    public long seq;
    public boolean sf;
    public long stm;
    public Map<String, Object> tag;
    public String tagName;
    public long tm;
    public String val_act;
    public String val_ref;
    public BusinessInfo val_val;

    public BaseEventInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0342a4691936b81696c226dd8de2d976", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0342a4691936b81696c226dd8de2d976");
            return;
        }
        this.isStmSynced = false;
        this.seq = -1L;
    }

    public JSONObject toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebd86a1c9d4cabc7dba4d33452beb82b", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebd86a1c9d4cabc7dba4d33452beb82b");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.pageInfoKey)) {
                jSONObject.put("page_info_key", this.pageInfoKey);
            }
            if (!TextUtils.isEmpty(this.category)) {
                jSONObject.put("category", this.category);
            }
            if (!TextUtils.isEmpty(this.val_ref)) {
                jSONObject.put("val_ref", this.val_ref);
            }
            if (this.val_val != null) {
                jSONObject.put("val_val", this.val_val.toJson());
            }
            if (!TextUtils.isEmpty(this.val_act)) {
                jSONObject.put("val_act", this.val_act);
            }
            if (!TextUtils.isEmpty(this.element_id)) {
                jSONObject.put("element_id", this.element_id);
            }
            if (!TextUtils.isEmpty(this.index)) {
                jSONObject.put("index", this.index);
            }
            if (!TextUtils.isEmpty(this.event_type)) {
                jSONObject.put("event_type", this.event_type);
            }
            if (!TextUtils.isEmpty(this.req_id)) {
                jSONObject.put(Constants.EventInfoConsts.KEY_REQ_ID, this.req_id);
            }
            if (!TextUtils.isEmpty(this.refer_req_id)) {
                jSONObject.put(Constants.EventInfoConsts.KEY_REFER_REQ_ID, this.refer_req_id);
            }
            if (this.tag != null && this.tag.size() > 0) {
                jSONObject.put("tag", JsonUtil.mapToJSONObject(this.tag));
            }
            if (!TextUtils.isEmpty(this.lat)) {
                jSONObject.put("lat", this.lat);
            }
            if (!TextUtils.isEmpty(this.lng)) {
                jSONObject.put("lng", this.lng);
            }
            if (!TextUtils.isEmpty(this.locateTime)) {
                jSONObject.put("locate_tm", this.locateTime);
            }
            jSONObject.put(Constants.EventInfoConsts.KEY_IS_AUTO, this.isAuto);
            jSONObject.put("nt", this.nt);
            jSONObject.put("tm", this.tm);
            jSONObject.put("stm", this.stm);
            jSONObject.put("stm_sync", this.isStmSynced);
            if (!TextUtils.isEmpty(this.tagName)) {
                jSONObject.put(Constants.EventInfoConsts.KEY_TAG_NAME, this.tagName);
            }
            if (this.sf) {
                jSONObject.put(Constants.EventInfoConsts.KEY_SF, this.sf);
            }
            if (!TextUtils.isEmpty(this.process)) {
                jSONObject.put("process", this.process);
            }
        } catch (JSONException e) {
            LogUtil.log("statistics", "EventInfo - toJson:" + e.getMessage());
        }
        return jSONObject;
    }

    public static EventInfo fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d7cf25ed5192d52a2fcf2390c6ba9d4b", 6917529027641081856L)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d7cf25ed5192d52a2fcf2390c6ba9d4b");
        }
        EventInfo eventInfo = new EventInfo();
        try {
            eventInfo.pageInfoKey = jSONObject.optString("page_info_key");
            eventInfo.category = jSONObject.optString("category");
            eventInfo.val_ref = jSONObject.optString("val_ref");
            eventInfo.val_val = BusinessInfo.fromJson(jSONObject.optString("val_val"));
            eventInfo.val_act = jSONObject.optString("val_act");
            try {
                eventInfo.eventExtData = JsonUtil.toMap(new JSONObject(jSONObject.optString(Constants.EventInfoConsts.KEY_EVENT_EXTRA_DATA)));
            } catch (Throwable unused) {
            }
            eventInfo.element_id = jSONObject.optString("element_id");
            eventInfo.index = jSONObject.optString("index");
            eventInfo.event_type = jSONObject.optString("event_type");
            eventInfo.req_id = jSONObject.optString(Constants.EventInfoConsts.KEY_REQ_ID);
            eventInfo.refer_req_id = jSONObject.optString(Constants.EventInfoConsts.KEY_REFER_REQ_ID);
            try {
                eventInfo.tag = JsonUtil.toMap(new JSONObject(jSONObject.optString("tag")));
            } catch (Throwable unused2) {
            }
            eventInfo.lat = jSONObject.optString("lat");
            eventInfo.lng = jSONObject.optString("lng");
            eventInfo.locateTime = jSONObject.optString("locate_tm");
            eventInfo.isAuto = jSONObject.optInt(Constants.EventInfoConsts.KEY_IS_AUTO);
            eventInfo.nt = jSONObject.optInt("nt");
            eventInfo.tm = jSONObject.optLong("tm");
            eventInfo.stm = jSONObject.optLong("stm");
            eventInfo.isStmSynced = jSONObject.optBoolean("stm_sync");
            eventInfo.tagName = jSONObject.optString(Constants.EventInfoConsts.KEY_TAG_NAME);
            eventInfo.sf = jSONObject.optBoolean(Constants.EventInfoConsts.KEY_SF);
        } catch (Throwable th) {
            LogUtil.log("statistics", "EventInfo - toJson:" + th.getMessage());
        }
        return eventInfo;
    }
}
