package com.sankuai.waimai.business.page.home.head.promotionbg;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.cache.d;
import com.sankuai.waimai.business.page.home.model.h;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.utils.l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Context b;
    public InterfaceC0773a c;
    public Map<String, h> d;
    d.a e;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.head.promotionbg.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0773a {
        void a(h hVar);

        void a(h hVar, Throwable th);
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c172850593833000bcd8d68387b95d51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c172850593833000bcd8d68387b95d51");
            return;
        }
        this.d = new ConcurrentHashMap();
        this.e = new d.a() { // from class: com.sankuai.waimai.business.page.home.head.promotionbg.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.cache.d.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7e38801c1db4d1cd4c3b401d0df4ad4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7e38801c1db4d1cd4c3b401d0df4ad4");
                    return;
                }
                a.this.a(str);
                i.c(new com.sankuai.waimai.business.page.common.log.a().a("promotion_bg_download").b());
            }

            @Override // com.sankuai.waimai.business.page.home.cache.d.a
            public final void b(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf77052b6219d928cade4d779725002a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf77052b6219d928cade4d779725002a");
                    return;
                }
                a.this.a(str, new Throwable("onCacheError"));
                i.d(new com.sankuai.waimai.business.page.common.log.a().a("promotion_bg_download").b("promotion_cache_error").c(str).b(true).b());
            }

            @Override // com.sankuai.waimai.business.page.home.cache.d.a
            public final void a(String str, Throwable th) {
                Object[] objArr2 = {str, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec47d09fbbe9ee6efd1f57dc77c2172c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec47d09fbbe9ee6efd1f57dc77c2172c");
                    return;
                }
                a.this.a(str, th);
                a.AbstractC1040a b = new com.sankuai.waimai.business.page.common.log.a().a("promotion_bg_download").b("promotion_download_error");
                i.d(b.c(str + "#" + th.getMessage()).b(true).b());
            }
        };
        this.b = context;
    }

    public final synchronized void a(final h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77e1d0c71f4a889640b495f48cbbdb3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77e1d0c71f4a889640b495f48cbbdb3e");
        } else if (this.d.get(hVar.g) != null) {
            this.d.put(hVar.g, hVar);
        } else {
            l.a(new l.a() { // from class: com.sankuai.waimai.business.page.home.head.promotionbg.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50a3dd33a5e6a23cd4dbcadea175d64b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50a3dd33a5e6a23cd4dbcadea175d64b");
                        return;
                    }
                    a.this.d.put(hVar.g, hVar);
                    new com.sankuai.waimai.business.page.home.cache.d(a.this.b).a(hVar.g, a.this.e);
                }
            }, "DOWNLOAD_MANAGER_ENQUEUE");
        }
    }

    public final synchronized void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "024d9fd26803d8672b0c6d5592dc68ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "024d9fd26803d8672b0c6d5592dc68ec");
            return;
        }
        h hVar = this.d.get(str);
        if (this.c != null) {
            this.c.a(hVar);
        }
    }

    public final synchronized void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6879a19d331a8fa1dd6a5a63169c38c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6879a19d331a8fa1dd6a5a63169c38c5");
            return;
        }
        h remove = this.d.remove(str);
        if (this.c != null) {
            this.c.a(remove, th);
        }
    }
}
