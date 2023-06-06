package com.meituan.android.neohybrid.neo.loading;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.android.paybase.utils.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LoadingDialog extends Dialog {
    public static ChangeQuickRedirect a;
    ViewGroup b;
    private ValueAnimator c;

    public LoadingDialog(Context context, View view, boolean z) {
        super(context, R.style.neohybrid__ProgressDialog);
        Object[] objArr = {context, view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f62010811fd56e0f02fa87ca853528f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f62010811fd56e0f02fa87ca853528f5");
            return;
        }
        Object[] objArr2 = {context, view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e64f7cc17478a5da6bb9f4915e09608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e64f7cc17478a5da6bb9f4915e09608");
        } else if (context != null) {
            this.b = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.neohybrid__loading_container, (ViewGroup) null);
            if (z) {
                return;
            }
            if (view != null) {
                this.b.addView(view);
            } else {
                a(context, this.b);
            }
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7718fb064d7354dbeaea489fd544b067", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7718fb064d7354dbeaea489fd544b067");
            return;
        }
        super.onCreate(bundle);
        setContentView(this.b);
    }

    private void a(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24364f442bb5692a717cc46307343efd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24364f442bb5692a717cc46307343efd");
        } else if (context == null || viewGroup == null) {
        } else {
            viewGroup.removeAllViews();
            ImageView imageView = new ImageView(context);
            int a2 = aj.a(context, 28.0f);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(a2, a2));
            imageView.setImageResource(R.drawable.neohybrid__progress_default_loading);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            LinearLayout linearLayout = new LinearLayout(context);
            int a3 = aj.a(context, 50.0f);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(a3, a3));
            linearLayout.setBackgroundResource(R.drawable.neohybrid__progress_dialog_bg_default);
            linearLayout.setGravity(17);
            linearLayout.addView(imageView);
            try {
                this.c = ValueAnimator.ofInt(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
                this.c.addUpdateListener(a.a(imageView));
                this.c.setRepeatCount(-1);
                this.c.setDuration(450L);
                viewGroup.addView(linearLayout);
            } catch (Exception e) {
                com.meituan.android.neohybrid.neo.report.b.a(e, "ProgressDialog_initDefaultView", (Map<String, Object>) null);
            }
        }
    }

    public static /* synthetic */ void a(ImageView imageView, ValueAnimator valueAnimator) {
        Object[] objArr = {imageView, valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00e98b231c039d58954c020802ca6f04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00e98b231c039d58954c020802ca6f04");
        } else {
            imageView.setRotation(((Integer) valueAnimator.getAnimatedValue()).intValue() * 40);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b9705f5b07937bddbd0aabfcc1c4a9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b9705f5b07937bddbd0aabfcc1c4a9b");
            return;
        }
        super.dismiss();
        if (this.c != null) {
            this.c.cancel();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1216fbadd534eea56b32ddc317d1f704", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1216fbadd534eea56b32ddc317d1f704");
            return;
        }
        super.show();
        if (this.c != null) {
            this.c.start();
        }
    }
}
