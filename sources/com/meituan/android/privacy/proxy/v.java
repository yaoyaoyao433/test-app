package com.meituan.android.privacy.proxy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.telecom.TelecomManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class v implements com.meituan.android.privacy.interfaces.x {
    public static ChangeQuickRedirect a;
    private String b;
    private TelecomManager c;
    private u d;

    @RequiresApi(api = 21)
    public v(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "815525c8a8535f748c0bdcb8dc9d36ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "815525c8a8535f748c0bdcb8dc9d36ff");
            return;
        }
        this.b = str;
        this.d = new u();
        try {
            this.c = (TelecomManager) context.getApplicationContext().getSystemService("telecom");
        } catch (Exception unused) {
        }
    }
}
