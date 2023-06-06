package com.sankuai.waimai.platform.machpro.textarea;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.Keep;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPInputComponent extends MPComponent<FrameLayout> {
    public static ChangeQuickRedirect a;
    protected a b;
    private final int c;
    private ViewTreeObserver.OnGlobalLayoutListener d;
    private ViewTreeObserver e;
    private View f;
    private int g;
    private int h;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ FrameLayout createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e30c0c4e1626fa11a0c7613838a9b88a", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e30c0c4e1626fa11a0c7613838a9b88a");
        }
        FrameLayout frameLayout = new FrameLayout(this.mMachContext.getContext());
        this.b = new a(this.mMachContext);
        frameLayout.addView(this.b.getView());
        this.b.i = this;
        return frameLayout;
    }

    public MPInputComponent(MPContext mPContext) {
        super(mPContext);
        boolean z = true;
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a54a26878c2b085351b729ce120e959", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a54a26878c2b085351b729ce120e959");
            return;
        }
        Activity activity = (Activity) this.mMachContext.getContext();
        this.f = activity.getWindow().getDecorView();
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "79daf2862e801486d12d61e9e8333842", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "79daf2862e801486d12d61e9e8333842")).booleanValue();
        } else {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics2);
            if (i - displayMetrics2.heightPixels < b.a((Context) activity)) {
                z = false;
            }
        }
        if (z && Build.VERSION.SDK_INT >= 23) {
            this.h = b.a(this.mMachContext.getContext());
        }
        this.c = this.f.getHeight();
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAppendChild(MPComponent mPComponent, MPComponent mPComponent2) {
        Object[] objArr = {mPComponent, mPComponent2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bd14ee8c6ffe585be16eecb1890a1fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bd14ee8c6ffe585be16eecb1890a1fd");
        } else {
            super.onAppendChild(mPComponent, mPComponent2);
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAttachToParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aca93fe2b91f3acc9d27b727349f9c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aca93fe2b91f3acc9d27b727349f9c4");
        } else {
            super.onAttachToParent();
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "893f7b6c9b5612c9c1edbff3d66be564", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "893f7b6c9b5612c9c1edbff3d66be564");
            return;
        }
        super.updateAttribute(str, obj);
        this.b.updateAttribute(str, obj);
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateViewStyle(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86133e6898067204508cdf886c4faab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86133e6898067204508cdf886c4faab3");
            return;
        }
        super.updateViewStyle(str, obj);
        this.b.updateViewStyle(str, obj);
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void addEventListener(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a47454f6b42708e9b0d54ed1f9cb713c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a47454f6b42708e9b0d54ed1f9cb713c");
            return;
        }
        char c = 65535;
        if (str.hashCode() == 584100582 && str.equals("keyboardHeightChanged")) {
            c = 0;
        }
        if (c == 0) {
            if (this.e == null) {
                this.e = this.f.getViewTreeObserver();
            }
            if (this.d == null) {
                this.d = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.platform.machpro.textarea.MPInputComponent.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8dcf1ec11f3340b554f022b92f98d43", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8dcf1ec11f3340b554f022b92f98d43");
                        } else if (MPInputComponent.this.mMachContext.getContext() instanceof Activity) {
                            Rect rect = new Rect();
                            MPInputComponent.this.f.getWindowVisibleDisplayFrame(rect);
                            int i = (MPInputComponent.this.c - rect.bottom) - MPInputComponent.this.h;
                            if (MPInputComponent.this.g != i) {
                                if (i > 0) {
                                    MachArray machArray = new MachArray();
                                    machArray.add(Float.valueOf(com.sankuai.waimai.machpro.util.b.a(i)));
                                    MPInputComponent.this.dispatchEvent("keyboardHeightChanged", machArray);
                                } else {
                                    if (MPInputComponent.this.b != null && MPInputComponent.this.b.getView() != null) {
                                        MPInputComponent.this.b.getView().clearFocus();
                                    }
                                    MachArray machArray2 = new MachArray();
                                    machArray2.add(0);
                                    MPInputComponent.this.dispatchEvent("keyboardHeightChanged", machArray2);
                                }
                            }
                            MPInputComponent.this.g = i;
                        }
                    }
                };
            }
            if (this.e != null) {
                this.e.addOnGlobalLayoutListener(this.d);
                return;
            }
            return;
        }
        this.b.addEventListener(str);
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab98b1d84b1231e9bbd1c0897435955b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab98b1d84b1231e9bbd1c0897435955b");
            return;
        }
        super.onDestroy();
        try {
            if (this.e == null || this.d == null) {
                return;
            }
            this.e.removeOnGlobalLayoutListener(this.d);
            this.e = null;
        } catch (Exception unused) {
            com.sankuai.waimai.machpro.util.a.a("input remove globalLayout error");
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onDetachFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0775b359dd321e822be07aca27a2063", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0775b359dd321e822be07aca27a2063");
            return;
        }
        super.onDetachFromParent();
        try {
            if (this.e == null || this.d == null) {
                return;
            }
            this.e.removeOnGlobalLayoutListener(this.d);
            this.e = null;
        } catch (Exception unused) {
            com.sankuai.waimai.machpro.util.a.a("input remove globalLayout error");
        }
    }

    @JSMethod(methodName = "focus")
    @Keep
    public void focus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0f9424570e16a95f3f89723658692e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0f9424570e16a95f3f89723658692e8");
        } else if (this.b == null || this.b.getView() == null) {
        } else {
            int length = this.b.getView().getText().length();
            if (length > 0) {
                this.b.getView().setSelection(length);
            }
            this.b.getView().post(new Runnable() { // from class: com.sankuai.waimai.platform.machpro.textarea.MPInputComponent.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "401dd3779e59190230e27a47f3e0e79f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "401dd3779e59190230e27a47f3e0e79f");
                        return;
                    }
                    Activity activity = (Activity) MPInputComponent.this.mMachContext.getContext();
                    MPEditText view = MPInputComponent.this.b.getView();
                    Object[] objArr3 = {activity, view};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "65f5235ca93d75536bfb9e7f4deeb538", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "65f5235ca93d75536bfb9e7f4deeb538");
                    } else if (activity != null) {
                        view.setFocusableInTouchMode(true);
                        view.requestFocus();
                        ((InputMethodManager) activity.getSystemService("input_method")).showSoftInput(view, 2);
                    }
                }
            });
        }
    }

    @JSMethod(methodName = "blur")
    @Keep
    public void blur() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfc9545fb86f58d884bb20266be04e0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfc9545fb86f58d884bb20266be04e0f");
        } else if (this.b == null || this.b.getView() == null) {
        } else {
            this.b.getView().clearFocus();
            if (this.mMachContext.getContext() instanceof Activity) {
                b.a((Activity) this.mMachContext.getContext());
            }
        }
    }

    @JSMethod(methodName = KNBConfig.CONFIG_CLEAR_CACHE)
    @Keep
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f50aeb364adb6670d876e2b05777be17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f50aeb364adb6670d876e2b05777be17");
        } else if (this.b == null || this.b.getView() == null) {
        } else {
            this.b.getView().setText("");
        }
    }

    @JSMethod(methodName = "isFocused")
    @Keep
    public boolean isFocused() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f0fe21895e7685ddd07d41ebf6df236", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f0fe21895e7685ddd07d41ebf6df236")).booleanValue();
        }
        if (this.b == null || this.b.getView() == null) {
            return false;
        }
        return this.b.getView().isFocused();
    }

    @JSMethod(methodName = "value")
    @Keep
    public String value() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0f2d50a105c6bf3c29826a3aabf9624", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0f2d50a105c6bf3c29826a3aabf9624") : (this.b == null || this.b.getView() == null) ? "" : this.b.getView().getText().toString();
    }

    @JSMethod(methodName = "setValue")
    @Keep
    public void setValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96644af6e4098a4ccfec6d47c9f88f00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96644af6e4098a4ccfec6d47c9f88f00");
        } else if (this.b == null || this.b.getView() == null) {
        } else {
            this.b.getView().setText(str);
            if (str != null) {
                this.b.getView().setSelection(str.length());
            }
        }
    }
}
