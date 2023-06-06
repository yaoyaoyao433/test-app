package com.meituan.ai.speech.base.net;

import com.meituan.ai.speech.base.net.b;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.ar;
import com.tencent.open.SocialConstants;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J1\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015H\u0000¢\u0006\u0002\b\u0018R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R#\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/meituan/ai/speech/base/net/AuthRequest;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "getClient", "()Lokhttp3/OkHttpClient;", "client$delegate", "Lkotlin/Lazy;", "retrofit", "Lcom/sankuai/meituan/retrofit2/Retrofit;", "getRetrofit", "()Lcom/sankuai/meituan/retrofit2/Retrofit;", "retrofit$delegate", SocialConstants.TYPE_REQUEST, "", "clientId", "", "clientSecret", "callback", "Lcom/sankuai/meituan/retrofit2/Callback;", "Lcom/meituan/ai/speech/base/net/data/BaseResult;", "Lcom/meituan/ai/speech/base/net/data/AuthResult;", "request$speech_base_release", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ i[] b = {u.a(new s(u.a(a.class), "client", "getClient()Lokhttp3/OkHttpClient;")), u.a(new s(u.a(a.class), "retrofit", "getRetrofit()Lcom/sankuai/meituan/retrofit2/Retrofit;"))};
    public final d c;
    private final d d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ea1fbb95299278c2f8b3ab91a638ff8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ea1fbb95299278c2f8b3ab91a638ff8");
            return;
        }
        this.d = e.a(C0181a.b);
        this.c = e.a(new b());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.meituan.ai.speech.base.net.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0181a extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<OkHttpClient> {
        public static ChangeQuickRedirect a;
        public static final C0181a b = new C0181a();

        public C0181a() {
            super(0);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "991b38a7300ea46ba1721119b331c226", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "991b38a7300ea46ba1721119b331c226");
            }
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ OkHttpClient invoke() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            OkHttp3Wrapper.addInterceptorToBuilder(builder);
            return builder.connectTimeout(60L, TimeUnit.SECONDS).readTimeout(60L, TimeUnit.SECONDS).writeTimeout(60L, TimeUnit.SECONDS).retryOnConnectionFailure(true).build();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/sankuai/meituan/retrofit2/Retrofit;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<ar> {
        public static ChangeQuickRedirect a;

        public b() {
            super(0);
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e50ddb088a7b9c8b670fd17aa0ca7696", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e50ddb088a7b9c8b670fd17aa0ca7696");
            }
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ ar invoke() {
            ar.a aVar = new ar.a();
            b.a aVar2 = com.meituan.ai.speech.base.net.b.a;
            return aVar.a("https://auth-ai.meituan.com/").a(com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(a.a(a.this))).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a();
        }
    }

    public static final /* synthetic */ OkHttpClient a(a aVar) {
        return (OkHttpClient) aVar.d.a();
    }
}
