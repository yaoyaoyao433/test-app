package com.sankuai.waimai.ad.view.mach;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.k;
import android.arch.lifecycle.q;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.b;
import com.sankuai.waimai.mach.c;
import com.sankuai.waimai.mach.js.HttpJSNativeMethod;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.mach.js.KNBCallback;
import com.sankuai.waimai.mach.r;
import com.sankuai.waimai.mach.utils.e;
import com.sankuai.waimai.platform.capacity.ad.WMADStrategyNativeModule;
import com.sankuai.waimai.platform.mach.extension.nested.EmbedProcessor;
import com.sankuai.waimai.platform.mach.lottieextend.LottieTagProcessor;
import com.sankuai.waimai.platform.mach.monitor.c;
import com.sankuai.waimai.platform.mach.order.EditTextTagProcessor;
import com.sankuai.waimai.platform.mach.order.OrderRichTextProcessor;
import com.sankuai.waimai.platform.mach.statistics.CatJsNativeMethod;
import com.sankuai.waimai.platform.mach.statistics.d;
import com.sankuai.waimai.platform.mach.tag.DynamicTagProcessor;
import com.sankuai.waimai.platform.mach.util.WmMachImageLoaderUtil;
import com.sankuai.waimai.pouch.viewmodel.PouchViewModel;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends com.sankuai.waimai.pouch.mach.container.a {
    public static ChangeQuickRedirect a;
    public b b;
    private com.sankuai.waimai.platform.mach.extension.a c;
    private c d;
    private Dialog e;
    private com.sankuai.waimai.pouch.mach.container.b<String> f;
    private PouchViewModel g;

    public a(Activity activity, com.sankuai.waimai.pouch.model.c cVar, com.sankuai.waimai.pouch.a aVar) {
        super(activity, cVar, aVar);
        Object[] objArr = {activity, cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6c7bf38d598d0184d9bf9df560de13f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6c7bf38d598d0184d9bf9df560de13f");
            return;
        }
        this.f = new com.sankuai.waimai.pouch.mach.container.b<>();
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            if (fragmentActivity.getFragmentManager() == null || fragmentActivity.getFragmentManager().isDestroyed()) {
                return;
            }
            this.g = (PouchViewModel) q.a(fragmentActivity).a(PouchViewModel.class);
        }
    }

    public final void a(c cVar, Map<String, Object> map) {
        Object[] objArr = {cVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8da553ebb8ce050868ff83b619946569", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8da553ebb8ce050868ff83b619946569");
            return;
        }
        this.d = cVar;
        this.p = map;
        com.sankuai.waimai.platform.mach.monitor.b a2 = com.sankuai.waimai.platform.mach.monitor.b.a();
        Object[] objArr2 = {cVar, map};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.mach.monitor.b.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "99c685d026aa1407bdb6c5b882a49566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "99c685d026aa1407bdb6c5b882a49566");
        } else if (a2.c(cVar, map)) {
            try {
                e.c(a2.b);
                if (e.a(a2.b, map)) {
                    return;
                }
                a2.a("BizTraceAdProductCount", cVar, 0);
                a2.a("BizTraceNRTAdProductCount", cVar, map, 0);
                a2.b.add(new WeakReference<>(map));
            } catch (Exception e) {
                a2.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.pouch.mach.container.a, com.sankuai.waimai.mach.container.a
    public void a(Mach.a aVar) {
        String str;
        FragmentActivity fragmentActivity;
        k<JSInvokeNativeMethod> kVar;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "242f2a525168386bf649a484b998e84d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "242f2a525168386bf649a484b998e84d");
            return;
        }
        super.a(aVar);
        aVar.e = new com.sankuai.waimai.mach.c() { // from class: com.sankuai.waimai.ad.view.mach.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.c
            public final void a(c.a aVar2, com.sankuai.waimai.mach.k kVar2) {
                Object[] objArr2 = {aVar2, kVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc7af01c8c8090dc5f91fc8c7a65db1b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc7af01c8c8090dc5f91fc8c7a65db1b");
                } else {
                    WmMachImageLoaderUtil.a(aVar2, kVar2);
                }
            }
        };
        aVar.l = new b() { // from class: com.sankuai.waimai.ad.view.mach.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.b
            public final boolean a(String str2, View view, com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {str2, view, aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbe146845e62b790dc798c6205be243c", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbe146845e62b790dc798c6205be243c")).booleanValue();
                }
                if (a.this.b == null || !a.this.b.a(str2, view, aVar2)) {
                    if (aVar2.h() == null || aVar2.h().get("extra") == null) {
                        com.sankuai.waimai.foundation.router.a.a(a.this.j, str2);
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString("extra", aVar2.h().get("extra").toString());
                        com.sankuai.waimai.foundation.router.a.a(a.this.j, str2, bundle);
                    }
                }
                return true;
            }

            @Override // com.sankuai.waimai.mach.b
            public final boolean b(String str2, View view, com.sankuai.waimai.mach.node.a aVar2) {
                Object[] objArr2 = {str2, view, aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40a9b1684c5b0bf42b0b35a923a7aca1", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40a9b1684c5b0bf42b0b35a923a7aca1")).booleanValue();
                }
                if (a.this.b != null) {
                    return a.this.b.b(str2, view, aVar2);
                }
                return false;
            }
        };
        aVar.a(new LottieTagProcessor());
        aVar.a(new EmbedProcessor());
        aVar.a(new DynamicTagProcessor());
        aVar.a(new EditTextTagProcessor());
        aVar.a(new OrderRichTextProcessor());
        aVar.g = new r() { // from class: com.sankuai.waimai.ad.view.mach.a.3
            @Override // com.sankuai.waimai.mach.r, com.sankuai.waimai.mach.j
            public final int a() {
                return R.drawable.wm_common_dot_square_yellow_selected;
            }

            @Override // com.sankuai.waimai.mach.r, com.sankuai.waimai.mach.j
            public final int b() {
                return R.drawable.wm_common_dot_square_yellow_normal;
            }
        };
        aVar.a(new d(this.j));
        aVar.a(new com.sankuai.waimai.platform.mach.extension.nestedv2.c());
        aVar.a(new WMADStrategyNativeModule());
        Activity activity = this.j;
        if (this.y == null) {
            str = "default";
        } else {
            com.sankuai.waimai.pouch.plugin.params.a aVar2 = this.y;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.pouch.plugin.params.b.a;
            if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "90e18a6d95d5480611d58577dba48e1d", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "90e18a6d95d5480611d58577dba48e1d");
            } else {
                str = aVar2.c == null ? "" : aVar2.c.d;
            }
        }
        aVar.a(new CatJsNativeMethod(activity, str));
        aVar.a(new HttpJSNativeMethod() { // from class: com.sankuai.waimai.ad.view.mach.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.HttpJSNativeMethod
            public final void httpRequest(String str2, Map<String, String> map, j<ap> jVar) {
                Object[] objArr3 = {str2, map, jVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3d5f550d87e62376d51781fb440055ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3d5f550d87e62376d51781fb440055ed");
                } else {
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((HttpJSNativeMethod.JSRequest) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) HttpJSNativeMethod.JSRequest.class)).get(str2, map), jVar, a.this.i);
                }
            }
        });
        if (com.sankuai.waimai.pouch.c.a() && this.l != null && (this.l.getContext() instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) this.l.getContext()) != null && !fragmentActivity.isDestroyed()) {
            PouchViewModel pouchViewModel = (PouchViewModel) q.a(fragmentActivity).a(PouchViewModel.class);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = PouchViewModel.a;
            if (PatchProxy.isSupport(objArr3, pouchViewModel, changeQuickRedirect3, false, "3ae9f214a73c50c9517dfbd35b6bbfd0", RobustBitConfig.DEFAULT_VALUE)) {
                kVar = (k) PatchProxy.accessDispatch(objArr3, pouchViewModel, changeQuickRedirect3, false, "3ae9f214a73c50c9517dfbd35b6bbfd0");
            } else {
                if (pouchViewModel.f == null) {
                    pouchViewModel.f = new k<>();
                }
                kVar = pouchViewModel.f;
            }
            aVar.a(kVar.a());
        }
        aVar.k = new KNBCallback() { // from class: com.sankuai.waimai.ad.view.mach.a.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.KNBCallback
            public final void callback(String str2) {
                Object[] objArr4 = {str2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "78bb0c817a60a3f494ed58f53a7d8c31", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "78bb0c817a60a3f494ed58f53a7d8c31");
                } else if (!"getUserInfo".equals(str2) || com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                } else {
                    com.sankuai.waimai.platform.domain.manager.user.a.a((Context) a.this.j);
                }
            }
        };
    }

    @Override // com.sankuai.waimai.mach.container.a
    public final void a(Mach mach) {
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8190f320e3b6ddf7cf8c5e95b53f336", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8190f320e3b6ddf7cf8c5e95b53f336");
            return;
        }
        super.a(mach);
        if (this.c != null) {
            com.sankuai.waimai.platform.domain.manager.user.a.i().b(this.c);
        }
        this.c = new com.sankuai.waimai.platform.mach.extension.a(mach);
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(this.c);
    }

    @Override // com.sankuai.waimai.pouch.mach.container.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf019465de1019685e089c52ec7eeb4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf019465de1019685e089c52ec7eeb4d");
            return;
        }
        super.a();
        com.sankuai.waimai.platform.mach.monitor.b.a().a(this.d, this.p);
    }

    @Override // com.sankuai.waimai.pouch.mach.container.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5c80f57b008492283afe0107c42866c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5c80f57b008492283afe0107c42866c");
        } else {
            super.b();
        }
    }

    @Override // com.sankuai.waimai.pouch.mach.container.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72e0d507d05a016044d78db2df55c311", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72e0d507d05a016044d78db2df55c311");
            return;
        }
        super.c();
        com.sankuai.waimai.platform.mach.monitor.b.a().a(this.d, this.p, com.sankuai.waimai.platform.mach.monitor.e.a(this.k));
    }

    @Override // com.sankuai.waimai.pouch.mach.container.a
    public void d() {
        com.sankuai.waimai.mach.node.a b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f3c0ea3249922e23d84b17a745160d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f3c0ea3249922e23d84b17a745160d5");
        } else if (this.l != null && q() && this.k != null) {
            List<com.sankuai.waimai.mach.node.a> searchNodeWithViewReport = this.k.searchNodeWithViewReport();
            if (com.sankuai.waimai.foundation.utils.d.a(searchNodeWithViewReport)) {
                return;
            }
            for (com.sankuai.waimai.mach.node.a aVar : searchNodeWithViewReport) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32d91012382f3a1bdb25a508aeb317f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32d91012382f3a1bdb25a508aeb317f6");
                } else if (aVar != null) {
                    if (!e.a(aVar, com.sankuai.waimai.mach.component.swiper.b.class)) {
                        if (e.a(aVar, com.sankuai.waimai.mach.component.scroller.b.class)) {
                            com.sankuai.waimai.mach.component.scroller.b bVar = (com.sankuai.waimai.mach.component.scroller.b) aVar.e.h;
                            if (!com.sankuai.waimai.foundation.utils.d.a(bVar.e())) {
                                List<Integer> e = bVar.e();
                                int indexOf = aVar.e.b().indexOf(aVar);
                                if (indexOf >= 0 && e.contains(Integer.valueOf(indexOf))) {
                                    a(aVar);
                                }
                            }
                        } else if (this.C != null && this.C.contains("crossLevelScroller") && (b = b(aVar)) != null) {
                            com.sankuai.waimai.mach.component.scroller.b bVar2 = (com.sankuai.waimai.mach.component.scroller.b) b.e.h;
                            if (!com.sankuai.waimai.foundation.utils.d.a(bVar2.e())) {
                                List<Integer> e2 = bVar2.e();
                                int indexOf2 = b.e.b().indexOf(b);
                                if (indexOf2 >= 0 && e2.contains(Integer.valueOf(indexOf2))) {
                                    a(aVar);
                                }
                            }
                        } else if (this.D != null && this.E != null) {
                            if (b(aVar) == null) {
                                a(aVar, this.E);
                            } else {
                                com.sankuai.waimai.mach.node.a aVar2 = aVar.e;
                                if (aVar2 != null && aVar2.b() != null) {
                                    int indexOf3 = aVar2.b().indexOf(aVar);
                                    a(aVar, this.E + indexOf3);
                                } else {
                                    a(aVar, this.E);
                                }
                            }
                        } else {
                            a(aVar);
                        }
                    } else if (aVar.e.b().indexOf(aVar) == ((com.sankuai.waimai.mach.component.swiper.b) aVar.e.h).b) {
                        a(aVar);
                    }
                }
            }
            l();
        }
    }

    @Override // com.sankuai.waimai.pouch.mach.container.a, com.sankuai.waimai.mach.container.a
    public void a(@NonNull String str, @Nullable Map<String, Object> map) {
        k<Void> kVar;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a850a44768139fc806d1c5505bad69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a850a44768139fc806d1c5505bad69");
            return;
        }
        super.a(str, map);
        if (TextUtils.equals("indexChanged", str)) {
            d();
        } else if (TextUtils.equals("std_trigger_expose_event", str)) {
            d();
        }
        if ((this.j instanceof FragmentActivity) && TextUtils.equals("show_linkage_frame_finished_event", str) && this.g != null) {
            PouchViewModel pouchViewModel = this.g;
            Object[] objArr2 = {str, map};
            ChangeQuickRedirect changeQuickRedirect2 = PouchViewModel.a;
            if (PatchProxy.isSupport(objArr2, pouchViewModel, changeQuickRedirect2, false, "4cfb13e93f4a7a434ea16e6343ba2f93", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, pouchViewModel, changeQuickRedirect2, false, "4cfb13e93f4a7a434ea16e6343ba2f93");
            } else if (TextUtils.equals("show_linkage_frame_finished_event", str)) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = PouchViewModel.a;
                if (PatchProxy.isSupport(objArr3, pouchViewModel, changeQuickRedirect3, false, "5fa40853c5cc8455ac3093fdbf35e320", RobustBitConfig.DEFAULT_VALUE)) {
                    kVar = (k) PatchProxy.accessDispatch(objArr3, pouchViewModel, changeQuickRedirect3, false, "5fa40853c5cc8455ac3093fdbf35e320");
                } else {
                    if (pouchViewModel.b == null) {
                        pouchViewModel.b = new k<>();
                    }
                    kVar = pouchViewModel.b;
                }
                kVar.b((k<Void>) null);
            }
        }
    }

    @Override // com.sankuai.waimai.pouch.mach.container.a
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1c75638c243a8216f4e70211d208d4c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1c75638c243a8216f4e70211d208d4c")).booleanValue();
        }
        if (e.c(this.j)) {
            return false;
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.e);
        this.e = com.sankuai.waimai.platform.widget.dialog.a.a(this.j);
        return true;
    }

    @Override // com.sankuai.waimai.pouch.mach.container.a
    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a83c424b41b1a21e3e58f8f0a839c15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a83c424b41b1a21e3e58f8f0a839c15")).booleanValue();
        }
        if (e.c(this.j)) {
            return false;
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.e);
        this.e = null;
        return true;
    }

    @Override // com.sankuai.waimai.pouch.mach.container.a, com.sankuai.waimai.mach.container.a, com.sankuai.waimai.mach.lifecycle.d, com.sankuai.waimai.mach.lifecycle.b
    public void onActivityDestroyed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "502a1d3cc8c00caf37e39c7fdd9c8e91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "502a1d3cc8c00caf37e39c7fdd9c8e91");
            return;
        }
        super.onActivityDestroyed();
        if (this.c != null) {
            com.sankuai.waimai.platform.domain.manager.user.a.i().b(this.c);
        }
    }

    private void a(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4430cf61c1b5643ac8e315c1bf0c4669", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4430cf61c1b5643ac8e315c1bf0c4669");
        } else if (aVar == null || this.f == null || this.f.a(aVar.i) || !g()) {
        } else {
            t();
            this.k.triggerViewReport(aVar);
            this.f.b(aVar.i);
        }
    }

    private void a(com.sankuai.waimai.mach.node.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5ae7b5379ce3f5d6334695765161e0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5ae7b5379ce3f5d6334695765161e0f");
        } else if (aVar == null || this.D == null || this.E == null || this.D.contains(str) || !ah.b(aVar.g())) {
        } else {
            t();
            this.k.triggerViewReport(aVar);
            this.D.add(str);
        }
    }

    public boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fc241fe044bff4680e49e9b9598370b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fc241fe044bff4680e49e9b9598370b")).booleanValue() : this.k != null && q() && s();
    }

    @Override // com.sankuai.waimai.pouch.mach.container.a
    public final void a(b bVar) {
        this.b = bVar;
    }

    private com.sankuai.waimai.mach.node.a b(com.sankuai.waimai.mach.node.a aVar) {
        while (true) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4c11cb757252d36854c905a65cc921f", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4c11cb757252d36854c905a65cc921f");
            }
            if (aVar == null) {
                return null;
            }
            if (e.a(aVar, com.sankuai.waimai.mach.component.scroller.b.class)) {
                return aVar;
            }
            aVar = aVar.e;
        }
    }

    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a51e5b665a3c15d48945c88b7668b55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a51e5b665a3c15d48945c88b7668b55");
            return;
        }
        com.sankuai.waimai.pouch.mach.container.b<String> bVar = this.f;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.pouch.mach.container.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "ae5fe8317b4b3e4af6cacd31f5096464", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "ae5fe8317b4b3e4af6cacd31f5096464");
        } else {
            bVar.b.clear();
        }
    }

    public final Mach i() {
        return this.k;
    }
}
