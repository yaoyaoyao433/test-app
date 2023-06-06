package com.sankuai.waimai.platform.capacity.dj.city;

import android.content.Context;
import android.util.LruCache;
import com.meituan.android.cipstorage.q;
import com.meituan.android.singleton.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final e<a> e = new e<a>() { // from class: com.sankuai.waimai.platform.capacity.dj.city.a.2
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.singleton.e
        public final /* synthetic */ a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32a73d19b8a427a42249cd462b19bb7b", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32a73d19b8a427a42249cd462b19bb7b") : new a();
        }
    };
    CityInfo b;
    final LruCache<CityInfoCacheKey, CityInfo> c;
    private volatile q d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "527d1c14036c7b2f9692848816d3e184", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "527d1c14036c7b2f9692848816d3e184");
            return;
        }
        this.c = new LruCache<CityInfoCacheKey, CityInfo>(100) { // from class: com.sankuai.waimai.platform.capacity.dj.city.a.1
            public static ChangeQuickRedirect a;

            {
                super(100);
            }

            @Override // android.util.LruCache
            public final /* synthetic */ void entryRemoved(boolean z, CityInfoCacheKey cityInfoCacheKey, CityInfo cityInfo, CityInfo cityInfo2) {
                CityInfoCacheKey cityInfoCacheKey2 = cityInfoCacheKey;
                CityInfo cityInfo3 = cityInfo;
                CityInfo cityInfo4 = cityInfo2;
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), cityInfoCacheKey2, cityInfo3, cityInfo4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2be976d7275b3c9a3315b58d80164813", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2be976d7275b3c9a3315b58d80164813");
                    return;
                }
                super.entryRemoved(z, cityInfoCacheKey2, cityInfo3, cityInfo4);
                a.this.a(com.meituan.android.singleton.b.a).b(cityInfoCacheKey2.cipStoreKey);
            }
        };
        a(com.meituan.android.singleton.b.a);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5dac85fd509aa4cdb94a6659837ecea5", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5dac85fd509aa4cdb94a6659837ecea5") : e.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c02aff983d49a05fdd1019cc73a593de", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c02aff983d49a05fdd1019cc73a593de");
        }
        q qVar = this.d;
        if (qVar == null) {
            q a2 = q.a(context, "mtmall_cityInfo_cache", 2);
            this.d = a2;
            return a2;
        }
        return qVar;
    }
}
