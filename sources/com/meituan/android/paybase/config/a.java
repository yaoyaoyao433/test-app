package com.meituan.android.paybase.config;

import android.content.Context;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ah;
import com.meituan.android.paybase.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MTPaySuppressFBWarnings({"DC_DOUBLECHECK"})
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static b b;
    private static c c;
    private static InterfaceC0330a d;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.paybase.config.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0330a {
        void a();
    }

    public static void a(final b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9fef6e2d5e0aa7c15e402ed0f2f9858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9fef6e2d5e0aa7c15e402ed0f2f9858");
            return;
        }
        b = bVar;
        com.meituan.android.paybase.fingerprint.soter.b.b = new com.meituan.android.paybase.fingerprint.soter.c() { // from class: com.meituan.android.paybase.config.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paybase.fingerprint.soter.c
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2506d8e9f50d64ba726b633a7aef8ce", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2506d8e9f50d64ba726b633a7aef8ce") : b.this.i();
            }

            @Override // com.meituan.android.paybase.fingerprint.soter.c
            public final Context b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef9e50bbec6997c87b22ecaf38881f64", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef9e50bbec6997c87b22ecaf38881f64") : b.this.a();
            }
        };
        if (a()) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cef77622a376f181ceee617137fa9b5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cef77622a376f181ceee617137fa9b5f");
        } else {
            new com.meituan.android.paybase.asynctask.a<String, Integer, Boolean>() { // from class: com.meituan.android.paybase.config.a.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paybase.asynctask.b
                public final /* synthetic */ Object a(Object[] objArr3) {
                    Object[] objArr4 = {(String[]) objArr3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "59826b34ed988c89b219830c1c4c7034", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "59826b34ed988c89b219830c1c4c7034");
                    }
                    x.a(false);
                    return Boolean.valueOf(ah.a());
                }

                @Override // com.meituan.android.paybase.asynctask.b
                public final /* synthetic */ void a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    Object[] objArr3 = {bool};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7960df4c93c029eb7ebd86e565f7848f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7960df4c93c029eb7ebd86e565f7848f");
                    } else {
                        x.a(bool.booleanValue());
                    }
                }
            }.b(new String[0]);
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54713f399d7e9095e791b217cfb2edf3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54713f399d7e9095e791b217cfb2edf3")).booleanValue() : com.meituan.android.paybase.downgrading.c.a();
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a38cb8138d25d58d30aacb060ac24c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a38cb8138d25d58d30aacb060ac24c9");
        } else {
            x.a(ah.a());
        }
    }

    public static void a(c cVar) {
        if (cVar != null) {
            c = cVar;
        }
    }

    public static void a(InterfaceC0330a interfaceC0330a) {
        if (interfaceC0330a != null) {
            d = interfaceC0330a;
        }
    }

    public static InterfaceC0330a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2766e5ad76394828e2bced409723bcd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (InterfaceC0330a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2766e5ad76394828e2bced409723bcd3");
        }
        if (d == null) {
            throw new IllegalStateException("must config PayBaseInitHandler by PayBaseConfig.config()");
        }
        return d;
    }

    public static b d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68d08ada140c059bb1867a8f68d5a573", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68d08ada140c059bb1867a8f68d5a573");
        }
        if (b == null) {
            throw new IllegalStateException("must config PayBaseProvider by PayBaseConfig.config()");
        }
        return b;
    }

    public static c e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f496aad6fe42541010190acbe9bdf3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f496aad6fe42541010190acbe9bdf3b");
        }
        if (c == null) {
            throw new IllegalStateException("must config UserLockExceptionHandler by PayBaseConfig.configUserLockExceptionHandler()");
        }
        return c;
    }
}
