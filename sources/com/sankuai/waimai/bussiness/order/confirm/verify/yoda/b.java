package com.sankuai.waimai.bussiness.order.confirm.verify.yoda;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.yoda.plugins.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.bussiness.order.confirm.verify.yoda.YodaVerificationContract;
import com.sankuai.waimai.bussiness.order.confirm.verify.yoda.a;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements YodaVerificationContract.a {
    public static ChangeQuickRedirect a;
    @NonNull
    final YodaVerificationContract.View b;
    @NonNull
    final a c;

    public b(@NonNull YodaVerificationContract.View view, @NonNull a aVar) {
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19eab03e7210c6b0cc507b2dfeea0b39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19eab03e7210c6b0cc507b2dfeea0b39");
            return;
        }
        this.b = view;
        this.c = aVar;
    }

    @Override // com.sankuai.waimai.bussiness.order.confirm.verify.yoda.YodaVerificationContract.a
    public final void a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66031af0b2da8ae701e331f6592dd4b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66031af0b2da8ae701e331f6592dd4b6");
        } else if (str == null || str.length() == 0) {
            this.b.h();
        } else {
            final a aVar = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            a.b bVar = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "264d6be021eb96ee451b3271c19aa4d6", RobustBitConfig.DEFAULT_VALUE) ? (a.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "264d6be021eb96ee451b3271c19aa4d6") : new a.b() { // from class: com.sankuai.waimai.bussiness.order.confirm.verify.yoda.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.bussiness.order.confirm.verify.yoda.a.b
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cb3a6031fb3771f25fa5798a00548a94", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cb3a6031fb3771f25fa5798a00548a94");
                        return;
                    }
                    b.this.b.c();
                    final a aVar2 = b.this.c;
                    final b bVar2 = b.this;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    final a.InterfaceC0907a interfaceC0907a = PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "25feab95e941e6ee656eb878d14ed198", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0907a) PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "25feab95e941e6ee656eb878d14ed198") : new a.InterfaceC0907a() { // from class: com.sankuai.waimai.bussiness.order.confirm.verify.yoda.b.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.bussiness.order.confirm.verify.yoda.a.InterfaceC0907a
                        public final void a() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8569e51ce0b9f0d859e824d2c557ab70", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8569e51ce0b9f0d859e824d2c557ab70");
                                return;
                            }
                            b.this.b.d();
                            b.this.b.f();
                        }

                        @Override // com.sankuai.waimai.bussiness.order.confirm.verify.yoda.a.InterfaceC0907a
                        public final void a(@NonNull String str2) {
                            Object[] objArr5 = {str2};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "537fa88853628f54d5263a3f3de35ed6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "537fa88853628f54d5263a3f3de35ed6");
                                return;
                            }
                            b.this.b.d();
                            b.this.b.a(str2);
                            b.this.b.g();
                        }

                        @Override // com.sankuai.waimai.bussiness.order.confirm.verify.yoda.a.InterfaceC0907a
                        public final void b() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "95d9c72b40c5054e3309cf7b663d02e4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "95d9c72b40c5054e3309cf7b663d02e4");
                                return;
                            }
                            b.this.b.d();
                            b.this.b.h();
                        }
                    };
                    Object[] objArr5 = {interfaceC0907a};
                    ChangeQuickRedirect changeQuickRedirect5 = a.a;
                    if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "35eb9e9df0217f3e8acb1c734dd28d15", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "35eb9e9df0217f3e8acb1c734dd28d15");
                        return;
                    }
                    d<BaseResponse<Object>> validateCodeSubmit = ((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).validateCodeSubmit(aVar2.c, "", com.sankuai.waimai.platform.domain.manager.user.a.i().e(), aVar2.d, aVar2.b, aVar2.i, aVar2.h);
                    Object[] objArr6 = {interfaceC0907a};
                    ChangeQuickRedirect changeQuickRedirect6 = a.a;
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(validateCodeSubmit, PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "0983a7597a1a3e1f0e13ad8af23a586e", RobustBitConfig.DEFAULT_VALUE) ? (b.AbstractC1042b) PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "0983a7597a1a3e1f0e13ad8af23a586e") : new b.AbstractC1042b<BaseResponse<Object>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.verify.yoda.a.3
                        public static ChangeQuickRedirect a;

                        @Override // rx.e
                        public final /* synthetic */ void onNext(Object obj) {
                            BaseResponse baseResponse = (BaseResponse) obj;
                            Object[] objArr7 = {baseResponse};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "9b645ad9b2f95bdf5eb5f2819ceb84c3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "9b645ad9b2f95bdf5eb5f2819ceb84c3");
                            } else if (baseResponse == null) {
                                interfaceC0907a.b();
                            } else if (!baseResponse.isSuccess()) {
                                if (baseResponse.msg == null || baseResponse.msg.length() == 0) {
                                    interfaceC0907a.b();
                                } else {
                                    interfaceC0907a.a(baseResponse.msg);
                                }
                            } else {
                                interfaceC0907a.a();
                            }
                        }

                        @Override // rx.e
                        public final void onError(Throwable th) {
                            Object[] objArr7 = {th};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "2560061854c8230ccb5cc8cbf36d4cab", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "2560061854c8230ccb5cc8cbf36d4cab");
                            } else {
                                interfaceC0907a.b();
                            }
                        }
                    }, aVar2.e);
                }

                @Override // com.sankuai.waimai.bussiness.order.confirm.verify.yoda.a.b
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e5e659d412144cb9c1e937a8597917f9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e5e659d412144cb9c1e937a8597917f9");
                    } else {
                        b.this.b.h();
                    }
                }

                @Override // com.sankuai.waimai.bussiness.order.confirm.verify.yoda.a.b
                public final void c() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2ad28b510f296b8f4a8db165ad8f13e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2ad28b510f296b8f4a8db165ad8f13e3");
                    } else {
                        b.this.b.g();
                    }
                }
            };
            Object[] objArr3 = {str, bVar};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "0cd9d4c0e5793f32abbb7d517a200bd2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "0cd9d4c0e5793f32abbb7d517a200bd2");
            } else if (str.length() == 0) {
                bVar.c();
            } else if (aVar.f == null) {
                bVar.c();
            } else {
                aVar.g = bVar;
                if (!com.sankuai.waimai.foundation.core.a.c()) {
                    com.meituan.android.yoda.plugins.d.a().a(new c() { // from class: com.sankuai.waimai.bussiness.order.confirm.verify.yoda.a.2
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.yoda.plugins.c
                        public final int getNetEnv() {
                            boolean z;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ecec056d0712b52de68ed330f88206c0", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ecec056d0712b52de68ed330f88206c0")).intValue();
                            }
                            if (com.sankuai.waimai.platform.net.c.a().b()) {
                                com.sankuai.waimai.foundation.utils.log.a.b("yoda", "product env", new Object[0]);
                                return 1;
                            }
                            com.sankuai.waimai.platform.net.c a2 = com.sankuai.waimai.platform.net.c.a();
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.platform.net.c.a;
                            if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "cb83aa3ebb918d0720780fe9a370ef4e", RobustBitConfig.DEFAULT_VALUE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "cb83aa3ebb918d0720780fe9a370ef4e")).booleanValue();
                            } else {
                                z = a2.a(a2.m.b, "http://releaseapi.waimai.st.sankuai.com") || a2.a(a2.m.b, "http://dx-waimai-api01.dx.sankuai.com:8400") || a2.a(a2.m.b, com.sankuai.waimai.platform.net.c.g);
                            }
                            if (z) {
                                com.sankuai.waimai.foundation.utils.log.a.b("yoda", "stage env", new Object[0]);
                                return 2;
                            }
                            com.sankuai.waimai.foundation.utils.log.a.b("yoda", "test env", new Object[0]);
                            return 5;
                        }
                    });
                }
                aVar.f.startConfirm(str);
            }
        }
    }
}
