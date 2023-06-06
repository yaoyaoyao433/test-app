package com.sankuai.waimai.store.search.isomorphism;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.recycler.c;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull Map<String, Object> map, @Nullable c cVar) {
        Object[] objArr = {map, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        Object obj = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07f4c3410018927d1d9386b162322613", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07f4c3410018927d1d9386b162322613");
            return;
        }
        if (cVar != null) {
            try {
                obj = cVar.a("mach_custom_env_value");
            } catch (Exception unused) {
                return;
            }
        }
        if (obj instanceof Map) {
            map.putAll((Map) obj);
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54c145fcfd89eeb5cf9c997185853ede", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54c145fcfd89eeb5cf9c997185853ede")).booleanValue();
        }
        if (com.sankuai.waimai.search.common.mach.b.a(str)) {
            return false;
        }
        com.sankuai.waimai.search.common.mach.b.b(str);
        return true;
    }

    public static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2949f224facbb8fefe415d10d4e1ef8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2949f224facbb8fefe415d10d4e1ef8")).booleanValue();
        }
        if (com.sankuai.waimai.search.common.mach.b.c(str)) {
            return false;
        }
        com.sankuai.waimai.search.common.mach.b.d(str);
        return true;
    }
}
