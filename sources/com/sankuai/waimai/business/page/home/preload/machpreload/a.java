package com.sankuai.waimai.business.page.home.preload.machpreload;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.android.jarvis.n;
import com.sankuai.waimai.mach.manager_new.b;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import rx.d;
import rx.functions.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.mach.recycler.b b;
    public b.a c;
    private Set<PreLoadTemplate> d;
    private final ExecutorService e;
    private final ExecutorService f;
    private Gson g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05e9561027f05ab32ed8941b59cb2bfa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05e9561027f05ab32ed8941b59cb2bfa");
            return;
        }
        this.e = c.a("wm-pre-load-mach-bundle", n.PRIORITY_HIGH);
        this.f = c.a("wm-home-store-mach-bundle", n.PRIORITY_HIGH);
        this.g = new Gson();
        this.b = new com.sankuai.waimai.mach.recycler.b("waimai");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.preload.machpreload.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0792a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff714c3d2242caf66f45d674e543ef2a", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff714c3d2242caf66f45d674e543ef2a") : C0792a.a;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44724f74dded6549f860d7b1e812b3cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44724f74dded6549f860d7b1e812b3cd");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c1fcfb4f99b7093d3dc42ec698ce3f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c1fcfb4f99b7093d3dc42ec698ce3f9");
        } else {
            c();
            String b = q.a(com.meituan.android.singleton.b.a, "waimai").b("mach_pre_load_store_key", "");
            if (TextUtils.isEmpty(b)) {
                this.d.add(new PreLoadTemplate("poilist_poi_module", "waimai_mach_usercenter_homepage_future_poi_style_1", "waimai_mach_usercenter_homepage_future_poi_style_1", "mach"));
            } else {
                this.d = (Set) this.g.fromJson(b, new TypeToken<CopyOnWriteArraySet<PreLoadTemplate>>() { // from class: com.sankuai.waimai.business.page.home.preload.machpreload.a.2
                }.getType());
            }
        }
        d.a((Iterable) this.d).b(rx.schedulers.a.a(this.e)).d(new g<PreLoadTemplate, Object>() { // from class: com.sankuai.waimai.business.page.home.preload.machpreload.a.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ Object call(PreLoadTemplate preLoadTemplate) {
                PreLoadTemplate preLoadTemplate2 = preLoadTemplate;
                Object[] objArr3 = {preLoadTemplate2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b5b2d44d505d15f7bf5eb0c3518ce496", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b5b2d44d505d15f7bf5eb0c3518ce496");
                }
                if (preLoadTemplate2 != null) {
                    if (a.this.b == null) {
                        a.this.b = new com.sankuai.waimai.mach.recycler.b("waimai");
                    }
                    a.this.b.a(preLoadTemplate2.templateId, preLoadTemplate2.preSetTemplateId, preLoadTemplate2.moduleId, 5000);
                    return null;
                }
                return null;
            }
        }).f();
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6857beec24e915d879d63213c1ffb845", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6857beec24e915d879d63213c1ffb845");
            return;
        }
        if (this.d == null) {
            this.d = new CopyOnWriteArraySet();
        }
        this.d.clear();
        if (this.b != null) {
            this.b.a();
        }
    }

    public final void a(RocksServerModel rocksServerModel) {
        int i = 0;
        Object[] objArr = {rocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ef506fe3d2e2fcc5c58aa859646535e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ef506fe3d2e2fcc5c58aa859646535e");
        } else if (rocksServerModel != null && rocksServerModel.moduleList != null && rocksServerModel.moduleList.size() > 0) {
            c();
            for (RocksServerModel rocksServerModel2 : rocksServerModel.moduleList) {
                if (rocksServerModel2 != null && TextUtils.equals(rocksServerModel2.renderMode, "mach")) {
                    i++;
                    if (i > 3) {
                        break;
                    }
                    this.d.add(new PreLoadTemplate(rocksServerModel2.moduleId, rocksServerModel2.templateId, rocksServerModel2.templatePhId, rocksServerModel2.renderMode));
                }
            }
            if (this.d.size() > 0) {
                q.a(com.meituan.android.singleton.b.a, "waimai").a("mach_pre_load_store_key", this.g.toJson(this.d));
            }
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "906b3fecc443fa1d598d5d935ab892f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "906b3fecc443fa1d598d5d935ab892f1");
        } else {
            d.a(0, 1, 2).b(rx.schedulers.a.a(this.e)).c(new rx.functions.b<Integer>() { // from class: com.sankuai.waimai.business.page.home.preload.machpreload.a.3
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Integer num) {
                    Integer num2 = num;
                    Object[] objArr2 = {num2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6fb6a837331218a98be2412fa56a86f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6fb6a837331218a98be2412fa56a86f");
                    } else {
                        com.sankuai.waimai.mach.jsv8.jsexecutor.b.a().a(num2.intValue());
                    }
                }
            });
        }
    }
}
