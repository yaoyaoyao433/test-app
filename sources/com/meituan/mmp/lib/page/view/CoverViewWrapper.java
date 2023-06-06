package com.meituan.mmp.lib.page.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.msi.view.MsiCoverViewWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CoverViewWrapper extends MsiCoverViewWrapper {
    public static ChangeQuickRedirect a;
    public float[] b;

    public CoverViewWrapper(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "978c731db0ab30e74735e851d10f4254", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "978c731db0ab30e74735e851d10f4254");
        }
    }

    public CoverViewWrapper(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f32a2450fb685ceca91da08073b87f6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f32a2450fb685ceca91da08073b87f6c");
        }
    }

    public CoverViewWrapper(Context context, View view) {
        super(context, view);
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca44972be73eed1f497b6e2ec8fc17c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca44972be73eed1f497b6e2ec8fc17c2");
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eefa9a7c69929e61f57f646f3da9df4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eefa9a7c69929e61f57f646f3da9df4");
        } else if (this.d instanceof com.meituan.mmp.lib.api.coverview.a) {
            ((com.meituan.mmp.lib.api.coverview.a) this.d).addView(view, i);
        } else {
            super.addView(view, i);
        }
    }

    @Nullable
    public final com.meituan.mmp.lib.page.coverview.b getPageBackInterceptor() {
        if (this.d instanceof com.meituan.mmp.lib.page.coverview.b) {
            return (com.meituan.mmp.lib.page.coverview.b) this.d;
        }
        return null;
    }

    public void setPositionData(float[] fArr) {
        this.b = fArr;
    }

    public final boolean a(float[] fArr) {
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "201981302ea5041c6804673443b5bdae", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "201981302ea5041c6804673443b5bdae")).booleanValue() : Arrays.equals(fArr, this.b);
    }

    public final com.meituan.mmp.lib.api.coverview.e a(Class<com.meituan.mmp.lib.api.coverview.e> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9809fa1f02af74fa4380212db6f7a1f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.api.coverview.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9809fa1f02af74fa4380212db6f7a1f4");
        }
        try {
            if (cls.isAssignableFrom(this.d.getClass())) {
                return (com.meituan.mmp.lib.api.coverview.e) this.d;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
