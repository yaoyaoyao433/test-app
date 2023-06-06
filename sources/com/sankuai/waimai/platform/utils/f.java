package com.sankuai.waimai.platform.utils;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.manipulator.annotation.CallSiteReplacement;
import com.sankuai.waimai.manipulator.annotation.SkipInstrumentation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
@SkipInstrumentation
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;

    @CallSiteReplacement(methodName = "getIntExtra", targetClass = "android.content.Intent")
    public static int a(Intent intent, String str, int i) {
        Object[] objArr = {intent, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b5dc2b54327e9ab51c8f958695f1c6c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b5dc2b54327e9ab51c8f958695f1c6c")).intValue();
        }
        if (intent == null) {
            return i;
        }
        try {
            return intent.getIntExtra(str, i);
        } catch (Exception unused) {
            return i;
        }
    }

    @CallSiteReplacement(methodName = "getStringExtra", targetClass = "android.content.Intent")
    public static String a(Intent intent, String str) {
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88966acfc754bff5eef3e25305ffe554", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88966acfc754bff5eef3e25305ffe554") : a(intent, str, "");
    }

    public static String a(Intent intent, String str, String str2) {
        Object[] objArr = {intent, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7906359220631a6276ac3eef4a38d43a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7906359220631a6276ac3eef4a38d43a");
        }
        if (intent == null) {
            return str2;
        }
        try {
            String stringExtra = intent.getStringExtra(str);
            return stringExtra == null ? str2 : stringExtra;
        } catch (Exception unused) {
            return str2;
        }
    }

    @CallSiteReplacement(methodName = "getBooleanExtra", targetClass = "android.content.Intent")
    public static boolean a(Intent intent, String str, boolean z) {
        Object[] objArr = {intent, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f28c837cdcbf5ca1affdf0463a0cb54", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f28c837cdcbf5ca1affdf0463a0cb54")).booleanValue();
        }
        if (intent == null) {
            return z;
        }
        try {
            return intent.getBooleanExtra(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    @CallSiteReplacement(methodName = "getLongExtra", targetClass = "android.content.Intent")
    public static long a(Intent intent, String str, long j) {
        Object[] objArr = {intent, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ee113e0e2d309644e023ac2e772b52a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ee113e0e2d309644e023ac2e772b52a")).longValue();
        }
        if (intent == null) {
            return j;
        }
        try {
            return intent.getLongExtra(str, j);
        } catch (Exception unused) {
            return j;
        }
    }

    @CallSiteReplacement(methodName = "getStringArrayListExtra", targetClass = "android.content.Intent")
    public static ArrayList<String> b(Intent intent, String str) {
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21871a7c2ead051acf21ebf4793455c6", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21871a7c2ead051acf21ebf4793455c6") : a(intent, str, (ArrayList<String>) new ArrayList());
    }

    public static ArrayList<String> a(Intent intent, String str, ArrayList<String> arrayList) {
        Object[] objArr = {intent, str, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65b1975795630b3edea2e0e8eed2e4a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65b1975795630b3edea2e0e8eed2e4a5");
        }
        if (intent == null) {
            return arrayList;
        }
        try {
            return intent.getStringArrayListExtra(str);
        } catch (Exception unused) {
            return arrayList;
        }
    }

    @CallSiteReplacement(methodName = "getSerializableExtra", targetClass = "android.content.Intent")
    public static Serializable c(Intent intent, String str) {
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6621c708dbbba7236640984f7a1e5977", RobustBitConfig.DEFAULT_VALUE) ? (Serializable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6621c708dbbba7236640984f7a1e5977") : a(intent, str, (Serializable) null);
    }

    public static Serializable a(Intent intent, String str, Serializable serializable) {
        Object[] objArr = {intent, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fcd4c06495c128f110344abfd2e76773", RobustBitConfig.DEFAULT_VALUE)) {
            return (Serializable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fcd4c06495c128f110344abfd2e76773");
        }
        if (intent == null) {
            return null;
        }
        try {
            return intent.getSerializableExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T extends Serializable> T b(Intent intent, String str, T t) {
        Object[] objArr = {intent, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ea2def12f2043ea93a6840026aeab08", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ea2def12f2043ea93a6840026aeab08");
        }
        if (intent == null) {
            return null;
        }
        try {
            return (T) intent.getSerializableExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @CallSiteReplacement(methodName = "getSerializable", targetClass = "android.os.Bundle")
    public static <T extends Serializable> T a(Bundle bundle, String str) {
        Object[] objArr = {bundle, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "343ec67fc0bf87a081d70dbf34c96774", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "343ec67fc0bf87a081d70dbf34c96774") : (T) a(bundle, str, (Serializable) null);
    }

    private static <T extends Serializable> T a(Bundle bundle, String str, T t) {
        Object[] objArr = {bundle, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "479756d4ad906060d7f179604ecf3667", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "479756d4ad906060d7f179604ecf3667");
        }
        if (bundle == null) {
            return null;
        }
        try {
            return (T) bundle.getSerializable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Deprecated
    public static ArrayList<? extends Parcelable> b(Intent intent, String str, ArrayList<? extends Parcelable> arrayList) {
        Object[] objArr = {intent, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30b66ab12e3319bace337ed9e8f8840c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30b66ab12e3319bace337ed9e8f8840c");
        }
        if (intent == null) {
            return null;
        }
        try {
            return intent.getParcelableArrayListExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T extends Parcelable> ArrayList<T> c(Intent intent, String str, @NonNull ArrayList<T> arrayList) {
        Object[] objArr = {intent, str, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0a2f83a9d9afb96c922b486e36bc684", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0a2f83a9d9afb96c922b486e36bc684");
        }
        if (intent == null) {
            return arrayList;
        }
        try {
            ArrayList<T> parcelableArrayListExtra = intent.getParcelableArrayListExtra(str);
            if (parcelableArrayListExtra != null) {
                Iterator<T> it = parcelableArrayListExtra.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(it.next());
                    } catch (ClassCastException e) {
                        com.sankuai.waimai.foundation.utils.log.a.a(e);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static long a(Intent intent, String str, String str2, long j) {
        Uri data;
        Object[] objArr = {intent, str, str2, -1L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c51bfc056758c8d0da88325bf9359a68", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c51bfc056758c8d0da88325bf9359a68")).longValue();
        }
        if (intent == null) {
            return -1L;
        }
        long longExtra = intent.getLongExtra(str, -1L);
        if (longExtra != -1 || (data = intent.getData()) == null) {
            return longExtra;
        }
        String queryParameter = data.getQueryParameter(str2);
        return (TextUtils.isEmpty(queryParameter) || !TextUtils.isDigitsOnly(queryParameter)) ? longExtra : r.a(queryParameter, 0L);
    }

    public static int a(Intent intent, String str, String str2, int i) {
        Uri data;
        Object[] objArr = {intent, str, str2, -1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51d7ed871a1c35df746a31e008cadf0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51d7ed871a1c35df746a31e008cadf0d")).intValue();
        }
        if (intent == null) {
            return -1;
        }
        int intExtra = intent.getIntExtra(str, -1);
        if (intExtra != -1 || (data = intent.getData()) == null) {
            return intExtra;
        }
        String queryParameter = data.getQueryParameter(str2);
        return (TextUtils.isEmpty(queryParameter) || !TextUtils.isDigitsOnly(queryParameter)) ? intExtra : a(queryParameter, 0);
    }

    private static int a(String str, int i) {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59286a8069f6375afb50f26157099cba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59286a8069f6375afb50f26157099cba")).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            try {
                if (TextUtils.isEmpty(trim)) {
                    return 0;
                }
                return Integer.parseInt(trim);
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static String b(Intent intent, String str, String str2) {
        Uri data;
        Object[] objArr = {intent, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eab8673fcfeb318134978e96a261bd77", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eab8673fcfeb318134978e96a261bd77");
        }
        if (intent == null) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        String stringExtra = intent.getStringExtra(str);
        return (!TextUtils.isEmpty(stringExtra) || (data = intent.getData()) == null) ? stringExtra : data.getQueryParameter(str2);
    }
}
