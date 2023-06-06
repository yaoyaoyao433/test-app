package com.dianping.picasso.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.dianping.picasso.model.AnimationInfoModel;
import com.dianping.picasso.model.AnimationModel;
import com.dianping.picasso.model.AnimationTransformModel;
import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AnimationView extends PicassoGroupView implements Animator.AnimatorListener, Animator.AnimatorPauseListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int groupAnimationRepeatCount;
    private AnimationModel mAnimationModel;
    private AnimatorSet mAnimatorSet;
    private float mLastAlpha;
    private int[] mLastBgColor;
    private float mLastRotation;
    private float mLastScaleX;
    private float mLastScaleY;
    private float mLastTransX;
    private float mLastTransY;
    private AnimatorListenerAdapter mListener;

    public AnimationView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab143afed89d1ad92c41efbedc8b7e68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab143afed89d1ad92c41efbedc8b7e68");
        }
    }

    public AnimationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13833e56e01501b288d086bed2c95c4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13833e56e01501b288d086bed2c95c4b");
        }
    }

    public AnimationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c714824af8298fb60e42cd483e38bb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c714824af8298fb60e42cd483e38bb2");
            return;
        }
        this.groupAnimationRepeatCount = 0;
        this.mLastBgColor = new int[2];
        this.mLastScaleX = 1.0f;
        this.mLastScaleY = 1.0f;
        this.mLastAlpha = 1.0f;
    }

    public void handlePicassoAnim(AnimationModel animationModel) {
        Object[] objArr = {animationModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d1532e6884fd7b6d6ebcc4d9b165af0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d1532e6884fd7b6d6ebcc4d9b165af0");
        } else if (animationModel == null) {
        } else {
            restoreAnimationStatusFromModel(this, animationModel);
            if ((animationModel.animations == null || animationModel.animations.length == 0) && (this.mAnimationModel == null || this.mAnimationModel.animations == null || this.mAnimationModel.animations.length == 0)) {
                return;
            }
            if (animationModel.animations == null || animationModel.animations.length == 0) {
                this.mAnimationModel = animationModel;
                resetOriginal();
            } else if (sameAnim(animationModel)) {
            } else {
                if (this.mAnimationModel != null) {
                    this.mLastBgColor = this.mAnimationModel.getBgColorValues();
                }
                if (this.mAnimatorSet != null && this.mAnimatorSet.isStarted()) {
                    this.mAnimatorSet.cancel();
                    this.mAnimatorSet.removeAllListeners();
                    resetCurrentState();
                    this.mAnimationModel = null;
                }
                this.mAnimationModel = animationModel;
                customPivot();
                this.groupAnimationRepeatCount = this.mAnimationModel.groupAnimationRepeatCount;
                this.mAnimatorSet = new AnimatorSet();
                this.mAnimatorSet.addListener(this);
                this.mAnimatorSet.addPauseListener(this);
                this.mAnimatorSet.playTogether(buildAnimators());
                this.mAnimatorSet.start();
            }
        }
    }

    private void customPivot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c45bc0bf08e1e2e2262c927b56be279", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c45bc0bf08e1e2e2262c927b56be279");
        } else if (this.mAnimationModel == null) {
        } else {
            setPivotX(this.mAnimationModel.anchorPointX * this.mAnimationModel.getViewParams().width);
            setPivotY(this.mAnimationModel.anchorPointY * this.mAnimationModel.getViewParams().height);
        }
    }

    private void resetOriginal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab83bc58dbde4a9d677492e901f61190", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab83bc58dbde4a9d677492e901f61190");
            return;
        }
        this.mLastTransX = 0.0f;
        this.mLastTransY = 0.0f;
        this.mLastScaleX = 1.0f;
        this.mLastScaleY = 1.0f;
        this.mLastRotation = 0.0f;
        if (this.mAnimationModel != null) {
            this.mLastAlpha = this.mAnimationModel.alpha;
            this.mLastBgColor = this.mAnimationModel.getBgColorValues();
        }
        resetCurrentState();
    }

    private boolean sameAnim(AnimationModel animationModel) {
        Object[] objArr = {animationModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bd17b53566fc63bc34308bf8d96128a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bd17b53566fc63bc34308bf8d96128a")).booleanValue();
        }
        if (this.mAnimationModel == null || this.mAnimationModel.animations.length != animationModel.animations.length) {
            return false;
        }
        for (int i = 0; i < this.mAnimationModel.animations.length; i++) {
            if (!this.mAnimationModel.animations[i].equals(animationModel.animations[i])) {
                return false;
            }
        }
        return true;
    }

    private void saveCurrentState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c573a583b6e4d2e35d521e147993464c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c573a583b6e4d2e35d521e147993464c");
            return;
        }
        this.mLastTransX = getTranslationX();
        this.mLastTransY = getTranslationY();
        this.mLastScaleX = getScaleX();
        this.mLastScaleY = getScaleY();
        this.mLastAlpha = getAlpha();
        this.mLastRotation = getRotation();
        this.mLastBgColor = this.mAnimationModel.getBgColorValues();
    }

    private void resetCurrentState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e96c302b38b5883cc5ff8403f57bbea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e96c302b38b5883cc5ff8403f57bbea");
            return;
        }
        setTranslationX(this.mLastTransX);
        setTranslationY(this.mLastTransY);
        setScaleX(this.mLastScaleX);
        setScaleY(this.mLastScaleY);
        setAlpha(this.mLastAlpha);
        setRotation(this.mLastRotation);
        if (this.mLastBgColor[0] != 0) {
            setBackgroundColorPicasso(this.mLastBgColor[0]);
        }
    }

    private List<Animator> buildAnimators() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b026fa69b283871bd9246f15b42d1440", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b026fa69b283871bd9246f15b42d1440");
        }
        ArrayList arrayList = new ArrayList();
        for (AnimationInfoModel animationInfoModel : this.mAnimationModel.animations) {
            ObjectAnimator createAnimator = animationInfoModel.createAnimator(this);
            if (createAnimator != null) {
                arrayList.add(createAnimator);
            }
        }
        return arrayList;
    }

    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "262f56e160be9055eb2ff17eee1a6f74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "262f56e160be9055eb2ff17eee1a6f74");
        } else if (this.mAnimatorSet == null || this.mAnimatorSet.isStarted()) {
        } else {
            this.mAnimatorSet.start();
        }
    }

    public void setAnimatorListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.mListener = animatorListenerAdapter;
    }

    public int getBgColor() {
        return this.mLastBgColor[1];
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Object[] objArr = {animator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3693f8a4ec6ba19404425813dc0518d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3693f8a4ec6ba19404425813dc0518d");
            return;
        }
        if (this.mListener != null) {
            this.mListener.onAnimationStart(animator);
        }
        saveCurrentState();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        Object[] objArr = {animator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d74a552bae21d987c670d31e2eb58e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d74a552bae21d987c670d31e2eb58e7");
            return;
        }
        this.groupAnimationRepeatCount--;
        if (this.groupAnimationRepeatCount <= 0) {
            if (this.mListener != null) {
                this.mListener.onAnimationEnd(animator);
            }
        } else if (this.mAnimatorSet != null) {
            this.mAnimatorSet.start();
        }
        saveCurrentState();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        Object[] objArr = {animator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78994685a918951346724a53a40683fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78994685a918951346724a53a40683fa");
            return;
        }
        if (this.mListener != null) {
            this.mListener.onAnimationCancel(animator);
        }
        resetCurrentState();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        Object[] objArr = {animator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "135c5a1cd960e889fe8b9b529b7c5271", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "135c5a1cd960e889fe8b9b529b7c5271");
        } else if (this.mListener != null) {
            this.mListener.onAnimationRepeat(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(Animator animator) {
        Object[] objArr = {animator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54a3884581e26c43b6f205e996c1ec6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54a3884581e26c43b6f205e996c1ec6b");
        } else if (this.mListener != null) {
            this.mListener.onAnimationPause(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(Animator animator) {
        Object[] objArr = {animator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e6e7e02a03155330f8420274b3972f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e6e7e02a03155330f8420274b3972f2");
        } else if (this.mListener != null) {
            this.mListener.onAnimationResume(animator);
        }
    }

    @Keep
    public void setBackgroundColorPicasso(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d053b53e4b61eabdae2179bb7e055895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d053b53e4b61eabdae2179bb7e055895");
        } else if (this.mAnimationModel != null) {
            this.mAnimationModel.getViewParams().backgroundDrawable.setColor(i);
        }
    }

    @Keep
    public void setCorner(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0569af1f1f1092ef20d1ad0d5ab1555d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0569af1f1f1092ef20d1ad0d5ab1555d");
        } else if (this.mAnimationModel != null) {
            this.mAnimationModel.getViewParams().backgroundDrawable.setCornerRadius(f);
            this.mAnimationModel.getViewParams().cornerRadius = (int) f;
        }
    }

    public float getCorner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cad56a715939b7732c4ac11e7c4804aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cad56a715939b7732c4ac11e7c4804aa")).floatValue();
        }
        if (this.mAnimationModel != null) {
            return this.mAnimationModel.getViewParams().cornerRadius;
        }
        return 0.0f;
    }

    @Keep
    public void setHeight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "943a603bd52254738cfac8cfe77b73cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "943a603bd52254738cfac8cfe77b73cc");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        int i = (int) f;
        if (layoutParams.height != i) {
            if (this.mAnimationModel != null) {
                setY(getY() + ((-this.mAnimationModel.anchorPointY) * (i - layoutParams.height)));
            }
            layoutParams.height = i;
            requestLayout();
        }
    }

    @Keep
    public void setWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e31ee992fc7cbbb20bcf004f412f76a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e31ee992fc7cbbb20bcf004f412f76a");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        int i = (int) f;
        if (layoutParams.width != i) {
            if (this.mAnimationModel != null) {
                setX(getX() + ((-this.mAnimationModel.anchorPointX) * (i - layoutParams.width)));
            }
            layoutParams.width = i;
            requestLayout();
        }
    }

    @Keep
    public void setPosition(float f, float f2) {
        int i;
        int i2 = 0;
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "119da8c03268b2529fb93a326d96ec78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "119da8c03268b2529fb93a326d96ec78");
            return;
        }
        if (this.mAnimationModel != null) {
            i2 = (int) (this.mAnimationModel.anchorPointX * this.mAnimationModel.getViewParams().width);
            i = (int) (this.mAnimationModel.anchorPointY * this.mAnimationModel.getViewParams().height);
        } else {
            i = 0;
        }
        setX(f - i2);
        setY(f2 - i);
    }

    public PointF getPosition() {
        int i;
        int i2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "131d0f4eee6516f6649a083079632d30", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "131d0f4eee6516f6649a083079632d30");
        }
        if (this.mAnimationModel != null) {
            i2 = (int) (this.mAnimationModel.anchorPointX * this.mAnimationModel.getViewParams().width);
            i = (int) (this.mAnimationModel.anchorPointY * this.mAnimationModel.getViewParams().height);
        } else {
            i = 0;
        }
        return new PointF(getX() + i2, getY() + i);
    }

    @Keep
    public void setPosition(PointF pointF) {
        Object[] objArr = {pointF};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74ad085b8346a362401798316aecf91c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74ad085b8346a362401798316aecf91c");
        } else if (pointF != null) {
            setPosition(pointF.x, pointF.y);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3a34209c77c2eeab9cea6673151b097", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3a34209c77c2eeab9cea6673151b097");
            return;
        }
        super.onAttachedToWindow();
        if (this.mAnimatorSet != null) {
            if (!hasListener()) {
                this.mAnimatorSet.addListener(this);
                this.mAnimatorSet.addPauseListener(this);
            }
            this.mAnimatorSet.resume();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c715f870d06a2b8886927bda31506c2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c715f870d06a2b8886927bda31506c2f");
            return;
        }
        super.onDetachedFromWindow();
        if (this.mAnimatorSet != null) {
            boolean hasListener = hasListener();
            if (hasListener) {
                this.mAnimatorSet.removeListener(this);
            }
            this.mAnimatorSet.pause();
            if (hasListener) {
                this.mAnimatorSet.removePauseListener(this);
            }
        }
    }

    private boolean hasListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fb307ffb64eb4c8071626bedff12ecd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fb307ffb64eb4c8071626bedff12ecd")).booleanValue();
        }
        if (this.mAnimatorSet != null && this.mAnimatorSet.getListeners() != null) {
            Iterator<Animator.AnimatorListener> it = this.mAnimatorSet.getListeners().iterator();
            while (it.hasNext()) {
                if (it.next() == this) {
                    return true;
                }
            }
        }
        return false;
    }

    public void restoreAnimationStatusFromModel(View view, @NonNull AnimationModel animationModel) {
        Object[] objArr = {view, animationModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30e6fa96b2fd8b0eccc33acc29e95886", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30e6fa96b2fd8b0eccc33acc29e95886");
            return;
        }
        AnimationTransformModel animationTransformModel = animationModel.transformModel;
        if (animationTransformModel != null) {
            setAnimationViewRotation(animationTransformModel.rotateValue, animationTransformModel.rotateDirection);
            if (animationTransformModel.scaleX >= 0.0f) {
                view.setScaleX(animationTransformModel.scaleX);
                this.mLastScaleX = animationTransformModel.scaleX;
            }
            if (animationTransformModel.scaleY >= 0.0f) {
                view.setScaleY(animationTransformModel.scaleY);
                this.mLastScaleY = animationTransformModel.scaleY;
            }
        }
        if (this.mAnimationModel != null) {
            if (animationModel.anchorPointX >= 0.0f) {
                view.setPivotX(this.mAnimationModel.getViewParams().width * animationModel.anchorPointX);
            }
            if (animationModel.anchorPointY >= 0.0f) {
                view.setPivotY(this.mAnimationModel.getViewParams().height * animationModel.anchorPointY);
            }
        }
    }

    public void setAnimationViewRotation(Float f, String str) {
        Object[] objArr = {f, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa6ede1c5f045ec654351598bd23df45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa6ede1c5f045ec654351598bd23df45");
        } else if (f != null) {
            this.mLastRotation = f.floatValue();
            if (AnimationViewCommandModel.RotationX.equals(str)) {
                setRotationX(f.floatValue());
            } else if (AnimationViewCommandModel.RotationY.equals(str)) {
                setRotationY(f.floatValue());
            } else if (AnimationViewCommandModel.Rotation.equals(str)) {
                setRotation(f.floatValue());
            }
        }
    }

    public void setAnimationAction(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d527330742018ab3f1f85eeb0e71ca8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d527330742018ab3f1f85eeb0e71ca8");
        } else if (this.mAnimatorSet == null) {
        } else {
            switch (i) {
                case 1:
                    this.mAnimatorSet.pause();
                    return;
                case 2:
                    this.mAnimatorSet.resume();
                    return;
                default:
                    return;
            }
        }
    }
}
