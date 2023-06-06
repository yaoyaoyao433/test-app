package com.meituan.android.mrn.utils;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.Field;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class v {
    public static ChangeQuickRedirect a;

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a9fc1138b20ba4bfcc64b6902d2c505", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a9fc1138b20ba4bfcc64b6902d2c505");
            return;
        }
        try {
            com.meituan.android.mrn.container.b a2 = u.a(i);
            if (a2 == null || a2.j() == null) {
                return;
            }
            a2.j().r_();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static Activity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f04812e00e0f91577bc4ce8d2668a58", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f04812e00e0f91577bc4ce8d2668a58");
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(invoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField(PushConstants.INTENT_ACTIVITY_NAME);
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }
}
