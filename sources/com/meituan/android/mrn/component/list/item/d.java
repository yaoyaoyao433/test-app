package com.meituan.android.mrn.component.list.item;

import android.content.Context;
import android.view.View;
import com.facebook.react.views.view.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends f implements a {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private int d;
    private int e;
    private com.meituan.android.mrn.component.list.event.c f;

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20dc190a7620d73b5905ae6eb7dd860e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20dc190a7620d73b5905ae6eb7dd860e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bd9aa170b123a38ea7c9fbfaa7c6346", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bd9aa170b123a38ea7c9fbfaa7c6346");
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da9b36e3b56e4ebe4b8c5de54e2aa873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da9b36e3b56e4ebe4b8c5de54e2aa873");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41b77257e899e4b18b6c4611e5d0e0ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41b77257e899e4b18b6c4611e5d0e0ed");
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
