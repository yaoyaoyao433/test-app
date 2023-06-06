package com.dianping.nvnetwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dianping.com.nvlinker.stub.IRequest;
import dianping.com.nvlinker.stub.IRequestBuilder;
import java.io.InputStream;
import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class Request implements IRequest {
    public static ChangeQuickRedirect a;
    private String A;
    private boolean B;
    private boolean C;
    private int D;
    private String E;
    @Deprecated
    private Proxy F;
    @Deprecated
    private boolean G;
    public int b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public HashMap<String, String> g;
    public int h;
    public InputStream i;
    public com.dianping.nvnetwork.cache.c j;
    public String k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public Object q;
    public boolean r;
    public boolean s;
    int t;
    boolean u;
    public HostnameVerifier v;
    public SSLSocketFactory w;
    public String x;
    public Map<String, String> y;
    private String z;

    public Request(Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0acf1ddf320db29213a3413b6ab5bb45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0acf1ddf320db29213a3413b6ab5bb45");
            return;
        }
        this.b = 0;
        this.D = 100;
        this.E = null;
        this.z = builder.reqId;
        if (this.z == null) {
            this.z = p.a();
        }
        this.A = builder.traceId;
        if (this.A == null) {
            this.A = com.dianping.nvnetwork.util.m.a().b();
        }
        this.d = builder.url;
        this.e = builder.ipUrl;
        this.f = builder.method;
        this.g = builder.headers;
        this.h = builder.timeout;
        this.i = builder.input;
        this.j = builder.defaultCacheType;
        this.B = builder.disableStatistics;
        this.l = builder.isPostFailOver;
        this.F = builder.proxy;
        this.D = builder.samplingRate;
        this.m = builder.isFailOver;
        this.n = builder.isOnlyTcp;
        this.o = builder.isOnlyQuic;
        this.x = builder.catCommand;
        if (builder.catExtendMap != null) {
            this.y = new HashMap(builder.catExtendMap);
        }
        this.v = builder.hostnameVerifier;
        this.w = builder.sslSocketFactory;
        this.q = builder.tag;
        this.k = builder.cacheKey;
        this.b = builder.zip;
        this.c = builder.zipSet;
        this.r = builder.sync;
        this.s = builder.forceHttpTunnel;
        this.G = builder.disableGlobalInterceptors;
        this.t = builder.disableInterceptorsFlag;
        this.u = builder.disableLogan;
    }

    public final Builder a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d0b639a35edd5d4f845e1366c16eb30", 6917529027641081856L) ? (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d0b639a35edd5d4f845e1366c16eb30") : new Builder(this);
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cbfcbd56ab08ee6b765c96ff110660f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cbfcbd56ab08ee6b765c96ff110660f");
        }
        if (this.z == null) {
            this.z = p.a();
        }
        return this.z;
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f212bb411057586a2e69ddc78d697e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f212bb411057586a2e69ddc78d697e");
        }
        if (this.A == null) {
            this.A = com.dianping.nvnetwork.util.m.a().b();
        }
        return this.A;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f;
    }

    public final HashMap<String, String> f() {
        return this.g;
    }

    public final InputStream g() {
        return this.i;
    }

    public final int h() {
        if (this.B) {
            return 0;
        }
        return this.D;
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "770205a6ad5e5572bf15634bdef27548", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "770205a6ad5e5572bf15634bdef27548");
            return;
        }
        if (this.g == null) {
            this.g = new HashMap<>();
        }
        this.g.put(str, str2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class Builder implements IRequestBuilder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String cacheKey;
        public String catCommand;
        public Map<String, String> catExtendMap;
        public com.dianping.nvnetwork.cache.c defaultCacheType;
        public boolean disableGlobalInterceptors;
        public int disableInterceptorsFlag;
        public boolean disableLogan;
        public boolean disableStatistics;
        public boolean forceHttpTunnel;
        public HashMap<String, String> headers;
        public HostnameVerifier hostnameVerifier;
        public InputStream input;
        public String ipUrl;
        public boolean isFailOver;
        public boolean isOnlyQuic;
        public boolean isOnlyTcp;
        public boolean isPostFailOver;
        public boolean isRefused;
        public boolean isSupport0Rtt;
        public String method;
        public Proxy proxy;
        public String reqId;
        public int samplingRate;
        public SSLSocketFactory sslSocketFactory;
        public boolean sync;
        public Object tag;
        public int timeout;
        public String traceId;
        public String url;
        public int zip;
        public boolean zipSet;

        @Override // dianping.com.nvlinker.stub.IRequestBuilder
        public final /* bridge */ /* synthetic */ IRequestBuilder headers(HashMap hashMap) {
            return headers((HashMap<String, String>) hashMap);
        }

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dafc3fade9331cfe79c855a52125f1e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dafc3fade9331cfe79c855a52125f1e");
                return;
            }
            this.defaultCacheType = com.dianping.nvnetwork.cache.c.DISABLED;
            this.isFailOver = true;
            this.samplingRate = 100;
            this.zip = 0;
            this.method = "GET";
        }

        public Builder(Request request) {
            Object[] objArr = {request};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b803da5f9f9f5fa4890b6721b4ed7fb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b803da5f9f9f5fa4890b6721b4ed7fb");
                return;
            }
            this.defaultCacheType = com.dianping.nvnetwork.cache.c.DISABLED;
            this.isFailOver = true;
            this.samplingRate = 100;
            this.zip = 0;
            this.reqId = request.b();
            this.traceId = request.c();
            this.url = request.d;
            this.ipUrl = request.e;
            this.method = request.f;
            this.headers = request.g;
            this.timeout = request.h;
            this.input = request.i;
            this.defaultCacheType = request.j;
            this.disableStatistics = request.B;
            this.isPostFailOver = request.l;
            this.proxy = request.F;
            this.samplingRate = request.D;
            this.isFailOver = request.m;
            this.isOnlyTcp = request.n;
            this.isOnlyQuic = request.o;
            this.isRefused = request.p;
            this.catCommand = request.x;
            if (request.y != null) {
                this.catExtendMap = new HashMap(request.y);
            }
            this.hostnameVerifier = request.v;
            this.sslSocketFactory = request.w;
            this.tag = request.q;
            this.cacheKey = request.k;
            this.zip = request.b;
            this.zipSet = true;
            this.sync = request.r;
            this.forceHttpTunnel = request.s;
            this.disableGlobalInterceptors = request.G;
            this.disableInterceptorsFlag = request.t;
            this.disableLogan = request.u;
            this.isSupport0Rtt = request.C;
        }

        @Override // dianping.com.nvlinker.stub.IRequestBuilder
        public final Builder reqId(String str) {
            this.reqId = str;
            return this;
        }

        public final Builder traceId(String str) {
            this.traceId = str;
            return this;
        }

        @Override // dianping.com.nvlinker.stub.IRequestBuilder
        public final Builder url(String str) {
            this.url = str;
            return this;
        }

        @Override // dianping.com.nvlinker.stub.IRequestBuilder
        public final Builder ipUrl(String str) {
            this.ipUrl = str;
            return this;
        }

        public final Builder catCommand(String str) {
            this.catCommand = str;
            return this;
        }

        public final Builder catExtendMap(Map<String, String> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db7a09550bcdd7cf28d96ebc76d67b6b", 6917529027641081856L)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db7a09550bcdd7cf28d96ebc76d67b6b");
            }
            if (map != null) {
                this.catExtendMap = new HashMap(map);
            }
            return this;
        }

        @Override // dianping.com.nvlinker.stub.IRequestBuilder
        public final Builder method(String str) {
            this.method = str;
            return this;
        }

        @Override // dianping.com.nvlinker.stub.IRequestBuilder
        public final Request get() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53b6584fc0cd51eabe554d4862824e9f", 6917529027641081856L)) {
                return (Request) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53b6584fc0cd51eabe554d4862824e9f");
            }
            this.method = "GET";
            return new Request(this);
        }

        @Override // dianping.com.nvlinker.stub.IRequestBuilder
        public final Request post() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c75240d614ea8a9bd80c45d0654a02c", 6917529027641081856L)) {
                return (Request) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c75240d614ea8a9bd80c45d0654a02c");
            }
            this.method = "POST";
            return new Request(this);
        }

        @Override // dianping.com.nvlinker.stub.IRequestBuilder
        public final Builder headers(HashMap<String, String> hashMap) {
            this.headers = hashMap;
            return this;
        }

        @Override // dianping.com.nvlinker.stub.IRequestBuilder
        public final Builder addHeaders(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d001ef1eabf097718c671d47e5155e1d", 6917529027641081856L)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d001ef1eabf097718c671d47e5155e1d");
            }
            if (this.headers == null) {
                this.headers = new HashMap<>();
            }
            this.headers.put(str, str2);
            return this;
        }

        @Override // dianping.com.nvlinker.stub.IRequestBuilder
        public final Builder timeout(int i) {
            this.timeout = i;
            return this;
        }

        @Override // dianping.com.nvlinker.stub.IRequestBuilder
        public final Builder input(InputStream inputStream) {
            this.input = inputStream;
            return this;
        }

        public final Builder input(com.dianping.nvnetwork.util.f fVar) {
            this.input = fVar;
            return this;
        }

        public final Builder isSupport0Rtt(boolean z) {
            this.isSupport0Rtt = z;
            return this;
        }

        public final Builder params(HashMap<String, String> hashMap) {
            Object[] objArr = {hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cdfd9806db00c6eb6a9fde4978a2aea", 6917529027641081856L)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cdfd9806db00c6eb6a9fde4978a2aea");
            }
            this.input = new com.dianping.nvnetwork.util.f(hashMap);
            return this;
        }

        public final Builder params(HashMap<String, String> hashMap, String str) {
            Object[] objArr = {hashMap, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f92145332ec86575067c63ad5f3655a", 6917529027641081856L)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f92145332ec86575067c63ad5f3655a");
            }
            this.input = new com.dianping.nvnetwork.util.f(hashMap, str);
            return this;
        }

        public final Builder params(String... strArr) {
            Object[] objArr = {strArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f61aa7f2db9ac4cedb21ce9a0f9966f", 6917529027641081856L)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f61aa7f2db9ac4cedb21ce9a0f9966f");
            }
            this.input = new com.dianping.nvnetwork.util.f(strArr);
            return this;
        }

        public final Builder defaultCacheType(com.dianping.nvnetwork.cache.c cVar) {
            this.defaultCacheType = cVar;
            return this;
        }

        public final Builder disableStatistics(boolean z) {
            this.disableStatistics = z;
            return this;
        }

        public final Builder samplingRate(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54f2d7d99932190f1a4aea87510ebba0", 6917529027641081856L)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54f2d7d99932190f1a4aea87510ebba0");
            }
            if (i < 0) {
                i = 0;
            }
            if (i > 100) {
                i = 100;
            }
            this.samplingRate = i;
            return this;
        }

        @Deprecated
        public final Builder proxy(Proxy proxy) {
            this.proxy = proxy;
            return this;
        }

        public final Builder isPostFailOver(boolean z) {
            this.isPostFailOver = z;
            return this;
        }

        public final Builder isFailOver(boolean z) {
            this.isFailOver = z;
            return this;
        }

        public final Builder isOnlyTcp(boolean z) {
            this.isOnlyTcp = z;
            return this;
        }

        public final Builder isOnlyQuic(boolean z) {
            this.isOnlyQuic = z;
            return this;
        }

        public final Builder isRefused(boolean z) {
            this.isRefused = z;
            return this;
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactory = sSLSocketFactory;
            return this;
        }

        public final Builder tag(Object obj) {
            this.tag = obj;
            return this;
        }

        public final Builder cacheKey(String str) {
            this.cacheKey = str;
            return this;
        }

        public final Builder zip(int i) {
            this.zip = i;
            this.zipSet = true;
            return this;
        }

        public final Builder isForceHttpTunnel(boolean z) {
            this.forceHttpTunnel = z;
            return this;
        }

        @Deprecated
        public final Builder disableGlobalInterceptors(boolean z) {
            this.disableGlobalInterceptors = z;
            return this;
        }

        public final Builder disableInterceptors(int i) {
            this.disableInterceptorsFlag = i;
            return this;
        }

        public final Builder disableLogan(boolean z) {
            this.disableLogan = z;
            return this;
        }

        @Override // dianping.com.nvlinker.stub.IRequestBuilder
        public final Request build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d0362c1dd60798903caf002b42b0cc3", 6917529027641081856L) ? (Request) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d0362c1dd60798903caf002b42b0cc3") : new Request(this);
        }
    }
}
