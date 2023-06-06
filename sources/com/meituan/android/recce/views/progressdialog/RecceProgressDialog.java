package com.meituan.android.recce.views.progressdialog;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceProgressDialog extends LinearLayout {
    private static final int DEFAULT_DURATION = 450;
    public static ChangeQuickRedirect changeQuickRedirect;
    private ValueAnimator defaultLoadingAnim;
    private int resourceId;
    private RecceRollingCircleDotView rollingCircleDotView;
    private String tip;

    public RecceProgressDialog(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5254a14569a27dcab5131e20ddf13f13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5254a14569a27dcab5131e20ddf13f13");
        } else {
            init(context);
        }
    }

    public RecceProgressDialog(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d1ed0f709adbda352095ec956a67a63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d1ed0f709adbda352095ec956a67a63");
        } else {
            init(context);
        }
    }

    public RecceProgressDialog(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "037b46dd47fbe30c2522477f9ff30297", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "037b46dd47fbe30c2522477f9ff30297");
        } else {
            init(context);
        }
    }

    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "602659a894b50ebd7586ec89636e70ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "602659a894b50ebd7586ec89636e70ac");
            return;
        }
        View inflate = inflate(context, R.layout.recce_progress_dialog, null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.progress_logo);
        TextView textView = (TextView) inflate.findViewById(R.id.progress_text);
        this.rollingCircleDotView = (RecceRollingCircleDotView) findViewById(R.id.rollingCircleDotView);
        if (this.resourceId == 0 || TextUtils.isEmpty(this.tip)) {
            inflate.findViewById(R.id.progress_logo_loading).setVisibility(8);
            inflate.findViewById(R.id.progress_default_loading).setVisibility(0);
            View findViewById = inflate.findViewById(R.id.progress_default_loading_logo);
            this.defaultLoadingAnim = ValueAnimator.ofInt(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
            this.defaultLoadingAnim.addUpdateListener(RecceProgressDialog$$Lambda$1.lambdaFactory$(findViewById));
            this.defaultLoadingAnim.setRepeatCount(-1);
            this.defaultLoadingAnim.setDuration(450L);
        } else {
            inflate.findViewById(R.id.progress_logo_loading).setVisibility(0);
            inflate.findViewById(R.id.progress_default_loading).setVisibility(8);
            imageView.setImageResource(this.resourceId);
            textView.setText(this.tip);
        }
        addView(inflate);
    }

    public static /* synthetic */ void lambda$init$0(View view, ValueAnimator valueAnimator) {
        Object[] objArr = {view, valueAnimator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9eb45694aebf336074d40dc88f013a6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9eb45694aebf336074d40dc88f013a6c");
        } else {
            view.setRotation(((Integer) valueAnimator.getAnimatedValue()).intValue() * 40);
        }
    }

    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e69c80c0fb73f7069bae33c2a150ab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e69c80c0fb73f7069bae33c2a150ab1");
            return;
        }
        if (this.rollingCircleDotView != null) {
            this.rollingCircleDotView.stop();
        }
        if (this.defaultLoadingAnim != null) {
            this.defaultLoadingAnim.cancel();
        }
    }

    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45efd6147c8cc2a7df65d4a2b7952358", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45efd6147c8cc2a7df65d4a2b7952358");
            return;
        }
        if (this.rollingCircleDotView != null) {
            this.rollingCircleDotView.setFlag(true);
            this.rollingCircleDotView.start();
        }
        if (this.defaultLoadingAnim != null) {
            this.defaultLoadingAnim.start();
        }
    }

    public void show(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc9ebfb698cd67ce92dd94efa1d1edae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc9ebfb698cd67ce92dd94efa1d1edae");
        } else if (z) {
            show();
        } else {
            dismiss();
        }
    }
}
