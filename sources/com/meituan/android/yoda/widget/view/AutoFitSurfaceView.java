package com.meituan.android.yoda.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AutoFitSurfaceView extends SurfaceView {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;

    public AutoFitSurfaceView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17de5358dbd61b098d47f9b04908249a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17de5358dbd61b098d47f9b04908249a");
        }
    }

    private AutoFitSurfaceView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5e49a9c995f774e14090baaee36ec5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5e49a9c995f774e14090baaee36ec5a");
        }
    }

    public AutoFitSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08a63e220cc1326dc35c26077754a08a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08a63e220cc1326dc35c26077754a08a");
            return;
        }
        this.b = 0;
        this.c = 0;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9350a020479eb17fe095afbd7906888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9350a020479eb17fe095afbd7906888");
            return;
        }
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.b == 0 || this.c == 0) {
            setMeasuredDimension(size, size2);
        } else if (size < (this.b * size2) / this.c) {
            setMeasuredDimension(size, (this.c * size) / this.b);
        } else {
            setMeasuredDimension((this.b * size2) / this.c, size2);
        }
    }
}
