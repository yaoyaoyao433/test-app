package com.meituan.android.privacy.interfaces.def;

import android.content.Context;
import android.support.annotation.RequiresApi;
import android.telecom.TelecomManager;
import com.meituan.android.privacy.interfaces.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class t extends c implements x {
    public static ChangeQuickRedirect c;
    private TelecomManager d;

    @RequiresApi(api = 21)
    public t(Context context, String str) {
        super(context, str);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c07fbb1422eded1c56ef425f3b038388", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c07fbb1422eded1c56ef425f3b038388");
        } else if (this.a != null) {
            try {
                this.d = (TelecomManager) this.a.getSystemService("telecom");
            } catch (Exception unused) {
            }
        }
    }
}
