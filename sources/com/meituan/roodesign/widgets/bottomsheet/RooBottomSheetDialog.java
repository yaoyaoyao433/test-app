package com.meituan.roodesign.widgets.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.constraint.R;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.bottomsheet.widget.BottomSheetTitleBar;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooBottomSheetDialog extends AppCompatDialog implements DialogInterface {
    public static ChangeQuickRedirect a;
    @NonNull
    public final LinearLayoutCompat b;
    public final BottomSheetTitleBar c;
    private Message d;
    private Message e;
    private final float f;
    private final float g;
    private Handler h;
    private final View.OnClickListener i;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class a extends Handler {
        public static ChangeQuickRedirect a;
        private WeakReference<DialogInterface> b;

        public a(DialogInterface dialogInterface) {
            Object[] objArr = {dialogInterface};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3a38a9d08afc7a8b87f955627fb9a90", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3a38a9d08afc7a8b87f955627fb9a90");
            } else {
                this.b = new WeakReference<>(dialogInterface);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bcbb99b53aa54f11fc5538f9b0e952e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bcbb99b53aa54f11fc5538f9b0e952e");
                return;
            }
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case -3:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick(this.b.get(), message.what);
                        return;
                    default:
                        return;
                }
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }

    public RooBottomSheetDialog(@NonNull Context context) {
        this(context, 0);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef77733070faf7c4f981bdcfd7b00653", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef77733070faf7c4f981bdcfd7b00653");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private RooBottomSheetDialog(@android.support.annotation.NonNull android.content.Context r17, @android.support.annotation.StyleRes int r18) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r12 = 1
            r10[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.meituan.roodesign.widgets.bottomsheet.RooBottomSheetDialog.a
            java.lang.String r14 = "a1b42e46615150ec399d5a9263198f43"
            r1 = 0
            r3 = 1
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r10
            r2 = r13
            r4 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            r15 = 0
            if (r0 == 0) goto L2e
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r15, r13, r12, r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L46
        L2e:
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r17.getTheme()
            r2 = 2130772147(0x7f0100b3, float:1.7147404E38)
            boolean r1 = r1.resolveAttribute(r2, r0, r12)
            if (r1 == 0) goto L43
            int r0 = r0.resourceId
            goto L46
        L43:
            r0 = 2131558977(0x7f0d0241, float:1.8743285E38)
        L46:
            r7.<init>(r8, r0)
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r11] = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r10[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.meituan.roodesign.widgets.bottomsheet.RooBottomSheetDialog.a
            java.lang.String r14 = "4be3b48ac46e46ca49fbf747eab69e14"
            r3 = 0
            r5 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r0 = r10
            r1 = r16
            r2 = r13
            r4 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L69
            com.meituan.robust.PatchProxy.accessDispatch(r10, r7, r13, r11, r14)
            return
        L69:
            com.meituan.roodesign.widgets.bottomsheet.RooBottomSheetDialog$1 r0 = new com.meituan.roodesign.widgets.bottomsheet.RooBottomSheetDialog$1
            r0.<init>()
            r7.i = r0
            com.meituan.roodesign.widgets.bottomsheet.RooBottomSheetDialog$a r0 = new com.meituan.roodesign.widgets.bottomsheet.RooBottomSheetDialog$a
            r0.<init>(r7)
            r7.h = r0
            r0 = 2130969151(0x7f04023f, float:1.7546976E38)
            android.view.View r0 = android.view.View.inflate(r8, r0, r15)
            android.support.v7.widget.LinearLayoutCompat r0 = (android.support.v7.widget.LinearLayoutCompat) r0
            r7.b = r0
            android.support.v7.widget.LinearLayoutCompat r0 = r7.b
            r1 = 2131691686(0x7f0f08a6, float:1.901245E38)
            android.view.View r0 = r0.findViewById(r1)
            com.meituan.roodesign.widgets.bottomsheet.widget.BottomSheetTitleBar r0 = (com.meituan.roodesign.widgets.bottomsheet.widget.BottomSheetTitleBar) r0
            r7.c = r0
            android.content.Context r0 = r16.getContext()
            int[] r1 = new int[r9]
            r1 = {x00b8: FILL_ARRAY_DATA  , data: [2130773145, 2130773146} // fill-array
            r2 = 2130772146(0x7f0100b2, float:1.7147402E38)
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r15, r1, r2, r11)
            r1 = 1053609165(0x3ecccccd, float:0.4)
            float r1 = r0.getFraction(r11, r12, r12, r1)
            r7.g = r1
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r0.getFraction(r12, r12, r12, r1)
            r7.f = r1
            r0.recycle()
            r7.b(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.roodesign.widgets.bottomsheet.RooBottomSheetDialog.<init>(android.content.Context, int):void");
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23051c890de8b874b53eb17c4195e4a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23051c890de8b874b53eb17c4195e4a6");
            return;
        }
        super.onCreate(bundle);
        final Window window = getWindow();
        this.c.getPositiveButton().setOnClickListener(this.i);
        this.c.getNegativeButton().setOnClickListener(this.i);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.gravity = 81;
        attributes.width = -1;
        getWindow().setAttributes(attributes);
        this.b.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.meituan.roodesign.widgets.bottomsheet.RooBottomSheetDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fd4b2a45606bfce00b0579d46535e68", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fd4b2a45606bfce00b0579d46535e68")).booleanValue();
                }
                RooBottomSheetDialog.this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                int measuredHeight = RooBottomSheetDialog.this.b.getMeasuredHeight();
                DisplayMetrics displayMetrics = RooBottomSheetDialog.this.getContext().getResources().getDisplayMetrics();
                int i = (int) (displayMetrics.heightPixels * RooBottomSheetDialog.this.g);
                int i2 = (int) (displayMetrics.heightPixels * RooBottomSheetDialog.this.f);
                if (measuredHeight < i) {
                    i2 = i;
                } else if (measuredHeight <= i2) {
                    i2 = measuredHeight;
                }
                if (i2 != measuredHeight && window != null) {
                    window.setLayout(-1, i2);
                }
                return i2 == measuredHeight;
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff49f3f88ad7b1b7b58e1c89ca7c8a80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff49f3f88ad7b1b7b58e1c89ca7c8a80");
        } else {
            super.show();
        }
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13404aaba8c09f1e628290fbf7bb43f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13404aaba8c09f1e628290fbf7bb43f9");
        } else {
            super.setContentView(a(i, null, null));
        }
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void setContentView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fed8afa6683934cd2f634a35d25973e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fed8afa6683934cd2f634a35d25973e6");
        } else {
            super.setContentView(a(0, view, null));
        }
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9195b067b07698d058e7d42198a2ddaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9195b067b07698d058e7d42198a2ddaa");
        } else {
            super.setContentView(a(0, view, layoutParams));
        }
    }

    private View a(int i, @Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {Integer.valueOf(i), view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c80745433a6f3095f07bb0524ebb797", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c80745433a6f3095f07bb0524ebb797");
        }
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) this.b, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.b.findViewById(R.id.bottom_sheet);
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        return this.b;
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void setTitle(@StringRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cac690a0e7fc2506223188960876a6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cac690a0e7fc2506223188960876a6b");
        } else {
            this.c.setTitle(i);
        }
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff5d49b57cbca0234b8ab65e393cd2eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff5d49b57cbca0234b8ab65e393cd2eb");
        } else {
            this.c.setTitle(charSequence);
        }
    }
}
