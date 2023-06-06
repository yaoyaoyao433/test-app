package com.sankuai.waimai.store.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k {
    public static ChangeQuickRedirect a;

    public static HandPriceInfo a(Poi poi, GoodsSpu goodsSpu) {
        Object[] objArr = {poi, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b9ff401813b58d488085ccdb5650bda", RobustBitConfig.DEFAULT_VALUE) ? (HandPriceInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b9ff401813b58d488085ccdb5650bda") : c(poi, goodsSpu, null);
    }

    public static HandPriceInfo b(Poi poi, GoodsSpu goodsSpu) {
        Object[] objArr = {poi, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47d27ba04c424e1b7ad8dd0f49340b6a", RobustBitConfig.DEFAULT_VALUE) ? (HandPriceInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47d27ba04c424e1b7ad8dd0f49340b6a") : a(poi, goodsSpu, null);
    }

    private static HandPriceInfo c(Poi poi, GoodsSpu goodsSpu, GoodsSku goodsSku) {
        Object[] objArr = {poi, goodsSpu, goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62069908c9ccc80634d8f166c344cf94", RobustBitConfig.DEFAULT_VALUE)) {
            return (HandPriceInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62069908c9ccc80634d8f166c344cf94");
        }
        if (poi == null) {
            return null;
        }
        if (poi.mBuzType == 9) {
            return e(poi, goodsSpu, goodsSku);
        }
        return f(poi, goodsSpu, goodsSku);
    }

    public static HandPriceInfo a(Poi poi, GoodsSpu goodsSpu, GoodsSku goodsSku) {
        Object[] objArr = {poi, goodsSpu, goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15484cd90b160b6ba1fe9044ddf91ee2", RobustBitConfig.DEFAULT_VALUE)) {
            return (HandPriceInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15484cd90b160b6ba1fe9044ddf91ee2");
        }
        if (poi == null) {
            return null;
        }
        if (poi.mBuzType == 9) {
            return e(poi, goodsSpu, goodsSku);
        }
        return d(poi, goodsSpu, goodsSku);
    }

    private static HandPriceInfo d(@NonNull Poi poi, GoodsSpu goodsSpu, @Nullable GoodsSku goodsSku) {
        Object[] objArr = {poi, goodsSpu, goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "002de2d9f649cb1e73188868f6b66194", RobustBitConfig.DEFAULT_VALUE)) {
            return (HandPriceInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "002de2d9f649cb1e73188868f6b66194");
        }
        if (goodsSpu == null || poi.getLongPoiId() <= 0) {
            return null;
        }
        if (goodsSku != null) {
            return a(goodsSku);
        }
        return a(goodsSpu);
    }

    private static HandPriceInfo a(@NonNull GoodsSku goodsSku) {
        Object[] objArr = {goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41e3b386c61b37ebd3184a211dea2ba8", RobustBitConfig.DEFAULT_VALUE)) {
            return (HandPriceInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41e3b386c61b37ebd3184a211dea2ba8");
        }
        HandPriceInfo handPriceInfo = goodsSku.handPriceInfo;
        if (handPriceInfo == null || !TextUtils.isEmpty(handPriceInfo.getHandActivityPriceText())) {
            return handPriceInfo;
        }
        return null;
    }

    private static HandPriceInfo a(@NonNull GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b85815dad2f3c3a8ba59d22d29892655", RobustBitConfig.DEFAULT_VALUE)) {
            return (HandPriceInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b85815dad2f3c3a8ba59d22d29892655");
        }
        HandPriceInfo handPriceInfo = goodsSpu.handPriceInfo;
        if (handPriceInfo == null || !TextUtils.isEmpty(handPriceInfo.getHandActivityPriceText())) {
            return handPriceInfo;
        }
        return null;
    }

    public static HandPriceInfo c(Poi poi, GoodsSpu goodsSpu) {
        GoodsSku goodsSku;
        Object[] objArr = {poi, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        HandPriceInfo handPriceInfo = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38ebf21945eace1d811c94e32952c4a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (HandPriceInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38ebf21945eace1d811c94e32952c4a3");
        }
        if (poi == null) {
            return null;
        }
        if (poi.mBuzType != 9) {
            return f(poi, goodsSpu, null);
        }
        Object[] objArr2 = {poi, goodsSpu, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "97876541f73b64dad1716d4ed30dfba6", RobustBitConfig.DEFAULT_VALUE)) {
            return (HandPriceInfo) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "97876541f73b64dad1716d4ed30dfba6");
        }
        if (goodsSpu == null || poi == null || poi.getLongPoiId() <= 0) {
            return null;
        }
        Object[] objArr3 = {poi, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "9a2584fd871dcc5e1584a5b37750ed1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (HandPriceInfo) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "9a2584fd871dcc5e1584a5b37750ed1c");
        }
        List<GoodsSku> skuList = goodsSpu.getSkuList();
        if (com.sankuai.shangou.stone.util.a.a((List) skuList) == 1 && (goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) skuList, 0)) != null) {
            handPriceInfo = com.sankuai.waimai.store.order.a.e().b(poi.getOfficialPoiId(), goodsSpu.id, goodsSku.getSkuId());
        }
        if (handPriceInfo == null) {
            handPriceInfo = goodsSpu.handPriceInfo;
        }
        return a(goodsSpu, handPriceInfo);
    }

    private static HandPriceInfo e(@NonNull Poi poi, GoodsSpu goodsSpu, @Nullable GoodsSku goodsSku) {
        Object[] objArr = {poi, goodsSpu, goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b7c73741a8a0098061e19a430f75a7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (HandPriceInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b7c73741a8a0098061e19a430f75a7b");
        }
        if (goodsSpu == null || poi == null || poi.getLongPoiId() <= 0 || com.sankuai.waimai.store.order.a.e().c(poi.getLongPoiId())) {
            return null;
        }
        if (goodsSku != null) {
            return goodsSku.handPriceInfo;
        }
        return goodsSpu.handPriceInfo;
    }

    private static HandPriceInfo f(@NonNull Poi poi, GoodsSpu goodsSpu, @Nullable GoodsSku goodsSku) {
        Object[] objArr = {poi, goodsSpu, goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d61ca2f5f100ac18a87d25556156fa7d", RobustBitConfig.DEFAULT_VALUE)) {
            return (HandPriceInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d61ca2f5f100ac18a87d25556156fa7d");
        }
        if (goodsSpu == null || poi == null || poi.getLongPoiId() <= 0) {
            return null;
        }
        if (goodsSku != null) {
            return g(poi, goodsSpu, goodsSku);
        }
        return d(poi, goodsSpu);
    }

    private static HandPriceInfo g(@NonNull Poi poi, @NonNull GoodsSpu goodsSpu, @NonNull GoodsSku goodsSku) {
        Object[] objArr = {poi, goodsSpu, goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ddc78d3a906602e1bdfe0c60e4072e36", RobustBitConfig.DEFAULT_VALUE)) {
            return (HandPriceInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ddc78d3a906602e1bdfe0c60e4072e36");
        }
        HandPriceInfo b = com.sankuai.waimai.store.order.a.e().b(poi.getOfficialPoiId(), goodsSpu.id, goodsSku.getSkuId());
        if (b == null) {
            b = goodsSku.handPriceInfo;
        }
        if (b == null || !TextUtils.isEmpty(b.getHandActivityPriceText())) {
            return b;
        }
        return null;
    }

    private static HandPriceInfo d(@NonNull Poi poi, @NonNull GoodsSpu goodsSpu) {
        GoodsSku goodsSku;
        Object[] objArr = {poi, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3820663b9b890ca3ed94f0e67eb27e2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (HandPriceInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3820663b9b890ca3ed94f0e67eb27e2c");
        }
        List<GoodsSku> skuList = goodsSpu.getSkuList();
        HandPriceInfo b = (com.sankuai.shangou.stone.util.a.a((List) skuList) != 1 || (goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) skuList, 0)) == null) ? null : com.sankuai.waimai.store.order.a.e().b(poi.getOfficialPoiId(), goodsSpu.id, goodsSku.getSkuId());
        if (b == null) {
            b = goodsSpu.handPriceInfo;
        }
        if (b == null || !TextUtils.isEmpty(b.getHandActivityPriceText())) {
            return b;
        }
        return null;
    }

    private static HandPriceInfo a(GoodsSpu goodsSpu, HandPriceInfo handPriceInfo) {
        Object[] objArr = {goodsSpu, handPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2cf7c75441dc2af9331678671d08fcff", RobustBitConfig.DEFAULT_VALUE)) {
            return (HandPriceInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2cf7c75441dc2af9331678671d08fcff");
        }
        if (handPriceInfo == null || goodsSpu.handPriceInfo == null) {
            return handPriceInfo;
        }
        HandPriceInfo handPriceInfo2 = new HandPriceInfo();
        handPriceInfo2.setHandPriceLabel(goodsSpu.handPriceInfo.getHandPriceLabel());
        handPriceInfo2.setHandActivityPrice(handPriceInfo.getHandActivityPrice());
        return handPriceInfo2;
    }

    public static String b(Poi poi, GoodsSpu goodsSpu, GoodsSku goodsSku) {
        Object[] objArr = {poi, goodsSpu, goodsSku};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efe373cf9e150c794dcd2e1d6173d84b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efe373cf9e150c794dcd2e1d6173d84b");
        }
        HandPriceInfo c = c(poi, goodsSpu, goodsSku);
        return c != null ? c.getHandPriceLabel() : "";
    }
}
