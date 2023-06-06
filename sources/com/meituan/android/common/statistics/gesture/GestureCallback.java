package com.meituan.android.common.statistics.gesture;

import android.annotation.TargetApi;
import android.content.Context;
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
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GestureCallback implements Window.Callback {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Window.Callback callback;
    private Context context;

    public GestureCallback(Context context, Window.Callback callback) {
        Object[] objArr = {context, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86894deab2e3da1b8fea654fd7aa7a61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86894deab2e3da1b8fea654fd7aa7a61");
            return;
        }
        this.callback = callback;
        this.context = context;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b2f9b654d8fe750a44f26cf9b9946ff", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b2f9b654d8fe750a44f26cf9b9946ff")).booleanValue() : this.callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "400c95cf4f9ff87d90b6bda127253a43", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "400c95cf4f9ff87d90b6bda127253a43")).booleanValue() : this.callback.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4648869cfa159b943292d4e8f6ee4087", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4648869cfa159b943292d4e8f6ee4087")).booleanValue();
        }
        GestureManager.getInstance().dispatchTouchEvent(this.context, motionEvent);
        return this.callback.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b30c6492fe3e8bf0860a55abbffa8c5b", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b30c6492fe3e8bf0860a55abbffa8c5b")).booleanValue() : this.callback.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4f2290030ec852da50474cc6fbb345b", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4f2290030ec852da50474cc6fbb345b")).booleanValue() : this.callback.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Object[] objArr = {accessibilityEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "807c47b64681ecaa6b1c8472147b023d", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "807c47b64681ecaa6b1c8472147b023d")).booleanValue() : this.callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public View onCreatePanelView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "747f9ff78061184498ec4b37988570bd", 6917529027641081856L) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "747f9ff78061184498ec4b37988570bd") : this.callback.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        Object[] objArr = {Integer.valueOf(i), menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "743db7fe6813f7bd2ef0d1fe86f6327d", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "743db7fe6813f7bd2ef0d1fe86f6327d")).booleanValue() : this.callback.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        Object[] objArr = {Integer.valueOf(i), view, menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a75a88ef6deeb8f37e74d42ef29c9f6", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a75a88ef6deeb8f37e74d42ef29c9f6")).booleanValue() : this.callback.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        Object[] objArr = {Integer.valueOf(i), menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88d3c76d50273667ec88fe94ee71f5fb", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88d3c76d50273667ec88fe94ee71f5fb")).booleanValue() : this.callback.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Object[] objArr = {Integer.valueOf(i), menuItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fa4314bad3c2af6ae2b45728c2af7ef", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fa4314bad3c2af6ae2b45728c2af7ef")).booleanValue() : this.callback.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "636f925723edc6d24d56416c2a84eb80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "636f925723edc6d24d56416c2a84eb80");
        } else {
            this.callback.onWindowAttributesChanged(layoutParams);
        }
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "652c9db11e840db50e81f2dd639b12fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "652c9db11e840db50e81f2dd639b12fd");
        } else {
            this.callback.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db8976fec5e9493c01a7cf53d909cd8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db8976fec5e9493c01a7cf53d909cd8f");
        } else {
            this.callback.onWindowFocusChanged(z);
        }
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc2ccb9ce20236c841d0c28b44503232", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc2ccb9ce20236c841d0c28b44503232");
        } else {
            this.callback.onAttachedToWindow();
        }
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19564a3195448965c14cfd49f22aa0c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19564a3195448965c14cfd49f22aa0c9");
        } else {
            this.callback.onDetachedFromWindow();
        }
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Object[] objArr = {Integer.valueOf(i), menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d281b4e48e8be4c126341ffd2c3a8c86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d281b4e48e8be4c126341ffd2c3a8c86");
        } else {
            this.callback.onPanelClosed(i, menu);
        }
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4461dac8bb8dda25b741b21c1f9f997", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4461dac8bb8dda25b741b21c1f9f997")).booleanValue() : this.callback.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    @TargetApi(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        Object[] objArr = {searchEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd6589aff7c1d6b9fe1e85fa980e95c2", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd6589aff7c1d6b9fe1e85fa980e95c2")).booleanValue() : this.callback.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efd0772ccf4c663a910810ae43304ebd", 6917529027641081856L) ? (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efd0772ccf4c663a910810ae43304ebd") : this.callback.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    @TargetApi(23)
    @Nullable
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Object[] objArr = {callback, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb87db4d27eea821a5c04173f5252d55", 6917529027641081856L) ? (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb87db4d27eea821a5c04173f5252d55") : this.callback.onWindowStartingActionMode(callback, i);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        Object[] objArr = {actionMode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "960866dbdc7a0ccb73a5697777f1cb3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "960866dbdc7a0ccb73a5697777f1cb3d");
        } else {
            this.callback.onActionModeStarted(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        Object[] objArr = {actionMode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c94f04d062964ef53e6f39532aeadd4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c94f04d062964ef53e6f39532aeadd4e");
        } else {
            this.callback.onActionModeFinished(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    @TargetApi(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, @Nullable Menu menu, int i) {
        Object[] objArr = {list, menu, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e962c65f64e6d624210eda4b4ba58ca4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e962c65f64e6d624210eda4b4ba58ca4");
        } else {
            this.callback.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    @TargetApi(26)
    public void onPointerCaptureChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15356d8932de8436bec0e24a3c9a7f13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15356d8932de8436bec0e24a3c9a7f13");
        } else {
            this.callback.onPointerCaptureChanged(z);
        }
    }
}
