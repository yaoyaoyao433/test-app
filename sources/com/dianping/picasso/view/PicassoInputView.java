package com.dianping.picasso.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.dianping.picasso.PicassoView;
import com.dianping.picasso.PicassoViewWrapperUtil;
import com.dianping.picasso.creator.BaseViewWrapper;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picasso.view.keyboard.PicassoKeyboardCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class PicassoInputView extends EditText {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean inLayout;
    private boolean inUpdating;
    private PicassoView inputAccessoryView;
    private PicassoModel inputAccessoryViewModel;
    private PicassoView inputView;
    private PicassoModel inputViewModel;
    private boolean mAutoAdjust;
    private float mAutoAdjustSpace;
    private int mLastY;
    private PicassoView mPicassoView;

    public PicassoInputView(Context context) {
        super(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "363eac192aa2948b1f1ad382f3139d85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "363eac192aa2948b1f1ad382f3139d85");
            return;
        }
        this.inLayout = false;
        this.inUpdating = false;
        this.mAutoAdjustSpace = 0.0f;
        this.mLastY = 0;
        initView();
    }

    public PicassoInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04a5d67e41e94136f1d801cf4f9818d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04a5d67e41e94136f1d801cf4f9818d8");
            return;
        }
        this.inLayout = false;
        this.inUpdating = false;
        this.mAutoAdjustSpace = 0.0f;
        this.mLastY = 0;
        initView();
    }

    public PicassoInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7b0bdbf3f4b3bd0527ef8d83caf7dc9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7b0bdbf3f4b3bd0527ef8d83caf7dc9");
            return;
        }
        this.inLayout = false;
        this.inUpdating = false;
        this.mAutoAdjustSpace = 0.0f;
        this.mLastY = 0;
        initView();
    }

    private void initView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc4ba0164f39f6e441f40019c0abe0a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc4ba0164f39f6e441f40019c0abe0a4");
            return;
        }
        this.inputAccessoryView = new PicassoView(getContext());
        this.inputAccessoryView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.inputView = new PicassoView(getContext());
        this.inputView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1feed4c145283b65eca254203114bac4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1feed4c145283b65eca254203114bac4")).booleanValue();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && isFocused() && isEnabled()) {
            updateKeyboard(false);
        }
        return onTouchEvent;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86d35412360b7822a5ca92f705e7c9fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86d35412360b7822a5ca92f705e7c9fe");
            return;
        }
        super.onFocusChanged(z, i, rect);
        if (z) {
            updateKeyboard(true);
        }
    }

    private void refreshView(PicassoModel picassoModel, PicassoView picassoView) {
        Object[] objArr = {picassoModel, picassoView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dfe20539c3b56d882c23a69f6384178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dfe20539c3b56d882c23a69f6384178");
            return;
        }
        BaseViewWrapper viewWrapperByType = PicassoViewWrapperUtil.viewWrapperByType(Integer.valueOf(picassoModel.type));
        if (viewWrapperByType != null) {
            viewWrapperByType.refreshView(picassoView, picassoModel, picassoView);
        }
    }

    public void setCustomKeyBoardView(PicassoModel picassoModel, PicassoModel picassoModel2, PicassoView picassoView, boolean z, float f) {
        Object[] objArr = {picassoModel, picassoModel2, picassoView, Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6190bc8aaed4dd2312ff8d61ce305eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6190bc8aaed4dd2312ff8d61ce305eb");
            return;
        }
        this.inputAccessoryViewModel = picassoModel;
        this.inputViewModel = picassoModel2;
        this.mPicassoView = picassoView;
        this.mAutoAdjust = z;
        this.mAutoAdjustSpace = f;
        if (picassoModel != null) {
            refreshView(picassoModel, this.inputAccessoryView);
        }
        if (picassoModel2 != null) {
            refreshView(picassoModel2, this.inputView);
        }
        if (hasFocus() && PicassoKeyboardCenter.instance().isKeyboardShow(getContext())) {
            updateKeyboard();
        }
    }

    public void updateKeyboard() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ade7a05d1d19a640a73b0fd5bd695428", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ade7a05d1d19a640a73b0fd5bd695428");
            return;
        }
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        updateKeyboard(rect.bottom != this.mLastY);
        this.mLastY = rect.bottom;
    }

    private void updateKeyboard(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbe8ea53cd647aae5eb64020a2ee7a64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbe8ea53cd647aae5eb64020a2ee7a64");
        } else {
            PicassoKeyboardCenter.instance().setCustomKeyBoardView(getContext(), this.mPicassoView, this, this.inputAccessoryViewModel == null ? null : this.inputAccessoryView, this.inputViewModel == null ? null : this.inputView, this.mAutoAdjust, this.mAutoAdjustSpace, z);
        }
    }

    public void setInLayout() {
        this.inLayout = true;
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "664d6bc61288fcd2cece9b815f2e2990", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "664d6bc61288fcd2cece9b815f2e2990")).booleanValue();
        }
        if (this.inLayout) {
            this.inLayout = false;
            return false;
        }
        return super.requestRectangleOnScreen(rect);
    }

    public boolean isInUpdating() {
        return this.inUpdating;
    }

    public void setInUpdating(boolean z) {
        this.inUpdating = z;
    }

    public int setCursorIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8d85eda100db3f02aa0f13f8856a8c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8d85eda100db3f02aa0f13f8856a8c5")).intValue();
        }
        if (i < 0) {
            i = 0;
        }
        if (i > getText().length()) {
            i = getText().length();
        }
        setSelection(i);
        return i;
    }
}
