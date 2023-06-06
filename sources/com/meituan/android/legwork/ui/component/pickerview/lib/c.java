package com.meituan.android.legwork.ui.component.pickerview.lib;

import android.os.Handler;
import android.os.Message;
import com.meituan.android.legwork.ui.component.pickerview.lib.WheelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends Handler {
    public static ChangeQuickRedirect a;
    public final WheelView b;

    public c(WheelView wheelView) {
        Object[] objArr = {wheelView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12438c4fa53b2776af3882675039463f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12438c4fa53b2776af3882675039463f");
        } else {
            this.b = wheelView;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f66b9565f37005b1d32bc7c53ad4225", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f66b9565f37005b1d32bc7c53ad4225");
            return;
        }
        int i = message.what;
        if (i == 1000) {
            this.b.invalidate();
        } else if (i == 2000) {
            this.b.a(WheelView.a.FLING);
        } else if (i != 3000) {
        } else {
            WheelView wheelView = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = WheelView.a;
            if (PatchProxy.isSupport(objArr2, wheelView, changeQuickRedirect2, false, "47efa0803e751bc743f6561381fd26f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, wheelView, changeQuickRedirect2, false, "47efa0803e751bc743f6561381fd26f2");
            } else if (wheelView.d != null) {
                wheelView.postDelayed(new d(wheelView), 1L);
            }
        }
    }
}
