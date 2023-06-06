package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.launcher.net.api.LogTypeApi;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.domain.manager.user.BaseUserManager;
import com.sankuai.waimai.platform.net.c;
import com.sankuai.waimai.platform.net.service.INetFactoryImpl;
import com.sankuai.waimai.platform.net.util.f;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class s extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "NetInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ed69484e36d034efe63b7eea348b295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ed69484e36d034efe63b7eea348b295");
            return;
        }
        int min = Math.min(4, Runtime.getRuntime().availableProcessors());
        ar.a(com.sankuai.android.jarvis.c.a("WMRetroPool-", min, min, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(4096), new a()));
        com.meituan.android.singleton.i.a(application, new INetFactoryImpl(), new com.sankuai.meituan.kernel.net.a() { // from class: com.sankuai.waimai.launcher.init.mainly.s.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.kernel.net.a
            public final /* synthetic */ Object f() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6042715fbe020bc5db0dc5a846084c3b", RobustBitConfig.DEFAULT_VALUE) ? (MtLocation) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6042715fbe020bc5db0dc5a846084c3b") : com.sankuai.waimai.foundation.location.v2.g.a().i();
            }

            @Override // com.sankuai.meituan.kernel.net.a
            public final long a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f7ed36bf6d01b7b0608f0c4916f333b", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f7ed36bf6d01b7b0608f0c4916f333b")).longValue() : com.sankuai.waimai.platform.domain.manager.user.a.i().d();
            }

            @Override // com.sankuai.meituan.kernel.net.a
            public final String e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee70dd1a063cdbcabd6373e9016b640d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee70dd1a063cdbcabd6373e9016b640d") : com.sankuai.waimai.platform.domain.manager.user.a.i().e();
            }

            @Override // com.sankuai.meituan.kernel.net.a
            public final long b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "781a70e405b3469a200334b843b391f4", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "781a70e405b3469a200334b843b391f4")).longValue();
                }
                City m = com.sankuai.waimai.foundation.location.v2.g.a().m();
                if (m == null || TextUtils.isEmpty(m.getCityCode())) {
                    return 0L;
                }
                return Long.parseLong(m.getCityCode());
            }

            @Override // com.sankuai.meituan.kernel.net.a
            public final String g() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f32e6ded5599bea2414b23023b71ad7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f32e6ded5599bea2414b23023b71ad7") : super.g();
            }

            @Override // com.sankuai.meituan.kernel.net.a
            public final String h() {
                return com.sankuai.meituan.Lifecycle.b.e;
            }

            @Override // com.sankuai.meituan.kernel.net.a
            public final String c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f378d0641e93e7e77cd4ce9411c7b3c6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f378d0641e93e7e77cd4ce9411c7b3c6") : com.sankuai.waimai.platform.b.A().c();
            }

            @Override // com.sankuai.meituan.kernel.net.a
            public final String d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f96625c08460b627b00d487f345ba548", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f96625c08460b627b00d487f345ba548") : com.sankuai.waimai.platform.b.A().b();
            }

            @Override // com.sankuai.meituan.kernel.net.a
            public final String i() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "945daf051fb66bfd227ed462a0da637c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "945daf051fb66bfd227ed462a0da637c") : com.sankuai.waimai.platform.b.A().d();
            }

            @Override // com.sankuai.meituan.kernel.net.a
            public final String j() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81c9aceddea9209dcc6dc727d7d3c019", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81c9aceddea9209dcc6dc727d7d3c019") : com.sankuai.waimai.platform.b.A().i();
            }

            @Override // com.sankuai.meituan.kernel.net.a
            public final int k() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ff36dff39ca1d3858ad1852d8db3251", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ff36dff39ca1d3858ad1852d8db3251")).intValue() : com.sankuai.waimai.platform.b.A().j();
            }

            @Override // com.sankuai.meituan.kernel.net.a
            public final boolean l() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f3d3424ef3f25042f3d2c3459928b01", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f3d3424ef3f25042f3d2c3459928b01")).booleanValue() : com.sankuai.waimai.foundation.core.a.b();
            }

            @Override // com.sankuai.meituan.kernel.net.a
            public final String m() {
                int intValue;
                String str;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "671318961a6a6ebfa4a0aa90ebad766e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "671318961a6a6ebfa4a0aa90ebad766e");
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "11decf4a2cee860040970880a22625bb", RobustBitConfig.DEFAULT_VALUE)) {
                    intValue = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "11decf4a2cee860040970880a22625bb")).intValue();
                } else {
                    com.sankuai.waimai.platform.domain.manager.user.a i = com.sankuai.waimai.platform.domain.manager.user.a.i();
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = BaseUserManager.a;
                    intValue = PatchProxy.isSupport(objArr4, i, changeQuickRedirect4, false, "152b7954396436cf92c5c046721a6bd3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, i, changeQuickRedirect4, false, "152b7954396436cf92c5c046721a6bd3")).intValue() : BaseUserManager.h().getLoginType();
                }
                Object[] objArr5 = {Integer.valueOf(intValue)};
                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.base.util.e.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "f5e6f66fffb57be3d39d0f3a32f95829", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "f5e6f66fffb57be3d39d0f3a32f95829");
                }
                Object[] objArr6 = new Object[5];
                objArr6[0] = "group";
                objArr6[1] = com.meituan.android.base.a.l;
                objArr6[2] = com.meituan.android.base.a.b;
                if (intValue > 0) {
                    str = "D" + intValue;
                } else {
                    str = "";
                }
                objArr6[3] = str;
                objArr6[4] = com.meituan.android.base.a.c;
                String format = String.format("A%sB%sC%s%sE%s", objArr6);
                if (!TextUtils.isEmpty(com.meituan.android.base.a.g)) {
                    format = format + "G" + com.meituan.android.base.a.g;
                }
                if (TextUtils.isEmpty(com.meituan.android.base.a.m)) {
                    return format;
                }
                return format + ErrorCode.ERROR_TYPE_H + com.meituan.android.base.a.m;
            }
        });
        a.InterfaceC0637a a2 = com.meituan.android.singleton.i.a();
        com.sankuai.waimai.addrsdk.retrofit.b.a(a2);
        com.sankuai.waimai.platform.net.service.d.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.launcher.net.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9c651dd5876f9ebdf0ce7c8338e92544", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9c651dd5876f9ebdf0ce7c8338e92544");
        } else if (com.sankuai.waimai.launcher.net.a.b == null) {
            com.sankuai.waimai.launcher.net.a.b = new com.sankuai.waimai.platform.net.service.a() { // from class: com.sankuai.waimai.launcher.net.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.net.service.a
                public final String c() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "34f6f161be35d182a090ddef03c1c59b", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "34f6f161be35d182a090ddef03c1c59b");
                    }
                    StringBuilder sb = new StringBuilder();
                    c a3 = c.a();
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                    sb.append(PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "98412e1defefa02ac934c626a9855496", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "98412e1defefa02ac934c626a9855496") : a3.m.h);
                    sb.append(f.a);
                    return sb.toString();
                }

                @Override // com.sankuai.waimai.platform.net.service.a
                public final Gson d() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3958d28b24f176d07b031ea5a370042e", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3958d28b24f176d07b031ea5a370042e") : new GsonBuilder().registerTypeAdapter(BaseResponse.class, new BaseResponse.BaseResponseDeserializer()).create();
                }
            };
            com.sankuai.waimai.platform.capacity.network.retrofit.c.a(LogTypeApi.class, com.sankuai.waimai.launcher.net.a.b);
        }
        com.meituan.android.mrn.engine.z.a(application).a(a2);
        com.sankuai.meituan.tte.x.a(application.getApplicationContext(), 500L);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a implements ThreadFactory {
        public static ChangeQuickRedirect a;
        public AtomicInteger b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ed2988fa323ca9bf53b24837b2b2702", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ed2988fa323ca9bf53b24837b2b2702");
            } else {
                this.b = new AtomicInteger();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59dc8f6509e7d55d5dee7fe52e9e5aab", RobustBitConfig.DEFAULT_VALUE)) {
                return (Thread) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59dc8f6509e7d55d5dee7fe52e9e5aab");
            }
            return new Thread(runnable, "WMRetro#" + this.b.incrementAndGet());
        }
    }
}
