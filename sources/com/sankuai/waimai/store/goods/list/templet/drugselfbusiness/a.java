package com.sankuai.waimai.store.goods.list.templet.drugselfbusiness;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
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
    private final Paint b;
    private final BitmapDrawable c;
    private final RectF d;

    public a(Resources resources, Bitmap bitmap) {
        Object[] objArr = {resources, bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfb074e5245055f0ac74191900e61e8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfb074e5245055f0ac74191900e61e8b");
            return;
        }
        this.b = new Paint();
        this.b.setStyle(Paint.Style.FILL);
        this.b.setAntiAlias(true);
        this.b.setColor(-657930);
        this.d = new RectF();
        this.c = new BitmapDrawable(resources, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "975aa65ac28020b4651f953a686fad1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "975aa65ac28020b4651f953a686fad1c");
            return;
        }
        canvas.drawRect(this.d, this.b);
        this.c.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc367dcda7ca6a9e70d2f8dacfd41bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc367dcda7ca6a9e70d2f8dacfd41bb");
            return;
        }
        this.c.setBounds(rect.left, rect.top, rect.right, rect.top + ((this.c.getIntrinsicHeight() * rect.width()) / this.c.getIntrinsicWidth()));
        this.d.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf2ffe25f13f4c33577642fd37abdc89", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf2ffe25f13f4c33577642fd37abdc89")).intValue() : (int) this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d63a565113b6ca7b41dff55be41ac0d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d63a565113b6ca7b41dff55be41ac0d")).intValue() : (int) this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f9d0b9b5195f74173797d34446103c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f9d0b9b5195f74173797d34446103c");
        } else {
            this.c.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b92f556a6b5e528068bc301324ed2ad3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b92f556a6b5e528068bc301324ed2ad3");
        } else {
            this.c.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f606d2a0c420f71990e869a1cda70a22", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f606d2a0c420f71990e869a1cda70a22")).intValue() : this.c.getOpacity();
    }
}
