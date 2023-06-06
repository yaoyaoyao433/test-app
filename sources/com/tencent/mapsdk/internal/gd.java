package com.tencent.mapsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.monitor.report.db.TraceBean;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.NetUtil;
import com.tencent.mapsdk.internal.bn;
import com.tencent.mapsdk.internal.jy;
import com.tencent.mapsdk.internal.jz;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.TencentMapProtocol;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class gd {
    static volatile boolean a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(final Context context, final SharedPreferences sharedPreferences, final a aVar) {
        if (aVar == null || context == null) {
            return false;
        }
        if (kj.d(ki.i) && Build.VERSION.SDK_INT < 30) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("日志名称:\n");
                sb.append(aVar.a());
                sb.append("\n");
                new StringBuilder();
                String format = SimpleDateFormat.getInstance().format(new Date(aVar.c));
                sb.append("创建时间:\n");
                sb.append(format);
                sb.append("\n");
                String format2 = SimpleDateFormat.getInstance().format(new Date((aVar.b != null ? Long.parseLong(aVar.b.b) : 0L) * 1000));
                sb.append("过期时间:\n");
                sb.append(format2);
                sb.append("\n");
                final jz.a a2 = jz.a(context, "调试模式", sb.toString(), 1);
                return a2.a().a("上报(仅WIFI)", new View.OnClickListener() { // from class: com.tencent.mapsdk.internal.gd.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (!gd.a && a.this.a(context)) {
                            a2.a("上报中", (View.OnClickListener) null);
                            a.this.a(new Callback<Boolean>() { // from class: com.tencent.mapsdk.internal.gd.3.1
                                @Override // com.tencent.map.tools.Callback
                                public final /* synthetic */ void callback(Boolean bool) {
                                    if (!bool.booleanValue()) {
                                        kj.c(ki.i, "清理本地缓存");
                                        ke.a(sharedPreferences).a("reportFile", "");
                                    }
                                    jz.a aVar2 = a2;
                                    if (aVar2.a != null) {
                                        aVar2.a.cancel();
                                    }
                                    gd.a = false;
                                }

                                private void a(Boolean bool) {
                                    if (!bool.booleanValue()) {
                                        kj.c(ki.i, "清理本地缓存");
                                        ke.a(sharedPreferences).a("reportFile", "");
                                    }
                                    jz.a aVar2 = a2;
                                    if (aVar2.a != null) {
                                        aVar2.a.cancel();
                                    }
                                    gd.a = false;
                                }
                            });
                            gd.a = true;
                            return;
                        }
                        kj.c(ki.i, "正在上传中");
                    }
                }).b();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (!a && aVar.a(context)) {
            aVar.a(new Callback<Boolean>() { // from class: com.tencent.mapsdk.internal.gd.4
                @Override // com.tencent.map.tools.Callback
                public final /* synthetic */ void callback(Boolean bool) {
                    if (!bool.booleanValue()) {
                        kj.c(ki.i, "清理本地缓存");
                        ke.a(sharedPreferences).a("reportFile", "");
                    }
                    gd.a = false;
                }

                private void a(Boolean bool) {
                    if (!bool.booleanValue()) {
                        kj.c(ki.i, "清理本地缓存");
                        ke.a(sharedPreferences).a("reportFile", "");
                    }
                    gd.a = false;
                }
            });
            a = true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b extends JsonComposer {
        @Json(name = "token")
        String a;
        @Json(name = "expire")
        String b;
        @Json(name = "host")
        String c;

        b() {
        }

        final boolean a() {
            try {
                return Long.parseLong(this.b) < SystemClock.uptimeMillis() / 1000;
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends JsonComposer {
        @Json(name = "name")
        String a;
        @Json(name = "token")
        b b;
        @Json(name = TraceBean.CREATE_TIME)
        long c;
        @Json(ignore = true)
        bn d;

        public a(bn bnVar) {
            this(bnVar, "");
        }

        public a(bn bnVar, String str) {
            this.a = str;
            this.d = bnVar;
            this.c = System.currentTimeMillis();
        }

        private long c() {
            return this.c;
        }

        private long d() {
            if (this.b != null) {
                return Long.parseLong(this.b.b);
            }
            return 0L;
        }

        public final String a() {
            return "android-" + this.a + CommonConstant.Symbol.MINUS + this.c;
        }

        public final String b() {
            return a() + MRNBundleManager.MRN_BUNDLE_SUFFIX;
        }

        private String e() {
            return AbsApiFactory.HTTPS + this.b.c + "/" + b();
        }

        public final boolean a(Context context) {
            return (!NetUtil.isWifi(context) || this.b == null || this.b.a()) ? false : true;
        }

        public final void a(final Callback<Boolean> callback) {
            jy.a((jy.g) new jy.g<Boolean>() { // from class: com.tencent.mapsdk.internal.gd.a.2
                private Boolean a() throws Exception {
                    return Boolean.valueOf(a.a(a.this));
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() throws Exception {
                    return Boolean.valueOf(a.a(a.this));
                }
            }).a((jy.a) new jy.a<Boolean>() { // from class: com.tencent.mapsdk.internal.gd.a.1
                @Override // com.tencent.mapsdk.internal.jy.a, com.tencent.map.tools.Callback
                public final /* bridge */ /* synthetic */ void callback(Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (callback != null) {
                        callback.callback(bool);
                    }
                }

                private void a(Boolean bool) {
                    if (callback != null) {
                        callback.callback(bool);
                    }
                }
            });
        }

        private boolean f() throws Exception {
            byte[] c;
            File[] listFiles;
            if (this.d == null) {
                return false;
            }
            File file = new File(mi.a(this.d.getContext(), (TencentMapOptions) null).a());
            File a = kc.a(file, a());
            kj.c(ki.i, "创建上传文件目录:".concat(String.valueOf(a)));
            File b = kc.b(a, "base-info.txt");
            StringBuilder sb = new StringBuilder();
            bn.b u = this.d.u();
            sb.append(gy.a(u.c, u.d));
            sb.append("&engine_draw_version=");
            sb.append(this.d.v());
            sb.append("&engine_data_version=");
            sb.append(this.d.w());
            sb.append("&camera=");
            sb.append(this.d.b.getMap().getCameraPosition());
            kj.c(ki.i, "日志数据:".concat(String.valueOf(sb)));
            kc.a(b, sb.toString().getBytes());
            kj.c(ki.i, "收集日志数据至文件:".concat(String.valueOf(b)));
            kc.b(new File(mi.a(this.d.getContext(), (TencentMapOptions) null).a(this.d.u().c)), new File(a, "config"));
            String a2 = this.d.y().a();
            if (!TextUtils.isEmpty(a2)) {
                File b2 = kc.b(a, "engine-crash-info.txt");
                kj.c(ki.i, "收集引擎Crash至文件:".concat(String.valueOf(b2)));
                kc.a(b2, a2.getBytes());
            }
            String b3 = this.d.y().b();
            if (!TextUtils.isEmpty(b3)) {
                File b4 = kc.b(a, "engine-log-info.txt");
                kj.c(ki.i, "收集引擎日志至文件:".concat(String.valueOf(b4)));
                kc.a(b4, b3.getBytes());
            }
            File d = u.a().a.d();
            if (d != null && d.exists() && d.isDirectory() && (listFiles = d.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2 != null && file2.exists() && file2.isFile()) {
                        kc.b(file2, new File(a, "plugin"));
                    }
                }
            }
            String a3 = kj.a();
            if (!TextUtils.isEmpty(a3)) {
                File file3 = new File(a3);
                if (file3.exists() && file3.isDirectory()) {
                    File[] e = kc.e(file3, ".*.log.*");
                    if (e != null) {
                        for (File file4 : e) {
                            if (file4 != null && file4.exists() && file4.isFile()) {
                                kc.b(file4, new File(a, "logs"));
                            }
                        }
                    }
                    File[] e2 = kc.e(file3, "archive-.*.zip");
                    if (e2 != null) {
                        for (File file5 : e2) {
                            if (file5 != null && file5.exists() && file5.isFile()) {
                                kc.b(file5, new File(a, "archives"));
                            }
                        }
                    }
                }
            }
            File a4 = kf.a(a, file.getAbsolutePath());
            kj.c(ki.i, "打包成zip文件:".concat(String.valueOf(a4)));
            if (a4 == null || (c = kc.c(a4)) == null) {
                return false;
            }
            kj.c(ki.i, "zip文件大小:" + c.length);
            if (c.length > 0) {
                kj.c(ki.i, "开始上传文件到：" + e());
                String a5 = kt.a(a4);
                NetRequest postData = new NetRequest(NetMethod.PUT, e()).setPostData(c);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c.length);
                NetResponse doRequest = NetManager.getInstance().doRequest(postData.setMapHeaders("Content-Length", sb2.toString()).setMapHeaders("Authorization", this.b.a).setMapHeaders("x-cos-content-sha1", a5).setTimeout(120000));
                kj.c(ki.i, "结束上传文件");
                kc.b(a4);
                kc.b(a);
                int i = doRequest.statusCode;
                kj.c(ki.i, "上传状态:".concat(String.valueOf(i)));
                return i == 200;
            }
            return false;
        }

        private byte[] g() {
            StringBuilder sb = new StringBuilder();
            bn.b u = this.d.u();
            sb.append(gy.a(u.c, u.d));
            sb.append("&engine_draw_version=");
            sb.append(this.d.v());
            sb.append("&engine_data_version=");
            sb.append(this.d.w());
            sb.append("&camera=");
            sb.append(this.d.b.getMap().getCameraPosition());
            kj.c(ki.i, "日志数据:".concat(String.valueOf(sb)));
            return sb.toString().getBytes();
        }

        static /* synthetic */ boolean a(a aVar) throws Exception {
            byte[] c;
            File[] listFiles;
            if (aVar.d != null) {
                File file = new File(mi.a(aVar.d.getContext(), (TencentMapOptions) null).a());
                File a = kc.a(file, aVar.a());
                kj.c(ki.i, "创建上传文件目录:".concat(String.valueOf(a)));
                File b = kc.b(a, "base-info.txt");
                StringBuilder sb = new StringBuilder();
                bn.b u = aVar.d.u();
                sb.append(gy.a(u.c, u.d));
                sb.append("&engine_draw_version=");
                sb.append(aVar.d.v());
                sb.append("&engine_data_version=");
                sb.append(aVar.d.w());
                sb.append("&camera=");
                sb.append(aVar.d.b.getMap().getCameraPosition());
                kj.c(ki.i, "日志数据:".concat(String.valueOf(sb)));
                kc.a(b, sb.toString().getBytes());
                kj.c(ki.i, "收集日志数据至文件:".concat(String.valueOf(b)));
                kc.b(new File(mi.a(aVar.d.getContext(), (TencentMapOptions) null).a(aVar.d.u().c)), new File(a, "config"));
                String a2 = aVar.d.y().a();
                if (!TextUtils.isEmpty(a2)) {
                    File b2 = kc.b(a, "engine-crash-info.txt");
                    kj.c(ki.i, "收集引擎Crash至文件:".concat(String.valueOf(b2)));
                    kc.a(b2, a2.getBytes());
                }
                String b3 = aVar.d.y().b();
                if (!TextUtils.isEmpty(b3)) {
                    File b4 = kc.b(a, "engine-log-info.txt");
                    kj.c(ki.i, "收集引擎日志至文件:".concat(String.valueOf(b4)));
                    kc.a(b4, b3.getBytes());
                }
                File d = u.a().a.d();
                if (d != null && d.exists() && d.isDirectory() && (listFiles = d.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2 != null && file2.exists() && file2.isFile()) {
                            kc.b(file2, new File(a, "plugin"));
                        }
                    }
                }
                String a3 = kj.a();
                if (!TextUtils.isEmpty(a3)) {
                    File file3 = new File(a3);
                    if (file3.exists() && file3.isDirectory()) {
                        File[] e = kc.e(file3, ".*.log.*");
                        if (e != null) {
                            for (File file4 : e) {
                                if (file4 != null && file4.exists() && file4.isFile()) {
                                    kc.b(file4, new File(a, "logs"));
                                }
                            }
                        }
                        File[] e2 = kc.e(file3, "archive-.*.zip");
                        if (e2 != null) {
                            for (File file5 : e2) {
                                if (file5 != null && file5.exists() && file5.isFile()) {
                                    kc.b(file5, new File(a, "archives"));
                                }
                            }
                        }
                    }
                }
                File a4 = kf.a(a, file.getAbsolutePath());
                kj.c(ki.i, "打包成zip文件:".concat(String.valueOf(a4)));
                if (a4 != null && (c = kc.c(a4)) != null) {
                    kj.c(ki.i, "zip文件大小:" + c.length);
                    if (c.length > 0) {
                        kj.c(ki.i, "开始上传文件到：" + aVar.e());
                        String a5 = kt.a(a4);
                        NetRequest postData = new NetRequest(NetMethod.PUT, aVar.e()).setPostData(c);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c.length);
                        NetResponse doRequest = NetManager.getInstance().doRequest(postData.setMapHeaders("Content-Length", sb2.toString()).setMapHeaders("Authorization", aVar.b.a).setMapHeaders("x-cos-content-sha1", a5).setTimeout(120000));
                        kj.c(ki.i, "结束上传文件");
                        kc.b(a4);
                        kc.b(a);
                        int i = doRequest.statusCode;
                        kj.c(ki.i, "上传状态:".concat(String.valueOf(i)));
                        return i == 200;
                    }
                }
            }
            return false;
        }
    }

    public static boolean a(bn bnVar) {
        cm e;
        final a aVar;
        if (bnVar != null && !bnVar.e) {
            TencentMapProtocol tencentMapProtocol = (TencentMapProtocol) bnVar.getMapComponent(TencentMapProtocol.class);
            if (!(tencentMapProtocol instanceof ck)) {
                e = ck.e();
            } else {
                e = ((ck) tencentMapProtocol).d().b;
            }
            if (!e.a()) {
                final Context context = bnVar.getContext();
                final bn.b u = bnVar.u();
                String a2 = u.a();
                final SharedPreferences a3 = ke.a(context, "uploadConfig." + u.c());
                String string = a3.getString("reportFile", null);
                if (!TextUtils.isEmpty(string)) {
                    try {
                        kj.c(ki.i, "获取本地上报文件：".concat(String.valueOf(string)));
                        aVar = (a) JsonUtils.parseToModel(new JSONObject(string), a.class, bnVar);
                    } catch (Exception unused) {
                    }
                    if (aVar != null || !a2.equals(aVar.a)) {
                        kj.c(ki.i, "重新创建上报文件");
                        aVar = new a(bnVar, a2);
                    }
                    if (aVar.b != null || aVar.b.a()) {
                        kj.c(ki.i, "请求token");
                        jy.a((jy.g) new jy.g<JSONObject>() { // from class: com.tencent.mapsdk.internal.gd.2
                            private JSONObject a() throws Exception {
                                NetResponse uploadToken = ((cr) ((dd) ck.a(dd.class)).h()).uploadToken(a.this.b(), u.a, u.b);
                                kj.c(ki.i, "响应状态：" + uploadToken.statusCode);
                                if (uploadToken.available()) {
                                    String a4 = hb.a(uploadToken.data, uploadToken.charset);
                                    kj.c(ki.i, "获取网络token数据：".concat(String.valueOf(a4)));
                                    if (TextUtils.isEmpty(a4)) {
                                        return null;
                                    }
                                    return new JSONObject(a4).optJSONObject(GearsLocator.DETAIL);
                                }
                                return null;
                            }

                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() throws Exception {
                                NetResponse uploadToken = ((cr) ((dd) ck.a(dd.class)).h()).uploadToken(a.this.b(), u.a, u.b);
                                kj.c(ki.i, "响应状态：" + uploadToken.statusCode);
                                if (uploadToken.available()) {
                                    String a4 = hb.a(uploadToken.data, uploadToken.charset);
                                    kj.c(ki.i, "获取网络token数据：".concat(String.valueOf(a4)));
                                    if (TextUtils.isEmpty(a4)) {
                                        return null;
                                    }
                                    return new JSONObject(a4).optJSONObject(GearsLocator.DETAIL);
                                }
                                return null;
                            }
                        }).a((jy.a) new jy.a<JSONObject>() { // from class: com.tencent.mapsdk.internal.gd.1
                            @Override // com.tencent.mapsdk.internal.jy.a, com.tencent.map.tools.Callback
                            public final /* synthetic */ void callback(Object obj) {
                                JSONObject jSONObject = (JSONObject) obj;
                                if (jSONObject != null) {
                                    a.this.b = (b) JsonUtils.parseToModel(jSONObject, b.class, new Object[0]);
                                    gd.a(context, a3, a.this);
                                    JSONObject modelToJson = JsonUtils.modelToJson(a.this);
                                    if (modelToJson != null) {
                                        kj.c(ki.i, "保存上报文件至本地");
                                        ke.a(a3).a("reportFile", modelToJson.toString());
                                    }
                                }
                            }

                            private void a(JSONObject jSONObject) {
                                if (jSONObject != null) {
                                    a.this.b = (b) JsonUtils.parseToModel(jSONObject, b.class, new Object[0]);
                                    gd.a(context, a3, a.this);
                                    JSONObject modelToJson = JsonUtils.modelToJson(a.this);
                                    if (modelToJson != null) {
                                        kj.c(ki.i, "保存上报文件至本地");
                                        ke.a(a3).a("reportFile", modelToJson.toString());
                                    }
                                }
                            }
                        });
                        return false;
                    }
                    kj.c(ki.i, "使用本地上报文件");
                    return a(context, a3, aVar);
                }
                aVar = null;
                if (aVar != null) {
                }
                kj.c(ki.i, "重新创建上报文件");
                aVar = new a(bnVar, a2);
                if (aVar.b != null) {
                }
                kj.c(ki.i, "请求token");
                jy.a((jy.g) new jy.g<JSONObject>() { // from class: com.tencent.mapsdk.internal.gd.2
                    private JSONObject a() throws Exception {
                        NetResponse uploadToken = ((cr) ((dd) ck.a(dd.class)).h()).uploadToken(a.this.b(), u.a, u.b);
                        kj.c(ki.i, "响应状态：" + uploadToken.statusCode);
                        if (uploadToken.available()) {
                            String a4 = hb.a(uploadToken.data, uploadToken.charset);
                            kj.c(ki.i, "获取网络token数据：".concat(String.valueOf(a4)));
                            if (TextUtils.isEmpty(a4)) {
                                return null;
                            }
                            return new JSONObject(a4).optJSONObject(GearsLocator.DETAIL);
                        }
                        return null;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() throws Exception {
                        NetResponse uploadToken = ((cr) ((dd) ck.a(dd.class)).h()).uploadToken(a.this.b(), u.a, u.b);
                        kj.c(ki.i, "响应状态：" + uploadToken.statusCode);
                        if (uploadToken.available()) {
                            String a4 = hb.a(uploadToken.data, uploadToken.charset);
                            kj.c(ki.i, "获取网络token数据：".concat(String.valueOf(a4)));
                            if (TextUtils.isEmpty(a4)) {
                                return null;
                            }
                            return new JSONObject(a4).optJSONObject(GearsLocator.DETAIL);
                        }
                        return null;
                    }
                }).a((jy.a) new jy.a<JSONObject>() { // from class: com.tencent.mapsdk.internal.gd.1
                    @Override // com.tencent.mapsdk.internal.jy.a, com.tencent.map.tools.Callback
                    public final /* synthetic */ void callback(Object obj) {
                        JSONObject jSONObject = (JSONObject) obj;
                        if (jSONObject != null) {
                            a.this.b = (b) JsonUtils.parseToModel(jSONObject, b.class, new Object[0]);
                            gd.a(context, a3, a.this);
                            JSONObject modelToJson = JsonUtils.modelToJson(a.this);
                            if (modelToJson != null) {
                                kj.c(ki.i, "保存上报文件至本地");
                                ke.a(a3).a("reportFile", modelToJson.toString());
                            }
                        }
                    }

                    private void a(JSONObject jSONObject) {
                        if (jSONObject != null) {
                            a.this.b = (b) JsonUtils.parseToModel(jSONObject, b.class, new Object[0]);
                            gd.a(context, a3, a.this);
                            JSONObject modelToJson = JsonUtils.modelToJson(a.this);
                            if (modelToJson != null) {
                                kj.c(ki.i, "保存上报文件至本地");
                                ke.a(a3).a("reportFile", modelToJson.toString());
                            }
                        }
                    }
                });
                return false;
            }
        }
        return false;
    }
}
