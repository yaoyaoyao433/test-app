package com.meituan.android.privacy.proxy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.telephony.SubscriptionManager;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@RequiresApi(api = 22)
@SuppressLint({"MissingPermission"})
/* loaded from: classes3.dex */
public final class s implements com.meituan.android.privacy.interfaces.w {
    public static ChangeQuickRedirect a;
    private Context b;
    private SubscriptionManager c;
    private u d;
    private String e;

    public s(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59ee66c05e11f7484b6fee9a82860f1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59ee66c05e11f7484b6fee9a82860f1e");
            return;
        }
        this.e = str;
        this.b = context;
        this.d = new u();
        if (context != null) {
            try {
                this.c = (SubscriptionManager) context.getApplicationContext().getSystemService("telephony_subscription_service");
            } catch (Exception e) {
                Log.e("MtSubscriptionMgrImpl", e.toString());
            }
        }
    }
}
