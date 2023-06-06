package com.meituan.android.mrn.component.list.item;

import android.content.Context;
import android.view.View;
import com.facebook.react.views.view.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends f implements a {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private int d;
    private int e;
    private com.meituan.android.mrn.component.list.event.c f;

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0bb0df2c4c6460148315c1e9d82590c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0bb0df2c4c6460148315c1e9d82590c");
            return;
        }
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final void setListHeaderFooterChangedListener(com.meituan.android.mrn.component.list.event.c cVar) {
        this.f = cVar;
    }

    @Override // com.facebook.react.views.view.f, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f1222c1df800aedaae41c647515d265", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f1222c1df800aedaae41c647515d265");
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b601896261c85adce2f57ec19244e4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b601896261c85adce2f57ec19244e4d");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "145fd734bedf9404cbebc639b4cf9f09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "145fd734bedf9404cbebc639b4cf9f09");
        } else if (this.f != null) {
            this.f.a(this, z, i, i2, i3, i4);
        }
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final int getLayoutLeft() {
        return this.b;
    }

    public final int getLayoutTop() {
        return this.c;
    }

    public final int getLayoutRight() {
        return this.d;
    }

    public final int getLayoutBottom() {
        return this.e;
    }

    @Override // com.meituan.android.mrn.component.list.item.a
    public final int getLayoutWidth() {
        return this.d - this.b;
    }

    @Override // com.meituan.android.mrn.component.list.item.a
    public final int getLayoutHeight() {
        return this.e - this.c;
    }
}
