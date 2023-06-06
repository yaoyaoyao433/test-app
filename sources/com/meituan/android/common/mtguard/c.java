package com.meituan.android.common.mtguard;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
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
import com.meituan.android.common.dfingerprint.store.BioSharedPref;
import com.meituan.android.common.mtguard.collect.d;
import com.meituan.android.common.mtguard.collect.o;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public final class c implements Window.Callback {
    public static boolean a = false;
    private static long b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Window.Callback c;
    private Context d;

    public c(Window.Callback callback, Context context) {
        Object[] objArr = {callback, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d7ac0637ab8da782dc9c0ff3fc01e37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d7ac0637ab8da782dc9c0ff3fc01e37");
            return;
        }
        this.c = callback;
        this.d = context;
    }

    private void a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e14475435b9772eb37d544766b567cbd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e14475435b9772eb37d544766b567cbd");
        } else if (motionEvent == null) {
        } else {
            try {
                if (!d.a(this.d).a() || b == motionEvent.getEventTime()) {
                    return;
                }
                b = motionEvent.getEventTime();
                d a2 = d.a(this.d);
                if (motionEvent.getActionMasked() == 0 && a2.d.size() < 1000) {
                    a2.d.add(a2.a(motionEvent, false));
                }
                if (a2.a != null && a2.h != null && a2.h.a()) {
                    BioSharedPref bioSharedPref = BioSharedPref.getInstance(a2.i);
                    if (LifecycleManager.firstProcessBootTime <= 0) {
                        if (LifecycleManager.isFirstProcess()) {
                            return;
                        }
                        LifecycleManager.firstProcessBootTime = bioSharedPref.readLong(BioSharedPref.FIRST_PROCESS_BOOT_TIME_KEY);
                    }
                    int readInt = bioSharedPref.readInt(BioSharedPref.BIO_COLLECT_INDEX);
                    long readLong = bioSharedPref.readLong(BioSharedPref.BIO_COLLECT_CURRENTTIMEMILLIS);
                    if ((readLong != -1 || SystemClock.elapsedRealtime() - LifecycleManager.firstProcessBootTime >= a2.h.d * 1000) && System.currentTimeMillis() >= readLong + (a2.h.f * 60000)) {
                        if (readInt > a2.h.g + 2) {
                            if (a2.e) {
                                return;
                            }
                            a2.e = true;
                            return;
                        }
                        String readString = bioSharedPref.readString(BioSharedPref.BIO_COLLECT_MTX_KEY);
                        String a3 = com.meituan.android.common.mtguard.utils.b.a();
                        if (TextUtils.isEmpty(readString) || readString.equals(a3)) {
                            if (TextUtils.isEmpty(readString)) {
                                a2.f = true;
                            }
                            if (a2.f && a2.g) {
                                bioSharedPref.writeString(BioSharedPref.BIO_COLLECT_MTX_KEY, a3);
                                a2.f = false;
                                a2.g = false;
                                MTGuardLog.setLogan("start collect bio, processName:" + a3 + ", process_pid:" + Process.myPid());
                                o.c().a(a2.a, a2.h.b, a2.h.c, a2.h.e);
                                new com.meituan.android.common.mtguard.collect.b(a2.a).a((long) a2.h.e, false, true);
                            }
                            if (a2.b.size() < 1000) {
                                switch (motionEvent.getActionMasked()) {
                                    case 0:
                                        d.C0227d c0227d = new d.C0227d();
                                        d.c = c0227d;
                                        c0227d.e = motionEvent.getDownTime();
                                        int actionIndex = motionEvent.getActionIndex();
                                        d.c.a.a = motionEvent.getRawX();
                                        d.c.a.b = motionEvent.getRawY();
                                        d.c.a.c = motionEvent.getSize(actionIndex);
                                        d.c.a.d = motionEvent.getPressure(actionIndex);
                                        d.c.a.e = System.currentTimeMillis();
                                        d.c.f = motionEvent.getEventTime();
                                        d.c.d = a2.a(motionEvent, true);
                                        a2.b.add(d.c);
                                        return;
                                    case 1:
                                        if (d.c == null || d.c.e != motionEvent.getDownTime()) {
                                            return;
                                        }
                                        int actionIndex2 = motionEvent.getActionIndex();
                                        d.c.c.a = motionEvent.getRawX();
                                        d.c.c.b = motionEvent.getRawY();
                                        d.c.c.c = motionEvent.getSize(actionIndex2);
                                        d.c.c.d = motionEvent.getPressure(actionIndex2);
                                        d.c.c.e = motionEvent.getEventTime() - d.c.f;
                                        d.c.f = motionEvent.getEventTime();
                                        return;
                                    case 2:
                                        if (d.c == null || d.c.e != motionEvent.getDownTime() || d.c.b.size() >= 1000) {
                                            return;
                                        }
                                        d.b bVar = new d.b();
                                        int actionIndex3 = motionEvent.getActionIndex();
                                        bVar.a = motionEvent.getRawX();
                                        bVar.b = motionEvent.getRawY();
                                        bVar.c = motionEvent.getSize(actionIndex3);
                                        bVar.d = motionEvent.getPressure(actionIndex3);
                                        bVar.e = motionEvent.getEventTime() - d.c.f;
                                        d.c.f = motionEvent.getEventTime();
                                        d.c.b.add(bVar);
                                        return;
                                    default:
                                        return;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d40741d41d429060b99b053d5c2537c8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d40741d41d429060b99b053d5c2537c8")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07aa70a8eeac0125295862c91674c06f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07aa70a8eeac0125295862c91674c06f")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Object[] objArr = {keyEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cee91f242b3d1615fa7a1db153a08153", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cee91f242b3d1615fa7a1db153a08153")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Object[] objArr = {accessibilityEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9eea334226d15dcbc60ae707fa8ffce9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9eea334226d15dcbc60ae707fa8ffce9")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        a = true;
        return this.c.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d92bf9c715d457f0aa92ac54c2fef58", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d92bf9c715d457f0aa92ac54c2fef58")).booleanValue();
        }
        if (motionEvent != null) {
            try {
                if (d.a(this.d).a() && b != motionEvent.getEventTime()) {
                    b = motionEvent.getEventTime();
                    d a2 = d.a(this.d);
                    if (motionEvent.getActionMasked() == 0 && a2.d.size() < 1000) {
                        a2.d.add(a2.a(motionEvent, false));
                    }
                    if (a2.a != null && a2.h != null && a2.h.a()) {
                        BioSharedPref bioSharedPref = BioSharedPref.getInstance(a2.i);
                        if (LifecycleManager.firstProcessBootTime <= 0) {
                            if (!LifecycleManager.isFirstProcess()) {
                                LifecycleManager.firstProcessBootTime = bioSharedPref.readLong(BioSharedPref.FIRST_PROCESS_BOOT_TIME_KEY);
                            }
                        }
                        int readInt = bioSharedPref.readInt(BioSharedPref.BIO_COLLECT_INDEX);
                        long readLong = bioSharedPref.readLong(BioSharedPref.BIO_COLLECT_CURRENTTIMEMILLIS);
                        if ((readLong != -1 || SystemClock.elapsedRealtime() - LifecycleManager.firstProcessBootTime >= a2.h.d * 1000) && System.currentTimeMillis() >= readLong + (a2.h.f * 60000)) {
                            if (readInt <= a2.h.g + 2) {
                                String readString = bioSharedPref.readString(BioSharedPref.BIO_COLLECT_MTX_KEY);
                                String a3 = com.meituan.android.common.mtguard.utils.b.a();
                                if (TextUtils.isEmpty(readString) || readString.equals(a3)) {
                                    if (TextUtils.isEmpty(readString)) {
                                        a2.f = true;
                                    }
                                    if (a2.f && a2.g) {
                                        bioSharedPref.writeString(BioSharedPref.BIO_COLLECT_MTX_KEY, a3);
                                        a2.f = false;
                                        a2.g = false;
                                        MTGuardLog.setLogan("start collect bio, processName:" + a3 + ", process_pid:" + Process.myPid());
                                        o.c().a(a2.a, a2.h.b, a2.h.c, a2.h.e);
                                        new com.meituan.android.common.mtguard.collect.b(a2.a).a((long) a2.h.e, false, true);
                                    }
                                    if (a2.b.size() < 1000) {
                                        switch (motionEvent.getActionMasked()) {
                                            case 0:
                                                d.C0227d c0227d = new d.C0227d();
                                                d.c = c0227d;
                                                c0227d.e = motionEvent.getDownTime();
                                                int actionIndex = motionEvent.getActionIndex();
                                                d.c.a.a = motionEvent.getRawX();
                                                d.c.a.b = motionEvent.getRawY();
                                                d.c.a.c = motionEvent.getSize(actionIndex);
                                                d.c.a.d = motionEvent.getPressure(actionIndex);
                                                d.c.a.e = System.currentTimeMillis();
                                                d.c.f = motionEvent.getEventTime();
                                                d.c.d = a2.a(motionEvent, true);
                                                a2.b.add(d.c);
                                                break;
                                            case 1:
                                                if (d.c != null && d.c.e == motionEvent.getDownTime()) {
                                                    int actionIndex2 = motionEvent.getActionIndex();
                                                    d.c.c.a = motionEvent.getRawX();
                                                    d.c.c.b = motionEvent.getRawY();
                                                    d.c.c.c = motionEvent.getSize(actionIndex2);
                                                    d.c.c.d = motionEvent.getPressure(actionIndex2);
                                                    d.c.c.e = motionEvent.getEventTime() - d.c.f;
                                                    d.c.f = motionEvent.getEventTime();
                                                    break;
                                                }
                                                break;
                                            case 2:
                                                if (d.c != null && d.c.e == motionEvent.getDownTime() && d.c.b.size() < 1000) {
                                                    d.b bVar = new d.b();
                                                    int actionIndex3 = motionEvent.getActionIndex();
                                                    bVar.a = motionEvent.getRawX();
                                                    bVar.b = motionEvent.getRawY();
                                                    bVar.c = motionEvent.getSize(actionIndex3);
                                                    bVar.d = motionEvent.getPressure(actionIndex3);
                                                    bVar.e = motionEvent.getEventTime() - d.c.f;
                                                    d.c.f = motionEvent.getEventTime();
                                                    d.c.b.add(bVar);
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                }
                            } else if (!a2.e) {
                                a2.e = true;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                MTGuardLog.setErrorLogan(th);
            }
        }
        if (this.c == null) {
            return false;
        }
        return this.c.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0def4b6d8ca18ffe2e900353e0de796", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0def4b6d8ca18ffe2e900353e0de796")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        Object[] objArr = {actionMode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6fdedb62b69826f2555f888590166c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6fdedb62b69826f2555f888590166c8");
        } else if (this.c == null) {
        } else {
            this.c.onActionModeFinished(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        Object[] objArr = {actionMode};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "948492c528132bdd375357db72e54663", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "948492c528132bdd375357db72e54663");
        } else if (this.c == null) {
        } else {
            this.c.onActionModeStarted(actionMode);
        }
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "404a9a2cd8c050a677d823a3be17178a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "404a9a2cd8c050a677d823a3be17178a");
        } else if (this.c == null) {
        } else {
            this.c.onAttachedToWindow();
        }
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d1045606755ddf380e6cad36f886168", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d1045606755ddf380e6cad36f886168");
        } else if (this.c == null) {
        } else {
            this.c.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
        Object[] objArr = {Integer.valueOf(i), menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d45f889cc3c338b431c815673177517", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d45f889cc3c338b431c815673177517")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final View onCreatePanelView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34d752492a6fc3f6943a088674981bd2", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34d752492a6fc3f6943a088674981bd2");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d05c9ffb103d384f92885ae6a46da0a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d05c9ffb103d384f92885ae6a46da0a8");
        } else if (this.c == null) {
        } else {
            this.c.onDetachedFromWindow();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        Object[] objArr = {Integer.valueOf(i), menuItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d0180e499e963df1a2f2d467d00222e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d0180e499e963df1a2f2d467d00222e")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, @NonNull Menu menu) {
        Object[] objArr = {Integer.valueOf(i), menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcdefb1a421e38ed5fdf65405750e18e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcdefb1a421e38ed5fdf65405750e18e")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, @NonNull Menu menu) {
        Object[] objArr = {Integer.valueOf(i), menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e26bdfb43f0e2e6902b424391f7e9549", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e26bdfb43f0e2e6902b424391f7e9549");
        } else if (this.c == null) {
        } else {
            this.c.onPanelClosed(i, menu);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, @Nullable View view, @NonNull Menu menu) {
        Object[] objArr = {Integer.valueOf(i), view, menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0562ed4fe867f3bacd7e75277cdf72d2", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0562ed4fe867f3bacd7e75277cdf72d2")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5874fa39a07c7ebef205f6eb70c8c285", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5874fa39a07c7ebef205f6eb70c8c285")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        Object[] objArr = {searchEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a2a4a1b5b45e4ccef388458f033dcd1", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a2a4a1b5b45e4ccef388458f033dcd1")).booleanValue();
        }
        if (this.c != null && Build.VERSION.SDK_INT >= 23) {
            return this.c.onSearchRequested(searchEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1829c714f3710f8554e8862e05187abf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1829c714f3710f8554e8862e05187abf");
        } else if (this.c == null) {
        } else {
            this.c.onWindowAttributesChanged(layoutParams);
        }
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "057aa58f9df8ffac86ee8ca3a87df443", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "057aa58f9df8ffac86ee8ca3a87df443");
        } else if (this.c == null) {
        } else {
            this.c.onWindowFocusChanged(z);
        }
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05cfa7d25a0825efbc869026781a5c08", 6917529027641081856L)) {
            return (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05cfa7d25a0825efbc869026781a5c08");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Object[] objArr = {callback, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8fb86d0f0dc7347e0682ff7cdfcebf5", 6917529027641081856L)) {
            return (ActionMode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8fb86d0f0dc7347e0682ff7cdfcebf5");
        }
        if (this.c != null && Build.VERSION.SDK_INT >= 23) {
            return this.c.onWindowStartingActionMode(callback, i);
        }
        return null;
    }
}
