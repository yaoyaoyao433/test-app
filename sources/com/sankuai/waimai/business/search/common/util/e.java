package com.sankuai.waimai.business.search.common.util;

import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.api.WaimaiSearchService;
import com.sankuai.waimai.business.search.model.PromotionWordsResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final Map<String, PromotionWordsResponse.a> b = new ConcurrentHashMap();

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(Map<String, PromotionWordsResponse.a> map);
    }

    public static /* synthetic */ void a(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fe6941bc418b77a18471e0fe75c40ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fe6941bc418b77a18471e0fe75c40ed");
        } else if (list == null || list.isEmpty()) {
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PromotionWordsResponse.a aVar = (PromotionWordsResponse.a) it.next();
                if (aVar.d != null) {
                    Map<String, PromotionWordsResponse.a> map = b;
                    map.put(aVar.d + CommonConstant.Symbol.MINUS + aVar.c, aVar);
                }
            }
        }
    }

    public static WritableMap a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37f951828a0ba397ac5a752547751a5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37f951828a0ba397ac5a752547751a5f");
        }
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, PromotionWordsResponse.a> entry : b.entrySet()) {
            WritableMap createMap2 = Arguments.createMap();
            PromotionWordsResponse.a value = entry.getValue();
            createMap2.putBoolean("hitPromotion", value.a);
            createMap2.putInt("promotionType", value.c);
            createMap2.putString("promotionUrl", value.b);
            createMap2.putString("promotionWord", value.d);
            createMap2.putString("sugShowInfo", value.e);
            createMap2.putString("activityId", value.f);
            createMap2.putString("activityType", value.g);
            createMap2.putString("entryItemId", value.h);
            createMap2.putString("configPic", value.i);
            createMap.putMap(entry.getKey(), createMap2);
        }
        return createMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum b {
        SEARCH(3),
        HISTORY(4),
        SUGGEST(5),
        HOT_WORD(0);
        
        public static ChangeQuickRedirect a;
        private final int f;

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a115e6df49b4fdc6c31460998026739", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a115e6df49b4fdc6c31460998026739") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96b7abafdd678bd97825720d98ff6d83", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96b7abafdd678bd97825720d98ff6d83") : (b[]) values().clone();
        }

        b(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d85506344169f15980bd4b23484a83fe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d85506344169f15980bd4b23484a83fe");
            } else {
                this.f = i;
            }
        }
    }

    public static boolean a(String str, b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fce165203a28f5e13df6b4014ce1884", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fce165203a28f5e13df6b4014ce1884")).booleanValue() : b(str, bVar) != null;
    }

    public static PromotionWordsResponse.a b(String str, b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4383a0c3977ab58447970ca9f6e4174", RobustBitConfig.DEFAULT_VALUE)) {
            return (PromotionWordsResponse.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4383a0c3977ab58447970ca9f6e4174");
        }
        if (!TextUtils.isEmpty(str) && !b.isEmpty()) {
            Map<String, PromotionWordsResponse.a> map = b;
            if (map.containsKey(str + CommonConstant.Symbol.MINUS + bVar.f)) {
                Map<String, PromotionWordsResponse.a> map2 = b;
                PromotionWordsResponse.a aVar = map2.get(str + CommonConstant.Symbol.MINUS + bVar.f);
                if (aVar == null || TextUtils.isEmpty(aVar.b)) {
                    return null;
                }
                return aVar;
            }
        }
        return null;
    }

    public static void a(long j, int i, String str, final a aVar) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad67dbe39e9c156c984b3c4082468080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad67dbe39e9c156c984b3c4082468080");
        } else if (TextUtils.isEmpty(com.sankuai.waimai.platform.domain.manager.user.a.i().e())) {
        } else {
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiSearchService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiSearchService.class)).promotionwords(j, i), new b.AbstractC1042b<com.sankuai.waimai.business.search.model.a<PromotionWordsResponse>>() { // from class: com.sankuai.waimai.business.search.common.util.e.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onError(Throwable th) {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    com.sankuai.waimai.business.search.model.a aVar2 = (com.sankuai.waimai.business.search.model.a) obj;
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20d91f936ce47b4b52ed4d66b26451fc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20d91f936ce47b4b52ed4d66b26451fc");
                    } else if (aVar2 == null || aVar2.a == 0) {
                    } else {
                        e.b.clear();
                        e.a(((PromotionWordsResponse) aVar2.a).promotionInfos);
                        if (a.this != null) {
                            a.this.a(e.b);
                        }
                    }
                }
            }, str);
        }
    }
}
