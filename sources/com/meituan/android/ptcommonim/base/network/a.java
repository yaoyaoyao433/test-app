package com.meituan.android.ptcommonim.base.network;

import com.meituan.android.ptcommonim.base.network.model.BaseDataEntity;
import com.meituan.android.ptcommonim.cardrender.model.MachData;
import com.meituan.android.ptcommonim.feedback.model.PTQuestionSubmitData;
import com.meituan.android.singleton.b;
import com.meituan.android.singleton.i;
import com.meituan.android.singleton.k;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.raw.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a d;
    public final ar b;
    public final UserCenter c;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5657eeb173be392430847bab562eaea7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5657eeb173be392430847bab562eaea7");
        }
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new a();
                }
            }
        }
        return d;
    }

    public a() {
        a.InterfaceC0637a a2;
        OkHttpClient build;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff67b0473f5f3852073d734316648020", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff67b0473f5f3852073d734316648020");
            return;
        }
        ar.a a3 = new ar.a().a("https://im-api.meituan.com");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59a703dff347c326bf29dbccfa20f5a4", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59a703dff347c326bf29dbccfa20f5a4");
        } else if ("com.sankuai.meituan.meituanwaimaibusiness".equals(b.a().getPackageName())) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "da9642a8403db0ac936addbba903212e", RobustBitConfig.DEFAULT_VALUE)) {
                build = (OkHttpClient) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "da9642a8403db0ac936addbba903212e");
            } else {
                Dispatcher dispatcher = new Dispatcher();
                dispatcher.setMaxRequests(20);
                dispatcher.setMaxRequestsPerHost(20);
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                OkHttp3Wrapper.addInterceptorToBuilder(builder);
                build = builder.dispatcher(dispatcher).connectTimeout(10000L, TimeUnit.MILLISECONDS).readTimeout(10000L, TimeUnit.MILLISECONDS).writeTimeout(10000L, TimeUnit.MILLISECONDS).build();
            }
            a2 = com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(build);
        } else {
            a2 = i.a("oknv");
        }
        this.b = a3.a(a2).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a();
        this.c = k.a();
    }

    public final Call<MachData> a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ebf8d94ffdfbef7b46458ed918aaa2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ebf8d94ffdfbef7b46458ed918aaa2");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appId", str);
        hashMap.put("channel", str2);
        hashMap.put("buId", str3);
        return ((BaseApiRetrofitService) this.b.a(BaseApiRetrofitService.class)).getMachInfo(hashMap);
    }

    public final Call<BaseDataEntity<PTQuestionSubmitData>> a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ead79f00b81e72b54e94a7a80c5d14a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ead79f00b81e72b54e94a7a80c5d14a7");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appId", com.meituan.android.ptcommonim.protocol.env.a.b);
        return ((BaseApiRetrofitService) this.b.a(BaseApiRetrofitService.class)).submitEvalution(b(hashMap), map, b());
    }

    public Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ae81ff10d56d0a4c3144edf8118d3f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ae81ff10d56d0a4c3144edf8118d3f9");
        }
        HashMap hashMap = new HashMap(4);
        if (this.c != null && this.c.isLogin()) {
            hashMap.put("token", this.c.getToken());
            hashMap.put("userid", Long.valueOf(this.c.getUserId()));
        }
        return hashMap;
    }

    public Map<String, Object> b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d319baeee79e480e31b31b42848485b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d319baeee79e480e31b31b42848485b");
        }
        if (this.c != null && this.c.isLogin()) {
            map.put("token", this.c.getToken());
            map.put("userid", Long.valueOf(this.c.getUserId()));
        }
        return map;
    }
}
