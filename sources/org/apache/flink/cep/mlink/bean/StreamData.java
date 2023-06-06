package org.apache.flink.cep.mlink.bean;

import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.common.CommonConstant;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class StreamData extends BaseEvent {
    public String category;
    public long dispatch_begin_tm;
    public long duration;
    public String element_id;
    public int isAuto;
    public int isLocal;
    public int is_cache;
    public Long item_index;
    public int mduration_cnt;
    public long mduration_total;
    public String mge_type;
    public String mreq_id;
    public String msid;
    public String nm;
    public int nt;
    public long receive_tm;
    public Map<String, Object> rtt_env;
    public long save_end_tm;
    public long seq;
    public long stm;
    public Map<String, Object> tag;
    public String tagFlatten;
    public long tm;
    public long transform_begin_tm;
    public long transform_end_tm;
    public String valLabFlatten;
    public String val_act;
    public String val_bid;
    public String val_cid;
    public Map<String, Object> val_lab;
    public String val_ref;
    public List<Long> mduration_list = null;
    public long city_id = 0;
    public long locate_city_id = 0;
    public double lat = 0.0d;
    public double lng = 0.0d;
    public String app = null;
    public String push_id = null;
    public String utm_source = null;
    public String lch = null;
    public long uid = 0;
    public String url = null;
    public String req_id = null;
    public String queryId = null;
    public String sortId = null;
    public String keyword = null;
    public long dealgroupId = 0;
    public String categoryId = null;
    public String poiId = null;
    public long adId = 0;
    public String orderId = null;
    public String title = null;
    public String bizId = null;
    public String stid = null;
    public String ct_poi = null;
    public String ctPoi = null;
    public String abtest = null;
    public String couponId = null;
    public String skuId = null;
    public String dealId = null;
    public String movieId = null;
    public String goodsId = null;
    public String maitonId = null;
    public String promotionId = null;
    public String traceId = null;
    public String cinemaId = null;
    public String selectId = null;
    public String searchId = null;
    public String catId = null;
    public String shopUuid = null;
    public String activityid = null;
    public String regionId = null;
    public String custom = null;
    public String mt_aurl = null;
    public String appLaunchId = null;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EventData [ \r\n");
        if (this.nm != null) {
            sb.append("EventName=");
            sb.append(this.nm);
            sb.append("\n");
        }
        if (!TextUtils.isEmpty(this.val_cid)) {
            sb.append("val_cid=");
            sb.append(this.val_cid);
            sb.append("\n");
        }
        if (!TextUtils.isEmpty(this.val_ref)) {
            sb.append("val_ref=");
            sb.append(this.val_ref);
            sb.append("\n");
        }
        if (this.val_lab != null) {
            sb.append("val_lab=");
            sb.append(this.val_lab.toString());
            sb.append("\n");
        }
        if (!TextUtils.isEmpty(this.val_bid)) {
            sb.append("val_bid=");
            sb.append(this.val_bid);
            sb.append("\n");
        }
        sb.append("isAuto=");
        sb.append(this.isAuto);
        sb.append("\n");
        sb.append("nt=");
        sb.append(this.nt);
        sb.append("\n");
        if (this.tag != null) {
            sb.append("tag=");
            sb.append(this.tag.toString());
            sb.append("\n");
        }
        sb.append("tm=");
        sb.append(this.tm);
        sb.append("\n");
        sb.append("stm=");
        sb.append(this.stm);
        sb.append("\n");
        sb.append("seq=");
        sb.append(this.seq);
        sb.append("\n");
        if (!TextUtils.isEmpty(this.category)) {
            sb.append("category=");
            sb.append(this.category);
            sb.append("\n");
        }
        if (!TextUtils.isEmpty(this.msid)) {
            sb.append("msid=");
            sb.append(this.msid);
            sb.append("\n");
        }
        if (!TextUtils.isEmpty(this.msid)) {
            sb.append("element_id=");
            sb.append(this.element_id);
            sb.append("\n");
        }
        if (!TextUtils.isEmpty(this.msid)) {
            sb.append("mge_type=");
            sb.append(this.mge_type);
            sb.append("\n");
        }
        if (!TextUtils.isEmpty(this.msid)) {
            sb.append("val_act=");
            sb.append(this.val_act);
            sb.append("\n");
        }
        sb.append("item_index=");
        sb.append(this.item_index);
        sb.append("\n");
        if (!TextUtils.isEmpty(this.mreq_id)) {
            sb.append("mreq_id=");
            sb.append(this.mreq_id);
            sb.append("\n");
        }
        if (this.mduration_total > 0) {
            sb.append("mduration_total=");
            sb.append(this.mduration_total);
            sb.append("\n");
        }
        if (this.mduration_cnt > 0) {
            sb.append("mduration_cnt=");
            sb.append(this.mduration_cnt);
            sb.append("\n");
        }
        if (this.mduration_list != null && this.mduration_list.size() > 0) {
            sb.append("mduration_list=");
            sb.append(this.mduration_list.toString());
            sb.append("\n");
        }
        sb.append("cityid=");
        sb.append(this.city_id);
        sb.append("\n");
        sb.append("locate_city_id=");
        sb.append(this.locate_city_id);
        sb.append("\n");
        sb.append("lat=");
        sb.append(this.lat);
        sb.append("\n");
        sb.append("lng=");
        sb.append(this.lng);
        sb.append("\n");
        sb.append("app=");
        sb.append(this.app);
        sb.append("\n");
        sb.append("pushid=");
        sb.append(this.push_id);
        sb.append("\n");
        sb.append("utm_source=");
        sb.append(this.utm_source);
        sb.append("\n");
        sb.append("lch=");
        sb.append(this.lch);
        sb.append("\n");
        sb.append("uid=");
        sb.append(this.uid);
        sb.append("\n");
        sb.append("url=");
        sb.append(this.url);
        sb.append("\n");
        sb.append("req_id=");
        sb.append(this.req_id);
        sb.append("\n");
        sb.append("receive_tm=");
        sb.append(this.receive_tm);
        sb.append("\n");
        sb.append("transform_begin_tm=");
        sb.append(this.transform_begin_tm);
        sb.append("\n");
        sb.append("transform_end_tm=");
        sb.append(this.transform_end_tm);
        sb.append("\n");
        sb.append("save_end_tm=");
        sb.append(this.save_end_tm);
        sb.append("\n");
        sb.append("dispatch_begin_tm=");
        sb.append(this.dispatch_begin_tm);
        sb.append("\n");
        sb.append("is_cache=");
        sb.append(this.is_cache);
        sb.append("\n");
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        return sb.toString();
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.nm != null) {
                jSONObject.put("nm", this.nm);
            }
            if (!TextUtils.isEmpty(this.val_cid)) {
                jSONObject.put("val_cid", this.val_cid);
            }
            if (!TextUtils.isEmpty(this.val_ref)) {
                jSONObject.put("val_ref", this.val_ref);
            }
            if (this.val_lab != null && this.val_lab.size() > 0) {
                jSONObject.put("val_lab", JsonUtil.mapToJSONObject(this.val_lab));
            }
            if (!TextUtils.isEmpty(this.val_bid)) {
                jSONObject.put("val_bid", this.val_bid);
            }
            jSONObject.put(Constants.EventInfoConsts.KEY_IS_AUTO, this.isAuto);
            jSONObject.put("nt", this.nt);
            if (this.tag != null && this.tag.size() > 0) {
                jSONObject.put("tag", JsonUtil.mapToJSONObject(this.tag));
            }
            jSONObject.put("tm", this.tm);
            jSONObject.put("stm", this.stm);
            if (!TextUtils.isEmpty(this.category)) {
                jSONObject.put("category", this.category);
            }
            if (!TextUtils.isEmpty(this.element_id)) {
                jSONObject.put("element_id", this.element_id);
            }
            if (!TextUtils.isEmpty(this.val_act)) {
                jSONObject.put("val_act", this.val_act);
            }
            if (!TextUtils.isEmpty(this.msid)) {
                jSONObject.put("msid", this.msid);
            }
            jSONObject.put("seq", this.seq);
            if (!TextUtils.isEmpty(this.mge_type)) {
                jSONObject.put("mge_type", this.mge_type);
            }
            jSONObject.put(DataConstants.INDEX, this.item_index);
            jSONObject.put("duration", this.duration);
            if (!TextUtils.isEmpty(this.mreq_id)) {
                jSONObject.put("mreq_id", this.mreq_id);
            }
            jSONObject.put("mduration_total", this.mduration_total);
            jSONObject.put("mduration_cnt", this.mduration_cnt);
            jSONObject.put(DataConstants.CITY_ID, this.city_id);
            jSONObject.put("locate_city_id", this.locate_city_id);
            jSONObject.put("lat", this.lat);
            jSONObject.put("lng", this.lng);
            jSONObject.put("app", this.app);
            jSONObject.put(DataConstants.PUSH_ID, this.push_id);
            jSONObject.put("utm_source", this.utm_source);
            jSONObject.put("lch", this.lch);
            jSONObject.put("uid", this.uid);
            jSONObject.put("url", this.url);
            jSONObject.put(Constants.EventInfoConsts.KEY_REQ_ID, this.req_id);
            jSONObject.put("receive_tm", this.receive_tm);
            jSONObject.put("transform_begin_tm", this.transform_begin_tm);
            jSONObject.put("transform_end_tm", this.transform_end_tm);
            jSONObject.put("save_end_tm", this.save_end_tm);
            jSONObject.put("dispatch_begin_tm", this.dispatch_begin_tm);
            jSONObject.put(RaptorUploaderImpl.IS_CACHE, this.is_cache);
            jSONObject.put("mduration_list", this.mduration_list);
            jSONObject.put("dealgroup_id", this.dealgroupId);
            jSONObject.put("poi_id", this.poiId);
            jSONObject.put(DataConstants.CATEGORY_ID, this.categoryId);
            jSONObject.put("isAuto", this.isAuto);
            if (this.rtt_env != null && this.rtt_env.size() > 0) {
                jSONObject.put(DataConstants.RTT_ENV, JsonUtil.mapToJSONObject(this.rtt_env));
            }
            jSONObject.put("isLocal", this.isLocal);
        } catch (JSONException e) {
            new StringBuilder("EventInfo - toJson:").append(e.getMessage());
        }
        return jSONObject;
    }

    public WritableMap toWritableMap() {
        try {
            return jsonToReact(toJson());
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    static WritableMap jsonToReact(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        WritableMap createMap = Arguments.createMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    createMap.putInt(next, ((Integer) obj).intValue());
                } else {
                    createMap.putDouble(next, ((Number) obj).doubleValue());
                }
            } else if (obj instanceof String) {
                createMap.putString(next, jSONObject.getString(next));
            } else if (obj instanceof JSONObject) {
                createMap.putMap(next, jsonToReact(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                createMap.putArray(next, jsonToReact(jSONObject.getJSONArray(next)));
            } else if (obj instanceof Boolean) {
                createMap.putBoolean(next, jSONObject.getBoolean(next));
            } else if (obj == JSONObject.NULL) {
                createMap.putNull(next);
            }
        }
        return createMap;
    }

    public static WritableArray jsonToReact(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof Number) {
                if (obj instanceof Integer) {
                    createArray.pushInt(((Integer) obj).intValue());
                } else {
                    createArray.pushDouble(((Number) obj).doubleValue());
                }
            } else if (obj instanceof String) {
                createArray.pushString(jSONArray.getString(i));
            } else if (obj instanceof JSONObject) {
                createArray.pushMap(jsonToReact(jSONArray.getJSONObject(i)));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(jsonToReact(jSONArray.getJSONArray(i)));
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(jSONArray.getBoolean(i));
            } else if (obj == JSONObject.NULL) {
                createArray.pushNull();
            }
        }
        return createArray;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamData streamData = (StreamData) obj;
        return this.tm == streamData.tm && this.seq == streamData.seq && Objects.equals(this.msid, streamData.msid);
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.tm), Long.valueOf(this.seq), this.msid);
    }
}
