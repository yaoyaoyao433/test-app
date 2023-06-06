package com.sankuai.waimai.store.mach.kingkongscroller;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class KingKongScrollBarView extends View {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    int d;
    private Paint e;

    public KingKongScrollBarView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b17fb0f7f4d14cee01d0b665317892ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b17fb0f7f4d14cee01d0b665317892ab");
        } else {
            a();
        }
    }

    public KingKongScrollBarView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0399dcad66d16584d0b79bcd17706ea2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0399dcad66d16584d0b79bcd17706ea2");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "859e6aae4ecbeda67bf703702cc49786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "859e6aae4ecbeda67bf703702cc49786");
            return;
        }
        setWillNotDraw(false);
        this.e = new Paint(1);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a66a195ed9e12d74e7e3d9a36f5ccbde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a66a195ed9e12d74e7e3d9a36f5ccbde");
            return;
        }
        int height = getHeight();
        int width = getWidth();
        int a2 = h.a(getContext(), 1.0f);
        int a3 = h.a(getContext(), 0.5f);
        this.e.setColor(-1906706);
        float f = height / 2;
        canvas.drawRoundRect(0.0f, a2, width, height - a2, f, f, this.e);
        this.e.setColor(this.d);
        canvas.drawRoundRect(Math.max(this.c, 0), a3, Math.min(this.c + this.b, width), height - a3, f, f, this.e);
    }
}
