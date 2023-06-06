package com.meituan.banma.jarvis.utils;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private static final a c = new a();

    public static void a(boolean z) {
        b = z;
    }

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "2960211d1b3f861bb91043344fef1751", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "2960211d1b3f861bb91043344fef1751");
        } else {
            c.a(4, str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "bdca0efa889c86137e467a08d94bfd98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "bdca0efa889c86137e467a08d94bfd98");
        } else {
            c.a(6, str, objArr);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "185d8888b4251e6f9c18d355b5e311a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "185d8888b4251e6f9c18d355b5e311a9");
        } else {
            c.a(6, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        final StringBuilder b;

        public b(int i) {
            Object[] objArr = {256};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3f14cde0e89cf3daf03b778441e0eba", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3f14cde0e89cf3daf03b778441e0eba");
            } else {
                this.b = new StringBuilder(256);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public ThreadLocal<b> b;

        private String a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13dfd27e0136a3dad09f7c17ec056758", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13dfd27e0136a3dad09f7c17ec056758");
            }
            switch (i) {
                case 2:
                    return "VERBOSE";
                case 3:
                    return "DEBUG";
                case 4:
                    return "INFO";
                case 5:
                    return "WARN";
                case 6:
                    return "ERROR";
                case 7:
                    return "ASSERT";
                default:
                    return "LOG";
            }
        }

        private static boolean c(int i) {
            return i >= 3;
        }

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d34684eba45f0cd1255f5db949d29ce", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d34684eba45f0cd1255f5db949d29ce");
            } else {
                this.b = new ThreadLocal<b>() { // from class: com.meituan.banma.jarvis.utils.c.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.ThreadLocal
                    public final /* synthetic */ b initialValue() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bff7b20d001a1325cee7f4f194daa37", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bff7b20d001a1325cee7f4f194daa37") : new b(256);
                    }
                };
            }
        }

        public final void a(int i, String str, Object... objArr) {
            Object[] objArr2 = {Integer.valueOf(i), str, objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "e479d985f905d050c8148dc8d375069f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "e479d985f905d050c8148dc8d375069f");
                return;
            }
            String str2 = null;
            if (b(i) || c(i)) {
                str2 = a(objArr);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            if (b(i)) {
                Log.println(i, str, str2);
            }
            if (c(i)) {
                String a2 = a(i);
                com.dianping.networklog.c.a(str + CommonConstant.Symbol.MINUS + a2 + CommonConstant.Symbol.MINUS + str2, 3);
            }
        }

        private String a(Object... objArr) {
            StringBuilder sb;
            Object[] objArr2 = {objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "5409520c8689fa83e264b5cbd9223710", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "5409520c8689fa83e264b5cbd9223710");
            }
            if (objArr.length == 1) {
                return String.valueOf(objArr[0]);
            }
            b bVar = this.b.get();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect2, false, "9004ebd082d452383988a49df814386b", RobustBitConfig.DEFAULT_VALUE)) {
                sb = (StringBuilder) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect2, false, "9004ebd082d452383988a49df814386b");
            } else {
                bVar.b.setLength(0);
                sb = bVar.b;
            }
            for (Object obj : objArr) {
                sb.append(obj);
            }
            return sb.toString();
        }

        private boolean b(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b6a398ce1935615630896e96e2b7b0f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b6a398ce1935615630896e96e2b7b0f")).booleanValue() : c.b;
        }
    }

    public static void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba01a3b7891350217335a81647ab682b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba01a3b7891350217335a81647ab682b");
        } else {
            a(str, Log.getStackTraceString(th));
        }
    }
}
