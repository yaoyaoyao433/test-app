package com.meituan.msc.views.imagehelper;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.PicassoDrawable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends PicassoDrawable {
    public static ChangeQuickRedirect a;
    private PicassoDrawable b;
    private a c;
    private boolean d;

    public c(PicassoDrawable picassoDrawable, int i) {
        this(new a(picassoDrawable.getConstantState(), i), picassoDrawable, null);
        Object[] objArr = {picassoDrawable, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f358975560e641de1ef370a84a8e85ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f358975560e641de1ef370a84a8e85ad");
        }
    }

    public c(a aVar, PicassoDrawable picassoDrawable, Resources resources) {
        Object[] objArr = {aVar, picassoDrawable, resources};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "152c87cbc45d545060488a9e59135446", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "152c87cbc45d545060488a9e59135446");
            return;
        }
        this.c = aVar;
        if (picassoDrawable != null) {
            this.b = picassoDrawable;
        } else if (resources != null) {
            this.b = (PicassoDrawable) aVar.b.newDrawable(resources);
        } else {
            this.b = (PicassoDrawable) aVar.b.newDrawable();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a29658802e3b809aba34cdfdaac145b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a29658802e3b809aba34cdfdaac145b0");
            return;
        }
        super.setBounds(i, i2, i3, i4);
        if (this.b != null) {
            this.b.setBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2ef92512acaba2737dd2252acf57748", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2ef92512acaba2737dd2252acf57748");
            return;
        }
        super.setBounds(rect);
        if (this.b != null) {
            this.b.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07809bb841ee43907f9729b35a066058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07809bb841ee43907f9729b35a066058");
        } else if (this.b != null) {
            this.b.setChangingConfigurations(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32df25af30507d8e3c6842089bef2b34", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32df25af30507d8e3c6842089bef2b34")).intValue();
        }
        if (this.b != null) {
            return this.b.getChangingConfigurations();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34f9b28fd5288a56fbd3336b2fc76184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34f9b28fd5288a56fbd3336b2fc76184");
        } else if (this.b != null) {
            this.b.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88edece969388acb6676aff687b1db72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88edece969388acb6676aff687b1db72");
        } else if (this.b != null) {
            this.b.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(11)
    public final Drawable.Callback getCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d111e4321784ec0920f5977a5f9380f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable.Callback) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d111e4321784ec0920f5977a5f9380f");
        }
        if (this.b != null) {
            return this.b.getCallback();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(19)
    public final int getAlpha() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdeae9e3b96a0094e840f336d830b502", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdeae9e3b96a0094e840f336d830b502")).intValue();
        }
        if (this.b != null) {
            return this.b.getAlpha();
        }
        return 255;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        Object[] objArr = {Integer.valueOf(i), mode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d06ad5c7b05fa130dfabcbfad322656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d06ad5c7b05fa130dfabcbfad322656");
        } else if (this.b != null) {
            this.b.setColorFilter(i, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa7a71a84d08b37677f12f467c4b5a83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa7a71a84d08b37677f12f467c4b5a83");
        } else if (this.b != null) {
            this.b.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c412951bc2474cc32e3855079fb4168a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c412951bc2474cc32e3855079fb4168a");
        }
        if (this.b != null) {
            return this.b.getCurrent();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fcacf449f6b0066071e6d2f3113f9e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fcacf449f6b0066071e6d2f3113f9e3")).booleanValue();
        }
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc4545ef9c7c0bf7aad51216fe8866f4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc4545ef9c7c0bf7aad51216fe8866f4")).intValue() : this.c.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d750f71e8195cda1a771ed055fc71c37", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d750f71e8195cda1a771ed055fc71c37")).intValue() : this.c.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "638147070b4d4f2915c2e84a531bc40f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "638147070b4d4f2915c2e84a531bc40f")).intValue();
        }
        if (this.b != null) {
            return this.b.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cddfbadc502d9b34cc0398b89fa65fbc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cddfbadc502d9b34cc0398b89fa65fbc")).intValue();
        }
        if (this.b != null) {
            return this.b.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74a7990ffddd0d19404c25bd28725545", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74a7990ffddd0d19404c25bd28725545")).booleanValue();
        }
        if (this.b != null) {
            return this.b.getPadding(rect);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8040d09f5ada5de96ce3ee6970bfdb3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8040d09f5ada5de96ce3ee6970bfdb3d");
            return;
        }
        super.invalidateSelf();
        if (this.b != null) {
            this.b.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73d27007e25c4ce58b0a817b80545732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73d27007e25c4ce58b0a817b80545732");
            return;
        }
        super.unscheduleSelf(runnable);
        if (this.b != null) {
            this.b.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e62aae8860119f4e4b39f21d374bcb74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e62aae8860119f4e4b39f21d374bcb74");
            return;
        }
        super.scheduleSelf(runnable, j);
        if (this.b != null) {
            this.b.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9b9680eb0d8206ded4a9ed09c09bde7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9b9680eb0d8206ded4a9ed09c09bde7");
        } else if (this.b != null) {
            this.b.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "301e5a50caa4a1d86fe1ebee46973a00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "301e5a50caa4a1d86fe1ebee46973a00");
        } else if (this.b != null) {
            this.b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11220f2e6a8d58dcaf748909d4cd4198", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11220f2e6a8d58dcaf748909d4cd4198");
        } else if (this.b != null) {
            this.b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "617b78d29c28fe2ba255591ab8a577c9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "617b78d29c28fe2ba255591ab8a577c9")).intValue();
        }
        if (this.b != null) {
            return this.b.getOpacity();
        }
        return 0;
    }

    @Override // com.squareup.picasso.PicassoDrawable
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7996c08e607fabc362903dc8b44edc6a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7996c08e607fabc362903dc8b44edc6a")).booleanValue();
        }
        if (this.b != null) {
            return this.b.a();
        }
        return false;
    }

    @Override // com.squareup.picasso.PicassoDrawable
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3aa9616e645a4f3185d16ec9d0f7c9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3aa9616e645a4f3185d16ec9d0f7c9b");
        } else if (this.b != null) {
            this.b.a(i);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9a6e40ee85d42402f1aaaae2aec7b44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9a6e40ee85d42402f1aaaae2aec7b44");
        } else if (this.b != null) {
            this.b.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5eff5b65c35238ef25c763a6d07c60b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5eff5b65c35238ef25c763a6d07c60b");
        } else if (this.b != null) {
            this.b.stop();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "848e3861652f3d27e6e9f41dcfb51b19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "848e3861652f3d27e6e9f41dcfb51b19")).booleanValue();
        }
        if (this.b != null) {
            return this.b.isRunning();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38fd99f601f783cf2f9843d0d1649797", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38fd99f601f783cf2f9843d0d1649797");
        }
        if (!this.d && super.mutate() == this) {
            this.b = (PicassoDrawable) this.b.mutate();
            this.c = new a(this.c);
            this.d = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends Drawable.ConstantState {
        public static ChangeQuickRedirect a;
        private final Drawable.ConstantState b;
        private final int c;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        public a(a aVar) {
            this(aVar.b, aVar.c);
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eded7f842b5754aae31e5bfe21926aee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eded7f842b5754aae31e5bfe21926aee");
            }
        }

        public a(Drawable.ConstantState constantState, int i) {
            Object[] objArr = {constantState, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e65f4248f46a71c8fe16cdbce89e130f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e65f4248f46a71c8fe16cdbce89e130f");
                return;
            }
            this.b = constantState;
            this.c = i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da73ab6d7da0a34e46bdbac7d769ad02", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da73ab6d7da0a34e46bdbac7d769ad02") : newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            Object[] objArr = {resources};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bc0727fac4be08e733c2ff17839c6b6", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bc0727fac4be08e733c2ff17839c6b6") : new c(this, null, resources);
        }
    }
}
