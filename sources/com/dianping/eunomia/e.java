package com.dianping.eunomia;

import android.content.Context;
import com.dianping.eunomia.model.models.Group;
import com.dianping.eunomia.model.models.ModuleConfig;
import com.dianping.eunomia.model.models.ModuleConfigResponse;
import com.dianping.eunomia.model.models.ModuleProp;
import com.dianping.model.KV;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.knbbridge.ShowLogJsHandler;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002J\b\u0010\u000b\u001a\u00020\u0000H\u0007J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J/\u0010\u0011\u001a\u00020\t2\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00132\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0013H\u0002¢\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/dianping/eunomia/ModuleHelper;", "", "()V", "assembleKVItem", "Lcom/dianping/eunomia/KVItem;", ShowLogJsHandler.PARAM_NAME_MODULE, "Lcom/dianping/eunomia/model/models/ModuleItem;", "propsMap", "", "", "Lcom/dianping/eunomia/model/models/ModuleProp;", "getInstance", "loadFromNewCacheFile", "Lcom/dianping/eunomia/ModulesConfig;", "loadFromNewRaw", "context", "Landroid/content/Context;", "transformGroups", "groups", "", "Lcom/dianping/eunomia/model/models/Group;", "props", "([Lcom/dianping/eunomia/model/models/Group;[Lcom/dianping/eunomia/model/models/ModuleProp;)Ljava/lang/String;", "transformRes", "Lcom/dianping/model/KV;", APKStructure.Res_Type, "Lcom/dianping/eunomia/model/models/ModuleConfigResponse;", "(Lcom/dianping/eunomia/model/models/ModuleConfigResponse;)[Lcom/dianping/model/KV;", "eunomia_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public static final e b = new e();

    @JvmStatic
    @NotNull
    public static final e a() {
        return b;
    }

    @NotNull
    public final ModulesConfig b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "488a2428a34346a601edd6b00a74eaea", RobustBitConfig.DEFAULT_VALUE)) {
            return (ModulesConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "488a2428a34346a601edd6b00a74eaea");
        }
        ModuleConfigResponse c = com.dianping.eunomia.debug.a.c();
        ModulesConfig modulesConfig = new ModulesConfig();
        modulesConfig.configs = a(c);
        modulesConfig.isPresent = modulesConfig.configs != null;
        return modulesConfig;
    }

    @NotNull
    public final ModulesConfig a(@NotNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c8783ea5e66e2ec46c88f824cce64cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (ModulesConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c8783ea5e66e2ec46c88f824cce64cc");
        }
        kotlin.jvm.internal.h.b(context, "context");
        ModuleConfigResponse d = com.dianping.eunomia.debug.a.d();
        ModulesConfig modulesConfig = new ModulesConfig();
        modulesConfig.configs = a(d);
        modulesConfig.isPresent = modulesConfig.configs != null;
        return modulesConfig;
    }

    private final KV[] a(ModuleConfigResponse moduleConfigResponse) {
        ModuleConfig[] moduleConfigArr;
        Object[] objArr = {moduleConfigResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "727d0a0932717cb61b101dd1f56a64a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (KV[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "727d0a0932717cb61b101dd1f56a64a7");
        }
        if ((moduleConfigResponse != null ? moduleConfigResponse.configs : null) == null || moduleConfigResponse.moduleProps == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleConfig moduleConfig : moduleConfigResponse.configs) {
            if (moduleConfig != null) {
                KV kv = new KV();
                kv.f = moduleConfig.key;
                Group[] groupArr = moduleConfig.groups;
                ModuleProp[] modulePropArr = moduleConfigResponse.moduleProps;
                kotlin.jvm.internal.h.a((Object) modulePropArr, "res.moduleProps");
                kv.e = a(groupArr, modulePropArr);
                arrayList.add(kv);
            }
        }
        return (KV[]) arrayList.toArray(new KV[]{new KV()});
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x012f, code lost:
        if (r12.intValue() != 2) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015d  */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String a(com.dianping.eunomia.model.models.Group[] r24, com.dianping.eunomia.model.models.ModuleProp[] r25) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.eunomia.e.a(com.dianping.eunomia.model.models.Group[], com.dianping.eunomia.model.models.ModuleProp[]):java.lang.String");
    }
}
