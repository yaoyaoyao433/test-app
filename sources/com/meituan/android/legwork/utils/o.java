package com.meituan.android.legwork.utils;

import android.annotation.TargetApi;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
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
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class o implements Window.Callback {
    public static ChangeQuickRedirect a;
    public Window.Callback b;

    public o(Window.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c29e3212ae80934b6cc564947c99382", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c29e3212ae80934b6cc564947c99382");
        } else {
            this.b = callback;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1bb1dbb461250a044eb8829ca560298", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1bb1dbb461250a044eb8829ca560298")).booleanValue();
        }
        if (this.b != null) {
            try {
                return this.b.dispatchKeyEvent(keyEvent);
            } catch (Exception e) {
                x.e("LegworkWindowCallBack.dispatchKeyEvent()", "exception msg:", e);
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d2a7ca449a5118602a44aa05fa507ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d2a7ca449a5118602a44aa05fa507ea")).booleanValue();
        }
        if (this.b != null) {
            return this.b.dispatchKeyShortcutEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb8600077ac14df70455ba34e4dc5f8c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb8600077ac14df70455ba34e4dc5f8c")).booleanValue();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 5) {
            com.meituan.android.legwork.monitor.b.a().b();
        }
        if (this.b != null) {
            return this.b.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc612b6b2bc73be019ebbb8829a51a10", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc612b6b2bc73be019ebbb8829a51a10")).booleanValue();
        }
        if (this.b != null) {
            return this.b.dispatchTrackballEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b2598d605956e1c2cb5712be1708db8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b2598d605956e1c2cb5712be1708db8")).booleanValue();
        }
        if (this.b != null) {
            return this.b.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Object[] objArr = {accessibilityEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "777cfb6bed02ebeb6902e7586478e2f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "777cfb6bed02ebeb6902e7586478e2f4")).booleanValue();
        }
        if (this.b != null) {
            return this.b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final View onCreatePanelView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfa63566a41ff17bb7de92c4b32e8dbc", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfa63566a41ff17bb7de92c4b32e8dbc");
        }
        if (this.b != null) {
            return this.b.onCreatePanelView(i);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
        Object[] objArr = {Integer.valueOf(i), menu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e1a2653c1bd52d2ebd799ea37b37ebe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e1a2653c1bd52d2ebd799ea37b37ebe")).booleanValue();
        }
        if (this.b != null) {
            return this.b.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, @Nullable View view, @NonNull Menu menu) {
        Object[] objArr = {Integer.valueOf(i), view, menu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "587522ff3b3d6d533d49371fad06aa0e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "587522ff3b3d6d533d49371fad06aa0e")).booleanValue();
        }
        if (this.b != null) {
            return this.b.onPreparePanel(i, view, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, @NonNull Menu menu) {
        Object[] objArr = {Integer.valueOf(i), menu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a24a490e802b4f78b72cdcca36fcaa4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a24a490e802b4f78b72cdcca36fcaa4")).booleanValue();
        }
        if (this.b != null) {
            return this.b.onMenuOpened(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        Object[] objArr = {Integer.valueOf(i), menuItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84d4bfb54268fc20eefba181bb607f22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84d4bfb54268fc20eefba181bb607f22")).booleanValue();
        }
        if (this.b != null) {
            return this.b.onMenuItemSelected(i, menuItem);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7034353654fc9542b82b73d45d58a111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7034353654fc9542b82b73d45d58a111");
        } else if (this.b != null) {
            this.b.onWindowAttributesChanged(layoutParams);
        }
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "388e857d95730f1937419568d1b3e9f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "388e857d95730f1937419568d1b3e9f6");
        } else if (this.b != null) {
            this.b.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbc8bb960df0368b3ba83b5cc374d6d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbc8bb960df0368b3ba83b5cc374d6d9");
        } else if (this.b != null) {
            this.b.onWindowFocusChanged(z);
        }
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc8d322f5c6c1981133af3b395b979f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc8d322f5c6c1981133af3b395b979f");
        } else if (this.b != null) {
            this.b.onAttachedToWindow();
        }
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a1b3fdcf3e304a8e8df5bc2bb88623", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a1b3fdcf3e304a8e8df5bc2bb88623");
        } else if (this.b != null) {
            this.b.onDetachedFromWindow();
        }
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, @NonNull Menu menu) {
        Object[] objArr = {Integer.valueOf(i), menu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba878b71c548b8754daf0338e5724096", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba878b71c548b8754daf0338e5724096");
        } else if (this.b != null) {
            this.b.onPanelClosed(i, menu);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12317f05c109c3f412ab8e80d8c49bab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12317f05c109c3f412ab8e80d8c49bab")).booleanValue();
        }
        if (this.b != null) {
            return this.b.onSearchRequested();
        }
        return false;
    }

    @Override // android.view.Window.Callback
    @TargetApi(23)
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        Object[] objArr = {searchEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a34fb7705dc22b05dc212e5cb55a78b6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a34fb7705dc22b05dc212e5cb55a78b6")).booleanValue();
        }
        if (this.b != null) {
            return this.b.onSearchRequested(searchEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "792b5ab8085d4ea279df463c767ccb9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "792b5ab8085d4ea279df463c767ccb9c");
        }
        if (this.b != null) {
            return this.b.onWindowStartingActionMode(callback);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    @TargetApi(23)
    @Nullable
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Object[] objArr = {callback, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffaaa70a0cd5caa9eb3077df471d0323", RobustBitConfig.DEFAULT_VALUE)) {
            return (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffaaa70a0cd5caa9eb3077df471d0323");
        }
        if (this.b != null) {
            return this.b.onWindowStartingActionMode(callback, i);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        Object[] objArr = {actionMode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e2df21604f5f52336ae770e8196a784", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e2df21604f5f52336ae770e8196a784");
        } else if (this.b != null) {
            this.b.onActionModeStarted(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        Object[] objArr = {actionMode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6cd108e1390e38079ee66a84a23772f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6cd108e1390e38079ee66a84a23772f");
        } else if (this.b != null) {
            this.b.onActionModeFinished(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    @TargetApi(24)
    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, @Nullable Menu menu, int i) {
        Object[] objArr = {list, menu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb827cf79901311e95583d20906b3c07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb827cf79901311e95583d20906b3c07");
        } else if (this.b != null) {
            this.b.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    @TargetApi(26)
    public final void onPointerCaptureChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c4523aee21b5df712e47c580d9d3869", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c4523aee21b5df712e47c580d9d3869");
        } else if (this.b != null) {
            this.b.onPointerCaptureChanged(z);
        }
    }
}
