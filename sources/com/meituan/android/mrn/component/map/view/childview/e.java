package com.meituan.android.mrn.component.map.view.childview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public final class e extends com.facebook.react.views.view.f {
    public static ChangeQuickRedirect a;
    public boolean b;
    public f c;
    public volatile int d;
    public volatile int e;
    private boolean f;
    private Bitmap g;

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bd8252ccb50540658620cb08d676874", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bd8252ccb50540658620cb08d676874");
            return;
        }
        this.b = false;
        this.f = false;
        this.d = 0;
        this.e = 0;
    }

    public final Bitmap getMarkerIcon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbbd16808640561989fd0a3f6723915d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbbd16808640561989fd0a3f6723915d");
        }
        if (this.b) {
            if (!this.f) {
                Bitmap bitmap = this.g;
                if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() != this.d || bitmap.getHeight() != this.e) {
                    bitmap = Bitmap.createBitmap(this.d, this.e, Bitmap.Config.ARGB_8888);
                    this.g = bitmap;
                } else {
                    bitmap.eraseColor(0);
                }
                draw(new Canvas(bitmap));
                return bitmap;
            }
            View childAt = getChildAt(0);
            Bitmap bitmap2 = this.g;
            if (bitmap2 == null || bitmap2.isRecycled() || bitmap2.getWidth() != childAt.getWidth() || bitmap2.getHeight() != childAt.getHeight()) {
                bitmap2 = Bitmap.createBitmap(childAt.getWidth(), childAt.getHeight(), Bitmap.Config.ARGB_8888);
                this.g = bitmap2;
            } else {
                bitmap2.eraseColor(0);
            }
            childAt.draw(new Canvas(bitmap2));
            return bitmap2;
        }
        return com.meituan.android.mrn.component.map.utils.f.a();
    }

    public final void setParentMarker(f fVar) {
        this.c = fVar;
    }

    public final void setUseChild(boolean z) {
        this.f = z;
    }
}
