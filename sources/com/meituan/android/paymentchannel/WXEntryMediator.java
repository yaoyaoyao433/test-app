package com.meituan.android.paymentchannel;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WXEntryMediator {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile WXEntryMediator e;
    public a b;
    public Activity c;
    public WXEntryResultBroadcast d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(int i);
    }

    public static WXEntryMediator a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88607592389f42b78c0798bcf3916c94", RobustBitConfig.DEFAULT_VALUE)) {
            return (WXEntryMediator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88607592389f42b78c0798bcf3916c94");
        }
        if (e == null) {
            synchronized (WXEntryMediator.class) {
                if (e == null) {
                    e = new WXEntryMediator();
                }
            }
        }
        return e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class WXEntryResultBroadcast extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        public a b;

        public WXEntryResultBroadcast(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2553cf84332eaaad54ecbcadb5eaa33f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2553cf84332eaaad54ecbcadb5eaa33f");
            } else {
                this.b = aVar;
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "993af5eaab1f9e42e6d25c7e76d81546", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "993af5eaab1f9e42e6d25c7e76d81546");
                return;
            }
            int a2 = f.a(intent, "extra_code", -3);
            if (this.b != null) {
                this.b.a(a2);
            }
        }
    }
}
