package com.meituan.android.common.statistics.gesture.data;

import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GestureEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String collectId;
    public long endTime;
    public JSONObject endXY;
    public String lat;
    public String lng;
    public String pvCid;
    public String pvReqId;
    public String pvSession;
    public String reportId;
    public String scale;
    public String sdkVersion;
    public int seq;
    public long startTime;
    public JSONObject startXY;
    public long stm;
    public long timeGap;
    public long timeInterval;
    public long tm;
    public JSONArray trails;
    public JSONObject xyGap;

    public GestureEntity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a070b2c0b688bb304154d74df6fd3cdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a070b2c0b688bb304154d74df6fd3cdc");
            return;
        }
        this.startXY = new JSONObject();
        this.endXY = new JSONObject();
        this.xyGap = new JSONObject();
    }

    public static GestureEntity fromJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "16aa766d600bc9439f9580c7e07fa9bf", 6917529027641081856L)) {
            return (GestureEntity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "16aa766d600bc9439f9580c7e07fa9bf");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            GestureEntity gestureEntity = new GestureEntity();
            gestureEntity.startTime = jSONObject.optLong(Constants.GestureData.KEY_START_TIME);
            gestureEntity.endTime = jSONObject.optLong(Constants.GestureData.KEY_END_TIME);
            gestureEntity.timeInterval = jSONObject.optLong(Constants.GestureData.KEY_TIME_INTERVAL);
            gestureEntity.seq = jSONObject.optInt("seq");
            gestureEntity.timeGap = jSONObject.optLong(Constants.GestureData.KEY_TIME_GAP);
            gestureEntity.startXY = jSONObject.optJSONObject(Constants.GestureData.KEY_START_XY);
            gestureEntity.endXY = jSONObject.optJSONObject(Constants.GestureData.KEY_END_XY);
            gestureEntity.xyGap = jSONObject.optJSONObject(Constants.GestureData.KEY_XY_GAP);
            gestureEntity.trails = jSONObject.optJSONArray(Constants.GestureData.KEY_TRAIL);
            gestureEntity.tm = jSONObject.optLong("tm");
            gestureEntity.pvSession = jSONObject.optString(Constants.GestureData.KEY_PV_SESSION);
            gestureEntity.pvCid = jSONObject.optString(Constants.GestureData.KEY_PV_CID);
            gestureEntity.pvReqId = jSONObject.optString(Constants.GestureData.KEY_PV_REQID);
            gestureEntity.collectId = jSONObject.optString(Constants.GestureData.KEY_COLLECT_ID);
            gestureEntity.reportId = jSONObject.optString(Constants.GestureData.KEY_REPORT_ID);
            return gestureEntity;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public JSONObject toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06a64763adce47d6f0cd4fdfc07c2acc", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06a64763adce47d6f0cd4fdfc07c2acc");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("seq", this.seq);
            jSONObject.put(Constants.GestureData.KEY_TIME_INTERVAL, this.timeInterval);
            jSONObject.put(Constants.GestureData.KEY_START_TIME, this.startTime);
            jSONObject.put(Constants.GestureData.KEY_END_TIME, this.endTime);
            jSONObject.put(Constants.GestureData.KEY_TIME_GAP, this.timeGap);
            jSONObject.put(Constants.GestureData.KEY_START_XY, this.startXY);
            jSONObject.put(Constants.GestureData.KEY_END_XY, this.endXY);
            jSONObject.put(Constants.GestureData.KEY_XY_GAP, this.xyGap);
            jSONObject.put(Constants.GestureData.KEY_TRAIL, this.trails != null ? this.trails : new JSONArray());
            jSONObject.put("tm", this.tm);
            jSONObject.put(Constants.GestureData.KEY_PV_SESSION, this.pvSession);
            jSONObject.put(Constants.GestureData.KEY_PV_CID, this.pvCid);
            jSONObject.put(Constants.GestureData.KEY_PV_REQID, this.pvReqId);
            jSONObject.put(Constants.GestureData.KEY_COLLECT_ID, this.collectId);
            jSONObject.put(Constants.GestureData.KEY_REPORT_ID, this.reportId);
        } catch (Exception e) {
            LogUtil.e("statistics", "DBGestureEntity - toJson:" + e.getMessage(), e);
        }
        return jSONObject;
    }
}
