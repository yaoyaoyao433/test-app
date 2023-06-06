package com.sankuai.meituan.model.dao;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.newbusiness.PoiNewBusiness;
import com.sankuai.meituan.model.payinfo.PayAbstract;
import com.sankuai.meituan.model.payinfo.PayInfoBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Poi implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -167792639529168315L;
    private Abstracts abstracts;
    int adId;
    String addr;
    private AdsInfo ads;
    private ListAdsInfo adsInfo;
    int allowRefund;
    int areaId;
    String areaName;
    double avgPrice;
    double avgScore;
    int boothId;
    int boothResourceId;
    long brandId;
    private String brandLogo;
    private String brandName;
    private String brandStory;
    String campaignTag;
    int cateId;
    String cateName;
    String cates;
    String channel;
    public CharacteristicArea characteristicArea;
    boolean chooseSitting;
    Long cinemaId;
    long cityId;
    public List<Deal> collectionDeals;
    String couponTitle;
    String describe;
    String discount;
    String displayPhone;
    private Double dist;
    private Double distance;
    long dpid;
    Integer endorse;
    private Extra extra;
    String featureMenus;
    String floor;
    public String fodderInfo;
    String frontImg;
    int groupInfo;
    private List<String> hallTypes;
    boolean hasGroup;
    boolean hasPackage;
    int historyCouponCount;
    String hotelStar;
    String iUrl;
    @SerializedName("poiid")
    Long id;
    String imageUrl;
    String introduction;
    boolean isFavorite;
    boolean isForeign;
    boolean isImax;
    int isNativeSm;
    int isQueuing;
    boolean isRoomListAggregated;
    Boolean isSnack;
    private boolean isSupportAppointment;
    int isWaimai;
    @SerializedName("ktvAppointStatus")
    int ktvBooking;
    int ktvLowestPrice;
    String landMarkLatLng;
    long lastModified;
    double lat;
    double lng;
    double lowestPrice;
    long mallId;
    String mallName;
    int markNumbers;
    private MerchantSettleInfo merchantSettleInfo;
    public int monthEatCount;
    String multiType;
    String name;
    String notice;
    public List<String> officialFrontImgs;
    String openInfo;
    String parkingInfo;
    private List<PayAbstract> payAbstracts;
    private PayInfo payInfo;
    String phone;
    public String poiAttrTagList;
    private String poiTagImg;
    private String poiTagText;
    String poiTags;
    public String poiThirdCallNumber;
    String posdec;
    boolean preSale;
    boolean preferent;
    String queueColor;
    String queueStatus;
    private Recommendation recommendation;
    String recreason;
    String redirectUrl;
    double referencePrice;
    String resourcephone;
    private int roomStatus;
    @SerializedName("frontimg")
    String scenicSpotImg;
    int scoreSource;
    String scoreText;
    private String showChannel;
    Integer showStatus;
    String showTimes;
    String showType;
    String smCampaign;
    private List<SmPromotion> smPromotion;
    String smRecommendingBrands;
    int solds;
    int sourceType;
    private String stid;
    String style;
    private List<SubPois> subPois;
    String subwayStationId;
    String totalSales;
    public String tour;
    public String vipInfo;
    boolean wifi;
    int yufuListShowType;
    int zlSourceType;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Abstracts implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String coupon;
        public String group;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class AdType {
        public static final int CommonPoi = 0;
        public static final int MixAd = 3;
        public static final int Spread = 2;
        public static final int TopAd = 1;
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class AdsInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String billing_url;
        public boolean click_hongbao;
        public String hongbao_click_through_url;
        public int hongbao_id;
        public String hongbao_text;
        public int type;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class CharacteristicArea implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String clickUrl;
        public String color;
        public String detail;
        public String iconImg;
        public String impressionUrl;
        public String type;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Entrance implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String title;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Extra implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<String> icons;
        @SerializedName("newbusiness")
        public List<PoiNewBusiness> poiNewBusinessList;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class ImageInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String imgUrl;
        public String nextUrl;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class ListAdsInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String adFlagUrl;
        public int adType;
        public String clickUrl;
        public String impressionUrl;
        public int override;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class MerchantSettleInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Entrance entrance;
        public ImageInfo imageInfo;
        public MoreInfo moreInfo;
        public SettleNow settleNow;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class MoreInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String nextUrl;
        public String title;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class PayInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String buttontext;
        public String iUrl;
        public String iconUrl;
        public String imaitonUrl;
        @SerializedName("data")
        public ArrayList<PayInfoBean> payInfoList;
        public RedPaper redPaper;
        public String subtitle;
        public String title;
        public int validity;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Recommendation implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String content;
        public int tagId;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class RedPaper implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String androidUrl;
        public int campaignid;
        public boolean display;
        public String nextUrl;
        public String title;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class SettleNow implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String androidUrl;
        public String title;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class SmPromotion implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String detail;
        public long endtime;
        public String promotionShow;
        public long starttime;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class SubPois implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int count;
        public String firstCateId;
        public String firstCateName;
        public ArrayList<Poi> poiList;
    }

    public Poi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c18ea95c4369d247ec20c32f93b01de7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c18ea95c4369d247ec20c32f93b01de7");
        } else {
            this.stid = "0";
        }
    }

    public Poi(Long l, String str, double d, double d2, boolean z, int i, String str2, String str3, String str4, boolean z2, String str5, double d3, double d4, int i2, String str6, String str7, String str8, String str9, String str10, String str11, boolean z3, long j, boolean z4, double d5, int i3, String str12, String str13, String str14, boolean z5, int i4, int i5, String str15, String str16, String str17, long j2, boolean z6, String str18, String str19, boolean z7, String str20, long j3, int i6, int i7, int i8, long j4, int i9, String str21, String str22, String str23, int i10, int i11, String str24, String str25, String str26, int i12, String str27, int i13, int i14, String str28, String str29, int i15, String str30, String str31, String str32, String str33, String str34, double d6, Boolean bool, String str35, Integer num, String str36, boolean z8, Long l2, boolean z9, String str37, String str38, String str39, String str40, int i16, int i17, int i18, String str41, long j5, boolean z10, String str42, String str43, Integer num2, int i19, String str44, String str45, String str46) {
        Object[] objArr = {l, str, Double.valueOf(d), Double.valueOf(d2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str2, str3, str4, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str5, Double.valueOf(d3), Double.valueOf(d4), Integer.valueOf(i2), str6, str7, str8, str9, str10, str11, Byte.valueOf(z3 ? (byte) 1 : (byte) 0), new Long(j), Byte.valueOf(z4 ? (byte) 1 : (byte) 0), Double.valueOf(d5), Integer.valueOf(i3), str12, str13, str14, Byte.valueOf(z5 ? (byte) 1 : (byte) 0), Integer.valueOf(i4), Integer.valueOf(i5), str15, str16, str17, new Long(j2), Byte.valueOf(z6 ? (byte) 1 : (byte) 0), str18, str19, Byte.valueOf(z7 ? (byte) 1 : (byte) 0), str20, new Long(j3), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), new Long(j4), Integer.valueOf(i9), str21, str22, str23, Integer.valueOf(i10), Integer.valueOf(i11), str24, str25, str26, Integer.valueOf(i12), str27, Integer.valueOf(i13), Integer.valueOf(i14), str28, str29, Integer.valueOf(i15), str30, str31, str32, str33, str34, Double.valueOf(d6), bool, str35, num, str36, Byte.valueOf(z8 ? (byte) 1 : (byte) 0), l2, Byte.valueOf(z9 ? (byte) 1 : (byte) 0), str37, str38, str39, str40, Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18), str41, new Long(j5), Byte.valueOf(z10 ? (byte) 1 : (byte) 0), str42, str43, num2, Integer.valueOf(i19), str44, str45, str46};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f213321771b5984ed411be589a40f90a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f213321771b5984ed411be589a40f90a");
            return;
        }
        this.stid = "0";
        this.id = l;
        this.addr = str;
        this.avgPrice = d;
        this.avgScore = d2;
        this.chooseSitting = z;
        this.cateId = i;
        this.cates = str2;
        this.featureMenus = str3;
        this.frontImg = str4;
        this.hasGroup = z2;
        this.introduction = str5;
        this.lng = d3;
        this.lat = d4;
        this.markNumbers = i2;
        this.name = str6;
        this.parkingInfo = str7;
        this.phone = str8;
        this.showType = str9;
        this.style = str10;
        this.subwayStationId = str11;
        this.wifi = z3;
        this.lastModified = j;
        this.preferent = z4;
        this.lowestPrice = d5;
        this.areaId = i3;
        this.areaName = str12;
        this.cateName = str13;
        this.showTimes = str14;
        this.preSale = z5;
        this.zlSourceType = i4;
        this.sourceType = i5;
        this.campaignTag = str15;
        this.floor = str16;
        this.mallName = str17;
        this.mallId = j2;
        this.isFavorite = z6;
        this.iUrl = str18;
        this.notice = str19;
        this.isImax = z7;
        this.openInfo = str20;
        this.brandId = j3;
        this.ktvBooking = i6;
        this.ktvLowestPrice = i7;
        this.historyCouponCount = i8;
        this.cityId = j4;
        this.groupInfo = i9;
        this.discount = str21;
        this.tour = str22;
        this.poiTags = str23;
        this.solds = i10;
        this.isQueuing = i11;
        this.multiType = str24;
        this.scenicSpotImg = str25;
        this.smCampaign = str26;
        this.isWaimai = i12;
        this.recreason = str27;
        this.allowRefund = i13;
        this.scoreSource = i14;
        this.fodderInfo = str28;
        this.smRecommendingBrands = str29;
        this.isNativeSm = i15;
        this.displayPhone = str30;
        this.couponTitle = str31;
        this.channel = str32;
        this.queueStatus = str33;
        this.resourcephone = str34;
        this.referencePrice = d6;
        this.isSnack = bool;
        this.totalSales = str35;
        this.endorse = num;
        this.hotelStar = str36;
        this.hasPackage = z8;
        this.cinemaId = l2;
        this.isRoomListAggregated = z9;
        this.vipInfo = str37;
        this.imageUrl = str38;
        this.redirectUrl = str39;
        this.describe = str40;
        this.adId = i16;
        this.boothId = i17;
        this.boothResourceId = i18;
        this.queueColor = str41;
        this.dpid = j5;
        this.isForeign = z10;
        this.posdec = str42;
        this.landMarkLatLng = str43;
        this.showStatus = num2;
        this.yufuListShowType = i19;
        this.poiAttrTagList = str44;
        this.scoreText = str45;
        this.poiThirdCallNumber = str46;
    }

    public final void a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d80346f802441be0ec456ce089d4ac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d80346f802441be0ec456ce089d4ac0");
        } else {
            this.lng = d;
        }
    }

    public final void b(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42a544a3cf68687d4c560269193799d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42a544a3cf68687d4c560269193799d9");
        } else {
            this.lat = d;
        }
    }
}
