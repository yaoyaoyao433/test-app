package com.dianping.imagemanager.utils.downloadphoto.httpservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements l, Serializable, Cloneable {
    public static ChangeQuickRedirect a = null;
    private static final long serialVersionUID = -6437800749411518984L;
    private final String b;
    private final String c;

    public c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6151534d74ddd6fea510ee00ff180a9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6151534d74ddd6fea510ee00ff180a9c");
        } else if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else {
            this.b = str;
            this.c = str2;
        }
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.l
    public final String a() {
        return this.b;
    }

    @Override // com.dianping.imagemanager.utils.downloadphoto.httpservice.l
    public final String b() {
        return this.c;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "371f3bdfb9e645852ffa328867e496d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "371f3bdfb9e645852ffa328867e496d8");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6766e9b1e777a06b7c91d58b74d5bff0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6766e9b1e777a06b7c91d58b74d5bff0")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            c cVar = (c) obj;
            if (this.b.equals(cVar.b)) {
                String str = this.c;
                String str2 = cVar.c;
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49350e87ceea6a117af2985b0ccb0043", RobustBitConfig.DEFAULT_VALUE)) {
                    equals = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49350e87ceea6a117af2985b0ccb0043")).booleanValue();
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86ff4468e4ccbc1025d1f8f787aca9c7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86ff4468e4ccbc1025d1f8f787aca9c7")).intValue() : a(a(17, this.b), this.c);
    }

    private int a(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ead44936dca97dc49e4853da79475ac0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ead44936dca97dc49e4853da79475ac0")).intValue();
        }
        return (i * 37) + (obj != null ? obj.hashCode() : 0);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20db9f866f7d4f03075e0f7536bb5b49", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20db9f866f7d4f03075e0f7536bb5b49") : super.clone();
    }
}
