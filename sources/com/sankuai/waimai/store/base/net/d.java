package com.sankuai.waimai.store.base.net;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.util.al;
import java.lang.reflect.ParameterizedType;
import java.util.concurrent.ConcurrentHashMap;
import rx.d;
import rx.internal.operators.v;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class d<S> {
    private static final ConcurrentHashMap<Class, Object> a = new ConcurrentHashMap<>();
    public static ChangeQuickRedirect b;
    protected rx.subscriptions.b c;
    protected S d;
    private d.c e;
    private d.c f;

    @NonNull
    public abstract i a();

    public <T> j<T> a(j<T> jVar) {
        return jVar;
    }

    public static /* synthetic */ void a(d dVar, String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "1733a8203f8059693c28eeb675851d82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "1733a8203f8059693c28eeb675851d82");
        } else if (obj != null) {
            com.sankuai.shangou.stone.util.log.a.a("APIManager", str + " threadName = {" + Thread.currentThread().getName() + "} : " + obj.toString(), new Object[0]);
        } else {
            com.sankuai.shangou.stone.util.log.a.a("APIManager", str + " threadName = {" + Thread.currentThread().getName() + "} : obj is null ", new Object[0]);
        }
    }

    public d() {
        S s;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a9048cc52f28d99fc8a88a1751eef0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a9048cc52f28d99fc8a88a1751eef0a");
            return;
        }
        this.e = new d.c<BaseResponse<Object>, Object>() { // from class: com.sankuai.waimai.store.base.net.d.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ Object call(Object obj) {
                rx.d dVar = (rx.d) obj;
                Object[] objArr2 = {dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ac61de95a07f3f9932ee17dc66d86de", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ac61de95a07f3f9932ee17dc66d86de") : dVar.c(new rx.functions.g<BaseResponse<Object>, rx.d<Object>>() { // from class: com.sankuai.waimai.store.base.net.d.1.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.g
                    public final /* synthetic */ rx.d<Object> call(BaseResponse<Object> baseResponse) {
                        BaseResponse<Object> baseResponse2 = baseResponse;
                        Object[] objArr3 = {baseResponse2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "37b66876ddd7cd1b8dc37d5cfb800c8b", RobustBitConfig.DEFAULT_VALUE)) {
                            return (rx.d) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "37b66876ddd7cd1b8dc37d5cfb800c8b");
                        }
                        if (baseResponse2.isSuccess()) {
                            return rx.d.a(baseResponse2.data);
                        }
                        return rx.d.a((Throwable) new com.sankuai.waimai.store.repository.net.b(baseResponse2.code, !TextUtils.isEmpty(baseResponse2.msg) ? baseResponse2.msg : a(), baseResponse2.data, baseResponse2.subCodeString));
                    }

                    private String a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb90aed8bfbca682052ce3bb0089acd4", RobustBitConfig.DEFAULT_VALUE)) {
                            return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb90aed8bfbca682052ce3bb0089acd4");
                        }
                        try {
                            return com.sankuai.waimai.store.util.b.a().getString(R.string.wm_sc_common_loading_fail_try_afterwhile);
                        } catch (Exception e) {
                            com.sankuai.waimai.store.base.log.a.a(e);
                            return "";
                        }
                    }
                });
            }
        };
        this.f = new d.c<Object, Object>() { // from class: com.sankuai.waimai.store.base.net.d.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ Object call(Object obj) {
                rx.d dVar = (rx.d) obj;
                Object[] objArr2 = {dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aacf4e389d0f27834b6d66fcce223bca", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aacf4e389d0f27834b6d66fcce223bca") : dVar.b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a());
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c47b3739345007070c5273d5ded290c", RobustBitConfig.DEFAULT_VALUE)) {
            s = (S) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c47b3739345007070c5273d5ded290c");
        } else {
            Class cls = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
            Object[] objArr3 = {cls};
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4b05bd70f9c690eb6cac5d7cce21305f", RobustBitConfig.DEFAULT_VALUE)) {
                s = (S) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4b05bd70f9c690eb6cac5d7cce21305f");
            } else {
                if (!a.containsKey(cls)) {
                    ConcurrentHashMap<Class, Object> concurrentHashMap = a;
                    Object[] objArr4 = {cls};
                    ChangeQuickRedirect changeQuickRedirect4 = b;
                    concurrentHashMap.put(cls, PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "edd4fefadf904325f54b208ada92f3f1", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "edd4fefadf904325f54b208ada92f3f1") : a().a().a(cls));
                }
                s = (S) a.get(cls);
            }
        }
        this.d = s;
        this.c = new rx.subscriptions.b();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f4a41723917a5a371b2132ca6017d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f4a41723917a5a371b2132ca6017d72");
        } else if (this.c == null || !this.c.b()) {
        } else {
            this.c.a();
        }
    }

    public final <T> void a(j<T> jVar, rx.d<BaseResponse<T>> dVar) {
        Object[] objArr = {jVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd757bf4538d296bbfbf881140e2668d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd757bf4538d296bbfbf881140e2668d");
            return;
        }
        final j<T> a2 = a(jVar);
        this.c.a(rx.d.a(new com.sankuai.waimai.store.network.rxsupport.a<T>() { // from class: com.sankuai.waimai.store.base.net.d.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.network.rxsupport.a
            public final void a(T t) {
                Object[] objArr2 = {t};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e3302d80c9d560e3d3a3a5e7b84479c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e3302d80c9d560e3d3a3a5e7b84479c");
                    return;
                }
                d.a(d.this, "onSuccess", a2);
                try {
                    if (a2 != null) {
                        a2.a((j) t);
                    }
                } catch (Exception e) {
                    if (com.sankuai.waimai.store.config.k.a()) {
                        al.b(new Runnable() { // from class: com.sankuai.waimai.store.base.net.d.3.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "de3106b5d2cfef7acebf66905361a51a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "de3106b5d2cfef7acebf66905361a51a");
                                } else {
                                    com.sankuai.shangou.stone.util.log.a.a(DefaultHeaderService.KEY_STORE, e);
                                    throw e;
                                }
                            }
                        }, "");
                    }
                }
            }

            @Override // com.sankuai.waimai.store.network.rxsupport.a
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b150ce6dc594ca70d5b2353b8cbbaea4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b150ce6dc594ca70d5b2353b8cbbaea4");
                    return;
                }
                d.a(d.this, "onFailure", a2);
                if (a2 != null) {
                    a2.a(bVar);
                }
            }
        }, dVar.a(this.e).a((d.c<? super R, ? extends R>) this.f).b(new rx.functions.a() { // from class: com.sankuai.waimai.store.base.net.d.5
            public static ChangeQuickRedirect a;

            @Override // rx.functions.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b4c8d8ee1e9807f232b058a0c030fba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b4c8d8ee1e9807f232b058a0c030fba");
                    return;
                }
                d.a(d.this, "onStart", a2);
                if (a2 != null) {
                    a2.a();
                }
            }
        }).a((d.b) new v(new rx.functions.a() { // from class: com.sankuai.waimai.store.base.net.d.4
            public static ChangeQuickRedirect a;

            @Override // rx.functions.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ab1037106f0005c78f43bafb676ba4c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ab1037106f0005c78f43bafb676ba4c");
                    return;
                }
                d.a(d.this, "doOnUnsubscribe", a2);
                if (a2 != null) {
                    a2.b();
                }
            }
        }))));
    }
}
