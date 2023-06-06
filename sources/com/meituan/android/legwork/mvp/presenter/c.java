package com.meituan.android.legwork.mvp.presenter;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.android.legwork.bean.TipSubmitBean;
import com.meituan.android.legwork.bean.orderDetail.ChangeOrderInfoSubmitBean;
import com.meituan.android.legwork.mvp.contract.PayTypeContract;
import com.meituan.android.legwork.mvp.contract.b;
import com.meituan.android.legwork.net.service.CommonAPIService;
import com.meituan.android.legwork.utils.ab;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends com.meituan.android.legwork.mvp.base.a<b.a> {
    public static ChangeQuickRedirect c;
    public e d;
    public PayTypeContract.a e;
    private com.meituan.android.legwork.mvp.model.b f;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i, String str);

        void a(TipSubmitBean tipSubmitBean);
    }

    public static /* synthetic */ void a(c cVar, boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "613cd8e8d1f9f82e715cb6e1b26e4740", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "613cd8e8d1f9f82e715cb6e1b26e4740");
            return;
        }
        HashMap hashMap = new HashMap(2);
        if (z) {
            hashMap.put("status", "success");
        } else {
            hashMap.put("status", "error");
        }
        q.a("legwork_pay", 1, hashMap);
        b.a b = cVar.b();
        if (b != null) {
            b.a(z, str);
        }
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db42afb89e6f982c096be02249fbca5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db42afb89e6f982c096be02249fbca5b");
            return;
        }
        this.f = new com.meituan.android.legwork.mvp.model.b();
        this.d = new e(6);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.legwork.mvp.presenter.c$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements PayTypeContract.a {
        public static ChangeQuickRedirect a;
        String b = null;
        public final /* synthetic */ FragmentManager c;
        public final /* synthetic */ ChangeOrderInfoSubmitBean d;
        public final /* synthetic */ Activity e;
        public final /* synthetic */ ReactApplicationContext f;
        public final /* synthetic */ Promise g;

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final void a(boolean z, String str, Map<String, Object> map) {
        }

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final void b() {
        }

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final void d() {
        }

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final void e() {
        }

        public AnonymousClass1(FragmentManager fragmentManager, ChangeOrderInfoSubmitBean changeOrderInfoSubmitBean, Activity activity, ReactApplicationContext reactApplicationContext, Promise promise) {
            this.c = fragmentManager;
            this.d = changeOrderInfoSubmitBean;
            this.e = activity;
            this.f = reactApplicationContext;
            this.g = promise;
        }

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final FragmentManager a() {
            return this.c;
        }

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a92f918e5da5fa033fffb80587469b6f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a92f918e5da5fa033fffb80587469b6f");
                return;
            }
            a aVar = new a() { // from class: com.meituan.android.legwork.mvp.presenter.c.1.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.legwork.mvp.presenter.c.a
                public final void a(TipSubmitBean tipSubmitBean) {
                    Object[] objArr2 = {tipSubmitBean};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9941202432e4f93a3f2131f3479a27d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9941202432e4f93a3f2131f3479a27d");
                    } else if (tipSubmitBean != null) {
                        c.this.d.a(tipSubmitBean.orderViewId);
                        AnonymousClass1.this.b = tipSubmitBean.tips;
                    } else {
                        a(-1, "数据异常");
                    }
                }

                @Override // com.meituan.android.legwork.mvp.presenter.c.a
                public final void a(int i2, String str) {
                    Object[] objArr2 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17eae60f843b9ecc70f51373425d81c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17eae60f843b9ecc70f51373425d81c0");
                        return;
                    }
                    AnonymousClass1.this.d.payType = 1;
                    c.this.a(1, AnonymousClass1.this.d, this, AnonymousClass1.this.e, AnonymousClass1.this.f, AnonymousClass1.this.g);
                }
            };
            this.d.payType = i;
            c.this.a(i, this.d, aVar, this.e, this.f, this.g);
        }

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f8a341b80ffed77ef881089f40b9fa1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f8a341b80ffed77ef881089f40b9fa1");
            } else {
                c.a(c.this, true, this.b);
            }
        }

        @Override // com.meituan.android.legwork.mvp.contract.PayTypeContract.a
        public final void a(int i, String str) {
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c31c0769e1261e98c3ba830a3248ccbb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c31c0769e1261e98c3ba830a3248ccbb");
            } else if (i == 4) {
                c.this.d.a(this.d.total, 3, 16002);
            } else if (i == 5 || i == 7) {
                c.a(c.this, false, "pay.cancel");
            } else {
                c.a(c.this, false, "pay.fail");
            }
        }
    }

    public final void a(final int i, @NonNull ChangeOrderInfoSubmitBean changeOrderInfoSubmitBean, final a aVar, final Activity activity, final ReactApplicationContext reactApplicationContext, final Promise promise) {
        HashMap hashMap;
        Object[] objArr = {Integer.valueOf(i), changeOrderInfoSubmitBean, aVar, activity, reactApplicationContext, promise};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "348f70bdb7873d52b652ce53c46f6bc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "348f70bdb7873d52b652ce53c46f6bc7");
            return;
        }
        com.meituan.android.legwork.mvp.model.b bVar = this.f;
        Object[] objArr2 = {changeOrderInfoSubmitBean};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d8680260637bf23dcf11fdd0b505c47", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (HashMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d8680260637bf23dcf11fdd0b505c47");
        } else if (changeOrderInfoSubmitBean == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put("orderToken", changeOrderInfoSubmitBean.orderToken);
            hashMap.put("payType", Integer.valueOf(changeOrderInfoSubmitBean.payType));
            hashMap.put("orderViewId", changeOrderInfoSubmitBean.orderViewId);
            hashMap.put("businessType", Integer.valueOf(changeOrderInfoSubmitBean.businessType));
            hashMap.put("businessTypeTag", Integer.valueOf(changeOrderInfoSubmitBean.businessTypeTag));
            hashMap.put("fetchLat", Integer.valueOf(changeOrderInfoSubmitBean.fetchLat));
            hashMap.put("fetchLng", Integer.valueOf(changeOrderInfoSubmitBean.fetchLng));
            hashMap.put("recipientName", changeOrderInfoSubmitBean.recipientName);
            hashMap.put("recipientAddress", changeOrderInfoSubmitBean.recipientAddress);
            hashMap.put("recipientAddressId", Integer.valueOf(changeOrderInfoSubmitBean.recipientAddressId));
            hashMap.put("recipientHouseNumber", changeOrderInfoSubmitBean.recipientHouseNumber);
            hashMap.put("recipientLat", Integer.valueOf(changeOrderInfoSubmitBean.recipientLat));
            hashMap.put("recipientLng", Integer.valueOf(changeOrderInfoSubmitBean.recipientLng));
            hashMap.put("pickupTime", Integer.valueOf(changeOrderInfoSubmitBean.pickupTime));
            hashMap.put("userSpecifiedTime", Integer.valueOf(changeOrderInfoSubmitBean.userSpecifiedTime));
            hashMap.put("goodsTypes", Integer.valueOf(changeOrderInfoSubmitBean.goodsTypes));
            hashMap.put("goodsTypeNames", changeOrderInfoSubmitBean.goodsTypeNames);
            hashMap.put("goodsWeight", Double.valueOf(changeOrderInfoSubmitBean.goodsWeight));
            hashMap.put("modifyFee", Double.valueOf(changeOrderInfoSubmitBean.modifyFee));
            hashMap.put("deliveryFeeDiff", Double.valueOf(changeOrderInfoSubmitBean.deliveryFeeDiff));
            hashMap.put("userSpecifiedTimeModifyAck", changeOrderInfoSubmitBean.userSpecifiedTimeModifyAck);
            hashMap.put("total", Double.valueOf(changeOrderInfoSubmitBean.total));
            hashMap.put("pushToken", changeOrderInfoSubmitBean.pushToken);
            hashMap.put(FingerprintManager.TAG, changeOrderInfoSubmitBean.fingerprint);
        }
        Object[] objArr3 = {hashMap};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.legwork.mvp.model.b.a;
        a(rx.d.a(new com.meituan.android.legwork.net.subscriber.a<TipSubmitBean>() { // from class: com.meituan.android.legwork.mvp.presenter.c.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.legwork.net.subscriber.a
            public final /* synthetic */ void a(TipSubmitBean tipSubmitBean) {
                final TipSubmitBean tipSubmitBean2 = tipSubmitBean;
                Object[] objArr4 = {tipSubmitBean2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "97f7aa84b7e26047caa52013745da7c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "97f7aa84b7e26047caa52013745da7c6");
                } else if (!c.this.c() || tipSubmitBean2 == null) {
                } else {
                    if (i == 3 && aVar != null) {
                        aVar.a(tipSubmitBean2);
                        return;
                    }
                    final c cVar = c.this;
                    Activity activity2 = activity;
                    final ReactApplicationContext reactApplicationContext2 = reactApplicationContext;
                    final Promise promise2 = promise;
                    Object[] objArr5 = {activity2, reactApplicationContext2, tipSubmitBean2, promise2, 3};
                    ChangeQuickRedirect changeQuickRedirect5 = c.c;
                    if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "4ada0e089504d2f7c400fb05e58798b3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "4ada0e089504d2f7c400fb05e58798b3");
                    } else if (activity2 == null || reactApplicationContext2 == null || !cVar.d.c() || promise2 == null || tipSubmitBean2 == null) {
                    } else {
                        reactApplicationContext2.addActivityEventListener(new ActivityEventListener() { // from class: com.meituan.android.legwork.mvp.presenter.c.3
                            public static ChangeQuickRedirect a;

                            @Override // com.facebook.react.bridge.ActivityEventListener
                            public final void onNewIntent(Intent intent) {
                            }

                            @Override // com.facebook.react.bridge.ActivityEventListener
                            public final void onActivityResult(Activity activity3, int i2, int i3, Intent intent) {
                                Object[] objArr6 = {activity3, Integer.valueOf(i2), Integer.valueOf(i3), intent};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8df9a239d0142263cd1ee719b8d00d2b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8df9a239d0142263cd1ee719b8d00d2b");
                                } else if (reactApplicationContext2 == null || !c.this.d.c() || promise2 == null) {
                                } else {
                                    reactApplicationContext2.removeActivityEventListener(this);
                                    if (i2 == 3) {
                                        if (i3 == -1) {
                                            promise2.resolve(TextUtils.isEmpty(tipSubmitBean2.tips) ? "" : tipSubmitBean2.tips);
                                        }
                                        c.this.a();
                                    }
                                }
                            }
                        });
                        v.a(activity2, 3, tipSubmitBean2.payTradeNo, tipSubmitBean2.payToken);
                    }
                }
            }

            @Override // com.meituan.android.legwork.net.subscriber.a
            public final void a(boolean z, int i2, String str) {
                Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2), str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b415e2660d1a485a1b41215185783d1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b415e2660d1a485a1b41215185783d1f");
                } else if (c.this.c()) {
                    if (aVar != null && i2 == 16003) {
                        aVar.a(i2, str);
                    } else if (promise != null) {
                        Promise promise2 = promise;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i2);
                        promise2.reject(sb.toString(), str);
                    } else {
                        ab.a(activity, str);
                    }
                }
            }
        }, (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "3622c012f8102d6858ea8d270c0411dc", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "3622c012f8102d6858ea8d270c0411dc") : ((CommonAPIService) com.meituan.android.legwork.net.manager.a.a().a(CommonAPIService.class)).submitOrderModifyInfo(hashMap)).b(rx.schedulers.a.e()).c(rx.schedulers.a.e()).a(rx.android.schedulers.a.a())));
    }
}
