package com.sankuai.waimai.store.view.price;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.style.ReplacementSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends ReplacementSpan {
    public static ChangeQuickRedirect a;
    private final int b;

    @Override // android.text.style.ReplacementSpan
    public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
    }

    public f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cc1ac1cd9765c9e44c79084356f3588", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cc1ac1cd9765c9e44c79084356f3588");
        } else {
            this.b = i;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        return this.b;
    }
}
