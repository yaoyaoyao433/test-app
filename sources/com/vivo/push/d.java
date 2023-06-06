package com.vivo.push;

import android.content.Intent;
import com.meituan.android.pike.bean.proto.ProtoConstant;
import com.vivo.push.b.r;
import com.vivo.push.b.t;
import com.vivo.push.b.u;
import com.vivo.push.d.ag;
import com.vivo.push.d.z;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d implements IPushClientFactory {
    private ag a = new ag();

    @Override // com.vivo.push.IPushClientFactory
    public final o createReceiverCommand(Intent intent) {
        o uVar;
        o tVar;
        int a = com.sankuai.waimai.platform.utils.f.a(intent, ProtoConstant.COMMAND, -1);
        if (a < 0) {
            a = com.sankuai.waimai.platform.utils.f.a(intent, "method", -1);
        }
        if (a == 20) {
            uVar = new u();
        } else if (a != 2016) {
            switch (a) {
                case 1:
                case 2:
                    tVar = new t(a);
                    uVar = tVar;
                    break;
                case 3:
                    uVar = new com.vivo.push.b.o();
                    break;
                case 4:
                    uVar = new com.vivo.push.b.q();
                    break;
                case 5:
                    uVar = new com.vivo.push.b.p();
                    break;
                case 6:
                    uVar = new r();
                    break;
                case 7:
                    uVar = new com.vivo.push.b.n();
                    break;
                case 8:
                    uVar = new com.vivo.push.b.m();
                    break;
                case 9:
                    uVar = new com.vivo.push.b.k();
                    break;
                case 10:
                case 11:
                    tVar = new com.vivo.push.b.i(a);
                    uVar = tVar;
                    break;
                case 12:
                    uVar = new com.vivo.push.b.j();
                    break;
                default:
                    uVar = null;
                    break;
            }
        } else {
            uVar = new com.vivo.push.b.l();
        }
        if (uVar != null) {
            a a2 = a.a(intent);
            if (a2 == null) {
                com.vivo.push.util.p.b("PushCommand", "bundleWapper is null");
            } else {
                uVar.b(a2);
            }
        }
        return uVar;
    }

    @Override // com.vivo.push.IPushClientFactory
    public final l createTask(o oVar) {
        return ag.a(oVar);
    }

    @Override // com.vivo.push.IPushClientFactory
    public final z createReceiveTask(o oVar) {
        return ag.b(oVar);
    }
}
