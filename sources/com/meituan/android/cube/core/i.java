package com.meituan.android.cube.core;

import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class i extends g {
    public static ChangeQuickRedirect a;

    public i(@Nullable String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed4b5a7398cd1a3f572b0580ec47b864", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed4b5a7398cd1a3f572b0580ec47b864");
        }
    }

    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "979d0323dde63b05962284a9255714bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "979d0323dde63b05962284a9255714bd");
        }
        f f = f();
        Object[] objArr2 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, f, changeQuickRedirect2, false, "65543ca81ad5b85d0e00ac53042bd8d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, f, changeQuickRedirect2, false, "65543ca81ad5b85d0e00ac53042bd8d4");
        } else {
            f.d.d = viewGroup;
        }
        return f().i();
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d357a38b4b3b0a9d18493d3b386fc638", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d357a38b4b3b0a9d18493d3b386fc638");
        } else if (this.c == null || !(this.c instanceof h)) {
        } else {
            ((h) this.c).q();
        }
    }
}
