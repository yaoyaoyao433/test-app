package com.sankuai.meituan.model.dao;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Order implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aftersalesapply")
    int afterSalesApply;
    Double amount;
    private List<Integer> bigOrderCounts;
    private List<String> bigOrderCoupons;
    Long bigOrderId;
    private List<Integer> bigOrderStatusList;
    String buttonText;
    @SerializedName("cancancelrefund")
    Short canCancelRefund;
    private List<Boolean> canCancelRefunds;
    @SerializedName("canrefund")
    Short canRefund;
    private List<Boolean> canRefunds;
    @SerializedName("cansetused")
    Short canSetUsed;
    Short cancel;
    Integer collectionStatus;
    Integer count;
    public String coupons;
    Short createType;
    public String deal;
    Short delete;
    public String delivery;
    Long did;
    @SerializedName("failtext")
    String failText;
    public String feedback;
    private List<String> feedbacks;
    Integer flag;
    @SerializedName("pricecalendar")
    public String hotelSKU;
    @SerializedName("oid")
    Long id;
    private boolean isBigOrder;
    private boolean isDraft;
    Short isTipped;
    @SerializedName("isused")
    Short isUsed;
    Long lastModified;
    public String mms;
    String mobile;
    Long modtime;
    private List<String> moreInfos;
    public String moreinfo;
    public String movie;
    @SerializedName("ordergoods")
    public String orderGoods;
    private List<Long> orderIds;
    Long ordertime;
    boolean payOverOneDay;
    Integer payType;
    Integer paymentStatus;
    Long paytime;
    public String portionBook;
    private List<String> priceCalendars;
    public String promocodes;
    @SerializedName("couponsXiechengRefundDetail")
    public String refundDetail;
    private List<String> refundDetails;
    String refundMsg;
    public String reward;
    String riskRefund;
    @SerializedName("showtype")
    String showType;
    Integer source;
    Integer status;
    public String tour;
    Short type;
    Long userid;

    public Order() {
    }

    public Order(Long l, Short sh, Integer num, String str, Long l2, Long l3, Short sh2, Long l4, Short sh3, Long l5, Short sh4, Double d, String str2, String str3, Short sh5, Short sh6, String str4, Short sh7, Short sh8, String str5, String str6, String str7, Integer num2, Integer num3, String str8, Short sh9, String str9, Long l6, Integer num4, String str10, String str11, String str12, String str13, String str14, int i, boolean z, String str15, String str16, String str17, Integer num5, Long l7, String str18, String str19, Integer num6, String str20, Long l8, Integer num7) {
        Object[] objArr = {l, sh, num, str, l2, l3, sh2, l4, sh3, l5, sh4, d, str2, str3, sh5, sh6, str4, sh7, sh8, str5, str6, str7, num2, num3, str8, sh9, str9, l6, num4, str10, str11, str12, str13, str14, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), str15, str16, str17, num5, l7, str18, str19, num6, str20, l8, num7};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c429fb940cd3eebaeb9ed81e7452040", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c429fb940cd3eebaeb9ed81e7452040");
            return;
        }
        this.id = l;
        this.isUsed = sh;
        this.count = num;
        this.orderGoods = str;
        this.modtime = l2;
        this.did = l3;
        this.cancel = sh2;
        this.ordertime = l4;
        this.type = sh3;
        this.paytime = l5;
        this.isTipped = sh4;
        this.amount = d;
        this.feedback = str2;
        this.coupons = str3;
        this.canRefund = sh5;
        this.canCancelRefund = sh6;
        this.deal = str4;
        this.delete = sh7;
        this.canSetUsed = sh8;
        this.delivery = str5;
        this.promocodes = str6;
        this.mms = str7;
        this.status = num2;
        this.paymentStatus = num3;
        this.refundMsg = str8;
        this.createType = sh9;
        this.refundDetail = str9;
        this.lastModified = l6;
        this.flag = num4;
        this.mobile = str10;
        this.portionBook = str11;
        this.hotelSKU = str12;
        this.failText = str13;
        this.riskRefund = str14;
        this.afterSalesApply = i;
        this.payOverOneDay = z;
        this.moreinfo = str15;
        this.showType = str16;
        this.tour = str17;
        this.collectionStatus = num5;
        this.bigOrderId = l7;
        this.movie = str18;
        this.reward = str19;
        this.payType = num6;
        this.buttonText = str20;
        this.userid = l8;
        this.source = num7;
    }
}
