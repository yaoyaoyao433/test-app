package com.sankuai.waimai.platform.widget.tag.virtualview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.NonNull;
import android.support.v4.util.Pools;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends f<h> {
    public static ChangeQuickRedirect c;
    private static final Pools.Pool<e> g = new Pools.SynchronizedPool(128);
    private Paint.FontMetrics h;

    @Override // com.sankuai.waimai.platform.widget.tag.virtualview.f
    public final /* synthetic */ void a(Canvas canvas, Paint paint, @NonNull h hVar, Path path) {
        h hVar2 = hVar;
        Object[] objArr = {canvas, paint, hVar2, path};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b074a46087e0f5c7504034bbc1ac42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b074a46087e0f5c7504034bbc1ac42");
        } else if (TextUtils.isEmpty(hVar2.f)) {
        } else {
            paint.setFlags(1);
            paint.setColor(hVar2.h);
            paint.setStyle(Paint.Style.FILL);
            paint.setFakeBoldText(hVar2.e);
            paint.setTextSize(hVar2.d);
            if (this.h == null) {
                this.h = new Paint.FontMetrics();
            }
            paint.getFontMetrics(this.h);
            canvas.drawText(hVar2.f, hVar2.i, Math.abs(this.h.ascent) + (((this.f.e.f - Math.abs(this.h.ascent)) - Math.abs(this.h.descent)) * 0.5f), paint);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualview.f, com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea71e14fe3cad2d0ff694a5f484fe7ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea71e14fe3cad2d0ff694a5f484fe7ad");
            return;
        }
        if (this.h != null) {
            this.h.ascent = 0.0f;
            this.h.descent = 0.0f;
            this.h.bottom = 0.0f;
            this.h.leading = 0.0f;
            this.h.top = 0.0f;
        }
        super.a();
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55b46fadef9c7528f76eebf1e1c366bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55b46fadef9c7528f76eebf1e1c366bd");
        } else {
            g.release(this);
        }
    }

    public static e a(@NonNull CanvasView.b bVar, com.sankuai.waimai.platform.widget.tag.virtualview.render.c<h> cVar) {
        Object[] objArr = {bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "004254abd19445822358efe590e7b0c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "004254abd19445822358efe590e7b0c0");
        }
        e acquire = g.acquire();
        if (acquire == null) {
            acquire = new e();
        }
        acquire.b(bVar, cVar);
        acquire.b = false;
        return acquire;
    }
}
