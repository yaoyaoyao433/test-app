package com.sankuai.waimai.store.manager.poi;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.poi.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.store.a<com.sankuai.waimai.store.i.poi.a, b> {
    public static ChangeQuickRedirect c;
    private static volatile a e;
    private List<com.sankuai.waimai.store.i.poi.a> d;

    @Override // com.sankuai.waimai.store.a
    @NonNull
    public final /* synthetic */ b c(com.sankuai.waimai.store.i.poi.a aVar) {
        final com.sankuai.waimai.store.i.poi.a aVar2 = aVar;
        Object[] objArr = {aVar2};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daa12e27df8637f042e68d79638622db", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daa12e27df8637f042e68d79638622db") : new b() { // from class: com.sankuai.waimai.store.manager.poi.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.service.poi.b
            public final void a(String str, String str2) {
            }

            @Override // com.sankuai.waimai.foundation.core.service.poi.b
            public final void a(String str, String str2, long j) {
            }

            @Override // com.sankuai.waimai.foundation.core.service.poi.b
            public final void a(String str, String str2, long j, boolean z) {
            }

            @Override // com.sankuai.waimai.foundation.core.service.poi.b
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0938ae0259e25b8ac982ba56e23d15fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0938ae0259e25b8ac982ba56e23d15fe");
                } else if (aVar2 != null) {
                    aVar2.c_(str);
                }
            }

            @Override // com.sankuai.waimai.foundation.core.service.poi.b
            public final void a(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
                Object[] objArr2 = {str, list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "867ccf65c8aa2d26238d501ec56bd27a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "867ccf65c8aa2d26238d501ec56bd27a");
                } else if (aVar2 != null) {
                    aVar2.a(str, list);
                }
            }
        };
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f74271323e659815a7be9bab2e5ea841", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f74271323e659815a7be9bab2e5ea841");
        }
        if (e == null) {
            synchronized (a.class) {
                if (e == null) {
                    e = new a();
                }
            }
        }
        return e;
    }

    public final void a(com.sankuai.waimai.store.i.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82f01eefe65760e7e18434f70559d59d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82f01eefe65760e7e18434f70559d59d");
        } else if (aVar == null) {
        } else {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            if (!this.d.contains(aVar)) {
                this.d.add(aVar);
            }
            com.sankuai.waimai.foundation.core.service.poi.a.a().registerPoiShopObserver(a((a) aVar));
        }
    }

    public final void b(com.sankuai.waimai.store.i.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "422b83a80b5bb2aa021661c78726529d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "422b83a80b5bb2aa021661c78726529d");
        } else if (aVar == null) {
        } else {
            if (this.d != null) {
                this.d.remove(aVar);
            }
            com.sankuai.waimai.foundation.core.service.poi.a.a().unregisterPoiShopObserver(a((a) aVar));
            b((a) aVar);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d05d46aa69defc57e6fd344cdae63aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d05d46aa69defc57e6fd344cdae63aa");
        } else {
            com.sankuai.waimai.foundation.core.service.poi.a.a().updatePoiShop(str);
        }
    }
}
