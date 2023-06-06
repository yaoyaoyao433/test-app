package com.sankuai.meituan.model.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderDao extends AbstractDao<Order, Long> {
    public static final String TABLENAME = "myorder";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Properties {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Property Id = new Property(0, Long.class, "id", true, "ID");
        public static final Property IsUsed = new Property(1, Short.class, "isUsed", false, "IS_USED");
        public static final Property Count = new Property(2, Integer.class, "count", false, "COUNT");
        public static final Property OrderGoods = new Property(3, String.class, "orderGoods", false, "ORDER_GOODS");
        public static final Property Modtime = new Property(4, Long.class, "modtime", false, "MODTIME");
        public static final Property Did = new Property(5, Long.class, "did", false, "DID");
        public static final Property Cancel = new Property(6, Short.class, "cancel", false, "CANCEL");
        public static final Property Ordertime = new Property(7, Long.class, "ordertime", false, "ORDERTIME");
        public static final Property Type = new Property(8, Short.class, "type", false, "TYPE");
        public static final Property Paytime = new Property(9, Long.class, "paytime", false, "PAYTIME");
        public static final Property IsTipped = new Property(10, Short.class, "isTipped", false, "IS_TIPPED");
        public static final Property Amount = new Property(11, Double.class, "amount", false, "AMOUNT");
        public static final Property Feedback = new Property(12, String.class, DMKeys.KEY_MIDAS_FEEDBACK, false, "FEEDBACK");
        public static final Property Coupons = new Property(13, String.class, "coupons", false, "COUPONS");
        public static final Property CanRefund = new Property(14, Short.class, "canRefund", false, "CAN_REFUND");
        public static final Property CanCancelRefund = new Property(15, Short.class, "canCancelRefund", false, "CAN_CANCEL_REFUND");
        public static final Property Deal = new Property(16, String.class, DealDao.TABLENAME, false, "DEAL");
        public static final Property Delete = new Property(17, Short.class, "delete", false, "DELETE");
        public static final Property CanSetUsed = new Property(18, Short.class, "canSetUsed", false, "CAN_SET_USED");
        public static final Property Delivery = new Property(19, String.class, "delivery", false, "DELIVERY");
        public static final Property Promocodes = new Property(20, String.class, "promocodes", false, "PROMOCODES");
        public static final Property Mms = new Property(21, String.class, "mms", false, "MMS");
        public static final Property Status = new Property(22, Integer.class, "status", false, "STATUS");
        public static final Property PaymentStatus = new Property(23, Integer.class, "paymentStatus", false, "PAYMENT_STATUS");
        public static final Property RefundMsg = new Property(24, String.class, "refundMsg", false, "REFUND_MSG");
        public static final Property CreateType = new Property(25, Short.class, "createType", false, "CREATE_TYPE");
        public static final Property RefundDetail = new Property(26, String.class, "refundDetail", false, "REFUND_DETAIL");
        public static final Property LastModified = new Property(27, Long.class, "lastModified", false, "LAST_MODIFIED");
        public static final Property Flag = new Property(28, Integer.class, "flag", false, "FLAG");
        public static final Property Mobile = new Property(29, String.class, "mobile", false, "MOBILE");
        public static final Property PortionBook = new Property(30, String.class, "portionBook", false, "PORTION_BOOK");
        public static final Property HotelSKU = new Property(31, String.class, "hotelSKU", false, "HOTEL_SKU");
        public static final Property FailText = new Property(32, String.class, "failText", false, "FAIL_TEXT");
        public static final Property RiskRefund = new Property(33, String.class, "riskRefund", false, "RISK_REFUND");
        public static final Property AfterSalesApply = new Property(34, Integer.TYPE, "afterSalesApply", false, "AFTER_SALES_APPLY");
        public static final Property PayOverOneDay = new Property(35, Boolean.TYPE, "payOverOneDay", false, "PAY_OVER_ONE_DAY");
        public static final Property Moreinfo = new Property(36, String.class, "moreinfo", false, "MOREINFO");
        public static final Property ShowType = new Property(37, String.class, "showType", false, "SHOW_TYPE");
        public static final Property Tour = new Property(38, String.class, "tour", false, "TOUR");
        public static final Property CollectionStatus = new Property(39, Integer.class, "collectionStatus", false, "COLLECTION_STATUS");
        public static final Property BigOrderId = new Property(40, Long.class, "bigOrderId", false, "BIG_ORDER_ID");
        public static final Property Movie = new Property(41, String.class, "movie", false, "MOVIE");
        public static final Property Reward = new Property(42, String.class, PayLabel.ITEM_TYPE_REWARD, false, "REWARD");
        public static final Property PayType = new Property(43, Integer.class, "payType", false, "PAY_TYPE");
        public static final Property ButtonText = new Property(44, String.class, "buttonText", false, "BUTTON_TEXT");
        public static final Property Userid = new Property(45, Long.class, "userid", false, "USERID");
        public static final Property Source = new Property(46, Integer.class, "source", false, "SOURCE");
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void bindValues(SQLiteStatement sQLiteStatement, Order order) {
        Order order2 = order;
        Object[] objArr = {sQLiteStatement, order2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e961295fabc86ea69e2b217a1a72008d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e961295fabc86ea69e2b217a1a72008d");
            return;
        }
        sQLiteStatement.clearBindings();
        Long l = order2.id;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        Short sh = order2.isUsed;
        if (sh != null) {
            sQLiteStatement.bindLong(2, sh.shortValue());
        }
        Integer num = order2.count;
        if (num != null) {
            sQLiteStatement.bindLong(3, num.intValue());
        }
        String str = order2.orderGoods;
        if (str != null) {
            sQLiteStatement.bindString(4, str);
        }
        Long l2 = order2.modtime;
        if (l2 != null) {
            sQLiteStatement.bindLong(5, l2.longValue());
        }
        Long l3 = order2.did;
        if (l3 != null) {
            sQLiteStatement.bindLong(6, l3.longValue());
        }
        Short sh2 = order2.cancel;
        if (sh2 != null) {
            sQLiteStatement.bindLong(7, sh2.shortValue());
        }
        Long l4 = order2.ordertime;
        if (l4 != null) {
            sQLiteStatement.bindLong(8, l4.longValue());
        }
        Short sh3 = order2.type;
        if (sh3 != null) {
            sQLiteStatement.bindLong(9, sh3.shortValue());
        }
        Long l5 = order2.paytime;
        if (l5 != null) {
            sQLiteStatement.bindLong(10, l5.longValue());
        }
        Short sh4 = order2.isTipped;
        if (sh4 != null) {
            sQLiteStatement.bindLong(11, sh4.shortValue());
        }
        Double d = order2.amount;
        if (d != null) {
            sQLiteStatement.bindDouble(12, d.doubleValue());
        }
        String str2 = order2.feedback;
        if (str2 != null) {
            sQLiteStatement.bindString(13, str2);
        }
        String str3 = order2.coupons;
        if (str3 != null) {
            sQLiteStatement.bindString(14, str3);
        }
        Short sh5 = order2.canRefund;
        if (sh5 != null) {
            sQLiteStatement.bindLong(15, sh5.shortValue());
        }
        Short sh6 = order2.canCancelRefund;
        if (sh6 != null) {
            sQLiteStatement.bindLong(16, sh6.shortValue());
        }
        String str4 = order2.deal;
        if (str4 != null) {
            sQLiteStatement.bindString(17, str4);
        }
        Short sh7 = order2.delete;
        if (sh7 != null) {
            sQLiteStatement.bindLong(18, sh7.shortValue());
        }
        Short sh8 = order2.canSetUsed;
        if (sh8 != null) {
            sQLiteStatement.bindLong(19, sh8.shortValue());
        }
        String str5 = order2.delivery;
        if (str5 != null) {
            sQLiteStatement.bindString(20, str5);
        }
        String str6 = order2.promocodes;
        if (str6 != null) {
            sQLiteStatement.bindString(21, str6);
        }
        String str7 = order2.mms;
        if (str7 != null) {
            sQLiteStatement.bindString(22, str7);
        }
        Integer num2 = order2.status;
        if (num2 != null) {
            sQLiteStatement.bindLong(23, num2.intValue());
        }
        Integer num3 = order2.paymentStatus;
        if (num3 != null) {
            sQLiteStatement.bindLong(24, num3.intValue());
        }
        String str8 = order2.refundMsg;
        if (str8 != null) {
            sQLiteStatement.bindString(25, str8);
        }
        Short sh9 = order2.createType;
        if (sh9 != null) {
            sQLiteStatement.bindLong(26, sh9.shortValue());
        }
        String str9 = order2.refundDetail;
        if (str9 != null) {
            sQLiteStatement.bindString(27, str9);
        }
        Long l6 = order2.lastModified;
        if (l6 != null) {
            sQLiteStatement.bindLong(28, l6.longValue());
        }
        Integer num4 = order2.flag;
        if (num4 != null) {
            sQLiteStatement.bindLong(29, num4.intValue());
        }
        String str10 = order2.mobile;
        if (str10 != null) {
            sQLiteStatement.bindString(30, str10);
        }
        String str11 = order2.portionBook;
        if (str11 != null) {
            sQLiteStatement.bindString(31, str11);
        }
        String str12 = order2.hotelSKU;
        if (str12 != null) {
            sQLiteStatement.bindString(32, str12);
        }
        String str13 = order2.failText;
        if (str13 != null) {
            sQLiteStatement.bindString(33, str13);
        }
        String str14 = order2.riskRefund;
        if (str14 != null) {
            sQLiteStatement.bindString(34, str14);
        }
        sQLiteStatement.bindLong(35, order2.afterSalesApply);
        sQLiteStatement.bindLong(36, order2.payOverOneDay ? 1L : 0L);
        String str15 = order2.moreinfo;
        if (str15 != null) {
            sQLiteStatement.bindString(37, str15);
        }
        String str16 = order2.showType;
        if (str16 != null) {
            sQLiteStatement.bindString(38, str16);
        }
        String str17 = order2.tour;
        if (str17 != null) {
            sQLiteStatement.bindString(39, str17);
        }
        Integer num5 = order2.collectionStatus;
        if (num5 != null) {
            sQLiteStatement.bindLong(40, num5.intValue());
        }
        Long l7 = order2.bigOrderId;
        if (l7 != null) {
            sQLiteStatement.bindLong(41, l7.longValue());
        }
        String str18 = order2.movie;
        if (str18 != null) {
            sQLiteStatement.bindString(42, str18);
        }
        String str19 = order2.reward;
        if (str19 != null) {
            sQLiteStatement.bindString(43, str19);
        }
        Integer num6 = order2.payType;
        if (num6 != null) {
            sQLiteStatement.bindLong(44, num6.intValue());
        }
        String str20 = order2.buttonText;
        if (str20 != null) {
            sQLiteStatement.bindString(45, str20);
        }
        Long l8 = order2.userid;
        if (l8 != null) {
            sQLiteStatement.bindLong(46, l8.longValue());
        }
        Integer num7 = order2.source;
        if (num7 != null) {
            sQLiteStatement.bindLong(47, num7.intValue());
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long getKey(Order order) {
        Order order2 = order;
        Object[] objArr = {order2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d82ee67f5643d71f4cfe2021d4edbdeb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d82ee67f5643d71f4cfe2021d4edbdeb");
        }
        if (order2 != null) {
            return order2.id;
        }
        return null;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Order readEntity(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd44f858d75368a2f6c77798593561a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Order) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd44f858d75368a2f6c77798593561a9");
        }
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Short valueOf2 = cursor.isNull(i3) ? null : Short.valueOf(cursor.getShort(i3));
        int i4 = i + 2;
        Integer valueOf3 = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 3;
        String string = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        Long valueOf4 = cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6));
        int i7 = i + 5;
        Long valueOf5 = cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7));
        int i8 = i + 6;
        Short valueOf6 = cursor.isNull(i8) ? null : Short.valueOf(cursor.getShort(i8));
        int i9 = i + 7;
        Long valueOf7 = cursor.isNull(i9) ? null : Long.valueOf(cursor.getLong(i9));
        int i10 = i + 8;
        Short valueOf8 = cursor.isNull(i10) ? null : Short.valueOf(cursor.getShort(i10));
        int i11 = i + 9;
        Long valueOf9 = cursor.isNull(i11) ? null : Long.valueOf(cursor.getLong(i11));
        int i12 = i + 10;
        Short valueOf10 = cursor.isNull(i12) ? null : Short.valueOf(cursor.getShort(i12));
        int i13 = i + 11;
        Double valueOf11 = cursor.isNull(i13) ? null : Double.valueOf(cursor.getDouble(i13));
        int i14 = i + 12;
        String string2 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 13;
        String string3 = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i + 14;
        Short valueOf12 = cursor.isNull(i16) ? null : Short.valueOf(cursor.getShort(i16));
        int i17 = i + 15;
        Short valueOf13 = cursor.isNull(i17) ? null : Short.valueOf(cursor.getShort(i17));
        int i18 = i + 16;
        String string4 = cursor.isNull(i18) ? null : cursor.getString(i18);
        int i19 = i + 17;
        Short valueOf14 = cursor.isNull(i19) ? null : Short.valueOf(cursor.getShort(i19));
        int i20 = i + 18;
        Short valueOf15 = cursor.isNull(i20) ? null : Short.valueOf(cursor.getShort(i20));
        int i21 = i + 19;
        String string5 = cursor.isNull(i21) ? null : cursor.getString(i21);
        int i22 = i + 20;
        String string6 = cursor.isNull(i22) ? null : cursor.getString(i22);
        int i23 = i + 21;
        String string7 = cursor.isNull(i23) ? null : cursor.getString(i23);
        int i24 = i + 22;
        Integer valueOf16 = cursor.isNull(i24) ? null : Integer.valueOf(cursor.getInt(i24));
        int i25 = i + 23;
        Integer valueOf17 = cursor.isNull(i25) ? null : Integer.valueOf(cursor.getInt(i25));
        int i26 = i + 24;
        String string8 = cursor.isNull(i26) ? null : cursor.getString(i26);
        int i27 = i + 25;
        Short valueOf18 = cursor.isNull(i27) ? null : Short.valueOf(cursor.getShort(i27));
        int i28 = i + 26;
        String string9 = cursor.isNull(i28) ? null : cursor.getString(i28);
        int i29 = i + 27;
        Long valueOf19 = cursor.isNull(i29) ? null : Long.valueOf(cursor.getLong(i29));
        int i30 = i + 28;
        Integer valueOf20 = cursor.isNull(i30) ? null : Integer.valueOf(cursor.getInt(i30));
        int i31 = i + 29;
        String string10 = cursor.isNull(i31) ? null : cursor.getString(i31);
        int i32 = i + 30;
        String string11 = cursor.isNull(i32) ? null : cursor.getString(i32);
        int i33 = i + 31;
        String string12 = cursor.isNull(i33) ? null : cursor.getString(i33);
        int i34 = i + 32;
        String string13 = cursor.isNull(i34) ? null : cursor.getString(i34);
        int i35 = i + 33;
        String string14 = cursor.isNull(i35) ? null : cursor.getString(i35);
        int i36 = cursor.getInt(i + 34);
        boolean z = cursor.getShort(i + 35) != 0;
        int i37 = i + 36;
        String string15 = cursor.isNull(i37) ? null : cursor.getString(i37);
        int i38 = i + 37;
        String string16 = cursor.isNull(i38) ? null : cursor.getString(i38);
        int i39 = i + 38;
        String string17 = cursor.isNull(i39) ? null : cursor.getString(i39);
        int i40 = i + 39;
        Integer valueOf21 = cursor.isNull(i40) ? null : Integer.valueOf(cursor.getInt(i40));
        int i41 = i + 40;
        Long valueOf22 = cursor.isNull(i41) ? null : Long.valueOf(cursor.getLong(i41));
        int i42 = i + 41;
        String string18 = cursor.isNull(i42) ? null : cursor.getString(i42);
        int i43 = i + 42;
        String string19 = cursor.isNull(i43) ? null : cursor.getString(i43);
        int i44 = i + 43;
        Integer valueOf23 = cursor.isNull(i44) ? null : Integer.valueOf(cursor.getInt(i44));
        int i45 = i + 44;
        String string20 = cursor.isNull(i45) ? null : cursor.getString(i45);
        int i46 = i + 45;
        int i47 = i + 46;
        return new Order(valueOf, valueOf2, valueOf3, string, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, string2, string3, valueOf12, valueOf13, string4, valueOf14, valueOf15, string5, string6, string7, valueOf16, valueOf17, string8, valueOf18, string9, valueOf19, valueOf20, string10, string11, string12, string13, string14, i36, z, string15, string16, string17, valueOf21, valueOf22, string18, string19, valueOf23, string20, cursor.isNull(i46) ? null : Long.valueOf(cursor.getLong(i46)), cursor.isNull(i47) ? null : Integer.valueOf(cursor.getInt(i47)));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void readEntity(Cursor cursor, Order order, int i) {
        Order order2 = order;
        Object[] objArr = {cursor, order2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a6b5aa41c5cc486f4f894f439fa58b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a6b5aa41c5cc486f4f894f439fa58b0");
            return;
        }
        int i2 = i + 0;
        order2.id = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        order2.isUsed = cursor.isNull(i3) ? null : Short.valueOf(cursor.getShort(i3));
        int i4 = i + 2;
        order2.count = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 3;
        order2.orderGoods = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        order2.modtime = cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6));
        int i7 = i + 5;
        order2.did = cursor.isNull(i7) ? null : Long.valueOf(cursor.getLong(i7));
        int i8 = i + 6;
        order2.cancel = cursor.isNull(i8) ? null : Short.valueOf(cursor.getShort(i8));
        int i9 = i + 7;
        order2.ordertime = cursor.isNull(i9) ? null : Long.valueOf(cursor.getLong(i9));
        int i10 = i + 8;
        order2.type = cursor.isNull(i10) ? null : Short.valueOf(cursor.getShort(i10));
        int i11 = i + 9;
        order2.paytime = cursor.isNull(i11) ? null : Long.valueOf(cursor.getLong(i11));
        int i12 = i + 10;
        order2.isTipped = cursor.isNull(i12) ? null : Short.valueOf(cursor.getShort(i12));
        int i13 = i + 11;
        order2.amount = cursor.isNull(i13) ? null : Double.valueOf(cursor.getDouble(i13));
        int i14 = i + 12;
        order2.feedback = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 13;
        order2.coupons = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i + 14;
        order2.canRefund = cursor.isNull(i16) ? null : Short.valueOf(cursor.getShort(i16));
        int i17 = i + 15;
        order2.canCancelRefund = cursor.isNull(i17) ? null : Short.valueOf(cursor.getShort(i17));
        int i18 = i + 16;
        order2.deal = cursor.isNull(i18) ? null : cursor.getString(i18);
        int i19 = i + 17;
        order2.delete = cursor.isNull(i19) ? null : Short.valueOf(cursor.getShort(i19));
        int i20 = i + 18;
        order2.canSetUsed = cursor.isNull(i20) ? null : Short.valueOf(cursor.getShort(i20));
        int i21 = i + 19;
        order2.delivery = cursor.isNull(i21) ? null : cursor.getString(i21);
        int i22 = i + 20;
        order2.promocodes = cursor.isNull(i22) ? null : cursor.getString(i22);
        int i23 = i + 21;
        order2.mms = cursor.isNull(i23) ? null : cursor.getString(i23);
        int i24 = i + 22;
        order2.status = cursor.isNull(i24) ? null : Integer.valueOf(cursor.getInt(i24));
        int i25 = i + 23;
        order2.paymentStatus = cursor.isNull(i25) ? null : Integer.valueOf(cursor.getInt(i25));
        int i26 = i + 24;
        order2.refundMsg = cursor.isNull(i26) ? null : cursor.getString(i26);
        int i27 = i + 25;
        order2.createType = cursor.isNull(i27) ? null : Short.valueOf(cursor.getShort(i27));
        int i28 = i + 26;
        order2.refundDetail = cursor.isNull(i28) ? null : cursor.getString(i28);
        int i29 = i + 27;
        order2.lastModified = cursor.isNull(i29) ? null : Long.valueOf(cursor.getLong(i29));
        int i30 = i + 28;
        order2.flag = cursor.isNull(i30) ? null : Integer.valueOf(cursor.getInt(i30));
        int i31 = i + 29;
        order2.mobile = cursor.isNull(i31) ? null : cursor.getString(i31);
        int i32 = i + 30;
        order2.portionBook = cursor.isNull(i32) ? null : cursor.getString(i32);
        int i33 = i + 31;
        order2.hotelSKU = cursor.isNull(i33) ? null : cursor.getString(i33);
        int i34 = i + 32;
        order2.failText = cursor.isNull(i34) ? null : cursor.getString(i34);
        int i35 = i + 33;
        order2.riskRefund = cursor.isNull(i35) ? null : cursor.getString(i35);
        order2.afterSalesApply = cursor.getInt(i + 34);
        order2.payOverOneDay = cursor.getShort(i + 35) != 0;
        int i36 = i + 36;
        order2.moreinfo = cursor.isNull(i36) ? null : cursor.getString(i36);
        int i37 = i + 37;
        order2.showType = cursor.isNull(i37) ? null : cursor.getString(i37);
        int i38 = i + 38;
        order2.tour = cursor.isNull(i38) ? null : cursor.getString(i38);
        int i39 = i + 39;
        order2.collectionStatus = cursor.isNull(i39) ? null : Integer.valueOf(cursor.getInt(i39));
        int i40 = i + 40;
        order2.bigOrderId = cursor.isNull(i40) ? null : Long.valueOf(cursor.getLong(i40));
        int i41 = i + 41;
        order2.movie = cursor.isNull(i41) ? null : cursor.getString(i41);
        int i42 = i + 42;
        order2.reward = cursor.isNull(i42) ? null : cursor.getString(i42);
        int i43 = i + 43;
        order2.payType = cursor.isNull(i43) ? null : Integer.valueOf(cursor.getInt(i43));
        int i44 = i + 44;
        order2.buttonText = cursor.isNull(i44) ? null : cursor.getString(i44);
        int i45 = i + 45;
        order2.userid = cursor.isNull(i45) ? null : Long.valueOf(cursor.getLong(i45));
        int i46 = i + 46;
        order2.source = cursor.isNull(i46) ? null : Integer.valueOf(cursor.getInt(i46));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57f3dcd9a85e27ee2ca8d96cc50656d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57f3dcd9a85e27ee2ca8d96cc50656d9");
        }
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long updateKeyAfterInsert(Order order, long j) {
        Order order2 = order;
        Object[] objArr = {order2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "640a784a31453b14e4b7274fb7f19afa", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "640a784a31453b14e4b7274fb7f19afa");
        }
        order2.id = Long.valueOf(j);
        return Long.valueOf(j);
    }

    public OrderDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        Object[] objArr = {daoConfig, daoSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c0d8090913516943e207d44ae3d1b57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c0d8090913516943e207d44ae3d1b57");
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "db1ff9e36d17bf26706208b6035d7fc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "db1ff9e36d17bf26706208b6035d7fc1");
            return;
        }
        String str = z ? "IF NOT EXISTS " : "";
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "'myorder' ('ID' INTEGER PRIMARY KEY ,'IS_USED' INTEGER,'COUNT' INTEGER,'ORDER_GOODS' TEXT,'MODTIME' INTEGER,'DID' INTEGER,'CANCEL' INTEGER,'ORDERTIME' INTEGER,'TYPE' INTEGER,'PAYTIME' INTEGER,'IS_TIPPED' INTEGER,'AMOUNT' REAL,'FEEDBACK' TEXT,'COUPONS' TEXT,'CAN_REFUND' INTEGER,'CAN_CANCEL_REFUND' INTEGER,'DEAL' TEXT,'DELETE' INTEGER,'CAN_SET_USED' INTEGER,'DELIVERY' TEXT,'PROMOCODES' TEXT,'MMS' TEXT,'STATUS' INTEGER,'PAYMENT_STATUS' INTEGER,'REFUND_MSG' TEXT,'CREATE_TYPE' INTEGER,'REFUND_DETAIL' TEXT,'LAST_MODIFIED' INTEGER,'FLAG' INTEGER,'MOBILE' TEXT,'PORTION_BOOK' TEXT,'HOTEL_SKU' TEXT,'FAIL_TEXT' TEXT,'RISK_REFUND' TEXT,'AFTER_SALES_APPLY' INTEGER NOT NULL ,'PAY_OVER_ONE_DAY' INTEGER NOT NULL ,'MOREINFO' TEXT,'SHOW_TYPE' TEXT,'TOUR' TEXT,'COLLECTION_STATUS' INTEGER,'BIG_ORDER_ID' INTEGER,'MOVIE' TEXT,'REWARD' TEXT,'PAY_TYPE' INTEGER,'BUTTON_TEXT' TEXT,'USERID' INTEGER,'SOURCE' INTEGER);");
    }

    public static void b(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "461545c6b14b5025cb192d85826da12d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "461545c6b14b5025cb192d85826da12d");
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("'myorder'");
        sQLiteDatabase.execSQL(sb.toString());
    }
}
