package com.sankuai.meituan.model.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PoiDao extends AbstractDao<Poi, Long> {
    public static final String TABLENAME = "POI";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Properties {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Property Id = new Property(0, Long.class, "id", true, "ID");
        public static final Property Addr = new Property(1, String.class, "addr", false, "ADDR");
        public static final Property AvgPrice = new Property(2, Double.TYPE, "avgPrice", false, "AVG_PRICE");
        public static final Property AvgScore = new Property(3, Double.TYPE, "avgScore", false, "AVG_SCORE");
        public static final Property ChooseSitting = new Property(4, Boolean.TYPE, "chooseSitting", false, "CHOOSE_SITTING");
        public static final Property CateId = new Property(5, Integer.TYPE, "cateId", false, "CATE_ID");
        public static final Property Cates = new Property(6, String.class, "cates", false, "CATES");
        public static final Property FeatureMenus = new Property(7, String.class, "featureMenus", false, "FEATURE_MENUS");
        public static final Property FrontImg = new Property(8, String.class, "frontImg", false, "FRONT_IMG");
        public static final Property HasGroup = new Property(9, Boolean.TYPE, "hasGroup", false, "HAS_GROUP");
        public static final Property Introduction = new Property(10, String.class, "introduction", false, "INTRODUCTION");
        public static final Property Lng = new Property(11, Double.TYPE, "lng", false, "LNG");
        public static final Property Lat = new Property(12, Double.TYPE, "lat", false, "LAT");
        public static final Property MarkNumbers = new Property(13, Integer.TYPE, "markNumbers", false, "MARK_NUMBERS");
        public static final Property Name = new Property(14, String.class, "name", false, "NAME");
        public static final Property ParkingInfo = new Property(15, String.class, "parkingInfo", false, "PARKING_INFO");
        public static final Property Phone = new Property(16, String.class, "phone", false, "PHONE");
        public static final Property ShowType = new Property(17, String.class, "showType", false, "SHOW_TYPE");
        public static final Property Style = new Property(18, String.class, "style", false, "STYLE");
        public static final Property SubwayStationId = new Property(19, String.class, "subwayStationId", false, "SUBWAY_STATION_ID");
        public static final Property Wifi = new Property(20, Boolean.TYPE, "wifi", false, "WIFI");
        public static final Property LastModified = new Property(21, Long.TYPE, "lastModified", false, "LAST_MODIFIED");
        public static final Property Preferent = new Property(22, Boolean.TYPE, "preferent", false, "PREFERENT");
        public static final Property LowestPrice = new Property(23, Double.TYPE, "lowestPrice", false, "LOWEST_PRICE");
        public static final Property AreaId = new Property(24, Integer.TYPE, "areaId", false, "AREA_ID");
        public static final Property AreaName = new Property(25, String.class, "areaName", false, "AREA_NAME");
        public static final Property CateName = new Property(26, String.class, "cateName", false, "CATE_NAME");
        public static final Property ShowTimes = new Property(27, String.class, "showTimes", false, "SHOW_TIMES");
        public static final Property PreSale = new Property(28, Boolean.TYPE, "preSale", false, "PRE_SALE");
        public static final Property ZlSourceType = new Property(29, Integer.TYPE, "zlSourceType", false, "ZL_SOURCE_TYPE");
        public static final Property SourceType = new Property(30, Integer.TYPE, "sourceType", false, "SOURCE_TYPE");
        public static final Property CampaignTag = new Property(31, String.class, "campaignTag", false, "CAMPAIGN_TAG");
        public static final Property Floor = new Property(32, String.class, GearsLocator.MALL_FLOOR, false, "FLOOR");
        public static final Property MallName = new Property(33, String.class, "mallName", false, "MALL_NAME");
        public static final Property MallId = new Property(34, Long.TYPE, "mallId", false, "MALL_ID");
        public static final Property IsFavorite = new Property(35, Boolean.TYPE, "isFavorite", false, "IS_FAVORITE");
        public static final Property IUrl = new Property(36, String.class, "iUrl", false, "I_URL");
        public static final Property Notice = new Property(37, String.class, "notice", false, "NOTICE");
        public static final Property IsImax = new Property(38, Boolean.TYPE, "isImax", false, "IS_IMAX");
        public static final Property OpenInfo = new Property(39, String.class, "openInfo", false, "OPEN_INFO");
        public static final Property BrandId = new Property(40, Long.TYPE, "brandId", false, "BRAND_ID");
        public static final Property KtvBooking = new Property(41, Integer.TYPE, "ktvBooking", false, "KTV_BOOKING");
        public static final Property KtvLowestPrice = new Property(42, Integer.TYPE, "ktvLowestPrice", false, "KTV_LOWEST_PRICE");
        public static final Property HistoryCouponCount = new Property(43, Integer.TYPE, "historyCouponCount", false, "HISTORY_COUPON_COUNT");
        public static final Property CityId = new Property(44, Long.TYPE, "cityId", false, "CITY_ID");
        public static final Property GroupInfo = new Property(45, Integer.TYPE, "groupInfo", false, "GROUP_INFO");
        public static final Property Discount = new Property(46, String.class, PayLabel.ITEM_TYPE_DISCOUNT, false, "DISCOUNT");
        public static final Property Tour = new Property(47, String.class, "tour", false, "TOUR");
        public static final Property PoiTags = new Property(48, String.class, "poiTags", false, "POI_TAGS");
        public static final Property Solds = new Property(49, Integer.TYPE, "solds", false, "SOLDS");
        public static final Property IsQueuing = new Property(50, Integer.TYPE, "isQueuing", false, "IS_QUEUING");
        public static final Property MultiType = new Property(51, String.class, "multiType", false, "MULTI_TYPE");
        public static final Property ScenicSpotImg = new Property(52, String.class, "scenicSpotImg", false, "SCENIC_SPOT_IMG");
        public static final Property SmCampaign = new Property(53, String.class, "smCampaign", false, "SM_CAMPAIGN");
        public static final Property IsWaimai = new Property(54, Integer.TYPE, "isWaimai", false, "IS_WAIMAI");
        public static final Property Recreason = new Property(55, String.class, "recreason", false, "RECREASON");
        public static final Property AllowRefund = new Property(56, Integer.TYPE, "allowRefund", false, "ALLOW_REFUND");
        public static final Property ScoreSource = new Property(57, Integer.TYPE, "scoreSource", false, "SCORE_SOURCE");
        public static final Property FodderInfo = new Property(58, String.class, "fodderInfo", false, "FODDER_INFO");
        public static final Property SmRecommendingBrands = new Property(59, String.class, "smRecommendingBrands", false, "SM_RECOMMENDING_BRANDS");
        public static final Property IsNativeSm = new Property(60, Integer.TYPE, "isNativeSm", false, "IS_NATIVE_SM");
        public static final Property DisplayPhone = new Property(61, String.class, "displayPhone", false, "DISPLAY_PHONE");
        public static final Property CouponTitle = new Property(62, String.class, "couponTitle", false, "COUPON_TITLE");
        public static final Property Channel = new Property(63, String.class, "channel", false, "CHANNEL");
        public static final Property QueueStatus = new Property(64, String.class, "queueStatus", false, "QUEUE_STATUS");
        public static final Property Resourcephone = new Property(65, String.class, "resourcephone", false, "RESOURCEPHONE");
        public static final Property ReferencePrice = new Property(66, Double.TYPE, "referencePrice", false, "REFERENCE_PRICE");
        public static final Property IsSnack = new Property(67, Boolean.class, "isSnack", false, "IS_SNACK");
        public static final Property TotalSales = new Property(68, String.class, "totalSales", false, "TOTAL_SALES");
        public static final Property Endorse = new Property(69, Integer.class, "endorse", false, "ENDORSE");
        public static final Property HotelStar = new Property(70, String.class, "hotelStar", false, "HOTEL_STAR");
        public static final Property HasPackage = new Property(71, Boolean.TYPE, "hasPackage", false, "HAS_PACKAGE");
        public static final Property CinemaId = new Property(72, Long.class, "cinemaId", false, "CINEMA_ID");
        public static final Property IsRoomListAggregated = new Property(73, Boolean.TYPE, "isRoomListAggregated", false, "IS_ROOM_LIST_AGGREGATED");
        public static final Property VipInfo = new Property(74, String.class, "vipInfo", false, "VIP_INFO");
        public static final Property ImageUrl = new Property(75, String.class, "imageUrl", false, "IMAGE_URL");
        public static final Property RedirectUrl = new Property(76, String.class, "redirectUrl", false, "REDIRECT_URL");
        public static final Property Describe = new Property(77, String.class, "describe", false, "DESCRIBE");
        public static final Property AdId = new Property(78, Integer.TYPE, "adId", false, "AD_ID");
        public static final Property BoothId = new Property(79, Integer.TYPE, "boothId", false, "BOOTH_ID");
        public static final Property BoothResourceId = new Property(80, Integer.TYPE, "boothResourceId", false, "BOOTH_RESOURCE_ID");
        public static final Property QueueColor = new Property(81, String.class, "queueColor", false, "QUEUE_COLOR");
        public static final Property Dpid = new Property(82, Long.TYPE, "dpid", false, "DPID");
        public static final Property IsForeign = new Property(83, Boolean.TYPE, "isForeign", false, "IS_FOREIGN");
        public static final Property Posdec = new Property(84, String.class, "posdec", false, "POSDEC");
        public static final Property LandMarkLatLng = new Property(85, String.class, "landMarkLatLng", false, "LAND_MARK_LAT_LNG");
        public static final Property ShowStatus = new Property(86, Integer.class, "showStatus", false, "SHOW_STATUS");
        public static final Property YufuListShowType = new Property(87, Integer.TYPE, "yufuListShowType", false, "YUFU_LIST_SHOW_TYPE");
        public static final Property PoiAttrTagList = new Property(88, String.class, "poiAttrTagList", false, "POI_ATTR_TAG_LIST");
        public static final Property ScoreText = new Property(89, String.class, "scoreText", false, "SCORE_TEXT");
        public static final Property PoiThirdCallNumber = new Property(90, String.class, "poiThirdCallNumber", false, "POI_THIRD_CALL_NUMBER");
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void bindValues(SQLiteStatement sQLiteStatement, Poi poi) {
        Poi poi2 = poi;
        Object[] objArr = {sQLiteStatement, poi2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e4bcae936c35b55e9c0e0c2c422e341", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e4bcae936c35b55e9c0e0c2c422e341");
            return;
        }
        sQLiteStatement.clearBindings();
        Long l = poi2.id;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        String str = poi2.addr;
        if (str != null) {
            sQLiteStatement.bindString(2, str);
        }
        sQLiteStatement.bindDouble(3, poi2.avgPrice);
        sQLiteStatement.bindDouble(4, poi2.avgScore);
        sQLiteStatement.bindLong(5, poi2.chooseSitting ? 1L : 0L);
        sQLiteStatement.bindLong(6, poi2.cateId);
        String str2 = poi2.cates;
        if (str2 != null) {
            sQLiteStatement.bindString(7, str2);
        }
        String str3 = poi2.featureMenus;
        if (str3 != null) {
            sQLiteStatement.bindString(8, str3);
        }
        String str4 = poi2.frontImg;
        if (str4 != null) {
            sQLiteStatement.bindString(9, str4);
        }
        sQLiteStatement.bindLong(10, poi2.hasGroup ? 1L : 0L);
        String str5 = poi2.introduction;
        if (str5 != null) {
            sQLiteStatement.bindString(11, str5);
        }
        sQLiteStatement.bindDouble(12, poi2.lng);
        sQLiteStatement.bindDouble(13, poi2.lat);
        sQLiteStatement.bindLong(14, poi2.markNumbers);
        String str6 = poi2.name;
        if (str6 != null) {
            sQLiteStatement.bindString(15, str6);
        }
        String str7 = poi2.parkingInfo;
        if (str7 != null) {
            sQLiteStatement.bindString(16, str7);
        }
        String str8 = poi2.phone;
        if (str8 != null) {
            sQLiteStatement.bindString(17, str8);
        }
        String str9 = poi2.showType;
        if (str9 != null) {
            sQLiteStatement.bindString(18, str9);
        }
        String str10 = poi2.style;
        if (str10 != null) {
            sQLiteStatement.bindString(19, str10);
        }
        String str11 = poi2.subwayStationId;
        if (str11 != null) {
            sQLiteStatement.bindString(20, str11);
        }
        sQLiteStatement.bindLong(21, poi2.wifi ? 1L : 0L);
        sQLiteStatement.bindLong(22, poi2.lastModified);
        sQLiteStatement.bindLong(23, poi2.preferent ? 1L : 0L);
        sQLiteStatement.bindDouble(24, poi2.lowestPrice);
        sQLiteStatement.bindLong(25, poi2.areaId);
        String str12 = poi2.areaName;
        if (str12 != null) {
            sQLiteStatement.bindString(26, str12);
        }
        String str13 = poi2.cateName;
        if (str13 != null) {
            sQLiteStatement.bindString(27, str13);
        }
        String str14 = poi2.showTimes;
        if (str14 != null) {
            sQLiteStatement.bindString(28, str14);
        }
        sQLiteStatement.bindLong(29, poi2.preSale ? 1L : 0L);
        sQLiteStatement.bindLong(30, poi2.zlSourceType);
        sQLiteStatement.bindLong(31, poi2.sourceType);
        String str15 = poi2.campaignTag;
        if (str15 != null) {
            sQLiteStatement.bindString(32, str15);
        }
        String str16 = poi2.floor;
        if (str16 != null) {
            sQLiteStatement.bindString(33, str16);
        }
        String str17 = poi2.mallName;
        if (str17 != null) {
            sQLiteStatement.bindString(34, str17);
        }
        sQLiteStatement.bindLong(35, poi2.mallId);
        sQLiteStatement.bindLong(36, poi2.isFavorite ? 1L : 0L);
        String str18 = poi2.iUrl;
        if (str18 != null) {
            sQLiteStatement.bindString(37, str18);
        }
        String str19 = poi2.notice;
        if (str19 != null) {
            sQLiteStatement.bindString(38, str19);
        }
        sQLiteStatement.bindLong(39, poi2.isImax ? 1L : 0L);
        String str20 = poi2.openInfo;
        if (str20 != null) {
            sQLiteStatement.bindString(40, str20);
        }
        sQLiteStatement.bindLong(41, poi2.brandId);
        sQLiteStatement.bindLong(42, poi2.ktvBooking);
        sQLiteStatement.bindLong(43, poi2.ktvLowestPrice);
        sQLiteStatement.bindLong(44, poi2.historyCouponCount);
        sQLiteStatement.bindLong(45, poi2.cityId);
        sQLiteStatement.bindLong(46, poi2.groupInfo);
        String str21 = poi2.discount;
        if (str21 != null) {
            sQLiteStatement.bindString(47, str21);
        }
        String str22 = poi2.tour;
        if (str22 != null) {
            sQLiteStatement.bindString(48, str22);
        }
        String str23 = poi2.poiTags;
        if (str23 != null) {
            sQLiteStatement.bindString(49, str23);
        }
        sQLiteStatement.bindLong(50, poi2.solds);
        sQLiteStatement.bindLong(51, poi2.isQueuing);
        String str24 = poi2.multiType;
        if (str24 != null) {
            sQLiteStatement.bindString(52, str24);
        }
        String str25 = poi2.scenicSpotImg;
        if (str25 != null) {
            sQLiteStatement.bindString(53, str25);
        }
        String str26 = poi2.smCampaign;
        if (str26 != null) {
            sQLiteStatement.bindString(54, str26);
        }
        sQLiteStatement.bindLong(55, poi2.isWaimai);
        String str27 = poi2.recreason;
        if (str27 != null) {
            sQLiteStatement.bindString(56, str27);
        }
        sQLiteStatement.bindLong(57, poi2.allowRefund);
        sQLiteStatement.bindLong(58, poi2.scoreSource);
        String str28 = poi2.fodderInfo;
        if (str28 != null) {
            sQLiteStatement.bindString(59, str28);
        }
        String str29 = poi2.smRecommendingBrands;
        if (str29 != null) {
            sQLiteStatement.bindString(60, str29);
        }
        sQLiteStatement.bindLong(61, poi2.isNativeSm);
        String str30 = poi2.displayPhone;
        if (str30 != null) {
            sQLiteStatement.bindString(62, str30);
        }
        String str31 = poi2.couponTitle;
        if (str31 != null) {
            sQLiteStatement.bindString(63, str31);
        }
        String str32 = poi2.channel;
        if (str32 != null) {
            sQLiteStatement.bindString(64, str32);
        }
        String str33 = poi2.queueStatus;
        if (str33 != null) {
            sQLiteStatement.bindString(65, str33);
        }
        String str34 = poi2.resourcephone;
        if (str34 != null) {
            sQLiteStatement.bindString(66, str34);
        }
        sQLiteStatement.bindDouble(67, poi2.referencePrice);
        Boolean bool = poi2.isSnack;
        if (bool != null) {
            sQLiteStatement.bindLong(68, bool.booleanValue() ? 1L : 0L);
        }
        String str35 = poi2.totalSales;
        if (str35 != null) {
            sQLiteStatement.bindString(69, str35);
        }
        Integer num = poi2.endorse;
        if (num != null) {
            sQLiteStatement.bindLong(70, num.intValue());
        }
        String str36 = poi2.hotelStar;
        if (str36 != null) {
            sQLiteStatement.bindString(71, str36);
        }
        sQLiteStatement.bindLong(72, poi2.hasPackage ? 1L : 0L);
        Long l2 = poi2.cinemaId;
        if (l2 != null) {
            sQLiteStatement.bindLong(73, l2.longValue());
        }
        sQLiteStatement.bindLong(74, poi2.isRoomListAggregated ? 1L : 0L);
        String str37 = poi2.vipInfo;
        if (str37 != null) {
            sQLiteStatement.bindString(75, str37);
        }
        String str38 = poi2.imageUrl;
        if (str38 != null) {
            sQLiteStatement.bindString(76, str38);
        }
        String str39 = poi2.redirectUrl;
        if (str39 != null) {
            sQLiteStatement.bindString(77, str39);
        }
        String str40 = poi2.describe;
        if (str40 != null) {
            sQLiteStatement.bindString(78, str40);
        }
        sQLiteStatement.bindLong(79, poi2.adId);
        sQLiteStatement.bindLong(80, poi2.boothId);
        sQLiteStatement.bindLong(81, poi2.boothResourceId);
        String str41 = poi2.queueColor;
        if (str41 != null) {
            sQLiteStatement.bindString(82, str41);
        }
        sQLiteStatement.bindLong(83, poi2.dpid);
        sQLiteStatement.bindLong(84, poi2.isForeign ? 1L : 0L);
        String str42 = poi2.posdec;
        if (str42 != null) {
            sQLiteStatement.bindString(85, str42);
        }
        String str43 = poi2.landMarkLatLng;
        if (str43 != null) {
            sQLiteStatement.bindString(86, str43);
        }
        Integer num2 = poi2.showStatus;
        if (num2 != null) {
            sQLiteStatement.bindLong(87, num2.intValue());
        }
        sQLiteStatement.bindLong(88, poi2.yufuListShowType);
        String str44 = poi2.poiAttrTagList;
        if (str44 != null) {
            sQLiteStatement.bindString(89, str44);
        }
        String str45 = poi2.scoreText;
        if (str45 != null) {
            sQLiteStatement.bindString(90, str45);
        }
        String str46 = poi2.poiThirdCallNumber;
        if (str46 != null) {
            sQLiteStatement.bindString(91, str46);
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long getKey(Poi poi) {
        Poi poi2 = poi;
        Object[] objArr = {poi2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7180b6de8254e10c00084dcfc643d843", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7180b6de8254e10c00084dcfc643d843");
        }
        if (poi2 != null) {
            return poi2.id;
        }
        return null;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Poi readEntity(Cursor cursor, int i) {
        Boolean valueOf;
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04d8b926a506bee3ba4d4924f8ef3751", RobustBitConfig.DEFAULT_VALUE)) {
            return (Poi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04d8b926a506bee3ba4d4924f8ef3751");
        }
        int i2 = i + 0;
        Long valueOf2 = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        double d = cursor.getDouble(i + 2);
        double d2 = cursor.getDouble(i + 3);
        boolean z = cursor.getShort(i + 4) != 0;
        int i4 = cursor.getInt(i + 5);
        int i5 = i + 6;
        String string2 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 7;
        String string3 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 8;
        String string4 = cursor.isNull(i7) ? null : cursor.getString(i7);
        boolean z2 = cursor.getShort(i + 9) != 0;
        int i8 = i + 10;
        String string5 = cursor.isNull(i8) ? null : cursor.getString(i8);
        double d3 = cursor.getDouble(i + 11);
        double d4 = cursor.getDouble(i + 12);
        int i9 = cursor.getInt(i + 13);
        int i10 = i + 14;
        String string6 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i + 15;
        String string7 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i + 16;
        String string8 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i + 17;
        String string9 = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i + 18;
        String string10 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 19;
        String string11 = cursor.isNull(i15) ? null : cursor.getString(i15);
        boolean z3 = cursor.getShort(i + 20) != 0;
        long j = cursor.getLong(i + 21);
        boolean z4 = cursor.getShort(i + 22) != 0;
        double d5 = cursor.getDouble(i + 23);
        int i16 = cursor.getInt(i + 24);
        int i17 = i + 25;
        String string12 = cursor.isNull(i17) ? null : cursor.getString(i17);
        int i18 = i + 26;
        String string13 = cursor.isNull(i18) ? null : cursor.getString(i18);
        int i19 = i + 27;
        String string14 = cursor.isNull(i19) ? null : cursor.getString(i19);
        boolean z5 = cursor.getShort(i + 28) != 0;
        int i20 = cursor.getInt(i + 29);
        int i21 = cursor.getInt(i + 30);
        int i22 = i + 31;
        String string15 = cursor.isNull(i22) ? null : cursor.getString(i22);
        int i23 = i + 32;
        String string16 = cursor.isNull(i23) ? null : cursor.getString(i23);
        int i24 = i + 33;
        String string17 = cursor.isNull(i24) ? null : cursor.getString(i24);
        long j2 = cursor.getLong(i + 34);
        boolean z6 = cursor.getShort(i + 35) != 0;
        int i25 = i + 36;
        String string18 = cursor.isNull(i25) ? null : cursor.getString(i25);
        int i26 = i + 37;
        String string19 = cursor.isNull(i26) ? null : cursor.getString(i26);
        boolean z7 = cursor.getShort(i + 38) != 0;
        int i27 = i + 39;
        String string20 = cursor.isNull(i27) ? null : cursor.getString(i27);
        long j3 = cursor.getLong(i + 40);
        int i28 = cursor.getInt(i + 41);
        int i29 = cursor.getInt(i + 42);
        int i30 = cursor.getInt(i + 43);
        long j4 = cursor.getLong(i + 44);
        int i31 = cursor.getInt(i + 45);
        int i32 = i + 46;
        String string21 = cursor.isNull(i32) ? null : cursor.getString(i32);
        int i33 = i + 47;
        String string22 = cursor.isNull(i33) ? null : cursor.getString(i33);
        int i34 = i + 48;
        String string23 = cursor.isNull(i34) ? null : cursor.getString(i34);
        int i35 = cursor.getInt(i + 49);
        int i36 = cursor.getInt(i + 50);
        int i37 = i + 51;
        String string24 = cursor.isNull(i37) ? null : cursor.getString(i37);
        int i38 = i + 52;
        String string25 = cursor.isNull(i38) ? null : cursor.getString(i38);
        int i39 = i + 53;
        String string26 = cursor.isNull(i39) ? null : cursor.getString(i39);
        int i40 = cursor.getInt(i + 54);
        int i41 = i + 55;
        String string27 = cursor.isNull(i41) ? null : cursor.getString(i41);
        int i42 = cursor.getInt(i + 56);
        int i43 = cursor.getInt(i + 57);
        int i44 = i + 58;
        String string28 = cursor.isNull(i44) ? null : cursor.getString(i44);
        int i45 = i + 59;
        String string29 = cursor.isNull(i45) ? null : cursor.getString(i45);
        int i46 = cursor.getInt(i + 60);
        int i47 = i + 61;
        String string30 = cursor.isNull(i47) ? null : cursor.getString(i47);
        int i48 = i + 62;
        String string31 = cursor.isNull(i48) ? null : cursor.getString(i48);
        int i49 = i + 63;
        String string32 = cursor.isNull(i49) ? null : cursor.getString(i49);
        int i50 = i + 64;
        String string33 = cursor.isNull(i50) ? null : cursor.getString(i50);
        int i51 = i + 65;
        String string34 = cursor.isNull(i51) ? null : cursor.getString(i51);
        double d6 = cursor.getDouble(i + 66);
        int i52 = i + 67;
        if (cursor.isNull(i52)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i52) != 0);
        }
        int i53 = i + 68;
        String string35 = cursor.isNull(i53) ? null : cursor.getString(i53);
        int i54 = i + 69;
        Integer valueOf3 = cursor.isNull(i54) ? null : Integer.valueOf(cursor.getInt(i54));
        int i55 = i + 70;
        String string36 = cursor.isNull(i55) ? null : cursor.getString(i55);
        boolean z8 = cursor.getShort(i + 71) != 0;
        int i56 = i + 72;
        Long valueOf4 = cursor.isNull(i56) ? null : Long.valueOf(cursor.getLong(i56));
        boolean z9 = cursor.getShort(i + 73) != 0;
        int i57 = i + 74;
        String string37 = cursor.isNull(i57) ? null : cursor.getString(i57);
        int i58 = i + 75;
        String string38 = cursor.isNull(i58) ? null : cursor.getString(i58);
        int i59 = i + 76;
        String string39 = cursor.isNull(i59) ? null : cursor.getString(i59);
        int i60 = i + 77;
        String string40 = cursor.isNull(i60) ? null : cursor.getString(i60);
        int i61 = cursor.getInt(i + 78);
        int i62 = cursor.getInt(i + 79);
        int i63 = cursor.getInt(i + 80);
        int i64 = i + 81;
        String string41 = cursor.isNull(i64) ? null : cursor.getString(i64);
        long j5 = cursor.getLong(i + 82);
        boolean z10 = cursor.getShort(i + 83) != 0;
        int i65 = i + 84;
        String string42 = cursor.isNull(i65) ? null : cursor.getString(i65);
        int i66 = i + 85;
        String string43 = cursor.isNull(i66) ? null : cursor.getString(i66);
        int i67 = i + 86;
        Integer valueOf5 = cursor.isNull(i67) ? null : Integer.valueOf(cursor.getInt(i67));
        int i68 = cursor.getInt(i + 87);
        int i69 = i + 88;
        String string44 = cursor.isNull(i69) ? null : cursor.getString(i69);
        int i70 = i + 89;
        int i71 = i + 90;
        return new Poi(valueOf2, string, d, d2, z, i4, string2, string3, string4, z2, string5, d3, d4, i9, string6, string7, string8, string9, string10, string11, z3, j, z4, d5, i16, string12, string13, string14, z5, i20, i21, string15, string16, string17, j2, z6, string18, string19, z7, string20, j3, i28, i29, i30, j4, i31, string21, string22, string23, i35, i36, string24, string25, string26, i40, string27, i42, i43, string28, string29, i46, string30, string31, string32, string33, string34, d6, valueOf, string35, valueOf3, string36, z8, valueOf4, z9, string37, string38, string39, string40, i61, i62, i63, string41, j5, z10, string42, string43, valueOf5, i68, string44, cursor.isNull(i70) ? null : cursor.getString(i70), cursor.isNull(i71) ? null : cursor.getString(i71));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void readEntity(Cursor cursor, Poi poi, int i) {
        Boolean valueOf;
        boolean z;
        Poi poi2 = poi;
        Object[] objArr = {cursor, poi2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "548120a788fd6d750474a97c34a0d8a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "548120a788fd6d750474a97c34a0d8a0");
            return;
        }
        int i2 = i + 0;
        poi2.id = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        poi2.addr = cursor.isNull(i3) ? null : cursor.getString(i3);
        double d = cursor.getDouble(i + 2);
        Object[] objArr2 = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect3 = Poi.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, poi2, changeQuickRedirect3, false, "848184537d954eaef58aac77baa6804a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, poi2, changeQuickRedirect3, false, "848184537d954eaef58aac77baa6804a");
        } else {
            poi2.avgPrice = d;
        }
        double d2 = cursor.getDouble(i + 3);
        Object[] objArr3 = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect4 = Poi.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr3, poi2, changeQuickRedirect4, false, "bd9e7130b499e098f7a687b0fcbe048a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, poi2, changeQuickRedirect4, false, "bd9e7130b499e098f7a687b0fcbe048a");
        } else {
            poi2.avgScore = d2;
        }
        poi2.chooseSitting = cursor.getShort(i + 4) != 0;
        poi2.cateId = cursor.getInt(i + 5);
        int i4 = i + 6;
        poi2.cates = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 7;
        poi2.featureMenus = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 8;
        poi2.frontImg = cursor.isNull(i6) ? null : cursor.getString(i6);
        poi2.hasGroup = cursor.getShort(i + 9) != 0;
        int i7 = i + 10;
        poi2.introduction = cursor.isNull(i7) ? null : cursor.getString(i7);
        poi2.a(cursor.getDouble(i + 11));
        poi2.b(cursor.getDouble(i + 12));
        poi2.markNumbers = cursor.getInt(i + 13);
        int i8 = i + 14;
        poi2.name = cursor.isNull(i8) ? null : cursor.getString(i8);
        int i9 = i + 15;
        poi2.parkingInfo = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 16;
        poi2.phone = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i + 17;
        poi2.showType = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i + 18;
        poi2.style = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i + 19;
        poi2.subwayStationId = cursor.isNull(i13) ? null : cursor.getString(i13);
        poi2.wifi = cursor.getShort(i + 20) != 0;
        long j = cursor.getLong(i + 21);
        Object[] objArr4 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect5 = Poi.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr4, poi2, changeQuickRedirect5, false, "8942bbad3b559e1beea296a93c3cfa89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, poi2, changeQuickRedirect5, false, "8942bbad3b559e1beea296a93c3cfa89");
        } else {
            poi2.lastModified = j;
        }
        poi2.preferent = cursor.getShort(i + 22) != 0;
        double d3 = cursor.getDouble(i + 23);
        Object[] objArr5 = {Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect6 = Poi.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr5, poi2, changeQuickRedirect6, false, "f146d7970fc7e818de8bcf7dc8b464e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, poi2, changeQuickRedirect6, false, "f146d7970fc7e818de8bcf7dc8b464e0");
        } else {
            poi2.lowestPrice = d3;
        }
        poi2.areaId = cursor.getInt(i + 24);
        int i14 = i + 25;
        poi2.areaName = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 26;
        poi2.cateName = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i + 27;
        poi2.showTimes = cursor.isNull(i16) ? null : cursor.getString(i16);
        poi2.preSale = cursor.getShort(i + 28) != 0;
        poi2.zlSourceType = cursor.getInt(i + 29);
        poi2.sourceType = cursor.getInt(i + 30);
        int i17 = i + 31;
        poi2.campaignTag = cursor.isNull(i17) ? null : cursor.getString(i17);
        int i18 = i + 32;
        poi2.floor = cursor.isNull(i18) ? null : cursor.getString(i18);
        int i19 = i + 33;
        poi2.mallName = cursor.isNull(i19) ? null : cursor.getString(i19);
        long j2 = cursor.getLong(i + 34);
        Object[] objArr6 = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect7 = Poi.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr6, poi2, changeQuickRedirect7, false, "11f8a0f07f6c866d7794616f34984a3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, poi2, changeQuickRedirect7, false, "11f8a0f07f6c866d7794616f34984a3c");
        } else {
            poi2.mallId = j2;
        }
        poi2.isFavorite = cursor.getShort(i + 35) != 0;
        int i20 = i + 36;
        poi2.iUrl = cursor.isNull(i20) ? null : cursor.getString(i20);
        int i21 = i + 37;
        poi2.notice = cursor.isNull(i21) ? null : cursor.getString(i21);
        poi2.isImax = cursor.getShort(i + 38) != 0;
        int i22 = i + 39;
        poi2.openInfo = cursor.isNull(i22) ? null : cursor.getString(i22);
        long j3 = cursor.getLong(i + 40);
        Object[] objArr7 = {new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect8 = Poi.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr7, poi2, changeQuickRedirect8, false, "52b8454029665084da9b27c0df64ce06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, poi2, changeQuickRedirect8, false, "52b8454029665084da9b27c0df64ce06");
        } else {
            poi2.brandId = j3;
        }
        poi2.ktvBooking = cursor.getInt(i + 41);
        poi2.ktvLowestPrice = cursor.getInt(i + 42);
        poi2.historyCouponCount = cursor.getInt(i + 43);
        long j4 = cursor.getLong(i + 44);
        Object[] objArr8 = {new Long(j4)};
        ChangeQuickRedirect changeQuickRedirect9 = Poi.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr8, poi2, changeQuickRedirect9, false, "49cc5e2ae3e3976f8fee22a78e669434", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, poi2, changeQuickRedirect9, false, "49cc5e2ae3e3976f8fee22a78e669434");
        } else {
            poi2.cityId = j4;
        }
        poi2.groupInfo = cursor.getInt(i + 45);
        int i23 = i + 46;
        poi2.discount = cursor.isNull(i23) ? null : cursor.getString(i23);
        int i24 = i + 47;
        poi2.tour = cursor.isNull(i24) ? null : cursor.getString(i24);
        int i25 = i + 48;
        poi2.poiTags = cursor.isNull(i25) ? null : cursor.getString(i25);
        poi2.solds = cursor.getInt(i + 49);
        poi2.isQueuing = cursor.getInt(i + 50);
        int i26 = i + 51;
        poi2.multiType = cursor.isNull(i26) ? null : cursor.getString(i26);
        int i27 = i + 52;
        poi2.scenicSpotImg = cursor.isNull(i27) ? null : cursor.getString(i27);
        int i28 = i + 53;
        poi2.smCampaign = cursor.isNull(i28) ? null : cursor.getString(i28);
        poi2.isWaimai = cursor.getInt(i + 54);
        int i29 = i + 55;
        poi2.recreason = cursor.isNull(i29) ? null : cursor.getString(i29);
        poi2.allowRefund = cursor.getInt(i + 56);
        poi2.scoreSource = cursor.getInt(i + 57);
        int i30 = i + 58;
        poi2.fodderInfo = cursor.isNull(i30) ? null : cursor.getString(i30);
        int i31 = i + 59;
        poi2.smRecommendingBrands = cursor.isNull(i31) ? null : cursor.getString(i31);
        poi2.isNativeSm = cursor.getInt(i + 60);
        int i32 = i + 61;
        poi2.displayPhone = cursor.isNull(i32) ? null : cursor.getString(i32);
        int i33 = i + 62;
        poi2.couponTitle = cursor.isNull(i33) ? null : cursor.getString(i33);
        int i34 = i + 63;
        poi2.channel = cursor.isNull(i34) ? null : cursor.getString(i34);
        int i35 = i + 64;
        poi2.queueStatus = cursor.isNull(i35) ? null : cursor.getString(i35);
        int i36 = i + 65;
        poi2.resourcephone = cursor.isNull(i36) ? null : cursor.getString(i36);
        double d4 = cursor.getDouble(i + 66);
        Object[] objArr9 = {Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect10 = Poi.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr9, poi2, changeQuickRedirect10, false, "a0217af638cc07d29cb26ddf1697eb4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr9, poi2, changeQuickRedirect10, false, "a0217af638cc07d29cb26ddf1697eb4c");
        } else {
            poi2.referencePrice = d4;
        }
        int i37 = i + 67;
        if (cursor.isNull(i37)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getShort(i37) != 0);
        }
        poi2.isSnack = valueOf;
        int i38 = i + 68;
        poi2.totalSales = cursor.isNull(i38) ? null : cursor.getString(i38);
        int i39 = i + 69;
        poi2.endorse = cursor.isNull(i39) ? null : Integer.valueOf(cursor.getInt(i39));
        int i40 = i + 70;
        poi2.hotelStar = cursor.isNull(i40) ? null : cursor.getString(i40);
        poi2.hasPackage = cursor.getShort(i + 71) != 0;
        int i41 = i + 72;
        poi2.cinemaId = cursor.isNull(i41) ? null : Long.valueOf(cursor.getLong(i41));
        poi2.isRoomListAggregated = cursor.getShort(i + 73) != 0;
        int i42 = i + 74;
        poi2.vipInfo = cursor.isNull(i42) ? null : cursor.getString(i42);
        int i43 = i + 75;
        poi2.imageUrl = cursor.isNull(i43) ? null : cursor.getString(i43);
        int i44 = i + 76;
        poi2.redirectUrl = cursor.isNull(i44) ? null : cursor.getString(i44);
        int i45 = i + 77;
        poi2.describe = cursor.isNull(i45) ? null : cursor.getString(i45);
        poi2.adId = cursor.getInt(i + 78);
        poi2.boothId = cursor.getInt(i + 79);
        poi2.boothResourceId = cursor.getInt(i + 80);
        int i46 = i + 81;
        poi2.queueColor = cursor.isNull(i46) ? null : cursor.getString(i46);
        long j5 = cursor.getLong(i + 82);
        Object[] objArr10 = {new Long(j5)};
        ChangeQuickRedirect changeQuickRedirect11 = Poi.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr10, poi2, changeQuickRedirect11, false, "d38455284915881ddddbb26356eb541e", RobustBitConfig.DEFAULT_VALUE)) {
            z = false;
            PatchProxy.accessDispatch(objArr10, poi2, changeQuickRedirect11, false, "d38455284915881ddddbb26356eb541e");
        } else {
            z = false;
            poi2.dpid = j5;
        }
        if (cursor.getShort(i + 83) != 0) {
            z = true;
        }
        poi2.isForeign = z;
        int i47 = i + 84;
        poi2.posdec = cursor.isNull(i47) ? null : cursor.getString(i47);
        int i48 = i + 85;
        poi2.landMarkLatLng = cursor.isNull(i48) ? null : cursor.getString(i48);
        int i49 = i + 86;
        poi2.showStatus = cursor.isNull(i49) ? null : Integer.valueOf(cursor.getInt(i49));
        poi2.yufuListShowType = cursor.getInt(i + 87);
        int i50 = i + 88;
        poi2.poiAttrTagList = cursor.isNull(i50) ? null : cursor.getString(i50);
        int i51 = i + 89;
        poi2.scoreText = cursor.isNull(i51) ? null : cursor.getString(i51);
        int i52 = i + 90;
        poi2.poiThirdCallNumber = cursor.isNull(i52) ? null : cursor.getString(i52);
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71a3cb8d8e9883ba9a34cd09a0511d2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71a3cb8d8e9883ba9a34cd09a0511d2c");
        }
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long updateKeyAfterInsert(Poi poi, long j) {
        Poi poi2 = poi;
        Object[] objArr = {poi2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4da0e45f775bd13dc37eb4b520cf060a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4da0e45f775bd13dc37eb4b520cf060a");
        }
        poi2.id = Long.valueOf(j);
        return Long.valueOf(j);
    }

    public PoiDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        Object[] objArr = {daoConfig, daoSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90c2f9b35214a163bd28e473c8ec5a28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90c2f9b35214a163bd28e473c8ec5a28");
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d7cbd120c68a0fbde91d01e3cab04077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d7cbd120c68a0fbde91d01e3cab04077");
            return;
        }
        String str = z ? "IF NOT EXISTS " : "";
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "'POI' ('ID' INTEGER PRIMARY KEY ,'ADDR' TEXT,'AVG_PRICE' REAL NOT NULL ,'AVG_SCORE' REAL NOT NULL ,'CHOOSE_SITTING' INTEGER NOT NULL ,'CATE_ID' INTEGER NOT NULL ,'CATES' TEXT,'FEATURE_MENUS' TEXT,'FRONT_IMG' TEXT,'HAS_GROUP' INTEGER NOT NULL ,'INTRODUCTION' TEXT,'LNG' REAL NOT NULL ,'LAT' REAL NOT NULL ,'MARK_NUMBERS' INTEGER NOT NULL ,'NAME' TEXT,'PARKING_INFO' TEXT,'PHONE' TEXT,'SHOW_TYPE' TEXT,'STYLE' TEXT,'SUBWAY_STATION_ID' TEXT,'WIFI' INTEGER NOT NULL ,'LAST_MODIFIED' INTEGER NOT NULL ,'PREFERENT' INTEGER NOT NULL ,'LOWEST_PRICE' REAL NOT NULL ,'AREA_ID' INTEGER NOT NULL ,'AREA_NAME' TEXT,'CATE_NAME' TEXT,'SHOW_TIMES' TEXT,'PRE_SALE' INTEGER NOT NULL ,'ZL_SOURCE_TYPE' INTEGER NOT NULL ,'SOURCE_TYPE' INTEGER NOT NULL ,'CAMPAIGN_TAG' TEXT,'FLOOR' TEXT,'MALL_NAME' TEXT,'MALL_ID' INTEGER NOT NULL ,'IS_FAVORITE' INTEGER NOT NULL ,'I_URL' TEXT,'NOTICE' TEXT,'IS_IMAX' INTEGER NOT NULL ,'OPEN_INFO' TEXT,'BRAND_ID' INTEGER NOT NULL ,'KTV_BOOKING' INTEGER NOT NULL ,'KTV_LOWEST_PRICE' INTEGER NOT NULL ,'HISTORY_COUPON_COUNT' INTEGER NOT NULL ,'CITY_ID' INTEGER NOT NULL ,'GROUP_INFO' INTEGER NOT NULL ,'DISCOUNT' TEXT,'TOUR' TEXT,'POI_TAGS' TEXT,'SOLDS' INTEGER NOT NULL ,'IS_QUEUING' INTEGER NOT NULL ,'MULTI_TYPE' TEXT,'SCENIC_SPOT_IMG' TEXT,'SM_CAMPAIGN' TEXT,'IS_WAIMAI' INTEGER NOT NULL ,'RECREASON' TEXT,'ALLOW_REFUND' INTEGER NOT NULL ,'SCORE_SOURCE' INTEGER NOT NULL ,'FODDER_INFO' TEXT,'SM_RECOMMENDING_BRANDS' TEXT,'IS_NATIVE_SM' INTEGER NOT NULL ,'DISPLAY_PHONE' TEXT,'COUPON_TITLE' TEXT,'CHANNEL' TEXT,'QUEUE_STATUS' TEXT,'RESOURCEPHONE' TEXT,'REFERENCE_PRICE' REAL NOT NULL ,'IS_SNACK' INTEGER,'TOTAL_SALES' TEXT,'ENDORSE' INTEGER,'HOTEL_STAR' TEXT,'HAS_PACKAGE' INTEGER NOT NULL ,'CINEMA_ID' INTEGER,'IS_ROOM_LIST_AGGREGATED' INTEGER NOT NULL ,'VIP_INFO' TEXT,'IMAGE_URL' TEXT,'REDIRECT_URL' TEXT,'DESCRIBE' TEXT,'AD_ID' INTEGER NOT NULL ,'BOOTH_ID' INTEGER NOT NULL ,'BOOTH_RESOURCE_ID' INTEGER NOT NULL ,'QUEUE_COLOR' TEXT,'DPID' INTEGER NOT NULL ,'IS_FOREIGN' INTEGER NOT NULL ,'POSDEC' TEXT,'LAND_MARK_LAT_LNG' TEXT,'SHOW_STATUS' INTEGER,'YUFU_LIST_SHOW_TYPE' INTEGER NOT NULL ,'POI_ATTR_TAG_LIST' TEXT,'SCORE_TEXT' TEXT,'POI_THIRD_CALL_NUMBER' TEXT);");
    }

    public static void b(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "781ded501479e465623543e51d6d7e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "781ded501479e465623543e51d6d7e51");
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("'POI'");
        sQLiteDatabase.execSQL(sb.toString());
    }
}
