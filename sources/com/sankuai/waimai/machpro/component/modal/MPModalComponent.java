package com.sankuai.waimai.machpro.component.modal;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.a;
import com.sankuai.waimai.machpro.component.view.b;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPModalComponent extends b implements a {
    public static ChangeQuickRedirect a;
    private Dialog b;

    public static /* synthetic */ void a(MPModalComponent mPModalComponent) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mPModalComponent, changeQuickRedirect, false, "deaf0d0bd076a2cc963dfe4a9030939b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mPModalComponent, changeQuickRedirect, false, "deaf0d0bd076a2cc963dfe4a9030939b");
            return;
        }
        mPModalComponent.b();
        mPModalComponent.b = new MPDialog(mPModalComponent.mMachContext.getContext(), R.style.MachProDialogTheme, mPModalComponent.mView);
        mPModalComponent.b.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.sankuai.waimai.machpro.component.modal.MPModalComponent.3
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                Object[] objArr2 = {dialogInterface, Integer.valueOf(i), keyEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68b21f51995d90944f1bcf00806cde21", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68b21f51995d90944f1bcf00806cde21")).booleanValue();
                }
                if (i == 4) {
                    com.sankuai.waimai.machpro.util.b.d(MPModalComponent.this.dispatchEvent("requestCloseDialog", null));
                    return true;
                }
                return false;
            }
        });
        mPModalComponent.b.show();
        if (mPModalComponent.mMachContext.getInstance().z != null) {
            mPModalComponent.mMachContext.getInstance().z.a(mPModalComponent.b);
        }
    }

    public MPModalComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "411fb831c15c1ca423b4fe31f9a97d65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "411fb831c15c1ca423b4fe31f9a97d65");
            return;
        }
        this.mYogaNode.a(YogaFlexDirection.COLUMN);
        this.mYogaNode.a(YogaAlign.CENTER);
        this.mYogaNode.a(YogaJustify.CENTER);
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAttachToParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "801cd05021b1ab7438f188fc990b4858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "801cd05021b1ab7438f188fc990b4858");
        } else {
            com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.modal.MPModalComponent.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ec874bebf738a5002e9b43332ec96a6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ec874bebf738a5002e9b43332ec96a6");
                        return;
                    }
                    try {
                        MPModalComponent.a(MPModalComponent.this);
                    } catch (Exception e) {
                        com.sankuai.waimai.machpro.util.a.a("Modal展示异常：" + e.getMessage());
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onDetachFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea02163847b054df8809b05adc07a665", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea02163847b054df8809b05adc07a665");
        } else {
            com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.machpro.component.modal.MPModalComponent.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed55ff977727e6fd912f74036c8e98b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed55ff977727e6fd912f74036c8e98b1");
                    } else {
                        MPModalComponent.this.b();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb959c4a556ed0ef0b325c85301d84be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb959c4a556ed0ef0b325c85301d84be");
            return;
        }
        try {
            if (this.b == null || !this.b.isShowing()) {
                return;
            }
            if (this.mMachContext.getInstance().z != null) {
                this.mMachContext.getInstance().z.b(this.b);
            }
            this.b.dismiss();
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a("Modal关闭异常：" + e.getMessage());
        }
    }

    @Override // com.sankuai.waimai.machpro.component.view.b, com.sankuai.waimai.machpro.component.MPComponent
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e334fe2d5580b7727857ceab1d0e4a8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e334fe2d5580b7727857ceab1d0e4a8e");
            return;
        }
        super.onDestroy();
        b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class MPDialog extends Dialog {
        public static ChangeQuickRedirect a;
        private View b;

        public MPDialog(@NonNull Context context, int i, View view) {
            super(context, R.style.MachProDialogTheme);
            Object[] objArr = {context, Integer.valueOf((int) R.style.MachProDialogTheme), view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11da6de889df94fbc1e866efee49ff86", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11da6de889df94fbc1e866efee49ff86");
            } else {
                this.b = view;
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a60710062f503e91e5e5dd53edd04450", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a60710062f503e91e5e5dd53edd04450");
                return;
            }
            super.onCreate(bundle);
            requestWindowFeature(1);
            setContentView(this.b);
            setCanceledOnTouchOutside(false);
            Window window = getWindow();
            View decorView = window.getDecorView();
            window.setBackgroundDrawable(new ColorDrawable(0));
            decorView.setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            if (Build.VERSION.SDK_INT >= 21) {
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                return;
            }
            window.setFlags(67108864, 67108864);
            window.setFlags(134217728, 134217728);
        }
    }
}
