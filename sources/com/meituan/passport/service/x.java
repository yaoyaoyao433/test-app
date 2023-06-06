package com.meituan.passport.service;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.handler.a;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class x extends ag<com.meituan.passport.pojo.request.e, User> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.service.ag
    public final void a() {
        rx.d dVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f764faadfc69264557a5c5efeec2895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f764faadfc69264557a5c5efeec2895");
            return;
        }
        Fragment d = d();
        if (d == null) {
            return;
        }
        FragmentActivity activity = d.getActivity();
        boolean p = PassportConfig.p();
        if (activity == null || this.e == 0) {
            return;
        }
        com.meituan.passport.handler.resume.b<T> bVar = (com.meituan.passport.handler.resume.b) a.C0506a.a().a(new com.meituan.passport.handler.resume.h(activity, this.f, this.h, ((com.meituan.passport.pojo.request.e) this.e).c.b(), ((com.meituan.passport.pojo.request.e) this.e).b.b(), "", ((com.meituan.passport.pojo.request.e) this.e).j.b(), ((com.meituan.passport.pojo.request.e) this.e).m.b())).a(new com.meituan.passport.handler.resume.j(activity, this.f, this.h, ((com.meituan.passport.pojo.request.e) this.e).j.b(), ((com.meituan.passport.pojo.request.e) this.e).m.b(), true)).b;
        if (TextUtils.equals(((com.meituan.passport.pojo.request.e) this.e).j.b(), UserCenter.OAUTH_TYPE_ACCOUNT)) {
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = y.a;
            dVar = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d59a105973b7b4b3c9faf4e2c71d25a2", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d59a105973b7b4b3c9faf4e2c71d25a2") : new y(this));
        } else if (TextUtils.equals(((com.meituan.passport.pojo.request.e) this.e).j.b(), "china_tele")) {
            Object[] objArr3 = {this};
            ChangeQuickRedirect changeQuickRedirect3 = z.a;
            dVar = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8501c8ab5f11b0787da09aa35b8e0588", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8501c8ab5f11b0787da09aa35b8e0588") : new z(this));
        } else if (TextUtils.equals(((com.meituan.passport.pojo.request.e) this.e).j.b(), "china_mobile")) {
            Object[] objArr4 = {this};
            ChangeQuickRedirect changeQuickRedirect4 = aa.a;
            dVar = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "03400737829066c8c0ac88df08aa34f2", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "03400737829066c8c0ac88df08aa34f2") : new aa(this));
        } else if (TextUtils.equals(((com.meituan.passport.pojo.request.e) this.e).j.b(), "china_unicom")) {
            Object[] objArr5 = {this};
            ChangeQuickRedirect changeQuickRedirect5 = ab.a;
            dVar = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "9623b6a1cb047408b7fe98173736cb39", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "9623b6a1cb047408b7fe98173736cb39") : new ab(this));
        } else if (TextUtils.equals(((com.meituan.passport.pojo.request.e) this.e).j.b(), UserCenter.OAUTH_TYPE_QQ) || TextUtils.equals(((com.meituan.passport.pojo.request.e) this.e).j.b(), UserCenter.OAUTH_TYPE_WEIXIN) || TextUtils.equals(((com.meituan.passport.pojo.request.e) this.e).j.b(), "qq_bridge") || TextUtils.equals(((com.meituan.passport.pojo.request.e) this.e).j.b(), "wx_bridge")) {
            Object[] objArr6 = {this};
            ChangeQuickRedirect changeQuickRedirect6 = ac.a;
            dVar = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "96f2aaba9c067fd71ec2d7b4e89dc6a6", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "96f2aaba9c067fd71ec2d7b4e89dc6a6") : new ac(this));
        } else {
            Object[] objArr7 = {this, Byte.valueOf(p ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect7 = ad.a;
            dVar = com.meituan.passport.utils.v.a(PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "2195c50d2f79abc163862a5dc7a57384", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.h) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "2195c50d2f79abc163862a5dc7a57384") : new ad(this, p));
        }
        com.meituan.passport.converter.h a2 = com.meituan.passport.converter.h.a();
        a2.h = bVar;
        a2.g = b(d);
        com.meituan.passport.converter.h a3 = a2.a(activity.getSupportFragmentManager());
        a3.i = dVar;
        a3.a((com.meituan.passport.converter.m) this.f).b();
    }

    public static /* synthetic */ rx.d e(x xVar, String str, String str2) {
        Object[] objArr = {xVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbe00ed82cba04c2d44820571db76628", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbe00ed82cba04c2d44820571db76628") : com.meituan.passport.utils.s.a().loginv7(((com.meituan.passport.pojo.request.e) xVar.e).c(), "", "", str, str2);
    }

    public static /* synthetic */ rx.d d(x xVar, String str, String str2) {
        Object[] objArr = {xVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "36190432adec6958e784781d18994751", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "36190432adec6958e784781d18994751") : com.meituan.passport.utils.s.d().chinatelecomLogin(((com.meituan.passport.pojo.request.e) xVar.e).k.b(), str2, str, ((com.meituan.passport.pojo.request.e) xVar.e).l.b(), "", "", "", ((com.meituan.passport.pojo.request.e) xVar.e).c());
    }

    public static /* synthetic */ rx.d c(x xVar, String str, String str2) {
        Object[] objArr = {xVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfedf7951b7663816b1c0bb326d98b5f", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfedf7951b7663816b1c0bb326d98b5f") : com.meituan.passport.utils.s.d().chinamobileLogin(((com.meituan.passport.pojo.request.e) xVar.e).k.b(), str2, str, ((com.meituan.passport.pojo.request.e) xVar.e).l.b(), "", "", "", ((com.meituan.passport.pojo.request.e) xVar.e).c());
    }

    public static /* synthetic */ rx.d b(x xVar, String str, String str2) {
        Object[] objArr = {xVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99e5e41979bbf70e38211abfcaf3126e", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99e5e41979bbf70e38211abfcaf3126e") : com.meituan.passport.utils.s.d().chinaunicomLogin(((com.meituan.passport.pojo.request.e) xVar.e).k.b(), str2, str, ((com.meituan.passport.pojo.request.e) xVar.e).l.b(), "", "", "", ((com.meituan.passport.pojo.request.e) xVar.e).c());
    }

    public static /* synthetic */ rx.d a(x xVar, String str, String str2) {
        Object[] objArr = {xVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed5fd2e3a29bd0b63e6bd160dcf8abff", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed5fd2e3a29bd0b63e6bd160dcf8abff") : com.meituan.passport.utils.s.a().bindmobilelogin(((com.meituan.passport.pojo.request.e) xVar.e).c(), 0, 0, str, str2);
    }

    public static /* synthetic */ rx.d a(x xVar, boolean z, String str, String str2) {
        Object[] objArr = {xVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d83a9be0955ad5ed8bbc130d571c2c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d83a9be0955ad5ed8bbc130d571c2c4");
        }
        return com.meituan.passport.utils.s.a().mobileLoginv3(((com.meituan.passport.pojo.request.e) xVar.e).c(), "", str, str2, z ? String.valueOf(PassportConfig.j()) : "");
    }
}
