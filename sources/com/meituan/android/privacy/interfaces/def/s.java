package com.meituan.android.privacy.interfaces.def;

import android.content.Context;
import android.support.annotation.RequiresApi;
import android.telephony.SubscriptionManager;
import com.meituan.android.privacy.interfaces.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class s extends c implements w {
    public static ChangeQuickRedirect c;
    private SubscriptionManager d;

    @RequiresApi(api = 22)
    public s(Context context, String str) {
        super(context, str);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09294ffe4692c765a43d796b16f523cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09294ffe4692c765a43d796b16f523cd");
        } else if (this.a != null) {
            try {
                this.d = (SubscriptionManager) this.a.getSystemService("telephony_subscription_service");
            } catch (Exception unused) {
            }
        }
    }
}
