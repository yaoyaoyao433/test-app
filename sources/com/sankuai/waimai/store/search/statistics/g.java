package com.sankuai.waimai.store.search.statistics;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
import com.sankuai.waimai.store.search.model.NonLbsEntity;
import com.sankuai.waimai.store.search.model.Poi;
import com.sankuai.waimai.store.search.model.RecommendSummary;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.dynamictag.SGSearchTagInfo;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public static a b = new a() { // from class: com.sankuai.waimai.store.search.statistics.g.1
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.search.statistics.g.a
        public final String a(RecommendSummary.RecommendTag recommendTag) {
            Object[] objArr = {recommendTag};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b2722893762444bd0b44648bed7de93", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b2722893762444bd0b44648bed7de93") : String.valueOf(recommendTag.tagType);
        }
    };
    public static a c = new a() { // from class: com.sankuai.waimai.store.search.statistics.g.2
        @Override // com.sankuai.waimai.store.search.statistics.g.a
        public final String a(RecommendSummary.RecommendTag recommendTag) {
            return recommendTag.text;
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        String a(RecommendSummary.RecommendTag recommendTag);
    }

    public static String a(HandPriceInfo handPriceInfo) {
        Object[] objArr = {handPriceInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "810a0305709603892fbd3f65d68c8935", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "810a0305709603892fbd3f65d68c8935");
        }
        if (handPriceInfo == null || t.a(handPriceInfo.getHandPriceLabel())) {
            return null;
        }
        return handPriceInfo.getHandPriceLabel();
    }

    public static int a(NonLbsEntity nonLbsEntity) {
        Object[] objArr = {nonLbsEntity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f5b455c53db5a7e0a315e3ae80eca0a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f5b455c53db5a7e0a315e3ae80eca0a")).intValue();
        }
        if (nonLbsEntity == null) {
            return 1;
        }
        return (nonLbsEntity.nonLbsId == 1 || nonLbsEntity.nonLbsId == 4) ? 0 : 1;
    }

    public static String a(BaseProductPoi baseProductPoi) {
        Object[] objArr = {baseProductPoi};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3cd4ec3e17e3354960d849d52813a239", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3cd4ec3e17e3354960d849d52813a239") : (baseProductPoi.productInfoItem.o == null || TextUtils.isEmpty(baseProductPoi.productInfoItem.o.a)) ? "" : baseProductPoi.productInfoItem.o.a;
    }

    public static String b(BaseProductPoi baseProductPoi) {
        int i;
        Object[] objArr = {baseProductPoi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f85a8f60c190acdb318ea96ecf0eba0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f85a8f60c190acdb318ea96ecf0eba0e");
        }
        BaseProductPoi.b bVar = baseProductPoi.productInfoItem;
        return (bVar == null || com.sankuai.waimai.foundation.utils.d.a(bVar.p) || (i = bVar.p.get(0).b) < 6 || i > 8) ? "" : bVar.p.get(0).a;
    }

    public static String a(@NonNull BaseProductPoi.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61fb207daec0b32ae5a28fb34b2c7503", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61fb207daec0b32ae5a28fb34b2c7503");
        }
        StringBuilder sb = new StringBuilder();
        if (bVar.o != null && !TextUtils.isEmpty(bVar.o.a)) {
            sb.append(bVar.o.b);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        if (bVar.s != null && !TextUtils.isEmpty(bVar.s.showText)) {
            sb.append(bVar.s.tagId);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        return "-1";
    }

    public static String c(BaseProductPoi baseProductPoi) {
        Object[] objArr = {baseProductPoi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d9d5760e573aa1eefa49c7ed3c8a8e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d9d5760e573aa1eefa49c7ed3c8a8e5");
        }
        StringBuilder sb = new StringBuilder();
        if (baseProductPoi.productInfoItem.o != null) {
            sb.append(baseProductPoi.productInfoItem.o.c);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        if (baseProductPoi.productInfoItem.n != null) {
            sb.append(baseProductPoi.productInfoItem.n.a);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String a(SearchShareData searchShareData) {
        Object[] objArr = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b9b485b950a395baf7c81e690407ea1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b9b485b950a395baf7c81e690407ea1") : !TextUtils.isEmpty(searchShareData.ad) ? "1" : "0";
    }

    public static String b(SearchShareData searchShareData) {
        boolean z = true;
        Object[] objArr = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "651adbc161b95b2b676cfa1523bcc165", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "651adbc161b95b2b676cfa1523bcc165");
        }
        boolean z2 = (!com.sankuai.shangou.stone.util.a.a((Collection<?>) searchShareData.g()) && TextUtils.isEmpty(searchShareData.aM) && TextUtils.isEmpty(searchShareData.aN)) ? false : true;
        if (searchShareData.M == 0 && searchShareData.aL == 0) {
            z = false;
        }
        return (z2 || z) ? (!z2 || z) ? !z2 ? "2" : "1,2" : "1" : "0";
    }

    public static long c(SearchShareData searchShareData) {
        return searchShareData.M;
    }

    public static String d(SearchShareData searchShareData) {
        Object[] objArr = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0528e873486d1a91266f293beb1b2431", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0528e873486d1a91266f293beb1b2431");
        }
        String a2 = t.a(searchShareData.g(), CommonConstant.Symbol.COMMA);
        return TextUtils.isEmpty(a2) ? "-999" : a2;
    }

    public static String e(SearchShareData searchShareData) {
        Object[] objArr = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "211e53ba32210f990b43295724c8bb45", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "211e53ba32210f990b43295724c8bb45");
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(searchShareData.ap)) {
            sb.append("0,");
        }
        if (!TextUtils.isEmpty(searchShareData.ad)) {
            sb.append("1,");
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) searchShareData.ac)) {
            sb.append("2,");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String a(RecommendSummary recommendSummary) {
        Object[] objArr = {recommendSummary};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e192b2978013c4122600f924cead2689", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e192b2978013c4122600f924cead2689");
        }
        if (recommendSummary == null) {
            return "-999";
        }
        StringBuilder sb = new StringBuilder();
        int a2 = com.sankuai.shangou.stone.util.a.a((List) recommendSummary.recommendTags);
        for (int i = 0; i < a2; i++) {
            RecommendSummary.RecommendTag recommendTag = (RecommendSummary.RecommendTag) com.sankuai.shangou.stone.util.a.a((List<Object>) recommendSummary.recommendTags, i);
            if (recommendTag.location == 4) {
                sb.append(recommendTag.tagType);
                sb.append(CommonConstant.Symbol.COMMA);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        return "-999";
    }

    public static String f(SearchShareData searchShareData) {
        Object[] objArr = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "894bd8280a621254a67ad5d17d0713d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "894bd8280a621254a67ad5d17d0713d1");
        }
        if (searchShareData == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(searchShareData.f)) {
            sb.append(searchShareData.f);
            sb.append(";");
        }
        if (!TextUtils.isEmpty(searchShareData.e)) {
            sb.append(searchShareData.e);
            sb.append(";");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        return "";
    }

    public static String a(List<SGSearchTagInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7904777d0c6bb37f49b065cf3da1bff6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7904777d0c6bb37f49b065cf3da1bff6");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return "-999";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            SGSearchTagInfo sGSearchTagInfo = (SGSearchTagInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (sGSearchTagInfo != null && !com.sankuai.shangou.stone.util.a.b(sGSearchTagInfo.subTagBaseInfoList)) {
                int a2 = com.sankuai.shangou.stone.util.a.a((List) sGSearchTagInfo.subTagBaseInfoList);
                for (int i2 = 0; i2 < a2; i2++) {
                    com.sankuai.waimai.platform.widget.tag.api.e eVar = (com.sankuai.waimai.platform.widget.tag.api.e) com.sankuai.shangou.stone.util.a.a((List<Object>) sGSearchTagInfo.subTagBaseInfoList, i2);
                    if (eVar != null && !TextUtils.isEmpty(eVar.h)) {
                        sb.append(eVar.h);
                        sb.append(CommonConstant.Symbol.COMMA);
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        return "-999";
    }

    public static String a(Object obj, a aVar) {
        Object[] objArr = {obj, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b88e5aaf4c3480c16caf07cd6d47b6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b88e5aaf4c3480c16caf07cd6d47b6a");
        }
        RecommendSummary a2 = a(obj);
        if (a2 == null || com.sankuai.shangou.stone.util.a.b(a2.recommendTags)) {
            return "-999";
        }
        StringBuilder sb = new StringBuilder();
        for (RecommendSummary.RecommendTag recommendTag : a2.recommendTags) {
            if (recommendTag != null) {
                sb.append(aVar.a(recommendTag));
                sb.append(";");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        return "-999";
    }

    public static String b(Object obj, a aVar) {
        Object[] objArr = {obj, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "273ced237eab596237d1a4e4f961b93a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "273ced237eab596237d1a4e4f961b93a");
        }
        RecommendSummary a2 = a(obj);
        if (a2 == null || com.sankuai.shangou.stone.util.a.b(a2.recommendTags)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (RecommendSummary.RecommendTag recommendTag : a2.recommendTags) {
            if (recommendTag != null) {
                sb.append(aVar.a(recommendTag));
                sb.append(";");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        return "";
    }

    private static RecommendSummary a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06f2053d8c5019bc2528fe5bd6655820", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecommendSummary) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06f2053d8c5019bc2528fe5bd6655820");
        }
        if (obj instanceof BaseProductPoi) {
            return ((BaseProductPoi) obj).recommendSummary;
        }
        if (obj instanceof Poi) {
            return ((Poi) obj).recommendSummary;
        }
        return null;
    }
}
