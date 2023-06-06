package com.sankuai.waimai.platform.widget.weather;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
import java.util.HashSet;
import java.util.Set;
import rx.j;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes5.dex */
public class ScrollImageView extends ImageView {
    public static ChangeQuickRedirect a;
    public float b;
    public float c;
    private float d;
    private Bitmap e;
    private Rect f;
    private boolean g;
    private boolean h;
    private int i;
    private Set<Integer> j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public int a;
        public int b;
    }

    public ScrollImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3085f7ef38f68bea263bc728924e190f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3085f7ef38f68bea263bc728924e190f");
        }
    }

    public ScrollImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dacacf2e56d86b97b99fc8bc2d2612ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dacacf2e56d86b97b99fc8bc2d2612ba");
            return;
        }
        this.f = new Rect();
        this.h = true;
        this.b = 0.0f;
        this.c = 0.0f;
        this.j = new HashSet();
        this.j.add(1);
        this.j.add(0);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.scroll_direction, R.attr.scroll_drawable}, i, 0);
        this.i = obtainStyledAttributes.getInt(0, 1);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId > 0) {
            setImageDrawable(null);
            setScrollImageRes(resourceId);
        }
        obtainStyledAttributes.recycle();
        if (this.d <= 0.0f) {
            this.d = g.a(getContext(), 6.0f);
        }
        if (this.i == 0 || this.i == 2) {
            this.d = -this.d;
        }
        a();
    }

    public void setSpeed(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63f24dc9f25433819deef9a7edb14c58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63f24dc9f25433819deef9a7edb14c58");
            return;
        }
        this.d = i * 0.016f;
        if (this.i == 0 || this.i == 2) {
            this.d = (-i) * 0.016f;
        }
    }

    public void setScrollImageRes(int i) {
        int floor;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f809349714bd4689990a13a821b9c82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f809349714bd4689990a13a821b9c82");
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.sankuai.waimai.launcher.util.image.a.a(getResources(), i, options);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        if (this.j.contains(Integer.valueOf(this.i))) {
            floor = (int) Math.floor((options.outWidth * 1.0f) / g.a(getContext()));
        } else {
            floor = (int) Math.floor((options.outHeight * 1.0f) / g.b(getContext()));
        }
        options2.inSampleSize = floor;
        a(com.sankuai.waimai.launcher.util.image.a.a(getResources(), i, options2), false);
    }

    public final void a(String str, final int i, final int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8069bafe27b25a301221a02a2da0aa09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8069bafe27b25a301221a02a2da0aa09");
            return;
        }
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = getContext();
        a2.c = str;
        b.C0608b a3 = a2.a(i);
        a3.f = ImageQualityUtil.a();
        a3.a(new b.a() { // from class: com.sankuai.waimai.platform.widget.weather.ScrollImageView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a() {
            }

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a(Bitmap bitmap) {
                Object[] objArr2 = {bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f0a774564ab75906e7edc7cafea0ccd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f0a774564ab75906e7edc7cafea0ccd");
                } else if (bitmap != null) {
                    ScrollImageView.this.a(Bitmap.createScaledBitmap(bitmap, i2, i, true), false);
                }
            }
        });
    }

    public void setScrollImageResAsync(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ee7cee0806169d8f123b7ed6a747863", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ee7cee0806169d8f123b7ed6a747863");
            return;
        }
        setBackgroundColor(0);
        rx.d.a(new j<Bitmap>() { // from class: com.sankuai.waimai.platform.widget.weather.ScrollImageView.2
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onCompleted() {
            }

            @Override // rx.e
            public final void onError(Throwable th) {
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                Object[] objArr2 = {bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "beac91960ec88e2764bdeaeda3e4f560", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "beac91960ec88e2764bdeaeda3e4f560");
                } else {
                    ScrollImageView.this.a(bitmap, false);
                }
            }
        }, rx.d.a(Integer.valueOf(i)).b(rx.schedulers.a.e()).d(new rx.functions.g<Integer, Bitmap>() { // from class: com.sankuai.waimai.platform.widget.weather.ScrollImageView.3
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ Bitmap call(Integer num) {
                int floor;
                Object[] objArr2 = {num};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e18ba207787edb6bfec18ce999229e8", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Bitmap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e18ba207787edb6bfec18ce999229e8");
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.sankuai.waimai.launcher.util.image.a.a(ScrollImageView.this.getContext().getResources(), i, options);
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                if (ScrollImageView.this.j.contains(Integer.valueOf(ScrollImageView.this.i))) {
                    floor = (int) Math.floor((options.outWidth * 1.0f) / g.a(ScrollImageView.this.getContext()));
                } else {
                    floor = (int) Math.floor((options.outHeight * 1.0f) / g.b(ScrollImageView.this.getContext()));
                }
                options2.inSampleSize = floor;
                return com.sankuai.waimai.launcher.util.image.a.a(ScrollImageView.this.getContext().getResources(), i, options2);
            }
        }).a(rx.android.schedulers.a.a()));
    }

    public final void a(Bitmap bitmap, boolean z) {
        Object[] objArr = {bitmap, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bec1fd0de926254679b638d6467b1486", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bec1fd0de926254679b638d6467b1486");
        } else if (bitmap == null) {
        } else {
            this.e = bitmap;
            requestLayout();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        a aVar;
        BitmapFactory.Options options;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b62aa7627b1f2d3827509f3ea580a624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b62aa7627b1f2d3827509f3ea580a624");
            return;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        com.sankuai.waimai.launcher.util.image.a.a(getResources(), i, options2);
        Context context = getContext();
        Object[] objArr2 = {context, this, options2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d9edc3c6a893c7ac92cf5291bef2f02", RobustBitConfig.DEFAULT_VALUE)) {
            options = (BitmapFactory.Options) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d9edc3c6a893c7ac92cf5291bef2f02");
        } else {
            BitmapFactory.Options options3 = new BitmapFactory.Options();
            options3.inPreferredConfig = Bitmap.Config.RGB_565;
            Object[] objArr3 = {context, this};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2eab4c6fc0c69f700aa423f559e34267", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2eab4c6fc0c69f700aa423f559e34267");
            } else if (context == null) {
                aVar = null;
            } else {
                aVar = new a();
                DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                int width = getWidth();
                if (width <= 0) {
                    width = layoutParams.width;
                }
                if (width <= 0) {
                    width = g.a(context);
                }
                if (width <= 0) {
                    width = displayMetrics.widthPixels;
                }
                int height = getHeight();
                if (height <= 0) {
                    height = layoutParams.height;
                }
                if (height <= 0) {
                    height = g.b(context);
                }
                if (height <= 0) {
                    height = displayMetrics.heightPixels;
                }
                aVar.a = width;
                aVar.b = height;
            }
            int floor = (int) Math.floor((options2.outWidth * 1.0f) / aVar.a);
            int floor2 = (int) Math.floor((options2.outHeight * 1.0f) / aVar.b);
            if (floor > floor2) {
                floor2 = floor;
            }
            options3.inSampleSize = floor2;
            options = options3;
        }
        setImageBitmap(com.sankuai.waimai.launcher.util.image.a.a(getResources(), i, options));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a50a31ef3de82ee2329f002f6d0b46b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a50a31ef3de82ee2329f002f6d0b46b0");
            return;
        }
        super.onMeasure(i, i2);
        if (this.e == null) {
            return;
        }
        if (this.j.contains(Integer.valueOf(this.i))) {
            setMeasuredDimension(this.e.getWidth(), View.MeasureSpec.getSize(i2));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), this.e.getHeight());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        int width;
        int width2;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5dea2b9e8413897e1364818b03f2ad3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5dea2b9e8413897e1364818b03f2ad3");
            return;
        }
        super.onDraw(canvas);
        if (canvas == null || this.e == null) {
            return;
        }
        canvas.getClipBounds(this.f);
        if (this.h) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e41b6e37558b53d93f84398bd8d5296", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e41b6e37558b53d93f84398bd8d5296");
            } else if (this.i == 1) {
                this.c = this.f.height() - this.e.getHeight();
            } else if (this.i == 3) {
                this.b = this.f.width() - this.e.getWidth();
            }
            this.h = false;
        }
        if (this.j.contains(Integer.valueOf(this.i))) {
            f = this.c;
            width = this.e.getHeight();
            width2 = this.f.height();
        } else {
            f = this.b;
            width = this.e.getWidth();
            width2 = this.f.width();
        }
        while (f <= (-width)) {
            f += width;
        }
        while (f > 0.0f) {
            f -= width;
        }
        while (f < width2) {
            if (this.j.contains(Integer.valueOf(this.i))) {
                canvas.drawBitmap(this.e, 0.0f, f, (Paint) null);
            } else {
                canvas.drawBitmap(this.e, f, 0.0f, (Paint) null);
            }
            f += width;
        }
        if (this.g) {
            if (this.j.contains(Integer.valueOf(this.i))) {
                this.c += this.d;
            } else {
                this.b += this.d;
            }
            invalidate();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8819684520732a196e9d7dbcb4a410f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8819684520732a196e9d7dbcb4a410f5");
        } else if (this.g) {
        } else {
            this.g = true;
            invalidate();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "039b70ab5cee1a23458ce5628ae5cd48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "039b70ab5cee1a23458ce5628ae5cd48");
        } else if (this.g) {
            this.g = false;
            invalidate();
        }
    }
}
