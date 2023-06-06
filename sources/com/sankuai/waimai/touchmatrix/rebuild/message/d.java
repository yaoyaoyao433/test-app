package com.sankuai.waimai.touchmatrix.rebuild.message;

import com.dianping.sharkpush.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import com.sankuai.waimai.touchmatrix.monitor.j;
import com.tencent.ugc.TXVideoEditConstants;
import io.agora.rtc.internal.RtcEngineEvent;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    e b;
    final String c;
    private int d;
    private d.a e;

    public d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "090997ef722a915398b31b49b460b33c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "090997ef722a915398b31b49b460b33c");
            return;
        }
        this.d = -1;
        this.c = str2;
        this.b = new e(str);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.e = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09424d2e8f62fc23bfd6f49283a7d603", RobustBitConfig.DEFAULT_VALUE) ? (d.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09424d2e8f62fc23bfd6f49283a7d603") : new d.a() { // from class: com.sankuai.waimai.touchmatrix.rebuild.message.d.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Removed duplicated region for block: B:100:0x03b2  */
            /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
            @Override // com.dianping.sharkpush.d.a, dianping.com.nvlinker.stub.ISharkPushReceiver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onReceive(java.lang.String r23, byte[] r24) {
                /*
                    Method dump skipped, instructions count: 973
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.touchmatrix.rebuild.message.d.AnonymousClass1.onReceive(java.lang.String, byte[]):void");
            }

            @Override // dianping.com.nvlinker.stub.ISharkPushReceiver
            public final void onError(String str3, int i, String str4) {
                Object[] objArr3 = {str3, Integer.valueOf(i), str4};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "74c75c68e6954b7b9f628a23faef29ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "74c75c68e6954b7b9f628a23faef29ff");
                    return;
                }
                com.sankuai.waimai.touchmatrix.rebuild.utils.c.e("shark push command:" + str3 + " throws error code:" + i + "  errorMsg:" + str4, new Object[0]);
                j a2 = j.a();
                Object[] objArr4 = {str3, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = j.a;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "f18c41de7d12574e115eea3392deefc2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "f18c41de7d12574e115eea3392deefc2");
                } else if (a2.b != null) {
                    switch (i) {
                        case -1004:
                            a2.b.a(11004, "tmatrix/message/remote", 0);
                            a2.b.a(RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS, "tmatrix/status/dialog", 0);
                            a2.b.a("touch_matrix_message", str3, "11004", null);
                            a2.b(RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS);
                            return;
                        case TXVideoEditConstants.ERR_UNFOUND_FILEINFO /* -1003 */:
                            a2.b.a(11003, "tmatrix/message/remote", 0);
                            a2.b.a(RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS, "tmatrix/status/dialog", 0);
                            a2.b.a("touch_matrix_message", str3, "11003", null);
                            a2.b(RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS);
                            return;
                        case -1002:
                            a2.b.a(XPlayerConstants.FFP_MSG_RECEIVE_SEI_FRAME, "tmatrix/message/remote", 0);
                            a2.b.a(RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS, "tmatrix/status/dialog", 0);
                            a2.b.a("touch_matrix_message", str3, "11002", null);
                            a2.b(RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS);
                            return;
                        case -1001:
                            a2.b.a(11001, "tmatrix/message/remote", 0);
                            a2.b.a(RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS, "tmatrix/status/dialog", 0);
                            a2.b.a("touch_matrix_message", str3, "11001", null);
                            a2.b(RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS);
                            return;
                        default:
                            return;
                    }
                }
            }
        };
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efd5bc1e2a481317f8c804f7b5e7485a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efd5bc1e2a481317f8c804f7b5e7485a");
            return;
        }
        try {
            if (this.d != -1) {
                b();
            }
            int a2 = com.dianping.sharkpush.b.a(this.c, false, true, this.e);
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.a("注册SharkPush, requestId:" + a2 + " CMD: " + this.c, new Object[0]);
            if (a2 != -1) {
                this.d = a2;
            }
        } catch (Exception e) {
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.a(" TMatrixMessageManagerNew registerPush, exception:" + e.getMessage(), new Object[0]);
        }
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c29acccbd484caf32b6d01863716022", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c29acccbd484caf32b6d01863716022");
            return;
        }
        com.sankuai.waimai.touchmatrix.rebuild.utils.c.a("stopSharkPushListen, requestId:%d", Integer.valueOf(this.d));
        com.dianping.sharkpush.b.a(this.d);
        this.d = -1;
    }
}
