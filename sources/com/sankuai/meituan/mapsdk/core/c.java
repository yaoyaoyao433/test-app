package com.sankuai.meituan.mapsdk.core;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public com.sankuai.meituan.mapsdk.core.render.model.f b;
    public com.sankuai.meituan.mapsdk.core.render.model.h c;
    public com.sankuai.meituan.mapsdk.core.render.model.f d;
    public com.sankuai.meituan.mapsdk.core.render.model.h e;
    public final d f;
    private final Map<String, com.sankuai.meituan.mapsdk.core.render.model.h> g;
    private final Map<String, com.sankuai.meituan.mapsdk.core.render.model.f> h;

    public c(@NonNull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2442b31beb0fab9ea5a83c3e810c8b89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2442b31beb0fab9ea5a83c3e810c8b89");
            return;
        }
        this.g = new HashMap();
        this.h = new HashMap();
        this.f = dVar;
    }

    private static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef476ec453624b61b46d0e0e9153aa3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef476ec453624b61b46d0e0e9153aa3a");
        }
        return "msa-layer-" + System.nanoTime() + ((int) (Math.random() * 100.0d));
    }

    public final void a(com.sankuai.meituan.mapsdk.core.render.model.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e282d6aca7107ac4c9164b1ebabc0a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e282d6aca7107ac4c9164b1ebabc0a4");
        } else if (hVar != null) {
            this.g.remove(hVar.f);
            hVar.a();
        }
    }

    public final com.sankuai.meituan.mapsdk.core.render.model.f a(@Nullable String str, @NonNull com.sankuai.meituan.mapsdk.core.render.model.h hVar) {
        Object[] objArr = {str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47058f93f909da9d934d072db1e8dc89", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.mapsdk.core.render.model.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47058f93f909da9d934d072db1e8dc89") : a(null, str, hVar);
    }

    public final com.sankuai.meituan.mapsdk.core.render.model.f a(com.sankuai.meituan.mapsdk.core.render.model.f fVar, @Nullable String str, @NonNull com.sankuai.meituan.mapsdk.core.render.model.h hVar) {
        Object[] objArr = {fVar, str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81d6a98088d81aa1c63a2d0233e989b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.core.render.model.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81d6a98088d81aa1c63a2d0233e989b3");
        }
        if (a(str) != null) {
            return a(str);
        }
        if (hVar == null) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            str = b();
        }
        com.sankuai.meituan.mapsdk.core.render.model.f fVar2 = new com.sankuai.meituan.mapsdk.core.render.model.f(this.f.d, str, hVar.f);
        hVar.a(this.f.p);
        if (fVar != null) {
            fVar2.a(fVar);
        } else {
            fVar2.a();
        }
        this.g.put(hVar.f, hVar);
        this.h.put(str, fVar2);
        return fVar2;
    }

    private com.sankuai.meituan.mapsdk.core.render.model.f a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ae8bcbc44d8bdde5680018c132c623a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.core.render.model.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ae8bcbc44d8bdde5680018c132c623a");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.h.get(str);
    }

    public final void a(com.sankuai.meituan.mapsdk.core.render.model.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec635100b4b818a294e1b6470cbb587c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec635100b4b818a294e1b6470cbb587c");
        } else if (fVar != null) {
            this.h.remove(fVar.d);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.render.model.f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "12b92d33b49594d487fc80440ad7b2b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "12b92d33b49594d487fc80440ad7b2b7");
            } else if (fVar.b != null) {
                fVar.b.removeAndDestroyLayer(fVar.c);
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70a813d2d337ba9ea21b0b0cf6ac6929", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70a813d2d337ba9ea21b0b0cf6ac6929");
            return;
        }
        for (String str : new ArrayList(this.g.keySet())) {
            if (!"mtmapsdk-location-source".equals(str)) {
                com.sankuai.meituan.mapsdk.core.render.model.h hVar = this.g.get(str);
                if (hVar != null) {
                    a(hVar);
                }
                this.g.remove(str);
            }
        }
        for (String str2 : new ArrayList(this.h.keySet())) {
            if (!"mtmapsdk-location-layer".equals(str2)) {
                com.sankuai.meituan.mapsdk.core.render.model.f fVar = this.h.get(str2);
                if (fVar != null) {
                    a(fVar);
                }
                this.h.remove(str2);
            }
        }
    }
}
