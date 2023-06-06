package com.meituan.android.privacy.impl.permission;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.UiThread;
import android.text.TextUtils;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.android.privacy.impl.config.k;
import com.meituan.android.privacy.impl.permission.a;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.aa;
import com.meituan.android.privacy.interfaces.def.permission.Sys;
import com.meituan.android.privacy.interfaces.def.permission.j;
import com.meituan.android.privacy.interfaces.def.permission.l;
import com.meituan.android.privacy.interfaces.def.permission.ui.PermissionResultFrg;
import com.meituan.android.privacy.interfaces.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.permissionner.Permissionner;
import com.tencent.open.SocialConstants;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d implements com.meituan.android.privacy.interfaces.def.permission.d, com.meituan.android.privacy.interfaces.e {
    public static ChangeQuickRedirect a;
    private static volatile d f;
    PermissionGuard b;
    Sys c;
    public boolean d;
    boolean e;
    @GuardedBy("this")
    private final Map<Activity, com.meituan.android.privacy.interfaces.def.permission.b> g;

    public static /* synthetic */ void a(d dVar, WeakReference weakReference, String str, String str2, com.meituan.android.privacy.interfaces.d dVar2) {
        Object[] objArr = {weakReference, str, str2, dVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "b1218c096483ddcd3cdca7bb5569300b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "b1218c096483ddcd3cdca7bb5569300b");
            return;
        }
        com.meituan.android.privacy.interfaces.monitor.d dVar3 = new com.meituan.android.privacy.interfaces.monitor.d();
        dVar3.b = SocialConstants.TYPE_REQUEST;
        dVar3.d = str;
        dVar3.c = str2;
        com.meituan.android.privacy.interfaces.d a2 = dVar.a(dVar2, dVar3);
        Object[] objArr2 = {str2, str, null};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.privacy.aop.f.a;
        com.meituan.android.privacy.interfaces.config.c a3 = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1bf540182e4b2a0b9d0cc986c613c32f", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.privacy.interfaces.config.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1bf540182e4b2a0b9d0cc986c613c32f") : k.a.a.a(str2, str, null);
        com.meituan.android.privacy.interfaces.def.permission.a permission = dVar.b.getPermission(str);
        int a4 = dVar.a((Context) weakReference.get(), str, str2, true, dVar3);
        Activity activity = (Activity) weakReference.get();
        if (activity == null) {
            dVar.a(str2, str, a2, -17, -1);
            return;
        }
        if (a4 != -4) {
            switch (a4) {
                case -7:
                    break;
                case -6:
                    if (a3.c()) {
                        dVar.a(str2, str, a2, -15, -1);
                        return;
                    } else if (activity != null) {
                        dVar.a(activity, str, str2, a2, "app");
                        return;
                    } else {
                        return;
                    }
                default:
                    dVar.a(str2, str, a2, a4, -1);
                    return;
            }
        }
        if (a3.c()) {
            dVar.a(str2, str, a2, -15, -1);
            return;
        }
        a.C0351a a5 = a.a(activity).a(str2);
        if (a5.a(a3.k, permission)) {
            a5.a(permission.f(), (Integer) null);
            com.meituan.android.privacy.impl.config.d b = dVar.b((Context) activity);
            if (b == null) {
                dVar.a(str2, str, a2, -11, -1);
                return;
            }
            com.meituan.android.privacy.interfaces.config.a a6 = b.a(str);
            if (permission.b() == null && a6.b) {
                a.C0351a b2 = a.a(activity).b(str);
                if (b2.a(a6.c, permission)) {
                    b2.a(str, (Integer) null);
                    dVar.a(activity, str, str2, a2, PermissionGuard.DIALOG_TYPE_APP_SYS);
                    return;
                }
                dVar.a(str2, str, a2, -3, -1);
                return;
            }
            dVar.a(activity, str, str2, a2, "sys");
            return;
        }
        dVar.a(str2, str, a2, -3, -1);
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "767fe37b07dfdd81660762d220aa5e05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "767fe37b07dfdd81660762d220aa5e05");
            return;
        }
        this.g = new WeakHashMap();
        this.d = true;
        this.e = false;
        this.b = PermissionGuard.a.a;
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa31c97d96e0e238e407db130f2f8124", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa31c97d96e0e238e407db130f2f8124");
        }
        if (f == null) {
            synchronized (d.class) {
                if (f == null) {
                    f = new d();
                }
            }
        }
        return f;
    }

    @Override // com.meituan.android.privacy.interfaces.e
    public final int a(@Nullable Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e23789c8e89427b04fb62341aea198b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e23789c8e89427b04fb62341aea198b")).intValue() : a(context, str, str2, false);
    }

    @Override // com.meituan.android.privacy.interfaces.e
    public final int a(@Nullable Context context, String str, String str2, boolean z) {
        Object[] objArr = {context, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0105d7247bb9dff9ad0e2722cbb4689e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0105d7247bb9dff9ad0e2722cbb4689e")).intValue();
        }
        com.meituan.android.privacy.interfaces.monitor.d dVar = new com.meituan.android.privacy.interfaces.monitor.d();
        dVar.d = str;
        dVar.c = str2;
        dVar.b = PayLabelConstants.KEY_LABEL_CHECK;
        dVar.n = z;
        this.b.getContext(context);
        try {
            int a2 = a(context, str, a(str2), false, dVar);
            dVar.e = a2;
            return a2;
        } finally {
            com.meituan.android.privacy.impl.b.a(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(@Nullable Context context, String str, @NonNull String str2, boolean z, com.meituan.android.privacy.interfaces.monitor.d dVar) {
        Object[] objArr = {context, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7573beeeb2ada61aa8f212718d2d167e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7573beeeb2ada61aa8f212718d2d167e")).intValue();
        }
        Context context2 = this.b.getContext(context);
        com.meituan.android.privacy.impl.config.d b = b(context2);
        if (b == null) {
            return -11;
        }
        if (b.g) {
            return -19;
        }
        if (this.e) {
            com.meituan.android.privacy.interfaces.def.permission.a permission = this.b.getPermission(str);
            if (permission == null) {
                return -8;
            }
            Set<String> set = this.b.buHasPermissions;
            if (set.contains(str2 + CommonConstant.Symbol.MINUS + str)) {
                return 1;
            }
            com.meituan.android.privacy.impl.config.f a2 = b.a(str2, true);
            com.meituan.android.privacy.interfaces.config.c a3 = b.a(a2, permission.c(), null);
            if (a3.b) {
                if (!(permission instanceof j) || ((j) permission).h()) {
                    if (PermissionGuard.BUSINESS_CHECK_ONLY.equals(str2)) {
                        return permission.a(a3.l) ? -13 : -14;
                    }
                    int a4 = a(a2, permission, str2, false, dVar);
                    if (a4 <= 0) {
                        if (z) {
                            b.b();
                            a4 = a(b.a(str2, true), permission, str2, true, dVar);
                        }
                        if (a4 <= 0) {
                            return a4;
                        }
                    }
                    if (a4 != 3 && a3.f) {
                        a.C0351a a5 = a.a(context2).a(str2);
                        if (!a5.a(permission)) {
                            return a5.a(a3.k, permission) ? -6 : -3;
                        }
                    }
                    if (permission.b() == null) {
                        com.meituan.android.privacy.interfaces.config.a a6 = b.a(str);
                        if (a6.b) {
                            a.C0351a b2 = a.a(context2).b(str);
                            if (!b2.a(permission)) {
                                return b2.a(a6.c, permission) ? -7 : -4;
                            }
                        }
                        return a4;
                    } else if (permission.a(a3.l)) {
                        return a4;
                    } else {
                        if (a4 == 3) {
                            return -3;
                        }
                        return permission.g() ? -7 : -4;
                    }
                }
                return -16;
            }
            return -1;
        }
        return -11;
    }

    private int a(@Nullable com.meituan.android.privacy.impl.config.f fVar, com.meituan.android.privacy.interfaces.def.permission.a aVar, String str, boolean z, com.meituan.android.privacy.interfaces.monitor.d dVar) {
        int i;
        int i2;
        boolean z2;
        char c = 0;
        int i3 = 1;
        int i4 = 2;
        Object[] objArr = {fVar, aVar, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aef9d8656c93941b5bf1f2232cebe41", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aef9d8656c93941b5bf1f2232cebe41")).intValue();
        }
        if (fVar == null) {
            if (aVar.e()) {
                i = z ? -2 : -12;
            } else {
                i = 3;
            }
            dVar.r = false;
        } else {
            String[] strArr = {aVar.c(), aVar.d()};
            int i5 = 0;
            i = -1;
            while (i5 < i4) {
                String str2 = strArr[i5];
                if (!TextUtils.isEmpty(str2)) {
                    Object[] objArr2 = new Object[i3];
                    objArr2[c] = str2;
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.privacy.impl.config.f.a;
                    if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "8458e6ecc0767744f6a1b60a0a6b338c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "8458e6ecc0767744f6a1b60a0a6b338c")).booleanValue() : fVar.b.containsKey(str2)) {
                        z2 = true;
                        i2 = 2;
                    } else {
                        i2 = -18;
                        z2 = true;
                    }
                    dVar.r = z2;
                    if (i2 > 0) {
                        return i2;
                    }
                    i = i2;
                }
                i5++;
                i4 = 2;
                c = 0;
                i3 = 1;
            }
        }
        return i;
    }

    @Override // com.meituan.android.privacy.interfaces.e
    public final void a(@Nullable final Context context, final String str, String str2, @NonNull final com.meituan.android.privacy.interfaces.d dVar) {
        Object[] objArr = {context, str, str2, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c8edcb0b8f15059581cc43507281364", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c8edcb0b8f15059581cc43507281364");
            return;
        }
        final com.meituan.android.privacy.interfaces.monitor.d dVar2 = new com.meituan.android.privacy.interfaces.monitor.d();
        dVar2.d = str;
        dVar2.c = str2;
        dVar2.b = "checkAsync";
        this.b.getContext(context);
        final String a2 = a(str2);
        com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.meituan.android.privacy.impl.permission.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f880772e833e4883d546b667880d65d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f880772e833e4883d546b667880d65d5");
                } else {
                    d.this.a(a2, str, d.this.a(dVar, dVar2), d.this.a(context, str, a2, true, dVar2), -1);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.meituan.android.privacy.interfaces.d a(com.meituan.android.privacy.interfaces.d dVar, com.meituan.android.privacy.interfaces.monitor.d dVar2) {
        Object[] objArr = {dVar, dVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c44cd6e515f696649553c717fe2e48d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.privacy.interfaces.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c44cd6e515f696649553c717fe2e48d2");
        }
        if (dVar instanceof g) {
            return new f(dVar, dVar2);
        }
        return new e(dVar, dVar2);
    }

    @Override // com.meituan.android.privacy.interfaces.e
    public final void a(@NonNull Activity activity, final String str, String str2, final com.meituan.android.privacy.interfaces.d dVar) {
        Object[] objArr = {activity, str, str2, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82d382c6a1fabfa11382cfcb5a3e624b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82d382c6a1fabfa11382cfcb5a3e624b");
            return;
        }
        this.b.getContext(activity);
        final String a2 = a(str2);
        final WeakReference weakReference = new WeakReference(activity);
        com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.meituan.android.privacy.impl.permission.d.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef1b529fbfc7e3c922d6e0bf75d86191", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef1b529fbfc7e3c922d6e0bf75d86191");
                } else {
                    d.a(d.this, weakReference, str, a2, dVar);
                }
            }
        });
    }

    @Nullable
    private com.meituan.android.privacy.impl.config.d b(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a2f43dd9182515fbfa679ce03228bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.privacy.impl.config.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a2f43dd9182515fbfa679ce03228bd");
        }
        Context context2 = this.b.getContext(context);
        if (context2 == null) {
            return null;
        }
        return com.meituan.android.privacy.impl.config.d.a(context2);
    }

    @Override // com.meituan.android.privacy.interfaces.e
    public final void a(@NonNull Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66b9801a207bbd92fab05781f9d2bd8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66b9801a207bbd92fab05781f9d2bd8d");
            return;
        }
        com.meituan.android.privacy.impl.config.d b = b(context);
        if (b != null) {
            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.privacy.impl.config.d.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "ed46c5639f398033c60f4a36560c6710", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "ed46c5639f398033c60f4a36560c6710");
                return;
            }
            b.d.a("is_privacy_mode", z);
            if (b.g != z) {
                b.g = z;
                b.a(z);
            }
        }
    }

    @Override // com.meituan.android.privacy.interfaces.e
    public final boolean a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b551e2ef3d1ce4f70a6b47c4ffd541f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b551e2ef3d1ce4f70a6b47c4ffd541f")).booleanValue();
        }
        com.meituan.android.privacy.impl.config.d b = b(context);
        if (b != null) {
            return b.g;
        }
        return false;
    }

    @Override // com.meituan.android.privacy.interfaces.e
    public final boolean a(@NonNull Context context, @NonNull aa aaVar) {
        Object[] objArr = {context, aaVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70f69f785db23309dfbfea7562751091", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70f69f785db23309dfbfea7562751091")).booleanValue();
        }
        com.meituan.android.privacy.impl.config.d b = b(context);
        if (b != null) {
            return b.a(aaVar);
        }
        return false;
    }

    @Override // com.meituan.android.privacy.interfaces.e
    public final void a(@NonNull String str, @NonNull com.meituan.android.privacy.interfaces.d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a3eb66fc38cec00ef8b315c8e780855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a3eb66fc38cec00ef8b315c8e780855");
        } else {
            this.b.registerGrantListener(str, dVar);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.d
    public final void a(String str, final String str2, @NonNull final com.meituan.android.privacy.interfaces.d dVar, final int i, int i2) {
        com.meituan.android.privacy.interfaces.monitor.d dVar2;
        Object[] objArr = {str, str2, dVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ab0559f403d251df416516c2a31787c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ab0559f403d251df416516c2a31787c");
            return;
        }
        if (i == 2) {
            Set<String> set = this.b.buHasPermissions;
            set.add(str + CommonConstant.Symbol.MINUS + str2);
        }
        if (i2 >= 0 && (dVar instanceof e) && (dVar2 = ((e) dVar).b) != null) {
            String str3 = i > 0 ? "Granted" : "Denied";
            if (i2 == 0) {
                str3 = "NotShown";
            }
            dVar2.j = str3;
        }
        if ((dVar instanceof g) && Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.b.mMainHandler.post(new Runnable() { // from class: com.meituan.android.privacy.impl.permission.d.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21ed22d0ad4ccdeb0ce5aa20bf9ed8cb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21ed22d0ad4ccdeb0ce5aa20bf9ed8cb");
                    } else {
                        dVar.onResult(str2, i);
                    }
                }
            });
        } else {
            dVar.onResult(str2, i);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.d
    @UiThread
    public final void a(@Nullable Activity activity, String str, String str2, @NonNull com.meituan.android.privacy.interfaces.d dVar, int i, int i2) {
        Object[] objArr = {activity, str, str2, dVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e684d54f190273285d04596a99c522d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e684d54f190273285d04596a99c522d8");
            return;
        }
        com.meituan.android.privacy.interfaces.def.permission.b bVar = this.g.get(activity);
        if (bVar == null) {
            return;
        }
        bVar.a(i, i2);
    }

    @UiThread
    @Nullable
    public final synchronized com.meituan.android.privacy.interfaces.def.permission.b a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2704ee81daab8f0bda0fdc4117020d6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.privacy.interfaces.def.permission.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2704ee81daab8f0bda0fdc4117020d6b");
        }
        for (Activity activity : this.g.keySet()) {
            if (System.identityHashCode(activity) == j) {
                return this.g.get(activity);
            }
        }
        return null;
    }

    @NonNull
    private synchronized com.meituan.android.privacy.interfaces.def.permission.b c(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07c22ade1e9e83dcde0db61390547a2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.privacy.interfaces.def.permission.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07c22ade1e9e83dcde0db61390547a2d");
        }
        com.meituan.android.privacy.interfaces.def.permission.b bVar = this.g.get(activity);
        if (bVar == null) {
            bVar = new com.meituan.android.privacy.interfaces.def.permission.b(this, activity);
            this.g.put(activity, bVar);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public void a(@NonNull com.meituan.android.privacy.interfaces.def.permission.b bVar, @NonNull l lVar) {
        Object[] objArr = {bVar, lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "035f9523ea18c454fc358b165014bcd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "035f9523ea18c454fc358b165014bcd7");
        } else {
            bVar.a(lVar);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.d
    @UiThread
    public final void a(@NonNull com.meituan.android.privacy.interfaces.def.permission.b bVar, @NonNull Activity activity, @NonNull l lVar) {
        Object[] objArr = {bVar, activity, lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "828f16e325a817ec600870e7a0072757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "828f16e325a817ec600870e7a0072757");
            return;
        }
        if (TextUtils.equals(lVar.c, "app")) {
            PermissionGuardDialogActivity.a(activity, lVar.b, lVar.a);
        }
        if (TextUtils.equals(lVar.c, PermissionGuard.DIALOG_TYPE_APP_SYS)) {
            AppGuardPermissionDialogAct.a(activity, lVar.b, lVar.a);
        } else if (Build.VERSION.SDK_INT >= 23) {
            PermissionResultFrg.a(activity, lVar.b, lVar.a, lVar.d, this);
        } else {
            bVar.a(2, 0);
        }
    }

    private synchronized void a(@NonNull Activity activity, String str, String str2, com.meituan.android.privacy.interfaces.d dVar, String str3) {
        Object[] objArr = {activity, str, str2, dVar, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0ee30507342f03d10c1b7bdebcae17a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0ee30507342f03d10c1b7bdebcae17a");
            return;
        }
        final com.meituan.android.privacy.interfaces.def.permission.b c = c(activity);
        final l lVar = new l(str3, str2, str, dVar);
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(c, lVar);
        } else {
            this.b.mMainHandler.post(new Runnable() { // from class: com.meituan.android.privacy.impl.permission.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26eed7c381987fbba77e686a72665f48", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26eed7c381987fbba77e686a72665f48");
                    } else {
                        d.this.a(c, lVar);
                    }
                }
            });
        }
    }

    @UiThread
    public final synchronized void a(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03fc1d4724f03c3bf356c4ef455ec473", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03fc1d4724f03c3bf356c4ef455ec473");
            return;
        }
        com.meituan.android.privacy.interfaces.def.permission.b bVar = this.g.get(activity);
        if (bVar != null) {
            bVar.a();
        }
    }

    @UiThread
    public final synchronized void b(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2186f298fcdf3505c353144b6b9f62a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2186f298fcdf3505c353144b6b9f62a4");
        } else {
            this.g.remove(activity);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.d
    @RequiresApi(api = 23)
    public final void a(Fragment fragment, String[] strArr, int i) {
        Object[] objArr = {fragment, strArr, 1001};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d419e7b5dacd78ba6ee3c969df0bc90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d419e7b5dacd78ba6ee3c969df0bc90");
        } else {
            Permissionner.requestPermissions(fragment, strArr, 1001);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.d
    public final void a(android.support.v4.app.Fragment fragment, String[] strArr, int i) {
        Object[] objArr = {fragment, strArr, 1001};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "264b243299bf425f08c9748161c0f9ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "264b243299bf425f08c9748161c0f9ed");
        } else {
            Permissionner.requestPermissions(fragment, strArr, 1001);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.d
    public final void a(Fragment fragment, int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {fragment, Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab052bc8a1ae5c48546c62032f1240b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab052bc8a1ae5c48546c62032f1240b0");
        } else {
            Permissionner.onRequestPermissionsResult(fragment, i, strArr, iArr);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.def.permission.d
    public final void a(android.support.v4.app.Fragment fragment, int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {fragment, Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ab46edac9ab0fc35498a305fa7cb812", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ab46edac9ab0fc35498a305fa7cb812");
        } else {
            Permissionner.onRequestPermissionsResult(fragment, i, strArr, iArr);
        }
    }

    @NonNull
    private String a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2979fb62191fc811dd76c2aaa18af0ec", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2979fb62191fc811dd76c2aaa18af0ec") : TextUtils.isEmpty(str) ? this.d ? "default-default" : "Empty" : str;
    }
}
