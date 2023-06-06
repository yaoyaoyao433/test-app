package com.sankuai.meituan.mapfoundation.starship;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.google.gson.Gson;
import com.meituan.android.common.mtguard.MTGConfigs;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.MtRetrofitInterceptor;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.metrics.traffic.reflection.SharkWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapfoundation.starship.c;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i implements c {
    public static ChangeQuickRedirect a;
    final Map<c.a, Call<ap>> b;
    private ar c;
    private IStarShipAPI d;

    public i(boolean z, final com.sankuai.meituan.mapfoundation.starship.interceptor.a aVar, d... dVarArr) {
        a.InterfaceC0637a a2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, dVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "767037d457a53f5bbaeae9a6fdc7d702", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "767037d457a53f5bbaeae9a6fdc7d702");
            return;
        }
        this.b = new ConcurrentHashMap();
        ar.a a3 = new ar.a().a("https://api.map.meituan.com");
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e7dcb082402d5a51c21c90b106843741", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e7dcb082402d5a51c21c90b106843741");
        } else {
            a2 = com.meituan.android.singleton.i.a(new com.sankuai.meituan.kernel.net.d() { // from class: com.sankuai.meituan.mapfoundation.starship.i.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.kernel.net.d
                public final boolean a() {
                    return true;
                }

                @Override // com.sankuai.meituan.kernel.net.d
                public final boolean c() {
                    return true;
                }

                @Override // com.sankuai.meituan.kernel.net.d
                public final void a(@NonNull OkHttpClient.Builder builder) {
                    Object[] objArr3 = {builder};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "52a08090d4f92e90c7ac7bc4e32dc91c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "52a08090d4f92e90c7ac7bc4e32dc91c");
                    } else {
                        super.a(builder);
                    }
                }

                @Override // com.sankuai.meituan.kernel.net.d
                public final Object[] b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ad8bfb7a703e321dbb57638bb0e488ff", RobustBitConfig.DEFAULT_VALUE) ? (Object[]) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ad8bfb7a703e321dbb57638bb0e488ff") : com.sankuai.meituan.mapfoundation.starship.interceptor.a.this != null ? new Object[]{com.sankuai.meituan.mapfoundation.starship.interceptor.a.this} : super.b();
                }
            });
            if (a2 == null) {
                if (com.dianping.nvnetwork.g.u()) {
                    NVDefaultNetworkService.a aVar2 = new NVDefaultNetworkService.a(com.dianping.nvnetwork.g.b());
                    SharkWrapper.addInterceptorToBuilder(aVar2);
                    aVar2.c = true;
                    aVar2.e = false;
                    if (aVar != null) {
                        aVar2.a(aVar);
                    }
                    a2 = com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a.a(aVar2.a());
                } else {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    OkHttp3Wrapper.addInterceptorToBuilder(builder);
                    a2 = com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(builder.connectTimeout(10L, TimeUnit.SECONDS).readTimeout(10L, TimeUnit.SECONDS).retryOnConnectionFailure(true).build());
                }
            }
        }
        ar.a a4 = a3.a(a2);
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    a4.a(new f(dVar));
                }
            }
        }
        if (z) {
            a4.a(new MtRetrofitInterceptor());
        }
        a4.a(new Interceptor() { // from class: com.sankuai.meituan.mapfoundation.starship.i.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.Interceptor
            public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar3) throws IOException {
                Object[] objArr3 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "13445ef639a744c64cf9229358ae0f2d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "13445ef639a744c64cf9229358ae0f2d");
                }
                aj request = aVar3.request();
                com.sankuai.meituan.mapfoundation.logcenter.a.a("url: " + request.e);
                com.sankuai.meituan.mapfoundation.logcenter.a.a("mtgsig: " + request.a(MTGConfigs.c));
                return aVar3.a(request);
            }
        });
        this.c = a4.a();
        this.d = (IStarShipAPI) this.c.a(IStarShipAPI.class);
    }

    @Override // com.sankuai.meituan.mapfoundation.starship.c
    public final <T> void a(String str, Map<String, Object> map, Map<String, Object> map2, final c.a<T> aVar) {
        Object[] objArr = {str, map, map2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78b9daca375f46fc170c5f286f819cf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78b9daca375f46fc170c5f286f819cf5");
        } else if (this.d != null) {
            Call<ap> call = this.d.get(str, map, map2);
            this.b.put(aVar, call);
            call.a(new com.sankuai.meituan.retrofit2.f<ap>() { // from class: com.sankuai.meituan.mapfoundation.starship.i.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<ap> call2, Response<ap> response) {
                    Type type;
                    Type genericSuperclass;
                    byte[] bArr;
                    Object[] objArr2 = {call2, response};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94d55dbd49152fa759a5f57f22f4f269", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94d55dbd49152fa759a5f57f22f4f269");
                        return;
                    }
                    if (aVar != null) {
                        i iVar = i.this;
                        c.a aVar2 = aVar;
                        Object[] objArr3 = {response, aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = i.a;
                        if (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect3, false, "21b7ce27efe6125ac1b575d80d4a4750", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect3, false, "21b7ce27efe6125ac1b575d80d4a4750");
                        } else if (aVar2 != null) {
                            List<q> list = response.g;
                            HashMap hashMap = new HashMap();
                            for (q qVar : list) {
                                hashMap.put(qVar.b, qVar.c);
                            }
                            Object[] objArr4 = {aVar2};
                            ChangeQuickRedirect changeQuickRedirect4 = i.a;
                            if (PatchProxy.isSupport(objArr4, iVar, changeQuickRedirect4, false, "fd18645fafa969c8730f9d9b17a84df4", RobustBitConfig.DEFAULT_VALUE)) {
                                type = (Type) PatchProxy.accessDispatch(objArr4, iVar, changeQuickRedirect4, false, "fd18645fafa969c8730f9d9b17a84df4");
                            } else {
                                if (aVar2 != null) {
                                    Class<?> cls = aVar2.getClass();
                                    Type[] genericInterfaces = cls.getGenericInterfaces();
                                    if (genericInterfaces.length > 0) {
                                        genericSuperclass = genericInterfaces[0];
                                    } else {
                                        genericSuperclass = cls.getGenericSuperclass();
                                    }
                                    if (genericSuperclass instanceof ParameterizedType) {
                                        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                                        if (actualTypeArguments.length > 0) {
                                            type = actualTypeArguments[0];
                                        }
                                    }
                                }
                                type = null;
                            }
                            ap apVar = response.e;
                            if (apVar != null) {
                                if (type == null || type == String.class) {
                                    aVar2.a(response.c, hashMap, apVar.string());
                                } else if (TextUtils.equals("byte[]", type.toString())) {
                                    try {
                                        if (apVar.source().available() > 0) {
                                            InputStream source = apVar.source();
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            byte[] bArr2 = new byte[1024];
                                            while (true) {
                                                int read = source.read(bArr2);
                                                if (read == -1) {
                                                    break;
                                                }
                                                byteArrayOutputStream.write(bArr2, 0, read);
                                            }
                                            bArr = byteArrayOutputStream.toByteArray();
                                            try {
                                                source.close();
                                                byteArrayOutputStream.close();
                                            } catch (Exception e) {
                                                e = e;
                                                e.printStackTrace();
                                                aVar2.a(e);
                                                com.sankuai.meituan.mapfoundation.logcenter.a.b(e.getLocalizedMessage());
                                                aVar2.a(response.c, hashMap, bArr);
                                                i.this.b.remove(aVar);
                                            }
                                        } else {
                                            bArr = null;
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        bArr = null;
                                    }
                                    aVar2.a(response.c, hashMap, bArr);
                                } else {
                                    aVar2.a(response.c, hashMap, new Gson().fromJson(apVar.string(), type));
                                }
                            } else {
                                aVar2.a(response.c, hashMap, null);
                            }
                        }
                    }
                    i.this.b.remove(aVar);
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<ap> call2, Throwable th) {
                    Object[] objArr2 = {call2, th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c7fb605abf584e1d679ffbf863a3fa6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c7fb605abf584e1d679ffbf863a3fa6");
                        return;
                    }
                    if (aVar != null) {
                        aVar.a(new Exception(th));
                    }
                    i.this.b.remove(aVar);
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mapfoundation.starship.c
    public final void cancel(c.a aVar) {
        Call<ap> call;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "327dacfd799118dc6fd8c2b9afc9f179", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "327dacfd799118dc6fd8c2b9afc9f179");
        } else if (!this.b.containsKey(aVar) || (call = this.b.get(aVar)) == null) {
        } else {
            call.cancel();
        }
    }
}
