package com.meituan.android.mrn.monitor;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class f implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    private static f d;
    String b;
    private LinkedList<String> c;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c24591bea49157551532c5ad1e5ccd3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c24591bea49157551532c5ad1e5ccd3f");
            return;
        }
        this.b = null;
        this.c = new LinkedList<>();
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47d772bff2aadce21781db30787e2683", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47d772bff2aadce21781db30787e2683");
        }
        if (d == null) {
            synchronized (f.class) {
                if (d == null) {
                    d = new f();
                }
            }
        }
        return d;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f9ffdece52f8de8cb93cc72b5e49b22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f9ffdece52f8de8cb93cc72b5e49b22");
            return;
        }
        StringBuilder sb = new StringBuilder("create");
        Intent intent = activity.getIntent();
        String str = "";
        try {
            str = intent.getData().toString();
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append("{data=");
            sb.append(str);
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str2 : extras.keySet()) {
                    sb2.append(str2);
                    sb2.append(CommonConstant.Symbol.COLON);
                    sb2.append(extras.get(str2));
                    sb2.append(CommonConstant.Symbol.COMMA);
                }
            }
        } catch (Throwable unused2) {
        }
        String sb3 = sb2.toString();
        if (!TextUtils.isEmpty(sb3)) {
            sb.append("(extras=");
            sb.append(sb3);
            sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(intent.getFlags()));
            sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        }
        a(activity, sb.toString());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88dd64d9edbbe2224815bd206e85cfac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88dd64d9edbbe2224815bd206e85cfac");
        } else {
            a(activity, "start");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c162af181b9de79815684c219b0eaf6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c162af181b9de79815684c219b0eaf6f");
            return;
        }
        this.b = activity.getClass().getName();
        a(activity, "resume");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26a88c05e40aac297d9a1b15dc3229f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26a88c05e40aac297d9a1b15dc3229f");
        } else {
            a(activity, "pause");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65dd9b3d4ba02da08936b6f741025c36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65dd9b3d4ba02da08936b6f741025c36");
        } else {
            a(activity, "stop");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f5e9822e7d137bb745df1749c75689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f5e9822e7d137bb745df1749c75689");
        } else {
            a(activity, "destroy");
        }
    }

    private void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb91f9d79e5509e81b77328f87ecde14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb91f9d79e5509e81b77328f87ecde14");
        } else if (activity != null) {
            a(activity.getClass().getName() + CommonConstant.Symbol.UNDERLINE + str);
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94fc939c2bea6fc27f55325fb01befa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94fc939c2bea6fc27f55325fb01befa7");
            return;
        }
        synchronized (f.class) {
            while (this.c.size() >= 20) {
                this.c.poll();
            }
            this.c.offer(str);
        }
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baa0042c002c93d1dd3e934c9a85f3e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baa0042c002c93d1dd3e934c9a85f3e0");
        }
        StringBuilder sb = new StringBuilder("");
        try {
            synchronized (f.class) {
                for (int size = this.c.size() - 1; size >= 0; size--) {
                    sb.append(this.c.get(size));
                    sb.append("\n");
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
