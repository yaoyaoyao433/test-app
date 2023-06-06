package com.sankuai.xm.im.cache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.util.ac;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private String b;
    private HashSet<String> c;
    private String d;
    private boolean e;

    private j(String str, Set<String> set, String str2, boolean z) {
        Object[] objArr = {str, set, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c440b4257ddb024c220cea469a0188b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c440b4257ddb024c220cea469a0188b4");
            return;
        }
        this.c = new HashSet<>();
        this.b = str;
        if (set != null) {
            this.c.addAll(set);
        }
        this.d = ac.a(str2) ? "=" : str2;
        this.e = z;
    }

    public static j a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c0ba7554987a572b5b0ece53aec5be5", 6917529027641081856L) ? (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c0ba7554987a572b5b0ece53aec5be5") : a(str, str2, "=", z);
    }

    public static j a(String str, Set<String> set, boolean z) {
        Object[] objArr = {str, set, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ebf565da5fc7a1af1753866ec9d1f5e", 6917529027641081856L) ? (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ebf565da5fc7a1af1753866ec9d1f5e") : a(str, set, "in", z);
    }

    public static j a(String str, String str2, String str3, boolean z) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d6b6598e76db7266108d36b14029647", 6917529027641081856L)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d6b6598e76db7266108d36b14029647");
        }
        HashSet hashSet = new HashSet();
        hashSet.add(str2);
        return new j(str, hashSet, str3, z);
    }

    public static j a(String str, Set<String> set, String str2, boolean z) {
        Object[] objArr = {str, set, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13c0120352daa41c7805013e512cd67f", 6917529027641081856L) ? (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13c0120352daa41c7805013e512cd67f") : new j(str, set, str2, z);
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "393ad4527900e6d51f18acc205fdfea2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "393ad4527900e6d51f18acc205fdfea2");
        }
        if (this.c.isEmpty()) {
            com.sankuai.xm.im.utils.a.d("SQLParam::getSQL, dismiss value, %s", this);
            return "";
        }
        String str = this.d;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 60) {
            if (hashCode != 62) {
                if (hashCode == 3365 && str.equals("in")) {
                    c = 0;
                }
            } else if (str.equals(">")) {
                c = 2;
            }
        } else if (str.equals("<")) {
            c = 1;
        }
        switch (c) {
            case 0:
                return String.format("%s in (%s)", this.b, ac.a(this.c, CommonConstant.Symbol.COMMA, this.e));
            case 1:
            case 2:
                if (this.c.size() != 1 || this.e) {
                    com.sankuai.xm.im.utils.a.c("SQLParam::getSQL, value invalid, %s", this);
                    return "";
                }
                return String.format("%s %s %s", this.b, this.d, this.c.iterator().next());
            default:
                if (this.c.size() == 1) {
                    return this.e ? String.format("%s %s '%s'", this.b, this.d, this.c.iterator().next()) : String.format("%s %s %s", this.b, this.d, this.c.iterator().next());
                }
                com.sankuai.xm.im.utils.a.c("SQLParam::getSQL, value invalid, %s", this);
                return "";
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5eb2255b33954b7aa01316e5b5a123e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5eb2255b33954b7aa01316e5b5a123e");
        }
        return "SQLParam{key='" + this.b + "', value=" + this.c + ", op='" + this.d + "', isStr=" + this.e + '}';
    }
}
