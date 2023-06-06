package com.sankuai.waimai.store.base;

import android.content.Context;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class BaseCustomFrameLayout extends BaseFrameLayout {
    public static ChangeQuickRedirect a;
    protected View b;
    public Context c;

    public abstract View a(View view);

    public abstract int getLayoutId();

    public BaseCustomFrameLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40da07f01594f77f03abeedf810d9a13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40da07f01594f77f03abeedf810d9a13");
            return;
        }
        this.b = null;
        this.c = context;
        a((AttributeSet) null);
    }

    public BaseCustomFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddbbd86277dea9d0e5c596380f891579", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddbbd86277dea9d0e5c596380f891579");
            return;
        }
        this.b = null;
        this.c = context;
        a(attributeSet);
    }

    public BaseCustomFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a8c09b20ff8dbb7956d60fb1f7f128f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a8c09b20ff8dbb7956d60fb1f7f128f");
            return;
        }
        this.b = null;
        this.c = context;
        a(attributeSet);
    }

    @RequiresApi(api = 21)
    public BaseCustomFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a1ad59b86fa8ebb163a62944848744d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a1ad59b86fa8ebb163a62944848744d");
            return;
        }
        this.b = null;
        this.c = context;
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e08b40d6221a66c645f84794ba524a88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e08b40d6221a66c645f84794ba524a88");
            return;
        }
        int layoutId = getLayoutId();
        if (-1 != layoutId) {
            this.b = LayoutInflater.from(getContext()).inflate(layoutId, (ViewGroup) this, true);
        }
        this.b = a(this.b);
    }

    public final <T extends View> T a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59bd87a13aece0f7e3ffda14678736ab", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59bd87a13aece0f7e3ffda14678736ab") : (T) this.b.findViewById(i);
    }
}
