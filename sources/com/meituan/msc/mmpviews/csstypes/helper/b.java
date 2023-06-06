package com.meituan.msc.mmpviews.csstypes.helper;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b {
    public static ChangeQuickRedirect d;
    private int a;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e1ca59a9315c78bfb115ac7ed138cd1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e1ca59a9315c78bfb115ac7ed138cd1");
        } else {
            this.a = 0;
        }
    }

    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3838e2b2c2337e399d9d4e9082c593bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3838e2b2c2337e399d9d4e9082c593bd")).booleanValue();
        }
        int i2 = 1 << i;
        return (this.a & i2) == i2;
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a22ad82d0b39bab9978de8f16164c3e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a22ad82d0b39bab9978de8f16164c3e0");
        } else {
            a(i, true);
        }
    }

    private void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d706a5847125bd36d7161cae2cf7c046", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d706a5847125bd36d7161cae2cf7c046");
        } else {
            this.a = (1 << i) | this.a;
        }
    }
}
