package com.meituan.msi.view;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.meituan.msi.api.toast.ToastApiParam;
import com.meituan.msi.util.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.RequestCreator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ToastView extends LinearLayout {
    public static ChangeQuickRedirect a;
    public RequestCreator b;
    public TextView c;
    public TextView d;
    public Handler e;
    public final Runnable f;
    private ImageView g;
    private ProgressBar h;
    private boolean i;

    public ToastView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4f3fe00c2fb1249b9e710bcf09ffc65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4f3fe00c2fb1249b9e710bcf09ffc65");
            return;
        }
        this.i = false;
        this.f = new Runnable() { // from class: com.meituan.msi.view.ToastView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e93201deabfe8b802958414ad98b84ec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e93201deabfe8b802958414ad98b84ec");
                    return;
                }
                ToastView.this.setVisibility(8);
                ViewParent parent = ToastView.this.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(ToastView.this);
                }
            }
        };
        a(context);
    }

    public ToastView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf331c5d7e2e05a9f5982e19efefb835", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf331c5d7e2e05a9f5982e19efefb835");
            return;
        }
        this.i = false;
        this.f = new Runnable() { // from class: com.meituan.msi.view.ToastView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e93201deabfe8b802958414ad98b84ec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e93201deabfe8b802958414ad98b84ec");
                    return;
                }
                ToastView.this.setVisibility(8);
                ViewParent parent = ToastView.this.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(ToastView.this);
                }
            }
        };
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb18daed251d2507dce32f1d3c52a0f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb18daed251d2507dce32f1d3c52a0f6");
            return;
        }
        setOrientation(1);
        setGravity(17);
        setVisibility(8);
        inflate(context, R.layout.msi_toast_view, this);
        this.g = (ImageView) findViewById(R.id.toast_image);
        this.h = (ProgressBar) findViewById(R.id.toast_loading);
        this.c = (TextView) findViewById(R.id.toast_text);
        this.d = (TextView) findViewById(R.id.toast_long_text);
        this.e = new Handler();
    }

    public void setMask(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37a8f54d476a27512a1568cf382a681a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37a8f54d476a27512a1568cf382a681a");
            return;
        }
        if (z) {
            setOnTouchListener(new View.OnTouchListener() { // from class: com.meituan.msi.view.ToastView.2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
        } else {
            setOnTouchListener(null);
        }
        this.i = z;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f03cad3ec1242119f12485d6d3d9ace1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f03cad3ec1242119f12485d6d3d9ace1")).booleanValue() : this.i && getVisibility() == 0;
    }

    public void setImage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91587f274cc8c6214a2a816d14dde11b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91587f274cc8c6214a2a816d14dde11b");
        } else if ("none".equals(str)) {
            this.h.setVisibility(8);
            this.g.setVisibility(8);
        } else if (TextUtils.isEmpty(str) || "success".equals(str)) {
            this.h.setVisibility(8);
            this.g.setVisibility(0);
            this.g.setImageResource(R.drawable.msi_success);
        } else if ("loading".equals(str)) {
            this.h.setVisibility(0);
            this.g.setVisibility(8);
        } else {
            this.h.setVisibility(8);
            this.g.setVisibility(0);
            RequestCreator requestCreator = getRequestCreator();
            if (requestCreator != null) {
                requestCreator.a(this.g);
            }
        }
    }

    private RequestCreator getRequestCreator() {
        return this.b;
    }

    public void setRequestCreator(RequestCreator requestCreator) {
        this.b = requestCreator;
    }

    public final void a(ViewGroup viewGroup, boolean z, ToastApiParam toastApiParam) {
        Object[] objArr = {viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0), toastApiParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff3fd1854625bc9f7b52fa1124687c50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff3fd1854625bc9f7b52fa1124687c50");
            return;
        }
        c();
        String str = toastApiParam.title;
        String str2 = toastApiParam.icon;
        if (!"none".equals(str2) && !"loading".equals(str2)) {
            str2 = "success";
        }
        String str3 = toastApiParam.image;
        int i = toastApiParam.duration;
        boolean z2 = toastApiParam.mask;
        if ("none".equals(str2) && TextUtils.isEmpty(str3)) {
            this.c.setVisibility(8);
            this.d.setVisibility(0);
            this.d.setText(str);
        } else {
            this.c.setVisibility(0);
            this.d.setVisibility(8);
            this.c.setText(str);
        }
        setMask(z2);
        if (z) {
            setImage("loading");
        } else {
            if (!TextUtils.isEmpty(str3)) {
                setImage(str3);
            } else {
                setImage(str2);
            }
            this.e.removeCallbacksAndMessages(null);
            this.e.postDelayed(this.f, i);
        }
        setVisibility(0);
        if (getParent() == null) {
            viewGroup.addView(this, -1, -1);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5e0b1d56183aa44edcb93801fad3127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5e0b1d56183aa44edcb93801fad3127");
            return;
        }
        setVisibility(8);
        c();
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560e3a31047ae71d50986fc0943d4f5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560e3a31047ae71d50986fc0943d4f5d");
        } else if (this.e != null) {
            this.e.removeCallbacks(this.f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c785b65e287a5c0c2ad906c074e8188", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c785b65e287a5c0c2ad906c074e8188");
            return;
        }
        super.onAttachedToWindow();
        int a2 = ae.a();
        int b = ae.b();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.topMargin = a2 + b;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45c367229afa1e82832de7b75544101a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45c367229afa1e82832de7b75544101a");
            return;
        }
        c();
        super.onDetachedFromWindow();
    }
}
