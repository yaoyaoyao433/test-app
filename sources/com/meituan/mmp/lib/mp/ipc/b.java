package com.meituan.mmp.lib.mp.ipc;

import android.os.Parcel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.android.meituan.multiprocess.transfer.e {
    public static ChangeQuickRedirect a;

    @Override // com.android.meituan.multiprocess.transfer.e
    public final boolean a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e752147f586b0144b80f603d22bd9e5a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e752147f586b0144b80f603d22bd9e5a")).booleanValue() : obj != null && obj.getClass().isEnum();
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final void a(Object obj, Parcel parcel) {
        Object[] objArr = {obj, parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a36f7ae3e2787a27238cad80a66c1d1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a36f7ae3e2787a27238cad80a66c1d1d");
            return;
        }
        Enum r12 = (Enum) obj;
        parcel.writeString(r12.getDeclaringClass().getName());
        parcel.writeString(r12.name());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.android.meituan.multiprocess.transfer.e
    /* renamed from: b */
    public Enum<?> a(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67b715507302c2bcc0faec57e7714341", RobustBitConfig.DEFAULT_VALUE)) {
            return (Enum) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67b715507302c2bcc0faec57e7714341");
        }
        try {
            return Enum.valueOf(Class.forName(parcel.readString()), parcel.readString());
        } catch (Throwable th) {
            com.meituan.mmp.lib.trace.b.a(th);
            return null;
        }
    }
}
