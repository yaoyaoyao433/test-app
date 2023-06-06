package com.meituan.passport.api;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.yoda.plugins.c;
import com.meituan.android.yoda.plugins.d;
import com.meituan.passport.UserCenter;
import com.meituan.passport.converter.i;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.interceptor.e;
import com.meituan.passport.plugins.q;
import com.meituan.passport.plugins.v;
import com.meituan.passport.utils.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.exception.b;
import com.sankuai.meituan.retrofit2.i;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLException;
import rx.schedulers.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbsApiFactory<T> {
    public static final String HTTP = "http://";
    public static final String HTTPS = "https://";
    public static final String PASSPORT_COMMON_URL = "https://passport.meituan.com/api/";
    public static final String PASSPORT_ONLINE_URL = "meituan";
    public static final String PASSPORT_TEST_OFFLINE_URL = "wpt.test.sankuai";
    public static final String PASSPORT_TEST_ONLINE_URL = "wpt.st.sankuai";
    public static final String PASSPORT_USER_API_URL = "https://passport.meituan.com/user/api/";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static final int error_auth_fail = 401;
    public static final int error_cancel_rebind_wechat = 4;
    public static final int error_identify_verification = 1;
    public static final int error_param = 400;
    public static final int error_system = 0;
    public static final int error_yoda_sdk_cancel = 2;
    public static final int error_yoda_sdk_error = 3;
    private final AtomicReference<ar> adapter;
    private int netMode;
    private v restAdapterHook;

    public abstract Class<T> getApiClass();

    public abstract String getBaseUrl(int i);

    public AbsApiFactory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e71ba912e8e8d9ab8f203b39168b5dfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e71ba912e8e8d9ab8f203b39168b5dfe");
            return;
        }
        this.adapter = new AtomicReference<>();
        this.netMode = 1;
        this.restAdapterHook = q.a().b();
    }

    public T create() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1a15915ed379b84c35a4c8904394f76", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1a15915ed379b84c35a4c8904394f76");
        }
        if (this.netMode != this.restAdapterHook.b()) {
            final int b = this.restAdapterHook.b();
            d.a().c().a(new c() { // from class: com.meituan.passport.api.AbsApiFactory.1
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    AbsApiFactory.this = this;
                }

                @Override // com.meituan.android.yoda.plugins.c
                public int getNetEnv() {
                    if (b == 3) {
                        return 5;
                    }
                    return b;
                }
            });
            this.netMode = b;
            clearRetrofit();
        }
        ar retrofit2 = getRetrofit();
        Object[] objArr2 = {retrofit2};
        ChangeQuickRedirect changeQuickRedirect3 = i.a;
        i iVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "4c3c7a91f69f352e3a44123398698a9d", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "4c3c7a91f69f352e3a44123398698a9d") : new i(retrofit2);
        iVar.c = errorHandler();
        Class<T> apiClass = getApiClass();
        Object[] objArr3 = {apiClass};
        ChangeQuickRedirect changeQuickRedirect4 = i.a;
        if (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect4, false, "5c966e00b142722996d7403975d5cc79", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect4, false, "5c966e00b142722996d7403975d5cc79");
        }
        return (T) Proxy.newProxyInstance(apiClass.getClassLoader(), new Class[]{apiClass}, new i.AnonymousClass1(iVar.b.a(apiClass)));
    }

    public ar getRetrofit() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1fae6ba94cea3086b2860e7b82dc506", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1fae6ba94cea3086b2860e7b82dc506");
        }
        if (this.adapter.get() == null) {
            ar.a aVar = new ar.a();
            aVar.a(getBaseUrl(this.netMode)).a(wrapCall()).a(f.a(a.e())).a(converter());
            List<Interceptor> interceptors = getInterceptors();
            Object[] objArr2 = {interceptors};
            ChangeQuickRedirect changeQuickRedirect3 = Utils.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "13dfd1eecbcbdc51722cb0d46540119d", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "13dfd1eecbcbdc51722cb0d46540119d")).booleanValue();
            } else if (interceptors == null || interceptors.isEmpty()) {
                z = true;
            }
            if (!z) {
                aVar.a(getInterceptors());
            }
            this.adapter.compareAndSet(null, aVar.a());
        }
        return this.adapter.get();
    }

    public void clearRetrofit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9622bf6850b14116b0d62a12c87edee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9622bf6850b14116b0d62a12c87edee9");
        } else {
            this.adapter.set(null);
        }
    }

    private com.meituan.passport.converter.a errorHandler() {
        com.meituan.passport.converter.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "512f4e759da129d2f9541cba63b1ea33", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.passport.converter.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "512f4e759da129d2f9541cba63b1ea33");
        }
        aVar = AbsApiFactory$$Lambda$1.instance;
        return aVar;
    }

    public static /* synthetic */ Throwable lambda$errorHandler$9(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "00392748a8b7d66aea2afc651e6ad60a", RobustBitConfig.DEFAULT_VALUE) ? (Throwable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "00392748a8b7d66aea2afc651e6ad60a") : ((th instanceof b) && (th.getCause() instanceof ApiException)) ? th.getCause() : th;
    }

    private a.InterfaceC0637a wrapCall() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d733ebfe04a8c20d7c0f658f9a97e9c", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d733ebfe04a8c20d7c0f658f9a97e9c") : AbsApiFactory$$Lambda$2.lambdaFactory$(this, this.restAdapterHook.a());
    }

    public static /* synthetic */ com.sankuai.meituan.retrofit2.raw.a lambda$wrapCall$10(AbsApiFactory absApiFactory, final a.InterfaceC0637a interfaceC0637a, final aj ajVar) {
        Object[] objArr = {absApiFactory, interfaceC0637a, ajVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8cf238c7c6e6bbbec172442f6f25050", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8cf238c7c6e6bbbec172442f6f25050");
        }
        final com.sankuai.meituan.retrofit2.raw.a aVar = interfaceC0637a.get(ajVar);
        return new com.sankuai.meituan.retrofit2.raw.a() { // from class: com.meituan.passport.api.AbsApiFactory.2
            public static ChangeQuickRedirect changeQuickRedirect;

            public boolean isCanceled() {
                return false;
            }

            public boolean isExecuted() {
                return false;
            }

            {
                AbsApiFactory.this = absApiFactory;
            }

            @Override // com.sankuai.meituan.retrofit2.raw.a
            public aj request() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3134a980c346bc7e6e94121f867109c2", RobustBitConfig.DEFAULT_VALUE) ? (aj) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3134a980c346bc7e6e94121f867109c2") : aVar.request();
            }

            @Override // com.sankuai.meituan.retrofit2.raw.a
            public com.sankuai.meituan.retrofit2.raw.b execute() throws IOException {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7a04f3de1dbf137eb9cbe993102eb00e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7a04f3de1dbf137eb9cbe993102eb00e");
                }
                try {
                    return aVar.execute();
                } catch (SSLException e) {
                    throw e;
                } catch (IOException e2) {
                    if (e2 instanceof com.meituan.passport.exception.c) {
                        throw e2;
                    }
                    if (!TextUtils.isEmpty(ajVar.b()) && ajVar.b().contains(AbsApiFactory.HTTPS)) {
                        return interfaceC0637a.get(new aj.a().b(ajVar.b().replace(AbsApiFactory.HTTPS, AbsApiFactory.HTTP)).a(ajVar.c()).a(ajVar.d()).a(ajVar.i()).a()).execute();
                    }
                    throw e2;
                }
            }

            @Override // com.sankuai.meituan.retrofit2.raw.a
            public void cancel() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1248208d3c5bfafcecf97ded07742c73", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1248208d3c5bfafcecf97ded07742c73");
                } else {
                    aVar.cancel();
                }
            }
        };
    }

    public i.a converter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fec5cd845b8d4b68ba336bc483ecf2ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (i.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fec5cd845b8d4b68ba336bc483ecf2ca");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.converter.d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "b9634c4ea725ba24a1548d2237d9ab69", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.passport.converter.d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "b9634c4ea725ba24a1548d2237d9ab69");
        }
        Gson gson = new Gson();
        Object[] objArr3 = {gson};
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.passport.converter.d.a;
        return PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "6d90ed99644aa12e25fa7eff530891c8", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.converter.d) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "6d90ed99644aa12e25fa7eff530891c8") : new com.meituan.passport.converter.d(gson);
    }

    private List<Interceptor> getInterceptors() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a3a7d12603c729184b42c0d9af5be29", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a3a7d12603c729184b42c0d9af5be29");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e());
        arrayList.add(com.meituan.passport.interceptor.a.a());
        arrayList.add(com.meituan.passport.interceptor.b.a(UserCenter.APPCONTEXT));
        arrayList.add(com.meituan.passport.interceptor.c.a());
        arrayList.addAll(this.restAdapterHook.c());
        arrayList.add(com.meituan.passport.interceptor.d.a());
        return arrayList;
    }
}
