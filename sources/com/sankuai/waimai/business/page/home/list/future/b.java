package com.sankuai.waimai.business.page.home.list.future;

import android.arch.lifecycle.q;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Pair;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.cube.pga.common.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.b;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.mach.node.a;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b extends com.sankuai.waimai.rocks.view.block.c implements com.sankuai.waimai.ad.b, c {
    public static ChangeQuickRedirect s;
    com.meituan.android.cube.pga.common.b<Boolean> A;
    public j<com.sankuai.waimai.business.page.common.list.ai.c> B;
    public j<com.sankuai.waimai.rocks.model.a> C;
    public com.meituan.android.cube.pga.common.g<Map<String, Object>> D;
    private com.meituan.android.cube.pga.common.a<b.a, Map<String, Object>> E;
    private com.meituan.android.cube.pga.common.g<Boolean> F;
    private com.meituan.android.cube.pga.common.a<com.sankuai.waimai.mach.node.a, List<String>> G;
    com.meituan.android.cube.pga.common.b<Integer> t;
    public j<String> u;
    public j<String> v;
    com.meituan.android.cube.pga.common.b<Integer> w;
    public j<com.sankuai.waimai.mach.b> x;
    public j<Rect> y;
    public com.meituan.android.cube.pga.common.a<Pair<com.sankuai.waimai.mach.node.a, RocksServerModel>, Boolean> z;

    public b(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b064211e46ecbf29e4d5e7e3480fbf8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b064211e46ecbf29e4d5e7e3480fbf8a");
            return;
        }
        this.t = new com.meituan.android.cube.pga.common.b<>();
        this.u = new j<>(null);
        this.v = new j<>(null);
        this.w = new com.meituan.android.cube.pga.common.b<>();
        this.x = new j<>(null);
        this.y = new j<>(null);
        this.E = new com.meituan.android.cube.pga.common.a<>();
        this.z = new com.meituan.android.cube.pga.common.a<>();
        this.A = new com.meituan.android.cube.pga.common.b<>();
        this.B = new j<>(null);
        this.C = new j<>(null);
        this.D = new com.meituan.android.cube.pga.common.g<>();
        this.F = new com.meituan.android.cube.pga.common.g<>();
        this.G = new com.meituan.android.cube.pga.common.a<>();
    }

    @Override // com.sankuai.waimai.ad.b
    public final b.c at_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30fc3ad8db9db079bacd501f9ea6b662", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30fc3ad8db9db079bacd501f9ea6b662");
        }
        b.c cVar = new b.c();
        cVar.b = "c_m84bv26";
        cVar.h = this.x.a();
        this.E.b = new com.meituan.android.cube.pga.action.c<b.a, Map<String, Object>>() { // from class: com.sankuai.waimai.business.page.home.list.future.b.1
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meituan.android.cube.pga.action.c
            public Map<String, Object> a(b.a aVar) {
                Map map;
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a2d50c304c179a99ffd40579ad14374", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a2d50c304c179a99ffd40579ad14374");
                }
                if (aVar == null) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                switch (AnonymousClass4.a[aVar.a.ordinal()]) {
                    case 1:
                        Map<String, Object> map2 = b.this.D.a().b;
                        if (map2 != null) {
                            hashMap.putAll(map2);
                            break;
                        }
                        break;
                    case 2:
                        final g gVar = new g();
                        com.sankuai.waimai.mach.node.a aVar2 = aVar.b;
                        Object[] objArr3 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = g.a;
                        if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "c2b29ed66a3624cddc9dad64ec179664", RobustBitConfig.DEFAULT_VALUE)) {
                            map = (Map) PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "c2b29ed66a3624cddc9dad64ec179664");
                        } else if (aVar2 == null || aVar2.h() == null || !aVar2.h().containsKey("native-visible-check")) {
                            map = null;
                        } else {
                            final HashMap hashMap2 = new HashMap();
                            com.sankuai.waimai.mach.node.a.a(aVar2.c(), new a.InterfaceC1019a() { // from class: com.sankuai.waimai.business.page.home.list.future.g.2
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.mach.node.a.InterfaceC1019a
                                public final void a(com.sankuai.waimai.mach.node.a aVar3) {
                                    Object[] objArr4 = {aVar3};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3c670ce4ed529d33f41a44c940ea5980", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3c670ce4ed529d33f41a44c940ea5980");
                                    } else if (aVar3 == null) {
                                    } else {
                                        g.a(gVar, aVar3, hashMap2);
                                    }
                                }
                            });
                            map = hashMap2;
                        }
                        if (map != null) {
                            hashMap.putAll(map);
                        }
                        Map<String, Object> map3 = b.this.D.a().b;
                        if (map3 != null) {
                            hashMap.putAll(map3);
                        }
                        if (aVar.b == null) {
                            hashMap.put("current_screen", -1);
                        } else {
                            hashMap.put("current_screen", Integer.valueOf(com.sankuai.waimai.business.page.home.list.a.a().a(com.sankuai.waimai.business.page.home.list.a.d.intValue(), aVar.b.g())));
                        }
                        hashMap.put("first_load_uuid", com.sankuai.waimai.business.page.home.list.a.a().h);
                        hashMap.put(RaptorUploaderImpl.LOAD_TYPE, Integer.valueOf(com.sankuai.waimai.business.page.home.helper.d.a().b));
                        hashMap.put(DeviceInfo.USER_ID, String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d()));
                        int i = aVar.d;
                        com.sankuai.waimai.business.page.common.list.ai.c a2 = b.this.B.a();
                        com.sankuai.waimai.rocks.view.viewmodel.e c = a2 != null ? a2.c(i) : null;
                        if (c == null || c.s == null) {
                            com.sankuai.waimai.foundation.utils.log.a.e("ComplexBlock", "initAd item null", new Object[0]);
                            break;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(c.s.r);
                                hashMap.put("request_type", Integer.valueOf(jSONObject.optInt("request_type", 2)));
                                hashMap.put("seqNumber", Integer.valueOf(jSONObject.optInt("seqNumber", 0)));
                                hashMap.put("intent_type", Integer.valueOf(jSONObject.optInt("intent_type", 0)));
                                break;
                            } catch (Exception e) {
                                e.printStackTrace();
                                com.sankuai.waimai.foundation.utils.log.a.a(e);
                                break;
                            }
                        }
                        break;
                    case 3:
                    case 4:
                        com.sankuai.waimai.business.page.common.list.ai.c a3 = b.this.B.a();
                        if (a3 != null) {
                            a3.b(aVar.d);
                            a3.a(aVar.c);
                            break;
                        }
                        break;
                }
                return hashMap;
            }
        };
        cVar.i = this.E;
        cVar.j = this.z;
        cVar.k = this.A;
        cVar.f = this.y.a();
        this.F.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.business.page.home.list.future.b.2
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meituan.android.cube.pga.action.d
            /* renamed from: b */
            public Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db1c5bc6f8716e01758fcd9d955909c3", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db1c5bc6f8716e01758fcd9d955909c3");
                }
                try {
                    Fragment fragment = b.this.r;
                    if (fragment instanceof PageFragment) {
                        return Boolean.valueOf(((HomePageViewModel) q.a((PageFragment) fragment).a(HomePageViewModel.class)).T);
                    }
                } catch (Exception unused) {
                }
                return Boolean.FALSE;
            }
        };
        cVar.l = this.F;
        cVar.m = "waimai_common_report_procedure";
        com.sankuai.waimai.rocks.model.a a = this.C.a();
        if (a != null) {
            cVar.n = a.e;
            cVar.o = a.f;
        }
        this.G.b = new com.meituan.android.cube.pga.action.c<com.sankuai.waimai.mach.node.a, List<String>>() { // from class: com.sankuai.waimai.business.page.home.list.future.b.3
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meituan.android.cube.pga.action.c
            public List<String> a(com.sankuai.waimai.mach.node.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5eb9ecaf1d5c59b40c18bb39202898c", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5eb9ecaf1d5c59b40c18bb39202898c");
                }
                try {
                    Fragment fragment = b.this.r;
                    if (aVar == null || !(fragment instanceof PageFragment)) {
                        return null;
                    }
                    HomePageViewModel homePageViewModel = (HomePageViewModel) q.a((PageFragment) fragment).a(HomePageViewModel.class);
                    if (homePageViewModel != null && homePageViewModel.V != null) {
                        return homePageViewModel.V.a(aVar, false);
                    }
                    return new ArrayList();
                } catch (Exception e) {
                    e.printStackTrace();
                    com.sankuai.waimai.foundation.utils.log.a.a(e);
                    return null;
                }
            }
        };
        cVar.p = this.G;
        return cVar;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.list.future.b$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] a = new int[b.EnumC0675b.valuesCustom().length];

        static {
            try {
                a[b.EnumC0675b.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.EnumC0675b.ATTACH_RENDER_NODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.EnumC0675b.TRIGGER_EXPOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.EnumC0675b.TRIGGER_CLICK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.sankuai.waimai.ad.b
    public final com.meituan.android.cube.pga.common.b<Integer> au_() {
        return this.w;
    }
}
