package com.sankuai.waimai.platform.widget.tag.virtualview;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.support.annotation.NonNull;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView;
import com.sankuai.waimai.platform.widget.tag.virtualview.b;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends f<com.sankuai.waimai.platform.widget.tag.virtualview.render.a> {
    public static ChangeQuickRedirect c;
    private static final Pools.Pool<c> g = new Pools.SynchronizedPool(128);
    private Bitmap h;
    private BitmapShader i;
    private Object j;
    private boolean k;

    @Override // com.sankuai.waimai.platform.widget.tag.virtualview.f
    public final /* synthetic */ void a(Canvas canvas, Paint paint, @NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.a aVar, Path path) {
        boolean z;
        com.sankuai.waimai.platform.widget.tag.virtualview.render.a aVar2 = aVar;
        Object[] objArr = {canvas, paint, aVar2, path};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0585ccbc746e868fd036461700468427", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0585ccbc746e868fd036461700468427");
        } else if (aVar2.d != null) {
            int i = this.f.e.e;
            int i2 = this.f.e.f;
            if (this.h == null) {
                String uri = aVar2.d.toString();
                this.j = uri;
                this.k = false;
                this.e.a(uri, i, i2, new a(i, i2));
                z = true;
                this.k = true;
            } else {
                z = true;
            }
            if (this.i != null) {
                paint.setAntiAlias(z);
                paint.setShader(this.i);
                canvas.drawPath(path, paint);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualview.f, com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8322725f4152e4eb439af0b6ebeb815", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8322725f4152e4eb439af0b6ebeb815");
            return;
        }
        this.h = null;
        this.i = null;
        this.j = null;
        super.a();
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39b7f5c742a3c1a6adda1ab701bbf9f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39b7f5c742a3c1a6adda1ab701bbf9f4");
        } else {
            g.release(this);
        }
    }

    public static c a(@NonNull CanvasView.b bVar, com.sankuai.waimai.platform.widget.tag.virtualview.render.c<com.sankuai.waimai.platform.widget.tag.virtualview.render.a> cVar) {
        Object[] objArr = {bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c162945f24b1bd269466cc12062eb26", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c162945f24b1bd269466cc12062eb26");
        }
        c acquire = g.acquire();
        if (acquire == null) {
            acquire = new c();
        }
        acquire.b(bVar, cVar);
        acquire.b = false;
        return acquire;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements b.a {
        public static ChangeQuickRedirect a;
        private final int c;
        private final int d;

        public a(int i, int i2) {
            Object[] objArr = {c.this, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c87792eb78539ab8d89d74796a4be50", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c87792eb78539ab8d89d74796a4be50");
                return;
            }
            this.c = i;
            this.d = i2;
        }

        @Override // com.sankuai.waimai.platform.widget.tag.virtualview.b.a
        public final void a(Bitmap bitmap, Object obj) {
            Object[] objArr = {bitmap, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fcf62c905f4939a793ba53d02491dc4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fcf62c905f4939a793ba53d02491dc4");
            } else if (Objects.equals(c.this.j, obj)) {
                c.this.h = bitmap;
                if (bitmap != null) {
                    c cVar = c.this;
                    Bitmap bitmap2 = c.this.h;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    cVar.i = new BitmapShader(bitmap2, tileMode, tileMode);
                    if (bitmap.getWidth() != this.c || bitmap.getHeight() != this.d) {
                        Matrix matrix = new Matrix();
                        matrix.setScale(this.c / bitmap.getWidth(), this.d / bitmap.getHeight());
                        c.this.i.setLocalMatrix(matrix);
                    }
                }
                if (c.this.k) {
                    c.this.e.a();
                }
            }
        }
    }
}
