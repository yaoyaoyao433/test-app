package com.hhmedic.android.sdk.uikit.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.hhmedic.android.sdk.base.utils.Logger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class HHBottomDialog extends Dialog {
    private static final int mAnimationDuration = 200;
    protected boolean isCanTouchOutSide;
    protected View mContentView;
    private boolean mIsAnimating;

    protected abstract void initUI();

    public HHBottomDialog(@NonNull Context context) {
        super(context, 2131558703);
        this.mIsAnimating = false;
        this.isCanTouchOutSide = true;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.height = -2;
        attributes.gravity = 81;
        attributes.width = -1;
        getWindow().setAttributes(attributes);
        setCanceledOnTouchOutside(this.isCanTouchOutSide);
        setCancelable(this.isCanTouchOutSide);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        this.mContentView = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null);
        super.setContentView(this.mContentView);
        initUI();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        animateUp();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.mIsAnimating) {
            return;
        }
        animateDown();
    }

    protected void animateUp() {
        if (this.mContentView == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setInterpolator(new DecelerateInterpolator());
        animationSet.setDuration(200L);
        animationSet.setFillAfter(true);
        this.mContentView.startAnimation(animationSet);
    }

    private void animateDown() {
        if (this.mContentView == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setInterpolator(new DecelerateInterpolator());
        animationSet.setDuration(200L);
        animationSet.setFillAfter(true);
        animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.hhmedic.android.sdk.uikit.widget.dialog.HHBottomDialog.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                HHBottomDialog.this.mIsAnimating = true;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                HHBottomDialog.this.mIsAnimating = false;
                HHBottomDialog.this.mContentView.post(new Runnable() { // from class: com.hhmedic.android.sdk.uikit.widget.dialog.HHBottomDialog.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HHBottomDialog.super.dismiss();
                        } catch (Exception e) {
                            Logger.e(e.toString());
                        }
                    }
                });
            }
        });
        this.mContentView.startAnimation(animationSet);
    }
}
