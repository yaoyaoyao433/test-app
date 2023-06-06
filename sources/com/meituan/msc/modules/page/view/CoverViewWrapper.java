package com.meituan.msc.modules.page.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.msc.modules.api.msi.components.coverview.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CoverViewWrapper extends MSCCoverViewWrapper {
    public static ChangeQuickRedirect a;

    public CoverViewWrapper(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a86dcb0f2ca0ba521cccfe1a6c19a4ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a86dcb0f2ca0ba521cccfe1a6c19a4ca");
        }
    }

    public CoverViewWrapper(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ca3eda4c798110e3847a31946107c22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ca3eda4c798110e3847a31946107c22");
        }
    }

    public CoverViewWrapper(Context context, View view) {
        super(context, view);
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "042df1435e15998c9a8a54b4c89106b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "042df1435e15998c9a8a54b4c89106b7");
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8f4a7856102453f20fa5dda1947b8c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8f4a7856102453f20fa5dda1947b8c9");
        } else if (this.c instanceof k) {
            ((k) this.c).addView(view, i);
        } else {
            super.addView(view, i);
        }
    }

    @Nullable
    public final com.meituan.msc.modules.page.view.coverview.a getPageBackInterceptor() {
        if (this.c instanceof com.meituan.msc.modules.page.view.coverview.a) {
            return (com.meituan.msc.modules.page.view.coverview.a) this.c;
        }
        return null;
    }

    public final com.meituan.msc.modules.api.msi.components.coverview.c a(Class<com.meituan.msc.modules.api.msi.components.coverview.c> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49c13085ce1ca68b4490e2572284172e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.api.msi.components.coverview.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49c13085ce1ca68b4490e2572284172e");
        }
        try {
            if (cls.isAssignableFrom(this.c.getClass())) {
                return (com.meituan.msc.modules.api.msi.components.coverview.c) this.c;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
