package com.sankuai.waimai.ugc.creator.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class WatchedImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private float[] b;
    private final float[] c;
    private final float[] d;
    private final RectF e;
    private a f;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(float[] fArr);
    }

    public WatchedImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ea9a65835e35c1c0b6f4796735a5b5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ea9a65835e35c1c0b6f4796735a5b5a");
            return;
        }
        this.b = new float[6];
        this.c = new float[6];
        this.d = new float[10];
        this.e = new RectF();
    }

    public WatchedImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d78f9e1cabaf94bd7bd4590028e0d4f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d78f9e1cabaf94bd7bd4590028e0d4f9");
            return;
        }
        this.b = new float[6];
        this.c = new float[6];
        this.d = new float[10];
        this.e = new RectF();
    }

    public WatchedImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ace379b1dc277dfadce8b02c3678e20f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ace379b1dc277dfadce8b02c3678e20f");
            return;
        }
        this.b = new float[6];
        this.c = new float[6];
        this.d = new float[10];
        this.e = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fa623e54941971461bb15dde75969b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fa623e54941971461bb15dde75969b8");
            return;
        }
        super.onDraw(canvas);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e8bd450a75d59fef0fb05cdedb6e60c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e8bd450a75d59fef0fb05cdedb6e60c");
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int width = drawable.getBounds().width();
            int height = drawable.getBounds().height();
            Matrix imageMatrix = getImageMatrix();
            imageMatrix.getValues(this.d);
            float f = height * this.d[4];
            this.e.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            imageMatrix.mapRect(this.e);
            this.c[0] = this.e.left;
            this.c[1] = this.e.top;
            this.c[2] = this.e.right;
            this.c[3] = this.e.bottom;
            this.c[4] = width * this.d[0];
            this.c[5] = f;
            if (Arrays.equals(this.b, this.c)) {
                return;
            }
            this.b = (float[]) this.c.clone();
            if (this.f != null) {
                post(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.widgets.WatchedImageView.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8b33eae171cec512fdb25a7eccbedbcd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8b33eae171cec512fdb25a7eccbedbcd");
                        } else {
                            WatchedImageView.this.f.a(WatchedImageView.this.b);
                        }
                    }
                });
            }
        }
    }

    public void setOnImageDisplayChangeListener(a aVar) {
        this.f = aVar;
    }
}
