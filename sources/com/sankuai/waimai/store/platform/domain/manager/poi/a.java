package com.sankuai.waimai.store.platform.domain.manager.poi;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.drug.MEDQualityMonitorReporter;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.platform.domain.core.poi.AppendPoiImInfo;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCart;
import com.sankuai.waimai.store.platform.domain.core.shopcart.b;
import com.sankuai.waimai.store.platform.shop.model.CouponPoiCardInfo;
import com.sankuai.waimai.store.platform.shop.model.PriceOptAB;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements Serializable {
    public static ChangeQuickRedirect a;
    public Poi b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public Runnable i;
    public PriceOptAB j;
    public boolean k;
    private MEDQualityMonitorReporter l;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73fc14874c7b8c79d901cfa648e6ad71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73fc14874c7b8c79d901cfa648e6ad71");
            return;
        }
        this.k = false;
        this.b = new Poi();
    }

    public a(Poi poi) {
        Object[] objArr = {poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1958c79eb1c8007aba06a457a55d45d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1958c79eb1c8007aba06a457a55d45d0");
            return;
        }
        this.k = false;
        this.b = poi == null ? new Poi() : poi;
    }

    @NonNull
    public final MEDQualityMonitorReporter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51dab3d70fb13648551cb994dfea377a", RobustBitConfig.DEFAULT_VALUE)) {
            return (MEDQualityMonitorReporter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51dab3d70fb13648551cb994dfea377a");
        }
        if (this.l == null) {
            this.l = new MEDQualityMonitorReporter();
        }
        return this.l;
    }

    public final void a(Poi poi, int i) {
        Object[] objArr = {poi, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e4ab5e5ed19aabb0168c1fae530f9c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e4ab5e5ed19aabb0168c1fae530f9c6");
            return;
        }
        if (i == 2 && this.b != null && poi != null && this.b.equals(poi)) {
            poi.setShoppingCartIconUrl(this.b.getShoppingCartIconUrl());
            poi.setEmptyShoppingCartIconUrl(this.b.getEmptyShoppingCartIconUrl());
            poi.setShippingFeeCartTip(this.b.getShippingFeeCartTip());
            poi.setEstimatedPackFeeCartTip(this.b.getEstimatePackFeeCartTip());
            poi.setShopCartBgColor(this.b.getShopcartBgColor());
            poi.setActivityInfo(this.b.getActivityInfo());
            poi.setActivityInfoList(this.b.getActivityInfoList());
            poi.setNumDiscountRestrict(this.b.getNumDiscountRestrict());
            poi.packingFee = this.b.packingFee;
            poi.originPackingFeeTip = this.b.originPackingFeeTip;
            poi.toastDiscountRestrict = this.b.toastDiscountRestrict;
            poi.packingFeeTip = this.b.packingFeeTip;
            poi.newUserDiscountRestrictToast = this.b.newUserDiscountRestrictToast;
            poi.setNewUserDiscountRestrict(this.b.getNewUserDiscountRestrict());
            poi.setNumPlusDiscountRestrict(this.b.getNumPlusDiscountRestrict());
            poi.toastPlusDiscountRestrict = this.b.toastPlusDiscountRestrict;
            poi.setPoiTabStoryIcon(this.b.getPoiTabStoryIcon());
            poi.setCommentNumber(this.b.getCommentNumber());
            poi.setTemplateType(this.b.getTemplateType());
            poi.setIsSelfDelivery(this.b.isSelfDelivery);
            poi.setPoiSellStatus(this.b.getPoiSellStatus());
            poi.setSelfDeliveryTip(this.b.getSelfDeliveryTip());
            poi.setActivityInfoList(this.b.getActivityInfoList());
            poi.bottomPoiImInfo = this.b.bottomPoiImInfo;
            poi.mBuzType = this.b.mBuzType;
            poi.mPurchasedType = this.b.mPurchasedType;
            poi.addition = this.b.addition;
            poi.friendAssistance = this.b.friendAssistance;
            poi.mscAdditionalInfo = this.b.mscAdditionalInfo;
            poi.poiIdStr = this.b.poiIdStr;
        }
        if (poi == null) {
            poi = new Poi();
        }
        this.b = poi;
    }

    public final boolean b() {
        return (this.b.bottomPoiImInfo == null || this.b.bottomPoiImInfo.h == null) ? false : true;
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d5792f4c0a87980c9061df65d4218b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d5792f4c0a87980c9061df65d4218b1")).booleanValue();
        }
        String d = d();
        return (t.a(d) || "-1".equals(d)) ? false : true;
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac9ceeea728c9153c979296dc8372d51", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac9ceeea728c9153c979296dc8372d51") : this.b != null ? this.b.getOfficialPoiId() : "-1";
    }

    public static String a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7e7fd67e46c3926f4f5906e564e792e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7e7fd67e46c3926f4f5906e564e792e") : (t.a(str) || e()) ? j >= 0 ? String.valueOf(j) : "-1" : str;
    }

    public static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b47cf45a81cd5eb443917ec26f0284c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b47cf45a81cd5eb443917ec26f0284c")).booleanValue() : j.h().a(SCConfigPath.POI_ID_CONIDF, true);
    }

    public final long f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0c37d0d9dea3b0b6b44e3f5d58a2bfa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0c37d0d9dea3b0b6b44e3f5d58a2bfa")).longValue();
        }
        if (c()) {
            return this.b.getLongPoiId();
        }
        return -1L;
    }

    @Deprecated
    public final long g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e46a1d09f701838751fe9441ea2a554", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e46a1d09f701838751fe9441ea2a554")).longValue();
        }
        if (c()) {
            return this.b.getLongPoiId();
        }
        return -1L;
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2192e7531907dc1822650f134ee4d2e3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2192e7531907dc1822650f134ee4d2e3") : c() ? this.b.getStringPoiId() : "";
    }

    public static String b(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0cb1810dfda0c63bd731a389008d2ee", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0cb1810dfda0c63bd731a389008d2ee") : !t.a(str) ? str : j >= 0 ? String.valueOf(j) : "-1";
    }

    public static boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90885ddca4e2255f61f71864cda0aa44", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90885ddca4e2255f61f71864cda0aa44")).booleanValue() : TextUtils.equals(str, str2);
    }

    public static boolean a(String str, String str2, long j, long j2) {
        Object[] objArr = {str, str2, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f8b8b1e1e235960585cf29f1260e1a8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f8b8b1e1e235960585cf29f1260e1a8")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return j == j2;
        }
        return TextUtils.equals(str, str2);
    }

    public static String a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ef4d466972f367e0b23569a75acacf4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ef4d466972f367e0b23569a75acacf4") : !TextUtils.isEmpty(str) ? str : String.valueOf(j);
    }

    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61f9a052142110d8471ae29567e14e55", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61f9a052142110d8471ae29567e14e55")).booleanValue() : c() && this.b.isSelfDelivery;
    }

    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91837121d0ca03e05b0548f5d2f78881", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91837121d0ca03e05b0548f5d2f78881") : this.b.getName();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e82b71db9d1fbd3ee7c862b0b6a944d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e82b71db9d1fbd3ee7c862b0b6a944d3");
            return;
        }
        if (this.b == null) {
            this.b = new Poi();
        }
        this.b.setSMPoiIdStr(str);
    }

    @Deprecated
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eda30e9eaa9d597334d391d591cabca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eda30e9eaa9d597334d391d591cabca");
            return;
        }
        if (this.b == null) {
            this.b = new Poi();
        }
        this.b.setId(j);
    }

    public final String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "865b6cd9394d756a012eb2a24777e33d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "865b6cd9394d756a012eb2a24777e33d") : this.b.getShippingFeeCartTip();
    }

    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c9f602f0505485e2710cc8cecfe0990", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c9f602f0505485e2710cc8cecfe0990") : this.b.getEstimatePackFeeCartTip();
    }

    public final String m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a49a3a6f4e346f36dcc45e278d7feb55", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a49a3a6f4e346f36dcc45e278d7feb55") : this.b.getSelfDeliveryTip();
    }

    public final String n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf566ec2fcd6b5a28ef483361c259dbe", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf566ec2fcd6b5a28ef483361c259dbe") : this.b.getShopcartBgColor();
    }

    public final String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62969b7f0412b1b73826ce0e5b865f83", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62969b7f0412b1b73826ce0e5b865f83") : this.b.getPromptText();
    }

    public final String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "681e083173e36df8a6ee960478bb8d54", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "681e083173e36df8a6ee960478bb8d54") : this.b.getHighlightPromptText();
    }

    private List<PoiShoppingCart.ActivityInfo> K() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "310f9cf70c1517583096919c6d956b40", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "310f9cf70c1517583096919c6d956b40") : this.b.getActivityInfoList();
    }

    public final PoiShoppingCart.ActivityInfo q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5db41b1ae92e0c5568ac6384c7994c92", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiShoppingCart.ActivityInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5db41b1ae92e0c5568ac6384c7994c92");
        }
        List<PoiShoppingCart.ActivityInfo> K = K();
        if (K != null) {
            for (int i = 0; i < K.size(); i++) {
                PoiShoppingCart.ActivityInfo activityInfo = K.get(i);
                if (activityInfo != null && activityInfo.type == 3) {
                    return activityInfo;
                }
            }
            return null;
        }
        return null;
    }

    public final int r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa01beaa68ea3db913e7d3e770c8f7e5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa01beaa68ea3db913e7d3e770c8f7e5")).intValue() : this.b.getState();
    }

    public final double s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cee0ba9d56f77930b57c039db5d54b98", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cee0ba9d56f77930b57c039db5d54b98")).doubleValue() : this.b.getMinPrice();
    }

    public final String u() {
        return this.j == null ? "" : this.j.priceExpInfo;
    }

    public static boolean w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c671c1092e62856ca553790d843ae322", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c671c1092e62856ca553790d843ae322")).booleanValue() : !e();
    }

    public final boolean z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68952a358b054be26939d4968d0d16f2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68952a358b054be26939d4968d0d16f2")).booleanValue() : this.b == null || this.b.getState() == 3;
    }

    public final boolean A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db0f70a4e62b1654630449738bcc8968", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db0f70a4e62b1654630449738bcc8968")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        int state = this.b.getState();
        if (state == 2) {
            return true;
        }
        return state != 3 && state == 1;
    }

    public final boolean B() {
        return (this.b == null || this.b.bottomPoiImInfo == null || this.b.bottomPoiImInfo.b == 1) ? false : true;
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9aeac91823e0f485dd975b222e20944", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9aeac91823e0f485dd975b222e20944")).booleanValue() : (t.a(str) || "-1".equals(str) || "-999".equals(str) || "0".equals(str)) ? false : true;
    }

    public final boolean C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "084661b997861741b71d0bb19dff2c81", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "084661b997861741b71d0bb19dff2c81")).booleanValue() : (this.b == null || this.b.bottomPoiImInfo == null || this.b.bottomPoiImInfo.f != 1) ? false : true;
    }

    public final boolean D() {
        return (this.b == null || this.b.bottomPoiImInfo == null || this.b.bottomPoiImInfo.b == 1 || this.b.bottomPoiImInfo.b == 2 || this.b.bottomPoiImInfo.d == 0) ? false : true;
    }

    public final boolean E() {
        if (this.b == null || this.b.bottomPoiImInfo == null) {
            return false;
        }
        return this.b.bottomPoiImInfo.i;
    }

    public final AppendPoiImInfo F() {
        if (this.b != null) {
            return this.b.bottomPoiImInfo;
        }
        return null;
    }

    public final int G() {
        if (this.b == null || this.b.bottomPoiImInfo == null) {
            return 1;
        }
        return this.b.bottomPoiImInfo.b;
    }

    private void a(@Nullable List<Poi.CouponCategoryList> list, @Nullable Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {list, poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdcf2ffa72a9700a5de431b27219c1ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdcf2ffa72a9700a5de431b27219c1ec");
        } else if (!com.sankuai.shangou.stone.util.a.b(list) && poiCouponItem != null) {
            for (Poi.CouponCategoryList couponCategoryList : list) {
                if (couponCategoryList != null && !com.sankuai.shangou.stone.util.a.b(couponCategoryList.poiCouponItems)) {
                    for (Poi.PoiCouponItem poiCouponItem2 : couponCategoryList.poiCouponItems) {
                        if (poiCouponItem2 != null && poiCouponItem2.mCouponId == poiCouponItem.mCouponId) {
                            poiCouponItem2.copyValueFrom(poiCouponItem);
                            return;
                        }
                    }
                    continue;
                }
            }
        }
    }

    private void b(@Nullable List<Poi.PoiCouponItem> list, @Nullable Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {list, poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e09a837f7c736635aee74caafd36cb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e09a837f7c736635aee74caafd36cb2");
        } else if (!com.sankuai.shangou.stone.util.a.b(list) && poiCouponItem != null) {
            for (Poi.PoiCouponItem poiCouponItem2 : list) {
                if (poiCouponItem2 != null && poiCouponItem2.mCouponId == poiCouponItem.mCouponId) {
                    poiCouponItem2.copyValueFrom(poiCouponItem);
                    return;
                }
            }
        }
    }

    public final JSONObject H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a57c3454742761e91a5aeb3dac03481", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a57c3454742761e91a5aeb3dac03481");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            return !t.a(this.b.previewOrderCallbackInfo) ? new JSONObject(this.b.previewOrderCallbackInfo) : jSONObject;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return jSONObject;
        }
    }

    public final boolean I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83cf0c5ed695e41c8404619b9239a839", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83cf0c5ed695e41c8404619b9239a839")).booleanValue() : !t();
    }

    public final String J() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c770ba3ccb98fc1fc6e148bce1b84ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c770ba3ccb98fc1fc6e148bce1b84ff");
        }
        b k = com.sankuai.waimai.store.order.a.e().k(d());
        return (k == null || k.e == null) ? "" : k.e.c("cart_im_scheme");
    }

    public static String a(Map<String, String> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4bf08edbaa61942dbf32b4c72b8caf3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4bf08edbaa61942dbf32b4c72b8caf3");
        }
        if (map.isEmpty()) {
            return str;
        }
        for (String str2 : Arrays.asList("poi_id", FoodDetailNetWorkPreLoader.URI_POI, "wm_poi_id", "restaurant_id")) {
            String str3 = map.get(str2);
            if (!t.a(str3)) {
                return str3;
            }
        }
        return str;
    }

    public final boolean t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0f471d903169b475549f37b3cf3c299", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0f471d903169b475549f37b3cf3c299")).booleanValue();
        }
        try {
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
        return this.b.getBuzType() == 9;
    }

    public final int v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c849de465585d21b1406e4b032c76692", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c849de465585d21b1406e4b032c76692")).intValue() : this.b.getTemplateType();
    }

    public final boolean x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ed3c7e1c7d0d44fa1dc7dfdcb7ccfe3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ed3c7e1c7d0d44fa1dc7dfdcb7ccfe3")).booleanValue() : this.b != null && this.b.mPurchasedType == 1;
    }

    public final boolean y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e20e61b7e0fc592997ed030b86c978d5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e20e61b7e0fc592997ed030b86c978d5")).booleanValue() : this.b != null && this.b.mBuzType == 143;
    }

    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c8782889eb03ab3018cf44b092b9bba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c8782889eb03ab3018cf44b092b9bba");
        } else if (poiCouponItem == null) {
        } else {
            Poi.PoiCouponEntity poiCoupon = this.b.getPoiCoupon();
            if (poiCoupon != null) {
                a(poiCoupon.getPoiCouponCategoryList(), poiCouponItem);
                b(poiCoupon.getPoiCouponItemsFromSubCouponCategoryList(), poiCouponItem);
                if (poiCoupon.couponTabInfo != null) {
                    a(poiCoupon.couponTabInfo.couponCategoryLists, poiCouponItem);
                }
            }
            b(poiCouponItem);
        }
    }

    private void b(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99efdfc01d87e99e8f86012368528c64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99efdfc01d87e99e8f86012368528c64");
            return;
        }
        CouponPoiCardInfo couponPoiCardInfo = this.b.couponPoiCardInfo;
        if (couponPoiCardInfo != null) {
            List<CouponPoiCardInfo.CommonCouponAreaList> list = couponPoiCardInfo.commonCouponAreaList;
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                return;
            }
            for (CouponPoiCardInfo.CommonCouponAreaList commonCouponAreaList : list) {
                if (commonCouponAreaList != null && !com.sankuai.shangou.stone.util.a.b(commonCouponAreaList.poiCouponItems)) {
                    for (Poi.PoiCouponItem poiCouponItem2 : commonCouponAreaList.poiCouponItems) {
                        if (poiCouponItem2 != null && poiCouponItem2.mCouponId == poiCouponItem.mCouponId) {
                            poiCouponItem2.copyValueFrom(poiCouponItem);
                            return;
                        }
                    }
                    continue;
                }
            }
        }
    }

    public static Poi a(@NonNull a aVar, Poi poi) {
        Object[] objArr = {aVar, poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97fbb333a329bbdc01cf7dfe83c067c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Poi) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97fbb333a329bbdc01cf7dfe83c067c5");
        }
        poi.setNewPoiLabels(aVar.b.getNewPoiLabels());
        poi.setShareTip(aVar.b.shareTip);
        poi.setBulletin(aVar.b.bulletin);
        poi.isFlashShow = !aVar.t();
        poi.setPoiCouponEntity(aVar.b.getPoiCoupon());
        poi.poiDetailStoryInfo = aVar.b.poiDetailStoryInfo;
        poi.setLabelInfoList(aVar.b.getLabelInfoList());
        poi.discounts = aVar.b.discounts;
        poi.setBottomActivities(aVar.b.discounts);
        poi.isNewPage = aVar.b.isNewPage;
        poi.isUserNewCardPage = aVar.b.isUserNewCardPage;
        poi.couponPoiCardInfo = aVar.b.couponPoiCardInfo;
        poi.friendAssistance = aVar.b.friendAssistance;
        poi.isOneLine = aVar.b.isOneLine;
        poi.score = aVar.b.score;
        if (t.a(poi.schemeForInshop)) {
            poi.schemeForInshop = aVar.b.schemeForInshop;
        }
        if (t.a(poi.marketingInfoExtend)) {
            poi.marketingInfoExtend = aVar.b.marketingInfoExtend;
        }
        if (t.a(poi.previewOrderCallbackInfo)) {
            poi.previewOrderCallbackInfo = aVar.b.previewOrderCallbackInfo;
        }
        if (t.a(poi.orderPreviewExtend)) {
            poi.orderPreviewExtend = aVar.b.orderPreviewExtend;
        }
        poi.cartExtendInfo = aVar.b.cartExtendInfo;
        return poi;
    }
}
