package com.dianping.picasso.view.keyboard;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SystemKeyboardUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void hideKeyboard(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c1b334af6634afead7b0d4575c68a10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c1b334af6634afead7b0d4575c68a10");
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.dianping.picasso.view.keyboard.SystemKeyboardUtils.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    InputMethodManager inputMethodManager;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e4586b4abc365bc79f0a05e2dff66d88", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e4586b4abc365bc79f0a05e2dff66d88");
                    } else if ((context instanceof Activity) && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null && inputMethodManager.isActive()) {
                        if (((Activity) context).getCurrentFocus() != null) {
                            inputMethodManager.hideSoftInputFromWindow(((Activity) context).getCurrentFocus().getWindowToken(), 0);
                        } else {
                            inputMethodManager.hideSoftInputFromWindow(((Activity) context).getWindow().getDecorView().getWindowToken(), 0);
                        }
                    }
                }
            }, 1L);
        }
    }

    public static void popupKeyboard(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "905e0f524ee5d50541691680fbe93868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "905e0f524ee5d50541691680fbe93868");
        } else {
            new PopKeyboardHandler(view).sendEmptyMessageDelayed(1, 0L);
        }
    }

    public static void popupKeyboard(View view, long j) {
        Object[] objArr = {view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6018d6db8f8ea7f2eb130a0b168e63f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6018d6db8f8ea7f2eb130a0b168e63f9");
        } else {
            new PopKeyboardHandler(view).sendEmptyMessageDelayed(1, j);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class PopKeyboardHandler extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<View> mView;

        public PopKeyboardHandler(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c59ee8bc8cb9673371cf4bb37c3061c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c59ee8bc8cb9673371cf4bb37c3061c");
            } else {
                this.mView = new WeakReference<>(view);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            View view;
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "118a1055fc8ea4652f2a6b2c3027e88d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "118a1055fc8ea4652f2a6b2c3027e88d");
                return;
            }
            if (message.what == 1 && (view = this.mView.get()) != null) {
                view.requestFocus();
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
            }
            super.handleMessage(message);
        }
    }
}
