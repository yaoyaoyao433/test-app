package com.meituan.android.common.aidata.entity;

import android.text.TextUtils;
import com.meituan.android.common.aidata.data.api.IEvent;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EventData extends IEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String abtest;
    public String activityid;
    public long adId;
    public String app;
    public String appLaunchId;
    public String bizId;
    public String catId;
    public String category;
    public String categoryId;
    public String cinemaId;
    public long city_id;
    public String couponId;
    public String ctPoi;
    public String ct_poi;
    public String custom;
    public String dealId;
    public long dealgroupId;
    public long dispatch_begin_tm;
    public long duration;
    public String element_id;
    public String goodsId;
    public int isAuto;
    public int isLocal;
    public int is_cache;
    public Long item_index;
    public String keyword;
    public double lat;
    public String lch;
    public double lng;
    public long locate_city_id;
    public String maitonId;
    public int mduration_cnt;
    public List<Long> mduration_list;
    public long mduration_total;
    public String mge_type;
    public String movieId;
    public String mreq_id;
    public String msid;
    public String mt_aurl;
    public String nm;
    public int nt;
    public String orderId;
    public String poiId;
    public String promotionId;
    public String push_id;
    public String queryId;
    public long receive_tm;
    public String regionId;
    public String req_id;
    public Map<String, Object> rttEnv;
    public long save_end_tm;
    public String searchId;
    public String selectId;
    public long seq;
    public String shopUuid;
    public String skuId;
    public String sortId;
    public String stid;
    public long stm;
    public Map<String, Object> tag;
    public String tagFlatten;
    public String title;
    public long tm;
    public String traceId;
    public long transform_begin_tm;
    public long transform_end_tm;
    public long uid;
    public String url;
    public String utm_source;
    public String valLabFlatten;
    public String val_act;
    public String val_bid;
    public String val_cid;
    public Map<String, Object> val_lab;
    public String val_ref;

    public EventData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e59c317069bef02a74f97f498c22fa1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e59c317069bef02a74f97f498c22fa1");
            return;
        }
        this.mduration_list = null;
        this.city_id = 0L;
        this.locate_city_id = 0L;
        this.lat = 0.0d;
        this.lng = 0.0d;
        this.app = null;
        this.push_id = null;
        this.utm_source = null;
        this.lch = null;
        this.uid = 0L;
        this.url = null;
        this.req_id = null;
        this.queryId = null;
        this.sortId = null;
        this.keyword = null;
        this.dealgroupId = 0L;
        this.categoryId = null;
        this.poiId = null;
        this.adId = 0L;
        this.orderId = null;
        this.title = null;
        this.bizId = null;
        this.stid = null;
        this.ct_poi = null;
        this.ctPoi = null;
        this.abtest = null;
        this.couponId = null;
        this.skuId = null;
        this.dealId = null;
        this.movieId = null;
        this.goodsId = null;
        this.maitonId = null;
        this.promotionId = null;
        this.traceId = null;
        this.cinemaId = null;
        this.selectId = null;
        this.searchId = null;
        this.catId = null;
        this.shopUuid = null;
        this.activityid = null;
        this.regionId = null;
        this.custom = null;
        this.mt_aurl = null;
        this.appLaunchId = null;
        this.isLocal = 0;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09fe3a297c77b7c4d7468758ebcab4bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09fe3a297c77b7c4d7468758ebcab4bd");
        }
        if (LogUtil.isLogEnabled()) {
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
            if (!TextUtils.isEmpty(this.app)) {
                sb.append("app=");
                sb.append(this.app);
                sb.append("\n");
            }
            if (!TextUtils.isEmpty(this.push_id)) {
                sb.append("pushid=");
                sb.append(this.push_id);
                sb.append("\n");
            }
            if (!TextUtils.isEmpty(this.utm_source)) {
                sb.append("utm_source=");
                sb.append(this.utm_source);
                sb.append("\n");
            }
            if (!TextUtils.isEmpty(this.lch)) {
                sb.append("lch=");
                sb.append(this.lch);
                sb.append("\n");
            }
            sb.append("uid=");
            sb.append(this.uid);
            sb.append("\n");
            if (!TextUtils.isEmpty(this.url)) {
                sb.append("url=");
                sb.append(this.url);
                sb.append("\n");
            }
            if (!TextUtils.isEmpty(this.req_id)) {
                sb.append("req_id=");
                sb.append(this.req_id);
                sb.append("\n");
            }
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
            if (this.rttEnv != null) {
                sb.append("rtt_env=");
                sb.append(this.rttEnv.toString());
                sb.append("\n");
            }
            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            return sb.toString();
        }
        return "";
    }
}
