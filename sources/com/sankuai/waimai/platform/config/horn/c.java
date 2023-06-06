package com.sankuai.waimai.platform.config.horn;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public final Map<String, ?> b;

    public c(Map<String, ?> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86dad24bed174705ef55d0261b91ab63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86dad24bed174705ef55d0261b91ab63");
        } else {
            this.b = map;
        }
    }

    public final boolean a(String str, boolean z) {
        Object obj;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bff9a499b9d8c40946c18c209e213036", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bff9a499b9d8c40946c18c209e213036")).booleanValue() : (this.b == null || (obj = this.b.get(str)) == null) ? z : b(obj);
    }

    public final int a(String str, int i) {
        Object obj;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aaf89c72a14063773b93f877561455e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aaf89c72a14063773b93f877561455e")).intValue() : (this.b == null || (obj = this.b.get(str)) == null) ? i : d(obj);
    }

    public final <T> List<T> a(String str, List<T> list) {
        Object obj;
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86510e8bece1bd14573874f2142bfa11", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86510e8bece1bd14573874f2142bfa11") : (this.b == null || (obj = this.b.get(str)) == null) ? list : c(obj);
    }

    public final <T> Set<T> a(String str, Set<T> set) {
        Object obj;
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "781babde65b8c63f43389be55ad8f3be", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "781babde65b8c63f43389be55ad8f3be") : (this.b == null || (obj = this.b.get(str)) == null) ? set : a(obj);
    }

    public final <K, V> Map<K, V> a(String str, Map<K, V> map) {
        Object obj;
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddd5654d1cb26adf919badbc88600ec6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddd5654d1cb26adf919badbc88600ec6");
        }
        if (this.b == null || (obj = this.b.get(str)) == null) {
            return null;
        }
        return (Map) obj;
    }

    private <T> Set<T> a(@NonNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a14f9153aa9515665715c98b792e3ab9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a14f9153aa9515665715c98b792e3ab9");
        }
        if (obj instanceof Set) {
            return (Set) obj;
        }
        if (obj instanceof Collection) {
            return new HashSet((Collection) obj);
        }
        throw new IllegalArgumentException(obj.getClass().getName() + " cannot cast to Set");
    }

    private boolean b(@NonNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "624f79f8ff7f24cf1ffdfeee87287f0e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "624f79f8ff7f24cf1ffdfeee87287f0e")).booleanValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(String.valueOf(obj));
    }

    private <T> List<T> c(@NonNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e6999cba731c8de44f3250024caa6f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e6999cba731c8de44f3250024caa6f6");
        }
        if (obj instanceof List) {
            return (List) obj;
        }
        if (obj instanceof Collection) {
            return new ArrayList((Collection) obj);
        }
        throw new IllegalArgumentException(obj.getClass().getName() + " cannot cast to List");
    }

    private int d(@NonNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "973cdbfc0434fc02b4325a95eae28f53", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "973cdbfc0434fc02b4325a95eae28f53")).intValue();
        }
        if (obj instanceof Double) {
            return ((Double) obj).intValue();
        }
        return Integer.parseInt(String.valueOf(obj));
    }
}
