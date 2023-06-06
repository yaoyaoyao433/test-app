package com.meituan.android.common.aidata.ai.platform;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AppEnvironment {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NonNull
    private static Environment sEnvironment = Environment.RELEASE;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum Environment {
        DEVELOP,
        RELEASE;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        Environment() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0228cf6ddb00bc9161fd6e17e103460b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0228cf6ddb00bc9161fd6e17e103460b");
            }
        }

        public static Environment valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "68fade709d3ae0e7a0ae9eb85e0a3ed1", RobustBitConfig.DEFAULT_VALUE) ? (Environment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "68fade709d3ae0e7a0ae9eb85e0a3ed1") : (Environment) Enum.valueOf(Environment.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Environment[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f3f83881a9e96074403d38ea4a504d72", RobustBitConfig.DEFAULT_VALUE) ? (Environment[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f3f83881a9e96074403d38ea4a504d72") : (Environment[]) values().clone();
        }
    }

    public static void setEnvironment(@NonNull Environment environment) {
        if (environment == null) {
            environment = Environment.RELEASE;
        }
        sEnvironment = environment;
    }

    @NonNull
    public static Environment getEnvironment() {
        return sEnvironment;
    }

    public static boolean develop() {
        return sEnvironment == Environment.DEVELOP;
    }

    public static boolean release() {
        return sEnvironment == Environment.RELEASE;
    }
}
