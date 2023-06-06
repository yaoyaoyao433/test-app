package com.dianping.imagemanager.image.drawable;

import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(Drawable drawable, Drawable drawable2) {
        Object[] objArr = {drawable, drawable2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c53eb7a2007713c27cda173d8c4e7be8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c53eb7a2007713c27cda173d8c4e7be8");
        } else if (drawable == null || drawable == drawable2) {
        } else {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    public static void a(Drawable drawable, b bVar) {
        Object[] objArr = {drawable, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e60f2f0b2651288d57d819a24bc1841c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e60f2f0b2651288d57d819a24bc1841c");
        } else if (drawable == null || bVar == null) {
        } else {
            bVar.a(drawable);
        }
    }

    public static void a(Drawable drawable, Drawable.Callback callback) {
        Object[] objArr = {drawable, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76a10f74cdfb2dc0aa7a5eb06b539aa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76a10f74cdfb2dc0aa7a5eb06b539aa6");
        } else if (drawable != null) {
            drawable.setCallback(callback);
        }
    }
}
