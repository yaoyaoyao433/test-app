package com.meituan.android.paybase.utils;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ag {
    public static ChangeQuickRedirect a;
    private static final DecimalFormat b = new DecimalFormat("#0.00");

    @Deprecated
    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e225973f3ed60468a1ccdab7f29113ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e225973f3ed60468a1ccdab7f29113ed");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(Integer.toHexString(b2 & 255));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "Strings_md5").a("message", e.getMessage()).b);
            throw new RuntimeException(e);
        }
    }

    public static String a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2101309ef96603e9537fac22c6b238e5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2101309ef96603e9537fac22c6b238e5") : b.format(d);
    }

    public static boolean a(CharSequence... charSequenceArr) {
        Object[] objArr = {charSequenceArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4e402f4c3fa97781ba5772fd44b6621", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4e402f4c3fa97781ba5772fd44b6621")).booleanValue();
        }
        if (charSequenceArr == null || charSequenceArr.length == 0) {
            return false;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (TextUtils.isEmpty(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static String a(String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a417f9c22148a393cc4e53a93985ba86", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a417f9c22148a393cc4e53a93985ba86");
        }
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("resetStr不能为空");
            }
            return str2;
        }
        return str;
    }

    public static boolean a(CharSequence charSequence, @NonNull CharSequence... charSequenceArr) {
        Object[] objArr = {charSequence, charSequenceArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08fa9f33bd00f0c1dc8b23f0700dcd40", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08fa9f33bd00f0c1dc8b23f0700dcd40")).booleanValue();
        }
        if (TextUtils.isEmpty(charSequence) || !a(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence2 : charSequenceArr) {
            if (TextUtils.equals(charSequence, charSequence2)) {
                return true;
            }
        }
        return false;
    }
}
