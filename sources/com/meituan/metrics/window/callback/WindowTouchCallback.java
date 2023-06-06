package com.meituan.metrics.window.callback;

import android.app.Activity;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class WindowTouchCallback implements Window.Callback {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final WeakReference<Activity> mCurrentActivity;
    private final Window.Callback mOriginCallback;
    private final ActivityWindowTouchCallbackInterface mTouchCallback;

    public WindowTouchCallback(Activity activity, Window.Callback callback, ActivityWindowTouchCallbackInterface activityWindowTouchCallbackInterface) {
        Object[] objArr = {activity, callback, activityWindowTouchCallbackInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73e9a000a5046b0adc1e1682a152168c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73e9a000a5046b0adc1e1682a152168c");
            return;
        }
        this.mCurrentActivity = new WeakReference<>(activity);
        this.mOriginCallback = callback;
        this.mTouchCallback = activityWindowTouchCallbackInterface;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "052202ab5b833540f8d56bd210d914bf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "052202ab5b833540f8d56bd210d914bf")).booleanValue() : this.mOriginCallback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b93269e3ef5e4d6e5d2c895d1264d3f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b93269e3ef5e4d6e5d2c895d1264d3f")).booleanValue() : this.mOriginCallback.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18dd2262c2cb767acbf3c0d29451dac9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18dd2262c2cb767acbf3c0d29451dac9")).booleanValue();
        }
        boolean dispatchTouchEvent = this.mOriginCallback.dispatchTouchEvent(motionEvent);
        if (this.mTouchCallback != null) {
            this.mTouchCallback.dispatchTouchEvent(this.mCurrentActivity.get(), motionEvent);
        }
        return dispatchTouchEvent;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0fb4bbfb240c910f506b66d633896fe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0fb4bbfb240c910f506b66d633896fe")).booleanValue() : this.mOriginCallback.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6a7d42bf52bea4ae1480842b10df2f6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6a7d42bf52bea4ae1480842b10df2f6")).booleanValue() : this.mOriginCallback.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Object[] objArr = {accessibilityEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fde99f91f91c74a4787893e72e3dc643", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fde99f91f91c74a4787893e72e3dc643")).booleanValue() : this.mOriginCallback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final View onCreatePanelView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1d5b8f0081a45e5e5c0e47ca3acfd1b", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1d5b8f0081a45e5e5c0e47ca3acfd1b") : this.mOriginCallback.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
        Object[] objArr = {Integer.valueOf(i), menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8cf35d5e696e50529d4f6fce4e1f3328", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8cf35d5e696e50529d4f6fce4e1f3328")).booleanValue() : this.mOriginCallback.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, @Nullable View view, @NonNull Menu menu) {
        Object[] objArr = {Integer.valueOf(i), view, menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c079c191b1b5c411d05a5fb0e50aeb5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c079c191b1b5c411d05a5fb0e50aeb5")).booleanValue() : this.mOriginCallback.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, @NonNull Menu menu) {
        Object[] objArr = {Integer.valueOf(i), menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce7a8a10936ee1640a13b270a560e987", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce7a8a10936ee1640a13b270a560e987")).booleanValue() : this.mOriginCallback.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        Object[] objArr = {Integer.valueOf(i), menuItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c4fc71af80880d931f0dd0270f58313", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c4fc71af80880d931f0dd0270f58313")).booleanValue() : this.mOriginCallback.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58b7641a755f22b17e2517d3ac118024", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58b7641a755f22b17e2517d3ac118024");
        } else {
            this.mOriginCallback.onWindowAttributesChanged(layoutParams);
        }
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abb3dd1731c90b7d91f31cebeb2cc5ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abb3dd1731c90b7d91f31cebeb2cc5ca");
        } else {
            this.mOriginCallback.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00e005879aedc6bee2e2b10fd25d655a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00e005879aedc6bee2e2b10fd25d655a");
        } else {
            this.mOriginCallback.onWindowFocusChanged(z);
        }
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4bdd1d4441e3e00f686ccb89d712dd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4bdd1d4441e3e00f686ccb89d712dd5");
        } else {
            this.mOriginCallback.onAttachedToWindow();
        }
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b37b0942f699d8192dfc2642f7225be5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b37b0942f699d8192dfc2642f7225be5");
        } else {
            this.mOriginCallback.onDetachedFromWindow();
        }
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, @NonNull Menu menu) {
        Object[] objArr = {Integer.valueOf(i), menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1c9058f67c0410411a6c698f77cbdb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1c9058f67c0410411a6c698f77cbdb4");
        } else {
            this.mOriginCallback.onPanelClosed(i, menu);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8bc83f53763623de0e5a4b7d6057d24", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8bc83f53763623de0e5a4b7d6057d24")).booleanValue() : this.mOriginCallback.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        Object[] objArr = {searchEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a75d26b1572b121df6690b8cf55291a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a75d26b1572b121df6690b8cf55291a4")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return this.mOriginCallback.onSearchRequested(searchEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb7104177538e2b6dc2e889b09d065b2", RobustBitConfig.DEFAULT_VALUE) ? (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb7104177538e2b6dc2e889b09d065b2") : this.mOriginCallback.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Object[] objArr = {callback, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44f2135e6aaccad3def3a9e8324e6ee3", RobustBitConfig.DEFAULT_VALUE)) {
            return (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44f2135e6aaccad3def3a9e8324e6ee3");
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return this.mOriginCallback.onWindowStartingActionMode(callback, i);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        Object[] objArr = {actionMode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4312aed573d6940618adb6f0fc6cfbeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4312aed573d6940618adb6f0fc6cfbeb");
        } else {
            this.mOriginCallback.onActionModeStarted(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        Object[] objArr = {actionMode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fbb98323d48fa65fd5a3805a13e0e9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fbb98323d48fa65fd5a3805a13e0e9e");
        } else {
            this.mOriginCallback.onActionModeFinished(actionMode);
        }
    }
}
