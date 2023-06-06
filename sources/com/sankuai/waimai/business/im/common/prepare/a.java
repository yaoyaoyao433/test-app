package com.sankuai.waimai.business.im.common.prepare;

import android.app.Activity;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.prepare.PrepareChatPageTransferDelegate;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.foundation.utils.ae;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    public WeakReference<Activity> b;
    public final boolean c;

    public abstract void a(String str);

    public abstract void b();

    public a(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfcd2a7fd28b4e219b3ec9a050ae8117", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfcd2a7fd28b4e219b3ec9a050ae8117");
            return;
        }
        this.b = new WeakReference<>(activity);
        this.c = z;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7fc88034acd05a150c6b3fb4ec1ee01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7fc88034acd05a150c6b3fb4ec1ee01");
        } else if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
            b();
        } else {
            final Activity activity = this.b != null ? this.b.get() : null;
            if (activity == null) {
                a("Activity is null");
            } else {
                com.sankuai.waimai.platform.domain.manager.user.a.a(activity, new Runnable() { // from class: com.sankuai.waimai.business.im.common.prepare.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61d3ba30f36bb05784f6e113a61d7474", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61d3ba30f36bb05784f6e113a61d7474");
                        } else {
                            a.this.b();
                        }
                    }
                }, new Runnable() { // from class: com.sankuai.waimai.business.im.common.prepare.a.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7241d3661787ae42b6544ed06a588d0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7241d3661787ae42b6544ed06a588d0");
                            return;
                        }
                        ae.a(activity, (int) R.string.wm_im_not_login_tip);
                        if ((activity instanceof TransferActivity) && (((TransferActivity) activity).c instanceof PrepareChatPageTransferDelegate)) {
                            activity.finish();
                        }
                    }
                });
            }
        }
    }
}
