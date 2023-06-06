package com.sankuai.waimai.store.mrn.preload;

import com.facebook.react.bridge.ReactApplicationContext;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.mrn.preload.c;
import com.sankuai.waimai.store.util.al;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends b {
    public static ChangeQuickRedirect a;
    protected g b;
    private ReactApplicationContext e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "608412f2aa1369d646436217cf20b523", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "608412f2aa1369d646436217cf20b523");
            return;
        }
        this.e = new ReactApplicationContext(com.sankuai.shangou.stone.util.e.a());
        this.b = new g(this.e);
    }

    @Override // com.sankuai.waimai.store.mrn.preload.j
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3dc5a3874577a30ffdb18f34ccbfe7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3dc5a3874577a30ffdb18f34ccbfe7d");
        } else if (this.c == null) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            final c cVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f89258ee8898a3c469c9ceae55245803", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f89258ee8898a3c469c9ceae55245803") : c.a.a;
            final Runnable runnable = new Runnable() { // from class: com.sankuai.waimai.store.mrn.preload.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    JSONObject jSONObject;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "33565aa3ccad3ac1fc05019d7285e07d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "33565aa3ccad3ac1fc05019d7285e07d");
                        return;
                    }
                    com.meituan.android.mrn.engine.e b = a.this.b();
                    if (b == null) {
                        return;
                    }
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = p.a;
                    final p a2 = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "d33894acc8f7b391a87c77369612014f", RobustBitConfig.DEFAULT_VALUE) ? (p) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "d33894acc8f7b391a87c77369612014f") : p.a(null);
                    JSONObject a3 = a.this.a(b);
                    if (a3 == null) {
                        com.sankuai.waimai.store.util.monitor.report.g.a().a(41002, "sg_preload_mrn");
                        return;
                    }
                    try {
                        jSONObject = a.this.a(a3, b);
                    } catch (Throwable th) {
                        com.sankuai.waimai.imbase.log.a.a(th);
                        jSONObject = null;
                    }
                    if (jSONObject == null) {
                        com.sankuai.waimai.store.util.monitor.report.g.a().a(41003, "sg_preload_mrn");
                        return;
                    }
                    a2.b = e.a(jSONObject);
                    if (l.a().a(a2)) {
                        a.this.b.a(jSONObject, new com.meituan.android.mrn.module.utils.c() { // from class: com.sankuai.waimai.store.mrn.preload.a.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.mrn.module.utils.c
                            public final void a(JSONObject jSONObject2) {
                                m mVar;
                                Object[] objArr5 = {jSONObject2};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f12d908bbd6e4bc3e5442eb59da775ad", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f12d908bbd6e4bc3e5442eb59da775ad");
                                    return;
                                }
                                l a4 = l.a();
                                p pVar = a2;
                                Object[] objArr6 = {jSONObject2};
                                ChangeQuickRedirect changeQuickRedirect6 = m.a;
                                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "c01e241510057392bb0828a741391fb5", RobustBitConfig.DEFAULT_VALUE)) {
                                    mVar = (m) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "c01e241510057392bb0828a741391fb5");
                                } else {
                                    mVar = new m();
                                    mVar.b = null;
                                    mVar.c = jSONObject2;
                                    mVar.e = null;
                                    mVar.f = null;
                                }
                                a4.a(pVar, mVar);
                            }

                            @Override // com.meituan.android.mrn.module.utils.c
                            public final void a(String str, Throwable th2, JSONObject jSONObject2) {
                                m mVar;
                                Object[] objArr5 = {str, th2, jSONObject2};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1a5130c1363a3fec4f66180f3c63a208", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1a5130c1363a3fec4f66180f3c63a208");
                                    return;
                                }
                                com.sankuai.waimai.imbase.log.a.a(th2);
                                l a4 = l.a();
                                p pVar = a2;
                                Object[] objArr6 = {str, th2, jSONObject2};
                                ChangeQuickRedirect changeQuickRedirect6 = m.a;
                                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "4d4763796b037266efd27764dcbf16b8", RobustBitConfig.DEFAULT_VALUE)) {
                                    mVar = (m) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "4d4763796b037266efd27764dcbf16b8");
                                } else {
                                    mVar = new m();
                                    mVar.b = null;
                                    mVar.c = null;
                                    mVar.e = str;
                                    mVar.g = th2;
                                    mVar.h = jSONObject2;
                                }
                                a4.b(pVar, mVar);
                            }
                        });
                    }
                }
            };
            Object[] objArr3 = {runnable};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "dbf86e8baba6aaa1e7ca5e1963c340ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "dbf86e8baba6aaa1e7ca5e1963c340ce");
            } else {
                al.a(new al.a() { // from class: com.sankuai.waimai.store.mrn.preload.c.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.util.al.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1f6cac36ccf977cb56262ae317089472", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1f6cac36ccf977cb56262ae317089472");
                        } else {
                            runnable.run();
                        }
                    }
                }, (String) null);
            }
        }
    }

    public final com.meituan.android.mrn.engine.e b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "542743d7fafa40ddc76b8267d642f358", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.engine.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "542743d7fafa40ddc76b8267d642f358");
        }
        if (this.c == null) {
            return null;
        }
        String queryParameter = this.c.getQueryParameter("mrn_biz");
        String queryParameter2 = this.c.getQueryParameter("mrn_entry");
        MRNBundleManager sharedInstance = MRNBundleManager.sharedInstance();
        return sharedInstance.getBundle("rn_" + queryParameter + CommonConstant.Symbol.UNDERLINE + queryParameter2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final org.json.JSONObject a(com.meituan.android.mrn.engine.e r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.mrn.preload.a.a
            java.lang.String r10 = "66a2cb652c8772ab9de17e34accb86ed"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            return r12
        L1e:
            android.net.Uri r0 = r11.c
            r1 = 0
            if (r0 != 0) goto L24
            return r1
        L24:
            android.net.Uri r0 = r11.c
            java.lang.String r2 = "mrn_component"
            java.lang.String r0 = r0.getQueryParameter(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r2.<init>()     // Catch: java.lang.Throwable -> L7c
            r2.append(r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = ".json"
            r2.append(r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L7c
            java.io.InputStream r12 = r12.a(r0)     // Catch: java.lang.Throwable -> L7c
            if (r12 != 0) goto L45
            return r1
        L45:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L7c
            r0.<init>()     // Catch: java.lang.Throwable -> L7c
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L76
            r2.<init>(r12)     // Catch: java.lang.Throwable -> L76
            r12 = 4096(0x1000, float:5.74E-42)
            byte[] r12 = new byte[r12]     // Catch: java.lang.Throwable -> L72
        L53:
            int r3 = r2.read(r12)     // Catch: java.lang.Throwable -> L72
            r4 = -1
            if (r3 == r4) goto L5e
            r0.write(r12, r8, r3)     // Catch: java.lang.Throwable -> L72
            goto L53
        L5e:
            r0.flush()     // Catch: java.lang.Throwable -> L72
            r2.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r12 = move-exception
            com.sankuai.waimai.imbase.log.a.a(r12)
        L69:
            r0.close()     // Catch: java.io.IOException -> L6d
            goto L91
        L6d:
            r12 = move-exception
            com.sankuai.waimai.imbase.log.a.a(r12)
            goto L91
        L72:
            r12 = move-exception
            goto L7f
        L74:
            r12 = move-exception
            goto Lac
        L76:
            r12 = move-exception
            r2 = r1
            goto L7f
        L79:
            r12 = move-exception
            r0 = r1
            goto Lac
        L7c:
            r12 = move-exception
            r0 = r1
            r2 = r0
        L7f:
            com.sankuai.waimai.imbase.log.a.a(r12)     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L8c
            r2.close()     // Catch: java.io.IOException -> L88
            goto L8c
        L88:
            r12 = move-exception
            com.sankuai.waimai.imbase.log.a.a(r12)
        L8c:
            if (r0 == 0) goto L91
            r0.close()     // Catch: java.io.IOException -> L6d
        L91:
            if (r0 == 0) goto La9
            int r12 = r0.size()
            if (r12 != 0) goto L9a
            goto La9
        L9a:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La4
            r12.<init>(r0)     // Catch: java.lang.Throwable -> La4
            return r12
        La4:
            r12 = move-exception
            com.sankuai.waimai.imbase.log.a.a(r12)
            return r1
        La9:
            return r1
        Laa:
            r12 = move-exception
            r1 = r2
        Lac:
            if (r1 == 0) goto Lb6
            r1.close()     // Catch: java.io.IOException -> Lb2
            goto Lb6
        Lb2:
            r1 = move-exception
            com.sankuai.waimai.imbase.log.a.a(r1)
        Lb6:
            if (r0 == 0) goto Lc0
            r0.close()     // Catch: java.io.IOException -> Lbc
            goto Lc0
        Lbc:
            r0 = move-exception
            com.sankuai.waimai.imbase.log.a.a(r0)
        Lc0:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.mrn.preload.a.a(com.meituan.android.mrn.engine.e):org.json.JSONObject");
    }

    public final JSONObject a(JSONObject jSONObject, com.meituan.android.mrn.engine.e eVar) throws Throwable {
        Object[] objArr = {jSONObject, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feb408d5ee7a69ada748321d5120c030", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feb408d5ee7a69ada748321d5120c030");
        }
        if (jSONObject.optBoolean("enable", false)) {
            f.a(jSONObject, this.c);
            jSONObject.put("rn_bundle_name", eVar.c);
            jSONObject.put("rn_bundle_version", eVar.f);
            jSONObject.put("rn_bundle_component_name", eVar.c);
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            if (optJSONObject != null) {
                optJSONObject.put("rn_bundle_version", eVar.c + CommonConstant.Symbol.UNDERLINE + eVar.f);
            }
            jSONObject.put("contentType", "form");
            return jSONObject;
        }
        return null;
    }
}
