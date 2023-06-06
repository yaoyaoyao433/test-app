package com.sankuai.waimai.alita.core.utils;

import android.support.annotation.NonNull;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.config.AlitaBizConfigUtil;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final Executor b = new a();
    private static final String[] c = {"Alita"};

    public static /* synthetic */ Map b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2dc34b14950c90d162d4eba2b1bf46a2", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2dc34b14950c90d162d4eba2b1bf46a2") : new HashMap();
    }

    public static void a(@NonNull final b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "252887fa9ec30efabbce9488fbd01bc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "252887fa9ec30efabbce9488fbd01bc8");
        } else if (c()) {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.alita.core.utils.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9512531fa7999e9b8696a44c828f5b39", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9512531fa7999e9b8696a44c828f5b39");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(ShowLogJsHandler.PARAM_NAME_MODULE, b.this.c);
                        jSONObject.put("level", b.this.e.toString());
                        jSONObject.put("biz", b.this.b);
                        jSONObject.put("type", b.this.d);
                        jSONObject.put("details", b.this.a());
                        com.dianping.networklog.c.a(jSONObject.toString(), 3, d.c);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public static void b(@NonNull final b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74cf1ab66ba08677f7aaf7742dce4818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74cf1ab66ba08677f7aaf7742dce4818");
        } else if (c()) {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.waimai.alita.core.utils.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3856f28216c45cea2e699337d7f0712a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3856f28216c45cea2e699337d7f0712a");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(ShowLogJsHandler.PARAM_NAME_MODULE, b.this.c);
                        jSONObject.put("level", b.this.e.toString());
                        jSONObject.put("biz", b.this.b);
                        jSONObject.put("type", b.this.d);
                        jSONObject.put("details", b.this.a());
                        com.dianping.networklog.c.a(jSONObject.toString(), 3, d.c);
                    } catch (Exception unused) {
                    }
                    String str = b.this.b;
                    String str2 = b.this.c;
                    String str3 = b.this.d;
                    String str4 = b.this.b;
                    b bVar2 = b.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    Sniffer.smell(str, str2, str3, str4, PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "f47332b6958ec8b40f892a34529ab1cb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "f47332b6958ec8b40f892a34529ab1cb") : bVar2.a().toString(), 1L, d.b());
                }
            });
        }
    }

    private static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9988c4615998ee12d709041cde32e70", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9988c4615998ee12d709041cde32e70")).booleanValue() : AlitaBizConfigUtil.a(5);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Executor {
        public static ChangeQuickRedirect a;
        private final ArrayDeque<Runnable> b;
        private Runnable c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0db3b963c464c3d7ff3a654ea2d84397", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0db3b963c464c3d7ff3a654ea2d84397");
            } else {
                this.b = new ArrayDeque<>();
            }
        }

        @Override // java.util.concurrent.Executor
        public final synchronized void execute(@NonNull final Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea47cf97aa30ead9189b6e9bbc0a7474", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea47cf97aa30ead9189b6e9bbc0a7474");
            } else if (runnable == null) {
            } else {
                this.b.offer(new Runnable() { // from class: com.sankuai.waimai.alita.core.utils.d.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c53fd85c57c3a5089c24aef4967ec68", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c53fd85c57c3a5089c24aef4967ec68");
                            return;
                        }
                        try {
                            runnable.run();
                        } finally {
                            a.this.a();
                        }
                    }

                    public final String toString() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6629e307a87ed3c4a69376a9f88a43d4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6629e307a87ed3c4a69376a9f88a43d4") : runnable.toString();
                    }
                });
                if (this.c == null) {
                    a();
                }
            }
        }

        public final synchronized void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26571e61fe3c64fee8b644b02fa92070", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26571e61fe3c64fee8b644b02fa92070");
                return;
            }
            Runnable poll = this.b.poll();
            this.c = poll;
            if (poll != null) {
                com.sankuai.android.jarvis.c.a().execute(this.c);
            }
        }
    }
}
