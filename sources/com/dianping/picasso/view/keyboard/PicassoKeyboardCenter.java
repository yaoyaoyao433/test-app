package com.dianping.picasso.view.keyboard;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.dianping.codelog.b;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.view.PicassoInputView;
import com.dianping.picasso.view.keyboard.PicassoSystemKeyBoardObserver;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoKeyboardCenter {
    private static final int KEYBOARD_STATE_CUSTOM_ONLY = 3;
    private static final int KEYBOARD_STATE_NULL = 0;
    private static final int KEYBOARD_STATE_SYSTEM_AND_CUSTOM = 2;
    private static final int KEYBOARD_STATE_SYSTEM_ONLY = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static boolean mAutoAdjust;
    private static float mAutoAdjustSpace;
    private static boolean mChangeY;
    private static Context mContext;
    private static int mCurrentContentBottom;
    private static int mCurrentContentTop;
    @Nullable
    private static EditText mEditText;
    @Nullable
    private static View mInputAccessoryView;
    @Nullable
    private static View mInputView;
    @Nullable
    private static LinearLayout mKeyboardBGView;
    private static int mLastKeyboardHeight;
    private static List<OnKeyBoardChangedListener> mListenerList = new ArrayList();
    private static int mOffset;
    private static int mOldState;
    @Nullable
    private static View mPicassoView;
    @Nullable
    private static ViewGroup mRootView;
    private static int mSystemKeyboardHeight;
    private PicassoSystemKeyBoardObserver.OnSystemKeyBoardChangedListener onSystemKeyBoardChangedListener;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnKeyBoardChangedListener {
        void onKeyboardChanged(int i);
    }

    private int getNewState(View view, View view2) {
        Object[] objArr = {view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d0de876f46c358768c425afa7e5fd4e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d0de876f46c358768c425afa7e5fd4e")).intValue();
        }
        if (view == null && view2 == null) {
            return 1;
        }
        return view2 != null ? 3 : 2;
    }

    public static void addOnKeyBoardChangedListener(OnKeyBoardChangedListener onKeyBoardChangedListener) {
        Object[] objArr = {onKeyBoardChangedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3cd3bbfa07ee676da44f007a5e4a7dca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3cd3bbfa07ee676da44f007a5e4a7dca");
        } else if (onKeyBoardChangedListener == null || mListenerList.contains(onKeyBoardChangedListener)) {
        } else {
            mListenerList.add(onKeyBoardChangedListener);
        }
    }

    public static void removeOnKeyBoardChangedListener(OnKeyBoardChangedListener onKeyBoardChangedListener) {
        Object[] objArr = {onKeyBoardChangedListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9b77b437d46653b1e439602b5b5ecc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9b77b437d46653b1e439602b5b5ecc4");
        } else if (onKeyBoardChangedListener == null || !mListenerList.contains(onKeyBoardChangedListener)) {
        } else {
            mListenerList.remove(onKeyBoardChangedListener);
        }
    }

    public static void resetKeyboardCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "82153eb81a5abe148d7d16432a99b5d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "82153eb81a5abe148d7d16432a99b5d8");
            return;
        }
        if (instance().isKeyboardShow(mContext)) {
            instance().hideKeyboard(mContext);
        }
        updatePicassoView(0);
        mLastKeyboardHeight = 0;
        mSystemKeyboardHeight = 0;
        mOldState = 0;
        mRootView = null;
        mInputView = null;
        mKeyboardBGView = null;
        mInputAccessoryView = null;
        mEditText = null;
        mContext = null;
        mCurrentContentBottom = 0;
        mCurrentContentTop = 0;
        mPicassoView = null;
        mOffset = 0;
        mAutoAdjust = false;
        mAutoAdjustSpace = 0.0f;
        mChangeY = false;
    }

    public PicassoKeyboardCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81811bbe1cdd93c090ef820d33b30686", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81811bbe1cdd93c090ef820d33b30686");
            return;
        }
        this.onSystemKeyBoardChangedListener = new PicassoSystemKeyBoardObserver.OnSystemKeyBoardChangedListener() { // from class: com.dianping.picasso.view.keyboard.PicassoKeyboardCenter.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.picasso.view.keyboard.PicassoSystemKeyBoardObserver.OnSystemKeyBoardChangedListener
            public void onSystemKeyboardChanged(Activity activity, int i) {
                Object[] objArr2 = {activity, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d63f0c4c22961b993c6506532db7e5f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d63f0c4c22961b993c6506532db7e5f5");
                    return;
                }
                int unused = PicassoKeyboardCenter.mSystemKeyboardHeight = i;
                if (PicassoKeyboardCenter.mSystemKeyboardHeight <= 0 || (PicassoKeyboardCenter.mOldState != 2 && PicassoKeyboardCenter.mOldState != 1)) {
                    if (i != 0 || PicassoKeyboardCenter.mOldState == 3) {
                        if (PicassoKeyboardCenter.mSystemKeyboardHeight <= 0 || PicassoKeyboardCenter.mOldState != 0 || activity == null) {
                            return;
                        }
                        View findFocus = activity.getWindow().getDecorView().findFocus();
                        if (findFocus instanceof PicassoInputView) {
                            ((PicassoInputView) findFocus).updateKeyboard();
                            return;
                        }
                        return;
                    }
                    PicassoKeyboardCenter.removeSelfView();
                    int unused2 = PicassoKeyboardCenter.mOldState = 0;
                    PicassoKeyboardCenter.notifyKeyboardChange(0);
                    return;
                }
                PicassoKeyboardCenter.this.updateKeyBoard(PicassoKeyboardCenter.mContext, PicassoKeyboardCenter.mEditText);
            }
        };
        PicassoSystemKeyBoardObserver.setOnSystemKeyBoardChangedListener(this.onSystemKeyBoardChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class SingletonLoader {
        private static final PicassoKeyboardCenter INSTANCE = new PicassoKeyboardCenter();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static PicassoKeyboardCenter instance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "89eeea393dabcbf0f40e91d6c40b1117", RobustBitConfig.DEFAULT_VALUE) ? (PicassoKeyboardCenter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "89eeea393dabcbf0f40e91d6c40b1117") : SingletonLoader.INSTANCE;
    }

    public void hideKeyboard(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4446af13479279546a91defb720c599", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4446af13479279546a91defb720c599");
            return;
        }
        removeSelfView();
        notifyKeyboardChange(0);
        SystemKeyboardUtils.hideKeyboard(context);
    }

    public boolean isKeyboardShow(Context context) {
        InputMethodManager inputMethodManager;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a5e5d214937f60d7c45d72cbdccc537", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a5e5d214937f60d7c45d72cbdccc537")).booleanValue() : (mRootView == null || mKeyboardBGView == null) ? (context instanceof Activity) && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null && inputMethodManager.isActive() && mSystemKeyboardHeight > 0 : mRootView.indexOfChild(mKeyboardBGView) >= 0;
    }

    public void setCustomKeyBoardView(Context context, View view, EditText editText, View view2, View view3, boolean z, float f, boolean z2) {
        Object[] objArr = {context, view, editText, view2, view3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Float.valueOf(f), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc22aa499d5d23af8dad25322729fe94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc22aa499d5d23af8dad25322729fe94");
        } else if (context instanceof Activity) {
            mContext = context;
            mEditText = editText;
            mPicassoView = view;
            mAutoAdjust = z;
            mAutoAdjustSpace = f;
            if (!mAutoAdjust) {
                mOffset = 0;
                if (mPicassoView != null) {
                    transView(mPicassoView, 0.0f);
                }
            }
            mChangeY = z2;
            mInputAccessoryView = view2;
            mInputView = view3;
            ViewGroup viewGroup = (ViewGroup) ((Activity) context).findViewById(16908290);
            mRootView = viewGroup;
            if (viewGroup == null) {
                b.b(PicassoKeyboardCenter.class, "mRootView == null");
                return;
            }
            Rect rect = new Rect();
            mRootView.getGlobalVisibleRect(rect);
            mCurrentContentBottom = rect.bottom;
            mCurrentContentTop = rect.top;
            updateKeyBoard(context, editText);
            if (!mChangeY || mLastKeyboardHeight <= 0) {
                return;
            }
            editText.post(new Runnable() { // from class: com.dianping.picasso.view.keyboard.PicassoKeyboardCenter.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e5444ce97cb4c0dc28551c8ef3608737", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e5444ce97cb4c0dc28551c8ef3608737");
                    } else {
                        PicassoKeyboardCenter.updatePicassoView(PicassoKeyboardCenter.mLastKeyboardHeight);
                    }
                }
            });
        }
    }

    public void setState(int i) {
        mOldState = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateKeyBoard(Context context, EditText editText) {
        Object[] objArr = {context, editText};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a54b07041bafa11b1a6c8439f52c8ff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a54b07041bafa11b1a6c8439f52c8ff5");
        } else if (context == null || editText == null) {
        } else {
            int newState = getNewState(mInputAccessoryView, mInputView);
            switch (newState) {
                case 0:
                    notifyKeyboardChange(0);
                    removeSelfView();
                    break;
                case 1:
                    if (mOldState == 3) {
                        SystemKeyboardUtils.popupKeyboard(editText);
                    }
                    if (mSystemKeyboardHeight > 0) {
                        notifyKeyboardChange(mSystemKeyboardHeight);
                    }
                    removeSelfView();
                    break;
                case 2:
                    if (mOldState == 3) {
                        SystemKeyboardUtils.popupKeyboard(editText);
                    }
                    if (mSystemKeyboardHeight > 0) {
                        updateCustomKeyboardView(context, mInputAccessoryView, mInputView);
                        if (mKeyboardBGView != null) {
                            notifyKeyboardChange(computeViewHeight((FrameLayout) mKeyboardBGView.findViewById(R.id.id_picasso_inputaccessory)) + mSystemKeyboardHeight);
                            break;
                        }
                    }
                    break;
                case 3:
                    SystemKeyboardUtils.hideKeyboard(context);
                    updateCustomKeyboardView(context, mInputAccessoryView, mInputView);
                    if (mKeyboardBGView != null) {
                        notifyKeyboardChange(computeViewHeight((FrameLayout) mKeyboardBGView.findViewById(R.id.id_picasso_inputaccessory)) + computeViewHeight((FrameLayout) mKeyboardBGView.findViewById(R.id.id_picasso_inputview)));
                        break;
                    }
                    break;
            }
            mOldState = newState;
        }
    }

    private int computeViewHeight(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1291d1f963b6b5aa09b1c56439f8dde", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1291d1f963b6b5aa09b1c56439f8dde")).intValue();
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyKeyboardChange(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c322a7cc08de3ec9a8f09020aaccff6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c322a7cc08de3ec9a8f09020aaccff6");
        } else if (mListenerList.size() > 0 && i != mLastKeyboardHeight) {
            new StringBuilder("notifyKeyboardChange: ").append(i);
            for (OnKeyBoardChangedListener onKeyBoardChangedListener : mListenerList) {
                onKeyBoardChangedListener.onKeyboardChanged(i);
            }
            updatePicassoView(i);
            if (i == 0) {
                mOldState = 0;
            }
            mLastKeyboardHeight = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updatePicassoView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "368a07e34db075b06c577e6aae9fde3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "368a07e34db075b06c577e6aae9fde3f");
        } else if (mAutoAdjust) {
            if (i == 0) {
                if (mOffset > 0) {
                    if (mPicassoView != null) {
                        transView(mPicassoView, 0.0f);
                    }
                    mOffset = 0;
                    return;
                }
                return;
            }
            Rect rect = new Rect();
            if (mEditText != null) {
                mEditText.getGlobalVisibleRect(rect);
            }
            int i2 = rect.bottom + mOffset;
            if (rect.bottom < 0) {
                i2 += mCurrentContentTop;
            }
            int i3 = (i2 - mCurrentContentBottom) + i;
            if (i3 > 0) {
                int dp2px = i3 + PicassoUtils.dp2px(mContext, mAutoAdjustSpace);
                if (mPicassoView != null) {
                    transView(mPicassoView, -dp2px);
                }
                mOffset = dp2px;
            } else if (mOffset > 0) {
                if (mPicassoView != null) {
                    transView(mPicassoView, 0.0f);
                }
                mOffset = 0;
            }
        }
    }

    private static void transView(View view, float f) {
        Object[] objArr = {view, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e86bf9b2a10ab257a9cf12ca84094e81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e86bf9b2a10ab257a9cf12ca84094e81");
            return;
        }
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setTarget(view);
        objectAnimator.setPropertyName(RecceAnimUtils.TRANSLATION_Y);
        objectAnimator.setFloatValues(view.getTranslationY(), f);
        objectAnimator.setDuration(300L);
        objectAnimator.start();
    }

    private void updateCustomKeyboardView(Context context, View view, View view2) {
        Object[] objArr = {context, view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "735dc05861e60eb062358bd107f9a13b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "735dc05861e60eb062358bd107f9a13b");
            return;
        }
        LinearLayout customView = getCustomView(context);
        mKeyboardBGView = customView;
        FrameLayout frameLayout = (FrameLayout) customView.findViewById(R.id.id_picasso_inputaccessory);
        FrameLayout frameLayout2 = (FrameLayout) mKeyboardBGView.findViewById(R.id.id_picasso_inputview);
        if (view != null) {
            View childAt = frameLayout.getChildAt(0);
            if (childAt != view) {
                if (childAt != null) {
                    frameLayout.removeViewAt(0);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                frameLayout.addView(view);
            }
        } else if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view2 != null) {
            View childAt2 = frameLayout2.getChildAt(0);
            if (childAt2 != view2) {
                if (childAt2 != null) {
                    frameLayout2.removeViewAt(0);
                }
                frameLayout2.addView(view2);
            }
            frameLayout2.getLayoutParams().height = -2;
            frameLayout2.setLayoutParams(frameLayout2.getLayoutParams());
            return;
        }
        frameLayout2.getLayoutParams().height = mSystemKeyboardHeight;
        frameLayout2.setLayoutParams(frameLayout2.getLayoutParams());
        if (frameLayout2.getChildCount() > 0) {
            frameLayout2.removeAllViews();
        }
    }

    private LinearLayout getCustomView(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9b40e04d08f02387ef8784dff3c3011", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinearLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9b40e04d08f02387ef8784dff3c3011");
        }
        if (mKeyboardBGView == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            mKeyboardBGView = linearLayout;
            linearLayout.setOrientation(1);
            mKeyboardBGView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            mKeyboardBGView.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2, 1.0f));
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picasso.view.keyboard.PicassoKeyboardCenter.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "367ece0f8396ef4acdd86225dce02ede", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "367ece0f8396ef4acdd86225dce02ede");
                        return;
                    }
                    PicassoKeyboardCenter.this.hideKeyboard(context);
                    int unused = PicassoKeyboardCenter.mOldState = 0;
                }
            });
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.id_picasso_inputaccessory);
            mKeyboardBGView.addView(frameLayout, new LinearLayout.LayoutParams(-1, -2));
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(R.id.id_picasso_inputview);
            mKeyboardBGView.addView(frameLayout2, new LinearLayout.LayoutParams(-1, -2));
        }
        if (mRootView != null && mRootView.indexOfChild(mKeyboardBGView) < 0) {
            mRootView.addView(mKeyboardBGView);
        }
        return mKeyboardBGView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void removeSelfView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c6fe57be27114ee86cb58be9ee2438c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c6fe57be27114ee86cb58be9ee2438c7");
        } else if (mRootView == null || mKeyboardBGView == null) {
        } else {
            mRootView.removeView(mKeyboardBGView);
        }
    }
}
