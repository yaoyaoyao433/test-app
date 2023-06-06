package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.AsyncTask;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.tools.json.JsonUtils;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.internal.rl;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource;
import java.io.File;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pg extends AsyncTask<Object, Void, Boolean> {
    private WeakReference<Context> a;
    private WeakReference<a> b;
    private rl c;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(boolean z, rl rlVar);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Boolean doInBackground(Object[] objArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Boolean bool) {
        Boolean bool2 = bool;
        super.onPostExecute(bool2);
        if (this.b == null || this.b.get() == null) {
            return;
        }
        this.b.get().a(bool2.booleanValue(), this.c);
    }

    public pg(bh bhVar, a aVar) {
        this.a = new WeakReference<>(bhVar.c);
        this.c = bhVar.b.k.b;
        this.b = new WeakReference<>(aVar);
    }

    private Boolean a() {
        int i;
        rs rsVar;
        boolean z;
        if (this.a.get() == null) {
            return Boolean.FALSE;
        }
        Context context = this.a.get();
        try {
            cx cxVar = (cx) ((dl) ck.a(dl.class)).h();
            String a2 = gy.a();
            String i2 = gy.i();
            int i3 = this.c.d;
            String d = gy.d();
            int i4 = this.c.f;
            boolean z2 = false;
            switch (rl.AnonymousClass3.a[this.c.i.ordinal()]) {
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 1;
                    break;
                default:
                    i = 0;
                    break;
            }
            NetResponse checkAuth = cxVar.checkAuth(a2, i2, i3, d, i4, 3, i);
            if (checkAuth != null && checkAuth.available()) {
                String netResponse = checkAuth.toString();
                if (netResponse != null && netResponse.length() != 0) {
                    rl rlVar = this.c;
                    kj.c(ki.h, "开始更新配置：".concat(String.valueOf(netResponse)));
                    rt rtVar = (rt) JsonUtils.parseToModel(netResponse, rt.class, new Object[0]);
                    if (rtVar != null && (rsVar = rtVar.b) != null) {
                        if (rtVar.a != 0) {
                            z = rlVar.e;
                            rlVar.e = false;
                        } else {
                            z = !rlVar.e;
                            rlVar.e = true;
                        }
                        kj.c(ki.h, "权限是否更新：".concat(String.valueOf(z)));
                        boolean z3 = rsVar.g != rlVar.d;
                        kj.c(ki.h, "协议版本是否更新：".concat(String.valueOf(z3)));
                        if (z | z3) {
                            ro a3 = rlVar.a(rsVar);
                            if (a3 != null) {
                                int i5 = a3.d;
                                ru ruVar = a3.e;
                                if (ruVar != null) {
                                    int i6 = ruVar.d;
                                    int i7 = ruVar.b;
                                    kj.c(ki.h, "版本对比: old[" + rlVar.c + "]-new[" + i6 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                                    kj.c(ki.h, "样式对比: old[" + rlVar.b + "]-new[" + i7 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                                    if (i6 != rlVar.c || i7 != rlVar.b || i5 != rlVar.a) {
                                        File file = new File(mi.a(context, (TencentMapOptions) null).b(), rlVar.a());
                                        if (file.exists()) {
                                            kc.b(file);
                                            kj.c(ki.h, "删除海外图缓存目录: ".concat(String.valueOf(file)));
                                        }
                                    }
                                }
                            }
                            rr rrVar = rsVar.h;
                            if (rrVar != null) {
                                String str = rrVar.b;
                                kj.c(ki.h, "配置边界线: ".concat(String.valueOf(str)));
                                rlVar.a(str);
                                rrVar.a = rlVar.f;
                            }
                            rlVar.g = rtVar;
                            OverSeaSource overSeaSource = rlVar.i;
                            mh a4 = mh.a(context);
                            switch (rl.AnonymousClass3.a[overSeaSource.ordinal()]) {
                                case 1:
                                    a4.a(ej.g, netResponse);
                                    break;
                                case 2:
                                    a4.a("worldMapConfig_BING", netResponse);
                                    break;
                            }
                            rlVar.a(rlVar.g);
                            kj.c(ki.h, "配置更新完成");
                            z2 = true;
                        }
                    }
                    kj.c(ki.h, "配置更新数据解析失败，使用上次的配置");
                }
                return Boolean.valueOf(z2);
            }
            return Boolean.FALSE;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (kj.a != null) {
                kj.a.b(message, th);
            } else {
                kj.c(message, th);
            }
            return Boolean.FALSE;
        }
    }

    private void a(Boolean bool) {
        super.onPostExecute(bool);
        if (this.b == null || this.b.get() == null) {
            return;
        }
        this.b.get().a(bool.booleanValue(), this.c);
    }

    private boolean a(Context context, String str) {
        rs rsVar;
        boolean z;
        if (str == null || str.length() == 0) {
            return false;
        }
        rl rlVar = this.c;
        kj.c(ki.h, "开始更新配置：".concat(String.valueOf(str)));
        rt rtVar = (rt) JsonUtils.parseToModel(str, rt.class, new Object[0]);
        if (rtVar == null || (rsVar = rtVar.b) == null) {
            kj.c(ki.h, "配置更新数据解析失败，使用上次的配置");
            return false;
        }
        if (rtVar.a != 0) {
            z = rlVar.e;
            rlVar.e = false;
        } else {
            z = !rlVar.e;
            rlVar.e = true;
        }
        kj.c(ki.h, "权限是否更新：".concat(String.valueOf(z)));
        boolean z2 = rsVar.g != rlVar.d;
        kj.c(ki.h, "协议版本是否更新：".concat(String.valueOf(z2)));
        if (!z && !z2) {
            return false;
        }
        ro a2 = rlVar.a(rsVar);
        if (a2 != null) {
            int i = a2.d;
            ru ruVar = a2.e;
            if (ruVar != null) {
                int i2 = ruVar.d;
                int i3 = ruVar.b;
                kj.c(ki.h, "版本对比: old[" + rlVar.c + "]-new[" + i2 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                kj.c(ki.h, "样式对比: old[" + rlVar.b + "]-new[" + i3 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                if (i2 != rlVar.c || i3 != rlVar.b || i != rlVar.a) {
                    File file = new File(mi.a(context, (TencentMapOptions) null).b(), rlVar.a());
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
            rlVar.a(str2);
            rrVar.a = rlVar.f;
        }
        rlVar.g = rtVar;
        OverSeaSource overSeaSource = rlVar.i;
        mh a3 = mh.a(context);
        switch (rl.AnonymousClass3.a[overSeaSource.ordinal()]) {
            case 1:
                a3.a(ej.g, str);
                break;
            case 2:
                a3.a("worldMapConfig_BING", str);
                break;
        }
        rlVar.a(rlVar.g);
        kj.c(ki.h, "配置更新完成");
        return true;
    }
}
