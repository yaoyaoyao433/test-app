package com.tencent.mapsdk.internal;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetFileResolver;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetHead;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJceResolver;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetJsonResolver;
import com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetRequest;
import com.tencent.mapsdk.internal.ci;
import com.tencent.mapsdk.internal.ci.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class de<R extends ci.a> implements ci<R> {
    public boolean a = false;
    public boolean b = true;
    public boolean c = true;
    private volatile R d;
    private Map<String, String> e;

    @Override // com.tencent.mapsdk.internal.ci
    public String f() {
        return null;
    }

    @Override // com.tencent.mapsdk.internal.ci
    public final String g() {
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        String a;
        String b;
        String c;
        String d;
        String[] e;
        HashMap<String, String> f;
        String g;
        String h;
        int i;
        boolean j;
        NetMethod k;
        dv l;
        int[] m;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final String toString() {
            return "RequestEntity{service='" + this.a + "', request='" + this.b + "', method=" + this.k + ", heads=" + this.f + ", authority=" + this.d + ", queryKeys=" + Arrays.toString(this.e) + ", constQuery='" + this.g + "', useAgent='" + this.h + "', resolver='" + this.l + "', retry=" + this.i + ", useExtraQuery=" + this.j + "\nurl='" + this.c + "'}";
        }
    }

    @Override // com.tencent.mapsdk.internal.ci
    public final boolean b() {
        return this.b;
    }

    @Override // com.tencent.mapsdk.internal.ci
    public final boolean c() {
        return this.a;
    }

    @Override // com.tencent.mapsdk.internal.ci
    public final boolean d() {
        return this.c;
    }

    @Override // com.tencent.mapsdk.internal.ci
    public final void a(Map<String, String> map) {
        if (this.e != null) {
            this.e.putAll(map);
        } else {
            this.e = map;
        }
    }

    @Override // com.tencent.mapsdk.internal.ch.a
    public final void a(boolean z) {
        this.c = z;
    }

    @Override // com.tencent.mapsdk.internal.ch.a
    public final void b(boolean z) {
        this.a = z;
    }

    @Override // com.tencent.mapsdk.internal.ch.a
    public final void c(boolean z) {
        this.b = z;
    }

    @Override // com.tencent.mapsdk.internal.ci
    public final R h() {
        if (this.d != null) {
            return this.d;
        }
        this.d = l();
        return this.d;
    }

    public final String i() {
        return this.a ? f() : e();
    }

    private String k() {
        StringBuilder sb = new StringBuilder();
        String i = i();
        if (TextUtils.isEmpty(i)) {
            return null;
        }
        String j = j();
        if (!TextUtils.isEmpty(j)) {
            sb.append(j);
            sb.append("://");
        }
        sb.append(i);
        return sb.toString();
    }

    private String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (hb.a(str)) {
            str = i();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String j = j();
        if (!TextUtils.isEmpty(j)) {
            sb.append(j);
            sb.append("://");
        }
        sb.append(str);
        return sb.toString();
    }

    private R l() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            if (actualTypeArguments.length > 0 && (actualTypeArguments[0] instanceof Class)) {
                Class<?> cls = (Class) actualTypeArguments[0];
                ClassLoader classLoader = cls.getClassLoader();
                Class<?>[] clsArr = new Class[1];
                if (cls.isInterface()) {
                    clsArr[0] = cls;
                } else {
                    clsArr = cls.getInterfaces();
                }
                return (R) Proxy.newProxyInstance(classLoader, clsArr, new b(getClass()));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final NetResponse a(a aVar, Object... objArr) {
        NetResponse doGet;
        if (aVar != null) {
            String str = aVar.c;
            try {
                String b2 = b(aVar, objArr);
                if (!TextUtils.isEmpty(b2)) {
                    str = str + CommonConstant.Symbol.QUESTION_MARK + b2;
                }
                aVar.c = str;
                kj.c(ki.g, aVar.toString());
                switch (aVar.k) {
                    case GET:
                        doGet = NetManager.getInstance().builder().forceHttps(false).userAgent(aVar.h).url(str).retryNum(aVar.i).header(aVar.f).doGet();
                        break;
                    case POST:
                        byte[] bArr = new byte[0];
                        if (objArr.length > 0) {
                            int length = objArr.length;
                            int i = 0;
                            while (true) {
                                if (i < length) {
                                    Object obj = objArr[i];
                                    if (obj instanceof byte[]) {
                                        bArr = (byte[]) obj;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                        doGet = NetManager.getInstance().builder().userAgent(aVar.h).forceHttps(false).url(str).retryNum(aVar.i).header(aVar.f).postData(bArr).doPost();
                        break;
                    default:
                        return null;
                }
                return doGet;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(@NonNull a aVar, Object... objArr) {
        String[] strArr = aVar.e;
        StringBuilder sb = new StringBuilder();
        if (strArr != null && objArr != null && strArr.length <= objArr.length) {
            for (String str : strArr) {
                sb.append(str);
                sb.append("=%s&");
            }
        }
        String str2 = aVar.g;
        if (!TextUtils.isEmpty(str2)) {
            for (String str3 : str2.split("&")) {
                String[] split = str3.split("=");
                if (split.length == 2) {
                    sb.append(split[0]);
                    sb.append("=");
                    sb.append(split[1]);
                    sb.append("&");
                }
            }
        }
        if (aVar.j && this.e != null && !this.e.isEmpty()) {
            for (Map.Entry<String, String> entry : this.e.entrySet()) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append("&");
            }
        }
        int lastIndexOf = sb.lastIndexOf("&");
        if (lastIndexOf >= 0 && lastIndexOf == sb.length() - 1) {
            sb.deleteCharAt(lastIndexOf);
        }
        return String.format(sb.toString(), objArr);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class b implements InvocationHandler {
        private Class<? extends de> b;

        b(Class<? extends de> cls) {
            this.b = cls;
        }

        private a a(Method method) {
            String str;
            a aVar = new a((byte) 0);
            NetJceResolver netJceResolver = (NetJceResolver) method.getAnnotation(NetJceResolver.class);
            NetFileResolver netFileResolver = (NetFileResolver) method.getAnnotation(NetFileResolver.class);
            NetJsonResolver netJsonResolver = (NetJsonResolver) method.getAnnotation(NetJsonResolver.class);
            NetRequest netRequest = (NetRequest) method.getAnnotation(NetRequest.class);
            if (netJceResolver != null) {
                aVar.l = new dt(netJceResolver.inJce(), netJceResolver.outJce());
                aVar.m = netJceResolver.queryRange();
            } else if (netFileResolver != null) {
                aVar.l = new ds(netFileResolver.outFile());
                aVar.m = netFileResolver.queryRange();
            } else if (netJsonResolver != null) {
                aVar.l = new du(netJsonResolver.outModel());
                aVar.m = netJsonResolver.queryRange();
            }
            if (netRequest != null) {
                aVar.a = this.b.getSimpleName();
                aVar.k = netRequest.method();
                aVar.b = method.getName();
                aVar.d = netRequest.authority();
                aVar.h = netRequest.userAgent();
                aVar.e = netRequest.queryKeys();
                aVar.i = netRequest.retry();
                aVar.j = netRequest.useExtraQuery();
                NetHead head = netRequest.head();
                String[] keys = head.keys();
                String[] values = head.values();
                if (keys.length > 0 && keys.length == values.length) {
                    aVar.f = new HashMap<>();
                    for (int i = 0; i < keys.length; i++) {
                        aVar.f.put(keys[i], values[i]);
                    }
                }
                StringBuilder sb = new StringBuilder();
                de deVar = de.this;
                String str2 = aVar.d;
                StringBuilder sb2 = new StringBuilder();
                if (hb.a(str2)) {
                    str2 = deVar.i();
                }
                if (TextUtils.isEmpty(str2)) {
                    str = null;
                } else {
                    String j = deVar.j();
                    if (!TextUtils.isEmpty(j)) {
                        sb2.append(j);
                        sb2.append("://");
                    }
                    sb2.append(str2);
                    str = sb2.toString();
                }
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                String path = netRequest.path();
                if (path.length() != 0) {
                    sb.append("/");
                    sb.append(path);
                }
                aVar.g = netRequest.constQuery();
                aVar.c = sb.toString();
            }
            return aVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String str;
            a aVar = new a((byte) 0);
            NetJceResolver netJceResolver = (NetJceResolver) method.getAnnotation(NetJceResolver.class);
            NetFileResolver netFileResolver = (NetFileResolver) method.getAnnotation(NetFileResolver.class);
            NetJsonResolver netJsonResolver = (NetJsonResolver) method.getAnnotation(NetJsonResolver.class);
            NetRequest netRequest = (NetRequest) method.getAnnotation(NetRequest.class);
            if (netJceResolver != null) {
                aVar.l = new dt(netJceResolver.inJce(), netJceResolver.outJce());
                aVar.m = netJceResolver.queryRange();
            } else if (netFileResolver != null) {
                aVar.l = new ds(netFileResolver.outFile());
                aVar.m = netFileResolver.queryRange();
            } else if (netJsonResolver != null) {
                aVar.l = new du(netJsonResolver.outModel());
                aVar.m = netJsonResolver.queryRange();
            }
            if (netRequest != null) {
                aVar.a = this.b.getSimpleName();
                aVar.k = netRequest.method();
                aVar.b = method.getName();
                aVar.d = netRequest.authority();
                aVar.h = netRequest.userAgent();
                aVar.e = netRequest.queryKeys();
                aVar.i = netRequest.retry();
                aVar.j = netRequest.useExtraQuery();
                NetHead head = netRequest.head();
                String[] keys = head.keys();
                String[] values = head.values();
                if (keys.length > 0 && keys.length == values.length) {
                    aVar.f = new HashMap<>();
                    for (int i = 0; i < keys.length; i++) {
                        aVar.f.put(keys[i], values[i]);
                    }
                }
                StringBuilder sb = new StringBuilder();
                de deVar = de.this;
                String str2 = aVar.d;
                StringBuilder sb2 = new StringBuilder();
                if (hb.a(str2)) {
                    str2 = deVar.i();
                }
                if (TextUtils.isEmpty(str2)) {
                    str = null;
                } else {
                    String j = deVar.j();
                    if (!TextUtils.isEmpty(j)) {
                        sb2.append(j);
                        sb2.append("://");
                    }
                    sb2.append(str2);
                    str = sb2.toString();
                }
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                String path = netRequest.path();
                if (path.length() != 0) {
                    sb.append("/");
                    sb.append(path);
                }
                aVar.g = netRequest.constQuery();
                aVar.c = sb.toString();
            }
            if (!de.this.c) {
                kj.d(ki.g, "The Service[" + this.b.getSimpleName() + "] is block!!  Please check the ServiceProtocol for corrected, or contact the Tencent MapSdk Office to enable it. ");
                if (aVar.k == NetMethod.URL) {
                    return "";
                }
                return null;
            } else if (aVar.k == NetMethod.URL) {
                String str3 = aVar.c;
                String b = de.this.b(aVar, objArr);
                if (b.length() != 0) {
                    str3 = str3 + CommonConstant.Symbol.QUESTION_MARK + b;
                }
                aVar.c = str3;
                kj.c(ki.g, aVar.toString());
                return str3;
            } else if (aVar.l != null) {
                return aVar.l.a(de.this.a(aVar, aVar.l.a(aVar.m, objArr)));
            } else {
                return de.this.a(aVar, objArr);
            }
        }
    }

    public final String j() {
        return this.b ? "https" : "http";
    }

    private static /* synthetic */ String a(de deVar, String str) {
        StringBuilder sb = new StringBuilder();
        if (hb.a(str)) {
            str = deVar.i();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String j = deVar.j();
        if (!TextUtils.isEmpty(j)) {
            sb.append(j);
            sb.append("://");
        }
        sb.append(str);
        return sb.toString();
    }
}
