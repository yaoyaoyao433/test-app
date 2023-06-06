package com.sankuai.waimai.store.manager.preload;

import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import com.airbnb.lottie.e;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.b;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.widgets.lottie.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a d;
    public final Set<String> b;
    public final Map<String, e> c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.manager.preload.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1227a {
        void a();

        void b();
    }

    public static /* synthetic */ void c(a aVar, String str, InterfaceC1227a interfaceC1227a) {
        Object[] objArr = {str, interfaceC1227a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "beb6d18e6ab31ae82728cf4dd712cf85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "beb6d18e6ab31ae82728cf4dd712cf85");
            return;
        }
        aVar.b.add(str);
        if (interfaceC1227a != null) {
            interfaceC1227a.a();
        }
    }

    public static /* synthetic */ void d(a aVar, String str, InterfaceC1227a interfaceC1227a) {
        Object[] objArr = {str, interfaceC1227a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "d796fdcbbda467585cd8462b763b70e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "d796fdcbbda467585cd8462b763b70e4");
            return;
        }
        aVar.b.remove(str);
        if (interfaceC1227a != null) {
            interfaceC1227a.b();
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0738de6293155ec622fab5cca9931aa8", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0738de6293155ec622fab5cca9931aa8");
        }
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new a();
                }
            }
        }
        return d;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672a82f21834327d05757a41a7bf9be9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672a82f21834327d05757a41a7bf9be9");
            return;
        }
        this.b = new HashSet();
        this.c = new HashMap();
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d96dbb2d98658335c89226a928f920c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d96dbb2d98658335c89226a928f920c");
            return;
        }
        List<ResourcePreloadItem> list = (List) j.h().a("resource_preload/preload_url_list", new TypeToken<List<ResourcePreloadItem>>() { // from class: com.sankuai.waimai.store.manager.preload.a.1
        }.getType());
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return;
        }
        for (ResourcePreloadItem resourcePreloadItem : list) {
            if (resourcePreloadItem != null && !t.a(resourcePreloadItem.url)) {
                if (2 == resourcePreloadItem.type) {
                    b(resourcePreloadItem.url, null);
                } else {
                    a(resourcePreloadItem.url, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final InterfaceC1227a interfaceC1227a) {
        Object[] objArr = {str, interfaceC1227a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c939cd7e517bd2eddb46be6deeff913", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c939cd7e517bd2eddb46be6deeff913");
        } else if (!this.b.contains(str)) {
            m.a(str, ImageQualityUtil.a()).a(h.a(b.a()), h.d(b.a())).a(new b.a() { // from class: com.sankuai.waimai.store.manager.preload.a.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc47279b19f746faa0f7773bf2586aa3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc47279b19f746faa0f7773bf2586aa3");
                    } else {
                        a.c(a.this, str, interfaceC1227a);
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f090b95734756573aa3a02ccd8cd313", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f090b95734756573aa3a02ccd8cd313");
                    } else {
                        a.d(a.this, str, interfaceC1227a);
                    }
                }
            });
        } else if (interfaceC1227a != null) {
            interfaceC1227a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str, final InterfaceC1227a interfaceC1227a) {
        Object[] objArr = {str, interfaceC1227a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9d78f4258a3ef1c1cc6a9c48b46c094", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9d78f4258a3ef1c1cc6a9c48b46c094");
        } else if (!this.b.contains(str)) {
            al.a(new d(str, new com.sankuai.waimai.store.widgets.lottie.e() { // from class: com.sankuai.waimai.store.manager.preload.a.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.widgets.lottie.e
                public final void a(@Nullable Map<String, e> map) {
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2af0a029943d722138a9663d2ce0254", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2af0a029943d722138a9663d2ce0254");
                    } else if (map == null) {
                    } else {
                        e eVar = map.get(str);
                        if (eVar != null) {
                            a.this.c.put(str, eVar);
                            a.c(a.this, str, interfaceC1227a);
                            return;
                        }
                        a.this.c.remove(str);
                        a.d(a.this, str, interfaceC1227a);
                    }
                }
            }), "");
        } else if (interfaceC1227a != null) {
            interfaceC1227a.a();
        }
    }
}
