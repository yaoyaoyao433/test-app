package com.tencent.mapsdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.tools.Callback;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.internal.jy;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class rl {
    public rt g;
    boolean h;
    public OverSeaTileProvider k;
    public int a = rs.a;
    public int b = 1000;
    public int c = rs.c;
    public int d = 0;
    public volatile boolean e = false;
    public int f = 0;
    private String l = null;
    public OverSeaSource i = OverSeaSource.DEFAULT;
    public Language j = Language.zh;

    private boolean a(Context context, String str) {
        rs rsVar;
        boolean z;
        kj.c(ki.h, "开始更新配置：".concat(String.valueOf(str)));
        rt rtVar = (rt) JsonUtils.parseToModel(str, rt.class, new Object[0]);
        if (rtVar == null || (rsVar = rtVar.b) == null) {
            kj.c(ki.h, "配置更新数据解析失败，使用上次的配置");
            return false;
        }
        if (rtVar.a != 0) {
            z = this.e;
            this.e = false;
        } else {
            z = !this.e;
            this.e = true;
        }
        kj.c(ki.h, "权限是否更新：".concat(String.valueOf(z)));
        boolean z2 = rsVar.g != this.d;
        kj.c(ki.h, "协议版本是否更新：".concat(String.valueOf(z2)));
        if (!z && !z2) {
            return false;
        }
        ro a = a(rsVar);
        if (a != null) {
            int i = a.d;
            ru ruVar = a.e;
            if (ruVar != null) {
                int i2 = ruVar.d;
                int i3 = ruVar.b;
                kj.c(ki.h, "版本对比: old[" + this.c + "]-new[" + i2 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                kj.c(ki.h, "样式对比: old[" + this.b + "]-new[" + i3 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                if (i2 != this.c || i3 != this.b || i != this.a) {
                    File file = new File(mi.a(context, (TencentMapOptions) null).b(), a());
                    if (file.exists()) {
                        kc.b(file);
                        kj.c(ki.h, "删除海外图缓存目录: ".concat(String.valueOf(file)));
                    }
                }
            }
        }
        rr rrVar = rsVar.h;
        if (rrVar != null) {
            String str2 = rrVar.b;
            kj.c(ki.h, "配置边界线: ".concat(String.valueOf(str2)));
            a(str2);
            rrVar.a = this.f;
        }
        this.g = rtVar;
        OverSeaSource overSeaSource = this.i;
        mh a2 = mh.a(context);
        switch (overSeaSource) {
            case DEFAULT:
                a2.a(ej.g, str);
                break;
            case SPARE:
                a2.a("worldMapConfig_BING", str);
                break;
        }
        a(this.g);
        kj.c(ki.h, "配置更新完成");
        return true;
    }

    public final void a(String str) {
        byte[] b;
        if (str == null || str.length() == 0) {
            return;
        }
        kj.c(ki.h, "下载新边界数据：".concat(String.valueOf(str)));
        try {
            NetResponse doStream = NetManager.getInstance().builder().gzip().url(str).doStream();
            InputStream inputStream = doStream.getInputStream();
            if (doStream.statusCode == 200) {
                String str2 = TextUtils.isEmpty(doStream.contentEncoding) ? "gzip" : doStream.contentEncoding;
                if (str2 != null && str2.length() > 0 && str2.toLowerCase().contains("gzip")) {
                    b = kf.a(inputStream);
                } else {
                    b = kd.b(inputStream);
                }
                if (b == null || b.length <= 0) {
                    return;
                }
                String str3 = new String(b);
                rj.a();
                this.f = rj.b(str3);
                kj.c(ki.h, "新边界数据版本号：" + this.f);
                rj.a().a(str3);
            }
        } catch (Throwable th) {
            kj.b(ki.h, th);
        }
    }

    public final String a() {
        String str;
        boolean z;
        if (this.k != null) {
            z = this.k.onDayNightChange(this.h);
            str = "rastermap/customoversea/" + this.k.getProviderName();
        } else if (AnonymousClass3.a[this.i.ordinal()] != 2) {
            z = true;
            str = "rastermap/world";
        } else {
            str = "rastermap/bingworld";
            z = false;
        }
        return str + ((this.h && z) ? "/dark" : "");
    }

    private File b(Context context) {
        return new File(mi.a(context, (TencentMapOptions) null).b(), a());
    }

    private int e() {
        return this.d;
    }

    private boolean f() {
        return this.e;
    }

    private int g() {
        return this.f;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.rl$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass2 extends jy.g<Boolean> {
        final /* synthetic */ Context a;
        final /* synthetic */ OverSeaSource b;

        public AnonymousClass2(Context context, OverSeaSource overSeaSource) {
            this.a = context;
            this.b = overSeaSource;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() throws Exception {
            String a;
            kj.c(ki.h, "开始初始化配置");
            Context context = this.a;
            OverSeaSource overSeaSource = this.b;
            mh a2 = mh.a(context);
            switch (AnonymousClass3.a[overSeaSource.ordinal()]) {
                case 1:
                    a = a2.a(ej.g);
                    break;
                case 2:
                    a = a2.a("worldMapConfig_BING");
                    break;
                default:
                    a = null;
                    break;
            }
            kj.c(ki.h, "本地配置数据：".concat(String.valueOf(a)));
            if (!hb.a(a)) {
                try {
                    rl.this.g = (rt) JsonUtils.parseToModel(new JSONObject(a), rt.class, new Object[0]);
                } catch (JSONException e) {
                    kj.b(ki.h, e);
                }
                rl.this.a(rl.this.g);
            } else if (ju.a("4.5.5.2", "4.3.1")) {
                rl.this.a(this.a);
            }
            kj.c(ki.h, "完成初始化配置");
            return null;
        }
    }

    private void a(Context context, OverSeaSource overSeaSource, final Callback<Boolean> callback) {
        if (context == null) {
            return;
        }
        this.i = overSeaSource;
        jy.a((jy.g) new AnonymousClass2(context, overSeaSource)).a((jy.b.a) Boolean.FALSE, (jy.a<jy.b.a>) (callback != null ? new jy.a<Boolean>() { // from class: com.tencent.mapsdk.internal.rl.1
            @Override // com.tencent.mapsdk.internal.jy.a, com.tencent.map.tools.Callback
            public final /* bridge */ /* synthetic */ void callback(Object obj) {
                callback.callback((Boolean) obj);
            }

            private void a(Boolean bool) {
                callback.callback(bool);
            }
        } : null));
    }

    private static String a(Context context, OverSeaSource overSeaSource) {
        mh a = mh.a(context);
        switch (overSeaSource) {
            case DEFAULT:
                return a.a(ej.g);
            case SPARE:
                return a.a("worldMapConfig_BING");
            default:
                return null;
        }
    }

    private static void a(Context context, OverSeaSource overSeaSource, String str) {
        mh a = mh.a(context);
        switch (overSeaSource) {
            case DEFAULT:
                a.a(ej.g, str);
                return;
            case SPARE:
                a.a("worldMapConfig_BING", str);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c A[Catch: JSONException -> 0x00ab, TRY_LEAVE, TryCatch #1 {JSONException -> 0x00ab, blocks: (B:17:0x0096, B:19:0x009c), top: B:31:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.rl.a(android.content.Context):void");
    }

    public final void a(boolean z) {
        kj.c(ki.h, "使用海外暗色模式？".concat(String.valueOf(z)));
        this.h = z;
    }

    public final ru b() {
        if (this.g == null) {
            return null;
        }
        return b(this.g.b);
    }

    public final List<rp> c() {
        if (this.g == null) {
            return null;
        }
        if (this.k != null) {
            ArrayList arrayList = new ArrayList(c(this.g.b));
            rp rpVar = new rp();
            rpVar.a = new int[]{0, 18};
            ArrayList arrayList2 = new ArrayList();
            rq rqVar = new rq();
            rqVar.b = rj.f;
            rqVar.h = true;
            rqVar.a = 1;
            rqVar.c = this.k.getProviderName();
            rqVar.f = this.k.getLogo(true);
            rqVar.g = this.k.getLogo(false);
            arrayList2.add(rqVar);
            rpVar.b = arrayList2;
            arrayList.add(0, rpVar);
            return arrayList;
        }
        return c(this.g.b);
    }

    private rr h() {
        rs rsVar;
        if (this.g == null || (rsVar = this.g.b) == null) {
            return null;
        }
        return rsVar.h;
    }

    private ru b(rs rsVar) {
        ro a;
        if (rsVar == null || (a = a(rsVar)) == null) {
            return null;
        }
        return a.e;
    }

    private boolean i() {
        return this.h;
    }

    private OverSeaSource j() {
        return this.i;
    }

    private int k() {
        switch (this.i) {
            case DEFAULT:
                return 2;
            case SPARE:
                return 1;
            default:
                return 0;
        }
    }

    private void a(OverSeaTileProvider overSeaTileProvider) {
        this.k = overSeaTileProvider;
    }

    private void a(Language language) {
        this.j = language;
    }

    private Language l() {
        return this.j;
    }

    public final String d() {
        if (this.k != null) {
            return this.k.getProviderVersion() + File.separator + this.j.name();
        }
        ru b = b();
        if (b != null) {
            return b.c + File.separator + b.b + File.separator + b.d + File.separator + this.j.name();
        }
        return "";
    }

    private OverSeaTileProvider m() {
        return this.k;
    }

    public final void a(rt rtVar) {
        if (rtVar == null) {
            return;
        }
        rs rsVar = rtVar.b;
        if (rsVar != null) {
            this.d = rsVar.g;
            kj.c(ki.h, "更新版本：" + this.d);
            rr rrVar = rsVar.h;
            if (rrVar != null) {
                this.f = rrVar.a;
                kj.c(ki.h, "更新边界版本：" + this.c);
            }
        }
        ru b = b(rsVar);
        if (b != null) {
            this.b = b.b;
            this.a = b.c;
            this.c = b.d;
            this.l = b.e;
            kj.c(ki.h, "更新图源版本：" + this.c);
        }
        this.e = rtVar.a == 0;
    }

    public final ro a(rs rsVar) {
        List<ro> list;
        if (rsVar == null || (list = rsVar.i) == null) {
            return null;
        }
        for (ro roVar : list) {
            if (roVar.d == 2 && this.h) {
                return roVar;
            }
            if (roVar.d == 1 && !this.h) {
                return roVar;
            }
        }
        return null;
    }

    private static List<rp> c(rs rsVar) {
        if (rsVar != null) {
            return rsVar.j;
        }
        return null;
    }

    private static /* synthetic */ String b(Context context, OverSeaSource overSeaSource) {
        mh a = mh.a(context);
        switch (overSeaSource) {
            case DEFAULT:
                return a.a(ej.g);
            case SPARE:
                return a.a("worldMapConfig_BING");
            default:
                return null;
        }
    }
}
