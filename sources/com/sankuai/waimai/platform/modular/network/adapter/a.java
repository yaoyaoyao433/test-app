package com.sankuai.waimai.platform.modular.network.adapter;

import android.arch.lifecycle.LiveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.e;
import com.sankuai.meituan.retrofit2.f;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements e<LiveData<com.sankuai.waimai.platform.modular.network.api.a<?>>> {
    public static ChangeQuickRedirect a;
    private final Type b;

    @Override // com.sankuai.meituan.retrofit2.e
    public final /* synthetic */ LiveData<com.sankuai.waimai.platform.modular.network.api.a<?>> a(final Call call) {
        Object[] objArr = {call};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31447614a04aadc0b66f7cd592a8d152", RobustBitConfig.DEFAULT_VALUE) ? (LiveData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31447614a04aadc0b66f7cd592a8d152") : new LiveData<com.sankuai.waimai.platform.modular.network.api.a<?>>() { // from class: com.sankuai.waimai.platform.modular.network.adapter.a.1
            public static ChangeQuickRedirect a;
            public AtomicBoolean b = new AtomicBoolean(false);

            @Override // android.arch.lifecycle.LiveData
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "24bd8b9d4954d42e2b959ec4fe41cd9d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "24bd8b9d4954d42e2b959ec4fe41cd9d");
                    return;
                }
                super.b();
                if (this.b.compareAndSet(false, true)) {
                    call.a(new f<R>() { // from class: com.sankuai.waimai.platform.modular.network.adapter.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.retrofit2.f
                        public final void onResponse(Call<R> call2, Response<R> response) {
                            Object[] objArr3 = {call2, response};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9794b10812d51cb5d85cae94ca4cd261", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9794b10812d51cb5d85cae94ca4cd261");
                            } else {
                                a((AnonymousClass1) new com.sankuai.waimai.platform.modular.network.api.a(response));
                            }
                        }

                        @Override // com.sankuai.meituan.retrofit2.f
                        public final void onFailure(Call<R> call2, Throwable th) {
                            Object[] objArr3 = {call2, th};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6e39e0f341cab590fe95b3f4ae874432", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6e39e0f341cab590fe95b3f4ae874432");
                            } else {
                                a((AnonymousClass1) new com.sankuai.waimai.platform.modular.network.api.a(th));
                            }
                        }
                    });
                }
            }
        };
    }

    public a(Type type) {
        Object[] objArr = {type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e32c092a559a1048a519c3b5b18af54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e32c092a559a1048a519c3b5b18af54");
        } else {
            this.b = type;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.e
    public final Type a() {
        return this.b;
    }
}
