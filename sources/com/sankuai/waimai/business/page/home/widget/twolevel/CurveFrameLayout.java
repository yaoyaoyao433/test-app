package com.sankuai.waimai.business.page.home.widget.twolevel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CurveFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    private boolean b;
    private Path c;

    public CurveFrameLayout(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67fc5c0c87f5b4ee8e975949ddf9a41b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67fc5c0c87f5b4ee8e975949ddf9a41b");
            return;
        }
        this.c = null;
        setWillNotDraw(false);
    }

    public CurveFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "297a39f3306947cfdbb167195bef253e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "297a39f3306947cfdbb167195bef253e");
            return;
        }
        this.c = null;
        setWillNotDraw(false);
    }

    public CurveFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64265d856d6a905f838537860a60d4fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64265d856d6a905f838537860a60d4fc");
            return;
        }
        this.c = null;
        setWillNotDraw(false);
    }

    public CurveFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b4575789227704fb343f58143a80bd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b4575789227704fb343f58143a80bd4");
            return;
        }
        this.c = null;
        setWillNotDraw(false);
    }

    public void setShouldDrawCurve(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa6c03847e83f6c391fd2a8487e97372", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa6c03847e83f6c391fd2a8487e97372");
            return;
        }
        this.b = z;
        a();
    }

    private void a() {
        if (this.c != null) {
            this.c = null;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18afc9a931ade69b3232753646864e31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18afc9a931ade69b3232753646864e31");
        } else {
            super.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "893e160c92719531dd0a46244823cab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "893e160c92719531dd0a46244823cab3");
            return;
        }
        super.onDraw(canvas);
        if (!this.b) {
            a();
            return;
        }
        if (this.c == null) {
            int a2 = g.a(com.meituan.android.singleton.b.a, 10.0f);
            int width = getWidth();
            int height = getHeight();
            this.c = new Path();
            this.c.moveTo(0.0f, 0.0f);
            float f = height - a2;
            this.c.lineTo(0.0f, f);
            float f2 = width;
            this.c.quadTo(0.5f * f2, height + a2, f2, f);
            this.c.lineTo(f2, 0.0f);
            this.c.lineTo(0.0f, 0.0f);
            this.c.close();
        }
        canvas.clipPath(this.c);
    }
}
