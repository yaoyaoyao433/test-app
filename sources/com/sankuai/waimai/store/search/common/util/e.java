package com.sankuai.waimai.store.search.common.util;

import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.search.common.api.net.SCSearchApiService;
import com.sankuai.waimai.store.search.model.PromotionWordsResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final Map<String, PromotionWordsResponse.a> b = new ConcurrentHashMap();

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(Map<String, PromotionWordsResponse.a> map);
    }

    public static /* synthetic */ void a(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "332c43307fa1f0349c13df0f46616072", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "332c43307fa1f0349c13df0f46616072");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b1924d55f117c7b90908dd9d934ce4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (WritableMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b1924d55f117c7b90908dd9d934ce4f");
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
            createMap.putMap(entry.getKey(), createMap2);
        }
        return createMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
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
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a788e25a38c36a3037f0e98d654f8ad", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a788e25a38c36a3037f0e98d654f8ad") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66943a65dc2c94678407c1e87de0910e", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66943a65dc2c94678407c1e87de0910e") : (b[]) values().clone();
        }

        b(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d11dedf2e08dfd2a06b27926aab9709d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d11dedf2e08dfd2a06b27926aab9709d");
            } else {
                this.f = i;
            }
        }
    }

    public static PromotionWordsResponse.a a(String str, b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc067d30123e8978f49ad79a36d58718", RobustBitConfig.DEFAULT_VALUE)) {
            return (PromotionWordsResponse.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc067d30123e8978f49ad79a36d58718");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d8409ace5ec691de9fb5bd17e6c52f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d8409ace5ec691de9fb5bd17e6c52f5");
            return;
        }
        b.clear();
        if (TextUtils.isEmpty(com.sankuai.waimai.platform.domain.manager.user.a.i().e())) {
            return;
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((SCSearchApiService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) SCSearchApiService.class)).promotionwords(j, i), new b.AbstractC1042b<BaseResponse<PromotionWordsResponse>>() { // from class: com.sankuai.waimai.store.search.common.util.e.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onError(Throwable th) {
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "318bd2f8bceba3cb45cc0cabbd24f4d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "318bd2f8bceba3cb45cc0cabbd24f4d5");
                } else if (baseResponse == null || baseResponse.data == 0) {
                } else {
                    e.a(((PromotionWordsResponse) baseResponse.data).promotionInfos);
                    if (a.this != null) {
                        a.this.a(e.b);
                    }
                }
            }
        }, str);
    }
}
