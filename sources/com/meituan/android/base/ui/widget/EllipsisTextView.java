package com.meituan.android.base.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EllipsisTextView extends TextView {
    public static ChangeQuickRedirect a;
    private final int b;
    private final int c;
    private final int d;
    private int e;
    private int f;
    private String g;
    private a h;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public EllipsisTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3494e767a4def354faa5bf8cec56e7e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3494e767a4def354faa5bf8cec56e7e3");
            return;
        }
        this.b = 1;
        this.c = 2;
        this.d = 100;
        this.e = 1;
        this.f = 3;
        this.g = "...";
    }

    public EllipsisTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e80229ceb19a68f00bb2ff6e47b77a2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e80229ceb19a68f00bb2ff6e47b77a2e");
            return;
        }
        this.b = 1;
        this.c = 2;
        this.d = 100;
        this.e = 1;
        this.f = 3;
        this.g = "...";
    }

    public int getMaxRows() {
        return this.f;
    }

    public void setMaxRows(int i) {
        if (i > 0) {
            this.f = i;
        }
    }

    public int getStatus() {
        return this.e;
    }

    public void setPlotEvent(a aVar) {
        this.h = aVar;
    }
}
