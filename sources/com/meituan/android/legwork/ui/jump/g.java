package com.meituan.android.legwork.ui.jump;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.legwork.bean.PayBean;
import com.meituan.android.legwork.bean.PayTypeBean;
import com.meituan.android.legwork.bean.im.IMInitializeData;
import com.meituan.android.legwork.common.util.PmUtil;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.android.legwork.ui.activity.ToSendOneMoreActivity;
import com.meituan.android.legwork.ui.base.BaseActivity;
import com.meituan.android.legwork.utils.ab;
import com.meituan.android.legwork.utils.l;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.t;
import com.meituan.android.legwork.utils.u;
import com.meituan.android.legwork.utils.v;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.session.SessionId;
import java.util.HashMap;
import java.util.Map;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g extends com.meituan.android.legwork.ui.base.b {
    public static ChangeQuickRedirect c;
    String d;
    private long e;
    private short f;
    private String g;
    private k h;

    @Override // com.meituan.android.legwork.ui.base.b
    public final boolean d() {
        return false;
    }

    public static /* synthetic */ void a(g gVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "409b34bdc6918a919e72b1974eb5725b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "409b34bdc6918a919e72b1974eb5725b");
            return;
        }
        ToSendOneMoreActivity toSendOneMoreActivity = gVar.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = BaseActivity.b;
        if (PatchProxy.isSupport(objArr2, toSendOneMoreActivity, changeQuickRedirect2, false, "004b73cf3999b6a5396da05dd6b1181a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, toSendOneMoreActivity, changeQuickRedirect2, false, "004b73cf3999b6a5396da05dd6b1181a");
        } else {
            Object[] objArr3 = {""};
            ChangeQuickRedirect changeQuickRedirect3 = BaseActivity.b;
            if (PatchProxy.isSupport(objArr3, toSendOneMoreActivity, changeQuickRedirect3, false, "c2ff39f97f1f08d345b18f1e457035d1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, toSendOneMoreActivity, changeQuickRedirect3, false, "c2ff39f97f1f08d345b18f1e457035d1");
            } else {
                Boolean bool = Boolean.TRUE;
                Object[] objArr4 = {"", bool};
                ChangeQuickRedirect changeQuickRedirect4 = BaseActivity.b;
                if (PatchProxy.isSupport(objArr4, toSendOneMoreActivity, changeQuickRedirect4, false, "7dd17ee396e495129439ff50baf990c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, toSendOneMoreActivity, changeQuickRedirect4, false, "7dd17ee396e495129439ff50baf990c5");
                } else {
                    toSendOneMoreActivity.a("", bool, (DialogInterface.OnDismissListener) null);
                }
            }
        }
        if (gVar.h != null && !gVar.h.isUnsubscribed()) {
            gVar.h.unsubscribe();
        }
        gVar.h = rx.d.a(new AnonymousClass3(), ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).getPayParams(str).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
    }

    public static /* synthetic */ void i(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "d1b3da4b094f6a37dfde04bc332020d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "d1b3da4b094f6a37dfde04bc332020d2");
            return;
        }
        IMInitializeData iMInitializeData = new IMInitializeData();
        iMInitializeData.peerId = gVar.e;
        iMInitializeData.peerAppId = gVar.f;
        com.meituan.android.legwork.common.im.f.b().a(gVar.b, iMInitializeData);
    }

    public g(ToSendOneMoreActivity toSendOneMoreActivity) {
        super(toSendOneMoreActivity);
        Object[] objArr = {toSendOneMoreActivity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b630db91482d5d8f2c048a6c5fe134bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b630db91482d5d8f2c048a6c5fe134bd");
        }
    }

    @Override // com.meituan.android.legwork.ui.base.b
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38413bafeeae98374185d96b00b2b54f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38413bafeeae98374185d96b00b2b54f");
            return;
        }
        super.a(bundle);
        this.b.setContentView(new View(this.b));
        final Intent intent = this.b.getIntent();
        Uri data = intent.getData();
        if (data == null) {
            this.b.finish();
            return;
        }
        PmUtil.a(new PmUtil.b() { // from class: com.meituan.android.legwork.ui.jump.g.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.legwork.common.util.PmUtil.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3914e3abe009e2ed22c2e429ff118ec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3914e3abe009e2ed22c2e429ff118ec");
                    return;
                }
                g.this.d = intent.getData().getPath();
            }

            @Override // com.meituan.android.legwork.common.util.PmUtil.b
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f0321f5d34b35434000ce5705911ebc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f0321f5d34b35434000ce5705911ebc");
                    return;
                }
                g.this.d = intent.getData().getPath();
            }

            @Override // com.meituan.android.legwork.common.util.PmUtil.b
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e219ddd12cdb4f44f2251bc9c259a375", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e219ddd12cdb4f44f2251bc9c259a375");
                    return;
                }
                g.this.d = intent.getData().getHost();
            }
        });
        if (TextUtils.equals(this.b.getString(R.string.legwork_scheme_path_im), this.d)) {
            if (!com.meituan.android.legwork.common.im.f.b().a()) {
                this.b.finish();
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36604b643cb585ffef02fbb41da0167c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36604b643cb585ffef02fbb41da0167c");
                return;
            }
            Uri data2 = this.b.getIntent().getData();
            if (data2 == null) {
                this.b.finish();
                return;
            }
            this.e = u.a(data2.getQueryParameter("chatID"));
            this.f = u.b(data2.getQueryParameter(Message.PEER_APPID));
            this.g = data2.getQueryParameter(Constants.EventConstants.KEY_ORDER_ID);
            if (!TextUtils.isEmpty(this.g)) {
                a(this.g);
            } else {
                com.meituan.android.legwork.common.im.f.b().a(SessionId.a(this.e, 0L, 1, this.f, (short) 1013), new com.sankuai.xm.im.d<com.sankuai.xm.im.session.entry.a>() { // from class: com.meituan.android.legwork.ui.jump.g.5
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.im.d
                    public final /* synthetic */ void b_(com.sankuai.xm.im.session.entry.a aVar) {
                        com.sankuai.xm.im.session.entry.a aVar2 = aVar;
                        Object[] objArr3 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e99edb1da17835a716927afa5ea4fb3b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e99edb1da17835a716927afa5ea4fb3b");
                        } else if (aVar2 == null || aVar2.a() == null || TextUtils.isEmpty(aVar2.a().getExtension())) {
                            g.i(g.this);
                            g.this.b.finish();
                            x.e("TempOrderDelegate.parseIMPrepare().onResultOnUIThread()", "session is  null, startSimpleIMChat");
                        } else {
                            String str = (String) ((Map) new Gson().fromJson(aVar2.a().getExtension(), new TypeToken<Map<String, String>>() { // from class: com.meituan.android.legwork.ui.jump.g.5.1
                            }.getType())).get("chatfid");
                            if (TextUtils.isEmpty(str)) {
                                g.i(g.this);
                                g.this.b.finish();
                                x.e("TempOrderDelegate.parseIMPrepare().onResultOnUIThread()", "chatfid is empty, startSimpleIMChat");
                                return;
                            }
                            g.this.a(str);
                        }
                    }
                });
            }
        } else if (TextUtils.equals(this.b.getString(R.string.legwork_scheme_path_order_pay_tmp), this.d)) {
            Object[] objArr3 = {data};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3ecc03cf43699be424d357a4772c0e5e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3ecc03cf43699be424d357a4772c0e5e");
                return;
            }
            final String queryParameter = data != null ? data.getQueryParameter("orderid") : "";
            if (TextUtils.isEmpty(queryParameter)) {
                this.b.finish();
            } else {
                this.h = rx.d.a(new com.meituan.android.legwork.net.subscriber.a<PayTypeBean>() { // from class: com.meituan.android.legwork.ui.jump.g.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.legwork.net.subscriber.a
                    public final /* synthetic */ void a(PayTypeBean payTypeBean) {
                        PayTypeBean payTypeBean2 = payTypeBean;
                        Object[] objArr4 = {payTypeBean2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "502a459867f40c2be5a7f9ea8c85b4dd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "502a459867f40c2be5a7f9ea8c85b4dd");
                        } else if (payTypeBean2 == null) {
                            a(false, -1, "返回数据为空");
                        } else if (!payTypeBean2.isBalanceDegrade() && payTypeBean2.getPayType() == 3) {
                            if (g.this.b == null || g.this.b.isFinishing()) {
                                return;
                            }
                            ToSendOneMoreActivity toSendOneMoreActivity = g.this.b;
                            String str = queryParameter;
                            Object[] objArr5 = {toSendOneMoreActivity, 3, str};
                            ChangeQuickRedirect changeQuickRedirect5 = t.a;
                            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "8157fa49519ed535e5071ef437421954", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "8157fa49519ed535e5071ef437421954");
                            } else if (toSendOneMoreActivity == null || toSendOneMoreActivity.isFinishing()) {
                                x.e("OrderDetailJumpHelper.startActivity()", "activity is finish");
                            } else {
                                HashMap hashMap = new HashMap();
                                hashMap.put("from", "3");
                                hashMap.put("orderid", str);
                                com.meituan.android.legwork.mrn.b a2 = com.meituan.android.legwork.mrn.b.a();
                                Object[] objArr6 = {toSendOneMoreActivity, "legwork-order-detail", "legwork-order-detail", hashMap};
                                ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.legwork.mrn.b.a;
                                if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "0343a68e3e5988afd903eb5a535dbc5e", RobustBitConfig.DEFAULT_VALUE)) {
                                    ((Boolean) PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "0343a68e3e5988afd903eb5a535dbc5e")).booleanValue();
                                } else {
                                    Object[] objArr7 = {toSendOneMoreActivity, "legwork-order-detail", "legwork-order-detail", hashMap, -1};
                                    ChangeQuickRedirect changeQuickRedirect7 = com.meituan.android.legwork.mrn.b.a;
                                    if (PatchProxy.isSupport(objArr7, a2, changeQuickRedirect7, false, "56d7a0a8b021291a265f211c7957ba4b", RobustBitConfig.DEFAULT_VALUE)) {
                                        ((Boolean) PatchProxy.accessDispatch(objArr7, a2, changeQuickRedirect7, false, "56d7a0a8b021291a265f211c7957ba4b")).booleanValue();
                                    } else if (com.meituan.android.legwork.common.util.a.a().a("legwork-order-detail")) {
                                        Object[] objArr8 = {toSendOneMoreActivity, "legwork-order-detail", "legwork-order-detail", hashMap, -1};
                                        ChangeQuickRedirect changeQuickRedirect8 = com.meituan.android.legwork.mrn.b.a;
                                        if (PatchProxy.isSupport(objArr8, a2, changeQuickRedirect8, false, "9c45bf56720bc333ce13f8ee6e78064e", RobustBitConfig.DEFAULT_VALUE)) {
                                            ((Boolean) PatchProxy.accessDispatch(objArr8, a2, changeQuickRedirect8, false, "9c45bf56720bc333ce13f8ee6e78064e")).booleanValue();
                                        } else if (toSendOneMoreActivity != null && !toSendOneMoreActivity.isFinishing()) {
                                            a2.a(toSendOneMoreActivity, a2.c(toSendOneMoreActivity, "legwork-order-detail", "legwork-order-detail", hashMap), -1);
                                        }
                                    } else if (toSendOneMoreActivity != null && !toSendOneMoreActivity.isFinishing()) {
                                        a2.a(toSendOneMoreActivity, a2.a(toSendOneMoreActivity, com.meituan.android.legwork.mrn.b.a().a("legwork-order-detail", "legwork-order-detail", hashMap), hashMap), -1);
                                    }
                                }
                            }
                            g.this.e();
                        } else {
                            g.a(g.this, queryParameter);
                        }
                    }

                    @Override // com.meituan.android.legwork.net.subscriber.a
                    public final void a(boolean z, int i, String str) {
                        Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "959635a00709db107d8e8de22a942c02", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "959635a00709db107d8e8de22a942c02");
                        } else {
                            g.a(g.this, queryParameter);
                        }
                    }
                }, new com.meituan.android.legwork.mvp.model.d().a(queryParameter, 0, 0).b(rx.schedulers.a.e()).c(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
            }
        } else if (TextUtils.equals(this.b.getString(R.string.legwork_scheme_path_invoice_order_list), this.d)) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = c;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9825c9604ee5ddda84b6bb8f1197231b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9825c9604ee5ddda84b6bb8f1197231b");
                return;
            }
            Uri data3 = this.b.getIntent().getData();
            if (data3 == null) {
                this.b.finish();
                return;
            }
            l.a(this.b, data3.getQueryParameter("url"));
            this.b.finish();
        } else if (TextUtils.equals(this.b.getString(R.string.legwork_scheme_path_web_coupon), this.d)) {
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = c;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "306a34c324450f1ae04add4e06f0e1fd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "306a34c324450f1ae04add4e06f0e1fd");
                return;
            }
            Uri data4 = this.b.getIntent().getData();
            if (data4 == null) {
                this.b.finish();
                return;
            }
            String queryParameter2 = data4.getQueryParameter("url");
            if (TextUtils.isEmpty(queryParameter2)) {
                this.b.finish();
            } else if (!com.meituan.android.legwork.common.user.a.a().b()) {
                rx.d<Integer> c2 = com.meituan.android.legwork.common.user.a.a().c();
                Object[] objArr6 = {this, queryParameter2};
                ChangeQuickRedirect changeQuickRedirect6 = h.a;
                this.h = c2.c(PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "310e0201f4240b00dc6b4baaba9042e3", RobustBitConfig.DEFAULT_VALUE) ? (rx.functions.b) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "310e0201f4240b00dc6b4baaba9042e3") : new h(this, queryParameter2));
                com.meituan.android.legwork.common.user.a.a().a(this.b);
            } else {
                l.a(this.b, queryParameter2);
                l.a(this.b.getApplicationContext());
                this.b.finish();
            }
        }
    }

    @Override // com.meituan.android.legwork.ui.base.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4fa9ce4f0d137be79825680dea54948", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4fa9ce4f0d137be79825680dea54948");
            return;
        }
        if (this.h != null && !this.h.isUnsubscribed()) {
            this.h.unsubscribe();
        }
        super.b();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.legwork.ui.jump.g$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 extends com.meituan.android.legwork.net.subscriber.a<PayBean> {
        public static ChangeQuickRedirect a;

        public AnonymousClass3() {
        }

        @Override // com.meituan.android.legwork.net.subscriber.a
        public final /* synthetic */ void a(PayBean payBean) {
            PayBean payBean2 = payBean;
            Object[] objArr = {payBean2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c096b38482b3add71f0d6c994e6f82a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c096b38482b3add71f0d6c994e6f82a7");
            } else if (g.this.b.isFinishing()) {
            } else {
                g.this.b.f();
                v.a(g.this.b, 1000, payBean2.payTradeNo, payBean2.payToken);
            }
        }

        @Override // com.meituan.android.legwork.net.subscriber.a
        public final void a(boolean z, int i, String str) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83a5ee9ab19693362b452a857ebe05fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83a5ee9ab19693362b452a857ebe05fc");
                return;
            }
            g.this.b.f();
            ab.a(str);
            g.this.b.getWindow().getDecorView().postDelayed(i.a(this), 1500L);
        }
    }

    @Override // com.meituan.android.legwork.ui.base.b
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e2909921329878ff5ff18c7031b8403", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e2909921329878ff5ff18c7031b8403");
        } else if (1000 == i) {
            Object[] objArr2 = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eaa2256ca70304efe6ec378ded8fc918", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eaa2256ca70304efe6ec378ded8fc918");
                return;
            }
            this.b.setResult(i2);
            this.b.finish();
            HashMap hashMap = new HashMap(2);
            if (i2 == -1) {
                hashMap.put("status", "success");
            } else {
                hashMap.put("status", "error");
            }
            q.a("legwork_pay", 1, hashMap);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec6f164e6086f9b028ee632ea0a560f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec6f164e6086f9b028ee632ea0a560f7");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("refresh", false);
        this.b.setResult(-1, intent);
        this.b.finish();
    }

    void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6665ea3c0eaedabe051c39b8de67dbdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6665ea3c0eaedabe051c39b8de67dbdd");
        } else {
            this.h = rx.d.a(new com.meituan.android.legwork.net.subscriber.a<IMInitializeData>() { // from class: com.meituan.android.legwork.ui.jump.g.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final /* synthetic */ void a(IMInitializeData iMInitializeData) {
                    IMInitializeData iMInitializeData2 = iMInitializeData;
                    Object[] objArr2 = {iMInitializeData2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28ee6bb9059ca8f99b7c0422c52c2f4b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28ee6bb9059ca8f99b7c0422c52c2f4b");
                        return;
                    }
                    if (iMInitializeData2 == null) {
                        g.i(g.this);
                        x.e("TempOrderDelegate.getInitializeData().onSuccess()", "getInitializeData success, bean is null, startSimpleIMChat");
                    } else {
                        iMInitializeData2.orderId = str;
                        com.meituan.android.legwork.common.im.f.b().a(g.this.b, iMInitializeData2);
                    }
                    g.this.b.finish();
                }

                @Override // com.meituan.android.legwork.net.subscriber.a
                public final void a(boolean z, int i, String str2) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a15477f366c76c2cb498e4f99e4dfca3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a15477f366c76c2cb498e4f99e4dfca3");
                        return;
                    }
                    g.i(g.this);
                    g.this.b.finish();
                    x.e("TempOrderDelegate.getInitializeData().onFailure()", "getInitializeData error, startSimpleIMChat, message:" + str2);
                }
            }, ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).getInitializeData(str).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
        }
    }

    public static /* synthetic */ void a(g gVar, String str, Integer num) {
        Object[] objArr = {gVar, str, num};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5ed96cc79245f3ca4ad084ce1a22f09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5ed96cc79245f3ca4ad084ce1a22f09");
        } else if (num.intValue() == 1) {
            l.a(gVar.b, str);
            l.a(gVar.b.getApplicationContext());
            gVar.b.finish();
        } else if (num.intValue() == 2) {
            gVar.b.finish();
        }
    }
}
