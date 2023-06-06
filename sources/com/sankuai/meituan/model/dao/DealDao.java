package com.sankuai.meituan.model.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.support.v4.app.NotificationCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.MsgAddition;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DealDao extends AbstractDao<Deal, Long> {
    public static final String TABLENAME = "deal";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Properties {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final Property Id = new Property(0, Long.class, "id", true, "ID");
        public static final Property Slug = new Property(1, String.class, "slug", false, "SLUG");
        public static final Property Cate = new Property(2, String.class, "cate", false, "CATE");
        public static final Property Subcate = new Property(3, String.class, "subcate", false, "SUBCATE");
        public static final Property Dtype = new Property(4, Long.TYPE, "dtype", false, "DTYPE");
        public static final Property Dt = new Property(5, Long.class, MsgAddition.DT, false, "DT");
        public static final Property Ctype = new Property(6, Long.TYPE, "ctype", false, "CTYPE");
        public static final Property Mlls = new Property(7, String.class, "mlls", false, "MLLS");
        public static final Property Solds = new Property(8, Long.TYPE, "solds", false, "SOLDS");
        public static final Property Status = new Property(9, Integer.TYPE, "status", false, "STATUS");
        public static final Property Range = new Property(10, String.class, "range", false, "RANGE");
        public static final Property Start = new Property(11, Long.TYPE, "start", false, "START");
        public static final Property End = new Property(12, Long.TYPE, "end", false, "END");
        public static final Property Imgurl = new Property(13, String.class, "imgurl", false, "IMGURL");
        public static final Property Title = new Property(14, String.class, "title", false, "TITLE");
        public static final Property Price = new Property(15, Float.TYPE, "price", false, "PRICE");
        public static final Property Value = new Property(16, Float.TYPE, "value", false, "VALUE");
        public static final Property Mname = new Property(17, String.class, "mname", false, "MNAME");
        public static final Property Brandname = new Property(18, String.class, "brandname", false, "BRANDNAME");
        public static final Property Rating = new Property(19, Double.TYPE, "rating", false, "RATING");
        public static final Property Ratecount = new Property(20, Integer.TYPE, "ratecount", false, "RATECOUNT");
        public static final Property Satisfaction = new Property(21, Double.TYPE, "satisfaction", false, "SATISFACTION");
        public static final Property Mealcount = new Property(22, String.class, "mealcount", false, "MEALCOUNT");
        public static final Property Nobooking = new Property(23, Short.TYPE, "nobooking", false, "NOBOOKING");
        public static final Property Dealflag = new Property(24, String.class, "dealflag", false, "DEALFLAG");
        public static final Property Voice = new Property(25, String.class, "voice", false, "VOICE");
        public static final Property AttrJson = new Property(26, String.class, "attrJson", false, "ATTR_JSON");
        public static final Property Newrating = new Property(27, String.class, "newrating", false, "NEWRATING");
        public static final Property Tag = new Property(28, String.class, "tag", false, "TAG");
        public static final Property Squareimgurl = new Property(29, String.class, "squareimgurl", false, "SQUAREIMGURL");
        public static final Property Campaigns = new Property(30, String.class, "campaigns", false, "CAMPAIGNS");
        public static final Property Canbuyprice = new Property(31, Float.TYPE, "canbuyprice", false, "CANBUYPRICE");
        public static final Property Dist = new Property(32, Double.TYPE, "dist", false, "DIST");
        public static final Property State = new Property(33, Integer.TYPE, "state", false, "STATE");
        public static final Property Murl = new Property(34, String.class, "murl", false, "MURL");
        public static final Property Rdcount = new Property(35, Integer.TYPE, "rdcount", false, "RDCOUNT");
        public static final Property Terms = new Property(36, String.class, "terms", false, "TERMS");
        public static final Property Rdploc = new Property(37, String.class, "rdploc", false, "RDPLOC");
        public static final Property Todayavaliable = new Property(38, Boolean.TYPE, "todayavaliable", false, "TODAYAVALIABLE");
        public static final Property Bookinginfo = new Property(39, String.class, "bookinginfo", false, "BOOKINGINFO");
        public static final Property Refund = new Property(40, Integer.TYPE, "refund", false, "REFUND");
        public static final Property Fakerefund = new Property(41, Integer.TYPE, "fakerefund", false, "FAKEREFUND");
        public static final Property Expireautorefund = new Property(42, Integer.TYPE, "expireautorefund", false, "EXPIREAUTOREFUND");
        public static final Property Announcementtitle = new Property(43, String.class, "announcementtitle", false, "ANNOUNCEMENTTITLE");
        public static final Property Coupontitle = new Property(44, String.class, "coupontitle", false, "COUPONTITLE");
        public static final Property Smstitle = new Property(45, String.class, "smstitle", false, "SMSTITLE");
        public static final Property Menu = new Property(46, String.class, "menu", false, "MENU");
        public static final Property LastModified = new Property(47, Long.TYPE, "lastModified", false, "LAST_MODIFIED");
        public static final Property Flag = new Property(48, Integer.TYPE, "flag", false, "FLAG");
        public static final Property Howuse = new Property(49, String.class, "howuse", false, "HOWUSE");
        public static final Property Sevenrefund = new Property(50, Integer.TYPE, "sevenrefund", false, "SEVENREFUND");
        public static final Property Ktvplan = new Property(51, String.class, "ktvplan", false, "KTVPLAN");
        public static final Property Bookingphone = new Property(52, String.class, "bookingphone", false, "BOOKINGPHONE");
        public static final Property HotelExt = new Property(53, String.class, "hotelExt", false, "HOTEL_EXT");
        public static final Property IsHourRoom = new Property(54, Boolean.TYPE, "isHourRoom", false, "IS_HOUR_ROOM");
        public static final Property IsSupportAppointment = new Property(55, Boolean.TYPE, "isSupportAppointment", false, "IS_SUPPORT_APPOINTMENT");
        public static final Property Pricecalendar = new Property(56, String.class, "pricecalendar", false, "PRICECALENDAR");
        public static final Property Campaignprice = new Property(57, Float.TYPE, "campaignprice", false, "CAMPAIGNPRICE");
        public static final Property Recreason = new Property(58, String.class, "recreason", false, "RECREASON");
        public static final Property Showtype = new Property(59, String.class, "showtype", false, "SHOWTYPE");
        public static final Property Deposit = new Property(60, Float.class, "deposit", false, "DEPOSIT");
        public static final Property Securityinfo = new Property(61, String.class, "securityinfo", false, "SECURITYINFO");
        public static final Property Optionalattrs = new Property(62, String.class, "optionalattrs", false, "OPTIONALATTRS");
        public static final Property Couponbegintime = new Property(63, Long.TYPE, "couponbegintime", false, "COUPONBEGINTIME");
        public static final Property Couponendtime = new Property(64, Long.TYPE, "couponendtime", false, "COUPONENDTIME");
        public static final Property Hotelroomname = new Property(65, String.class, "hotelroomname", false, "HOTELROOMNAME");
        public static final Property Digestion = new Property(66, String.class, "digestion", false, "DIGESTION");
        public static final Property Salestag = new Property(67, String.class, "salestag", false, "SALESTAG");
        public static final Property AvgPrice = new Property(68, Float.TYPE, "avgPrice", false, "AVG_PRICE");
        public static final Property Channel = new Property(69, String.class, "channel", false, "CHANNEL");
        public static final Property Curcityrdcount = new Property(70, Integer.TYPE, "curcityrdcount", false, "CURCITYRDCOUNT");
        public static final Property IUrl = new Property(71, String.class, "iUrl", false, "I_URL");
        public static final Property RoomStatus = new Property(72, Integer.TYPE, "roomStatus", false, "ROOM_STATUS");
        public static final Property NewPromotion = new Property(73, Integer.TYPE, "newPromotion", false, "NEW_PROMOTION");
        public static final Property Pitchhtml = new Property(74, String.class, "pitchhtml", false, "PITCHHTML");
        public static final Property Recommendation = new Property(75, String.class, NotificationCompat.CATEGORY_RECOMMENDATION, false, "RECOMMENDATION");
        public static final Property Pois = new Property(76, String.class, "pois", false, "POIS");
        public static final Property Destination = new Property(77, String.class, "destination", false, "DESTINATION");
        public static final Property PackageShow = new Property(78, Integer.TYPE, "packageShow", false, "PACKAGE_SHOW");
        public static final Property Packages = new Property(79, String.class, "packages", false, "PACKAGES");
        public static final Property Soldoutstatus = new Property(80, Integer.TYPE, "soldoutstatus", false, "SOLDOUTSTATUS");
        public static final Property AvailContactStartTime = new Property(81, String.class, "availContactStartTime", false, "AVAIL_CONTACT_START_TIME");
        public static final Property AvailContactEndTime = new Property(82, String.class, "availContactEndTime", false, "AVAIL_CONTACT_END_TIME");
        public static final Property Shike = new Property(83, String.class, "shike", false, "SHIKE");
    }

    @Override // de.greenrobot.dao.AbstractDao
    public boolean isEntityUpdateable() {
        return true;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void bindValues(SQLiteStatement sQLiteStatement, Deal deal) {
        Deal deal2 = deal;
        Object[] objArr = {sQLiteStatement, deal2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "321b9b06b9d93b14ad27a908f9ee1a0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "321b9b06b9d93b14ad27a908f9ee1a0a");
            return;
        }
        sQLiteStatement.clearBindings();
        Long l = deal2.id;
        if (l != null) {
            sQLiteStatement.bindLong(1, l.longValue());
        }
        String str = deal2.slug;
        if (str != null) {
            sQLiteStatement.bindString(2, str);
        }
        String str2 = deal2.cate;
        if (str2 != null) {
            sQLiteStatement.bindString(3, str2);
        }
        String str3 = deal2.subcate;
        if (str3 != null) {
            sQLiteStatement.bindString(4, str3);
        }
        sQLiteStatement.bindLong(5, deal2.dtype);
        Long l2 = deal2.dt;
        if (l2 != null) {
            sQLiteStatement.bindLong(6, l2.longValue());
        }
        sQLiteStatement.bindLong(7, deal2.ctype);
        String str4 = deal2.mlls;
        if (str4 != null) {
            sQLiteStatement.bindString(8, str4);
        }
        sQLiteStatement.bindLong(9, deal2.solds);
        sQLiteStatement.bindLong(10, deal2.status);
        String str5 = deal2.range;
        if (str5 != null) {
            sQLiteStatement.bindString(11, str5);
        }
        sQLiteStatement.bindLong(12, deal2.start);
        sQLiteStatement.bindLong(13, deal2.end);
        String str6 = deal2.imgurl;
        if (str6 != null) {
            sQLiteStatement.bindString(14, str6);
        }
        String str7 = deal2.title;
        if (str7 != null) {
            sQLiteStatement.bindString(15, str7);
        }
        sQLiteStatement.bindDouble(16, deal2.price);
        sQLiteStatement.bindDouble(17, deal2.value);
        String str8 = deal2.mname;
        if (str8 != null) {
            sQLiteStatement.bindString(18, str8);
        }
        String str9 = deal2.brandname;
        if (str9 != null) {
            sQLiteStatement.bindString(19, str9);
        }
        sQLiteStatement.bindDouble(20, deal2.rating);
        sQLiteStatement.bindLong(21, deal2.ratecount);
        sQLiteStatement.bindDouble(22, deal2.satisfaction);
        String str10 = deal2.mealcount;
        if (str10 != null) {
            sQLiteStatement.bindString(23, str10);
        }
        sQLiteStatement.bindLong(24, deal2.nobooking);
        String str11 = deal2.dealflag;
        if (str11 != null) {
            sQLiteStatement.bindString(25, str11);
        }
        String str12 = deal2.voice;
        if (str12 != null) {
            sQLiteStatement.bindString(26, str12);
        }
        String str13 = deal2.attrJson;
        if (str13 != null) {
            sQLiteStatement.bindString(27, str13);
        }
        String str14 = deal2.newrating;
        if (str14 != null) {
            sQLiteStatement.bindString(28, str14);
        }
        String str15 = deal2.tag;
        if (str15 != null) {
            sQLiteStatement.bindString(29, str15);
        }
        String str16 = deal2.squareimgurl;
        if (str16 != null) {
            sQLiteStatement.bindString(30, str16);
        }
        String str17 = deal2.campaigns;
        if (str17 != null) {
            sQLiteStatement.bindString(31, str17);
        }
        sQLiteStatement.bindDouble(32, deal2.canbuyprice);
        sQLiteStatement.bindDouble(33, deal2.dist);
        sQLiteStatement.bindLong(34, deal2.state);
        String str18 = deal2.murl;
        if (str18 != null) {
            sQLiteStatement.bindString(35, str18);
        }
        sQLiteStatement.bindLong(36, deal2.rdcount);
        String str19 = deal2.terms;
        if (str19 != null) {
            sQLiteStatement.bindString(37, str19);
        }
        String str20 = deal2.rdploc;
        if (str20 != null) {
            sQLiteStatement.bindString(38, str20);
        }
        sQLiteStatement.bindLong(39, deal2.todayavaliable ? 1L : 0L);
        String str21 = deal2.bookinginfo;
        if (str21 != null) {
            sQLiteStatement.bindString(40, str21);
        }
        sQLiteStatement.bindLong(41, deal2.refund);
        sQLiteStatement.bindLong(42, deal2.fakerefund);
        sQLiteStatement.bindLong(43, deal2.expireautorefund);
        String str22 = deal2.announcementtitle;
        if (str22 != null) {
            sQLiteStatement.bindString(44, str22);
        }
        String str23 = deal2.coupontitle;
        if (str23 != null) {
            sQLiteStatement.bindString(45, str23);
        }
        String str24 = deal2.smstitle;
        if (str24 != null) {
            sQLiteStatement.bindString(46, str24);
        }
        String str25 = deal2.menu;
        if (str25 != null) {
            sQLiteStatement.bindString(47, str25);
        }
        sQLiteStatement.bindLong(48, deal2.lastModified);
        sQLiteStatement.bindLong(49, deal2.flag);
        String str26 = deal2.howuse;
        if (str26 != null) {
            sQLiteStatement.bindString(50, str26);
        }
        sQLiteStatement.bindLong(51, deal2.sevenrefund);
        String str27 = deal2.ktvplan;
        if (str27 != null) {
            sQLiteStatement.bindString(52, str27);
        }
        String str28 = deal2.bookingphone;
        if (str28 != null) {
            sQLiteStatement.bindString(53, str28);
        }
        String str29 = deal2.hotelExt;
        if (str29 != null) {
            sQLiteStatement.bindString(54, str29);
        }
        sQLiteStatement.bindLong(55, deal2.isHourRoom ? 1L : 0L);
        sQLiteStatement.bindLong(56, deal2.isSupportAppointment ? 1L : 0L);
        String str30 = deal2.pricecalendar;
        if (str30 != null) {
            sQLiteStatement.bindString(57, str30);
        }
        sQLiteStatement.bindDouble(58, deal2.campaignprice);
        String str31 = deal2.recreason;
        if (str31 != null) {
            sQLiteStatement.bindString(59, str31);
        }
        String str32 = deal2.showtype;
        if (str32 != null) {
            sQLiteStatement.bindString(60, str32);
        }
        Float f = deal2.deposit;
        if (f != null) {
            sQLiteStatement.bindDouble(61, f.floatValue());
        }
        String str33 = deal2.securityinfo;
        if (str33 != null) {
            sQLiteStatement.bindString(62, str33);
        }
        String str34 = deal2.optionalattrs;
        if (str34 != null) {
            sQLiteStatement.bindString(63, str34);
        }
        sQLiteStatement.bindLong(64, deal2.couponbegintime);
        sQLiteStatement.bindLong(65, deal2.couponendtime);
        String str35 = deal2.hotelroomname;
        if (str35 != null) {
            sQLiteStatement.bindString(66, str35);
        }
        String str36 = deal2.digestion;
        if (str36 != null) {
            sQLiteStatement.bindString(67, str36);
        }
        String str37 = deal2.salestag;
        if (str37 != null) {
            sQLiteStatement.bindString(68, str37);
        }
        sQLiteStatement.bindDouble(69, deal2.avgPrice);
        String str38 = deal2.channel;
        if (str38 != null) {
            sQLiteStatement.bindString(70, str38);
        }
        sQLiteStatement.bindLong(71, deal2.curcityrdcount);
        String str39 = deal2.iUrl;
        if (str39 != null) {
            sQLiteStatement.bindString(72, str39);
        }
        sQLiteStatement.bindLong(73, deal2.roomStatus);
        sQLiteStatement.bindLong(74, deal2.newPromotion);
        String str40 = deal2.pitchhtml;
        if (str40 != null) {
            sQLiteStatement.bindString(75, str40);
        }
        String str41 = deal2.recommendation;
        if (str41 != null) {
            sQLiteStatement.bindString(76, str41);
        }
        String str42 = deal2.pois;
        if (str42 != null) {
            sQLiteStatement.bindString(77, str42);
        }
        String str43 = deal2.destination;
        if (str43 != null) {
            sQLiteStatement.bindString(78, str43);
        }
        sQLiteStatement.bindLong(79, deal2.packageShow);
        String str44 = deal2.packages;
        if (str44 != null) {
            sQLiteStatement.bindString(80, str44);
        }
        sQLiteStatement.bindLong(81, deal2.soldoutstatus);
        String str45 = deal2.availContactStartTime;
        if (str45 != null) {
            sQLiteStatement.bindString(82, str45);
        }
        String str46 = deal2.availContactEndTime;
        if (str46 != null) {
            sQLiteStatement.bindString(83, str46);
        }
        String str47 = deal2.shike;
        if (str47 != null) {
            sQLiteStatement.bindString(84, str47);
        }
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long getKey(Deal deal) {
        Deal deal2 = deal;
        Object[] objArr = {deal2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2443f48b9c2c2ff57a7f6c96bdb230a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2443f48b9c2c2ff57a7f6c96bdb230a7");
        }
        if (deal2 != null) {
            return deal2.id;
        }
        return null;
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Deal readEntity(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12d8e98a7c5889a5f90ea8eacf91ddb7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Deal) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12d8e98a7c5889a5f90ea8eacf91ddb7");
        }
        int i2 = i + 0;
        Long valueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        String string3 = cursor.isNull(i5) ? null : cursor.getString(i5);
        long j = cursor.getLong(i + 4);
        int i6 = i + 5;
        Long valueOf2 = cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6));
        long j2 = cursor.getLong(i + 6);
        int i7 = i + 7;
        String string4 = cursor.isNull(i7) ? null : cursor.getString(i7);
        long j3 = cursor.getLong(i + 8);
        int i8 = cursor.getInt(i + 9);
        int i9 = i + 10;
        String string5 = cursor.isNull(i9) ? null : cursor.getString(i9);
        long j4 = cursor.getLong(i + 11);
        long j5 = cursor.getLong(i + 12);
        int i10 = i + 13;
        String string6 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i + 14;
        String string7 = cursor.isNull(i11) ? null : cursor.getString(i11);
        float f = cursor.getFloat(i + 15);
        float f2 = cursor.getFloat(i + 16);
        int i12 = i + 17;
        String string8 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i + 18;
        String string9 = cursor.isNull(i13) ? null : cursor.getString(i13);
        double d = cursor.getDouble(i + 19);
        int i14 = cursor.getInt(i + 20);
        double d2 = cursor.getDouble(i + 21);
        int i15 = i + 22;
        String string10 = cursor.isNull(i15) ? null : cursor.getString(i15);
        short s = cursor.getShort(i + 23);
        int i16 = i + 24;
        String string11 = cursor.isNull(i16) ? null : cursor.getString(i16);
        int i17 = i + 25;
        String string12 = cursor.isNull(i17) ? null : cursor.getString(i17);
        int i18 = i + 26;
        String string13 = cursor.isNull(i18) ? null : cursor.getString(i18);
        int i19 = i + 27;
        String string14 = cursor.isNull(i19) ? null : cursor.getString(i19);
        int i20 = i + 28;
        String string15 = cursor.isNull(i20) ? null : cursor.getString(i20);
        int i21 = i + 29;
        String string16 = cursor.isNull(i21) ? null : cursor.getString(i21);
        int i22 = i + 30;
        String string17 = cursor.isNull(i22) ? null : cursor.getString(i22);
        float f3 = cursor.getFloat(i + 31);
        double d3 = cursor.getDouble(i + 32);
        int i23 = cursor.getInt(i + 33);
        int i24 = i + 34;
        String string18 = cursor.isNull(i24) ? null : cursor.getString(i24);
        int i25 = cursor.getInt(i + 35);
        int i26 = i + 36;
        String string19 = cursor.isNull(i26) ? null : cursor.getString(i26);
        int i27 = i + 37;
        String string20 = cursor.isNull(i27) ? null : cursor.getString(i27);
        boolean z = cursor.getShort(i + 38) != 0;
        int i28 = i + 39;
        String string21 = cursor.isNull(i28) ? null : cursor.getString(i28);
        int i29 = cursor.getInt(i + 40);
        int i30 = cursor.getInt(i + 41);
        int i31 = cursor.getInt(i + 42);
        int i32 = i + 43;
        String string22 = cursor.isNull(i32) ? null : cursor.getString(i32);
        int i33 = i + 44;
        String string23 = cursor.isNull(i33) ? null : cursor.getString(i33);
        int i34 = i + 45;
        String string24 = cursor.isNull(i34) ? null : cursor.getString(i34);
        int i35 = i + 46;
        String string25 = cursor.isNull(i35) ? null : cursor.getString(i35);
        long j6 = cursor.getLong(i + 47);
        int i36 = cursor.getInt(i + 48);
        int i37 = i + 49;
        String string26 = cursor.isNull(i37) ? null : cursor.getString(i37);
        int i38 = cursor.getInt(i + 50);
        int i39 = i + 51;
        String string27 = cursor.isNull(i39) ? null : cursor.getString(i39);
        int i40 = i + 52;
        String string28 = cursor.isNull(i40) ? null : cursor.getString(i40);
        int i41 = i + 53;
        String string29 = cursor.isNull(i41) ? null : cursor.getString(i41);
        boolean z2 = cursor.getShort(i + 54) != 0;
        boolean z3 = cursor.getShort(i + 55) != 0;
        int i42 = i + 56;
        String string30 = cursor.isNull(i42) ? null : cursor.getString(i42);
        float f4 = cursor.getFloat(i + 57);
        int i43 = i + 58;
        String string31 = cursor.isNull(i43) ? null : cursor.getString(i43);
        int i44 = i + 59;
        String string32 = cursor.isNull(i44) ? null : cursor.getString(i44);
        int i45 = i + 60;
        Float valueOf3 = cursor.isNull(i45) ? null : Float.valueOf(cursor.getFloat(i45));
        int i46 = i + 61;
        String string33 = cursor.isNull(i46) ? null : cursor.getString(i46);
        int i47 = i + 62;
        String string34 = cursor.isNull(i47) ? null : cursor.getString(i47);
        long j7 = cursor.getLong(i + 63);
        long j8 = cursor.getLong(i + 64);
        int i48 = i + 65;
        String string35 = cursor.isNull(i48) ? null : cursor.getString(i48);
        int i49 = i + 66;
        String string36 = cursor.isNull(i49) ? null : cursor.getString(i49);
        int i50 = i + 67;
        String string37 = cursor.isNull(i50) ? null : cursor.getString(i50);
        float f5 = cursor.getFloat(i + 68);
        int i51 = i + 69;
        String string38 = cursor.isNull(i51) ? null : cursor.getString(i51);
        int i52 = cursor.getInt(i + 70);
        int i53 = i + 71;
        String string39 = cursor.isNull(i53) ? null : cursor.getString(i53);
        int i54 = cursor.getInt(i + 72);
        int i55 = cursor.getInt(i + 73);
        int i56 = i + 74;
        String string40 = cursor.isNull(i56) ? null : cursor.getString(i56);
        int i57 = i + 75;
        String string41 = cursor.isNull(i57) ? null : cursor.getString(i57);
        int i58 = i + 76;
        String string42 = cursor.isNull(i58) ? null : cursor.getString(i58);
        int i59 = i + 77;
        String string43 = cursor.isNull(i59) ? null : cursor.getString(i59);
        int i60 = cursor.getInt(i + 78);
        int i61 = i + 79;
        String string44 = cursor.isNull(i61) ? null : cursor.getString(i61);
        int i62 = cursor.getInt(i + 80);
        int i63 = i + 81;
        String string45 = cursor.isNull(i63) ? null : cursor.getString(i63);
        int i64 = i + 82;
        int i65 = i + 83;
        return new Deal(valueOf, string, string2, string3, j, valueOf2, j2, string4, j3, i8, string5, j4, j5, string6, string7, f, f2, string8, string9, d, i14, d2, string10, s, string11, string12, string13, string14, string15, string16, string17, f3, d3, i23, string18, i25, string19, string20, z, string21, i29, i30, i31, string22, string23, string24, string25, j6, i36, string26, i38, string27, string28, string29, z2, z3, string30, f4, string31, string32, valueOf3, string33, string34, j7, j8, string35, string36, string37, f5, string38, i52, string39, i54, i55, string40, string41, string42, string43, i60, string44, i62, string45, cursor.isNull(i64) ? null : cursor.getString(i64), cursor.isNull(i65) ? null : cursor.getString(i65));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ void readEntity(Cursor cursor, Deal deal, int i) {
        char c;
        Deal deal2 = deal;
        Object[] objArr = {cursor, deal2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c065ab1adb59888b481fe5e3eb5e52fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c065ab1adb59888b481fe5e3eb5e52fc");
            return;
        }
        int i2 = i + 0;
        deal2.id = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        deal2.slug = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        deal2.cate = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        deal2.subcate = cursor.isNull(i5) ? null : cursor.getString(i5);
        long j = cursor.getLong(i + 4);
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect3 = Deal.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, deal2, changeQuickRedirect3, false, "0bb6c66e2e7fc23c0a58ec875916ea44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, deal2, changeQuickRedirect3, false, "0bb6c66e2e7fc23c0a58ec875916ea44");
        } else {
            deal2.dtype = j;
        }
        int i6 = i + 5;
        deal2.dt = cursor.isNull(i6) ? null : Long.valueOf(cursor.getLong(i6));
        long j2 = cursor.getLong(i + 6);
        Object[] objArr3 = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect4 = Deal.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr3, deal2, changeQuickRedirect4, false, "aa58fb11c86d858d77c2298df4bff8ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, deal2, changeQuickRedirect4, false, "aa58fb11c86d858d77c2298df4bff8ab");
        } else {
            deal2.ctype = j2;
        }
        int i7 = i + 7;
        deal2.mlls = cursor.isNull(i7) ? null : cursor.getString(i7);
        long j3 = cursor.getLong(i + 8);
        Object[] objArr4 = {new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect5 = Deal.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr4, deal2, changeQuickRedirect5, false, "5d72c4a5e64cf901b9a94c60511d8724", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, deal2, changeQuickRedirect5, false, "5d72c4a5e64cf901b9a94c60511d8724");
        } else {
            deal2.solds = j3;
        }
        deal2.status = cursor.getInt(i + 9);
        int i8 = i + 10;
        deal2.range = cursor.isNull(i8) ? null : cursor.getString(i8);
        deal2.a(cursor.getLong(i + 11));
        deal2.b(cursor.getLong(i + 12));
        int i9 = i + 13;
        deal2.imgurl = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 14;
        deal2.title = cursor.isNull(i10) ? null : cursor.getString(i10);
        deal2.price = cursor.getFloat(i + 15);
        deal2.value = cursor.getFloat(i + 16);
        int i11 = i + 17;
        deal2.mname = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i + 18;
        deal2.brandname = cursor.isNull(i12) ? null : cursor.getString(i12);
        double d = cursor.getDouble(i + 19);
        Object[] objArr5 = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect6 = Deal.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr5, deal2, changeQuickRedirect6, false, "95ba09182cdc7faee0b7f1c970af3af7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, deal2, changeQuickRedirect6, false, "95ba09182cdc7faee0b7f1c970af3af7");
        } else {
            deal2.rating = d;
        }
        deal2.ratecount = cursor.getInt(i + 20);
        double d2 = cursor.getDouble(i + 21);
        Object[] objArr6 = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect7 = Deal.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr6, deal2, changeQuickRedirect7, false, "bfca02681b619d361104d16f784741b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, deal2, changeQuickRedirect7, false, "bfca02681b619d361104d16f784741b0");
        } else {
            deal2.satisfaction = d2;
        }
        int i13 = i + 22;
        deal2.mealcount = cursor.isNull(i13) ? null : cursor.getString(i13);
        deal2.nobooking = cursor.getShort(i + 23);
        int i14 = i + 24;
        deal2.dealflag = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 25;
        deal2.voice = cursor.isNull(i15) ? null : cursor.getString(i15);
        int i16 = i + 26;
        deal2.attrJson = cursor.isNull(i16) ? null : cursor.getString(i16);
        int i17 = i + 27;
        deal2.newrating = cursor.isNull(i17) ? null : cursor.getString(i17);
        int i18 = i + 28;
        deal2.tag = cursor.isNull(i18) ? null : cursor.getString(i18);
        int i19 = i + 29;
        deal2.squareimgurl = cursor.isNull(i19) ? null : cursor.getString(i19);
        int i20 = i + 30;
        deal2.campaigns = cursor.isNull(i20) ? null : cursor.getString(i20);
        deal2.canbuyprice = cursor.getFloat(i + 31);
        double d3 = cursor.getDouble(i + 32);
        Object[] objArr7 = {Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect8 = Deal.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr7, deal2, changeQuickRedirect8, false, "8b02d03635ebf63d949f8b131f6f5a00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, deal2, changeQuickRedirect8, false, "8b02d03635ebf63d949f8b131f6f5a00");
        } else {
            deal2.dist = d3;
        }
        deal2.state = cursor.getInt(i + 33);
        int i21 = i + 34;
        deal2.murl = cursor.isNull(i21) ? null : cursor.getString(i21);
        deal2.rdcount = cursor.getInt(i + 35);
        int i22 = i + 36;
        deal2.terms = cursor.isNull(i22) ? null : cursor.getString(i22);
        int i23 = i + 37;
        deal2.rdploc = cursor.isNull(i23) ? null : cursor.getString(i23);
        deal2.todayavaliable = cursor.getShort(i + 38) != 0;
        int i24 = i + 39;
        deal2.bookinginfo = cursor.isNull(i24) ? null : cursor.getString(i24);
        deal2.refund = cursor.getInt(i + 40);
        deal2.fakerefund = cursor.getInt(i + 41);
        deal2.expireautorefund = cursor.getInt(i + 42);
        int i25 = i + 43;
        deal2.announcementtitle = cursor.isNull(i25) ? null : cursor.getString(i25);
        int i26 = i + 44;
        deal2.coupontitle = cursor.isNull(i26) ? null : cursor.getString(i26);
        int i27 = i + 45;
        deal2.smstitle = cursor.isNull(i27) ? null : cursor.getString(i27);
        int i28 = i + 46;
        deal2.menu = cursor.isNull(i28) ? null : cursor.getString(i28);
        long j4 = cursor.getLong(i + 47);
        Object[] objArr8 = {new Long(j4)};
        ChangeQuickRedirect changeQuickRedirect9 = Deal.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr8, deal2, changeQuickRedirect9, false, "fe528704abb9df0e8f909ef6b7a8b08f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, deal2, changeQuickRedirect9, false, "fe528704abb9df0e8f909ef6b7a8b08f");
        } else {
            deal2.lastModified = j4;
        }
        deal2.flag = cursor.getInt(i + 48);
        int i29 = i + 49;
        deal2.howuse = cursor.isNull(i29) ? null : cursor.getString(i29);
        deal2.sevenrefund = cursor.getInt(i + 50);
        int i30 = i + 51;
        deal2.ktvplan = cursor.isNull(i30) ? null : cursor.getString(i30);
        int i31 = i + 52;
        deal2.bookingphone = cursor.isNull(i31) ? null : cursor.getString(i31);
        int i32 = i + 53;
        deal2.hotelExt = cursor.isNull(i32) ? null : cursor.getString(i32);
        deal2.isHourRoom = cursor.getShort(i + 54) != 0;
        deal2.isSupportAppointment = cursor.getShort(i + 55) != 0;
        int i33 = i + 56;
        deal2.pricecalendar = cursor.isNull(i33) ? null : cursor.getString(i33);
        deal2.campaignprice = cursor.getFloat(i + 57);
        int i34 = i + 58;
        deal2.recreason = cursor.isNull(i34) ? null : cursor.getString(i34);
        int i35 = i + 59;
        deal2.showtype = cursor.isNull(i35) ? null : cursor.getString(i35);
        int i36 = i + 60;
        deal2.deposit = cursor.isNull(i36) ? null : Float.valueOf(cursor.getFloat(i36));
        int i37 = i + 61;
        deal2.securityinfo = cursor.isNull(i37) ? null : cursor.getString(i37);
        int i38 = i + 62;
        deal2.optionalattrs = cursor.isNull(i38) ? null : cursor.getString(i38);
        long j5 = cursor.getLong(i + 63);
        Object[] objArr9 = {new Long(j5)};
        ChangeQuickRedirect changeQuickRedirect10 = Deal.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr9, deal2, changeQuickRedirect10, false, "8fac6b3f0eff5ff9330976442c7819fc", RobustBitConfig.DEFAULT_VALUE)) {
            c = 0;
            PatchProxy.accessDispatch(objArr9, deal2, changeQuickRedirect10, false, "8fac6b3f0eff5ff9330976442c7819fc");
        } else {
            c = 0;
            deal2.couponbegintime = j5;
        }
        long j6 = cursor.getLong(i + 64);
        Object[] objArr10 = new Object[1];
        objArr10[c] = new Long(j6);
        ChangeQuickRedirect changeQuickRedirect11 = Deal.changeQuickRedirect;
        if (PatchProxy.isSupport(objArr10, deal2, changeQuickRedirect11, false, "d62134b54fc7610bfa83e39a4c3426d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr10, deal2, changeQuickRedirect11, false, "d62134b54fc7610bfa83e39a4c3426d5");
        } else {
            deal2.couponendtime = j6;
        }
        int i39 = i + 65;
        deal2.hotelroomname = cursor.isNull(i39) ? null : cursor.getString(i39);
        int i40 = i + 66;
        deal2.digestion = cursor.isNull(i40) ? null : cursor.getString(i40);
        int i41 = i + 67;
        deal2.salestag = cursor.isNull(i41) ? null : cursor.getString(i41);
        deal2.avgPrice = cursor.getFloat(i + 68);
        int i42 = i + 69;
        deal2.channel = cursor.isNull(i42) ? null : cursor.getString(i42);
        deal2.curcityrdcount = cursor.getInt(i + 70);
        int i43 = i + 71;
        deal2.iUrl = cursor.isNull(i43) ? null : cursor.getString(i43);
        deal2.roomStatus = cursor.getInt(i + 72);
        deal2.newPromotion = cursor.getInt(i + 73);
        int i44 = i + 74;
        deal2.pitchhtml = cursor.isNull(i44) ? null : cursor.getString(i44);
        int i45 = i + 75;
        deal2.recommendation = cursor.isNull(i45) ? null : cursor.getString(i45);
        int i46 = i + 76;
        deal2.pois = cursor.isNull(i46) ? null : cursor.getString(i46);
        int i47 = i + 77;
        deal2.destination = cursor.isNull(i47) ? null : cursor.getString(i47);
        deal2.packageShow = cursor.getInt(i + 78);
        int i48 = i + 79;
        deal2.packages = cursor.isNull(i48) ? null : cursor.getString(i48);
        deal2.soldoutstatus = cursor.getInt(i + 80);
        int i49 = i + 81;
        deal2.availContactStartTime = cursor.isNull(i49) ? null : cursor.getString(i49);
        int i50 = i + 82;
        deal2.availContactEndTime = cursor.isNull(i50) ? null : cursor.getString(i50);
        int i51 = i + 83;
        deal2.shike = cursor.isNull(i51) ? null : cursor.getString(i51);
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long readKey(Cursor cursor, int i) {
        Object[] objArr = {cursor, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bbb7e78e8673d0f6567d1e7133cd091", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bbb7e78e8673d0f6567d1e7133cd091");
        }
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // de.greenrobot.dao.AbstractDao
    public /* synthetic */ Long updateKeyAfterInsert(Deal deal, long j) {
        Deal deal2 = deal;
        Object[] objArr = {deal2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eafdbf3f76f5eba24d45e49f8e9c0c5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eafdbf3f76f5eba24d45e49f8e9c0c5c");
        }
        deal2.id = Long.valueOf(j);
        return Long.valueOf(j);
    }

    public DealDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
        Object[] objArr = {daoConfig, daoSession};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9842f31ed55b7934a5ef7b147670eacd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9842f31ed55b7934a5ef7b147670eacd");
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "674b43da6077f0f46ee88e305b00934d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "674b43da6077f0f46ee88e305b00934d");
            return;
        }
        String str = z ? "IF NOT EXISTS " : "";
        sQLiteDatabase.execSQL("CREATE TABLE " + str + "'deal' ('ID' INTEGER PRIMARY KEY ,'SLUG' TEXT,'CATE' TEXT,'SUBCATE' TEXT,'DTYPE' INTEGER NOT NULL ,'DT' INTEGER,'CTYPE' INTEGER NOT NULL ,'MLLS' TEXT,'SOLDS' INTEGER NOT NULL ,'STATUS' INTEGER NOT NULL ,'RANGE' TEXT,'START' INTEGER NOT NULL ,'END' INTEGER NOT NULL ,'IMGURL' TEXT,'TITLE' TEXT,'PRICE' REAL NOT NULL ,'VALUE' REAL NOT NULL ,'MNAME' TEXT,'BRANDNAME' TEXT,'RATING' REAL NOT NULL ,'RATECOUNT' INTEGER NOT NULL ,'SATISFACTION' REAL NOT NULL ,'MEALCOUNT' TEXT,'NOBOOKING' INTEGER NOT NULL ,'DEALFLAG' TEXT,'VOICE' TEXT,'ATTR_JSON' TEXT,'NEWRATING' TEXT,'TAG' TEXT,'SQUAREIMGURL' TEXT,'CAMPAIGNS' TEXT,'CANBUYPRICE' REAL NOT NULL ,'DIST' REAL NOT NULL ,'STATE' INTEGER NOT NULL ,'MURL' TEXT,'RDCOUNT' INTEGER NOT NULL ,'TERMS' TEXT,'RDPLOC' TEXT,'TODAYAVALIABLE' INTEGER NOT NULL ,'BOOKINGINFO' TEXT,'REFUND' INTEGER NOT NULL ,'FAKEREFUND' INTEGER NOT NULL ,'EXPIREAUTOREFUND' INTEGER NOT NULL ,'ANNOUNCEMENTTITLE' TEXT,'COUPONTITLE' TEXT,'SMSTITLE' TEXT,'MENU' TEXT,'LAST_MODIFIED' INTEGER NOT NULL ,'FLAG' INTEGER NOT NULL ,'HOWUSE' TEXT,'SEVENREFUND' INTEGER NOT NULL ,'KTVPLAN' TEXT,'BOOKINGPHONE' TEXT,'HOTEL_EXT' TEXT,'IS_HOUR_ROOM' INTEGER NOT NULL ,'IS_SUPPORT_APPOINTMENT' INTEGER NOT NULL ,'PRICECALENDAR' TEXT,'CAMPAIGNPRICE' REAL NOT NULL ,'RECREASON' TEXT,'SHOWTYPE' TEXT,'DEPOSIT' REAL,'SECURITYINFO' TEXT,'OPTIONALATTRS' TEXT,'COUPONBEGINTIME' INTEGER NOT NULL ,'COUPONENDTIME' INTEGER NOT NULL ,'HOTELROOMNAME' TEXT,'DIGESTION' TEXT,'SALESTAG' TEXT,'AVG_PRICE' REAL NOT NULL ,'CHANNEL' TEXT,'CURCITYRDCOUNT' INTEGER NOT NULL ,'I_URL' TEXT,'ROOM_STATUS' INTEGER NOT NULL ,'NEW_PROMOTION' INTEGER NOT NULL ,'PITCHHTML' TEXT,'RECOMMENDATION' TEXT,'POIS' TEXT,'DESTINATION' TEXT,'PACKAGE_SHOW' INTEGER NOT NULL ,'PACKAGES' TEXT,'SOLDOUTSTATUS' INTEGER NOT NULL ,'AVAIL_CONTACT_START_TIME' TEXT,'AVAIL_CONTACT_END_TIME' TEXT,'SHIKE' TEXT);");
    }

    public static void b(SQLiteDatabase sQLiteDatabase, boolean z) {
        Object[] objArr = {sQLiteDatabase, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b52c6f6a9560f4cec2e99686f83d5ab9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b52c6f6a9560f4cec2e99686f83d5ab9");
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("'deal'");
        sQLiteDatabase.execSQL(sb.toString());
    }
}
