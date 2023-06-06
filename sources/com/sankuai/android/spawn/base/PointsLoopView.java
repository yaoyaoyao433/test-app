package com.sankuai.android.spawn.base;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PointsLoopView extends TextView {
    public static ChangeQuickRedirect a = null;
    static int c = 600;
    public int b;
    String d;
    Handler e;
    Runnable f;
    boolean g;

    public static /* synthetic */ void b(PointsLoopView pointsLoopView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, pointsLoopView, changeQuickRedirect, false, "2a086ec912a4fb8c8c4a92cdce8ce256", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, pointsLoopView, changeQuickRedirect, false, "2a086ec912a4fb8c8c4a92cdce8ce256");
            return;
        }
        switch (pointsLoopView.b) {
            case 0:
                pointsLoopView.setText(pointsLoopView.d + CommonConstant.Symbol.DOT);
                return;
            case 1:
                pointsLoopView.setText(pointsLoopView.d + "..");
                return;
            case 2:
                pointsLoopView.setText(pointsLoopView.d + "...");
                return;
            default:
                pointsLoopView.setText(pointsLoopView.d);
                return;
        }
    }

    public PointsLoopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d55252a7968d63abaa6891a39b1b477", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d55252a7968d63abaa6891a39b1b477");
            return;
        }
        this.b = 0;
        this.g = true;
        c();
    }

    public PointsLoopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22988b5bfb2d09c27c9e4eb3716b6afc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22988b5bfb2d09c27c9e4eb3716b6afc");
            return;
        }
        this.b = 0;
        this.g = true;
        c();
    }

    public PointsLoopView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dfa422b18c00dca6cc64e793784f4b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dfa422b18c00dca6cc64e793784f4b5");
            return;
        }
        this.b = 0;
        this.g = true;
        c();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5d3e1e54fd608ee76bde58c6fa5ca45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5d3e1e54fd608ee76bde58c6fa5ca45");
            return;
        }
        if (this.e != null) {
            this.e.removeCallbacks(this.f);
        }
        if (!this.g) {
            setText(this.d);
        }
        this.g = true;
        this.b = 0;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f5273f8e4db8b30905afec737611bf7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f5273f8e4db8b30905afec737611bf7");
            return;
        }
        this.d = getText().toString();
        setWidth(getWidth() + MapConstant.ANIMATION_DURATION_SHORT);
        this.e = new Handler();
        this.f = new Runnable() { // from class: com.sankuai.android.spawn.base.PointsLoopView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14c8a344a4b80f8146e2a3eb01b32df8", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14c8a344a4b80f8146e2a3eb01b32df8");
                } else if (PointsLoopView.this.g) {
                } else {
                    PointsLoopView.this.b %= 4;
                    PointsLoopView.b(PointsLoopView.this);
                    PointsLoopView.this.b++;
                    if (PointsLoopView.this.e != null) {
                        PointsLoopView.this.e.postDelayed(PointsLoopView.this.f, PointsLoopView.c);
                    }
                }
            }
        };
    }
}
