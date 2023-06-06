package com.sankuai.waimai.popup.ugc;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.c;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class UGCFeedGuideFullScreenDialog extends Dialog {
    public static ChangeQuickRedirect b;
    private k a;
    protected final Activity c;
    protected a d;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
    }

    public abstract void a(float f, float f2, float f3, float f4, @ColorInt int i);

    public abstract void a(Activity activity, c cVar);

    public UGCFeedGuideFullScreenDialog(@NonNull Context context) {
        super(context, R.style.UGCFeedGuideDialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a3d03ab55cd0de5a6d60d05ff196308", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a3d03ab55cd0de5a6d60d05ff196308");
        } else {
            this.c = context instanceof Activity ? (Activity) context : null;
        }
    }

    public final void a(a aVar) {
        this.d = aVar;
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3b61162b39b81e32b5cfc5083df8c04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3b61162b39b81e32b5cfc5083df8c04");
            return;
        }
        super.show();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de33e9b9735f38c2672542ebd8fd9679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de33e9b9735f38c2672542ebd8fd9679");
        } else {
            this.a = com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(b.class).c(new rx.functions.b<b>() { // from class: com.sankuai.waimai.popup.ugc.UGCFeedGuideFullScreenDialog.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(b bVar) {
                    Object[] objArr3 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ca89b418d9a2f8fbd59034e3bb5b11a0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ca89b418d9a2f8fbd59034e3bb5b11a0");
                    } else if (UGCFeedGuideFullScreenDialog.this.isShowing()) {
                        UGCFeedGuideFullScreenDialog.this.dismiss();
                    }
                }
            });
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef54887225fbef6eae6f29ab5cf3f1ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef54887225fbef6eae6f29ab5cf3f1ed");
            return;
        }
        super.dismiss();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "204cf5edca5d3d41d290bd534456c55a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "204cf5edca5d3d41d290bd534456c55a");
        } else if (this.a != null) {
            this.a.unsubscribe();
            this.a = null;
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a01da9bcf4b106aa641e3bb151e9824", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a01da9bcf4b106aa641e3bb151e9824");
        } else {
            super.onDetachedFromWindow();
        }
    }
}
