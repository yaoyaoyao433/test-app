package com.tencent.mapsdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.sdk.comps.vis.VisualLayer;
import com.tencent.map.sdk.comps.vis.VisualLayerOptions;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.Condition;
import com.tencent.map.tools.Util;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class rf extends bm implements dw {
    private Map<String, rc> a;
    private File b;
    private File c;
    private String d;
    private boolean e;
    private List<eb> f;
    private ec g;
    private b h;
    private lg i;
    private Set<String> j;
    private boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b extends Handler {
        WeakReference<rf> a;

        public b(rf rfVar) {
            super(Looper.myLooper());
            this.a = new WeakReference<>(rfVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            rf rfVar = this.a.get();
            if (rfVar == null || message.what == 0) {
                return;
            }
            String str = (String) message.obj;
            int i = message.arg2;
            if (message.arg1 > 0) {
                if (i > 0) {
                    kj.b(ki.x, "循环刷新[" + str + "]次数[" + i + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                    rf.a(rfVar, str);
                }
                message.arg2 = i + 1;
                Message obtain = Message.obtain(message);
                sendMessageDelayed(obtain, obtain.arg1);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void a(bn bnVar) {
        super.a(bnVar);
        this.k = false;
        this.h = new b(this);
        this.a = new ConcurrentHashMap();
        this.f = new CopyOnWriteArrayList();
        this.i = new lg();
        this.j = new HashSet();
        this.d = bnVar.u().a;
        if (!TextUtils.isEmpty(bnVar.u().c)) {
            this.d = bnVar.u().c;
        }
        this.b = new File(bnVar.t().b(), "visual/".concat(String.valueOf(bnVar.u().c())));
        this.c = new File(this.b, "layerInfo.json");
        kj.b(ki.x, "#datalayer config file [" + this.c + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        kj.b(ki.x, "#loadLayerJsonFromLocal");
        byte[] c = kc.c(this.c);
        if (c == null || c.length <= 0) {
            return;
        }
        try {
            b(new JSONObject(new String(c)));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.tencent.mapsdk.internal.dw
    public final VisualLayer a(VisualLayerOptions visualLayerOptions) {
        if (visualLayerOptions == null) {
            return null;
        }
        String layerId = visualLayerOptions.getLayerId();
        kj.b(ki.x, "#createLayer[" + layerId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        rc rcVar = this.a.get(visualLayerOptions.getLayerId());
        if (rcVar != null) {
            rcVar.a(visualLayerOptions);
            return rcVar;
        }
        rc rcVar2 = new rc(visualLayerOptions);
        this.a.put(visualLayerOptions.getLayerId(), rcVar2);
        rcVar2.a(this);
        return rcVar2;
    }

    @Override // com.tencent.mapsdk.internal.dw
    public final void a(String str, int i, int i2) {
        kj.b(ki.x, "#updateLayerVersionInfo[" + str + "], dv=" + i + " sv=" + i2);
        eb i3 = i(str);
        if (i3 != null) {
            if (i2 != i3.d) {
                i3.e = null;
            }
            i3.d = i2;
            if (i != i3.c) {
                i3.e = null;
            }
            i3.c = i;
        }
    }

    @Override // com.tencent.mapsdk.internal.dw
    public final void a(String str) {
        kj.b(ki.x, "#removeLayer[" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (this.a != null) {
            this.a.remove(str);
        }
        e(str);
    }

    @Override // com.tencent.mapsdk.internal.dw
    public final void b(String str) {
        kj.b(ki.x, "#clearCache[" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        File h = h(str);
        kj.b(ki.x, "执行删除文件[" + h + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        kc.f(h);
        a(str, 0, 0);
    }

    @Override // com.tencent.mapsdk.internal.dw
    public final boolean a() {
        return this.k;
    }

    @Override // com.tencent.mapsdk.internal.dw
    public final void a(JSONObject jSONObject) {
        kj.b(ki.x, "#saveLayerInfosToLocal[" + jSONObject + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        this.k = true;
        boolean z = false;
        if (jSONObject != null) {
            z = b(jSONObject);
            if (z) {
                f(jSONObject.toString());
                if (!this.j.isEmpty()) {
                    kj.b(ki.x, "初始化等待队列图层[" + this.j.size() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                    for (String str : this.j) {
                        rc rcVar = this.a.get(str);
                        if (rcVar != null) {
                            rcVar.a(this);
                        }
                    }
                    this.j.clear();
                }
            }
        } else {
            this.e = false;
            this.f.clear();
            this.g = null;
        }
        if (z && this.e) {
            return;
        }
        Util.foreach(this.a.values(), new Callback<rc>() { // from class: com.tencent.mapsdk.internal.rf.1
            @Override // com.tencent.map.tools.Callback
            public final /* synthetic */ void callback(rc rcVar2) {
                rc rcVar3 = rcVar2;
                if (rcVar3 != null) {
                    rcVar3.a(2);
                    rcVar3.a();
                }
            }

            private static void a(rc rcVar2) {
                if (rcVar2 != null) {
                    rcVar2.a(2);
                    rcVar2.a();
                }
            }
        });
    }

    private boolean b(JSONObject jSONObject) {
        kj.b(ki.x, "#parseLayerInfoJson:".concat(String.valueOf(jSONObject)));
        ec ecVar = (ec) JsonUtils.parseToModel(jSONObject, ec.class, new Object[0]);
        if (ecVar != null) {
            this.e = ecVar.a();
            this.f.clear();
            List<eb> list = ecVar.a;
            if (list != null && !list.isEmpty()) {
                this.f.addAll(list);
            }
            kj.b(ki.x, "解析LayerInfo数据成功");
            this.g = ecVar;
            return true;
        }
        kj.d(ki.x, "解析LayerInfo数据失败");
        return false;
    }

    private void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        kc.b(this.c);
        kc.a(this.c, str.getBytes());
    }

    @Override // com.tencent.mapsdk.internal.dw
    public final boolean c(String str) {
        rc j;
        kj.b(ki.x, "#checkLayerStatusById[" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (this.e) {
            eb i = i(str);
            if (i != null && (j = j(str)) != null) {
                switch (dx.a(i.b)) {
                    case Gradient:
                        j.a = new re();
                        break;
                    case Aggregation:
                        j.a = new ra();
                        break;
                    case ArcLine:
                        j.a = new rb();
                        break;
                }
            }
            return i != null;
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.dw
    public final void d(String str) {
        kj.d(ki.x, "添加到等待队列[" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        this.j.add(str);
    }

    @Override // com.tencent.mapsdk.internal.dw
    public final void a(final String str, final Callback<byte[]> callback) {
        kj.b(ki.x, "#readLayerDataFromCache[" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        jy.b(new Runnable() { // from class: com.tencent.mapsdk.internal.rf.2
            @Override // java.lang.Runnable
            public final void run() {
                callback.callback(kc.c(rf.this.h(str)));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0070  */
    @Override // com.tencent.mapsdk.internal.dw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r6, com.tencent.map.tools.Callback<byte[]> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "TDL"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "#requestNew["
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mapsdk.internal.kj.b(r0, r1)
            com.tencent.mapsdk.internal.eb r0 = r5.i(r6)
            if (r0 == 0) goto L6d
            java.lang.String r0 = r0.a()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L6d
            r1 = 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "&key="
            r2.<init>(r3)
            java.lang.String r3 = r5.d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = r0.concat(r2)
            java.lang.String r2 = "TDL"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "请求数据的URL["
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = "]"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.mapsdk.internal.kj.b(r2, r3)
            com.tencent.mapsdk.internal.rf$a r2 = new com.tencent.mapsdk.internal.rf$a
            r2.<init>(r6, r0)
            com.tencent.mapsdk.internal.rf r6 = com.tencent.mapsdk.internal.rf.this
            com.tencent.mapsdk.internal.lg r6 = r6.i
            r6.a(r2)
            com.tencent.mapsdk.internal.rf r6 = com.tencent.mapsdk.internal.rf.this
            com.tencent.mapsdk.internal.lg r6 = r6.i
            java.lang.String r0 = r2.a
            r6.a(r0, r2)
            r2.b = r7
            goto L6e
        L6d:
            r1 = 0
        L6e:
            if (r1 != 0) goto L74
            r6 = 0
            r7.callback(r6)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.rf.b(java.lang.String, com.tencent.map.tools.Callback):void");
    }

    private void g(String str) {
        kj.b(ki.x, "#refreshLayerData[" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        rc rcVar = this.a.get(str);
        if (rcVar != null) {
            rcVar.b(this);
        }
    }

    @Override // com.tencent.mapsdk.internal.dw
    public final void a(String str, byte[] bArr) {
        kj.b(ki.x, "#saveLayerData[" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        File h = h(str);
        File e = kc.e(h);
        kc.a(e, bArr);
        kc.a(e, h);
    }

    @Override // com.tencent.mapsdk.internal.dw
    public final void a(String str, int i) {
        kj.b(ki.x, "#startTimeInterval[" + str + "], hash = " + str.hashCode() + " timeInterval = " + i);
        if (i <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        this.h.removeMessages(str.hashCode());
        Message.obtain(this.h, str.hashCode(), i * 1000, 0, str).sendToTarget();
    }

    @Override // com.tencent.mapsdk.internal.dw
    public final void e(String str) {
        kj.b(ki.x, "#stopTimeInterval[" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.h.removeMessages(str.hashCode());
    }

    @Override // com.tencent.mapsdk.internal.bm
    public final void b(bn bnVar) {
        JSONObject json;
        super.b(bnVar);
        if (this.a != null) {
            for (rc rcVar : this.a.values()) {
                if (!rcVar.isRemoved()) {
                    rcVar.remove();
                }
            }
            this.a.clear();
        }
        kj.b(ki.x, "#restoreLayerJsonToLocal");
        if (this.g != null && this.e && (json = this.g.toJson()) != null) {
            f(json.toString());
        }
        kj.b(ki.x, "退出数据图层成功");
    }

    private void d() {
        kj.b(ki.x, "#loadLayerJsonFromLocal");
        byte[] c = kc.c(this.c);
        if (c == null || c.length <= 0) {
            return;
        }
        try {
            b(new JSONObject(new String(c)));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void e() {
        JSONObject json;
        kj.b(ki.x, "#restoreLayerJsonToLocal");
        if (this.g == null || !this.e || (json = this.g.toJson()) == null) {
            return;
        }
        f(json.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File h(String str) {
        return new File(new File(this.b, Util.getMD5String(str)), "cache.dat");
    }

    private eb i(final String str) {
        return (eb) Util.singleWhere(new ArrayList(this.f), new Condition<eb>() { // from class: com.tencent.mapsdk.internal.rf.3
            @Override // com.tencent.map.tools.Condition
            public final /* synthetic */ boolean condition(eb ebVar) {
                eb ebVar2 = ebVar;
                return ebVar2 != null && ebVar2.a.equals(str);
            }

            private boolean a(eb ebVar) {
                return ebVar != null && ebVar.a.equals(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rc j(final String str) {
        return (rc) Util.singleWhere(this.a.values(), new Condition<rc>() { // from class: com.tencent.mapsdk.internal.rf.4
            @Override // com.tencent.map.tools.Condition
            public final /* synthetic */ boolean condition(rc rcVar) {
                rc rcVar2 = rcVar;
                return rcVar2 != null && rcVar2.getId().equals(str);
            }

            private boolean a(rc rcVar) {
                return rcVar != null && rcVar.getId().equals(str);
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    final class a extends lm implements lf {
        final String a;
        Callback<byte[]> b;
        private final String d;
        private ByteArrayOutputStream e;
        private String f;

        @Override // com.tencent.mapsdk.internal.lf
        public final void a(lh lhVar) {
        }

        public a(String str, String str2) {
            this.d = str;
            this.a = str2;
        }

        @Override // com.tencent.mapsdk.internal.lf
        public final void a(String str) {
            kj.b(ki.x, "#start download {" + this.d + "} [" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            this.e = new ByteArrayOutputStream();
        }

        @Override // com.tencent.mapsdk.internal.lf
        public final void a(String str, byte[] bArr) {
            if (bArr != null) {
                try {
                    this.e.write(bArr);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.tencent.mapsdk.internal.lf
        public final void b(String str) {
            kj.b(ki.x, "#cancel download {" + this.d + "} [" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            kd.a(this.e);
            rc j = rf.this.j(this.d);
            if (j != null) {
                j.a(1);
            }
        }

        @Override // com.tencent.mapsdk.internal.lm
        public final void a(NetRequest.NetRequestBuilder netRequestBuilder) {
            super.a(netRequestBuilder);
            netRequestBuilder.gzip();
        }

        @Override // com.tencent.mapsdk.internal.lm
        public final void a(NetResponse netResponse) {
            super.a(netResponse);
            this.f = netResponse.contentEncoding;
        }

        @Override // com.tencent.mapsdk.internal.lf
        public final void c(String str) {
            kj.b(ki.x, "#completed download {" + this.d + "} [" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            rf.this.i.b(this);
            if (this.b != null) {
                byte[] byteArray = this.e.toByteArray();
                byte[] a = "gzip".equals(this.f) ? kf.a(new ByteArrayInputStream(byteArray)) : byteArray;
                StringBuilder sb = new StringBuilder("数据量大小 {");
                sb.append(this.d);
                sb.append("} [");
                sb.append(byteArray != null ? byteArray.length : 0);
                sb.append(" : ");
                sb.append(a != null ? a.length : 0);
                sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                kj.b(ki.x, sb.toString());
                this.b.callback(a);
            }
            kd.a(this.e);
        }

        @Override // com.tencent.mapsdk.internal.lf
        public final void d(String str) {
            kj.b(ki.x, "#fail download {" + this.d + "} [" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            kd.a(this.e);
            rc j = rf.this.j(this.d);
            if (j != null) {
                j.a(1);
            }
        }

        private void a(Callback<byte[]> callback) {
            rf.this.i.a(this);
            rf.this.i.a(this.a, this);
            this.b = callback;
        }
    }

    static /* synthetic */ void a(rf rfVar, String str) {
        kj.b(ki.x, "#refreshLayerData[" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        rc rcVar = rfVar.a.get(str);
        if (rcVar != null) {
            rcVar.b(rfVar);
        }
    }
}
