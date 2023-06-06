package com.sankuai.waimai.store.ui.common;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.log.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCBaseDialog extends Dialog implements DialogInterface, DialogInterface.OnDismissListener, DialogInterface.OnShowListener {
    private static final List<WeakReference<SCBaseDialog>> a = new ArrayList();
    public static ChangeQuickRedirect k;
    private List<DialogInterface.OnDismissListener> b;
    private List<DialogInterface.OnShowListener> c;
    private View d;
    public boolean l;

    public void a(View view) {
    }

    public SCBaseDialog(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb0cc2eb49a0002cd696568241374bac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb0cc2eb49a0002cd696568241374bac");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        a();
    }

    public SCBaseDialog(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb8404224b9d6c948f84e37bbdac30d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb8404224b9d6c948f84e37bbdac30d1");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        a();
    }

    public SCBaseDialog(@NonNull Context context, @NonNull View view, @StyleRes int i) {
        super(context, i);
        WindowManager.LayoutParams attributes;
        Object[] objArr = {context, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c9ddb47f0cd514841d2901547488af5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c9ddb47f0cd514841d2901547488af5");
            return;
        }
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = view;
        setContentView(this.d);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.gravity = 17;
            window.setAttributes(attributes);
        }
        a(this.d);
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a74752f15555b4d2b0e8afb2df4f4fa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a74752f15555b4d2b0e8afb2df4f4fa8");
            return;
        }
        setOnDismissListener(this);
        setOnShowListener(this);
    }

    public final <T extends View> T c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11c7279fa2e1ebc8ffc404d73952193f", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11c7279fa2e1ebc8ffc404d73952193f") : (T) this.d.findViewById(i);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    @UiThread
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f282c07afa4c830b63c1c4c9f3e017a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f282c07afa4c830b63c1c4c9f3e017a1");
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            a.a(e);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        IBinder windowToken;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de9767a21030be989d8826dd1cd512d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de9767a21030be989d8826dd1cd512d6");
            return;
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = k;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2611e61a10abfde3496dcdbda02930c3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2611e61a10abfde3496dcdbda02930c3");
                return;
            }
            Activity bB_ = bB_();
            if (bB_ == null || bB_.isFinishing() || bB_.getWindow() == null) {
                return;
            }
            if (bB_.getWindow().isActive()) {
                View decorView = bB_.getWindow().getDecorView();
                Object[] objArr3 = {decorView};
                ChangeQuickRedirect changeQuickRedirect3 = k;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fa21a8aabec7268c695d974750822cba", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fa21a8aabec7268c695d974750822cba")).booleanValue();
                } else if (decorView != null && (windowToken = decorView.getWindowToken()) != null && windowToken.isBinderAlive() && windowToken.pingBinder()) {
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
            super.show();
        } catch (Exception e) {
            a.a(e);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "979fdaf20adbbc4bb072b46b8373b8cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "979fdaf20adbbc4bb072b46b8373b8cb")).booleanValue();
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            a.a(e);
            return false;
        }
    }

    public Activity bB_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cedc4ad78a9c82a4e8cf474fd67be2e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cedc4ad78a9c82a4e8cf474fd67be2e");
        }
        Context context = getContext();
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        return null;
    }

    public void a(DialogInterface.OnShowListener onShowListener) {
        Object[] objArr = {onShowListener};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b866e7f31d9880e4704498e0b4cef89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b866e7f31d9880e4704498e0b4cef89");
        } else if (this.c.contains(onShowListener)) {
        } else {
            this.c.add(onShowListener);
        }
    }

    public void a(DialogInterface.OnDismissListener onDismissListener) {
        Object[] objArr = {onDismissListener};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "761a98f68cb0976f236583456c792c5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "761a98f68cb0976f236583456c792c5c");
        } else if (this.b.contains(onDismissListener)) {
        } else {
            this.b.add(onDismissListener);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc48a164d5f23b1233d0508c992eaadc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc48a164d5f23b1233d0508c992eaadc");
            return;
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30f1c6b6cb6c66430941bcee80d92d58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30f1c6b6cb6c66430941bcee80d92d58");
        } else {
            for (int size = a.size() - 1; size >= 0; size--) {
                SCBaseDialog sCBaseDialog = a.get(size).get();
                if (sCBaseDialog == null || sCBaseDialog == this) {
                    a.remove(size);
                }
            }
        }
        for (DialogInterface.OnDismissListener onDismissListener : this.b) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public void onShow(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "752187c97ef60870093593da35034305", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "752187c97ef60870093593da35034305");
            return;
        }
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = k;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4ea25c20ba72bbdbf984beea290b3d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4ea25c20ba72bbdbf984beea290b3d6");
        } else {
            a.add(new WeakReference<>(this));
        }
        for (DialogInterface.OnShowListener onShowListener : this.c) {
            onShowListener.onShow(dialogInterface);
        }
    }

    public static Dialog j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "046cafce760ac6657e75d0dfba6c2424", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "046cafce760ac6657e75d0dfba6c2424");
        }
        for (int size = a.size() - 1; size >= 0; size--) {
            SCBaseDialog sCBaseDialog = a.get(size).get();
            if (sCBaseDialog != null) {
                return sCBaseDialog;
            }
        }
        return null;
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66c3eb3f80de922dbc6283bada25485c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66c3eb3f80de922dbc6283bada25485c");
            return;
        }
        super.setCanceledOnTouchOutside(z);
        this.l = z;
    }
}
