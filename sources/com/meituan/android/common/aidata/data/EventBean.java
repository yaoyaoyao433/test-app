package com.meituan.android.common.aidata.data;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EventBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String abtest;
    public String activityid;
    public long adId;
    public String apn;
    public String app;
    public String appLaunchId;
    public String bht;
    public String bid;
    public String bizId;
    public String bssid;
    public String catId;
    public String category;
    public String categoryId;
    public String cid;
    public String cinemaId;
    public long cityId;
    public String couponId;
    public String ctPoi;
    public String ct_poi;
    public String custom;
    public String date;
    public String dealId;
    public long dealgroupId;
    public long dispatch_begin_tm;
    public String element_id;
    public String ext;
    public String goodsId;
    public long id;
    public long index;
    public int isAuto;
    public int isLocal;
    public String keyword;
    public double lat;
    public String lch;
    public double lng;
    public String local_source;
    public long locateCityId;
    public String loginType;
    public long lseq;
    public String maitonId;
    public int mduration_cnt;
    public List<Long> mduration_list;
    public long mduration_total;
    public String mge_type;
    public String mno;
    public String movieId;
    public String mreq_id;
    public String msid;
    public String mt_aurl;
    public String net;
    public String nm;
    public int nt;
    public String orderId;
    public String os;
    public long pageDuration;
    public String pageinfoKey;
    public String poiId;
    public String promotionId;
    public String ps;
    public String pushId;
    public String queryId;
    public long receive_tm;
    public String referCid;
    public String refer_req_id;
    public String regionId;
    public String req_id;
    public String rttEnv;
    public String rttEnvFlatten;
    public long save_end_tm;
    public String sc;
    public String scale;
    public String sdk_ver;
    public String searchId;
    public String selectId;
    public long seq;
    public String shopUuid;
    public String skuId;
    public String sortId;
    public String stid;
    public long stm;
    public String tag;
    public String tagFlatten;
    public String title;
    public long tm;
    public String traceId;
    public long transform_begin_tm;
    public long transform_end_tm;
    public String ua;
    public long uid;
    public String url;
    public String utmCampaign;
    public String utmContent;
    public String utmMedium;
    public String utmSource;
    public String utmTerm;
    public String valLab;
    public String valLabFlatten;
    public String val_act;
    public String web_sdk_ver;
    public String wifi;

    public EventBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "835a3c23302e1c29ddcdb86235a48834", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "835a3c23302e1c29ddcdb86235a48834");
            return;
        }
        this.id = -1L;
        this.date = null;
        this.tm = -1L;
        this.uid = 0L;
        this.cityId = 0L;
        this.locateCityId = 0L;
        this.lat = 0.0d;
        this.lng = 0.0d;
        this.sc = null;
        this.ua = null;
        this.net = null;
        this.msid = null;
        this.lch = null;
        this.local_source = null;
        this.ps = null;
        this.apn = null;
        this.mno = null;
        this.wifi = null;
        this.bht = null;
        this.loginType = null;
        this.pushId = null;
        this.sdk_ver = null;
        this.utmSource = null;
        this.utmMedium = null;
        this.utmCampaign = null;
        this.utmContent = null;
        this.utmTerm = null;
        this.category = null;
        this.nm = null;
        this.mge_type = null;
        this.cid = null;
        this.referCid = null;
        this.req_id = null;
        this.refer_req_id = null;
        this.pageDuration = -1L;
        this.bid = null;
        this.nt = 1;
        this.seq = 0L;
        this.isAuto = 0;
        this.tag = null;
        this.valLab = null;
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
        this.index = -1L;
        this.shopUuid = null;
        this.activityid = null;
        this.regionId = null;
        this.mduration_list = null;
        this.element_id = null;
        this.val_act = null;
        this.custom = null;
        this.pageinfoKey = null;
        this.url = null;
        this.web_sdk_ver = null;
        this.isLocal = 0;
        this.lseq = 0L;
        this.stm = 0L;
        this.mt_aurl = null;
        this.appLaunchId = null;
        this.app = null;
        this.os = null;
        this.bssid = null;
        this.ext = null;
        this.valLabFlatten = "";
        this.tagFlatten = "";
    }

    public void setId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e07339b8b5d39d565b72f0a5d468284", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e07339b8b5d39d565b72f0a5d468284");
        } else {
            this.id = j;
        }
    }

    public long getId() {
        return this.id;
    }

    public boolean isMmpEvent() {
        return this.nt == 8 || this.nt == 9;
    }
}
