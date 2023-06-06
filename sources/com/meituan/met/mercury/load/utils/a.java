package com.meituan.met.mercury.load.utils;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static WeakReference<Gson> b;

    private static Gson a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "baf520f3be72ddd13f1faa8f4438f8ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "baf520f3be72ddd13f1faa8f4438f8ef");
        }
        if (b == null || b.get() == null) {
            b = new WeakReference<>(new Gson());
        }
        return b.get();
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfdccfd34eeae501f7c92c064632bb9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfdccfd34eeae501f7c92c064632bb9e");
        }
        if (obj == null) {
            return null;
        }
        try {
            return a().toJson(obj);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static <T> T a(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73c080b9a748338545c76fe715023aea", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73c080b9a748338545c76fe715023aea");
        }
        if (str == null) {
            return null;
        }
        try {
            return (T) a().fromJson(str, (Class<Object>) cls);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static <T> T a(String str, Type type) {
        Object[] objArr = {str, type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b6da53b4adecedef2e2eeefdb671a99", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b6da53b4adecedef2e2eeefdb671a99");
        }
        if (str == null || type == null) {
            return null;
        }
        try {
            return (T) a().fromJson(str, type);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static <T> T a(InputStream inputStream, Class<T> cls) {
        Object[] objArr = {inputStream, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d1c2a96d563289d48416c0518ffb56f", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d1c2a96d563289d48416c0518ffb56f");
        }
        if (inputStream == null) {
            return null;
        }
        try {
            return (T) a().fromJson((Reader) new InputStreamReader(inputStream), (Class<Object>) cls);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
