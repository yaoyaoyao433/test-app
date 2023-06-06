package com.sankuai.meituan.xp;

import android.content.Context;
import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.xp.core.XPlayer;
import com.sankuai.meituan.xp.core.XPlayerConstants;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d extends a {
    public static ChangeQuickRedirect p;
    private XPlayer q;
    private com.sankuai.meituan.mtliveqos.utils.a r;
    private Handler s;
    private Runnable t;

    public d(Context context, b bVar, int i) {
        Object[] objArr = {context, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40f1a78a8aae079c161abac76e3d24c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40f1a78a8aae079c161abac76e3d24c8");
            return;
        }
        this.s = new Handler();
        this.t = new Runnable() { // from class: com.sankuai.meituan.xp.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a21a2b087265e597426e2061c3f292f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a21a2b087265e597426e2061c3f292f3");
                    return;
                }
                d dVar = d.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "34537ee17767a45c58db46951c7a846c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "34537ee17767a45c58db46951c7a846c");
                } else {
                    dVar.a(100, XPlayerConstants.MEDIA_ERROR_IJK_PLAYER, XPlayerConstants.BUFFERING_TIME_OUT_ERROR, null);
                }
            }
        };
        this.q = new XPlayer(bVar, this.m);
        this.r = new com.sankuai.meituan.mtliveqos.utils.a();
        com.sankuai.meituan.xp.stat.b bVar2 = new com.sankuai.meituan.xp.stat.b(context, this.q, this.r);
        bVar2.d = "1.0";
        bVar2.h = String.valueOf(i);
        a(context, this.q, bVar2);
        this.r.a();
    }

    @Override // com.sankuai.meituan.xp.a
    public final void a() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2503d6834bfa403dc096cc80bed9c252", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2503d6834bfa403dc096cc80bed9c252");
            return;
        }
        a(4, "enable_dynamic_buffer", e.a().b);
        super.a();
    }

    private String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beeda161e643373fd543d1657ae9d0fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beeda161e643373fd543d1657ae9d0fa");
        }
        long _getPropertyLong = this.q._getPropertyLong(20200, 0L);
        if (_getPropertyLong > 1024) {
            return ((_getPropertyLong / 1024) * 8) + " kbps";
        }
        return (_getPropertyLong * 8) + " bps";
    }

    @Override // com.sankuai.meituan.xp.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a1e06deb94fa23ba90b32ababa5014d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a1e06deb94fa23ba90b32ababa5014d");
            return;
        }
        this.s.removeCallbacksAndMessages(null);
        long a = a(20006, 0L);
        long a2 = a(20005, 0L);
        c("handleBufferingEnd, tcpSpeed: " + l() + ",audioCacheDuration: " + a + ", videoCacheDuration: " + a2);
    }

    @Override // com.sankuai.meituan.xp.a
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "882b125fc7170595e5001fdb2c554a56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "882b125fc7170595e5001fdb2c554a56");
            return;
        }
        long a = a(20006, 0L);
        long a2 = a(20005, 0L);
        c("handleBufferingStart, tcpSpeed: " + l() + ",audioCacheDuration: " + a + ", videoCacheDuration: " + a2);
        this.s.removeCallbacksAndMessages(null);
        this.s.postDelayed(this.t, 10000L);
    }

    @Override // com.sankuai.meituan.xp.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf29fd049ea5883b75d1a9234ba7870a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf29fd049ea5883b75d1a9234ba7870a");
            return;
        }
        this.r.b();
        super.e();
    }

    @Override // com.sankuai.meituan.xp.a
    public final void d() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcc95459df913d77d50a8936b3dff6ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcc95459df913d77d50a8936b3dff6ee");
            return;
        }
        super.d();
        this.s.removeCallbacksAndMessages(null);
    }
}
