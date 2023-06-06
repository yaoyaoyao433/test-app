package com.sankuai.waimai.mach.manager_new.ioq;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j {
    public static ChangeQuickRedirect a;
    public BundleInfo b;
    Bundle c;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d1aa63624b1641a68fd2d4cb9de8a3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d1aa63624b1641a68fd2d4cb9de8a3e");
        } else {
            this.c = new Bundle();
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dc4fb6b275e1c16f1f4074a64f4c389", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dc4fb6b275e1c16f1f4074a64f4c389") : this.b != null ? com.sankuai.waimai.mach.manager_new.common.a.b(this.b) : "";
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1de4dde3dfcb887fb3cbe57a56f0ead2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1de4dde3dfcb887fb3cbe57a56f0ead2") : this.c.getString(str, "");
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04b5da30f662d4baa4d3ae7791542c06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04b5da30f662d4baa4d3ae7791542c06");
        } else {
            this.c.putInt(str, i);
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6102070bf3171a93ca34be10f814f6e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6102070bf3171a93ca34be10f814f6e8");
        } else {
            this.c.putString(str, str2);
        }
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8a26046e5125360b173420089f1f6f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8a26046e5125360b173420089f1f6f7");
        } else {
            this.c.putBoolean(str, z);
        }
    }

    public final boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f99e256bacf2bddbe00ad98c8d1504a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f99e256bacf2bddbe00ad98c8d1504a")).booleanValue() : this.c.getBoolean(str, false);
    }
}
