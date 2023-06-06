package com.meituan.dio;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    protected final String b;
    protected final int c;
    protected final int d;
    protected final b e;

    public a(String str, int i, int i2, b bVar) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0329f285cac5358ae5241f5e47994b50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0329f285cac5358ae5241f5e47994b50");
        } else if (str == null) {
            throw new NullPointerException();
        } else {
            i = i < 0 ? 0 : i;
            i2 = i2 < 0 ? 0 : i2;
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = bVar;
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "529748a535e9a20f202cbdc7adfef7b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "529748a535e9a20f202cbdc7adfef7b6");
        }
        if (File.separatorChar == '/') {
            return this.b;
        }
        return this.b.replace('/', File.separatorChar);
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.d;
    }

    public final b d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        boolean z;
        int length;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "375cab4b059c0f79c32e976b8306a6fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "375cab4b059c0f79c32e976b8306a6fb")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.c == aVar.c && this.d == aVar.d) {
                String str = this.b;
                String str2 = aVar.b;
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.dio.utils.f.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1974e5a8bf2ea42a677bf6a9c25df1db", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1974e5a8bf2ea42a677bf6a9c25df1db")).booleanValue();
                } else {
                    if (str != str2) {
                        if (str != null && str2 != null && (length = str.length()) == str2.length()) {
                            if ((str instanceof String) && (str2 instanceof String)) {
                                z = str.equals(str2);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    if (str.charAt(i) == str2.charAt(i)) {
                                    }
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                    z = true;
                }
                if (z) {
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f305300cd05fd0ef69981ce1faedb85", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f305300cd05fd0ef69981ce1faedb85")).intValue() : this.b.hashCode() + this.c + this.d;
    }
}
