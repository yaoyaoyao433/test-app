package com.sankuai.titans.adapter.base;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.ui.widget.a;
import com.sankuai.titans.protocol.services.IThreadPoolService;
import com.sankuai.titans.protocol.services.IToastService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ToastService implements IToastService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final IThreadPoolService threadPoolService;

    public ToastService(IThreadPoolService iThreadPoolService) {
        Object[] objArr = {iThreadPoolService};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2abbc7d25a320d695aca6d1143b58b9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2abbc7d25a320d695aca6d1143b58b9e");
        } else {
            this.threadPoolService = iThreadPoolService;
        }
    }

    @Override // com.sankuai.titans.protocol.services.IToastService
    public void showShortToast(Activity activity, CharSequence charSequence) {
        Object[] objArr = {activity, charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26908d7bdb454a61c4303599b279ce88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26908d7bdb454a61c4303599b279ce88");
        } else {
            showToast(activity, charSequence, -1);
        }
    }

    @Override // com.sankuai.titans.protocol.services.IToastService
    public void showShortToast(View view, CharSequence charSequence) {
        Object[] objArr = {view, charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa1c8f2196a745268ccc94fc8698e1b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa1c8f2196a745268ccc94fc8698e1b8");
        } else {
            showToast(view, charSequence, -1);
        }
    }

    @Override // com.sankuai.titans.protocol.services.IToastService
    public void showLongToast(Activity activity, CharSequence charSequence) {
        Object[] objArr = {activity, charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03b0c4170d1bf615630e6c02c15f1d32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03b0c4170d1bf615630e6c02c15f1d32");
        } else {
            showToast(activity, charSequence, 0);
        }
    }

    @Override // com.sankuai.titans.protocol.services.IToastService
    public void showLongToast(View view, CharSequence charSequence) {
        Object[] objArr = {view, charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5274d339e77ad05ce6baa6e7f2b23b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5274d339e77ad05ce6baa6e7f2b23b5");
        } else {
            showToast(view, charSequence, 0);
        }
    }

    private void showToast(final Activity activity, final CharSequence charSequence, final int i) {
        Object[] objArr = {activity, charSequence, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b05b09348622e35498e69ab2d08dc514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b05b09348622e35498e69ab2d08dc514");
        } else {
            this.threadPoolService.executeOnUIThread(new Runnable() { // from class: com.sankuai.titans.adapter.base.ToastService.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "43fa31379369c5a4fc5c7e8ae553e791", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "43fa31379369c5a4fc5c7e8ae553e791");
                    } else if (activity == null || activity.isFinishing() || activity.isDestroyed() || TextUtils.isEmpty(charSequence)) {
                    } else {
                        new a(activity, charSequence, i).a();
                    }
                }
            });
        }
    }

    private void showToast(final View view, final CharSequence charSequence, final int i) {
        Object[] objArr = {view, charSequence, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbfc91eb71bde66558ffcee295fb33cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbfc91eb71bde66558ffcee295fb33cf");
        } else {
            this.threadPoolService.executeOnUIThread(new Runnable() { // from class: com.sankuai.titans.adapter.base.ToastService.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "411cd95f540fd24b8bbe079515efb8ca", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "411cd95f540fd24b8bbe079515efb8ca");
                    } else if (view == null || TextUtils.isEmpty(charSequence)) {
                    } else {
                        new a(view, charSequence, i).a();
                    }
                }
            });
        }
    }
}
