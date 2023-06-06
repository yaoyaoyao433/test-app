package com.meituan.android.upgrade.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.upgrade.f;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.android.uptodate.util.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class UpgradeBaseDialog extends Dialog {
    public static ChangeQuickRedirect a;
    protected Context b;
    protected VersionInfo c;
    protected com.meituan.android.upgrade.ui.a d;
    protected f e;
    public a f;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract void a(UpgradeBaseDialog upgradeBaseDialog);

        public abstract void b(UpgradeBaseDialog upgradeBaseDialog);

        public abstract void c(UpgradeBaseDialog upgradeBaseDialog);

        public abstract void d(UpgradeBaseDialog upgradeBaseDialog);
    }

    public abstract void a(VersionInfo versionInfo);

    public UpgradeBaseDialog(Context context, VersionInfo versionInfo, f fVar) {
        this(context, versionInfo, fVar, R.style.UpgradeTransparentDialog);
        Object[] objArr = {context, versionInfo, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f12dde1f131390604c7ec6814f62b7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f12dde1f131390604c7ec6814f62b7e");
        }
    }

    private UpgradeBaseDialog(Context context, VersionInfo versionInfo, f fVar, int i) {
        super(context, R.style.UpgradeTransparentDialog);
        Object[] objArr = {context, versionInfo, fVar, Integer.valueOf((int) R.style.UpgradeTransparentDialog)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bddae547dd77135612fb8213fea3b1fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bddae547dd77135612fb8213fea3b1fb");
            return;
        }
        this.b = context;
        this.c = versionInfo;
        this.e = fVar;
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    public final com.meituan.android.upgrade.ui.a a() {
        return this.d;
    }

    public final VersionInfo b() {
        return this.c;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f2a6341d3335847e57da4dbad21c8cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f2a6341d3335847e57da4dbad21c8cb");
        } else if (this.f != null) {
            this.f.c(this);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c8831c9044541adb79b216f9d275dee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c8831c9044541adb79b216f9d275dee");
        } else if (this.f != null) {
            this.f.d(this);
        }
    }

    public final void a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baa38ed1527e3c4df4f5a5a9b89f0f77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baa38ed1527e3c4df4f5a5a9b89f0f77");
        } else if (view == null || i <= 0) {
        } else {
            view.setBackgroundResource(i);
        }
    }

    public final void a(ImageView imageView, int i) {
        Bitmap bitmap;
        Object[] objArr = {imageView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88bb180a790535433f79224f67c9225c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88bb180a790535433f79224f67c9225c");
        } else if (imageView == null || i <= 0) {
        } else {
            try {
                imageView.setImageResource(i);
            } catch (Exception unused) {
                Object[] objArr2 = {imageView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d4a266664a981249862c61f93596eed5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d4a266664a981249862c61f93596eed5");
                    return;
                }
                Drawable drawable = imageView.getDrawable();
                if (drawable == null || !(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || !bitmap.isRecycled()) {
                    return;
                }
                try {
                    imageView.setImageBitmap(com.sankuai.waimai.launcher.util.image.a.a(getContext().getResources().openRawResource(i)));
                } catch (Exception e) {
                    e.a("checkImageResource:" + e.toString());
                }
            }
        }
    }

    public final void a(TextView textView, float f) {
        Object[] objArr = {textView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edcfd944003ad44e7f8310699d1ee91c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edcfd944003ad44e7f8310699d1ee91c");
        } else if (textView == null || f <= 0.0f) {
        } else {
            textView.setTextSize(f);
        }
    }

    public final void a(TextView textView, int i) {
        Object[] objArr = {textView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36d0e6ee481c48a1fb7321ea3c0cf259", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36d0e6ee481c48a1fb7321ea3c0cf259");
        } else if (textView == null || i <= 0) {
        } else {
            textView.setTextColor(this.b.getResources().getColor(i));
        }
    }

    public final void a(String str, Long l, Map<String, Object> map) {
        Object[] objArr = {str, l, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08882ac48b82a2fb8171cbce3a9ec680", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08882ac48b82a2fb8171cbce3a9ec680");
        } else {
            com.meituan.android.upgrade.report.a.a().a(str, l, map);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cb2d3a9ef855edeb32be826a61381b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cb2d3a9ef855edeb32be826a61381b1");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f50d857112568d07db7af69171371c49", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f50d857112568d07db7af69171371c49")).booleanValue();
        } else {
            if (this.b instanceof Activity) {
                Activity activity = (Activity) this.b;
                if (!activity.isFinishing() || !activity.isDestroyed()) {
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            super.show();
            try {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "512e6501cd54d0f1d0e3e8c88c724b9d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "512e6501cd54d0f1d0e3e8c88c724b9d");
                } else if (this.f != null) {
                    this.f.a(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d89c239eaa1b6422a5d3dee540caa4d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d89c239eaa1b6422a5d3dee540caa4d1");
            return;
        }
        super.dismiss();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "341603242e8ca18a964833d027bb85f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "341603242e8ca18a964833d027bb85f4");
        } else if (this.f != null) {
            this.f.b(this);
        }
    }
}
