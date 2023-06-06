package com.sankuai.waimai.rocks.utils;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.cube.pga.dynamic.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.rocks.log.b;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.node.c;
import com.sankuai.waimai.rocks.view.viewmodel.e;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r3.equals("mrn") != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.rocks.node.c a(com.sankuai.waimai.rocks.log.b r21, java.lang.String r22, com.sankuai.waimai.rocks.model.RocksServerModel r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r11 = 0
            r3[r11] = r0
            r12 = 1
            r3[r12] = r1
            r13 = 2
            r3[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r14 = com.sankuai.waimai.rocks.utils.a.a
            java.lang.String r15 = "184c614ceec8d7fa4f2701a49e1165a5"
            r5 = 0
            r7 = 1
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4 = r3
            r6 = r14
            r8 = r15
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L2a
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r3, r5, r14, r12, r15)
            com.sankuai.waimai.rocks.node.c r0 = (com.sankuai.waimai.rocks.node.c) r0
            return r0
        L2a:
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r4 = com.sankuai.waimai.rocks.utils.a.a
            java.lang.String r6 = "860156ed639c9f64fddef3729f5621ef"
            r15 = 0
            r17 = 1
            r19 = 4611686018427387904(0x4000000000000000, double:2.0)
            r14 = r3
            r16 = r4
            r18 = r6
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19)
            if (r7 == 0) goto L4d
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r3, r5, r4, r12, r6)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L93
        L4d:
            if (r2 == 0) goto L92
            java.lang.String r3 = r2.renderMode
            if (r3 != 0) goto L54
            goto L92
        L54:
            java.lang.String r3 = r2.renderMode
            r4 = -1
            int r5 = r3.hashCode()
            r6 = -1052618729(0xffffffffc1425017, float:-12.144553)
            if (r5 == r6) goto L80
            r6 = 108393(0x1a769, float:1.51891E-40)
            if (r5 == r6) goto L76
            r6 = 3343609(0x3304f9, float:4.685394E-39)
            if (r5 == r6) goto L6b
            goto L8b
        L6b:
            java.lang.String r5 = "mach"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8b
            r13 = 1
            goto L8c
        L76:
            java.lang.String r5 = "mrn"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8b
            goto L8c
        L80:
            java.lang.String r5 = "native"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L8b
            r13 = 0
            goto L8c
        L8b:
            r13 = -1
        L8c:
            switch(r13) {
                case 0: goto L90;
                case 1: goto L90;
                case 2: goto L90;
                default: goto L8f;
            }
        L8f:
            goto L92
        L90:
            r3 = 1
            goto L93
        L92:
            r3 = 0
        L93:
            if (r3 != 0) goto L9a
            java.lang.String r3 = r2.renderMode
            r0.f(r1, r3)
        L9a:
            com.sankuai.waimai.rocks.node.c r0 = a(r0, r1, r2, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.rocks.utils.a.a(com.sankuai.waimai.rocks.log.b, java.lang.String, com.sankuai.waimai.rocks.model.RocksServerModel):com.sankuai.waimai.rocks.node.c");
    }

    private static c a(b bVar, String str, RocksServerModel rocksServerModel, int i) {
        Object[] objArr = {bVar, str, rocksServerModel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5cc4873a6e45c54bbbbfd59cbb072617", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5cc4873a6e45c54bbbbfd59cbb072617");
        }
        if (rocksServerModel.viewType == null) {
            return new com.sankuai.waimai.rocks.node.a(rocksServerModel);
        }
        String str2 = rocksServerModel.viewType;
        char c = 65535;
        int hashCode = str2.hashCode();
        if (hashCode != 3433103) {
            if (hashCode != 93832333) {
                if (hashCode == 97692013 && str2.equals(JsBridgeResult.PROPERTY_GET_MEDIA_FRAME_FRAME)) {
                    c = 1;
                }
            } else if (str2.equals(ConfigInfo.MODULE_BLOCK)) {
                c = 2;
            }
        } else if (str2.equals("page")) {
            c = 0;
        }
        switch (c) {
            case 0:
                c.a aVar = new c.a(rocksServerModel);
                if (rocksServerModel.moduleList == null || rocksServerModel.moduleList.isEmpty()) {
                    bVar.g(str, "page_list_empty");
                } else {
                    for (RocksServerModel rocksServerModel2 : rocksServerModel.moduleList) {
                        aVar.b.add(a(bVar, str, rocksServerModel2, i + 1));
                    }
                }
                return aVar;
            case 1:
                com.sankuai.waimai.rocks.node.b bVar2 = new com.sankuai.waimai.rocks.node.b(rocksServerModel);
                if (rocksServerModel.moduleList == null || rocksServerModel.moduleList.isEmpty()) {
                    bVar.g(str, "frame_list_empty");
                } else {
                    for (RocksServerModel rocksServerModel3 : rocksServerModel.moduleList) {
                        c a2 = a(bVar, str, rocksServerModel3, i + 1);
                        if (a2 instanceof com.sankuai.waimai.rocks.node.a) {
                            bVar2.b.add((com.sankuai.waimai.rocks.node.a) a2);
                        } else {
                            bVar.g(str, "frame_has_mistake_block");
                        }
                    }
                }
                return bVar2;
            default:
                com.sankuai.waimai.rocks.node.a aVar2 = new com.sankuai.waimai.rocks.node.a(rocksServerModel);
                if (rocksServerModel.moduleList != null && !rocksServerModel.moduleList.isEmpty()) {
                    if (aVar2.k == null) {
                        aVar2.k = new ArrayList();
                    }
                    for (RocksServerModel rocksServerModel4 : rocksServerModel.moduleList) {
                        c a3 = a(bVar, str, rocksServerModel4, i + 1);
                        if (a3 instanceof com.sankuai.waimai.rocks.node.a) {
                            aVar2.k.add((com.sankuai.waimai.rocks.node.a) a3);
                        } else {
                            bVar.g(str, "frame_has_mistake_block");
                        }
                    }
                }
                return aVar2;
        }
    }

    public static com.meituan.android.cube.pga.viewmodel.a a(Activity activity, e eVar) {
        d a2;
        Object[] objArr = {activity, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78d0e0206bade27ff10432c8658c4382", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78d0e0206bade27ff10432c8658c4382");
        }
        if (!f.a(activity) && eVar != null && eVar.s != null && (a2 = a(eVar.s.c)) != null) {
            try {
                Map<String, Object> d = eVar.s.d();
                d.put("index", Integer.valueOf(eVar.v));
                com.meituan.android.cube.pga.viewmodel.a a3 = a2.a((d) a2.a(JsonUtil.mapToJSONString(d), k.a()));
                a3.a((Context) activity);
                a3.d(eVar.s.c);
                a3.c(eVar.s.n);
                if (a3.e() != null) {
                    if (a3.c().booleanValue()) {
                        return a3;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Nullable
    public static d a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61940479277352eb4008ccf0506bb675", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61940479277352eb4008ccf0506bb675") : com.meituan.android.cube.pga.dynamic.a.a().a(str);
    }

    public static com.meituan.android.cube.pga.block.a a(com.meituan.android.cube.pga.type.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8de5bf9ab3d1b6985a0ad512d242a5f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8de5bf9ab3d1b6985a0ad512d242a5f2");
        }
        d a2 = a(str);
        if (a2 != null) {
            return (com.meituan.android.cube.pga.block.a) a2.a(aVar);
        }
        return null;
    }

    public static com.sankuai.waimai.rocks.page.block.e b(com.meituan.android.cube.pga.type.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6167daf91cb52cbe48d9d465f0480944", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.rocks.page.block.e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6167daf91cb52cbe48d9d465f0480944");
        }
        d a2 = a(str);
        if (a2 != null) {
            return (com.sankuai.waimai.rocks.page.block.e) a2.a(aVar);
        }
        return null;
    }
}
