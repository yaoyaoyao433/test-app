package com.sankuai.waimai.mach.common;

import android.os.Handler;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.ASTTemplate;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.jsv8.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public ConcurrentHashMap<String, ASTTemplate> b;
    private Mach c;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(Exception exc);

        @MainThread
        void a(@NonNull Map<String, Object> map, @Nullable Map<String, Object> map2, com.sankuai.waimai.mach.model.data.a aVar);
    }

    public d(Mach mach) {
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65ebe1ac267695eaaa12cd8b6fdf4df8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65ebe1ac267695eaaa12cd8b6fdf4df8");
            return;
        }
        this.b = new ConcurrentHashMap<>();
        this.c = mach;
    }

    public final void a(final Map<String, Object> map, int i, final a aVar, Handler handler) {
        Object[] objArr = {map, Integer.valueOf(i), aVar, handler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a657b89243f0b32f52defcc353aafdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a657b89243f0b32f52defcc353aafdd");
        } else if (this.c != null && this.c.getMachBundle() != null && this.c.getV8JSEngine() != null) {
            this.c.getV8JSEngine().a(map, new b.a() { // from class: com.sankuai.waimai.mach.common.d.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.jsv8.b.a
                public final void a(Map<String, Object> map2, Map<String, Object> map3, com.sankuai.waimai.mach.model.data.a aVar2) {
                    Object[] objArr2 = {map2, map3, aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45bcbd01bdf30065ad4f9690055eb2c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45bcbd01bdf30065ad4f9690055eb2c0");
                        return;
                    }
                    if (map2 == null || map2.size() <= 0) {
                        map2 = map;
                    }
                    if (aVar != null) {
                        aVar.a(map2, map3, aVar2);
                    }
                }

                @Override // com.sankuai.waimai.mach.jsv8.b.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ca98a57cd594f45e479a8f70809327d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ca98a57cd594f45e479a8f70809327d");
                    } else if (aVar != null) {
                        aVar.a(exc);
                    }
                }
            }, handler);
        } else {
            com.sankuai.waimai.mach.render.d.a(this.c, 8, new NullPointerException("machBundle or iJSEngine is null"));
        }
    }

    public final void a(Map<String, Object> map, int i, a aVar) {
        Object[] objArr = {map, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a6e469f12e3ed1dc61a7ea3fa83af1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a6e469f12e3ed1dc61a7ea3fa83af1");
        } else {
            a(map, i, aVar, Mach.getMainHandler());
        }
    }
}
