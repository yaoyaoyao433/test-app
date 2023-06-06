package com.meituan.mmp.lib.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EditText;
import com.meituan.mmp.lib.utils.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class MMMPEditText extends EditText {
    public static ChangeQuickRedirect U;

    public MMMPEditText(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = U;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5472d2174c5d1d0a5361d752500f2d3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5472d2174c5d1d0a5361d752500f2d3e");
        } else {
            c();
        }
    }

    public MMMPEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = U;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "700ca78a9f72640f8c394e7e04f0ff79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "700ca78a9f72640f8c394e7e04f0ff79");
        } else {
            c();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = U;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c2d8a97264740310ed5ad92cd82ef02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c2d8a97264740310ed5ad92cd82ef02");
        } else if (!Build.BRAND.equalsIgnoreCase("xiaomi") || t.a() == null) {
        } else {
            setTypeface(t.a());
        }
    }
}
