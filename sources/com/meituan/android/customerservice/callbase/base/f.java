package com.meituan.android.customerservice.callbase.base;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f implements Serializable, Cloneable {
    public static ChangeQuickRedirect a;
    public short b;
    public String c;
    public byte d;
    public short e;
    public short f;
    public byte g;
    public String h;
    public boolean i;
    private int j;

    public f() {
    }

    public f(String str, byte b, short s, byte b2, short s2) {
        Object[] objArr = {str, Byte.valueOf(b), Short.valueOf(s), Byte.valueOf(b2), Short.valueOf(s2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52651f8b65fe280c5bbebb7d2568b80b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52651f8b65fe280c5bbebb7d2568b80b");
            return;
        }
        this.c = str;
        this.d = b;
        this.e = s;
        this.g = b2;
        this.b = s2;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "615d6fa278000d67678a5926d817f85c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "615d6fa278000d67678a5926d817f85c");
        }
        return "UsersInfo: mber " + this.c + " appId: " + ((int) this.b) + " role: " + ((int) this.d) + " cid: " + ((int) this.f) + " type: " + ((int) this.e) + " status: " + ((int) this.g);
    }

    public final f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed6718dfc86c83a214c4f1a101162a05", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed6718dfc86c83a214c4f1a101162a05");
        }
        try {
            return (f) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fa2a49bc02f0c2dd89e500604ee610e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fa2a49bc02f0c2dd89e500604ee610e") : (f) super.clone();
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ab57b33d12c6e6863fb7cef0dc8e86c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ab57b33d12c6e6863fb7cef0dc8e86c")).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        f fVar = (f) obj;
        if (this.e == 3 || this.e == 2) {
            return TextUtils.equals(this.c, fVar.c);
        }
        return TextUtils.equals(this.c, fVar.c) && this.b == fVar.b;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "679cd1098278942589a97e642c9ae0dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "679cd1098278942589a97e642c9ae0dc")).intValue();
        }
        if (this.e == 3 || this.e == 2) {
            int i = this.j;
            int length = this.c.length();
            if (i == 0 && length > 0) {
                for (int i2 = 0; i2 < length; i2++) {
                    i = (i * 31) + this.c.charAt(i2);
                }
                this.j = i;
            }
            return i;
        }
        return ((this.b + 527) * 31) + ((int) (Long.valueOf(this.c).longValue() ^ (Long.valueOf(this.c).longValue() >>> 32)));
    }
}
