package com.sankuai.waimai.business.restaurant.poicontainer.mach;

import android.app.Activity;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.mach.c;
import com.sankuai.waimai.mach.common.j;
import com.sankuai.waimai.mach.container.e;
import com.sankuai.waimai.platform.mach.a;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.platform.mach.a {
    public static ChangeQuickRedirect a;
    public boolean b;
    private final String c;
    private com.sankuai.waimai.mach.d d;
    private c.a e;
    private Handler f;
    private com.sankuai.waimai.mach.container.d g;

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        bVar.b = true;
        return true;
    }

    public b(Activity activity, String str, String str2, c.a aVar) {
        super(activity, str2);
        Object[] objArr = {activity, str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6719735b7525f96dbe66f197ce895b36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6719735b7525f96dbe66f197ce895b36");
            return;
        }
        this.c = "RestaurantMachContainer";
        this.g = new e() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.mach.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "752c0c1353f75ec323363be755a674cc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "752c0c1353f75ec323363be755a674cc");
                    return;
                }
                if (!b.this.b) {
                    b.this.b();
                    b.a(b.this, true);
                }
                b.this.f.post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.mach.b.1.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c25c83d8a96c4494b1d2276001c7696c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c25c83d8a96c4494b1d2276001c7696c");
                        } else if (b.this.e != null) {
                            b.this.e.a();
                        }
                    }
                });
            }
        };
        this.e = aVar;
        a(this.g);
        this.d = new com.sankuai.waimai.platform.dynamic.b(str, str2);
        this.f = new Handler(activity.getMainLooper());
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cf97fb2a8f81caf500ba0798e88538c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cf97fb2a8f81caf500ba0798e88538c");
        } else {
            super.b();
        }
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final void a(com.sankuai.waimai.mach.d dVar) {
        this.d = dVar;
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final com.sankuai.waimai.mach.d d() {
        return this.d;
    }

    @Override // com.sankuai.waimai.platform.mach.a, com.sankuai.waimai.mach.container.a
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53de5889218e286eef3ae38855a3f9b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53de5889218e286eef3ae38855a3f9b4");
            return;
        }
        super.a(str, map);
        if (!"jumpPage".equals(str) || map == null || map.get("url") == null || TextUtils.isEmpty(map.get("url").toString())) {
            return;
        }
        com.sankuai.waimai.foundation.router.a.a(this.j, map.get("url").toString());
    }

    public final void a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f668e0d6b98fcdb22befe9b9dedc8398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f668e0d6b98fcdb22befe9b9dedc8398");
        } else if (this.k == null) {
        } else {
            this.k.setUserLoginListener(jVar);
        }
    }

    @Override // com.sankuai.waimai.mach.container.a, com.sankuai.waimai.mach.container.b
    public final void b(@NonNull String str, @Nullable Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea264390dcfad1cb2897c91557c5ef88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea264390dcfad1cb2897c91557c5ef88");
        } else if (this.k == null || TextUtils.isEmpty(str)) {
        } else {
            this.k.sendJsEvent(str, map);
        }
    }

    public final void a(String str, Map<String, Object> map, a.InterfaceC1053a interfaceC1053a) {
        Object[] objArr = {str, map, interfaceC1053a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7274c6f50fcbf209ac88ea3a1f146d5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7274c6f50fcbf209ac88ea3a1f146d5b");
            return;
        }
        this.u = interfaceC1053a;
        c(str, map);
    }
}
