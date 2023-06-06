package com.sankuai.waimai.store.widgets.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends Drawable {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private final Paint g;
    private final RectF h;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ca6b39eaa8d73ebdecfd7590d315af5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ca6b39eaa8d73ebdecfd7590d315af5");
            return;
        }
        this.g = new Paint();
        this.g.setStyle(Paint.Style.FILL);
        this.g.setAntiAlias(true);
        this.h = new RectF();
        this.b = -1;
        this.c = -657930;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aab4b514c92180dc97d6b06c22d56bfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aab4b514c92180dc97d6b06c22d56bfa");
            return;
        }
        float f = this.h.top - this.f;
        float f2 = f + this.d;
        this.g.setColor(this.b);
        canvas.drawRect(this.h.left, f, this.h.right, f2, this.g);
        float f3 = f2 + this.e;
        Object[] objArr2 = {Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        LinearGradient linearGradient = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f91335097860b03edd23670810a666a8", RobustBitConfig.DEFAULT_VALUE) ? (LinearGradient) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f91335097860b03edd23670810a666a8") : new LinearGradient(this.h.left, f2, this.h.left, f3, this.b, this.c, Shader.TileMode.CLAMP);
        this.g.setColor(-1);
        this.g.setShader(linearGradient);
        canvas.drawRect(this.h.left, f2, this.h.right, f3, this.g);
        this.g.setColor(this.c);
        canvas.drawRect(this.h.left, f3, this.h.right, this.h.bottom, this.g);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e47191514235111237766a3451c11de4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e47191514235111237766a3451c11de4");
        } else {
            this.h.set(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bbf699d843778c6d789d15963084bbd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bbf699d843778c6d789d15963084bbd")).intValue() : (int) this.h.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e4605b43383542a8843193db338b51", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e4605b43383542a8843193db338b51")).intValue() : (int) this.h.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46fb661dea64ee3cc84ea54b568ffd7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46fb661dea64ee3cc84ea54b568ffd7e");
        } else {
            this.g.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc8b86f42652200759cd528822b5f3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc8b86f42652200759cd528822b5f3c");
        } else {
            this.g.setColorFilter(colorFilter);
        }
    }
}
