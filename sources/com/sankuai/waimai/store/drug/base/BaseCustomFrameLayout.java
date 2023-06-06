package com.sankuai.waimai.store.drug.base;

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
    protected Context c;

    public abstract View a(View view);

    public abstract int getLayoutId();

    public BaseCustomFrameLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a71aa8cc0065cab718c809fe83a936f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a71aa8cc0065cab718c809fe83a936f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72a6484122c7758c72fa2cde26a6b064", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72a6484122c7758c72fa2cde26a6b064");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d33973ad8141b5ba9ce0b8d00d65d188", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d33973ad8141b5ba9ce0b8d00d65d188");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b802f84be1c5b96aae2a218ef33031", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b802f84be1c5b96aae2a218ef33031");
            return;
        }
        this.b = null;
        this.c = context;
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc6dba63458dd5c31c1a6aca7762e259", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc6dba63458dd5c31c1a6aca7762e259");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "118bf53495df88954ce1036ae189f1b9", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "118bf53495df88954ce1036ae189f1b9") : (T) this.b.findViewById(i);
    }
}
