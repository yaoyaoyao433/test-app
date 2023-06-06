package com.meituan.android.edfu.camerainterface.camera;

import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements Comparable<b> {
    public static ChangeQuickRedirect a;
    public final int b;
    public final int c;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(b bVar) {
        b bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "334f0196af9f454b5b0e6f9cd7d504f0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "334f0196af9f454b5b0e6f9cd7d504f0")).intValue() : (this.b * this.c) - (bVar2.b * bVar2.c);
    }

    public b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f7d0b7ae59f82baeafe6fd72ef14610", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f7d0b7ae59f82baeafe6fd72ef14610");
            return;
        }
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cac9bc91769ad533e1cfdb371bc6b16", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cac9bc91769ad533e1cfdb371bc6b16")).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c;
        }
        return false;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fb267c937d021aca723818eafc9951a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fb267c937d021aca723818eafc9951a");
        }
        return this.b + Constants.GestureMoveEvent.KEY_X + this.c;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d11773353b131dab01da1227f4ff200", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d11773353b131dab01da1227f4ff200")).intValue() : this.c ^ ((this.b << 16) | (this.b >>> 16));
    }
}
