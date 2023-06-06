package com.tencent.mapsdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ZoomControls;
import com.tencent.mapsdk.internal.bk;
import com.tencent.mapsdk.internal.em;
import com.tencent.mapsdk.vector.VectorMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ri extends ek {
    public Context a;
    public ZoomControls b;
    so e;
    public boolean f;
    public boolean g;
    Bitmap h;
    Bitmap i;
    Bitmap j;
    Bitmap k;
    private LinearLayout n;
    private ViewGroup o;
    public rh c = null;
    private em.b l = em.b.RIGHT_BOTTOM;
    public bk.a d = null;
    private int m = 0;

    @Override // com.tencent.mapsdk.internal.ff
    public final void b(int i, int i2) {
    }

    public ri(Context context, so soVar) {
        this.a = context;
        this.e = soVar;
    }

    @Override // com.tencent.mapsdk.internal.em
    public final void c() {
        if (this.c != null) {
            rh rhVar = this.c;
            rhVar.setClickable(false);
            Drawable background = rhVar.getBackground();
            if (background != null) {
                background.setCallback(null);
            }
            rhVar.setBackgroundDrawable(null);
        }
    }

    @Override // com.tencent.mapsdk.internal.em
    public final boolean a(ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup == null) {
            return false;
        }
        this.o = viewGroup;
        if (this.n == null || this.n.getParent() != viewGroup) {
            this.n = new LinearLayout(this.a);
            this.n.setOrientation(1);
            viewGroup.addView(this.n);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int a = jv.a(this.a, 5);
        switch (this.l) {
            case LEFT_BOTTOM:
                layoutParams.gravity = 83;
                layoutParams.bottomMargin = a * 2;
                layoutParams.leftMargin = a;
                break;
            case CENTER_BOTTOM:
                layoutParams.gravity = 81;
                layoutParams.bottomMargin = a;
                break;
            case RIGHT_BOTTOM:
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = a * 6;
                layoutParams.rightMargin = a;
                break;
            case LEFT_TOP:
                layoutParams.gravity = 51;
                layoutParams.topMargin = a;
                layoutParams.leftMargin = a;
                break;
            case CENTER_TOP:
                layoutParams.gravity = 49;
                layoutParams.topMargin = a;
                break;
            case RIGHT_TOP:
                layoutParams.gravity = 53;
                layoutParams.topMargin = a;
                layoutParams.rightMargin = a;
                break;
            default:
                kj.c("Unknown position:" + this.l);
                break;
        }
        this.n.setGravity(layoutParams.gravity);
        this.n.setLayoutParams(layoutParams);
        if (this.g && this.b == null) {
            a(this.a);
        } else {
            e();
        }
        if (this.f && this.c == null) {
            b(this.a);
        } else {
            f();
        }
        a(v.b(bundle != null ? bundle.getInt(bk.a, -1) : -1));
        this.n.requestLayout();
        return true;
    }

    @Override // com.tencent.mapsdk.internal.em
    public final void a(em.b bVar) {
        if (this.l != bVar) {
            this.l = bVar;
            a(this.o, (Bundle) null);
        }
    }

    @Override // com.tencent.mapsdk.internal.em
    public final em.b d() {
        return this.l;
    }

    @SuppressLint({"ResourceType"})
    public final void a(Context context) {
        try {
            this.b = new ZoomControls(context);
            if (Build.VERSION.SDK_INT >= 17) {
                this.b.setId(View.generateViewId());
            } else {
                this.b.setId(-570425343);
            }
            this.b.setOnZoomInClickListener(new View.OnClickListener() { // from class: com.tencent.mapsdk.internal.ri.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((VectorMap) ri.this.e.e_).o.i.a((Runnable) null);
                }
            });
            this.b.setOnZoomOutClickListener(new View.OnClickListener() { // from class: com.tencent.mapsdk.internal.ri.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ((VectorMap) ri.this.e.e_).o.i.b((Runnable) null);
                }
            });
            e();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void e() {
        if (this.n == null || this.b == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (this.n.indexOfChild(this.b) < 0) {
            this.n.addView(this.b, layoutParams);
        } else {
            this.n.updateViewLayout(this.b, layoutParams);
        }
    }

    public final void b(Context context) {
        this.c = new rh(context);
        Bitmap b = gx.b(gx.b(this.a, "location_enable.png"));
        this.c.setScaleType(ImageView.ScaleType.CENTER);
        this.c.setImageBitmap(b);
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.mapsdk.internal.ri.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ri.this.d != null) {
                    ri.this.d.a();
                }
            }
        });
        f();
    }

    private void f() {
        if (this.n == null || this.c == null || this.e == null || this.e.e_ == 0) {
            return;
        }
        a(((mn) this.e.d_).l());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (this.n.indexOfChild(this.c) < 0) {
            if (this.b != null && this.n.indexOfChild(this.b) >= 0) {
                this.n.removeViewInLayout(this.b);
                this.n.addView(this.c, layoutParams);
                this.n.addView(this.b, layoutParams);
                return;
            }
            this.n.addView(this.c, layoutParams);
            return;
        }
        this.n.updateViewLayout(this.c, layoutParams);
    }

    private void a(boolean z) {
        if (this.c == null) {
            return;
        }
        if (z) {
            if (this.j == null || this.j.isRecycled()) {
                this.j = gx.b(gx.b(this.a, "location_state_dark_normal.png"));
            }
            if (this.k == null || this.k.isRecycled()) {
                this.k = gx.b(gx.b(this.a, "location_state_dark_selected.png"));
            }
        } else {
            if (this.h == null || this.h.isRecycled()) {
                this.h = gx.b(gx.b(this.a, "location_state_normal.png"));
            }
            if (this.i == null || this.i.isRecycled()) {
                this.i = gx.b(gx.b(this.a, "location_state_selected.png"));
            }
        }
        this.c.a(this.a, z ? this.j : this.h, z ? this.k : this.i);
        this.c.setVisibility(this.f ? 0 : 8);
    }

    private void a(bk.a aVar) {
        this.d = aVar;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.mapsdk.internal.ri$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass4 implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ boolean b;

        public AnonymousClass4(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ri.this.b.setIsZoomInEnabled(this.a);
            ri.this.b.setIsZoomOutEnabled(this.b);
        }
    }

    private void a(boolean z, boolean z2) {
        if (this.b != null) {
            jy.a(new AnonymousClass4(z, z2));
        }
    }

    private void b(boolean z) {
        this.g = z;
        if (z && this.b == null) {
            a(this.a);
        }
        if (this.b != null) {
            this.b.setVisibility(z ? 0 : 8);
        }
    }

    private boolean g() {
        return this.b != null && this.b.getVisibility() == 0;
    }

    private void c(boolean z) {
        this.f = z;
        if (z && this.c == null) {
            b(this.a);
        }
        if (this.c != null) {
            this.c.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.tencent.mapsdk.internal.ek, com.tencent.mapsdk.internal.em
    public final Rect a() {
        Rect rect = new Rect();
        if (this.b != null && this.c != null) {
            rect.bottom = Math.min(this.b.getBottom(), this.c.getBottom());
            rect.right = Math.max(this.b.getRight(), this.c.getRight());
            rect.left = Math.min(this.b.getLeft(), this.c.getLeft());
            rect.top = Math.min(this.b.getTop(), this.c.getTop());
        }
        return rect;
    }

    @Override // com.tencent.mapsdk.internal.ek
    public final View[] b() {
        return new View[]{this.b, this.c};
    }

    private FrameLayout.LayoutParams h() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int a = jv.a(this.a, 5);
        switch (this.l) {
            case LEFT_BOTTOM:
                layoutParams.gravity = 83;
                layoutParams.bottomMargin = a * 2;
                layoutParams.leftMargin = a;
                break;
            case CENTER_BOTTOM:
                layoutParams.gravity = 81;
                layoutParams.bottomMargin = a;
                break;
            case RIGHT_BOTTOM:
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = a * 6;
                layoutParams.rightMargin = a;
                break;
            case LEFT_TOP:
                layoutParams.gravity = 51;
                layoutParams.topMargin = a;
                layoutParams.leftMargin = a;
                break;
            case CENTER_TOP:
                layoutParams.gravity = 49;
                layoutParams.topMargin = a;
                break;
            case RIGHT_TOP:
                layoutParams.gravity = 53;
                layoutParams.topMargin = a;
                layoutParams.rightMargin = a;
                break;
            default:
                kj.c("Unknown position:" + this.l);
                break;
        }
        return layoutParams;
    }
}
