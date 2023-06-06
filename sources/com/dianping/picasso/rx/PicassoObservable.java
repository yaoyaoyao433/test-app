package com.dianping.picasso.rx;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.d;
import rx.g;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoObservable<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public d<T> observable;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnSubscribe<T> {
        void call(PicassoSubscriber<T> picassoSubscriber);
    }

    public PicassoObservable(d<T> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfbb70071dc1a3d8ba155f3ff7589ff0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfbb70071dc1a3d8ba155f3ff7589ff0");
        } else {
            this.observable = dVar;
        }
    }

    public d<T> getObservable() {
        return this.observable;
    }

    public PicassoObservable observeOn(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "742c982c0099ddc5258cbaff63425dcc", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoObservable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "742c982c0099ddc5258cbaff63425dcc");
        }
        this.observable.a(gVar);
        return this;
    }

    public PicassoObservable subscribeOn(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30fdf01a370cd36dc7918d5b8dcad64d", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoObservable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30fdf01a370cd36dc7918d5b8dcad64d");
        }
        this.observable.b(gVar);
        return this;
    }

    public static <T> PicassoObservable<T> createObservable(d<T> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5db5234c665030006c93cf98ce9f5385", RobustBitConfig.DEFAULT_VALUE) ? (PicassoObservable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5db5234c665030006c93cf98ce9f5385") : new PicassoObservable<>(dVar);
    }

    public static <T> PicassoObservable<T> just(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dcf9df636edb84d11ba46361c1de70e6", RobustBitConfig.DEFAULT_VALUE) ? (PicassoObservable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dcf9df636edb84d11ba46361c1de70e6") : createObservable(d.a(t));
    }

    public static <T> PicassoObservable<T> from(T[] tArr) {
        Object[] objArr = {tArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4970e8aedb53b852536bab2e1a0c14a2", RobustBitConfig.DEFAULT_VALUE) ? (PicassoObservable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4970e8aedb53b852536bab2e1a0c14a2") : createObservable(d.a((Object[]) tArr));
    }

    public static <T> PicassoObservable<T> create(final OnSubscribe<T> onSubscribe) {
        Object[] objArr = {onSubscribe};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c6cf4f546cfc313d9b6a43babcbbd32b", RobustBitConfig.DEFAULT_VALUE) ? (PicassoObservable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c6cf4f546cfc313d9b6a43babcbbd32b") : createObservable(d.a((d.a) new d.a<T>() { // from class: com.dianping.picasso.rx.PicassoObservable.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.b
            public final /* bridge */ /* synthetic */ void call(Object obj) {
                call((j) ((j) obj));
            }

            public final void call(final j<? super T> jVar) {
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "407dd95729b680d860966d7b56b8fd47", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "407dd95729b680d860966d7b56b8fd47");
                } else {
                    OnSubscribe.this.call(new PicassoSubscriber<T>() { // from class: com.dianping.picasso.rx.PicassoObservable.1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.dianping.picasso.rx.PicassoSubscriber
                        public void onCompleted() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1cbc5e420ed90ff9f51c346e0ea7cf12", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1cbc5e420ed90ff9f51c346e0ea7cf12");
                            } else if (jVar.isUnsubscribed()) {
                            } else {
                                jVar.onCompleted();
                            }
                        }

                        @Override // com.dianping.picasso.rx.PicassoSubscriber
                        public void onError(Throwable th) {
                            Object[] objArr3 = {th};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "60cd301a0449381c9e5df1b3c66d5524", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "60cd301a0449381c9e5df1b3c66d5524");
                            } else if (jVar.isUnsubscribed()) {
                            } else {
                                jVar.onError(th);
                            }
                        }

                        @Override // com.dianping.picasso.rx.PicassoSubscriber
                        public void onNext(T t) {
                            Object[] objArr3 = {t};
                            ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "0298b503e5620029abd7ae6c7a685f47", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "0298b503e5620029abd7ae6c7a685f47");
                            } else if (jVar.isUnsubscribed()) {
                            } else {
                                jVar.onNext(t);
                            }
                        }
                    });
                }
            }
        }));
    }

    public <R> PicassoObservable<R> map(final PicassoFunction<R, T> picassoFunction) {
        Object[] objArr = {picassoFunction};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "636fc3c443b0bffcefc0b9961041665c", RobustBitConfig.DEFAULT_VALUE) ? (PicassoObservable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "636fc3c443b0bffcefc0b9961041665c") : createObservable(this.observable.d(new rx.functions.g<T, R>() { // from class: com.dianping.picasso.rx.PicassoObservable.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.g
            public R call(T t) {
                Object[] objArr2 = {t};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c674cd90f8c353961751126a77cc9d6f", RobustBitConfig.DEFAULT_VALUE) ? (R) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c674cd90f8c353961751126a77cc9d6f") : (R) picassoFunction.getData(t);
            }
        }));
    }

    public <R> PicassoObservable<R> flatMap(final PicassoObservableFunction<R, T> picassoObservableFunction) {
        Object[] objArr = {picassoObservableFunction};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b329e708da13e73e6f05a84796eeffd9", RobustBitConfig.DEFAULT_VALUE) ? (PicassoObservable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b329e708da13e73e6f05a84796eeffd9") : createObservable(this.observable.c(new rx.functions.g<T, d<R>>() { // from class: com.dianping.picasso.rx.PicassoObservable.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.functions.g
            public /* bridge */ /* synthetic */ Object call(Object obj) {
                return call((AnonymousClass3<R>) obj);
            }

            @Override // rx.functions.g
            public d<R> call(T t) {
                Object[] objArr2 = {t};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bdbe1116fa709d8299c526685cb06c9c", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bdbe1116fa709d8299c526685cb06c9c") : picassoObservableFunction.getObservable(t).observable;
            }
        }));
    }

    public PicassoSubscription subscribe(final PicassoSubscriber<T> picassoSubscriber) {
        Object[] objArr = {picassoSubscriber};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59b4052f6e52cd0a929b281a6296d6b2", RobustBitConfig.DEFAULT_VALUE) ? (PicassoSubscription) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59b4052f6e52cd0a929b281a6296d6b2") : PicassoSubscription.createSubscription(d.a(new j<T>() { // from class: com.dianping.picasso.rx.PicassoObservable.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // rx.e
            public void onCompleted() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "caf27eea05ffd6ae4a3490f7bbe0f02d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "caf27eea05ffd6ae4a3490f7bbe0f02d");
                } else {
                    picassoSubscriber.onCompleted();
                }
            }

            @Override // rx.e
            public void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ac33709472b84cee6b88b785b41e7e2e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ac33709472b84cee6b88b785b41e7e2e");
                } else {
                    picassoSubscriber.onError(th);
                }
            }

            @Override // rx.e
            public void onNext(T t) {
                Object[] objArr2 = {t};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a125ae93438e2a234865ce0677c1ba13", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a125ae93438e2a234865ce0677c1ba13");
                } else {
                    picassoSubscriber.onNext(t);
                }
            }
        }, this.observable));
    }
}
