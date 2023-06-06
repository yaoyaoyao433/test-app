package com.sankuai.waimai.touchmatrix.dialog;

import android.content.Context;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.mach.BaseUserManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e extends BaseUserManager {
    public static ChangeQuickRedirect a;
    private static volatile e g;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d576138305688e611abaaa562f743223", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d576138305688e611abaaa562f743223");
            return;
        }
        Context context = com.meituan.android.singleton.b.a;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = BaseUserManager.b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a44de6bdb05bcc204e714ddc47ebf390", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a44de6bdb05bcc204e714ddc47ebf390");
            return;
        }
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = BaseUserManager.b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b0ea12b13383b2d8ddb9eff50a1b448f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b0ea12b13383b2d8ddb9eff50a1b448f");
        } else if (this.f != null) {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this.f);
            this.e = null;
            this.f = null;
        }
        this.e = new IntentFilter("KNB.Channel.Account.BindPhone");
        this.f = new BaseUserManager.BindPhoneBroadcastReceiver(this, null);
        LocalBroadcastManager.getInstance(context).registerReceiver(this.f, this.e);
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c10fa51c19710009ce891154975846d", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c10fa51c19710009ce891154975846d");
        }
        if (g == null) {
            synchronized (e.class) {
                if (g == null) {
                    g = new e();
                }
            }
        }
        return g;
    }
}
