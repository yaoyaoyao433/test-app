package com.meituan.android.yoda.model.behavior.tool;

import android.os.Build;
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
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static void a(Window window) {
        Object[] objArr = {window};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "078398dd8a021c6619b1faa9d1f1a7db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "078398dd8a021c6619b1faa9d1f1a7db");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof com.meituan.android.yoda.interfaces.a) {
            return;
        }
        window.setCallback(new a(window.getDecorView(), callback));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a implements Window.Callback, com.meituan.android.yoda.interfaces.a {
        public static ChangeQuickRedirect a;
        private View b;
        private Window.Callback c;

        public a(View view, Window.Callback callback) {
            Object[] objArr = {view, callback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e740b2d14b485a7b7b2dfca5c9b3436f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e740b2d14b485a7b7b2dfca5c9b3436f");
                return;
            }
            this.b = view;
            this.c = callback;
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            Object[] objArr = {keyEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d864ebceb8dadeb4a19cbfe9314100ea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d864ebceb8dadeb4a19cbfe9314100ea")).booleanValue() : this.c != null && this.c.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            Object[] objArr = {keyEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45b241f86eac94b58280116de3dc0dc8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45b241f86eac94b58280116de3dc0dc8")).booleanValue() : this.c != null && this.c.dispatchKeyShortcutEvent(keyEvent);
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            boolean z = true;
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aaafec011d1d53f3c4c0629299ea693", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aaafec011d1d53f3c4c0629299ea693")).booleanValue();
            }
            z = (this.c == null || !this.c.dispatchTouchEvent(motionEvent)) ? false : false;
            h.a(this.b, motionEvent, z);
            return z;
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "183c23f245c53cdeb59ac4b6b330c853", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "183c23f245c53cdeb59ac4b6b330c853")).booleanValue() : this.c != null && this.c.dispatchTrackballEvent(motionEvent);
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            Object[] objArr = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04b3651b2c59e898e5aacd41c311ce70", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04b3651b2c59e898e5aacd41c311ce70")).booleanValue() : this.c != null && this.c.dispatchGenericMotionEvent(motionEvent);
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            Object[] objArr = {accessibilityEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e200b6b01c412b429bb9775e0682b283", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e200b6b01c412b429bb9775e0682b283")).booleanValue() : this.c != null && this.c.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }

        @Override // android.view.Window.Callback
        @Nullable
        public final View onCreatePanelView(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23aa5652f3a8163d99870d99d12e4d60", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23aa5652f3a8163d99870d99d12e4d60");
            }
            if (this.c != null) {
                return this.c.onCreatePanelView(i);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            Object[] objArr = {Integer.valueOf(i), menu};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eb3bbf97ed8d2d4c0a5daf19034fb51", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eb3bbf97ed8d2d4c0a5daf19034fb51")).booleanValue() : this.c != null && this.c.onCreatePanelMenu(i, menu);
        }

        @Override // android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            Object[] objArr = {Integer.valueOf(i), view, menu};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a6e2170fad82880ae2a0785d2e40bbf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a6e2170fad82880ae2a0785d2e40bbf")).booleanValue() : this.c != null && this.c.onPreparePanel(i, view, menu);
        }

        @Override // android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) {
            Object[] objArr = {Integer.valueOf(i), menu};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0348ca8fae3e2eafc538a2b24f17b61d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0348ca8fae3e2eafc538a2b24f17b61d")).booleanValue() : this.c != null && this.c.onMenuOpened(i, menu);
        }

        @Override // android.view.Window.Callback
        public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
            Object[] objArr = {Integer.valueOf(i), menuItem};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29b19036ad64c0d24f8318954130b87c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29b19036ad64c0d24f8318954130b87c")).booleanValue() : this.c != null && this.c.onMenuItemSelected(i, menuItem);
        }

        @Override // android.view.Window.Callback
        public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
            Object[] objArr = {layoutParams};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fbd12cba91aa1bb19c5e648a4071e6d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fbd12cba91aa1bb19c5e648a4071e6d");
            } else if (this.c != null) {
                this.c.onWindowAttributesChanged(layoutParams);
            }
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50fa6a066f84014629eafd602d3621a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50fa6a066f84014629eafd602d3621a7");
            } else if (this.c != null) {
                this.c.onContentChanged();
            }
        }

        @Override // android.view.Window.Callback
        public final void onWindowFocusChanged(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aabd733435f35e73f700ae34673ff79", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aabd733435f35e73f700ae34673ff79");
            } else if (this.c != null) {
                this.c.onWindowFocusChanged(z);
            }
        }

        @Override // android.view.Window.Callback
        public final void onAttachedToWindow() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed5f52d39cec67ad66501822bf3db445", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed5f52d39cec67ad66501822bf3db445");
            } else if (this.c != null) {
                this.c.onAttachedToWindow();
            }
        }

        @Override // android.view.Window.Callback
        public final void onDetachedFromWindow() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a75db38e11587e67d9452712f68c50b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a75db38e11587e67d9452712f68c50b");
            } else if (this.c != null) {
                this.c.onDetachedFromWindow();
            }
        }

        @Override // android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) {
            Object[] objArr = {Integer.valueOf(i), menu};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dfc3c08fd9aede13196b9a65db3f378", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dfc3c08fd9aede13196b9a65db3f378");
            } else if (this.c != null) {
                this.c.onPanelClosed(i, menu);
            }
        }

        @Override // android.view.Window.Callback
        public final boolean onSearchRequested() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "078e03237917bfe9e91599b63c93e786", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "078e03237917bfe9e91599b63c93e786")).booleanValue() : this.c != null && this.c.onSearchRequested();
        }

        @Override // android.view.Window.Callback
        public final boolean onSearchRequested(SearchEvent searchEvent) {
            Object[] objArr = {searchEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7f45e23ad0324f0774cd0f2c05c8986", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7f45e23ad0324f0774cd0f2c05c8986")).booleanValue() : Build.VERSION.SDK_INT >= 23 && this.c != null && this.c.onSearchRequested(searchEvent);
        }

        @Override // android.view.Window.Callback
        @Nullable
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            Object[] objArr = {callback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a783d66f327e0b7c4b6eff7f2eddaf81", RobustBitConfig.DEFAULT_VALUE)) {
                return (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a783d66f327e0b7c4b6eff7f2eddaf81");
            }
            if (this.c != null) {
                return this.c.onWindowStartingActionMode(callback);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        @Nullable
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            Object[] objArr = {callback, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fde147386a7b35fb9212037063d10f3", RobustBitConfig.DEFAULT_VALUE)) {
                return (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fde147386a7b35fb9212037063d10f3");
            }
            if (Build.VERSION.SDK_INT >= 23 && this.c != null) {
                return this.c.onWindowStartingActionMode(callback, i);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public final void onActionModeStarted(ActionMode actionMode) {
            Object[] objArr = {actionMode};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f18f362c9008a35ead587ea195e875b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f18f362c9008a35ead587ea195e875b");
            } else if (this.c != null) {
                this.c.onActionModeStarted(actionMode);
            }
        }

        @Override // android.view.Window.Callback
        public final void onActionModeFinished(ActionMode actionMode) {
            Object[] objArr = {actionMode};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffecabfab7e33d44e658ef1d14ed9505", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffecabfab7e33d44e658ef1d14ed9505");
            } else if (this.c != null) {
                this.c.onActionModeFinished(actionMode);
            }
        }
    }
}
