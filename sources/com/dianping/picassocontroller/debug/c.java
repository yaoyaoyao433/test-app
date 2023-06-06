package com.dianping.picassocontroller.debug;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.dianping.picasso.PicassoEnvironment;
import com.dianping.picasso.model.PicassoModel;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements Callback {
    public static ChangeQuickRedirect a;
    private static final MediaType k = MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");
    private static String o = UUID.randomUUID().toString();
    public final OkHttpClient b;
    public String c;
    public volatile boolean d;
    public volatile boolean e;
    public LinkedList<b> f;
    public String g;
    public rx.subjects.b<JSONObject> h;
    public BroadcastReceiver i;
    private final OkHttpClient j;
    private int l;
    private int m;
    private Handler n;

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b {
        public String a;
        public String b;

        private b() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        private static c a = new c();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bafdd52f454d85dfa7c4cfcc8a116108", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bafdd52f454d85dfa7c4cfcc8a116108") : a.a;
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81e9cdbe4a9b3a1d4ddc68f2abcc9e81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81e9cdbe4a9b3a1d4ddc68f2abcc9e81");
            return;
        }
        this.e = false;
        this.f = new LinkedList<>();
        this.l = 7777;
        this.m = 7776;
        this.n = new Handler();
        this.h = rx.subjects.b.g();
        this.i = new BroadcastReceiver() { // from class: com.dianping.picassocontroller.debug.LiveLoadOldClient$1
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                rx.subjects.b bVar;
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87921dad44bc6fdfdcb29c332f492ae0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87921dad44bc6fdfdcb29c332f492ae0");
                } else if ("PicassoJSFileChanged".equals(intent.getAction())) {
                    new StringBuilder("extra:").append(intent.getExtras());
                    try {
                        JSONObject jSONObject = new JSONObject(intent.getExtras().getString("fileChange"));
                        c.this.a(jSONObject);
                        bVar = c.this.h;
                        bVar.onNext(jSONObject);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        builder.connectTimeout(0L, TimeUnit.DAYS);
        builder.readTimeout(0L, TimeUnit.DAYS);
        builder.writeTimeout(0L, TimeUnit.DAYS);
        this.b = builder.build();
        this.j = new OkHttpClient();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("PicassoJSFileChanged");
        LocalBroadcastManager.getInstance(PicassoEnvironment.globalContext).registerReceiver(this.i, intentFilter);
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f077712721a894f536964b8500e3c393", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f077712721a894f536964b8500e3c393");
            return;
        }
        this.c = str;
        this.g = "";
        PicassoEnvironment.globalContext.getSharedPreferences("com.dianping.picasso_DEBUG", 0).edit().putString("debug_token", str).apply();
        PicassoEnvironment.globalContext.getSharedPreferences("com.dianping.picasso_DEBUG", 0).edit().putString("debug_domain", "").apply();
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06d16e075c0308b638fa1a4ea02ffb24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06d16e075c0308b638fa1a4ea02ffb24");
            return;
        }
        this.g = str;
        this.c = "";
        PicassoEnvironment.globalContext.getSharedPreferences("com.dianping.picasso_DEBUG", 0).edit().putString("debug_domain", str).apply();
        PicassoEnvironment.globalContext.getSharedPreferences("com.dianping.picasso_DEBUG", 0).edit().putString("debug_token", "").apply();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7924111669749f825fbc76bd6a805bd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7924111669749f825fbc76bd6a805bd7");
        } else if ("picasso_playground".equals(str) || TextUtils.isEmpty(str)) {
            this.c = PicassoEnvironment.globalContext.getSharedPreferences("com.dianping.picasso_DEBUG", 0).getString("debug_token", "");
            if (TextUtils.isEmpty(this.c)) {
                this.g = PicassoEnvironment.globalContext.getSharedPreferences("com.dianping.picasso_DEBUG", 0).getString("debug_domain", "");
            }
        } else if (str.startsWith(AbsApiFactory.HTTP)) {
            c(str);
        } else {
            b(str);
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caae8039b54fc7bc1041450bd4998f32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caae8039b54fc7bc1041450bd4998f32");
            return;
        }
        b poll = (this.f == null || this.f.size() <= 0) ? null : this.f.poll();
        if (poll != null) {
            this.e = true;
            StringBuilder sb = new StringBuilder(poll.a);
            String str = poll.b;
            if (TextUtils.isEmpty(str)) {
                str = "1";
            }
            while (true) {
                b poll2 = this.f.poll();
                if (poll2 != null) {
                    if (str.equals(poll2.b)) {
                        sb.append("\n");
                        sb.append(poll2.a);
                    } else {
                        this.f.addFirst(poll2);
                        break;
                    }
                } else {
                    break;
                }
            }
            final b bVar = new b();
            bVar.a = sb.toString();
            bVar.b = str;
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21b8b39619aa641559aced27162908fd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21b8b39619aa641559aced27162908fd");
                return;
            } else {
                this.n.postDelayed(new Runnable() { // from class: com.dianping.picassocontroller.debug.c.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "952bcf4049e2bf43048e32725af08bdb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "952bcf4049e2bf43048e32725af08bdb");
                        } else if (TextUtils.isEmpty(c.this.c)) {
                            if (TextUtils.isEmpty(c.this.g)) {
                                return;
                            }
                            c.this.j.newCall(new Request.Builder().url(c.this.g + CommonConstant.Symbol.COLON + c.this.m).addHeader("type", bVar.b).post(RequestBody.create(c.k, bVar.a)).build()).enqueue(c.this);
                        } else {
                            String str2 = "";
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("type", bVar.b);
                                jSONObject.put("message", bVar.a);
                                str2 = "token=" + c.this.c + "&data=" + jSONObject.toString();
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            c.this.j.newCall(new Request.Builder().url("https://appmock.sankuai.com/appmockapi/netherswap/putback.api").post(RequestBody.create(c.k, str2)).build()).enqueue(c.this);
                        }
                    }
                }, 100L);
                return;
            }
        }
        this.e = false;
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68a056f0e2793e49a1455b01a194af76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68a056f0e2793e49a1455b01a194af76");
        } else if (TextUtils.isEmpty(this.c) && TextUtils.isEmpty(this.g)) {
            e.a().a(str, i);
        } else {
            b bVar = new b();
            bVar.a = str;
            bVar.b = String.valueOf(i);
            this.f.add(bVar);
            if (!this.e) {
                e();
            }
            e.a().a(str, i);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc7b9300fd006910ac26e7e40c8c9f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc7b9300fd006910ac26e7e40c8c9f5");
        } else {
            this.n.post(new Runnable() { // from class: com.dianping.picassocontroller.debug.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8adf5af97e3d72791f0f790f0c2e80c8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8adf5af97e3d72791f0f790f0c2e80c8");
                    } else if (TextUtils.isEmpty(c.this.c)) {
                        if (TextUtils.isEmpty(c.this.g)) {
                            return;
                        }
                        Request.Builder builder = new Request.Builder();
                        c.this.b.newCall(builder.url(c.this.g + CommonConstant.Symbol.COLON + c.this.l).build()).enqueue(c.this);
                    } else {
                        Request.Builder builder2 = new Request.Builder();
                        c.this.b.newCall(builder2.url("https://appmock.sankuai.com/appmockapi/netherswap/get.api?token=" + c.this.c + "&uuid=" + c.o).build()).enqueue(c.this);
                    }
                }
            });
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) throws IOException {
        Object[] objArr = {call, response};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6af327dc8ad21eb544e8412f6f412389", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6af327dc8ad21eb544e8412f6f412389");
        } else if (call.request().method().equals("POST")) {
            e();
        } else {
            if (response.isSuccessful()) {
                String string = response.body().string();
                if (!TextUtils.isEmpty(string)) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        if (jSONObject.optInt("code") == 1) {
                            String string2 = jSONObject.getString("data");
                            if (!TextUtils.isEmpty(string2)) {
                                jSONObject = new JSONObject(string2);
                            }
                        }
                        a(jSONObject);
                        this.h.onNext(jSONObject);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            if (this.d) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        PicassoModel picassoModel;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91a90737ecae521f95a1824d3af3b90d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91a90737ecae521f95a1824d3af3b90d");
            return;
        }
        final String optString = jSONObject.optString("content");
        final String optString2 = jSONObject.optString(QuickReportConstants.CONFIG_FILE_NAME);
        for (com.dianping.picassocontroller.vc.b bVar : com.dianping.picassocontroller.vc.c.a()) {
            if (bVar instanceof com.dianping.picassocontroller.vc.e) {
                final com.dianping.picassocontroller.vc.e eVar = (com.dianping.picassocontroller.vc.e) bVar;
                String str = eVar.i;
                if ("__for_playground_only__".equals(str) || (!TextUtils.isEmpty(str) && (optString2.contains(str) || str.contains(optString2)))) {
                    if ((eVar instanceof com.dianping.picassocontroller.vc.g) && (picassoModel = ((com.dianping.picassocontroller.vc.g) eVar).u) != null) {
                        f a2 = f.a();
                        String str2 = picassoModel.viewId;
                        Object[] objArr2 = {optString2, str2};
                        ChangeQuickRedirect changeQuickRedirect2 = f.a;
                        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "40b7caf6f79a6b0adf7184adc3a62d93", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "40b7caf6f79a6b0adf7184adc3a62d93");
                        } else if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(str2)) {
                            Set<String> set = a2.d.get(optString2);
                            if (set != null) {
                                set.add(str2);
                            } else {
                                HashSet hashSet = new HashSet();
                                hashSet.add(str2);
                                a2.d.put(optString2, hashSet);
                            }
                        }
                    }
                    eVar.a(new Runnable() { // from class: com.dianping.picassocontroller.debug.c.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d9d0009daeae462037cec8ceddc71c05", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d9d0009daeae462037cec8ceddc71c05");
                                return;
                            }
                            if (eVar.b() instanceof Activity) {
                                new com.sankuai.meituan.android.ui.widget.a((Activity) eVar.b(), optString2 + " loaded!", 0).e(81).a(0, 0, 0, 0).a();
                            }
                            eVar.g();
                            com.dianping.picassocontroller.vc.e eVar2 = eVar;
                            String str3 = optString;
                            Object[] objArr4 = {str3};
                            ChangeQuickRedirect changeQuickRedirect4 = com.dianping.picassocontroller.vc.e.a;
                            if (PatchProxy.isSupport(objArr4, eVar2, changeQuickRedirect4, false, "66810ceb439bd29c91530591bc11f4a9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, eVar2, changeQuickRedirect4, false, "66810ceb439bd29c91530591bc11f4a9");
                            } else {
                                eVar2.a(str3, eVar2.k, eVar2.j);
                            }
                            eVar.d();
                            if (eVar instanceof com.dianping.picassocontroller.vc.g) {
                                ((com.dianping.picassocontroller.vc.g) eVar).j();
                                ((com.dianping.picassocontroller.vc.g) eVar).i();
                            }
                        }
                    });
                }
            }
        }
    }
}
