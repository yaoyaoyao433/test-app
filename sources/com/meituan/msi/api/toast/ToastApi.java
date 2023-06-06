package com.meituan.msi.api.toast;

import android.arch.lifecycle.d;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.lifecycle.a;
import com.meituan.msi.page.IPage;
import com.meituan.msi.util.m;
import com.meituan.msi.view.ToastView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.TitansBundle;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ToastApi implements IMsiApi, a {
    public static ChangeQuickRedirect a;
    public ToastApiParam b;
    public MsiContext c;
    public LoadingApiParam d;

    @Override // com.meituan.msi.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a86580d8117c56535167b029809fcd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a86580d8117c56535167b029809fcd5");
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a469a4501c3fe9d56dd0c1172b14b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a469a4501c3fe9d56dd0c1172b14b4");
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc1b5c6bbed098ae1577f3ea586e5491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc1b5c6bbed098ae1577f3ea586e5491");
        }
    }

    @MsiApiMethod(name = "showToast", onSerializedThread = true, request = ToastApiParam.class)
    public void showToast(ToastApiParam toastApiParam, MsiContext msiContext) {
        Object[] objArr = {toastApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a1e454074c574126e206e851e5de2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a1e454074c574126e206e851e5de2d");
        } else if (msiContext.getLifecycleState() != null && msiContext.getLifecycleState().equals(d.a.ON_PAUSE)) {
            this.b = toastApiParam;
            this.c = msiContext;
            this.d = null;
        } else {
            a(toastApiParam, msiContext, Boolean.FALSE, com.meituan.msi.util.a.a());
        }
    }

    @MsiApiMethod(name = TitansBundle.PARAM_SHOW_LOADING, onSerializedThread = true, request = LoadingApiParam.class)
    public void showLoading(LoadingApiParam loadingApiParam, MsiContext msiContext) {
        Object[] objArr = {loadingApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "877438d8aea43cc6453a27836230e811", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "877438d8aea43cc6453a27836230e811");
        } else if (msiContext.getLifecycleState() != null && msiContext.getLifecycleState().equals(d.a.ON_PAUSE)) {
            this.d = loadingApiParam;
            this.c = msiContext;
            this.b = null;
        } else {
            boolean a2 = com.meituan.msi.util.a.a();
            ToastApiParam toastApiParam = new ToastApiParam();
            toastApiParam.title = loadingApiParam.title;
            toastApiParam.mask = loadingApiParam.mask;
            toastApiParam.relativeToScreen = loadingApiParam.relativeToScreen;
            a(toastApiParam, msiContext, Boolean.TRUE, a2);
        }
    }

    private void a(final ToastApiParam toastApiParam, final MsiContext msiContext, final Boolean bool, final boolean z) {
        Object[] objArr = {toastApiParam, msiContext, bool, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73cc38ca6fd24f812f2ad35abdae6c8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73cc38ca6fd24f812f2ad35abdae6c8a");
            return;
        }
        final IPage b = b(msiContext);
        if (b == null) {
            msiContext.onError(500, "page is null");
        } else {
            m.a(new Runnable() { // from class: com.meituan.msi.api.toast.ToastApi.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "728f4210dff2521d87b407102e8c13a8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "728f4210dff2521d87b407102e8c13a8");
                        return;
                    }
                    ToastView toastView = (ToastView) b.findView(1, null);
                    if (toastView == null) {
                        if (msiContext.getActivity() == null) {
                            msiContext.onError("activity is null");
                            return;
                        }
                        toastView = new ToastView(msiContext.getActivity());
                    }
                    Boolean bool2 = bool;
                    ToastApiParam toastApiParam2 = toastApiParam;
                    MsiContext msiContext2 = msiContext;
                    boolean z2 = z;
                    Object[] objArr3 = {bool2, toastApiParam2, msiContext2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = ToastView.a;
                    if (PatchProxy.isSupport(objArr3, toastView, changeQuickRedirect3, false, "f9e0f1f1eb596cd352d6030e3eae1346", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, toastView, changeQuickRedirect3, false, "f9e0f1f1eb596cd352d6030e3eae1346");
                    } else {
                        toastView.b = com.meituan.msi.util.file.d.a(msiContext2.getActivity(), toastApiParam2.image, msiContext2);
                        toastView.c();
                        String str = toastApiParam2.title;
                        String str2 = toastApiParam2.icon;
                        if (!"none".equals(str2) && !"loading".equals(str2)) {
                            str2 = "success";
                        }
                        String str3 = toastApiParam2.image;
                        int i = toastApiParam2.duration;
                        boolean z3 = toastApiParam2.mask;
                        if ("none".equals(str2) && TextUtils.isEmpty(str3)) {
                            toastView.c.setVisibility(8);
                            toastView.d.setVisibility(0);
                            toastView.d.setText(str);
                            com.meituan.msi.util.a.a(toastView.d, z2);
                        } else {
                            toastView.c.setVisibility(0);
                            toastView.d.setVisibility(8);
                            toastView.c.setText(str);
                            com.meituan.msi.util.a.a(toastView.c, z2);
                        }
                        toastView.setMask(z3);
                        if (bool2.booleanValue()) {
                            toastView.setImage("loading");
                        } else {
                            if (!TextUtils.isEmpty(str3)) {
                                toastView.setImage(str3);
                            } else {
                                toastView.setImage(str2);
                            }
                            toastView.e.removeCallbacksAndMessages(null);
                            toastView.e.postDelayed(toastView.f, i);
                        }
                    }
                    IPage.a aVar = new IPage.a();
                    aVar.a = toastApiParam.relativeToScreen;
                    b.showView(1, toastView, aVar);
                    msiContext.onSuccess("");
                }
            });
        }
    }

    @MsiApiMethod(name = "hideToast", onSerializedThread = true)
    public void hideToast(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07761e2e5019e0cf3b45e58a48efec3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07761e2e5019e0cf3b45e58a48efec3b");
        } else {
            a(msiContext);
        }
    }

    @MsiApiMethod(name = "hideLoading", onSerializedThread = true)
    public void hideLoading(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc96ad317e3c5f42714e511f8031b88f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc96ad317e3c5f42714e511f8031b88f");
        } else {
            a(msiContext);
        }
    }

    private void a(final MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b3f12d834912c5919ef02d359b18b91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b3f12d834912c5919ef02d359b18b91");
            return;
        }
        final IPage b = b(msiContext);
        if (b == null) {
            msiContext.onError(500, "page is null");
        } else {
            m.a(new Runnable() { // from class: com.meituan.msi.api.toast.ToastApi.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52f8cb98a47f2cf558954941db8e4c11", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52f8cb98a47f2cf558954941db8e4c11");
                        return;
                    }
                    ToastView toastView = (ToastView) b.findView(1, null);
                    if (toastView != null) {
                        b.hideView(1, toastView, null);
                    }
                    msiContext.onSuccess("");
                }
            });
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9ec5bedd53788029f1c49a27b156fe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9ec5bedd53788029f1c49a27b156fe4");
        } else if (this.c == null) {
        } else {
            if (this.b != null) {
                showToast(this.b, this.c);
            } else if (this.d != null) {
                showLoading(this.d, this.c);
            }
            this.c = null;
            this.d = null;
            this.b = null;
        }
    }

    private IPage b(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4cd9bce6f0ab7821c062ad8b6016561", RobustBitConfig.DEFAULT_VALUE)) {
            return (IPage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4cd9bce6f0ab7821c062ad8b6016561");
        }
        JsonObject uIArgs = msiContext.getUIArgs();
        int asInt = (uIArgs == null || !uIArgs.has("pageId")) ? -1 : uIArgs.get("pageId").getAsInt();
        if (asInt != -1) {
            return msiContext.getPageById(asInt);
        }
        return msiContext.getTopPage();
    }
}
