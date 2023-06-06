package com.meituan.mmp.lib.trace;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.main.Logger;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static String b;

    static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4ea8550af0e1659f22170da0724d75f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4ea8550af0e1659f22170da0724d75f");
        }
        if (TextUtils.isEmpty(str)) {
            return "HeraTrace" + a();
        }
        return "HeraTrace" + a() + CommonConstant.Symbol.MINUS + str;
    }

    private static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3835810254c2c86f832f9699b839166d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3835810254c2c86f832f9699b839166d");
        }
        if (b != null) {
            return b;
        }
        if (MMPEnvHelper.isInited()) {
            com.meituan.mmp.lib.mp.a e = com.meituan.mmp.lib.mp.a.e();
            StringBuilder sb = new StringBuilder("[");
            sb.append(e != null ? e.g : CommonConstant.Symbol.QUESTION_MARK);
            sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            String sb2 = sb.toString();
            b = sb2;
            return sb2;
        }
        return "";
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6382aa6029943004d8b68b9310c5c23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6382aa6029943004d8b68b9310c5c23");
        } else {
            a((String) null, str);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c37c72103371783b0adead0d7c6898be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c37c72103371783b0adead0d7c6898be");
        } else if (DebugHelper.b()) {
            e(a(str), str2);
        }
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcbaae346d36f5c8fd483b55af347932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcbaae346d36f5c8fd483b55af347932");
        } else {
            b((String) null, str);
        }
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe0908894bb8acd5a9ab37e2acc30e9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe0908894bb8acd5a9ab37e2acc30e9a");
        } else if (a(str, str2, new Object[0])) {
        } else {
            MMPEnvHelper.getLogger().i(a(str), str2);
        }
    }

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "c4f5ffadd6086ea4381dadd145570c79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "c4f5ffadd6086ea4381dadd145570c79");
        } else if (a(str, (String) null, objArr)) {
        } else {
            MMPEnvHelper.getLogger().i(a(str), objArr);
        }
    }

    public static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "241bb59f4331b3b6b1bdf31416018a93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "241bb59f4331b3b6b1bdf31416018a93");
        } else {
            c(null, str);
        }
    }

    public static void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33bf51f5f073fd050415fd903ae1d264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33bf51f5f073fd050415fd903ae1d264");
        } else if (a(str, str2, new Object[0])) {
        } else {
            MMPEnvHelper.getLogger().w(a(str), str2);
        }
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "f6a07559b6c5ffa85b82a51cc831ad89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "f6a07559b6c5ffa85b82a51cc831ad89");
        } else if (a(str, (String) null, objArr)) {
        } else {
            MMPEnvHelper.getLogger().w(a(str), objArr);
        }
    }

    public static void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f026a5f6edf65e99d3fe87dc7fffc0d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f026a5f6edf65e99d3fe87dc7fffc0d0");
        } else {
            d(null, str);
        }
    }

    public static void d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3da398b54d20b025ab9bad6d7225bc24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3da398b54d20b025ab9bad6d7225bc24");
        } else if (a(str, str2, new Object[0])) {
        } else {
            MMPEnvHelper.getLogger().e(a(str), null, str2);
        }
    }

    public static void a(String str, Throwable th, Object... objArr) {
        Object[] objArr2 = {str, th, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "5d960e6d2c1ef169070d526ed54e3275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "5d960e6d2c1ef169070d526ed54e3275");
        } else if (a(str, th, null, objArr)) {
        } else {
            MMPEnvHelper.getLogger().e(a(str), th, objArr);
        }
    }

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46bbef6ebef4e675ab0b73a219a1dd32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46bbef6ebef4e675ab0b73a219a1dd32");
        } else {
            a((String) null, th);
        }
    }

    public static void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff8613cab96ee811e43d1a228e59eee3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff8613cab96ee811e43d1a228e59eee3");
            return;
        }
        String th2 = th != null ? th.toString() : "";
        StringBuilder sb = new StringBuilder();
        sb.append(th2);
        sb.append(th != null ? b(th) : "");
        d(str, sb.toString());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;

        public static void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bf62b2d79805280591c5f010683ad9a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bf62b2d79805280591c5f010683ad9a");
            } else {
                a(null, str);
            }
        }

        public static void a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d03c702f2152618119bc8297d506150", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d03c702f2152618119bc8297d506150");
                return;
            }
            b.b(str, str2);
            if (DebugHelper.b()) {
                return;
            }
            b.e(b.a(str), str2);
        }

        public static void b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f3b5d11b3d2a9a71387555ede612c1d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f3b5d11b3d2a9a71387555ede612c1d");
            } else {
                b(null, str);
            }
        }

        public static void b(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb33c88ffaa585ad82a3ed8675c55af0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb33c88ffaa585ad82a3ed8675c55af0");
                return;
            }
            b.c(str, str2);
            if (DebugHelper.b()) {
                return;
            }
            b.e(b.a(str), str2);
        }

        public static void c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18282b6e79c3eeaab408ee898ab377fb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18282b6e79c3eeaab408ee898ab377fb");
            } else {
                c(null, str);
            }
        }

        public static void c(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1795c6f7d7715617b9d890ad78961f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1795c6f7d7715617b9d890ad78961f9");
                return;
            }
            b.d(str, str2);
            if (DebugHelper.b()) {
                return;
            }
            b.e(b.a(str), str2);
        }
    }

    private static boolean a(String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "cfd7b164bd475e7eedf9c3498330f9a4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "cfd7b164bd475e7eedf9c3498330f9a4")).booleanValue() : a(str, null, str2, objArr);
    }

    private static boolean a(String str, Throwable th, String str2, Object... objArr) {
        Object[] objArr2 = {str, th, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "ae12dadabf6dc44f1a275e4b1750e520", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "ae12dadabf6dc44f1a275e4b1750e520")).booleanValue();
        }
        if (MMPEnvHelper.isInited()) {
            return false;
        }
        String str3 = "";
        if (!TextUtils.isEmpty(str2)) {
            str3 = "" + str2;
        }
        if (objArr != null && objArr.length > 0) {
            if (!TextUtils.isEmpty(str3)) {
                str3 = str3 + ", ";
            }
            str3 = str3 + Logger.joinMessage(objArr);
        }
        if (th != null) {
            str3 = str3 + "\n" + Log.getStackTraceString(th);
        }
        if (DebugHelper.b()) {
            e("HeraTrace-" + str, str3);
        } else {
            new StringBuilder("HeraTrace-").append(str);
        }
        return true;
    }

    public static String b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47e54dec0f9069481b12c75393fc280a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47e54dec0f9069481b12c75393fc280a");
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                cause.printStackTrace(printWriter);
            }
            printWriter.close();
            return stringWriter.toString();
        } catch (Throwable th2) {
            e("class HeraTrace.java - method getAllStackInformation(Throwable) catch error " + th2);
            return "unknown: get stack information error";
        }
    }

    public static void e(String str, String str2) {
        String readLine;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7c7febaaf5d616f8b1b223ddac5392a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7c7febaaf5d616f8b1b223ddac5392a");
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(new StringReader(str2));
        while (true) {
            try {
                readLine = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (readLine == null) {
                return;
            }
            PrintStream printStream = System.out;
            printStream.println(str + ": " + readLine);
        }
    }
}
