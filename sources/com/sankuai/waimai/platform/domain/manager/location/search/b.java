package com.sankuai.waimai.platform.domain.manager.location.search;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.manager.location.geo.DeliveryApi;
import com.sankuai.waimai.platform.domain.manager.location.geo.MafApi;
import com.sankuai.waimai.platform.domain.manager.location.model.MtAddressSearchResponse;
import com.sankuai.waimai.platform.domain.manager.location.search.a;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static q b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(MtAddressSearchResponse mtAddressSearchResponse);

        void a(String str);
    }

    public static void a(Context context, final a.C1048a c1048a, final WeakReference<a> weakReference, final String str) {
        a.C1048a c1048a2;
        Object[] objArr = {context, c1048a, weakReference, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cebd50048b8f81d6c35eefc2b197bb7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cebd50048b8f81d6c35eefc2b197bb7d");
            return;
        }
        ABStrategy strategy = ABTestManager.getInstance(context).getStrategy("waimai_address_create", null);
        String str2 = strategy != null ? strategy.expName : "";
        char c = 65535;
        if (str2.hashCode() == 65 && str2.equals("A")) {
            c = 0;
        }
        if (c == 0) {
            String e = com.sankuai.waimai.platform.domain.manager.user.a.i().e();
            StringBuilder sb = new StringBuilder();
            sb.append(com.sankuai.waimai.platform.domain.manager.user.a.i().d());
            String sb2 = sb.toString();
            String str3 = com.sankuai.waimai.addrsdk.manager.a.a().b().a() + "+" + System.currentTimeMillis();
            Object[] objArr2 = {"meituan_waimai_app"};
            ChangeQuickRedirect changeQuickRedirect2 = a.C1048a.a;
            if (PatchProxy.isSupport(objArr2, c1048a, changeQuickRedirect2, false, "f3bec86bab3bb81082d2792939065982", RobustBitConfig.DEFAULT_VALUE)) {
                c1048a2 = (a.C1048a) PatchProxy.accessDispatch(objArr2, c1048a, changeQuickRedirect2, false, "f3bec86bab3bb81082d2792939065982");
            } else {
                c1048a.b.r = "meituan_waimai_app";
                c1048a2 = c1048a;
            }
            Object[] objArr3 = {e};
            ChangeQuickRedirect changeQuickRedirect3 = a.C1048a.a;
            if (PatchProxy.isSupport(objArr3, c1048a2, changeQuickRedirect3, false, "4449b5233f8218c954b925b5b2d6745c", RobustBitConfig.DEFAULT_VALUE)) {
                c1048a2 = (a.C1048a) PatchProxy.accessDispatch(objArr3, c1048a2, changeQuickRedirect3, false, "4449b5233f8218c954b925b5b2d6745c");
            } else {
                c1048a2.b.s = e;
            }
            Object[] objArr4 = {str3};
            ChangeQuickRedirect changeQuickRedirect4 = a.C1048a.a;
            if (PatchProxy.isSupport(objArr4, c1048a2, changeQuickRedirect4, false, "97ad7f13680fdd10066f276f282a5047", RobustBitConfig.DEFAULT_VALUE)) {
                c1048a2 = (a.C1048a) PatchProxy.accessDispatch(objArr4, c1048a2, changeQuickRedirect4, false, "97ad7f13680fdd10066f276f282a5047");
            } else {
                c1048a2.b.u = str3;
            }
            Object[] objArr5 = {sb2};
            ChangeQuickRedirect changeQuickRedirect5 = a.C1048a.a;
            if (PatchProxy.isSupport(objArr5, c1048a2, changeQuickRedirect5, false, "68635a83a7bee6f0fd530eaa73c23ec2", RobustBitConfig.DEFAULT_VALUE)) {
                a.C1048a c1048a3 = (a.C1048a) PatchProxy.accessDispatch(objArr5, c1048a2, changeQuickRedirect5, false, "68635a83a7bee6f0fd530eaa73c23ec2");
            } else {
                c1048a2.b.t = sb2;
            }
            Object[] objArr6 = {c1048a, weakReference, str};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "2d54822a5a2c0f71e2b6340463fdfd08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "2d54822a5a2c0f71e2b6340463fdfd08");
                return;
            }
            com.sankuai.waimai.platform.domain.manager.location.search.a aVar = c1048a.b;
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((DeliveryApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) DeliveryApi.class)).search(aVar.b, aVar.c, aVar.a(), aVar.f, aVar.g, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l, aVar.m, aVar.n, aVar.o, aVar.p, aVar.q, aVar.r, aVar.s, aVar.t, aVar.u), new b.AbstractC1042b<MtAddressSearchResponse>() { // from class: com.sankuai.waimai.platform.domain.manager.location.search.b.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    MtAddressSearchResponse mtAddressSearchResponse = (MtAddressSearchResponse) obj;
                    Object[] objArr7 = {mtAddressSearchResponse};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "4abdfe9107a04e2e81f1daecf8b7134a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "4abdfe9107a04e2e81f1daecf8b7134a");
                    } else if ((mtAddressSearchResponse.b != 200 && mtAddressSearchResponse.b != 407) || mtAddressSearchResponse.e == null) {
                        b.a(a.C1048a.this, weakReference, str);
                    } else {
                        a aVar2 = (a) weakReference.get();
                        if (aVar2 != null) {
                            aVar2.a(mtAddressSearchResponse);
                        }
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr7 = {th};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "ba49127edf6fdf2465e74ea2a2290304", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "ba49127edf6fdf2465e74ea2a2290304");
                    } else {
                        b.a(a.C1048a.this, weakReference, str);
                    }
                }
            }, str);
            return;
        }
        a(c1048a, weakReference, str);
    }

    public static void a(Context context, double d, double d2, int i, int i2, String str, String str2, WeakReference<a> weakReference, String str3) {
        String d3;
        Object[] objArr = {context, Double.valueOf(d), Double.valueOf(d2), 10, 1, str, str2, weakReference, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "845dcb525a401d842378cca29c982396", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "845dcb525a401d842378cca29c982396");
            return;
        }
        Object[] objArr2 = {context, Double.valueOf(d), Double.valueOf(d2), 10, 1, str, str2, "", weakReference, str3};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "722b9602f264610b0021fc77d5abd39a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "722b9602f264610b0021fc77d5abd39a");
        } else if (context != null) {
            City o = g.a().o();
            if (o != null) {
                d3 = o.getCityName();
            } else {
                d3 = com.sankuai.waimai.foundation.location.g.d();
            }
            a.C1048a c1048a = new a.C1048a();
            a.C1048a h = c1048a.c(d3).f(String.valueOf(1)).e(String.valueOf(10)).d(AddressConfig.SCENARIO_WAIMAI).a(d).b(d2).g(String.valueOf(a(context))).h(AddressConfig.ORDERY_BY_WEIGHT);
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = a.C1048a.a;
            if (PatchProxy.isSupport(objArr3, h, changeQuickRedirect3, false, "d78df03214f019f245760f0d5825fbb6", RobustBitConfig.DEFAULT_VALUE)) {
                h = (a.C1048a) PatchProxy.accessDispatch(objArr3, h, changeQuickRedirect3, false, "d78df03214f019f245760f0d5825fbb6");
            } else {
                h.b.q = str;
            }
            h.a(str2).b("");
            a(context, c1048a, weakReference, str3);
        }
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c16f7bbace723049ae7f8241c789a0e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c16f7bbace723049ae7f8241c789a0e0")).intValue();
        }
        if (context == null) {
            return 2000;
        }
        return com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "search_address_radius", 2000);
    }

    public static void a(a.C1048a c1048a, final WeakReference<a> weakReference, String str) {
        Object[] objArr = {c1048a, weakReference, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5bf9637744cbd1b21840c2fc7deb538e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5bf9637744cbd1b21840c2fc7deb538e");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.location.search.a aVar = c1048a.b;
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((MafApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) MafApi.class)).search(aVar.b, aVar.c, aVar.a(), aVar.f, aVar.g, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l, aVar.m, aVar.n, aVar.o, aVar.p, aVar.q), new b.AbstractC1042b<MtAddressSearchResponse>() { // from class: com.sankuai.waimai.platform.domain.manager.location.search.b.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                MtAddressSearchResponse mtAddressSearchResponse = (MtAddressSearchResponse) obj;
                Object[] objArr2 = {mtAddressSearchResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c147d38617804e81c68f72b4d8d26020", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c147d38617804e81c68f72b4d8d26020");
                    return;
                }
                a aVar2 = (a) weakReference.get();
                if (aVar2 == null || mtAddressSearchResponse == null) {
                    return;
                }
                if ((mtAddressSearchResponse.b != 200 && mtAddressSearchResponse.b != 407) || mtAddressSearchResponse.e == null) {
                    aVar2.a(mtAddressSearchResponse.c);
                } else {
                    aVar2.a(mtAddressSearchResponse);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bcf4919a44f11e1ad48de5de29daa931", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bcf4919a44f11e1ad48de5de29daa931");
                    return;
                }
                a aVar2 = (a) weakReference.get();
                if (aVar2 != null) {
                    aVar2.a(th.getMessage());
                }
            }
        }, str);
    }
}
