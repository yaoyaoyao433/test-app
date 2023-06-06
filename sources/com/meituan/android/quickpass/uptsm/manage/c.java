package com.meituan.android.quickpass.uptsm.manage;

import android.os.RemoteException;
import android.util.Log;
import com.meituan.android.quickpass.uptsm.common.utils.d;
import com.meituan.android.quickpass.uptsm.common.utils.g;
import com.meituan.android.quickpass.uptsm.common.utils.h;
import com.meituan.android.quickpass.uptsm.constant.a;
import com.meituan.android.quickpass.uptsm.web.IsSupportTSMJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ijk.media.player.IMediaPlayer;
import com.unionpay.tsmservice.UPTsmAddon;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements UPTsmAddon.UPTsmConnectionListener {
    public static ChangeQuickRedirect a;
    private UPTsmAddon b;

    public c(UPTsmAddon uPTsmAddon) {
        Object[] objArr = {uPTsmAddon};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d842f32d6064415266bc35ab3cd26be1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d842f32d6064415266bc35ab3cd26be1");
        } else {
            this.b = uPTsmAddon;
        }
    }

    @Override // com.unionpay.tsmservice.UPTsmAddon.UPTsmConnectionListener
    public final void onTsmConnected() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51cbe3917b086b8ef4160a566a6b1cea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51cbe3917b086b8ef4160a566a6b1cea");
            return;
        }
        h.b("TsmService connected.");
        com.meituan.android.quickpass.uptsm.common.utils.a.a("b_kepqzgpa", "c_5ifn958x", Boolean.TRUE);
        try {
            d.a(a.b.h, a.C0360a.a);
            int init = this.b.init(null, new TSMCallBack(1));
            h.a("initUpTsm result : " + init);
            if (init != 0) {
                h.a("initUpTsm failed result : " + init);
                d.a(a.b.g, a.C0360a.i + init);
                com.meituan.android.quickpass.uptsm.common.utils.a.a("b_kepqzgpa", "c_5ifn958x", "初始化同步返回失败", init);
                IsSupportTSMJsHandler isSupportTSMJsHandler = IsSupportTSMJsHandler.get();
                g.a(isSupportTSMJsHandler, init, null, "初始化失败(" + init + CommonConstant.Symbol.BRACKET_RIGHT);
            }
        } catch (RemoteException e) {
            h.b(Log.getStackTraceString(e));
            com.meituan.android.quickpass.uptsm.common.utils.b.a(e, "TSM_INIT");
        }
    }

    @Override // com.unionpay.tsmservice.UPTsmAddon.UPTsmConnectionListener
    public final void onTsmDisconnected() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0de3660f90198468057d95681f0ea6d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0de3660f90198468057d95681f0ea6d0");
            return;
        }
        h.b("TsmService disconnected.");
        com.meituan.android.quickpass.uptsm.common.utils.a.a("b_pssvn8yz", "c_ogr68a1g", Boolean.FALSE);
        g.a(IsSupportTSMJsHandler.get(), IMediaPlayer.MEDIA_ERROR_TIMED_OUT, null, "TSM服务连接中断(-110)");
    }
}
