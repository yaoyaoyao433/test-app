package com.meituan.android.privacy.proxy;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h implements com.meituan.android.privacy.interfaces.o {
    public static ChangeQuickRedirect a;
    private BluetoothManager b;
    private final u c;

    public h(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8de37d56944d7176203ebed0e75f389e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8de37d56944d7176203ebed0e75f389e");
            return;
        }
        this.c = new u();
        try {
            this.b = (BluetoothManager) context.getApplicationContext().getSystemService("bluetooth");
        } catch (Exception e) {
            Log.e("MtBluetoothMgrImpl2", e.toString());
        }
    }
}
