package com.dianping.apache.http.message;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements com.dianping.apache.http.a, Serializable, Cloneable {
    public static ChangeQuickRedirect a = null;
    private static final long serialVersionUID = -6437800749411518984L;
    private final String b;
    private final String c;

    public a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f01031a18f892a6e2e0e5a2444bb31bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f01031a18f892a6e2e0e5a2444bb31bf");
        } else if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else {
            this.b = str;
            this.c = str2;
        }
    }

    @Override // com.dianping.apache.http.a
    public final String a() {
        return this.b;
    }

    @Override // com.dianping.apache.http.a
    public final String b() {
        return this.c;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d28a3bd28b2b0b156c78bd72586d0daf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d28a3bd28b2b0b156c78bd72586d0daf");
        }
        if (this.c == null) {
            return this.b;
        }
        StringBuilder sb = new StringBuilder(this.b.length() + 1 + this.c.length());
        sb.append(this.b);
        sb.append("=");
        sb.append(this.c);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        boolean equals;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28b11e039198f8de96b91f26e5b6464b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28b11e039198f8de96b91f26e5b6464b")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.dianping.apache.http.a) {
            a aVar = (a) obj;
            if (this.b.equals(aVar.b)) {
                String str = this.c;
                String str2 = aVar.c;
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a426dc91129477c17c2a58a44e2db1bb", RobustBitConfig.DEFAULT_VALUE)) {
                    equals = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a426dc91129477c17c2a58a44e2db1bb")).booleanValue();
                } else if (str == null) {
                    equals = str2 == null;
                } else {
                    equals = str.equals(str2);
                }
                if (equals) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "874d4ccc075127c1107300b6577e9f42", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "874d4ccc075127c1107300b6577e9f42")).intValue() : a(a(17, this.b), this.c);
    }

    private int a(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "461f067bc34d1dbd64a5c113e86d6682", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "461f067bc34d1dbd64a5c113e86d6682")).intValue();
        }
        return (i * 37) + (obj != null ? obj.hashCode() : 0);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "332b4b8b3b97cc4d0db3d6a7ea07eb16", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "332b4b8b3b97cc4d0db3d6a7ea07eb16") : super.clone();
    }
}
