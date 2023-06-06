package com.meituan.android.yoda.widget.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.constraint.R;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected WeakReference<ViewGroup> b;
    protected d c;
    protected JSONObject d;
    protected TextView e;
    protected boolean f;

    public abstract float a();

    public abstract void a(float f, float f2, long j, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener);

    public abstract void a(float f, ValueAnimator.AnimatorUpdateListener animatorUpdateListener);

    public abstract void a(int i);

    public abstract void a(Canvas canvas);

    public abstract void a(SurfaceHolder surfaceHolder);

    public abstract void a(View.OnClickListener onClickListener);

    public abstract float b();

    public abstract float c();

    public abstract float d();

    public abstract int e();

    public abstract float f();

    public abstract void g();

    public abstract void h();

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.yoda.widget.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0383a {
        URL,
        CONTACT;
        
        public static ChangeQuickRedirect a;

        EnumC0383a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a77f3e0dc1dce61a8886c5897d7511da", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a77f3e0dc1dce61a8886c5897d7511da");
            }
        }

        public static EnumC0383a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ca72abd589942f1b40a3b15aab01777", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0383a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ca72abd589942f1b40a3b15aab01777") : (EnumC0383a) Enum.valueOf(EnumC0383a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0383a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93c9698c520fe60b9211996ae405ae82", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0383a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93c9698c520fe60b9211996ae405ae82") : (EnumC0383a[]) values().clone();
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb3e36b98c30665abf0140b3fdea9736", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb3e36b98c30665abf0140b3fdea9736");
        } else {
            this.f = false;
        }
    }

    public final EnumC0383a i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b410dc8d302fffd8bb22068cce3ad1cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (EnumC0383a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b410dc8d302fffd8bb22068cce3ad1cd");
        }
        EnumC0383a enumC0383a = EnumC0383a.URL;
        return (this.d == null || !this.d.has("faceFaqContact") || this.d.has("faceFaqActionTitle") || this.d.has("faceFaqActionRef")) ? enumC0383a : EnumC0383a.CONTACT;
    }

    public final void b(View.OnClickListener onClickListener) {
        String str;
        int i;
        String str2;
        String str3;
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddd4af4c6c50a6329b5b912fe4cb9e92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddd4af4c6c50a6329b5b912fe4cb9e92");
            return;
        }
        String str4 = "";
        if (this.c != null && this.c.getResources() != null) {
            str4 = this.c.getResources().getString(R.string.yoda_face_verify_faq_default_text);
        }
        try {
        } catch (Exception unused) {
            if (this.e == null) {
                return;
            }
            this.e.setText(str4);
            this.e.setTextSize(14.0f);
            this.e.setTextColor(Color.parseColor("#FE8C00"));
        }
        if (this.c != null && this.c.getContext() != null) {
            this.e = new TextView(this.c.getContext());
            if (this.d != null && this.d.has("faceFaqShowFaqEntry")) {
                this.f = this.d.getBoolean("faceFaqShowFaqEntry");
                if (this.f) {
                    this.e.setVisibility(0);
                } else {
                    this.e.setVisibility(8);
                }
            } else {
                this.f = true;
            }
            if (this.f) {
                if (i() == EnumC0383a.URL) {
                    if (this.d != null && this.d.has("faceFaqActionTitle")) {
                        try {
                            str3 = this.d.getString("faceFaqActionTitle");
                        } catch (JSONException unused2) {
                            str3 = str4;
                        }
                        this.e.setText(str3);
                    } else {
                        this.e.setText(str4);
                    }
                } else if (this.d != null && this.d.has("faceFaqContact")) {
                    try {
                        str = this.d.getString("faceFaqContact");
                    } catch (JSONException unused3) {
                        str = str4;
                    }
                    this.e.setText(str);
                } else {
                    this.e.setText(str4);
                }
                if (this.d != null && this.d.has("faceFaqActionTitleColor")) {
                    try {
                        str2 = this.d.getString("faceFaqActionTitleColor");
                    } catch (JSONException unused4) {
                        str2 = "#FFC700";
                    }
                    if (!str2.startsWith("#")) {
                        str2 = "#" + str2;
                    }
                    this.e.setTextColor(Color.parseColor(str2));
                } else if (com.meituan.android.yoda.config.ui.d.a().r()) {
                    int b = x.b(com.meituan.android.yoda.config.ui.d.a().p(), 1);
                    if (b != -1) {
                        this.e.setTextColor(b);
                    }
                } else {
                    this.e.setTextColor(Color.parseColor("#FFC700"));
                }
                if (this.d != null && this.d.has("faceFaqActionTitleFontSize")) {
                    try {
                        i = this.d.getInt("faceFaqActionTitleFontSize");
                    } catch (Exception unused5) {
                        i = 14;
                    }
                    this.e.setTextSize(i);
                } else {
                    this.e.setTextSize(14.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 80);
            layoutParams.bottomMargin = x.b(64.0f);
            layoutParams.gravity = 81;
            this.e.setLayoutParams(layoutParams);
            if (i() == EnumC0383a.URL) {
                this.e.setOnClickListener(onClickListener);
            }
            ViewGroup viewGroup = this.b.get();
            if (viewGroup != null) {
                viewGroup.addView(this.e);
            }
        }
    }
}
