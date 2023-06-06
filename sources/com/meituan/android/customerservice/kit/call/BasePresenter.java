package com.meituan.android.customerservice.kit.call;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BasePresenter {
    public static ChangeQuickRedirect n;
    protected final int o;

    public BasePresenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a50b3605b0e248c543e2c59743ee3bcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a50b3605b0e248c543e2c59743ee3bcc");
        } else {
            this.o = 2000;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class NetworkChangedReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "579e772b653172373c8cc9f44e5636a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "579e772b653172373c8cc9f44e5636a2");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            action.equals("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }
}
