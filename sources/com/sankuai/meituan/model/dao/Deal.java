package com.sankuai.meituan.model.dao;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Deal implements Serializable, Cloneable {
    public static final String SHOW_TYPE_NORMAL = "normal";
    public static final String SHOW_TYPE_WEDDING = "wedding";
    public static final int TYPE_3RD = 2;
    public static final int TYPE_COUPON = 0;
    public static final int TYPE_LOGISTICS = 1;
    public static final int TYPE_LOTTERY = 4;
    public static final int TYPE_QRCODE = 3;
    public static final int TYPE_SUNGREEN = 5;
    public static ChangeQuickRedirect changeQuickRedirect;
    String announcementtitle;
    public String attrJson;
    String availContactEndTime;
    String availContactStartTime;
    float avgPrice;
    String bookinginfo;
    String bookingphone;
    String brandname;
    float campaignprice;
    public String campaigns;
    float canbuyprice;
    String cate;
    private String cateName;
    String channel;
    long couponbegintime;
    long couponendtime;
    String coupontitle;
    long ctype;
    int curcityrdcount;
    String dealflag;
    Float deposit;
    String destination;
    String digestion;
    double dist;
    Long dt;
    long dtype;
    long end;
    int expireautorefund;
    int fakerefund;
    int flag;
    public String hotelExt;
    String hotelroomname;
    public String howuse;
    String iUrl;
    Long id;
    String imgurl;
    private boolean isAvailableToday;
    boolean isHourRoom;
    private boolean isLocationValid;
    boolean isSupportAppointment;
    private boolean iswrappedup;
    public String ktvplan;
    long lastModified;
    public String mealcount;
    public String menu;
    String mlls;
    String mname;
    String murl;
    int newPromotion;
    public String newrating;
    short nobooking;
    public String optionalattrs;
    int packageShow;
    public String packages;
    private PayBill paybill;
    String pitchhtml;
    public String pois;
    float price;
    public String pricecalendar;
    String range;
    @SerializedName("rate-count")
    int ratecount;
    double rating;
    int rdcount;
    public String rdploc;
    public String recommendation;
    String recreason;
    int refund;
    int roomStatus;
    public String salestag;
    double satisfaction;
    public String securityinfo;
    int sevenrefund;
    public String shike;
    String showtype;
    String slug;
    String smstitle;
    int soldoutstatus;
    long solds;
    String squareimgurl;
    long start;
    int state;
    int status;
    private String stid;
    String subcate;
    public String tag;
    private List<FoodLabelTag> taglist;
    public String terms;
    String title;
    boolean todayavaliable;
    float value;
    String voice;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class FoodLabelTag implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String name;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class PayBill implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String discount;
        @SerializedName("did")
        public String id;
        public boolean iswholeday;
        public String price;
        public int salesNum;
        public int showtype;
        public String timerange;
        public String url;
    }

    public Deal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc0ef34640f74d144ff0355ca4b80583", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc0ef34640f74d144ff0355ca4b80583");
            return;
        }
        this.stid = "0";
        this.iswrappedup = true;
        this.isLocationValid = true;
        this.isAvailableToday = true;
    }

    public Deal(Long l, String str, String str2, String str3, long j, Long l2, long j2, String str4, long j3, int i, String str5, long j4, long j5, String str6, String str7, float f, float f2, String str8, String str9, double d, int i2, double d2, String str10, short s, String str11, String str12, String str13, String str14, String str15, String str16, String str17, float f3, double d3, int i3, String str18, int i4, String str19, String str20, boolean z, String str21, int i5, int i6, int i7, String str22, String str23, String str24, String str25, long j6, int i8, String str26, int i9, String str27, String str28, String str29, boolean z2, boolean z3, String str30, float f4, String str31, String str32, Float f5, String str33, String str34, long j7, long j8, String str35, String str36, String str37, float f6, String str38, int i10, String str39, int i11, int i12, String str40, String str41, String str42, String str43, int i13, String str44, int i14, String str45, String str46, String str47) {
        Object[] objArr = {l, str, str2, str3, new Long(j), l2, new Long(j2), str4, new Long(j3), Integer.valueOf(i), str5, new Long(j4), new Long(j5), str6, str7, Float.valueOf(f), Float.valueOf(f2), str8, str9, Double.valueOf(d), Integer.valueOf(i2), Double.valueOf(d2), str10, Short.valueOf(s), str11, str12, str13, str14, str15, str16, str17, Float.valueOf(f3), Double.valueOf(d3), Integer.valueOf(i3), str18, Integer.valueOf(i4), str19, str20, Byte.valueOf(z ? (byte) 1 : (byte) 0), str21, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), str22, str23, str24, str25, new Long(j6), Integer.valueOf(i8), str26, Integer.valueOf(i9), str27, str28, str29, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), str30, Float.valueOf(f4), str31, str32, f5, str33, str34, new Long(j7), new Long(j8), str35, str36, str37, Float.valueOf(f6), str38, Integer.valueOf(i10), str39, Integer.valueOf(i11), Integer.valueOf(i12), str40, str41, str42, str43, Integer.valueOf(i13), str44, Integer.valueOf(i14), str45, str46, str47};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b41d072b3ba64b1764403b5608946dee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b41d072b3ba64b1764403b5608946dee");
            return;
        }
        this.stid = "0";
        this.iswrappedup = true;
        this.isLocationValid = true;
        this.isAvailableToday = true;
        this.id = l;
        this.slug = str;
        this.cate = str2;
        this.subcate = str3;
        this.dtype = j;
        this.dt = l2;
        this.ctype = j2;
        this.mlls = str4;
        this.solds = j3;
        this.status = i;
        this.range = str5;
        this.start = j4;
        this.end = j5;
        this.imgurl = str6;
        this.title = str7;
        this.price = f;
        this.value = f2;
        this.mname = str8;
        this.brandname = str9;
        this.rating = d;
        this.ratecount = i2;
        this.satisfaction = d2;
        this.mealcount = str10;
        this.nobooking = s;
        this.dealflag = str11;
        this.voice = str12;
        this.attrJson = str13;
        this.newrating = str14;
        this.tag = str15;
        this.squareimgurl = str16;
        this.campaigns = str17;
        this.canbuyprice = f3;
        this.dist = d3;
        this.state = i3;
        this.murl = str18;
        this.rdcount = i4;
        this.terms = str19;
        this.rdploc = str20;
        this.todayavaliable = z;
        this.bookinginfo = str21;
        this.refund = i5;
        this.fakerefund = i6;
        this.expireautorefund = i7;
        this.announcementtitle = str22;
        this.coupontitle = str23;
        this.smstitle = str24;
        this.menu = str25;
        this.lastModified = j6;
        this.flag = i8;
        this.howuse = str26;
        this.sevenrefund = i9;
        this.ktvplan = str27;
        this.bookingphone = str28;
        this.hotelExt = str29;
        this.isHourRoom = z2;
        this.isSupportAppointment = z3;
        this.pricecalendar = str30;
        this.campaignprice = f4;
        this.recreason = str31;
        this.showtype = str32;
        this.deposit = f5;
        this.securityinfo = str33;
        this.optionalattrs = str34;
        this.couponbegintime = j7;
        this.couponendtime = j8;
        this.hotelroomname = str35;
        this.digestion = str36;
        this.salestag = str37;
        this.avgPrice = f6;
        this.channel = str38;
        this.curcityrdcount = i10;
        this.iUrl = str39;
        this.roomStatus = i11;
        this.newPromotion = i12;
        this.pitchhtml = str40;
        this.recommendation = str41;
        this.pois = str42;
        this.destination = str43;
        this.packageShow = i13;
        this.packages = str44;
        this.soldoutstatus = i14;
        this.availContactStartTime = str45;
        this.availContactEndTime = str46;
        this.shike = str47;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6053e38cadbf7c2d6f8f6c3e0627c459", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6053e38cadbf7c2d6f8f6c3e0627c459");
        } else {
            this.start = j;
        }
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94cbc52000db78cdc26b92f9b52a4ed6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94cbc52000db78cdc26b92f9b52a4ed6");
        } else {
            this.end = j;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fba58b11e855386a554e0b82cfe2b313", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fba58b11e855386a554e0b82cfe2b313") : super.clone();
    }
}
