package com.sankuai.waimai.mach.imageloader;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.k;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements k {
    public static ChangeQuickRedirect a = null;
    private static final int c = 2131689542;
    private boolean b;
    private ImageView d;
    private WeakReference<Activity> e;
    private int f;
    private int g;

    public b(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2a54f54b46b5730822717104e99f8b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2a54f54b46b5730822717104e99f8b3");
        } else {
            a(imageView);
        }
    }

    public b(Activity activity, ImageView imageView) {
        Object[] objArr = {activity, imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f14cb50941a81f15a0d387ff49e1d6a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f14cb50941a81f15a0d387ff49e1d6a8");
            return;
        }
        this.e = new WeakReference<>(activity);
        a(imageView);
    }

    private void a(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cddc0492aa3e4b15cd21eb033e275184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cddc0492aa3e4b15cd21eb033e275184");
            return;
        }
        this.d = imageView;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        this.f = layoutParams.width;
        this.g = layoutParams.height;
    }

    @Override // com.sankuai.waimai.mach.k
    public final void a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e94ffb944f188e6034977774e41edc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e94ffb944f188e6034977774e41edc9");
        } else if (drawable != null || this.b) {
            this.d.setImageDrawable(drawable);
        }
    }

    @Override // com.sankuai.waimai.mach.k
    public final ImageView a() {
        return this.d;
    }

    @Override // com.sankuai.waimai.mach.k
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20e1aba22e8e4c507f1711ca047b3380", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20e1aba22e8e4c507f1711ca047b3380");
        } else {
            this.d.setTag(c, obj);
        }
    }

    @Override // com.sankuai.waimai.mach.k
    public final Object b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a8a4f44eec1cbc4682afc78c7f5a3ac", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a8a4f44eec1cbc4682afc78c7f5a3ac") : this.d.getTag(c);
    }

    @Override // com.sankuai.waimai.mach.k
    public final void a(boolean z) {
        this.b = z;
    }

    @Override // com.sankuai.waimai.mach.k
    public final Context c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da705bb72dad8ef6833337e317976658", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da705bb72dad8ef6833337e317976658");
        }
        Context context = this.d.getContext();
        return (this.e == null || this.e.get() == null) ? context : this.e.get();
    }
}
