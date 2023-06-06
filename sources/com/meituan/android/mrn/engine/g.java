package com.meituan.android.mrn.engine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class g implements Serializable {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public long e;
    public long f;
    public long g;

    public static g a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb80672f5c6118dcdff95f848214b3fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb80672f5c6118dcdff95f848214b3fe");
        }
        g gVar = new g();
        gVar.b = eVar.c;
        gVar.c = eVar.e;
        gVar.d = eVar.f;
        gVar.e = System.currentTimeMillis();
        return gVar;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf9b4bf7c33525b9db3b0758366f48b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf9b4bf7c33525b9db3b0758366f48b");
        }
        return "MRNBundleStorageInfo{name='" + this.b + "', biz='" + this.c + "', version='" + this.d + "', lastActiveTime=" + this.e + ", downloadTime=" + this.f + ", size=" + this.g + '}';
    }
}
