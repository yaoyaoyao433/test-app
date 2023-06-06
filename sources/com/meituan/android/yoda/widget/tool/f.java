package com.meituan.android.yoda.widget.tool;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.yoda.util.x;
import com.meituan.android.yoda.util.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    WeakReference<Activity> b;
    AlertDialog c;
    @SuppressLint({"HandlerLeak"})
    Handler d;

    private f(AlertDialog alertDialog) {
        Object[] objArr = {alertDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef46166660b74d227c9d63945a97e8cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef46166660b74d227c9d63945a97e8cd");
            return;
        }
        this.d = new Handler(Looper.getMainLooper()) { // from class: com.meituan.android.yoda.widget.tool.f.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1d85eaf7fcba70a874c84617651955ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1d85eaf7fcba70a874c84617651955ee");
                } else if (message.what == 11 && !f.this.a()) {
                    try {
                        Activity activity = f.this.b.get();
                        if (activity == null || y.a(activity)) {
                            return;
                        }
                        f.this.c.show();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        this.c = alertDialog;
        this.c.setCanceledOnTouchOutside(false);
    }

    private f(AlertDialog alertDialog, Activity activity) {
        this(alertDialog);
        Object[] objArr = {alertDialog, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f973659d19cecd356b5deba74590f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f973659d19cecd356b5deba74590f1");
        } else {
            this.b = new WeakReference<>(activity);
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71d5420ad4e87b47552c5683ee33cdc5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71d5420ad4e87b47552c5683ee33cdc5")).booleanValue() : this.c.isShowing();
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95cf92b0323b51a58d17b2306ba68738", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95cf92b0323b51a58d17b2306ba68738")).booleanValue();
        }
        this.d.removeMessages(11);
        if (a()) {
            this.c.dismiss();
            return true;
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        protected Activity b;
        protected AlertDialog.a c;
        protected LinearLayout d;
        protected TextView e;

        public abstract a a();

        public a(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c5a423adca46aedf2cec8ed3b6cc2be", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c5a423adca46aedf2cec8ed3b6cc2be");
            } else {
                this.b = activity;
            }
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0114e2b503f4659def61ff573bcb20c", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0114e2b503f4659def61ff573bcb20c");
            }
            if (!TextUtils.isEmpty(str)) {
                if (this.e == null || this.e.getParent() == null) {
                    a();
                }
                if (this.e != null) {
                    this.e.setText(str);
                }
            }
            return this;
        }

        public final f b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d37dbd33775dfec2a419760d97436714", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d37dbd33775dfec2a419760d97436714") : new f(this.c.a(), this.b);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class b extends a {
        public static ChangeQuickRedirect f;
        private static final int g = (int) x.a(30.0f);
        private static final int h = (int) x.a(15.0f);
        private static final int i = g;
        private static final int j = h + ((int) x.a(10.0f));

        @Override // com.meituan.android.yoda.widget.tool.f.a
        public final a a() {
            return this;
        }

        private b(@NonNull Activity activity) {
            super(activity);
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5079560c2675e698d4808adcb8912f44", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5079560c2675e698d4808adcb8912f44");
                return;
            }
            this.d = new LinearLayout(this.b);
            this.d.setOrientation(1);
            this.d.setGravity(1);
            this.c = new AlertDialog.a(activity, 2131559329).a(true).a(this.d);
            this.d.addView((ViewGroup) LayoutInflater.from(activity).inflate(R.layout.yoda_layout_progress, (ViewGroup) null), new LinearLayout.LayoutParams(-2, -2));
        }
    }
}
