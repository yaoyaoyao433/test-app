package com.meituan.android.paycommon.lib.widgets;

import android.content.Context;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import com.meituan.android.paycommon.lib.config.e;
import com.meituan.android.paycommon.lib.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ThemeRelatedCheckBox extends AppCompatCheckBox {
    public static ChangeQuickRedirect a;

    public ThemeRelatedCheckBox(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a11ffa393e3499e0fccda4f11b00723", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a11ffa393e3499e0fccda4f11b00723");
        } else {
            a();
        }
    }

    public ThemeRelatedCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7379633528b88958fb963ab92d4bc0ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7379633528b88958fb963ab92d4bc0ad");
        } else {
            a();
        }
    }

    public ThemeRelatedCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92c0250b678b85d54326e6dfdba04359", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92c0250b678b85d54326e6dfdba04359");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad81d6981078db2089a7194d491c1d45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad81d6981078db2089a7194d491c1d45");
            return;
        }
        int a2 = u.a(e.a.CASHIER__CBOX_PAYTYPE);
        if (a2 >= 0) {
            setButtonDrawable(a2);
        }
    }
}
