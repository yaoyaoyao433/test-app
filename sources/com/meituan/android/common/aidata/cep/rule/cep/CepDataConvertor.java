package com.meituan.android.common.aidata.cep.rule.cep;

import com.meituan.android.common.aidata.entity.EventData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.apache.flink.cep.mlink.bean.StreamData;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CepDataConvertor {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static StreamData convertToStreamData(EventData eventData) {
        Object[] objArr = {eventData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "54934a65bc64b9256a32a554c663e091", RobustBitConfig.DEFAULT_VALUE)) {
            return (StreamData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "54934a65bc64b9256a32a554c663e091");
        }
        if (eventData == null) {
            return null;
        }
        StreamData streamData = new StreamData();
        streamData.nm = eventData.nm;
        streamData.val_cid = eventData.val_cid;
        streamData.val_ref = eventData.val_ref;
        streamData.val_lab = eventData.val_lab;
        streamData.val_bid = eventData.val_bid;
        streamData.isAuto = eventData.isAuto;
        streamData.nt = eventData.nt;
        streamData.tag = eventData.tag;
        streamData.tm = eventData.tm;
        streamData.stm = eventData.stm;
        streamData.seq = eventData.seq;
        streamData.category = eventData.category;
        streamData.msid = eventData.msid;
        streamData.element_id = eventData.element_id;
        streamData.mge_type = eventData.mge_type;
        streamData.val_act = eventData.val_act;
        streamData.item_index = eventData.item_index;
        streamData.duration = eventData.duration;
        streamData.mreq_id = eventData.mreq_id;
        streamData.mduration_total = eventData.mduration_total;
        streamData.mduration_cnt = eventData.mduration_cnt;
        if (eventData.mduration_list != null) {
            streamData.mduration_list = eventData.mduration_list.subList(0, eventData.mduration_list.size());
        }
        streamData.city_id = eventData.city_id;
        streamData.locate_city_id = eventData.locate_city_id;
        streamData.lat = eventData.lat;
        streamData.lng = eventData.lng;
        streamData.app = eventData.app;
        streamData.push_id = eventData.push_id;
        streamData.utm_source = eventData.utm_source;
        streamData.lch = eventData.lch;
        streamData.uid = eventData.uid;
        streamData.url = eventData.url;
        streamData.req_id = eventData.req_id;
        streamData.receive_tm = eventData.receive_tm;
        streamData.transform_begin_tm = eventData.transform_begin_tm;
        streamData.transform_end_tm = eventData.transform_end_tm;
        streamData.save_end_tm = eventData.save_end_tm;
        streamData.dispatch_begin_tm = eventData.dispatch_begin_tm;
        streamData.is_cache = eventData.is_cache;
        streamData.queryId = eventData.queryId;
        streamData.sortId = eventData.sortId;
        streamData.keyword = eventData.keyword;
        streamData.dealgroupId = eventData.dealgroupId;
        streamData.categoryId = eventData.categoryId;
        streamData.poiId = eventData.poiId;
        streamData.adId = eventData.adId;
        streamData.orderId = eventData.orderId;
        streamData.title = eventData.title;
        streamData.bizId = eventData.bizId;
        streamData.stid = eventData.stid;
        streamData.ct_poi = eventData.ct_poi;
        streamData.ctPoi = eventData.ctPoi;
        streamData.abtest = eventData.abtest;
        streamData.couponId = eventData.couponId;
        streamData.skuId = eventData.skuId;
        streamData.dealId = eventData.dealId;
        streamData.movieId = eventData.movieId;
        streamData.goodsId = eventData.goodsId;
        streamData.maitonId = eventData.maitonId;
        streamData.promotionId = eventData.promotionId;
        streamData.traceId = eventData.traceId;
        streamData.cinemaId = eventData.cinemaId;
        streamData.selectId = eventData.selectId;
        streamData.searchId = eventData.searchId;
        streamData.catId = eventData.catId;
        streamData.shopUuid = eventData.shopUuid;
        streamData.activityid = eventData.activityid;
        streamData.regionId = eventData.regionId;
        streamData.custom = eventData.custom;
        streamData.mt_aurl = eventData.mt_aurl;
        streamData.appLaunchId = eventData.appLaunchId;
        streamData.rtt_env = eventData.rttEnv;
        streamData.isLocal = eventData.isLocal;
        streamData.valLabFlatten = eventData.valLabFlatten;
        streamData.tagFlatten = eventData.tagFlatten;
        streamData.isLocal = eventData.isLocal;
        return streamData;
    }
}
