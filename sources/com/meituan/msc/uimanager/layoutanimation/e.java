package com.meituan.msc.uimanager.layoutanimation;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.concurrent.NotThreadSafe;
/* compiled from: ProGuard */
@NotThreadSafe
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    @Nullable
    private static Handler i;
    public final a b;
    public final a c;
    public final a d;
    final SparseArray<j> e;
    public boolean f;
    public long g;
    @Nullable
    public Runnable h;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db6b21721646079539445f5e6eb364c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db6b21721646079539445f5e6eb364c4");
            return;
        }
        this.b = new h();
        this.c = new k();
        this.d = new i();
        this.e = new SparseArray<>(0);
        this.g = -1L;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a576b7131903b53585b71570d85500d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a576b7131903b53585b71570d85500d6");
            return;
        }
        this.b.b();
        this.c.b();
        this.d.b();
        this.h = null;
        this.f = false;
        this.g = -1L;
    }

    public final boolean a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceb57fe09b73676fae829052992974d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceb57fe09b73676fae829052992974d0")).booleanValue();
        }
        if (view == null) {
            return false;
        }
        return (this.f && view.getParent() != null) || this.e.get(view.getId()) != null;
    }

    public final void a(View view, int i2, int i3, int i4, int i5) {
        Object[] objArr = {view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5743ce0a6144cd3bfec3129de2c2a5a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5743ce0a6144cd3bfec3129de2c2a5a2");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        final int id = view.getId();
        j jVar = this.e.get(id);
        if (jVar != null) {
            jVar.a(i2, i3, i4, i5);
            return;
        }
        Animation b = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.b : this.c).b(view, i2, i3, i4, i5);
        if (b instanceof j) {
            b.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.msc.uimanager.layoutanimation.e.2
                public static ChangeQuickRedirect a;

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    Object[] objArr2 = {animation};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0616f3895540aa5094467d497a8573f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0616f3895540aa5094467d497a8573f");
                    } else {
                        e.this.e.put(id, (j) animation);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    Object[] objArr2 = {animation};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0439bc658c957372a8bef42e900d05a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0439bc658c957372a8bef42e900d05a");
                    } else {
                        e.this.e.remove(id);
                    }
                }
            });
        } else {
            view.layout(i2, i3, i2 + i4, i3 + i5);
        }
        if (b != null) {
            long duration = b.getDuration();
            if (duration > this.g) {
                this.g = duration;
                a(duration);
            }
            view.startAnimation(b);
        }
    }

    public void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5dfe0e85abb65a7a33125a7e7f05c56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5dfe0e85abb65a7a33125a7e7f05c56");
            return;
        }
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                b(viewGroup.getChildAt(i2));
            }
        }
    }

    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d84743f288dc09e60ab4ce4339894e46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d84743f288dc09e60ab4ce4339894e46");
            return;
        }
        if (i == null) {
            i = new Handler(Looper.getMainLooper());
        }
        if (this.h != null) {
            i.removeCallbacks(this.h);
            i.postDelayed(this.h, j);
        }
    }
}
