package com.meituan.android.neohybrid.v2.neo.loading;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de1a360182aaf829bb17282cb0198b5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de1a360182aaf829bb17282cb0198b5f");
            return;
        }
        Object[] objArr2 = {context, view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "866735a1aec29a72981cfbcfffe1ff9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "866735a1aec29a72981cfbcfffe1ff9a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "131217803b8277ab7b1d27afd1a3b3e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "131217803b8277ab7b1d27afd1a3b3e4");
            return;
        }
        super.onCreate(bundle);
        setContentView(this.b);
    }

    private void a(Context context, ViewGroup viewGroup) {
        Object[] objArr = {context, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0d42d6077fc5b0671ef6e270b0740f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0d42d6077fc5b0671ef6e270b0740f1");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d22f99cbdf04eb05a32dacd83167e9f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d22f99cbdf04eb05a32dacd83167e9f5");
        } else {
            imageView.setRotation(((Integer) valueAnimator.getAnimatedValue()).intValue() * 40);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bd582ccae300918b5e41aa53cf0506e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bd582ccae300918b5e41aa53cf0506e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e17bd480efc10af59e2f493f455057f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e17bd480efc10af59e2f493f455057f");
            return;
        }
        super.show();
        if (this.c != null) {
            this.c.start();
        }
    }
}
