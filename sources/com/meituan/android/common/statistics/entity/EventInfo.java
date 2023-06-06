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
public class EventInfo extends BaseEventInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Map<String, Object> eventExtData;
    public long exposureDuration;
    public CacheControl mCacheControl;
    public String mreq_id;
    public EventName nm;
    public int nt;
    public int pageCreateFirstPv;
    public String val_bid;
    public String val_cid;
    public Map<String, Object> val_lab;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum CacheControl {
        CACHE_REPORT(0),
        CACHE_LOCAL(1);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int cacheControl;

        public static CacheControl valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8aa2f7750863ef105be33982b4f653ca", 6917529027641081856L) ? (CacheControl) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8aa2f7750863ef105be33982b4f653ca") : (CacheControl) Enum.valueOf(CacheControl.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CacheControl[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6ddf64f9066b24b24cba778db37a7ee0", 6917529027641081856L) ? (CacheControl[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6ddf64f9066b24b24cba778db37a7ee0") : (CacheControl[]) values().clone();
        }

        CacheControl(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26053c462d3c3fdc7b82ede89ec96cb9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26053c462d3c3fdc7b82ede89ec96cb9");
            } else {
                this.cacheControl = i;
            }
        }
    }

    public EventInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a00b76959be81a9eeb4b380d8e07e59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a00b76959be81a9eeb4b380d8e07e59");
        } else {
            this.mCacheControl = CacheControl.CACHE_REPORT;
        }
    }

    public static EventInfo obtainUDEvent(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "548d53cee07afc0deb09c4b5901a12d6", 6917529027641081856L)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "548d53cee07afc0deb09c4b5901a12d6");
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.SC;
        eventInfo.event_type = str;
        eventInfo.val_cid = str2;
        eventInfo.val_bid = str3;
        eventInfo.val_lab = map;
        eventInfo.isAuto = 7;
        return eventInfo;
    }

    public static EventInfo obtainPvEvent(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e4a3ea8625200e816eb9fd7f29d8a61d", 6917529027641081856L)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e4a3ea8625200e816eb9fd7f29d8a61d");
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.PAGE_VIEW;
        eventInfo.val_cid = str;
        eventInfo.val_lab = map;
        eventInfo.isAuto = 7;
        return eventInfo;
    }

    public static EventInfo obtainPdEvent(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a1d9aa7c94106518547685e034dca214", 6917529027641081856L)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a1d9aa7c94106518547685e034dca214");
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.PAGE_DISAPPEAR;
        eventInfo.val_cid = str;
        eventInfo.val_lab = map;
        eventInfo.isAuto = 7;
        return eventInfo;
    }

    public static EventInfo obtainMcEvent(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7aff3bff99d0bf91e01915d51fee55a5", 6917529027641081856L)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7aff3bff99d0bf91e01915d51fee55a5");
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.CLICK;
        eventInfo.val_cid = str;
        eventInfo.val_bid = str2;
        eventInfo.val_lab = map;
        eventInfo.isAuto = 7;
        return eventInfo;
    }

    public static EventInfo obtainMvEvent(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5fb25b3989a6210d2c12541fdc539ae0", 6917529027641081856L)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5fb25b3989a6210d2c12541fdc539ae0");
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.MODEL_VIEW;
        eventInfo.val_cid = str;
        eventInfo.val_bid = str2;
        eventInfo.val_lab = map;
        eventInfo.isAuto = 7;
        return eventInfo;
    }

    public static EventInfo obtainMeEvent(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37702e2064a558c7aa95adf99a837b8e", 6917529027641081856L)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37702e2064a558c7aa95adf99a837b8e");
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.EDIT;
        eventInfo.val_cid = str;
        eventInfo.val_bid = str2;
        eventInfo.val_lab = map;
        eventInfo.isAuto = 7;
        return eventInfo;
    }

    public static EventInfo obtainMvlEvent(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17684cde48f45e5cce0ca7c6f031c498", 6917529027641081856L)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17684cde48f45e5cce0ca7c6f031c498");
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.MODEL_VIEW_LIST;
        eventInfo.val_cid = str;
        eventInfo.val_bid = str2;
        eventInfo.val_lab = map;
        eventInfo.isAuto = 7;
        return eventInfo;
    }

    public static EventInfo obtainBOEvent(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dfb9442f772c0d850f281b1b65b60665", 6917529027641081856L)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dfb9442f772c0d850f281b1b65b60665");
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.ORDER;
        eventInfo.level = EventLevel.URGENT;
        eventInfo.val_cid = str;
        eventInfo.val_bid = str2;
        eventInfo.val_lab = map;
        eventInfo.isAuto = 7;
        return eventInfo;
    }

    public static EventInfo obtainBPEvent(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "257b84f7cde55bd2cd37073bd26a4a3d", 6917529027641081856L)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "257b84f7cde55bd2cd37073bd26a4a3d");
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.PAY;
        eventInfo.level = EventLevel.URGENT;
        eventInfo.val_cid = str;
        eventInfo.val_bid = str2;
        eventInfo.val_lab = map;
        eventInfo.isAuto = 7;
        return eventInfo;
    }

    public static EventInfo obtainScEvent(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f47e9243a2271243a4c0c9b97d2a6682", 6917529027641081856L)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f47e9243a2271243a4c0c9b97d2a6682");
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.SC;
        eventInfo.val_cid = str;
        eventInfo.val_bid = str2;
        eventInfo.val_lab = map;
        eventInfo.isAuto = 7;
        return eventInfo;
    }

    public EventInfo cacheControl(CacheControl cacheControl) {
        this.mCacheControl = cacheControl;
        return this;
    }

    public EventInfo nt(int i) {
        this.nt = i;
        return this;
    }

    @Override // com.meituan.android.common.statistics.entity.BaseEventInfo
    public JSONObject toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35700cc6b4baad24846ddce6723b9175", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35700cc6b4baad24846ddce6723b9175");
        }
        JSONObject json = super.toJson();
        try {
            if (this.nm != null) {
                json.put("nm", this.nm.toString());
            }
            if (!TextUtils.isEmpty(this.val_cid)) {
                json.put("val_cid", this.val_cid);
            }
            if (this.val_lab != null && this.val_lab.size() > 0) {
                json.put("val_lab", JsonUtil.mapToJSONObject(this.val_lab));
            }
            if (this.eventExtData != null && this.eventExtData.size() > 0) {
                json.put(Constants.EventInfoConsts.KEY_EVENT_EXTRA_DATA, JsonUtil.mapToJSONObject(this.eventExtData));
            }
            if (!TextUtils.isEmpty(this.val_bid)) {
                json.put("val_bid", this.val_bid);
            }
            if (!TextUtils.isEmpty(this.mreq_id)) {
                json.put("mreq_id", this.mreq_id);
            }
            json.put("nt", this.nt);
            json.put("isLocal", this.mCacheControl.cacheControl);
            json.put(Constants.EventInfoConsts.KEY_PAGE_CREATE_FIRST_VIEW, this.pageCreateFirstPv);
        } catch (JSONException e) {
            LogUtil.log("statistics", "EventInfo - toJson:" + e.getMessage());
        }
        return json;
    }

    public static EventInfo fromJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cdb899b848580297e99e9ef5ba8bef0a", 6917529027641081856L)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cdb899b848580297e99e9ef5ba8bef0a");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return fromJson(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static EventInfo fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba0a7e9806e6036c1f254358d8cd53b2", 6917529027641081856L)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba0a7e9806e6036c1f254358d8cd53b2");
        }
        StringBuilder sb = new StringBuilder("EventInfo fromJson:");
        sb.append(jSONObject);
        LogUtil.log(sb.toString() != null ? jSONObject.toString() : "");
        try {
            EventInfo fromJson = BaseEventInfo.fromJson(jSONObject);
            StringBuilder sb2 = new StringBuilder("EventInfo BaseEventInfo fromJson:");
            sb2.append(jSONObject);
            LogUtil.log(sb2.toString() != null ? fromJson.toString() : "");
            if (fromJson != null) {
                fromJson.nm = EventName.getEnum(jSONObject.optString("nm", EventName.MGE.toString()));
                fromJson.val_cid = jSONObject.optString("val_cid");
                fromJson.val_bid = jSONObject.optString("val_bid");
                try {
                    fromJson.val_lab = JsonUtil.toMap(new JSONObject(jSONObject.optString("val_lab")));
                } catch (Throwable unused) {
                }
                try {
                    fromJson.eventExtData = JsonUtil.toMap(new JSONObject(jSONObject.optString(Constants.EventInfoConsts.KEY_EVENT_EXTRA_DATA)));
                } catch (Throwable unused2) {
                }
                fromJson.nt = jSONObject.optInt("nt", 1);
                StringBuilder sb3 = new StringBuilder("EventInfo EventInfo fromJson end:");
                sb3.append(jSONObject);
                LogUtil.log(sb3.toString() != null ? fromJson.toString() : "");
                return fromJson;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }
}
