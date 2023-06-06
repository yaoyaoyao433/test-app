package com.sankuai.waimai.touchmatrix.rebuild;

import android.app.Activity;
import android.app.Dialog;
import android.support.annotation.Keep;
import android.support.annotation.MainThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.a;
import com.sankuai.waimai.touchmatrix.data.a;
import com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew;
import com.sankuai.waimai.touchmatrix.rebuild.utils.c;
import com.sankuai.waimai.touchmatrix.show.d;
import com.sankuai.waimai.touchmatrix.views.ITMatrixView;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class TMatrixPushViewNew implements ITMatrixView {
    public static ChangeQuickRedirect changeQuickRedirect;
    private WeakReference<Activity> mActivityRef;
    private DynamicDialogNew.f mCondition;
    private DynamicDialogNew mDynamicDialog;
    private a mMatrixMessage;

    public TMatrixPushViewNew(Activity activity, a aVar) {
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "381a11764a848fbdee43121263337830", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "381a11764a848fbdee43121263337830");
            return;
        }
        this.mActivityRef = new WeakReference<>(activity);
        this.mMatrixMessage = aVar;
    }

    public void setCondition(DynamicDialogNew.f fVar) {
        this.mCondition = fVar;
    }

    @Override // com.sankuai.waimai.touchmatrix.views.ITMatrixView
    @MainThread
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa8c48019afa07857b59814de51a717b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa8c48019afa07857b59814de51a717b");
            return;
        }
        Activity activity = this.mActivityRef != null ? this.mActivityRef.get() : null;
        if (activity != null) {
            DynamicDialogNew.a aVar = new DynamicDialogNew.a(activity);
            aVar.c = this.mMatrixMessage;
            DynamicDialogNew.a a = aVar.a(this.mCondition);
            a.f = new DynamicDialogNew.d() { // from class: com.sankuai.waimai.touchmatrix.rebuild.TMatrixPushViewNew.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "58936464c31b9bbcbf51b6e66c909edc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "58936464c31b9bbcbf51b6e66c909edc");
                        return;
                    }
                    a.C1348a b = com.sankuai.waimai.touchmatrix.a.a().b(TMatrixPushViewNew.this.mMatrixMessage.k.bizId);
                    if (b == null || b.o == null) {
                        return;
                    }
                    com.sankuai.waimai.touchmatrix.data.a unused = TMatrixPushViewNew.this.mMatrixMessage;
                }
            };
            a.d = new d() { // from class: com.sankuai.waimai.touchmatrix.rebuild.TMatrixPushViewNew.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.touchmatrix.show.d
                public final void a(Dialog dialog, com.sankuai.waimai.touchmatrix.data.a aVar2) {
                    Object[] objArr2 = {dialog, aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ab6b04d6028a509e52ea20951e982d5d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ab6b04d6028a509e52ea20951e982d5d");
                        return;
                    }
                    a.C1348a b = com.sankuai.waimai.touchmatrix.a.a().b(aVar2.k.bizId);
                    if (b == null || b.n == null) {
                        return;
                    }
                    b.n.a(dialog, aVar2);
                }
            };
            this.mDynamicDialog = a.a();
            this.mDynamicDialog.show();
            return;
        }
        c.a("TMatrixPushViewNew  Activity 已经 GC", new Object[0]);
    }

    @Override // com.sankuai.waimai.touchmatrix.views.ITMatrixView
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0f7005f88f50a5f044c08451344e5d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0f7005f88f50a5f044c08451344e5d4");
        } else if (this.mDynamicDialog == null || !this.mDynamicDialog.isShowing()) {
        } else {
            this.mDynamicDialog.dismiss();
        }
    }

    @Override // com.sankuai.waimai.touchmatrix.views.ITMatrixView
    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6532c853f7991305b48040f5402a9c93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6532c853f7991305b48040f5402a9c93");
        } else if (this.mDynamicDialog == null || !this.mDynamicDialog.isShowing()) {
        } else {
            this.mDynamicDialog.getDialog().cancel();
        }
    }

    @Override // com.sankuai.waimai.touchmatrix.views.ITMatrixView
    public Dialog getDialog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02eae841c0c3936cbe5c1210c7885b4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02eae841c0c3936cbe5c1210c7885b4e");
        }
        if (this.mDynamicDialog != null) {
            return this.mDynamicDialog.getDialog();
        }
        return null;
    }

    @Override // com.sankuai.waimai.touchmatrix.views.ITMatrixView
    public boolean isShowing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79061aa1f2c92dc82a0362ce9ef4a7f9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79061aa1f2c92dc82a0362ce9ef4a7f9")).booleanValue() : this.mDynamicDialog != null && this.mDynamicDialog.isShowing();
    }
}
