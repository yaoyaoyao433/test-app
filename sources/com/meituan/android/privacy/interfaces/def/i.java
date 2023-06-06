package com.meituan.android.privacy.interfaces.def;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i extends c implements com.meituan.android.privacy.interfaces.n {
    public static ChangeQuickRedirect c;
    private BluetoothManager d;

    public i(Context context, String str) {
        super(context, str);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "615ecea0b0947ec22666005bd0290d56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "615ecea0b0947ec22666005bd0290d56");
        } else if (this.a != null) {
            try {
                this.d = (BluetoothManager) this.a.getSystemService("bluetooth");
            } catch (Exception unused) {
            }
        }
    }
}
