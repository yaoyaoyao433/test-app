package com.dianping.eunomia.debug;

import android.text.TextUtils;
import com.dianping.eunomia.ModuleConfigPersist;
import com.dianping.eunomia.ModulesConfig;
import com.dianping.eunomia.b;
import com.dianping.eunomia.c;
import com.dianping.eunomia.j;
import com.dianping.eunomia.m;
import com.dianping.eunomia.model.models.ModuleConfig;
import com.dianping.eunomia.model.models.ModuleConfigResponse;
import com.dianping.eunomia.model.models.ModuleProp;
import com.dianping.eunomia.model.models.ModulesExtra;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007J\u001e\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006#"}, d2 = {"Lcom/dianping/eunomia/debug/ModuleDebugger;", "", "()V", "latestFrameKey", "", "latestFrameKey$annotations", "getLatestFrameKey", "()Ljava/lang/String;", "setLatestFrameKey", "(Ljava/lang/String;)V", "latestTemplateKey", "latestTemplateKey$annotations", "getLatestTemplateKey", "setLatestTemplateKey", "clearCache", "", "clearFile", "createAsset", Constants.JSNative.DATA_CALLBACK, "Lcom/dianping/eunomia/debug/OnCreateAsset;", "getConfigFromAsset", "Lcom/dianping/eunomia/model/models/ModuleConfigResponse;", "getConfigFromFile", "getFrame", "", "key", "(Ljava/lang/String;)Ljava/lang/Integer;", "getModuleProp", "Lcom/dianping/eunomia/model/models/ModuleProp;", "getTemplate", "", "Ljava/util/ArrayList;", "Lcom/dianping/eunomia/ModuleConfigItem;", "getTemplateOrigin", "Lcom/dianping/eunomia/model/models/ModuleConfig;", "eunomia_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final a b = new a();
    @Nullable
    private static String c = "";
    @Nullable
    private static String d = "";

    @Nullable
    public static final String a() {
        return c;
    }

    public static final void a(@Nullable String str) {
        c = str;
    }

    @Nullable
    public static final String b() {
        return d;
    }

    @JvmStatic
    @Nullable
    public static final ModuleConfigResponse c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22415b50a1096fba143098f0346b9cdd", RobustBitConfig.DEFAULT_VALUE)) {
            return (ModuleConfigResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22415b50a1096fba143098f0346b9cdd");
        }
        ModuleConfigPersist b2 = m.d.b();
        if (b2 != null) {
            return b2.moduleConfigResponse;
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final ModuleConfigResponse d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de73173aeb816e66fcf9c9dd20dbcec8", RobustBitConfig.DEFAULT_VALUE)) {
            return (ModuleConfigResponse) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de73173aeb816e66fcf9c9dd20dbcec8");
        }
        ModulesConfig e = m.d.e();
        if (e != null) {
            return e.moduleConfigRes;
        }
        return null;
    }

    @JvmStatic
    public static final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ce2085ed6980efe7b1a0b62f2d73bec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ce2085ed6980efe7b1a0b62f2d73bec");
            return;
        }
        m mVar = m.d;
        m.a((b) null);
    }

    @JvmStatic
    public static final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "989ae99d45e936eef7ba09e0e9e3217e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "989ae99d45e936eef7ba09e0e9e3217e");
        } else {
            m.d.d();
        }
    }

    @JvmStatic
    @NotNull
    public static final List<ArrayList<c>> b(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da4ea22ffafbbb4a8db0c9260d5cf65c", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da4ea22ffafbbb4a8db0c9260d5cf65c") : j.b.a(str);
    }

    @JvmStatic
    @Nullable
    public static final ModuleConfig c(@Nullable String str) {
        ModuleConfig[] moduleConfigArr;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf5bde67a0e84d9b70b75a6a64a19291", RobustBitConfig.DEFAULT_VALUE)) {
            return (ModuleConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf5bde67a0e84d9b70b75a6a64a19291");
        }
        ModuleConfigResponse c2 = m.d.c();
        if (c2 != null) {
            for (ModuleConfig moduleConfig : c2.configs) {
                if (moduleConfig != null && !TextUtils.isEmpty(moduleConfig.key) && h.a((Object) moduleConfig.key, (Object) str)) {
                    return moduleConfig;
                }
            }
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final ModuleProp d(@Nullable String str) {
        ModuleProp[] modulePropArr;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb8693a5f73cf0ea2a8caa00bf0795a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ModuleProp) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb8693a5f73cf0ea2a8caa00bf0795a9");
        }
        ModuleConfigResponse c2 = m.d.c();
        if (c2 != null) {
            for (ModuleProp moduleProp : c2.moduleProps) {
                if (moduleProp != null && !TextUtils.isEmpty(moduleProp.key) && h.a((Object) moduleProp.key, (Object) str)) {
                    return moduleProp;
                }
            }
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final Integer e(@Nullable String str) {
        ModuleConfig[] moduleConfigArr;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        Integer num = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "403f56e68172b69c111f636b5f4022cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "403f56e68172b69c111f636b5f4022cf");
        }
        ModuleConfigResponse c2 = m.d.c();
        if (c2 != null && (moduleConfigArr = c2.configs) != null) {
            j jVar = j.b;
            h.b(moduleConfigArr, "arr");
            if (str != null) {
                int length = moduleConfigArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    ModuleConfig moduleConfig = moduleConfigArr[i];
                    if (moduleConfig == null || TextUtils.isEmpty(moduleConfig.key) || !h.a((Object) moduleConfig.key, (Object) str)) {
                        i++;
                    } else {
                        ModulesExtra modulesExtra = moduleConfig.extra;
                        num = Integer.valueOf(modulesExtra != null ? modulesExtra.frame : 1);
                    }
                }
            }
        }
        return Integer.valueOf(num != null ? num.intValue() : 0);
    }
}
