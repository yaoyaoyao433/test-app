package com.sankuai.waimai.kit.login.user;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.kit.login.user.b;
import com.tencent.mapsdk.internal.y;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static c d;
    private static a e;
    public ArrayList<b> b;
    public String c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6c7dc57581d7bef42202ee40d203ea3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6c7dc57581d7bef42202ee40d203ea3");
            return;
        }
        this.c = "";
        this.b = new ArrayList<>();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "307f8111e3c3b6638233aea86658786a", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "307f8111e3c3b6638233aea86658786a");
        }
        if (d == null) {
            synchronized (c.class) {
                if (d == null) {
                    d = new c();
                }
            }
        }
        return d;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e78db82a301582b00655a2761dd630", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e78db82a301582b00655a2761dd630")).booleanValue() : f().isLogin();
    }

    public final synchronized void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d991a1393433a890976215e3306fc33f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d991a1393433a890976215e3306fc33f");
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        if (!this.b.contains(bVar)) {
            this.b.add(bVar);
        }
    }

    public final synchronized void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b3508e1a72f95aadcb02f727c226c75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b3508e1a72f95aadcb02f727c226c75");
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        this.b.remove(bVar);
    }

    public final void a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b4a05d54aec7eafd9f8ba1f95d27fee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b4a05d54aec7eafd9f8ba1f95d27fee");
        } else if (this.b != null) {
            Object[] array = this.b.toArray();
            for (int length = array.length - 1; length >= 0; length--) {
                ((b) array[length]).a(aVar);
            }
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d3b67b77b19c9ea321a01e4e2ad3cc7e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d3b67b77b19c9ea321a01e4e2ad3cc7e");
            } else if (e != null) {
                if (AnonymousClass1.a[aVar.ordinal()] == 1) {
                    e.a(true);
                } else {
                    e.a(false);
                }
            } else {
                throw new RuntimeException(com.meituan.android.singleton.b.a.getString(R.string.wm_kit_main_call_back_is_null));
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.kit.login.user.c$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[b.a.valuesCustom().length];

        static {
            try {
                a[b.a.LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.a.BIND_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.a.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.a.LOGOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a(@NonNull Context context) {
        Intent intent;
        Intent intent2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f0f8b68a8a8b8f8e15c1ce8c4dba1e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f0f8b68a8a8b8f8e15c1ce8c4dba1e1");
        } else if (!(context instanceof Activity)) {
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c7fefe7fb07a11a09e01395fdc4d11e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c7fefe7fb07a11a09e01395fdc4d11e9");
                return;
            }
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8d0c63f1870ab82d062d12c97561e565", RobustBitConfig.DEFAULT_VALUE)) {
                intent = (Intent) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8d0c63f1870ab82d062d12c97561e565");
            } else {
                intent = new Intent("com.meituan.android.intent.action.login");
                if (context != null) {
                    intent.setPackage(context.getPackageName());
                    intent.putExtra("partner", 4);
                }
            }
            intent.addFlags(y.a);
            context.startActivity(intent);
        } else {
            Activity activity = (Activity) context;
            Object[] objArr4 = {activity};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "c83ee0d37116b687fde2bc3cb0e6eca0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "c83ee0d37116b687fde2bc3cb0e6eca0");
                return;
            }
            Object[] objArr5 = {activity};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "a7301e6c872c06a954c8bf5a0e5e0193", RobustBitConfig.DEFAULT_VALUE)) {
                intent2 = (Intent) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "a7301e6c872c06a954c8bf5a0e5e0193");
            } else {
                intent2 = new Intent("com.meituan.android.intent.action.login");
                if (activity != null && !activity.isFinishing()) {
                    intent2.setPackage(activity.getPackageName());
                    intent2.putExtra("partner", 4);
                }
            }
            activity.startActivity(intent2);
        }
    }

    public final long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "579370974f63e0c18e79e88e370d06d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "579370974f63e0c18e79e88e370d06d6")).longValue();
        }
        User user = f().getUser();
        if (user != null) {
            return user.id;
        }
        return 0L;
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a88ce12a2e45cb768d5776148c4333c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a88ce12a2e45cb768d5776148c4333c");
        }
        User user = f().getUser();
        return user != null ? user.token : this.c;
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cfe965a8eed0f056e7cc37026e6f1c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cfe965a8eed0f056e7cc37026e6f1c6");
        }
        User user = f().getUser();
        return user != null ? user.mobile : "";
    }

    public static void a(@NonNull a aVar) {
        e = aVar;
    }

    private static UserCenter f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4769ad2c6e44e7492b62512fd964cc8", RobustBitConfig.DEFAULT_VALUE) ? (UserCenter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4769ad2c6e44e7492b62512fd964cc8") : UserCenter.getInstance(com.meituan.android.singleton.b.a);
    }
}
