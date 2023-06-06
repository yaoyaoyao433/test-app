package com.meituan.metrics.fsp;

import android.os.Build;
import android.support.annotation.Nullable;
import android.view.ActionMode;
import android.view.GestureDetector;
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
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WindowCallback implements Window.Callback {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Window.Callback callback;
    public GestureDetector mGestureDetector;
    private WindowTouchCallBack touchCallback;

    public WindowCallback(Window.Callback callback, WindowTouchCallBack windowTouchCallBack) {
        Object[] objArr = {callback, windowTouchCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86b6e8e1d1d3140b7b2edb8722282bc0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86b6e8e1d1d3140b7b2edb8722282bc0");
            return;
        }
        this.mGestureDetector = new GestureDetector(new GestureDetector.OnGestureListener() { // from class: com.meituan.metrics.fsp.WindowCallback.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3c6d092700d054668438141edfcbe681", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3c6d092700d054668438141edfcbe681")).booleanValue();
                }
                if (WindowCallback.this.touchCallback != null) {
                    WindowCallback.this.touchCallback.onDown();
                }
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "48f4ff7db81e4624fda2b6b6737de4d6", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "48f4ff7db81e4624fda2b6b6737de4d6")).booleanValue();
                }
                if (WindowCallback.this.touchCallback != null) {
                    WindowCallback.this.touchCallback.onClick();
                }
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Object[] objArr2 = {motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f6e4ae03a96d0a222ea7681b5f6013a0", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f6e4ae03a96d0a222ea7681b5f6013a0")).booleanValue();
                }
                if (WindowCallback.this.touchCallback != null) {
                    WindowCallback.this.touchCallback.onScroll();
                }
                return false;
            }
        });
        this.callback = callback;
        this.touchCallback = windowTouchCallBack;
    }

    public Window.Callback getCallback() {
        return this.callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d82217211b9c4261ee637824df0cb675", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d82217211b9c4261ee637824df0cb675")).booleanValue() : this.callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad89a282d92fc31200ad5a212c6cefc5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad89a282d92fc31200ad5a212c6cefc5")).booleanValue() : this.callback.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b64e699afdca051c0e184d1b00de5452", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b64e699afdca051c0e184d1b00de5452")).booleanValue();
        }
        this.mGestureDetector.onTouchEvent(motionEvent);
        return this.callback.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "373889c3b6218203caf0e3d207243099", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "373889c3b6218203caf0e3d207243099")).booleanValue() : this.callback.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7de2323a3332bd8575ca3767ff408157", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7de2323a3332bd8575ca3767ff408157")).booleanValue() : this.callback.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Object[] objArr = {accessibilityEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a040f8eb6618b92aa8c6ef0a54f406e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a040f8eb6618b92aa8c6ef0a54f406e")).booleanValue() : this.callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public View onCreatePanelView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c8a7d164f99d85a367e96c7bc268f6a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c8a7d164f99d85a367e96c7bc268f6a") : this.callback.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        Object[] objArr = {Integer.valueOf(i), menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7338eb94075eb91f26dd675242c8b00a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7338eb94075eb91f26dd675242c8b00a")).booleanValue() : this.callback.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        Object[] objArr = {Integer.valueOf(i), view, menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3424d6191d08e82d74b641c57800b7e4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3424d6191d08e82d74b641c57800b7e4")).booleanValue() : this.callback.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        Object[] objArr = {Integer.valueOf(i), menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae8d2fd8b3b9f46b24d2807accc32dc5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae8d2fd8b3b9f46b24d2807accc32dc5")).booleanValue() : this.callback.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Object[] objArr = {Integer.valueOf(i), menuItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b160cb7bf533d60f4808b696a7c5760", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b160cb7bf533d60f4808b696a7c5760")).booleanValue() : this.callback.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76db3dc614b638a2cec67901d994d22e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76db3dc614b638a2cec67901d994d22e");
        } else {
            this.callback.onWindowAttributesChanged(layoutParams);
        }
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b664e1a9c965eae2e59178b6ce59e7b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b664e1a9c965eae2e59178b6ce59e7b8");
        } else {
            this.callback.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecac0961e8d24a9377b2cca0e24d16a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecac0961e8d24a9377b2cca0e24d16a6");
        } else {
            this.callback.onWindowFocusChanged(z);
        }
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c16feffe3beef317ed11254e278a2501", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c16feffe3beef317ed11254e278a2501");
        } else {
            this.callback.onAttachedToWindow();
        }
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e917dd782a46218cde6d2a547a87fbbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e917dd782a46218cde6d2a547a87fbbb");
        } else {
            this.callback.onDetachedFromWindow();
        }
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Object[] objArr = {Integer.valueOf(i), menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b649b430095475e9ee134d67676780a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b649b430095475e9ee134d67676780a");
        } else {
            this.callback.onPanelClosed(i, menu);
        }
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db4c2bbb2a9e9a27ebbda7a7f0cd142a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db4c2bbb2a9e9a27ebbda7a7f0cd142a")).booleanValue() : this.callback.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        Object[] objArr = {searchEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62885be1482438b2875325c8413102e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62885be1482438b2875325c8413102e6")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return this.callback.onSearchRequested(searchEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c5fd12e85935a172c03304d2f33fce6", RobustBitConfig.DEFAULT_VALUE) ? (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c5fd12e85935a172c03304d2f33fce6") : this.callback.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Object[] objArr = {callback, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dab58a69e8ba66e84e01e0c0888bae51", RobustBitConfig.DEFAULT_VALUE)) {
            return (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dab58a69e8ba66e84e01e0c0888bae51");
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return this.callback.onWindowStartingActionMode(callback, i);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        Object[] objArr = {actionMode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a586de9c9a74687008f5f4a9977aeaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a586de9c9a74687008f5f4a9977aeaa");
        } else {
            this.callback.onActionModeStarted(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        Object[] objArr = {actionMode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a550105233699f877b4d607de82f772", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a550105233699f877b4d607de82f772");
        } else {
            this.callback.onActionModeFinished(actionMode);
        }
    }
}
