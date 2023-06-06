package com.meituan.android.privacy.locate.lifecycle;

import android.annotation.TargetApi;
import android.app.FragmentManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.meituan.android.common.locate.MasterLocator;
import com.meituan.android.privacy.locate.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements Handler.Callback {
    public static ChangeQuickRedirect a;
    private static final d d = new d();
    public final Map<FragmentManager, RequestManagerFragment> b;
    public final Map<android.support.v4.app.FragmentManager, SupportRequestManagerFragment> c;
    private final Handler e;

    public static d a() {
        return d;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9db8833379002a9634442fb034341472", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9db8833379002a9634442fb034341472");
            return;
        }
        this.b = new HashMap();
        this.c = new HashMap();
        this.e = new Handler(Looper.getMainLooper(), this);
    }

    @TargetApi(17)
    public final RequestManagerFragment a(FragmentManager fragmentManager) {
        Object[] objArr = {fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3744a069585e5936ec5595e12d5e9074", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestManagerFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3744a069585e5936ec5595e12d5e9074");
        }
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.meituan.android.privacy.manager");
        if (requestManagerFragment == null) {
            RequestManagerFragment requestManagerFragment2 = this.b.get(fragmentManager);
            if (requestManagerFragment2 == null) {
                RequestManagerFragment requestManagerFragment3 = new RequestManagerFragment();
                this.b.put(fragmentManager, requestManagerFragment3);
                fragmentManager.beginTransaction().add(requestManagerFragment3, "com.meituan.android.privacy.manager").commitAllowingStateLoss();
                this.e.obtainMessage(1, fragmentManager).sendToTarget();
                return requestManagerFragment3;
            }
            return requestManagerFragment2;
        }
        return requestManagerFragment;
    }

    @TargetApi(11)
    public final g a(Context context, FragmentManager fragmentManager, String str, MasterLocator masterLocator) {
        Object[] objArr = {context, fragmentManager, str, masterLocator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f07e49833166b34b99daa7ff4e1b0ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f07e49833166b34b99daa7ff4e1b0ef");
        }
        RequestManagerFragment a2 = a(fragmentManager);
        g gVar = new g(str, masterLocator, a2.b);
        a2.a(gVar);
        return gVar;
    }

    public final SupportRequestManagerFragment a(android.support.v4.app.FragmentManager fragmentManager) {
        Object[] objArr = {fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb3d2b12b171ee0b31a9eac88fdab105", RobustBitConfig.DEFAULT_VALUE)) {
            return (SupportRequestManagerFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb3d2b12b171ee0b31a9eac88fdab105");
        }
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.findFragmentByTag("com.meituan.android.privacy.manager");
        if (supportRequestManagerFragment == null) {
            SupportRequestManagerFragment supportRequestManagerFragment2 = this.c.get(fragmentManager);
            if (supportRequestManagerFragment2 == null) {
                SupportRequestManagerFragment supportRequestManagerFragment3 = new SupportRequestManagerFragment();
                this.c.put(fragmentManager, supportRequestManagerFragment3);
                fragmentManager.beginTransaction().add(supportRequestManagerFragment3, "com.meituan.android.privacy.manager").commitAllowingStateLoss();
                this.e.obtainMessage(2, fragmentManager).sendToTarget();
                return supportRequestManagerFragment3;
            }
            return supportRequestManagerFragment2;
        }
        return supportRequestManagerFragment;
    }

    public final g a(Context context, android.support.v4.app.FragmentManager fragmentManager, String str, MasterLocator masterLocator) {
        Object[] objArr = {context, fragmentManager, str, masterLocator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "226a560de964d2238259545edc2919c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "226a560de964d2238259545edc2919c3");
        }
        SupportRequestManagerFragment a2 = a(fragmentManager);
        g gVar = new g(str, masterLocator, a2.b);
        a2.a(gVar);
        return gVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentCallbacks remove;
        boolean z = true;
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fa900513fd1ddae7e16363ea8250ab9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fa900513fd1ddae7e16363ea8250ab9")).booleanValue();
        }
        Object obj = null;
        switch (message.what) {
            case 1:
                obj = (FragmentManager) message.obj;
                remove = this.b.remove(obj);
                break;
            case 2:
                obj = (android.support.v4.app.FragmentManager) message.obj;
                remove = this.c.remove(obj);
                break;
            default:
                remove = null;
                z = false;
                break;
        }
        if (z && remove == null && Log.isLoggable("RMRetriever", 5)) {
            new StringBuilder("Failed to remove expected request manager fragment, manager: ").append(obj);
        }
        return z;
    }
}
