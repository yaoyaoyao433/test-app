package com.meituan.msc.common.process.ipc;

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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f19431cdaa3913f1722931028ae07d2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f19431cdaa3913f1722931028ae07d2")).booleanValue() : obj != null && obj.getClass().isEnum();
    }

    @Override // com.android.meituan.multiprocess.transfer.e
    public final void a(Object obj, Parcel parcel) {
        Object[] objArr = {obj, parcel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1abfc319cd842d523077d5c55d04f29e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1abfc319cd842d523077d5c55d04f29e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "131d597baf9b97617f31e5b3744c8d02", RobustBitConfig.DEFAULT_VALUE)) {
            return (Enum) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "131d597baf9b97617f31e5b3744c8d02");
        }
        try {
            return Enum.valueOf(Class.forName(parcel.readString()), parcel.readString());
        } catch (Throwable th) {
            com.meituan.msc.modules.reporter.g.a(th);
            return null;
        }
    }
}
