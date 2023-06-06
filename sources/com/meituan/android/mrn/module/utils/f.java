package com.meituan.android.mrn.module.utils;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b394cb2cb387fa091a27c1e80fbfce7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b394cb2cb387fa091a27c1e80fbfce7")).intValue() : (i == -1 || i == 0 || i >= 100 || i <= 0) ? i : i * 1000;
    }

    public static View a(Activity activity, int i) {
        Object a2;
        Object[] objArr;
        View view;
        Object[] objArr2 = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "7932511060daf8c994dc15b61e2e01fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "7932511060daf8c994dc15b61e2e01fa");
        }
        if (activity == null || activity.getWindow() == null) {
            return null;
        }
        View decorView = activity.getWindow().getDecorView();
        try {
            if (Build.VERSION.SDK_INT <= 16) {
                a2 = a("mWindowManager", activity.getWindowManager());
            } else {
                a2 = a("mGlobal", activity.getWindowManager());
            }
            Object a3 = a("mRoots", a2);
            if (Build.VERSION.SDK_INT >= 19) {
                objArr = ((List) a3).toArray();
            } else {
                objArr = (Object[]) a3;
            }
            for (int length = objArr.length - 1; length >= 0; length--) {
                View view2 = (View) a("mView", objArr[length]);
                if (view2 != null && view2.isShown()) {
                    if (length == objArr.length - 1) {
                        decorView = view2;
                    }
                    if (i != 0) {
                        Object[] objArr3 = {view2, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "39f6a47ceeb7a4d94c49b04142161a2d", RobustBitConfig.DEFAULT_VALUE)) {
                            view = (View) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "39f6a47ceeb7a4d94c49b04142161a2d");
                        } else {
                            if (view2 != null && i != 0) {
                                view = view2.findViewById(i);
                            }
                            view = null;
                        }
                        if (view != null) {
                            return view;
                        }
                    } else {
                        continue;
                    }
                }
                if (length != objArr.length - 1) {
                    break;
                }
            }
            return decorView;
        } catch (Throwable unused) {
            return decorView;
        }
    }

    private static Object a(String str, Object obj) {
        Field[] declaredFields;
        Field field;
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfe0c761d7eded50de6333a866da4b91", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfe0c761d7eded50de6333a866da4b91");
        }
        try {
            Class<?> cls = obj.getClass();
            Object[] objArr2 = {str, cls};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "25deba75c230b161f876dabda3e1fa7a", RobustBitConfig.DEFAULT_VALUE)) {
                for (Class<?> cls2 = cls; cls2 != Object.class; cls2 = cls2.getSuperclass()) {
                    for (Field field2 : cls2.getDeclaredFields()) {
                        if (str.equals(field2.getName())) {
                            field = field2;
                        }
                    }
                }
                throw new NoSuchFieldException("Field " + str + " not found for class " + cls);
            }
            field = (Field) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "25deba75c230b161f876dabda3e1fa7a");
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
