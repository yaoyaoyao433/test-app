package com.meituan.android.pay.jshandler.mediator;

import android.annotation.SuppressLint;
import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile a b;
    private static HashMap<Activity, InterfaceC0326a> c = new HashMap<>();

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.pay.jshandler.mediator.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0326a {
        void a();

        void a(String str);

        void a(String str, String str2, String str3, String str4);

        void b();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "722c1dd14828b82c1c29cc4150deb764", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "722c1dd14828b82c1c29cc4150deb764");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public final void a(Activity activity, InterfaceC0326a interfaceC0326a) {
        Object[] objArr = {activity, interfaceC0326a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2539aefc256e96435095d50c583d5216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2539aefc256e96435095d50c583d5216");
        } else {
            c.put(activity, interfaceC0326a);
        }
    }

    public final InterfaceC0326a a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1312eb70d768abb73c24870270c78bd", RobustBitConfig.DEFAULT_VALUE) ? (InterfaceC0326a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1312eb70d768abb73c24870270c78bd") : c.get(activity);
    }

    public final void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa1afda2f4b9f5dbd7940a323651e994", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa1afda2f4b9f5dbd7940a323651e994");
        } else if (c.containsKey(activity)) {
            c.remove(activity);
        }
    }
}
