package com.sankuai.waimai.business.page.home.head.banner.live;

import android.app.Activity;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.mach.container.d;
import com.sankuai.waimai.mach.container.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
@DynamicBinder(modelType = LiveBannerResponse.class, nativeId = {"wm_home_head_live_banner_mach"}, viewModel = c.class)
/* loaded from: classes4.dex */
public class a extends com.sankuai.waimai.business.page.common.arch.a<LiveBannerResponse> implements com.sankuai.waimai.business.page.home.head.b {
    public static ChangeQuickRedirect v;
    private List<com.sankuai.waimai.business.page.home.head.c> A;
    private d B;
    b w;
    boolean x;
    private boolean y;
    private View z;

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final /* synthetic */ void d(LiveBannerResponse liveBannerResponse) {
        LiveBannerResponse liveBannerResponse2 = liveBannerResponse;
        Object[] objArr = {liveBannerResponse2};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "401917e3cd8a7c220b5159f5bcfe772e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "401917e3cd8a7c220b5159f5bcfe772e");
            return;
        }
        super.d((a) liveBannerResponse2);
        if (liveBannerResponse2 != null) {
            try {
                this.w.w = false;
                String str = liveBannerResponse2.templateId;
                if (liveBannerResponse2.windowCardInfo != null) {
                    Map<String, Object> map = liveBannerResponse2.windowCardInfo;
                    map.put("isWifi", Boolean.valueOf(p.d(com.meituan.android.singleton.b.a.getApplicationContext())));
                    this.u.setVisibility(0);
                    this.w.a(str, null, map, g.a(com.meituan.android.singleton.b.a.getApplicationContext()), 0);
                    return;
                }
                this.y = true;
                this.u.setVisibility(8);
            } catch (Exception e) {
                this.y = true;
                this.u.setVisibility(8);
                com.sankuai.waimai.foundation.utils.log.a.b("AcrossBannerMachBlock", e.getMessage(), new Object[0]);
            }
        }
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.x = true;
        return true;
    }

    public a(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d209c97d9a220106bb5caf7514ce168e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d209c97d9a220106bb5caf7514ce168e");
            return;
        }
        this.A = new CopyOnWriteArrayList();
        this.B = new e() { // from class: com.sankuai.waimai.business.page.home.head.banner.live.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a(com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa715b32c54545bb26ead7eeca969550", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa715b32c54545bb26ead7eeca969550");
                    return;
                }
                super.a(aVar2);
                if (a.this.u == null || a.this.z == null || aVar2 == null || aVar2.h() == null || aVar2.h().get(RemoteMessageConst.Notification.VISIBILITY) == null) {
                    return;
                }
                if (aVar2.h().get(RemoteMessageConst.Notification.VISIBILITY) == Boolean.FALSE) {
                    a.this.u.setVisibility(8);
                    a.this.z.setVisibility(8);
                    return;
                }
                a.this.u.setVisibility(0);
                a.this.z.setVisibility(0);
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "100dd6ae4c0817a322d68f905a8563f8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "100dd6ae4c0817a322d68f905a8563f8");
                } else {
                    super.c();
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e437993a76b02eda2b69191d5373c35d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e437993a76b02eda2b69191d5373c35d");
                } else {
                    super.b();
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "747f2131a559fd6731225b7ce1ee2d1d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "747f2131a559fd6731225b7ce1ee2d1d");
                } else {
                    super.f();
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7811603acbe4a5c4865c94b4bfbb52c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7811603acbe4a5c4865c94b4bfbb52c");
                } else {
                    super.e();
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33729fcee3b40a6298c2e62b58290c3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33729fcee3b40a6298c2e62b58290c3a");
                    return;
                }
                super.d();
                if (a.this.w == null) {
                    return;
                }
                a.a(a.this, true);
                com.sankuai.waimai.mach.node.a l = a.this.w.l();
                if (l == null || l.f == null || TextUtils.isEmpty(l.f.getTemplateId())) {
                    return;
                }
                com.sankuai.waimai.guidepop.manager.b.a().a(l.f.getTemplateId(), l);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [com.meituan.android.cube.pga.type.a] */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.meituan.android.cube.pga.type.a] */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.meituan.android.cube.pga.type.a] */
    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        String generatePageInfoKey;
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cb1834e9c45ffffcbc247721b99e592", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cb1834e9c45ffffcbc247721b99e592");
        }
        this.u = LayoutInflater.from(this.t).inflate(R.layout.wm_page_main_head_live_banner, viewGroup, false);
        this.z = this.u.findViewById(R.id.layout_live_banner_mach);
        Activity activity = this.s.F;
        String q = this.s.q();
        String i = this.n.i();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = v;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ee3ff84c36d4d5ee8a92c0c5340ac79", RobustBitConfig.DEFAULT_VALUE)) {
            generatePageInfoKey = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ee3ff84c36d4d5ee8a92c0c5340ac79");
        } else if (F() == 0) {
            generatePageInfoKey = "";
        } else {
            generatePageInfoKey = AppUtil.generatePageInfoKey(F().h() != null ? F().h() : F().b());
        }
        this.w = new b(activity, q, i, generatePageInfoKey);
        this.w.a(this.B);
        this.w.h();
        this.w.a((ViewGroup) this.z, this.n.k(), "waimai");
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = v;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0da5fc0b230fe9c1b66cd8affd7729a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0da5fc0b230fe9c1b66cd8affd7729a2");
        } else {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.sankuai.waimai.business.page.home.head.banner.live.LiveBannerMachBlock$4
                public static ChangeQuickRedirect a;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Context context2;
                    Object[] objArr4 = {context, intent};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bfd09f9c77e4d97fd9d185ffeedd6ca2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bfd09f9c77e4d97fd9d185ffeedd6ca2");
                    } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        context2 = a.this.t;
                        boolean d = p.d(context2);
                        HashMap hashMap = new HashMap();
                        hashMap.put("isWifi", Boolean.valueOf(d));
                        a aVar = a.this;
                        Object[] objArr5 = {"network_state_change", hashMap};
                        ChangeQuickRedirect changeQuickRedirect5 = a.v;
                        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "c519387c2ac6bbdb231989e82b9048f0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "c519387c2ac6bbdb231989e82b9048f0");
                        } else {
                            aVar.w.b("network_state_change", hashMap);
                        }
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (this.t != null) {
                this.t.registerReceiver(broadcastReceiver, intentFilter);
            }
        }
        a(this.s);
        return this.u;
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void a(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f5fc6c3dacc3b3650f953caaf874a2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f5fc6c3dacc3b3650f953caaf874a2d");
            return;
        }
        super.a(pageFragment);
        HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(pageFragment).a(HomePageViewModel.class);
        homePageViewModel.d.a(new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.head.banner.live.a.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                boolean z = true;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "feb72119826762101cef35aef5c0e16d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "feb72119826762101cef35aef5c0e16d");
                } else if (bool2 != null) {
                    a aVar = a.this;
                    boolean booleanValue = bool2.booleanValue();
                    Object[] objArr3 = {Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a.v;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "09917191d614ae67ebc1178d840649f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "09917191d614ae67ebc1178d840649f0");
                    } else if (aVar.w != null) {
                        aVar.w.a((aVar.x && booleanValue) ? false : false);
                        aVar.w.b(booleanValue);
                    }
                }
            }
        });
        homePageViewModel.s.a(this.s, new l<List<com.meituan.android.cube.pga.block.a>>() { // from class: com.sankuai.waimai.business.page.home.head.banner.live.a.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable List<com.meituan.android.cube.pga.block.a> list) {
                List<com.meituan.android.cube.pga.block.a> list2 = list;
                boolean z = true;
                Object[] objArr2 = {list2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee2892ba7ed3610be60a388b139db746", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee2892ba7ed3610be60a388b139db746");
                } else if (list2 == null || com.sankuai.waimai.foundation.utils.d.a(list2)) {
                } else {
                    Iterator<com.meituan.android.cube.pga.block.a> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (it.next() instanceof a) {
                            break;
                        }
                    }
                    if (z) {
                        return;
                    }
                    a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.v;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "b1e591efe9f751d85f74cbbd67e9f5f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "b1e591efe9f751d85f74cbbd67e9f5f3");
                    } else if (aVar.w == null || aVar.w.l() == null || aVar.w.l().f == null) {
                    } else {
                        try {
                            aVar.w.l().f.onDestroy();
                        } catch (Exception e) {
                            e.printStackTrace();
                            com.sankuai.waimai.foundation.utils.log.a.a(e);
                        }
                    }
                }
            }
        });
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void a(com.meituan.android.cube.pga.viewmodel.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53233fe5382fe58ccc13bedb6a458020", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53233fe5382fe58ccc13bedb6a458020");
        } else {
            super.a(aVar);
        }
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void b(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33540ac238ad9b46f67679a165f26470", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33540ac238ad9b46f67679a165f26470");
        } else if (rect == null || this.u == null) {
        } else {
            if (this.u.getWindowVisibility() == 0 && Rect.intersects(rect, ah.a(this.u))) {
                if (this.x) {
                    return;
                }
                this.x = true;
                this.w.a(true);
            } else if (this.x) {
                this.x = false;
                this.w.w = false;
                this.w.a(false);
            }
        }
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a2fe9d0b124ffd88ae8599117e41fbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a2fe9d0b124ffd88ae8599117e41fbf");
        } else if (this.w != null) {
            if (this.w.w) {
                ((com.sankuai.waimai.platform.dynamic.a) this.w).e = true;
                this.w.b();
                return;
            }
            ((com.sankuai.waimai.platform.dynamic.a) this.w).e = false;
        }
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1174ab15b8fe0e8662433494872039a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1174ab15b8fe0e8662433494872039a4");
        } else if (this.w != null) {
            this.w.f();
        }
    }

    @Override // com.sankuai.waimai.business.page.home.head.b
    public final void a(com.sankuai.waimai.business.page.home.head.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf9b8c3eb713df1b6e65c53a7bfc7376", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf9b8c3eb713df1b6e65c53a7bfc7376");
        } else if (this.A.contains(cVar)) {
        } else {
            this.A.add(cVar);
        }
    }

    @Override // com.sankuai.waimai.business.page.home.head.b
    public final void b(com.sankuai.waimai.business.page.home.head.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b48743d972b0c54b6569544f9372f17d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b48743d972b0c54b6569544f9372f17d");
        } else if (this.A.contains(cVar)) {
            this.A.remove(cVar);
        }
    }

    @Override // com.sankuai.waimai.business.page.home.head.b
    public final boolean ar_() {
        return this.y;
    }
}
