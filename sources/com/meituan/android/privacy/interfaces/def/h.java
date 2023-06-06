package com.meituan.android.privacy.interfaces.def;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h implements com.meituan.android.privacy.interfaces.o {
    public static ChangeQuickRedirect a;
    private BluetoothManager b;

    public h(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c79ae8eb7dabdf71dda9aa000ad66d22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c79ae8eb7dabdf71dda9aa000ad66d22");
            return;
        }
        try {
            this.b = (BluetoothManager) context.getSystemService("bluetooth");
        } catch (Exception unused) {
        }
    }
}
