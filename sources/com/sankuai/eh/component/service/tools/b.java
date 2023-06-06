package com.sankuai.eh.component.service.tools;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements Application.ActivityLifecycleCallbacks {
    public static ChangeQuickRedirect a;
    public boolean b;
    public long c;
    public Map<String, Object> d;
    public Stack<String> e;
    public Stack<WeakReference<a>> f;
    private boolean g;
    private C0549b h;
    private C0549b i;
    private int j;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();
    }

    @Deprecated
    public static String d() {
        return "false";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beebbfc8d74f83e4ba558ac5df36ff0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beebbfc8d74f83e4ba558ac5df36ff0f");
            return;
        }
        this.g = false;
        this.e = new Stack<>();
        this.f = new Stack<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        private static final b a = new b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f568213d788d2a04da45d81d68dea0d8", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f568213d788d2a04da45d81d68dea0d8") : c.a;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0151f827f4d0937f09b5810a7631e4c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0151f827f4d0937f09b5810a7631e4c3");
        } else if (this.g || com.sankuai.eh.component.service.a.b() == null) {
        } else {
            ((Application) com.sankuai.eh.component.service.a.b().getApplicationContext()).registerActivityLifecycleCallbacks(this);
            com.sankuai.meituan.Lifecycle.b.a().a(new com.sankuai.meituan.Lifecycle.d() { // from class: com.sankuai.eh.component.service.tools.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.Lifecycle.d
                public final void applicationEnterForeground() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc6977ec46031b20ac7e5f99e46497ed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc6977ec46031b20ac7e5f99e46497ed");
                        return;
                    }
                    try {
                        d.b("进入前台");
                        b.this.c = System.currentTimeMillis();
                        b.this.b = false;
                        if (b.this.f.size() <= 0 || b.this.f.peek() == null || b.this.f.peek().get() == null) {
                            return;
                        }
                        b.this.f.peek().get().a();
                    } catch (Exception e) {
                        d.a(e);
                    }
                }

                @Override // com.sankuai.meituan.Lifecycle.d
                public final void applicationEnterBackground() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c489b985e7363a6e7d76e22ff125fb1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c489b985e7363a6e7d76e22ff125fb1");
                        return;
                    }
                    try {
                        d.b("进入后台");
                        b.this.b = true;
                        if (b.this.f.size() <= 0 || b.this.f.peek() == null || b.this.f.peek().get() == null) {
                            return;
                        }
                        b.this.f.peek().get().b();
                    } catch (Exception e) {
                        d.a(e);
                    }
                }
            });
            this.g = true;
        }
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fbb408be7b3cc9b3f52f8e185d35616", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fbb408be7b3cc9b3f52f8e185d35616");
        }
        if (this.g) {
            return this.i != null ? this.i.a() : "com.meituan.android.pt.homepage.activity.MainActivity";
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a22cba0ec28d9d3b2a5b8807b4d18398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a22cba0ec28d9d3b2a5b8807b4d18398");
            return;
        }
        C0549b a2 = a(activity);
        this.h = this.i;
        if (this.i == null || !this.i.b) {
            return;
        }
        Object[] objArr2 = {a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "154dc59c9ab14d087ca0effa75d54700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "154dc59c9ab14d087ca0effa75d54700");
            return;
        }
        try {
            d.a("eh_pageTo", new d.b().a("name", "ehc.page.to").a(RemoteMessageConst.TO, a2.a()).a(this.d).b);
        } catch (Exception e) {
            d.a(e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4015b468bdf5588d5a66055f5e036471", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4015b468bdf5588d5a66055f5e036471");
        } else {
            this.j++;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2bd1999817bcb08c4f3750f01e8fc97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2bd1999817bcb08c4f3750f01e8fc97");
        } else {
            this.i = a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "703ea97e2996afae85bbffdf1830ea1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "703ea97e2996afae85bbffdf1830ea1c");
        } else if (this.j != 0) {
            this.j--;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce6001e961fb81932ade76b45eadfb1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce6001e961fb81932ade76b45eadfb1f");
        } else if (this.j > 1) {
            this.j = 0;
            this.e.clear();
        } else if (this.e.isEmpty()) {
        } else {
            this.e.pop();
        }
    }

    private C0549b a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95e51bb0e0b6db3b867f80c8e84e8a6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0549b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95e51bb0e0b6db3b867f80c8e84e8a6e");
        }
        try {
            Intent intent = activity.getIntent();
            String name = activity.getClass().getName();
            return new C0549b(name, com.sankuai.eh.component.service.utils.e.c(intent.getData() != null ? intent.getData().toString() : ""), "com.sankuai.eh.framework.EHContainerActivity".equals(name));
        } catch (Exception unused) {
            return new C0549b(null, null, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.component.service.tools.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0549b {
        public static ChangeQuickRedirect a;
        boolean b;
        private String c;
        private String d;

        public C0549b(String str, String str2, boolean z) {
            Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ad2a2d440f18a73b512ed6859928a68", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ad2a2d440f18a73b512ed6859928a68");
                return;
            }
            this.c = str;
            this.d = str2;
            this.b = z;
        }

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e6c9cbf78a5048ce1bb7248085866a4", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e6c9cbf78a5048ce1bb7248085866a4");
            }
            if (!TextUtils.isEmpty(this.d)) {
                return com.sankuai.eh.component.service.utils.e.a(this.d);
            }
            return this.c;
        }
    }
}
