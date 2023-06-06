package com.meituan.android.edfu.mbar.camera;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.nvnetwork.g;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.edfu.cvlog.monitor.b;
import com.meituan.android.edfu.cvlog.netservice.ScanService;
import com.meituan.android.edfu.cvlog.netservice.bean.ConfigResult;
import com.meituan.android.edfu.cvlog.netservice.bean.ImageResult;
import com.meituan.android.edfu.cvlog.netservice.bean.ImageSaveRequest;
import com.meituan.android.edfu.cvlog.netservice.e;
import com.meituan.android.edfu.mbar.camera.decode.b;
import com.meituan.android.edfu.mbar.util.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.android.jarvis.c;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.ar;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    private static final String b = "a";
    private Context c;
    private b d;

    public a(Context context, com.meituan.android.edfu.mbar.camera.decode.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e40f8fa657689d590b91dd24183c91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e40f8fa657689d590b91dd24183c91");
            return;
        }
        this.c = context;
        final m a2 = m.a();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = m.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "33c120ff13f2a52f8f50026eba8d8079", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "33c120ff13f2a52f8f50026eba8d8079");
        } else {
            a2.j = context;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = m.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "9a906e9e2f5b6fa08f1aebaa4a2c03d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "9a906e9e2f5b6fa08f1aebaa4a2c03d6");
            } else {
                Horn.register("mbar_upload_image", new HornCallback() { // from class: com.meituan.android.edfu.mbar.util.m.9
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.common.horn.HornCallback
                    public final void onChanged(boolean z, String str) {
                        Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1b72e0a59a85d6c46a888e57c5b85679", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1b72e0a59a85d6c46a888e57c5b85679");
                            return;
                        }
                        try {
                            if (TextUtils.isEmpty(str)) {
                                return;
                            }
                            JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
                            if (asJsonObject != null && asJsonObject.has("mbar_android_upload")) {
                                m.k = asJsonObject.get("mbar_android_upload").getAsBoolean();
                            }
                            if (asJsonObject == null || !asJsonObject.has("mbar_android_upload_failed")) {
                                return;
                            }
                            m.l = asJsonObject.get("mbar_android_upload_failed").getAsBoolean();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
            if (g.u() && g.a() > 0) {
                a2.h = g.a();
            }
            a2.n = true;
            a2.b = 0L;
            a2.c = 0L;
            a2.d = 0L;
            a2.e = 0L;
            a2.f = 0L;
            a2.g = 0L;
        }
        int a3 = (!g.u() || g.a() <= 0) ? 0 : g.a();
        final com.meituan.android.edfu.cvlog.monitor.a a4 = com.meituan.android.edfu.cvlog.monitor.a.a(context);
        b.a aVar2 = new b.a();
        StringBuilder sb = new StringBuilder();
        sb.append(a3);
        aVar2.d = sb.toString();
        aVar2.e = "mbar";
        aVar2.c = false;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b.a.a;
        com.meituan.android.edfu.cvlog.monitor.b bVar = PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "2d48c52ce9f7dfda48ee35b9c4b1953f", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.edfu.cvlog.monitor.b) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "2d48c52ce9f7dfda48ee35b9c4b1953f") : new com.meituan.android.edfu.cvlog.monitor.b(aVar2);
        Object[] objArr5 = {bVar};
        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.edfu.cvlog.monitor.a.a;
        if (PatchProxy.isSupport(objArr5, a4, changeQuickRedirect5, false, "873954f60b22c0cfb56ea6fa3c4cb5f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, a4, changeQuickRedirect5, false, "873954f60b22c0cfb56ea6fa3c4cb5f2");
        } else if (bVar != null) {
            e.a aVar3 = new e.a();
            aVar3.b = "https://ar.meituan.com";
            aVar3.c = "http://ar.vision.test.sankuai.com";
            aVar3.d = bVar.b;
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = e.a.a;
            a4.k = PatchProxy.isSupport(objArr6, aVar3, changeQuickRedirect6, false, "69063f2919296335cbb63240a6d5bfe0", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr6, aVar3, changeQuickRedirect6, false, "69063f2919296335cbb63240a6d5bfe0") : new e(aVar3);
            e eVar = a4.k;
            Context context2 = a4.p;
            Object[] objArr7 = {context2};
            ChangeQuickRedirect changeQuickRedirect7 = e.a;
            if (PatchProxy.isSupport(objArr7, eVar, changeQuickRedirect7, false, "8d653dd835431123f1e626d1fb525f01", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, eVar, changeQuickRedirect7, false, "8d653dd835431123f1e626d1fb525f01");
            } else {
                eVar.b = context2;
                eVar.e = eVar.h ? eVar.g : eVar.f;
                eVar.c = new ar.a().a(eVar.e).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a(com.meituan.android.edfu.cvlog.netservice.b.a(context2)).a(new com.meituan.android.edfu.cvlog.netservice.a()).a(f.a()).a();
                eVar.d = (ScanService) eVar.c.a(ScanService.class);
            }
            a4.n = bVar.c;
            a4.o = bVar.d;
            e eVar2 = a4.k;
            String str = a4.n;
            String str2 = a4.o;
            Object[] objArr8 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect8 = e.a;
            a4.l = (PatchProxy.isSupport(objArr8, eVar2, changeQuickRedirect8, false, "2a9a1155823b5df9f0ea49af7d5db9ee", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr8, eVar2, changeQuickRedirect8, false, "2a9a1155823b5df9f0ea49af7d5db9ee") : eVar2.d.getConfig(str, str2).b(rx.schedulers.a.d()).a(rx.schedulers.a.d())).a(new rx.e<ConfigResult>() { // from class: com.meituan.android.edfu.cvlog.monitor.a.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onCompleted() {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(ConfigResult configResult) {
                    ConfigResult configResult2 = configResult;
                    Object[] objArr9 = {configResult2};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "d0f30ce71a1f86c8d5733ca26bb3222a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "d0f30ce71a1f86c8d5733ca26bb3222a");
                        return;
                    }
                    String unused = a4.q;
                    if (configResult2 == null || configResult2.getResult() == null) {
                        return;
                    }
                    a4.c = configResult2.getResult();
                    a.b(a4, a4.c);
                    a4.d = true;
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr9 = {th};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "6d7111206978339c886a4288eba4381b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "6d7111206978339c886a4288eba4381b");
                        return;
                    }
                    String unused = a4.q;
                    a4.d = false;
                }
            });
        }
        m.a(context);
        this.d = com.meituan.android.edfu.mbar.camera.decode.impl.b.a(context, aVar);
    }

    public final void a(@NonNull byte[] bArr, int i, int i2, boolean z, Rect rect, com.meituan.android.edfu.edfucamera.argorithm.e eVar, boolean z2) {
        boolean z3;
        final com.meituan.android.edfu.edfucamera.argorithm.e a2;
        Object[] objArr = {bArr, Integer.valueOf(i), Integer.valueOf(i2), (byte) 0, null, eVar, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cf3552ee11d3c00f0eaca697c1bc876", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cf3552ee11d3c00f0eaca697c1bc876");
            return;
        }
        this.d.a(bArr, i, i2, false, null, eVar);
        if (m.k && z2) {
            final com.meituan.android.edfu.cvlog.monitor.a a3 = com.meituan.android.edfu.cvlog.monitor.a.a(this.c);
            Object[] objArr2 = {eVar, null};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.edfu.cvlog.monitor.a.a;
            if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "9f46488a84992758829a402015b15062", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "9f46488a84992758829a402015b15062");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.edfu.cvlog.monitor.a.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "41c4290d9ca20dee31efcbc0f4cd429c", RobustBitConfig.DEFAULT_VALUE)) {
                z3 = ((Boolean) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "41c4290d9ca20dee31efcbc0f4cd429c")).booleanValue();
            } else if (a3.d && a3.b && System.currentTimeMillis() - a3.h >= a3.e && a3.j < a3.g && (a3.i == 0 || System.currentTimeMillis() - a3.i >= a3.f)) {
                a3.i = System.currentTimeMillis();
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 || (a2 = a3.a(eVar.f, eVar.b, eVar.c, eVar.d, eVar.i, eVar.e, eVar.j)) == null) {
                return;
            }
            a2.k = false;
            a3.j++;
            com.sankuai.waimai.launcher.util.aop.b.a(c.a(), new Runnable() { // from class: com.meituan.android.edfu.cvlog.monitor.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e67448ba5019e632fbaac0b6e34ff227", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e67448ba5019e632fbaac0b6e34ff227");
                        return;
                    }
                    String unused = a3.q;
                    long currentTimeMillis = System.currentTimeMillis();
                    byte[] a4 = a3.a(a2.f, 17, a2.b, a2.c);
                    if (a4 == null) {
                        return;
                    }
                    String unused2 = a3.q;
                    new StringBuilder(" image convert time is: ").append(System.currentTimeMillis() - currentTimeMillis);
                    ImageSaveRequest imageSaveRequest = new ImageSaveRequest();
                    imageSaveRequest.setProject_id(a3.n);
                    imageSaveRequest.setGroup_id(a3.o);
                    imageSaveRequest.setMeta(r3);
                    imageSaveRequest.setSession_id(a3.m);
                    try {
                        imageSaveRequest.setContent(Base64.encodeToString(a4, 2));
                        a3.k.a(imageSaveRequest).a(new rx.e<ImageResult>() { // from class: com.meituan.android.edfu.cvlog.monitor.a.2.1
                            public static ChangeQuickRedirect a;

                            @Override // rx.e
                            public final void onCompleted() {
                            }

                            @Override // rx.e
                            public final void onError(Throwable th) {
                            }

                            {
                                AnonymousClass2.this = this;
                            }

                            @Override // rx.e
                            public final /* synthetic */ void onNext(ImageResult imageResult) {
                                ImageResult imageResult2 = imageResult;
                                Object[] objArr5 = {imageResult2};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6fae7f988f8ba64640aed270037f37b0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6fae7f988f8ba64640aed270037f37b0");
                                    return;
                                }
                                String unused3 = a3.q;
                                new StringBuilder(" GET RESULT").append(imageResult2.getMessage());
                            }
                        });
                        a2.k = true;
                    } catch (OutOfMemoryError unused3) {
                    }
                }
            });
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e00e54004ca49eb36c3861651b26a12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e00e54004ca49eb36c3861651b26a12");
            return;
        }
        this.d.b();
        com.meituan.android.edfu.cvlog.monitor.a a2 = com.meituan.android.edfu.cvlog.monitor.a.a(this.c);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.edfu.cvlog.monitor.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "badb08d92cef28cc69cefa0ef4f95238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "badb08d92cef28cc69cefa0ef4f95238");
            return;
        }
        a2.h = System.currentTimeMillis();
        a2.m = String.format("%s_%s", GetUUID.getInstance().getUUID(a2.p), Long.valueOf(a2.h));
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32faaa55885239e9bb3c48c018f40082", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32faaa55885239e9bb3c48c018f40082");
            return;
        }
        this.d.c();
        com.meituan.android.edfu.cvlog.monitor.a a2 = com.meituan.android.edfu.cvlog.monitor.a.a(this.c);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.edfu.cvlog.monitor.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "fef4059fbff19545df7763f347301974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "fef4059fbff19545df7763f347301974");
            return;
        }
        if (a2.l != null && !a2.l.isUnsubscribed()) {
            a2.l.unsubscribe();
        }
        a2.j = 0;
        a2.c = null;
        a2.d = false;
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8104a9b183d59eb4c56cc9e9b516b536", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8104a9b183d59eb4c56cc9e9b516b536")).booleanValue() : this.d.a();
    }
}
