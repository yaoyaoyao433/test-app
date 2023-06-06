package com.meituan.android.yoda.model.behavior.tool;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static Field b;
    public static Field c;

    public static View a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd71379619da6e1435f5a5ea954cac81", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd71379619da6e1435f5a5ea954cac81");
        }
        if ((view instanceof ViewGroup) && a()) {
            View a2 = a((ViewGroup) view);
            while (true) {
                View a3 = a2 instanceof ViewGroup ? a((ViewGroup) a2) : null;
                if (a3 == null) {
                    return a2;
                }
                a2 = a3;
            }
        }
        return null;
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2f86911c7552683162e265b7f3e2076", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2f86911c7552683162e265b7f3e2076")).booleanValue();
        }
        if (b == null) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mFirstTouchTarget");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (c == null) {
            try {
                if (b != null) {
                    Field declaredField2 = b.getType().getDeclaredField("child");
                    c = declaredField2;
                    declaredField2.setAccessible(true);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return (b == null || c == null) ? false : true;
    }

    private static View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5519f1ffad4485fd745a015c7db52c35", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5519f1ffad4485fd745a015c7db52c35");
        }
        try {
            Object obj = b.get(viewGroup);
            if (obj != null) {
                Object obj2 = c.get(obj);
                if (obj2 instanceof View) {
                    return (View) obj2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
