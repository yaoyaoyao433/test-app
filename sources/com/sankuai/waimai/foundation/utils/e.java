package com.sankuai.waimai.foundation.utils;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.Enum;
import java.util.Set;
/* compiled from: ProGuard */
@SuppressLint({"ApplySharedPref"})
/* loaded from: classes4.dex */
public final class e<KeyType extends Enum> {
    public static ChangeQuickRedirect a;
    public final com.meituan.android.cipstorage.q b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(String str, String str2);
    }

    public e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "181267abe533206ef856a4de6640709d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "181267abe533206ef856a4de6640709d");
        } else {
            this.b = com.meituan.android.cipstorage.q.a(com.meituan.android.singleton.b.a, str, 2);
        }
    }

    public final boolean a(KeyType keytype) {
        Object[] objArr = {keytype};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "593b970bf71f4323c9bd0773f920ebe8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "593b970bf71f4323c9bd0773f920ebe8")).booleanValue() : this.b.a(keytype.name());
    }

    public final void a(KeyType keytype, String str) {
        Object[] objArr = {keytype, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4da5c6ca134f13c079bb03e182d4dfb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4da5c6ca134f13c079bb03e182d4dfb5");
        } else {
            this.b.a(keytype.name(), str);
        }
    }

    public final void a(KeyType keytype, boolean z) {
        Object[] objArr = {keytype, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cdc0fc3e716c7613e5669a62d97a113", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cdc0fc3e716c7613e5669a62d97a113");
        } else {
            this.b.a(keytype.name(), z);
        }
    }

    public final void a(KeyType keytype, int i) {
        Object[] objArr = {keytype, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4a4bc39e0373a0cb34bdab56aa9f220", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4a4bc39e0373a0cb34bdab56aa9f220");
        } else {
            this.b.a(keytype.name(), i);
        }
    }

    public final void a(KeyType keytype, double d) {
        Object[] objArr = {keytype, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f567c404ad8e7f31342e1bc09877fce2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f567c404ad8e7f31342e1bc09877fce2");
        } else {
            this.b.a(keytype.name(), Double.doubleToLongBits(d));
        }
    }

    public final void a(KeyType keytype, long j) {
        Object[] objArr = {keytype, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c53b3d24ecf382f51d12703eb775317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c53b3d24ecf382f51d12703eb775317");
        } else {
            this.b.a(keytype.name(), j);
        }
    }

    public final void a(KeyType keytype, Set<String> set) {
        Object[] objArr = {keytype, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f407de770b6557994f2cce5f9082fb1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f407de770b6557994f2cce5f9082fb1b");
        } else {
            this.b.a(keytype.name(), set);
        }
    }

    public final void b(KeyType keytype) {
        Object[] objArr = {keytype};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26eec6cc1763664c6b80452ad660a1ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26eec6cc1763664c6b80452ad660a1ed");
        } else {
            this.b.b(keytype.name());
        }
    }

    public final String b(KeyType keytype, String str) {
        Object[] objArr = {keytype, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7551d6dc1d8819722cc31673d0341cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7551d6dc1d8819722cc31673d0341cf");
        }
        try {
            return this.b.b(keytype.name(), str);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return str;
        }
    }

    public final boolean b(KeyType keytype, boolean z) {
        Object[] objArr = {keytype, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bffe116e5ef449b4bd1361923c6d63b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bffe116e5ef449b4bd1361923c6d63b")).booleanValue();
        }
        try {
            return this.b.b(keytype.name(), z);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return z;
        }
    }

    public final int b(KeyType keytype, int i) {
        Object[] objArr = {keytype, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac87c7930b8f44362371a655d972c536", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac87c7930b8f44362371a655d972c536")).intValue();
        }
        try {
            return this.b.b(keytype.name(), i);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return i;
        }
    }

    public final double b(KeyType keytype, double d) {
        Object[] objArr = {keytype, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd0eabb9429843d39c968f2b05293929", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd0eabb9429843d39c968f2b05293929")).doubleValue();
        }
        try {
            return Double.longBitsToDouble(this.b.b(keytype.name(), Double.doubleToLongBits(d)));
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return d;
        }
    }

    public final long b(KeyType keytype, long j) {
        Object[] objArr = {keytype, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957d53d07016393b60aa604d2e88cdd8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957d53d07016393b60aa604d2e88cdd8")).longValue();
        }
        try {
            return this.b.b(keytype.name(), j);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return j;
        }
    }

    public final Set<String> b(KeyType keytype, Set<String> set) {
        Object[] objArr = {keytype, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04928b24420045e88878377dded615a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04928b24420045e88878377dded615a0");
        }
        try {
            return this.b.b(keytype.name(), set);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return set;
        }
    }
}
