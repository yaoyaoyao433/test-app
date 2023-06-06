package com.sankuai.meituan.navigation.common;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.navigation.common.Navigator;
import java.util.HashMap;
/* compiled from: ProGuard */
@SuppressLint({"TypeParameterUnusedInFormals"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class h implements g {
    private static final HashMap<Class, String> a = new HashMap<>();
    public static ChangeQuickRedirect c;
    public final HashMap<String, Navigator<? extends c>> d;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96d856bc65a51c973446532fdf2c6506", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96d856bc65a51c973446532fdf2c6506");
        } else {
            this.d = new HashMap<>();
        }
    }

    @NonNull
    private String a(@NonNull Class<? extends Navigator> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86747ba33292c654c090030c95976f5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86747ba33292c654c090030c95976f5d");
        }
        String str = a.get(cls);
        if (str == null) {
            Navigator.Name name = (Navigator.Name) cls.getAnnotation(Navigator.Name.class);
            str = name != null ? name.value() : null;
            if (!b(str)) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for " + cls.getSimpleName());
            }
            a.put(cls, str);
        }
        return str;
    }

    @Override // com.sankuai.meituan.navigation.common.g
    @NonNull
    public final <D extends c, T extends Navigator<? extends D>> T a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09f9b420135da154e3fd8833a16e2bbb", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09f9b420135da154e3fd8833a16e2bbb");
        }
        if (!b(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        T t = (T) this.d.get(str);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.meituan.navigation.common.g
    @Nullable
    public final Navigator<? extends c> a(@NonNull Navigator<? extends c> navigator) {
        Object[] objArr = {navigator};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92f63ec60a0870f107cb8b9db72d90b5", RobustBitConfig.DEFAULT_VALUE) ? (Navigator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92f63ec60a0870f107cb8b9db72d90b5") : a(a((Class<? extends Navigator>) navigator.getClass()), navigator);
    }

    @Nullable
    public Navigator<? extends c> a(@NonNull String str, @NonNull Navigator<? extends c> navigator) {
        Object[] objArr = {str, navigator};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50fecd60c30cc3cd6603c0077b95230a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Navigator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50fecd60c30cc3cd6603c0077b95230a");
        }
        if (!b(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        return this.d.put(str, navigator);
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "504d7d6e2f804b88482d359a05562a69", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "504d7d6e2f804b88482d359a05562a69")).booleanValue() : (str == null || str.isEmpty()) ? false : true;
    }
}
