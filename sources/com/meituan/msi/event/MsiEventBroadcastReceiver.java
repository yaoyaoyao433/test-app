package com.meituan.msi.event;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MsiEventBroadcastReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20cbcff81542eded874674f10dc669b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20cbcff81542eded874674f10dc669b5");
            return;
        }
        String action = intent.getAction();
        com.meituan.msi.log.a.a("MsiEvent MsiEventBroadcastReceiver onReceive " + action);
        if (!a.b.equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        if (TextUtils.equals(a(extras, "from", ""), ProcessUtils.getCurrentProcessName(com.meituan.msi.a.f()))) {
            com.meituan.msi.log.a.a("MsiEvent MsiEventBroadcastReceiver onReceive local process");
            return;
        }
        final String a2 = a(extras, "eventName", "");
        final String a3 = a(extras, "eventScope", "");
        final String a4 = a(extras, "eventData", "");
        final String a5 = a(extras, "fromModule", "");
        final a a6 = a.a();
        Object[] objArr2 = {a2, a3, a4, a5};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, a6, changeQuickRedirect2, false, "158be691a9b8cb2bf046050420422a31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a6, changeQuickRedirect2, false, "158be691a9b8cb2bf046050420422a31");
        } else {
            a6.e.submit(new Runnable() { // from class: com.meituan.msi.event.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fdb13a95ee3881d88852e6b47aabe791", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fdb13a95ee3881d88852e6b47aabe791");
                    } else {
                        a.a(a6, a2, a3, a4, a5);
                    }
                }
            });
        }
    }

    private String a(Bundle bundle, String str, String str2) {
        Object[] objArr = {bundle, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fd2715e5ce238682511bf204f5dd785", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fd2715e5ce238682511bf204f5dd785") : (bundle != null && bundle.containsKey(str)) ? bundle.getString(str) : str2;
    }
}
