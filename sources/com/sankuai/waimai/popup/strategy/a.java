package com.sankuai.waimai.popup.strategy;

import android.app.Dialog;
import android.os.CountDownTimer;
import android.view.View;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.mach.dialog.FullyDynamicDialogContentView;
import com.sankuai.waimai.platform.mach.dialog.PartiallyDynamicDialogContentView;
import com.sankuai.waimai.touchmatrix.data.TMatrixShowInfo;
import com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew;
import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    public DynamicDialogNew b;
    private TMatrixShowInfo c;

    public a(DynamicDialogNew dynamicDialogNew, TMatrixShowInfo tMatrixShowInfo) {
        Object[] objArr = {dynamicDialogNew, tMatrixShowInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9faa9157bcfb86140a09b6930eacd5b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9faa9157bcfb86140a09b6930eacd5b0");
            return;
        }
        this.b = dynamicDialogNew;
        this.c = tMatrixShowInfo;
    }

    @Override // com.sankuai.waimai.popup.strategy.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f5f5e379525e2789df59ff6e52c3144", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f5f5e379525e2789df59ff6e52c3144");
        } else if (g()) {
            this.b.show();
            if (this.c == null || this.c.touchMode != 8 || this.c.businessData == null || this.c.businessData.style == null || this.c.businessData.style.duration <= 0) {
                return;
            }
            new CountDownTimer(this.c.businessData.style.duration, 1000L) { // from class: com.sankuai.waimai.popup.strategy.a.1
                public static ChangeQuickRedirect a;
                private WeakReference<DynamicDialogNew> c;

                @Override // android.os.CountDownTimer
                public final void onTick(long j) {
                }

                {
                    this.c = new WeakReference<>(a.this.b);
                }

                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "821861c9bf38a93c60ada8dd958937eb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "821861c9bf38a93c60ada8dd958937eb");
                        return;
                    }
                    DynamicDialogNew dynamicDialogNew = this.c.get();
                    if (dynamicDialogNew == null || !dynamicDialogNew.isShowing()) {
                        return;
                    }
                    dynamicDialogNew.dismiss();
                    JudasManualManager.a("b_waimai_xvlr5qpi_mc").a("c_m84bv26").a("page_style_tag", 1).a(JsBridgeResult.ARG_KEY_LOCATION_MODE, 0).a();
                }
            }.start();
        }
    }

    @Override // com.sankuai.waimai.popup.strategy.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee8aaeab78f776b12734ec91dab71d33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee8aaeab78f776b12734ec91dab71d33");
        } else if (g()) {
            this.b.dismiss();
        }
    }

    @Override // com.sankuai.waimai.popup.strategy.b
    public final Dialog c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9b832ad6bdaa4c5dbf612855c832c9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9b832ad6bdaa4c5dbf612855c832c9e");
        }
        if (g()) {
            return this.b.getDialog();
        }
        return null;
    }

    @Override // com.sankuai.waimai.popup.strategy.b
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef0b6bfe150135a3cbe513cb58d7686d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef0b6bfe150135a3cbe513cb58d7686d")).booleanValue();
        }
        if (g()) {
            return this.b.isShowing();
        }
        return false;
    }

    @Override // com.sankuai.waimai.popup.strategy.b
    public final Map<String, View> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e6d14dc4bf329913054632cba24beea", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e6d14dc4bf329913054632cba24beea");
        }
        if (g()) {
            View contentView = this.b.getContentView();
            if (contentView instanceof FullyDynamicDialogContentView) {
                return ((FullyDynamicDialogContentView) contentView).getMachTagViews();
            }
            return null;
        }
        return null;
    }

    @Override // com.sankuai.waimai.popup.strategy.b
    public final View f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51e1b857c980cea1ac211d0a33ee967a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51e1b857c980cea1ac211d0a33ee967a");
        }
        if (g()) {
            View contentView = this.b.getContentView();
            if (contentView instanceof PartiallyDynamicDialogContentView) {
                return ((PartiallyDynamicDialogContentView) contentView).getContentView();
            }
            if (contentView instanceof FullyDynamicDialogContentView) {
                return ((FullyDynamicDialogContentView) contentView).getContentView();
            }
            return null;
        }
        return null;
    }

    private boolean g() {
        return this.b != null;
    }
}
