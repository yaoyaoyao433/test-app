package com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a30f3ba2cfeee4158039b13bb28be77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a30f3ba2cfeee4158039b13bb28be77");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af2bafe4c9dfb9713aba8ac05cfc06aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af2bafe4c9dfb9713aba8ac05cfc06aa");
            return;
        }
        canvas.drawRect(this.d, this.b);
        this.c.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "960fdd10429f8f41ba3a6fc5601ffe6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "960fdd10429f8f41ba3a6fc5601ffe6d");
            return;
        }
        this.c.setBounds(rect.left, rect.top, rect.right, rect.top + ((this.c.getIntrinsicHeight() * rect.width()) / this.c.getIntrinsicWidth()));
        this.d.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3620e64b3a1020d091822ec76ce25434", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3620e64b3a1020d091822ec76ce25434")).intValue() : (int) this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2629996214f5ab018adb4fdb6a5203b4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2629996214f5ab018adb4fdb6a5203b4")).intValue() : (int) this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90214d34f448284d5e5b428c2ae92354", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90214d34f448284d5e5b428c2ae92354");
        } else {
            this.c.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c3c44e6a1e5eb1a7a51a42d32ff227d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c3c44e6a1e5eb1a7a51a42d32ff227d");
        } else {
            this.c.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2408999c2e81c4b6c6ef78a61b30a12d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2408999c2e81c4b6c6ef78a61b30a12d")).intValue() : this.c.getOpacity();
    }
}
