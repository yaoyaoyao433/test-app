package com.sankuai.waimai.business.im.prepare.init;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.WaimaiIMService;
import com.sankuai.waimai.business.im.prepare.f;
import com.sankuai.waimai.business.im.prepare.m;
import com.sankuai.waimai.business.im.prepare.n;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.imbase.init.c;
import com.sankuai.waimai.imbase.manager.b;
import com.sankuai.waimai.imbase.user.b;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmImInit extends AbsInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "WmImInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void asyncInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb3df17ef5868976542b90a886be9668", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb3df17ef5868976542b90a886be9668");
        } else {
            b.a().c(reLoginIfNeed(application));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, byte] */
    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6847cb7a9006bc448508c5a382f5ea9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6847cb7a9006bc448508c5a382f5ea9d");
            return;
        }
        com.sankuai.waimai.business.im.api.a a = com.sankuai.waimai.business.im.api.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = f.a;
        a.b = PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "bc9d7d3b18435bde6e5e1731a6abe142", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "bc9d7d3b18435bde6e5e1731a6abe142") : f.a.a;
        n b = n.b();
        m mVar = new m() { // from class: com.sankuai.waimai.business.im.prepare.init.WmImInit.1
            @Override // com.sankuai.waimai.business.im.prepare.m
            public final boolean a() {
                return a.a;
            }

            @Override // com.sankuai.waimai.business.im.prepare.m
            public final void a(boolean z) {
                a.a = z;
            }
        };
        Object[] objArr3 = {mVar};
        ChangeQuickRedirect changeQuickRedirect4 = n.a;
        if (PatchProxy.isSupport(objArr3, b, changeQuickRedirect4, false, "ed603200c06d52d76863e25f9272450a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, b, changeQuickRedirect4, false, "ed603200c06d52d76863e25f9272450a");
        } else {
            b.c++;
            b.d = false;
            b.b = mVar;
        }
        com.sankuai.waimai.imbase.push.b.a(1);
        ?? r0 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) application, "im_link_switch", 1) == 1 ? 1 : 0;
        c cVar = new c();
        boolean z = !com.sankuai.waimai.foundation.core.a.b() ? 1 : 0;
        com.sankuai.waimai.imbase.user.b bVar = new com.sankuai.waimai.imbase.user.b() { // from class: com.sankuai.waimai.business.im.prepare.init.WmImInit.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.user.b
            public final boolean a() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "e6ab69d07cf4c0940af98c473fdfd52d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "e6ab69d07cf4c0940af98c473fdfd52d")).booleanValue() : com.sankuai.waimai.platform.domain.manager.user.a.i().a();
            }

            @Override // com.sankuai.waimai.imbase.user.b
            public final long b() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "31b1be9193707398eabc78b5724cbb57", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "31b1be9193707398eabc78b5724cbb57")).longValue() : com.sankuai.waimai.platform.domain.manager.user.a.i().d();
            }

            @Override // com.sankuai.waimai.imbase.user.b
            public final String c() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "25e5d16dc6dae172bd98d01a52213895", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "25e5d16dc6dae172bd98d01a52213895") : com.sankuai.waimai.platform.domain.manager.user.a.i().e();
            }

            @Override // com.sankuai.waimai.imbase.user.b
            public final String d() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "bd46c023af442244c8884c7a775ed179", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "bd46c023af442244c8884c7a775ed179") : com.sankuai.waimai.platform.domain.manager.user.a.i().g();
            }

            @Override // com.sankuai.waimai.imbase.user.b
            public final void a(final b.InterfaceC0967b interfaceC0967b) {
                Object[] objArr4 = {interfaceC0967b};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "13680143ebe98f8dc2985f80bca679ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "13680143ebe98f8dc2985f80bca679ed");
                    return;
                }
                com.sankuai.waimai.platform.domain.manager.user.a.i().a(new com.sankuai.waimai.foundation.core.service.user.b() { // from class: com.sankuai.waimai.business.im.prepare.init.WmImInit.2.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.foundation.core.service.user.b
                    public final void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
                    }

                    @Override // com.sankuai.waimai.foundation.core.service.user.b
                    public final void onChanged(b.a aVar) {
                        Object[] objArr5 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "6adb2028351ac814e7bc137bbabcaf65", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "6adb2028351ac814e7bc137bbabcaf65");
                            return;
                        }
                        if (aVar == b.a.LOGIN) {
                            if (interfaceC0967b != null) {
                                interfaceC0967b.a(b.a.LOGIN);
                            }
                            WmImInit.this.fetchLogoutTime();
                        }
                        if (aVar != b.a.LOGOUT || interfaceC0967b == null) {
                            return;
                        }
                        interfaceC0967b.a(b.a.LOGOUT);
                    }
                });
                WmImInit.this.fetchLogoutTime();
            }
        };
        Object[] objArr4 = {application, Byte.valueOf((byte) r0), Byte.valueOf(z ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect5 = c.a;
        if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect5, false, "8ccbabd7ad5efe246b0887c99049e0c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect5, false, "8ccbabd7ad5efe246b0887c99049e0c2");
            return;
        }
        com.sankuai.waimai.imbase.singleton.a.a = application.getApplicationContext();
        com.sankuai.waimai.imbase.user.a e = com.sankuai.waimai.imbase.user.a.e();
        Object[] objArr5 = {bVar};
        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.imbase.user.a.a;
        if (PatchProxy.isSupport(objArr5, e, changeQuickRedirect6, false, "a923c76844f0702360018dab88351cdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, e, changeQuickRedirect6, false, "a923c76844f0702360018dab88351cdf");
        } else {
            e.c++;
            e.d = false;
            e.b = bVar;
        }
        com.sankuai.waimai.imbase.init.b bVar2 = new com.sankuai.waimai.imbase.init.b();
        Object[] objArr6 = {application, Byte.valueOf((byte) r0), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.imbase.init.b.a;
        if (PatchProxy.isSupport(objArr6, bVar2, changeQuickRedirect7, false, "f3e062fe36bfbbacb1a871a1020931bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, bVar2, changeQuickRedirect7, false, "f3e062fe36bfbbacb1a871a1020931bc");
        } else {
            com.sankuai.waimai.imbase.manager.b.a().a((boolean) r0);
            com.sankuai.waimai.imbase.manager.b.a().b(r0);
            com.sankuai.waimai.imbase.manager.b.a().a(application, z);
        }
        final com.sankuai.waimai.imbase.init.a aVar = new com.sankuai.waimai.imbase.init.a();
        Object[] objArr7 = {application};
        ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.imbase.init.a.a;
        if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect8, false, "ad96f3dc83a60dab8d10009cd5893149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect8, false, "ad96f3dc83a60dab8d10009cd5893149");
            return;
        }
        if (com.sankuai.waimai.imbase.user.a.e().a()) {
            com.sankuai.waimai.imbase.manager.b.a().a((Context) null);
        }
        com.sankuai.waimai.imbase.user.a.e().a(new b.InterfaceC0967b() { // from class: com.sankuai.waimai.imbase.init.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.imbase.user.b.InterfaceC0967b
            public final void a(b.a aVar2) {
                Object[] objArr8 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect9, false, "2a8464058f830ccae0f4a26fd8a80975", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect9, false, "2a8464058f830ccae0f4a26fd8a80975");
                    return;
                }
                if (aVar2 == b.a.LOGIN) {
                    com.sankuai.waimai.imbase.manager.b.a().a((Context) null);
                }
                if (aVar2 == b.a.LOGOUT) {
                    com.sankuai.waimai.imbase.manager.b.a().g();
                }
            }
        });
    }

    private boolean reLoginIfNeed(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8afc7ea0b9019ef2859cac03bd433178", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8afc7ea0b9019ef2859cac03bd433178")).booleanValue();
        }
        ABStrategy strategy = ABTestManager.getInstance(context).getStrategy("wm_im_relogin_test", null);
        return strategy == null || !strategy.expName.equals(ErrorCode.ERROR_TYPE_B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchLogoutTime() {
        boolean contains;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd14f0f67b4a325cb539b8bfd9be8d21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd14f0f67b4a325cb539b8bfd9be8d21");
            return;
        }
        final long d = com.sankuai.waimai.platform.domain.manager.user.a.i().d();
        if (d == 0) {
            return;
        }
        com.sankuai.waimai.imbase.manager.f a = com.sankuai.waimai.imbase.manager.f.a();
        Object[] objArr2 = {new Long(d)};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.imbase.manager.f.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "6def97abe1d0500e27168f590842829c", RobustBitConfig.DEFAULT_VALUE)) {
            contains = ((Boolean) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "6def97abe1d0500e27168f590842829c")).booleanValue();
        } else {
            SharedPreferences sharedPreferences = a.e;
            contains = sharedPreferences.contains("cancel_time_" + d);
        }
        if (contains) {
            return;
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiIMService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiIMService.class)).getUserGroupChatInfo(), new b.AbstractC1042b<BaseResponse<Object>>() { // from class: com.sankuai.waimai.business.im.prepare.init.WmImInit.3
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onError(Throwable th) {
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr3 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f318dabb1f31a98d4e792266958890ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f318dabb1f31a98d4e792266958890ea");
                } else if (baseResponse == null || baseResponse.code != 0) {
                } else {
                    try {
                        long optLong = new JSONObject(baseResponse.data.toString()).optLong("cancel_time");
                        if (optLong != -1) {
                            com.sankuai.waimai.imbase.manager.f a2 = com.sankuai.waimai.imbase.manager.f.a();
                            long j = d;
                            Object[] objArr4 = {new Long(j), new Long(optLong)};
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.imbase.manager.f.a;
                            if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect5, false, "fbb3cce32ced53bed04b4ae925039fcb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect5, false, "fbb3cce32ced53bed04b4ae925039fcb");
                                return;
                            }
                            SharedPreferences.Editor editor = a2.f;
                            editor.putLong("cancel_time_" + j, optLong).commit();
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.location.utils.b.a("WmImInit", "fetchLogoutTime >>> " + e.getMessage(), new Object[0]);
                    }
                }
            }
        }, "");
    }
}
