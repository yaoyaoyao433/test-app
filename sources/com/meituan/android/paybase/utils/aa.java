package com.meituan.android.paybase.utils;

import android.os.Bundle;
import android.os.Parcelable;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class aa {
    public static ChangeQuickRedirect a;

    @MTPaySuppressFBWarnings({"DP_DO_INSIDE_DO_PRIVILEGED"})
    public static void a(Object obj, Class cls, Bundle bundle) {
        Field[] declaredFields;
        while (true) {
            Object[] objArr = {obj, cls, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60efa6adf335221c6e51fabdde3fe56d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60efa6adf335221c6e51fabdde3fe56d");
                return;
            } else if (cls == null || obj == null || bundle == null || (declaredFields = cls.getDeclaredFields()) == null || declaredFields.length == 0) {
                return;
            } else {
                for (Field field : declaredFields) {
                    if (field.isAnnotationPresent(MTPayNeedToPersist.class)) {
                        try {
                            field.setAccessible(true);
                            if (field.get(obj) instanceof Serializable) {
                                bundle.putSerializable(a(cls, field), (Serializable) field.get(obj));
                            } else if (field.get(obj) instanceof Parcelable) {
                                bundle.putParcelable(a(cls, field), (Parcelable) field.get(obj));
                            }
                        } catch (ClassCastException unused) {
                            throw new IllegalStateException("Annotated filed must be serializable");
                        } catch (IllegalAccessException e) {
                            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SaveInstanceUtil_saveInstanceOfClass").a("message", e.getMessage()).b);
                        }
                    }
                }
                if (cls.isAnnotationPresent(MTPayBaseClass.class)) {
                    return;
                }
                cls = cls.getSuperclass();
            }
        }
    }

    private static String a(Class cls, Field field) {
        Object[] objArr = {cls, field};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a7408e22103b7be1196819d5f9e6002", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a7408e22103b7be1196819d5f9e6002");
        }
        return cls.getName() + CommonConstant.Symbol.DOT + field.getName();
    }

    @MTPaySuppressFBWarnings({"DP_DO_INSIDE_DO_PRIVILEGED"})
    public static void b(Object obj, Class cls, Bundle bundle) {
        Field[] declaredFields;
        while (true) {
            Object[] objArr = {obj, cls, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23d63eb4a0d5529ea67326a2a7ced0c9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23d63eb4a0d5529ea67326a2a7ced0c9");
                return;
            } else if (cls == null || obj == null || bundle == null || (declaredFields = cls.getDeclaredFields()) == null || declaredFields.length == 0) {
                return;
            } else {
                for (Field field : declaredFields) {
                    if (field.isAnnotationPresent(MTPayNeedToPersist.class)) {
                        field.setAccessible(true);
                        try {
                            Object obj2 = bundle.get(a(cls, field));
                            if (obj2 instanceof Serializable) {
                                field.set(obj, obj2);
                            } else if (obj2 instanceof Parcelable) {
                                field.set(obj, obj2);
                            }
                        } catch (ClassCastException unused) {
                            throw new IllegalStateException("Annotated filed must be serializable");
                        } catch (IllegalAccessException e) {
                            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "SaveInstanceUtil_restoreInstanceOfClass").a("message", e.getMessage()).b);
                        }
                    }
                }
                if (cls.isAnnotationPresent(MTPayBaseClass.class)) {
                    return;
                }
                cls = cls.getSuperclass();
            }
        }
    }
}
