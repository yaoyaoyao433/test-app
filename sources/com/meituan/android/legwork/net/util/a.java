package com.meituan.android.legwork.net.util;

import android.net.Uri;
import android.os.Build;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.legwork.common.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static String c = Build.VERSION.SDK_INT + CommonConstant.Symbol.UNDERLINE + Build.VERSION.RELEASE;
    private static String d = String.valueOf(Build.MODEL);
    private static final List<String> e = Arrays.asList("/home/delivery/index", "/sourcePosition/pop", "/home/delivery/content", "/home/buy", "/resourcePosition/getAll", "/poi/categoryPage", "/order/submit", "/order/preview", "/im/getInitializeData", "/order/getModifyInfo", "/order/modifyPreview", "/order/modifySubmit", "/map/search", "/address/getRecentOrderSender", "/city/specialHints", "/poi/menuPage", "/poi/getGoodsSpusByTag", "/shoppingcart/pull", "/poi/dpMenuPageSearch", "/poi/dpMenuPage", "/poi/dpGoodsDetail", "/poi/dpShopInfo", "/search/resultPage", "/search/suggest", "/map/searchAddress", "/address/list", "/order/modifyPreviewCheck");
    private static final List<String> f = Arrays.asList("/map/regeo", "/report/metrics", "/home/userHints", "/order/getProcessingOrderInfo", "/address/checkSupport", "/balance/payment", "/balance/cashier", "/poi/dpShop/oneMoreUnderTakePage", "/poi/dpGoodsAlbum", "/poi/dpShopAlbum", "/poi/dpShopReviewInfo", "/poi/checkSupport", "/shoppingcart/calculatePrice", "/buy/getBizStatusInfoByPoiId", "/poi/menuPageSearchInit", "/poi/menuPageSearch", "/poi/dpShop/underTakePage", "/order/list", "/order/delete", "/coupon/validPaotuiListAll", "/coupon/invalidPaotuiListAll", "/balance/detailList", "/balance/recharge", "/address/delete", "/address/recognitionPic", "/address/add", "/address/reportRecord", "/address/tagList", "/address/update", "/address/getSupportedCityInfo", "/address/checkValid", "/order/cancel", "/order/urgeGrab", "/order/flow/brief", "/order/cancelReasons", "/order/cancelFeeAppeal", "/order/cancelFeeRefund", "/im/getRiderImId", "/im/getImInsertMessageList", "/order/getRiderPrivacyPhone", "/order/updateBindPhone", "/order/share", "/order/getGoodsLatestPayAmount", "/order/modifyGoodsImgInfo", "/comment/edit", "/comment/submit", "/comment/detail", "/riderQuestion/submit", "/coupon/slowlyConfirming", "/reward/list", "/order/getPrebookTime", "/order/getModifyRecord", "/certify", "/user/action", "/order/payment", "/shoppingcart/checkBeforePreviewForDp", "/coupon/invalidList", "/buy/getBizStatusInfoByPoiIdForDp", "/activity/partnerInvitation/inviter", "/coupon/unUsedCouponListForHome", "/activity/multitaskInvite/getInvitationPic", "/activity/multitaskInvite/getInvitationPicForNative", "/address/getWmCity", "/serviceFee/preview", "/client/config");
    public static final Set<String> b = new HashSet(Arrays.asList("/tipfee/submit", "/order/goodsPaySubmit", "/serviceFee/submit", "/balance/payTypePop", "/reward/submit", "/balance/handleProtocol", "/poi/getGoodsSpusByTag", "/shoppingcart/pull", "/resourcePosition/getAll", "/sourcePosition/pop", "/home/delivery/content"));

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ef, code lost:
        if (r0 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013a, code lost:
        if (r0 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013e, code lost:
        if (r0 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> a(android.net.Uri r18) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.net.util.a.a(android.net.Uri):java.util.Map");
    }

    public static Map<String, String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1eb53346a05e8f833f75c987af0a1d0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1eb53346a05e8f833f75c987af0a1d0d");
        }
        Map<String, String> a2 = a(1);
        a2.putAll(b());
        return a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0176, code lost:
        if (r2 == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> b(@android.support.annotation.NonNull android.net.Uri r18) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.net.util.a.b(android.net.Uri):java.util.Map");
    }

    private static Map<String, String> a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13a9af4aa92d6bc13231ed7dc73891f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13a9af4aa92d6bc13231ed7dc73891f2");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("channel", com.meituan.android.legwork.common.hostInfo.b.e().a());
        hashMap.put("location_city_id", com.meituan.android.legwork.common.location.c.l().g);
        hashMap.put("location_city_type", String.valueOf(com.meituan.android.legwork.common.location.c.l().h));
        if (i == 1) {
            hashMap.put("actual_longitude", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().b())));
            hashMap.put("actual_latitude", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().c())));
            hashMap.put("location_accuracy", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().f())));
            hashMap.put(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().b)));
            hashMap.put(Constants.PRIVACY.KEY_LATITUDE, String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().c)));
        } else if (i == 2) {
            if (g.a().i) {
                hashMap.put("actual_longitude", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().b())));
                hashMap.put("actual_latitude", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().c())));
                hashMap.put("location_accuracy", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().f())));
                hashMap.put(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().b)));
                hashMap.put(Constants.PRIVACY.KEY_LATITUDE, String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().c)));
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("actual_longitude", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().b())));
                hashMap2.put("actual_latitude", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().c())));
                hashMap2.put("location_accuracy", String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().f())));
                hashMap2.put(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().b)));
                hashMap2.put(Constants.PRIVACY.KEY_LATITUDE, String.valueOf(com.meituan.android.legwork.common.location.c.a(com.meituan.android.legwork.common.location.c.l().c)));
                hashMap.put(com.sankuai.waimai.platform.encrypt.c.b, b.a().toJson(hashMap2));
            }
        }
        return hashMap;
    }

    public static String c(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7023d4b155ad98e9fcaaad2c5556d941", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7023d4b155ad98e9fcaaad2c5556d941");
        }
        List<String> pathSegments = uri.getPathSegments();
        StringBuilder sb = new StringBuilder();
        int size = pathSegments.size();
        if (size > 2) {
            for (int i = 2; i < size; i++) {
                sb.append("/");
                sb.append(pathSegments.get(i));
            }
        }
        return sb.toString();
    }

    public static Map<String, String> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a76d4e2300e177e9a212703e59d30da3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a76d4e2300e177e9a212703e59d30da3");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("userid", String.valueOf(com.meituan.android.legwork.common.user.a.a().d()));
        hashMap.put("uuid", com.meituan.android.legwork.common.hostInfo.b.e().f());
        hashMap.put("wm_uuid", com.meituan.android.legwork.common.hostInfo.b.e().f());
        hashMap.put("wm_dtype", d);
        com.meituan.android.legwork.common.hostInfo.b.e();
        hashMap.put("wm_ctype", com.meituan.android.legwork.common.hostInfo.b.h());
        hashMap.put("wm_dversion", c);
        hashMap.put("wm_appversion", com.meituan.android.legwork.common.hostInfo.b.e().c());
        hashMap.put("poilist_wm_cityid", com.meituan.android.legwork.common.location.c.l().j());
        return hashMap;
    }
}
