package com.sankuai.waimai.mach.widget.decorations;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private View b;
    private c c;
    private com.sankuai.waimai.mach.widget.decorations.a d;
    private com.sankuai.waimai.mach.widget.d e;

    public d(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cb60596ee77b251cdd2327c9508ccd2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cb60596ee77b251cdd2327c9508ccd2");
        } else {
            this.b = view;
        }
    }

    public final void a(@NonNull com.sankuai.waimai.mach.widget.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11f474637a4d87efef9cc0e89bc35849", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11f474637a4d87efef9cc0e89bc35849");
            return;
        }
        this.e = dVar;
        if (dVar.t != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.c = new f(dVar.t, dVar.width, dVar.height, dVar.b());
            } else {
                this.c = new e(dVar.t, dVar.width, dVar.height, dVar.b());
            }
        }
        if (dVar.b != null) {
            this.d = new com.sankuai.waimai.mach.widget.decorations.a(dVar.b, dVar.width, dVar.height, dVar.b());
        }
    }

    public final void a(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55f5b24239ae8725fcc48a219023b7a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55f5b24239ae8725fcc48a219023b7a3");
        } else if (this.e == null || !this.e.c() || this.e.width <= 0 || this.e.height <= 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21 && this.e.a() && this.e.t == null) {
                this.b.setOutlineProvider(new a(new Rect(0, 0, this.e.width, this.e.height), this.e.b()[0]));
                this.b.setClipToOutline(true);
                return;
            }
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, this.e.width, this.e.height), this.e.b(), Path.Direction.CW);
            canvas.clipPath(path);
        }
    }

    public final void b(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "038da7cf35505ef4762d654785950191", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "038da7cf35505ef4762d654785950191");
        } else if (this.c != null) {
            this.c.draw(canvas);
        }
    }

    public final void c(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c10fc60f53dbf4f4d755a2fce2064df4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c10fc60f53dbf4f4d755a2fce2064df4");
        } else if (this.d == null || this.e == null || this.e.b == null) {
        } else {
            this.d.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @TargetApi(21)
    /* loaded from: classes5.dex */
    public static class a extends ViewOutlineProvider {
        public static ChangeQuickRedirect a;
        private final Rect b;
        private final float c;

        public a(Rect rect, float f) {
            Object[] objArr = {rect, Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a221b47657ad8e2885ae52fcd50a9dc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a221b47657ad8e2885ae52fcd50a9dc");
                return;
            }
            this.b = rect;
            this.c = f;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Object[] objArr = {view, outline};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e42acc059d426fba7aa12d10ddce47c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e42acc059d426fba7aa12d10ddce47c4");
            } else {
                outline.setRoundRect(this.b, this.c);
            }
        }
    }
}
