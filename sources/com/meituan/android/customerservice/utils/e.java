package com.meituan.android.customerservice.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bdfc760e305a628009554559ade50fdb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bdfc760e305a628009554559ade50fdb")).booleanValue() : q.a(context, "customerservice_common").b("floating_is_show", false);
    }

    public static void a(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9497afe68fa956941cc641e5f545a43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9497afe68fa956941cc641e5f545a43");
        } else {
            q.a(context, "customerservice_common").a("floating_is_show", z);
        }
    }

    public static void b(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb5c850bf96ff1077713a8456af1371e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb5c850bf96ff1077713a8456af1371e");
        } else {
            q.a(context, "customerservice_common").a("upload_floating_close", z);
        }
    }

    public static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9ce761695da7461b788cd6a210f6bbe", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9ce761695da7461b788cd6a210f6bbe") : q.a(context, "customerservice_common").b("floating_visit_id", "");
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "393fc81a8b1b9acdcb51d9b1a929875c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "393fc81a8b1b9acdcb51d9b1a929875c");
        } else {
            q.a(context, "customerservice_common").a("floating_visit_id", str);
        }
    }

    public static String c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5633f936bfaa2e7b0d1fef5e04595d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5633f936bfaa2e7b0d1fef5e04595d8");
        }
        String b = q.a(context, "customerservice_common").b("floating_chat_id", "floating_default_chat_id");
        if (TextUtils.equals(b, StringUtil.NULL)) {
            return null;
        }
        return b;
    }

    public static void b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7795f9492a05191db94ff58bef2d5b61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7795f9492a05191db94ff58bef2d5b61");
            return;
        }
        q a2 = q.a(context, "customerservice_common");
        if (str == null) {
            a2.a("floating_chat_id", StringUtil.NULL);
        } else {
            a2.a("floating_chat_id", str);
        }
    }

    public static String d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db32d84303766dd2bc197218f24b3b11", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db32d84303766dd2bc197218f24b3b11");
        }
        String b = q.a(context, "customerservice_common").b("upload_floating_message_id", "upload_floating_default_message_id");
        if (TextUtils.equals(b, StringUtil.NULL)) {
            return null;
        }
        return b;
    }

    public static void c(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "872ec557062dfb7b2aa64c3cad8aba51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "872ec557062dfb7b2aa64c3cad8aba51");
            return;
        }
        q a2 = q.a(context, "customerservice_common");
        if (str == null) {
            a2.a("upload_floating_message_id", StringUtil.NULL);
        } else {
            a2.a("upload_floating_message_id", str);
        }
    }

    public static String e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54a870fdb3f3147ea9489c6058a64110", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54a870fdb3f3147ea9489c6058a64110") : q.a(context, "customerservice_common").b("floating_url", (String) null);
    }

    public static void d(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f79670ff599c344ea8c91589154ab6e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f79670ff599c344ea8c91589154ab6e4");
        } else {
            q.a(context, "customerservice_common").a("floating_url", str);
        }
    }
}
