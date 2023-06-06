package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.app.AppCompatDialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BottomSheetDialog extends AppCompatDialog {
    boolean a;
    boolean b;
    boolean c;
    private BottomSheetBehavior<FrameLayout> d;
    private BottomSheetBehavior.a e;

    public BottomSheetDialog(@NonNull Context context) {
        this(context, 0);
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        super.setContentView(a(i, null, null));
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(a(0, view, null));
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(a(0, view, layoutParams));
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.a != z) {
            this.a = z;
            if (this.d != null) {
                this.d.c = z;
            }
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        if (this.d != null) {
            this.d.b(4);
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.a) {
            this.a = true;
        }
        this.b = z;
        this.c = true;
    }

    private View a(int i, View view, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(R.id.design_bottom_sheet);
        this.d = BottomSheetBehavior.a(frameLayout2);
        this.d.j = this.e;
        this.d.c = this.a;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: android.support.design.widget.BottomSheetDialog.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (BottomSheetDialog.this.a && BottomSheetDialog.this.isShowing()) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    if (!bottomSheetDialog.c) {
                        if (Build.VERSION.SDK_INT < 11) {
                            bottomSheetDialog.b = true;
                        } else {
                            TypedArray obtainStyledAttributes = bottomSheetDialog.getContext().obtainStyledAttributes(new int[]{16843611});
                            bottomSheetDialog.b = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                        }
                        bottomSheetDialog.c = true;
                    }
                    if (bottomSheetDialog.b) {
                        BottomSheetDialog.this.cancel();
                    }
                }
            }
        });
        ViewCompat.setAccessibilityDelegate(frameLayout2, new AccessibilityDelegateCompat() { // from class: android.support.design.widget.BottomSheetDialog.2
            @Override // android.support.v4.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                if (BottomSheetDialog.this.a) {
                    accessibilityNodeInfoCompat.addAction(1048576);
                    accessibilityNodeInfoCompat.setDismissable(true);
                    return;
                }
                accessibilityNodeInfoCompat.setDismissable(false);
            }

            @Override // android.support.v4.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(View view2, int i2, Bundle bundle) {
                if (i2 == 1048576 && BottomSheetDialog.this.a) {
                    BottomSheetDialog.this.cancel();
                    return true;
                }
                return super.performAccessibilityAction(view2, i2, bundle);
            }
        });
        frameLayout2.setOnTouchListener(new View.OnTouchListener() { // from class: android.support.design.widget.BottomSheetDialog.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        return frameLayout;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BottomSheetDialog(@android.support.annotation.NonNull android.content.Context r4, @android.support.annotation.StyleRes int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130772649(0x7f0102a9, float:1.7148422E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2131558937(0x7f0d0219, float:1.8743204E38)
        L1b:
            r3.<init>(r4, r5)
            r3.a = r0
            r3.b = r0
            android.support.design.widget.BottomSheetDialog$4 r4 = new android.support.design.widget.BottomSheetDialog$4
            r4.<init>()
            r3.e = r4
            r3.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetDialog.<init>(android.content.Context, int):void");
    }
}
