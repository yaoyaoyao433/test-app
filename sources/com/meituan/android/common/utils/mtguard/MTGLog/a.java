package com.meituan.android.common.utils.mtguard.MTGLog;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: com.meituan.android.common.utils.mtguard.MTGLog.a$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[C0233a.a().length];
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            try {
                a[C0233a.a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C0233a.b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.meituan.android.common.utils.mtguard.MTGLog.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0233a extends Enum<C0233a> {
        public static final int a = 1;
        public static final int b = 2;
        private static final /* synthetic */ int[] c = {a, b};
        public static ChangeQuickRedirect changeQuickRedirect;

        public C0233a(String str, int i) {
            super(str, i);
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38c1e25912c1849452ef7aab45e41a05", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38c1e25912c1849452ef7aab45e41a05");
            }
        }

        public static int[] a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return (int[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c6bd8404dbcb56cae665d5e08aabbd91", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c6bd8404dbcb56cae665d5e08aabbd91") : c.clone());
        }
    }

    private static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d8833a560e6cbbea0e5c3cbd3c538d4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d8833a560e6cbbea0e5c3cbd3c538d4e");
        } else {
            a(str, str2, C0233a.a);
        }
    }

    public static void a(String str, String str2, int i) {
        int i2 = 0;
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e32b66f9b17df2e6c5914f4397e4210d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e32b66f9b17df2e6c5914f4397e4210d");
            return;
        }
        int length = str2.length();
        if (length <= 4000) {
            b(str, str2, i);
            return;
        }
        while (i2 < length) {
            int i3 = i2 + 4000;
            b(str, i3 < length ? str2.substring(i2, i3) : str2.substring(i2, length), i);
            i2 = i3;
        }
    }

    private static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e64e811478f65db1a1f2ab7cdc44e3a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e64e811478f65db1a1f2ab7cdc44e3a2");
        } else {
            a(str, str2, C0233a.b);
        }
    }

    private static void b(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d70e9ba6f134e6f86d19069e000739be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d70e9ba6f134e6f86d19069e000739be");
            return;
        }
        switch (AnonymousClass1.a[i - 1]) {
            case 1:
            default:
                return;
            case 2:
                Log.e(str, str2);
                return;
        }
    }
}
