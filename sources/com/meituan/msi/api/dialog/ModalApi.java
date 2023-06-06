package com.meituan.msi.api.dialog;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.view.View;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.lifecycle.a;
import com.meituan.msi.lifecycle.b;
import com.meituan.msi.view.ModalDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ModalApi implements IMsiApi, a, b {
    public static ChangeQuickRedirect a;
    private int b;
    private ModalDialog c;
    private Activity d;

    @Override // com.meituan.msi.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faf454c98cccdafe87ca63a8f519716a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faf454c98cccdafe87ca63a8f519716a");
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65b0820a2b65c778674b74363b65ca7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65b0820a2b65c778674b74363b65ca7c");
        }
    }

    @Override // com.meituan.msi.lifecycle.b
    public final void b(int i) {
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5155ba29a19aeacd6aa8ff5024455f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5155ba29a19aeacd6aa8ff5024455f4");
        }
    }

    public ModalApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "386420db33f8f122f79cd28548f766f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "386420db33f8f122f79cd28548f766f2");
        } else {
            this.b = -1;
        }
    }

    @MsiApiMethod(name = "showModal", onUiThread = true, request = ModalParam.class, response = ModalResponse.class)
    public void showModal(final ModalParam modalParam, final MsiContext msiContext) {
        Object[] objArr = {modalParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d774158c1408ef483fbe5f4f0d376ec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d774158c1408ef483fbe5f4f0d376ec9");
        } else if (d.a.ON_PAUSE.equals(msiContext.getLifecycleState()) || msiContext.getActivity() == null) {
            msiContext.onError("fail to show dialog in background");
        } else {
            String str = modalParam.title;
            String str2 = modalParam.content;
            boolean z = modalParam.showCancel;
            String str3 = modalParam.cancelText;
            String str4 = modalParam.cancelColor;
            String str5 = modalParam.confirmText;
            String str6 = modalParam.confirmColor;
            Activity activity = msiContext.getActivity();
            if (this.c == null || this.d != activity) {
                this.c = new ModalDialog(activity, modalParam);
                this.d = activity;
                this.c.setCancelable(false);
                this.c.setCanceledOnTouchOutside(false);
            }
            this.c.setTitle(str);
            ModalDialog modalDialog = this.c;
            Object[] objArr2 = {str2};
            ChangeQuickRedirect changeQuickRedirect2 = ModalDialog.a;
            if (PatchProxy.isSupport(objArr2, modalDialog, changeQuickRedirect2, false, "2691761052ff13ac7d3a54d3f30d0b18", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, modalDialog, changeQuickRedirect2, false, "2691761052ff13ac7d3a54d3f30d0b18");
            } else {
                modalDialog.b = str2;
                if (modalDialog.d != null) {
                    modalDialog.d.setText(str2);
                } else if (modalDialog.e != null) {
                    modalDialog.e.setText(str2);
                }
            }
            if (z) {
                ModalDialog modalDialog2 = this.c;
                Object[] objArr3 = {str4};
                ChangeQuickRedirect changeQuickRedirect3 = ModalDialog.a;
                if (PatchProxy.isSupport(objArr3, modalDialog2, changeQuickRedirect3, false, "00263f4bcaab4176217dd082a5dd25e5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, modalDialog2, changeQuickRedirect3, false, "00263f4bcaab4176217dd082a5dd25e5");
                } else {
                    try {
                        modalDialog2.f.setTextColor(com.meituan.msi.util.d.a(str4));
                    } catch (Exception unused) {
                    }
                }
                ModalDialog modalDialog3 = this.c;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.meituan.msi.api.dialog.ModalApi.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "257e57ece86766a193c4e3d46a86a379", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "257e57ece86766a193c4e3d46a86a379");
                            return;
                        }
                        ModalResponse modalResponse = new ModalResponse();
                        if (modalParam.editable && ModalApi.this.c.e != null && ModalApi.this.c.e.getText() != null) {
                            modalResponse.content = ModalApi.this.c.e.getText().toString();
                        }
                        modalResponse.cancel = true;
                        msiContext.onSuccess(modalResponse);
                    }
                };
                Object[] objArr4 = {str3, onClickListener};
                ChangeQuickRedirect changeQuickRedirect4 = ModalDialog.a;
                if (PatchProxy.isSupport(objArr4, modalDialog3, changeQuickRedirect4, false, "9b7e89414e4c3c4a2c9fcd4be61e3a60", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, modalDialog3, changeQuickRedirect4, false, "9b7e89414e4c3c4a2c9fcd4be61e3a60");
                } else {
                    modalDialog3.c.setVisibility(0);
                    modalDialog3.f.setText(str3);
                    modalDialog3.f.setVisibility(0);
                    modalDialog3.h = onClickListener;
                }
            }
            ModalDialog modalDialog4 = this.c;
            Object[] objArr5 = {str6};
            ChangeQuickRedirect changeQuickRedirect5 = ModalDialog.a;
            if (PatchProxy.isSupport(objArr5, modalDialog4, changeQuickRedirect5, false, "27a4121483574816ca78609db134a710", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, modalDialog4, changeQuickRedirect5, false, "27a4121483574816ca78609db134a710");
            } else {
                try {
                    modalDialog4.g.setTextColor(com.meituan.msi.util.d.a(str6));
                } catch (Exception unused2) {
                }
            }
            ModalDialog modalDialog5 = this.c;
            View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.meituan.msi.api.dialog.ModalApi.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "83a2e00c2d8597824b21c84e24acaab5", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "83a2e00c2d8597824b21c84e24acaab5");
                        return;
                    }
                    ModalResponse modalResponse = new ModalResponse();
                    if (modalParam.editable && ModalApi.this.c.e != null && ModalApi.this.c.e.getText() != null) {
                        modalResponse.content = ModalApi.this.c.e.getText().toString();
                    }
                    modalResponse.confirm = true;
                    msiContext.onSuccess(modalResponse);
                    msiContext.onSuccess(modalResponse);
                }
            };
            Object[] objArr6 = {str5, onClickListener2};
            ChangeQuickRedirect changeQuickRedirect6 = ModalDialog.a;
            if (PatchProxy.isSupport(objArr6, modalDialog5, changeQuickRedirect6, false, "4ac1bba93129ca439553fb54b1ac4389", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, modalDialog5, changeQuickRedirect6, false, "4ac1bba93129ca439553fb54b1ac4389");
            } else {
                modalDialog5.c.setVisibility(0);
                modalDialog5.g.setText(str5);
                modalDialog5.g.setVisibility(0);
                modalDialog5.i = onClickListener2;
            }
            this.c.show();
        }
    }

    @Override // com.meituan.msi.lifecycle.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9982ceb5703f78beb2b5cb364858465f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9982ceb5703f78beb2b5cb364858465f");
            return;
        }
        if (this.b != i && this.b != -1 && this.c != null) {
            this.c.dismiss();
            this.c = null;
        }
        this.b = i;
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16287239492997f769365b401494e617", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16287239492997f769365b401494e617");
        } else if (this.c == null || this.d.isDestroyed()) {
        } else {
            this.c.dismiss();
            this.c = null;
        }
    }
}
