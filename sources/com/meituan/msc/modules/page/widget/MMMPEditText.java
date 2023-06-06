package com.meituan.msc.modules.page.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EditText;
import com.meituan.msc.common.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class MMMPEditText extends EditText {
    public static ChangeQuickRedirect a;

    public MMMPEditText(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65f46f75bfc5907d9d0d43bb238e3b7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65f46f75bfc5907d9d0d43bb238e3b7d");
        } else {
            a();
        }
    }

    public MMMPEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f14d32e20492fa5f2fdec09af021084c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f14d32e20492fa5f2fdec09af021084c");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cf71a9f9507e99e1af414e6577f3411", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cf71a9f9507e99e1af414e6577f3411");
        } else if (!Build.BRAND.equalsIgnoreCase("xiaomi") || s.a() == null) {
        } else {
            setTypeface(s.a());
        }
    }
}
