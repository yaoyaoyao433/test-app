package com.dianping.picasso.view.keyboard;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.dianping.codelog.b;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoSystemKeyBoardObserver {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static OnSystemKeyBoardChangedListener onSystemKeyBoardChangedListener;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnSystemKeyBoardChangedListener {
        void onSystemKeyboardChanged(Activity activity, int i);
    }

    public static void setOnSystemKeyBoardChangedListener(OnSystemKeyBoardChangedListener onSystemKeyBoardChangedListener2) {
        onSystemKeyBoardChangedListener = onSystemKeyBoardChangedListener2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class KeyboardObserver extends PopupWindow {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Activity activity;
        private g host;
        private int keyboardLandscapeHeight;
        private int keyboardPortraitHeight;
        private Handler mHandler;
        private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        private View parentView;
        private View popupView;

        public KeyboardObserver(Activity activity) {
            super(activity);
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ffeb196a2d3463f1664c94134e4880f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ffeb196a2d3463f1664c94134e4880f");
                return;
            }
            this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.dianping.picasso.view.keyboard.PicassoSystemKeyBoardObserver.KeyboardObserver.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e0a6d879faf9f630e595a53867eceb49", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e0a6d879faf9f630e595a53867eceb49");
                    } else if (KeyboardObserver.this.popupView != null) {
                        KeyboardObserver.this.handleOnGlobalLayout();
                    }
                }
            };
            this.activity = activity;
            this.popupView = new LinearLayout(activity);
            this.popupView.setLayoutParams(new WindowManager.LayoutParams(-1, -1));
            setContentView(this.popupView);
            setSoftInputMode(21);
            setInputMethodMode(1);
            this.parentView = activity.findViewById(16908290);
            setWidth(0);
            setHeight(-1);
            this.popupView.getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
            this.mHandler = new Handler();
            this.mHandler.postDelayed(new Runnable() { // from class: com.dianping.picasso.view.keyboard.PicassoSystemKeyBoardObserver.KeyboardObserver.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aa44e54dd73557af079810ab99f20598", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aa44e54dd73557af079810ab99f20598");
                    } else {
                        KeyboardObserver.this.start();
                    }
                }
            }, 200L);
        }

        public void start() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83f3e94937a26e116b40dba2a767a15a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83f3e94937a26e116b40dba2a767a15a");
            } else if (isShowing() || this.parentView == null || this.parentView.getWindowToken() == null || this.activity == null || this.activity.isFinishing()) {
            } else {
                setBackgroundDrawable(new ColorDrawable(0));
                try {
                    p.a(this, this.parentView, 0, 0, 0);
                } catch (Exception e) {
                    b.b(PicassoSystemKeyBoardObserver.class, "e: " + e.getLocalizedMessage() + "activity: " + this.activity);
                }
            }
        }

        public void close() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5081a24c2d51a540ec00a4db77a3c065", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5081a24c2d51a540ec00a4db77a3c065");
                return;
            }
            if (this.mHandler != null) {
                this.mHandler.removeCallbacksAndMessages(null);
            }
            this.popupView.getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
            try {
                p.b(this);
            } catch (Exception e) {
                b.b(PicassoSystemKeyBoardObserver.class, "e: " + e.getLocalizedMessage() + "activity: " + this.activity);
            }
        }

        private int getScreenOrientation() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00bab6f5891d56e62d86a3790513064a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00bab6f5891d56e62d86a3790513064a")).intValue() : this.activity.getResources().getConfiguration().orientation;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleOnGlobalLayout() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1413649c907dc16249e1c6fd0272972", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1413649c907dc16249e1c6fd0272972");
                return;
            }
            Rect rect = new Rect();
            this.parentView.getWindowVisibleDisplayFrame(rect);
            Rect rect2 = new Rect();
            this.popupView.getWindowVisibleDisplayFrame(rect2);
            int screenOrientation = getScreenOrientation();
            int i = rect.bottom - rect2.bottom;
            if (screenOrientation == 1 && this.keyboardPortraitHeight == i) {
                return;
            }
            if (screenOrientation == 2 && this.keyboardLandscapeHeight == i) {
                return;
            }
            if (i == 0) {
                notifyKeyboardHeightChanged(this.activity, 0, screenOrientation);
                this.keyboardPortraitHeight = i;
                this.keyboardLandscapeHeight = i;
            } else if (screenOrientation == 1) {
                this.keyboardPortraitHeight = i;
                notifyKeyboardHeightChanged(this.activity, this.keyboardPortraitHeight, screenOrientation);
            } else {
                this.keyboardLandscapeHeight = i;
                notifyKeyboardHeightChanged(this.activity, this.keyboardLandscapeHeight, screenOrientation);
            }
        }

        private void notifyKeyboardHeightChanged(Activity activity, int i, int i2) {
            Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bf5c57805be515f8ca0e69d8755bbc2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bf5c57805be515f8ca0e69d8755bbc2");
            } else if (PicassoSystemKeyBoardObserver.onSystemKeyBoardChangedListener != null) {
                new StringBuilder("notifySystemKeyboardHeightChanged: ").append(i);
                PicassoSystemKeyBoardObserver.onSystemKeyBoardChangedListener.onSystemKeyboardChanged(activity, i);
            }
        }
    }
}
