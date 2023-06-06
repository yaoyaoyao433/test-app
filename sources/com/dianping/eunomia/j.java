package com.dianping.eunomia;

import android.text.TextUtils;
import com.dianping.eunomia.model.models.ExtraProp;
import com.dianping.eunomia.model.models.ModuleConfigResponse;
import com.dianping.eunomia.model.models.ModuleItem;
import com.dianping.eunomia.model.models.ModuleProp;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J+\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J$\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ'\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00142\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e¢\u0006\u0002\u0010 J%\u0010\u001e\u001a\u00020\u00192\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010\"J\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\tJ\u0012\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u0017\u0010&\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010(¨\u0006)"}, d2 = {"Lcom/dianping/eunomia/ModuleProvider;", "", "()V", "assembleItem", "Lcom/dianping/eunomia/ModuleConfigItem;", ShowLogJsHandler.PARAM_NAME_MODULE, "Lcom/dianping/eunomia/model/models/ModuleItem;", "propsMap", "", "", "Lcom/dianping/eunomia/model/models/ModuleProp;", "findFrameWithKey", "", "arr", "", "Lcom/dianping/eunomia/model/models/ModuleConfig;", "key", "findFrameWithKey$eunomia_release", "([Lcom/dianping/eunomia/model/models/ModuleConfig;Ljava/lang/String;)Ljava/lang/Integer;", "findTemplateWithKey", "", "Ljava/util/ArrayList;", "mc", "Lcom/dianping/eunomia/model/models/ModuleConfigResponse;", "getFrame", "", "shopView", "shopViewWithBiz", "callback", "Lcom/dianping/eunomia/handler/ModuleShopViewHandler;", "getTemplate", "keys", "([Ljava/lang/String;)Ljava/util/List;", "Lcom/dianping/eunomia/handler/ModuleConfigCallback;", "([Ljava/lang/String;Lcom/dianping/eunomia/handler/ModuleConfigCallback;)V", "transformFrame", "extra", "Lcom/dianping/eunomia/model/models/ModulesExtra;", "transformPri", "originPri", "(Ljava/lang/Integer;)I", "eunomia_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class j {
    public static ChangeQuickRedirect a;
    public static final j b = new j();

    @NotNull
    public final List<ArrayList<c>> a(@Nullable String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb16757e17bc00a8397d3934cbf80e39", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb16757e17bc00a8397d3934cbf80e39");
        }
        long currentTimeMillis = System.currentTimeMillis();
        ModuleConfigResponse c = m.d.c();
        if (c != null) {
            List<ArrayList<c>> a2 = b.a(str, c);
            List<ArrayList<c>> list = a2;
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            if (z) {
                h.b.b(str, System.currentTimeMillis() - currentTimeMillis);
            } else {
                h.b.a(str, System.currentTimeMillis() - currentTimeMillis);
            }
            return a2;
        }
        h.b.b(str, System.currentTimeMillis() - currentTimeMillis);
        return new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.util.ArrayList<com.dianping.eunomia.c>> a(@org.jetbrains.annotations.Nullable java.lang.String[] r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.eunomia.j.a
            java.lang.String r11 = "c1d3e11aa375923b95394913566361e8"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.util.List r13 = (java.util.List) r13
            return r13
        L1e:
            long r1 = java.lang.System.currentTimeMillis()
            if (r13 == 0) goto L2f
            int r3 = r13.length
            if (r3 != 0) goto L29
            r3 = 1
            goto L2a
        L29:
            r3 = 0
        L2a:
            if (r3 == 0) goto L2d
            goto L2f
        L2d:
            r3 = 0
            goto L30
        L2f:
            r3 = 1
        L30:
            if (r3 == 0) goto L46
            com.dianping.eunomia.h r13 = com.dianping.eunomia.h.b
            java.lang.String r0 = ""
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r13.b(r0, r3)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.List r13 = (java.util.List) r13
            return r13
        L46:
            com.dianping.eunomia.m r3 = com.dianping.eunomia.m.d
            com.dianping.eunomia.model.models.ModuleConfigResponse r3 = r3.c()
            if (r3 == 0) goto L72
            int r4 = r13.length
            r5 = 0
        L50:
            if (r5 >= r4) goto L72
            r6 = r13[r5]
            com.dianping.eunomia.j r7 = com.dianping.eunomia.j.b
            java.util.List r7 = r7.a(r6, r3)
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r0
            if (r8 == 0) goto L6f
            com.dianping.eunomia.h r13 = com.dianping.eunomia.h.b
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r13.a(r6, r3)
            return r7
        L6f:
            int r5 = r5 + 1
            goto L50
        L72:
            com.dianping.eunomia.h r0 = com.dianping.eunomia.h.b
            r13 = r13[r9]
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r0.b(r13, r3)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.List r13 = (java.util.List) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.eunomia.j.a(java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<java.util.ArrayList<com.dianping.eunomia.c>> a(java.lang.String r13, com.dianping.eunomia.model.models.ModuleConfigResponse r14) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.eunomia.j.a(java.lang.String, com.dianping.eunomia.model.models.ModuleConfigResponse):java.util.List");
    }

    private final c a(ModuleItem moduleItem, Map<String, ? extends ModuleProp> map) {
        ExtraProp[] extraPropArr;
        ExtraProp[] extraPropArr2;
        ExtraProp[] extraPropArr3;
        Object[] objArr = {moduleItem, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d696ee1ff83cfc27fa1e3f1ec8da96df", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d696ee1ff83cfc27fa1e3f1ec8da96df");
        }
        if (TextUtils.isEmpty(moduleItem.key)) {
            return null;
        }
        if (map.containsKey(moduleItem.key)) {
            ModuleProp moduleProp = map.get(moduleItem.key);
            Integer valueOf = moduleProp != null ? Integer.valueOf(moduleProp.operation) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                c cVar = new c();
                if (!TextUtils.isEmpty(moduleProp.targetModule) && map.containsKey(moduleProp.targetModule)) {
                    ModuleProp moduleProp2 = map.get(moduleProp.targetModule);
                    cVar.a = moduleProp.targetModule;
                    cVar.d = a(Integer.valueOf(moduleItem.pri));
                    cVar.b = moduleProp2 != null ? moduleProp2.url : null;
                    cVar.c = moduleProp2 != null ? moduleProp2.type : 0;
                    if (moduleProp2 == null || (extraPropArr3 = moduleProp2.data) == null) {
                        extraPropArr3 = new ExtraProp[0];
                    }
                    cVar.e = extraPropArr3;
                } else {
                    cVar.a = moduleProp.targetModule;
                    cVar.d = a(Integer.valueOf(moduleItem.pri));
                    cVar.b = "";
                    cVar.c = 0;
                    if (moduleProp == null || (extraPropArr2 = moduleProp.data) == null) {
                        extraPropArr2 = new ExtraProp[0];
                    }
                    cVar.e = extraPropArr2;
                }
                return cVar;
            } else if (valueOf != null && valueOf.intValue() == 2) {
                return null;
            } else {
                c cVar2 = new c();
                cVar2.a = moduleItem.key;
                cVar2.d = a(Integer.valueOf(moduleItem.pri));
                cVar2.b = moduleProp != null ? moduleProp.url : null;
                cVar2.c = moduleProp != null ? moduleProp.type : 0;
                if (moduleProp == null || (extraPropArr = moduleProp.data) == null) {
                    extraPropArr = new ExtraProp[0];
                }
                cVar2.e = extraPropArr;
                return cVar2;
            }
        }
        c cVar3 = new c();
        cVar3.a = moduleItem.key;
        cVar3.d = a(Integer.valueOf(moduleItem.pri));
        cVar3.b = "";
        cVar3.c = 0;
        cVar3.e = new ExtraProp[0];
        return cVar3;
    }

    private final int a(Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87c2acb9388cd71185a5bdb0ff6bf0aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87c2acb9388cd71185a5bdb0ff6bf0aa")).intValue();
        }
        if (num == null || num.intValue() <= 0) {
            return Integer.MAX_VALUE;
        }
        return num.intValue();
    }
}
