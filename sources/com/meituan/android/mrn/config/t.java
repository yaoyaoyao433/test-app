package com.meituan.android.mrn.config;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class t extends com.meituan.android.mrn.utils.config.a {
    public static ChangeQuickRedirect a;
    public static final t b = new t();
    public static final com.meituan.android.mrn.config.handler.e c = new com.meituan.android.mrn.config.handler.e();
    public static final com.meituan.android.mrn.config.handler.c d = new com.meituan.android.mrn.config.handler.c();
    public static final com.meituan.android.mrn.config.handler.a e = new com.meituan.android.mrn.config.handler.a();

    private static com.meituan.android.mrn.utils.config.e b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8473380ea11e0b0db53932812e505d2e", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.mrn.utils.config.e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8473380ea11e0b0db53932812e505d2e") : new com.meituan.android.mrn.config.handler.d(d, str);
    }

    private static com.meituan.android.mrn.utils.config.e a(String str, String str2, com.meituan.android.mrn.utils.config.b bVar) {
        Object[] objArr = {str, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7b6e1ffb52ce5626101de3ff13ac0f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.utils.config.e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7b6e1ffb52ce5626101de3ff13ac0f7");
        }
        String a2 = a(str, bVar);
        Object[] objArr2 = {a2, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "809eeb3b1db193107b332236c659538f", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.mrn.utils.config.e) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "809eeb3b1db193107b332236c659538f") : new com.meituan.android.mrn.config.handler.g(c, a2, str2);
    }

    public static String a(String str, com.meituan.android.mrn.utils.config.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "791db239a19d4187732c8e7500d9f53a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "791db239a19d4187732c8e7500d9f53a");
        }
        String str2 = bVar != null ? bVar.c : null;
        if (str2 == null) {
            str2 = CommonConstant.Symbol.UNDERLINE + c.a().e();
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + str2;
    }

    private static com.meituan.android.mrn.utils.config.e c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a75382d083f1c1c970fde177ed2a2f3b", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.mrn.utils.config.e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a75382d083f1c1c970fde177ed2a2f3b") : new com.meituan.android.mrn.config.handler.b(e, str);
    }

    public static void a(@NonNull String str, @NonNull Type type, Object obj, @NonNull String str2, String str3) {
        Object[] objArr = {str, type, obj, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79f4a48c36088e0b53d5eca35356c1f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79f4a48c36088e0b53d5eca35356c1f4");
        } else {
            a(str, type, obj, str2, str3, (com.meituan.android.mrn.utils.config.b) null);
        }
    }

    public static void a(@NonNull String str, @NonNull Type type, Object obj, @NonNull String str2, @Nullable String str3, @Nullable com.meituan.android.mrn.utils.config.b bVar) {
        Object[] objArr = {str, type, obj, str2, str3, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "669a96e82bb45851412efca008440981", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "669a96e82bb45851412efca008440981");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (com.meituan.android.mrn.debug.a.a()) {
            arrayList.add(b(str));
        }
        arrayList.add(a(str2, str.substring(str.lastIndexOf(46) + 1), bVar));
        arrayList.add(c(str));
        b.a(str, str3, type, obj, arrayList, bVar);
    }
}
