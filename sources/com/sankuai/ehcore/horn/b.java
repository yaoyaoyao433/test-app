package com.sankuai.ehcore.horn;

import android.support.v4.util.ArraySet;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.tencent.connect.common.Constants;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect a;
    public static b b = new b();
    String c;
    String d;
    Map<String, JsonElement> e;
    Map<String, JsonElement> f;
    ConcurrentHashMap<String, JsonElement> g;
    ConcurrentHashMap<String, JsonElement> h;
    ConcurrentHashMap<String, String> i;

    public static /* synthetic */ void a(b bVar, String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "566d0e018f773061fb053a309cf4e576", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "566d0e018f773061fb053a309cf4e576");
            return;
        }
        com.sankuai.eh.component.service.utils.thread.b a2 = com.sankuai.eh.component.service.utils.thread.b.a();
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        a2.d(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1b309bd54a95711ad494c27a8b0adb58", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1b309bd54a95711ad494c27a8b0adb58") : new c(str, str2));
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4f0633a60c189f2deba66fed01db4d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4f0633a60c189f2deba66fed01db4d3");
            return;
        }
        this.h = new ConcurrentHashMap<>();
        this.g = new ConcurrentHashMap<>();
        this.i = new ConcurrentHashMap<>();
    }

    public final JsonElement a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "180a025a2d87b8e6c0ed67b8eacfcc4f", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "180a025a2d87b8e6c0ed67b8eacfcc4f") : a(str, this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JsonElement a(String str, Map<String, JsonElement> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9a56fb27a1160bdfd00479bb9a232df", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9a56fb27a1160bdfd00479bb9a232df");
        }
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.ehcore.horn.b$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 extends a {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ String b;

        public AnonymousClass2(String str) {
            this.b = str;
        }

        @Override // com.sankuai.ehcore.horn.b.a, com.sankuai.meituan.retrofit2.f
        public final void onResponse(Call<ap> call, Response<ap> response) {
            Object[] objArr = {call, response};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c496bb2a03c7fae7cf9dfeaaca3c1190", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c496bb2a03c7fae7cf9dfeaaca3c1190");
                return;
            }
            super.onResponse(call, response);
            if (this.e) {
                String string = response.e().string();
                b.this.h.put(this.b, com.sankuai.eh.component.service.utils.b.a(string));
                b.this.d = com.sankuai.eh.component.service.utils.d.b();
                b.this.c = b.this.d;
                b bVar = b.this;
                b.a(bVar, "eh/eh_config/" + this.b, string);
                com.sankuai.eh.component.service.utils.thread.b.a().d(d.b());
            }
        }

        public static /* synthetic */ void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef459c3567d3ee0a14e73560de6a0d36", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef459c3567d3ee0a14e73560de6a0d36");
            } else {
                com.sankuai.ehcore.horn.a.a().a("cacheWrite", com.sankuai.eh.component.service.utils.d.b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96a227d4c2e876cad592fe944a3c8eab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96a227d4c2e876cad592fe944a3c8eab");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            final String a2 = com.sankuai.eh.component.service.utils.c.a(str);
            if (!com.sankuai.ehcore.horn.a.a(a2, "eh/eh_js/")) {
                com.sankuai.eh.component.service.tools.d.a("CACHE_SERVICE", a2 + "已存在");
                return;
            }
            com.sankuai.eh.component.service.network.a.a(false).callEHFiles(str, com.sankuai.eh.component.service.network.a.b()).a(new a() { // from class: com.sankuai.ehcore.horn.b.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.ehcore.horn.b.a, com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<ap> call, Response<ap> response) {
                    Object[] objArr2 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0fbd3b740cfa118073e9287d410c3db", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0fbd3b740cfa118073e9287d410c3db");
                        return;
                    }
                    super.onResponse(call, response);
                    if (this.e) {
                        String string = response.e().string();
                        b.this.i.put(a2, string);
                        b bVar = b.this;
                        b.a(bVar, "eh/eh_js/" + a2, string);
                    }
                }
            });
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static /* synthetic */ void a(java.lang.String r22, java.lang.String r23) {
        /*
            r1 = r23
            r2 = 2
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r11 = 0
            r10[r11] = r22
            r12 = 1
            r10[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.sankuai.ehcore.horn.b.a
            java.lang.String r14 = "e1c1faad4e3ec17ebabd1032ce343e0a"
            r4 = 0
            r6 = 1
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = r10
            r5 = r13
            r7 = r14
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L20
            com.meituan.robust.PatchProxy.accessDispatch(r10, r4, r13, r12, r14)
            return
        L20:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r11] = r22
            r2[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r3 = com.sankuai.ehcore.horn.a.a
            java.lang.String r5 = "4b45cb74cace0f4745faac59e2c50e0c"
            r16 = 0
            r18 = 1
            r20 = 4611686018427387904(0x4000000000000000, double:2.0)
            r15 = r2
            r17 = r3
            r19 = r5
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20)
            if (r6 == 0) goto L3f
            com.meituan.robust.PatchProxy.accessDispatch(r2, r4, r3, r12, r5)
            return
        L3f:
            java.io.File r0 = com.sankuai.ehcore.horn.a.a(r22)
            java.io.File r2 = r0.getParentFile()
            r2.mkdirs()
            boolean r2 = r0.exists()
            if (r2 == 0) goto L53
            r0.delete()
        L53:
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L72
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L72
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L72
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L72
            r2.writeObject(r1)     // Catch: java.lang.Throwable -> L73
            r2.flush()     // Catch: java.lang.Throwable -> L73
            r2.close()     // Catch: java.lang.Exception -> L67
            return
        L67:
            return
        L68:
            r0 = move-exception
            r4 = r2
            goto L6c
        L6b:
            r0 = move-exception
        L6c:
            if (r4 == 0) goto L71
            r4.close()     // Catch: java.lang.Exception -> L71
        L71:
            throw r0
        L72:
            r2 = r4
        L73:
            if (r2 == 0) goto L7a
            r2.close()     // Catch: java.lang.Exception -> L79
            goto L7a
        L79:
            return
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.ehcore.horn.b.a(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String[] a(String str, JsonElement jsonElement) {
        Object[] objArr = {str, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9dc97dc47aa60c0ab7a003cab96bc08", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9dc97dc47aa60c0ab7a003cab96bc08");
        }
        String[] strArr = new String[3];
        Arrays.fill(strArr, "");
        if (TextUtils.isEmpty(str) || jsonElement == null) {
            return strArr;
        }
        strArr[0] = str;
        strArr[1] = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "tag"), "");
        strArr[2] = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "force"), "false");
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<String> a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "274ef93b9887f6f45955046d83a2928c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "274ef93b9887f6f45955046d83a2928c");
        }
        ArraySet arraySet = new ArraySet();
        arraySet.addAll(this.e.keySet());
        arraySet.remove("children");
        if (z) {
            JsonArray b2 = com.sankuai.eh.component.service.utils.b.b(this.e.get("children"));
            for (int i = 0; i < b2.size(); i++) {
                arraySet.add(com.sankuai.eh.component.service.utils.c.a(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(b2.get(i), Constants.PARAM_SCOPE), "")));
            }
        }
        return arraySet;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a implements com.sankuai.meituan.retrofit2.f<ap> {
        public static ChangeQuickRedirect d;
        protected boolean e;

        @Override // com.sankuai.meituan.retrofit2.f
        public void onResponse(Call<ap> call, Response<ap> response) {
            Object[] objArr = {call, response};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "334218858fa23ade5641cea58b25b728", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "334218858fa23ade5641cea58b25b728");
            } else if (response != null && response.b() == 200 && response.e() != null) {
                this.e = true;
                com.sankuai.eh.component.service.tools.d.a("CACHE_SERVICE", call.e().b() + "下载完成");
            } else {
                this.e = false;
                com.sankuai.eh.component.service.tools.d.a("CACHE_SERVICE", call.e().b() + "下载失败！！！");
            }
        }

        @Override // com.sankuai.meituan.retrofit2.f
        public void onFailure(Call<ap> call, Throwable th) {
            Object[] objArr = {call, th};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b1d2798de2dc2253ccf15a8b8856cee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b1d2798de2dc2253ccf15a8b8856cee");
                return;
            }
            this.e = false;
            com.sankuai.eh.component.service.tools.d.a("CACHE_SERVICE", call.e().b() + "下载失败！！！");
            com.dianping.codelog.b.b(a.class, "android request fail", call.e().b());
        }
    }
}
