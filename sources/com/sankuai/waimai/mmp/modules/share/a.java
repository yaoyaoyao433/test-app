package com.sankuai.waimai.mmp.modules.share;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.share.BaseShareApi;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends BaseShareApi {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.mmp.lib.api.share.BaseShareApi
    public final void a(int i, Intent intent, IApiCallback iApiCallback) {
        Object[] objArr = {Integer.valueOf(i), intent, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43be5816f41dfa340f9e809639b1cdc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43be5816f41dfa340f9e809639b1cdc0");
        } else if (i != -1) {
            iApiCallback.onFail(null);
        } else if (intent == null) {
            iApiCallback.onFail(null);
        } else {
            iApiCallback.onSuccess(null);
        }
    }

    @Override // com.meituan.mmp.lib.api.share.BaseShareApi
    public final void a(ApiFunction<?, ?> apiFunction, BaseShareApi.b bVar, IApiCallback iApiCallback) {
        Object[] objArr = {apiFunction, bVar, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "541b28a3ca89c67348ef14371eb2539c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "541b28a3ca89c67348ef14371eb2539c");
        } else {
            a(apiFunction, bVar, new C1027a(iApiCallback));
        }
    }

    @Override // com.meituan.mmp.lib.api.share.BaseShareApi
    public final void b(ApiFunction<?, ?> apiFunction, BaseShareApi.b bVar, IApiCallback iApiCallback) {
        Object[] objArr = {apiFunction, bVar, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5acd9c2e7bee5e47489c62cc256c297", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5acd9c2e7bee5e47489c62cc256c297");
        } else {
            a(apiFunction, bVar, new C1027a(iApiCallback));
        }
    }

    @Override // com.meituan.mmp.lib.api.share.BaseShareApi
    public final void a(ApiFunction<?, ?> apiFunction, BaseShareApi.c cVar, IApiCallback iApiCallback) {
        Object[] objArr = {apiFunction, cVar, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98749798967bff2c3a3f30b7d7b111ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98749798967bff2c3a3f30b7d7b111ea");
            return;
        }
        final C1027a c1027a = new C1027a(iApiCallback);
        Object[] objArr2 = {apiFunction, cVar, c1027a};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e9f0b8f798134230d274af34bac44344", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e9f0b8f798134230d274af34bac44344");
            return;
        }
        final Activity a = a(apiFunction);
        if (a == null) {
            return;
        }
        final ShareTip a2 = a(cVar);
        a2.setMiniprogramType(cVar.i);
        a2.setWeixinUrl(cVar.h);
        a2.setMiniProgramId(cVar.g);
        a2.setMiniprogramWithShareTicket(cVar.k);
        if (cVar.j == null && !TextUtils.isEmpty(cVar.d)) {
            b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a3.b = a;
            a3.c = cVar.d;
            a3.a(new b.a() { // from class: com.sankuai.waimai.mmp.modules.share.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr3 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d1e0a4e66dfecebe54ea9a033aad08de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d1e0a4e66dfecebe54ea9a033aad08de");
                        return;
                    }
                    ShareTip.this.setIcon("");
                    com.sankuai.waimai.share.b.a(a, ShareTip.this, bitmap, c1027a);
                }
            });
            return;
        }
        com.sankuai.waimai.share.b.a(a, a2, cVar.j, c1027a);
    }

    @Override // com.meituan.mmp.lib.api.share.BaseShareApi
    public final void a(ApiFunction<?, ?> apiFunction, BaseShareApi.e eVar, IApiCallback iApiCallback) {
        Object[] objArr = {apiFunction, eVar, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bef39c2217b438f93b2ea11142e0526", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bef39c2217b438f93b2ea11142e0526");
        } else {
            a(apiFunction, eVar, new C1027a(iApiCallback));
        }
    }

    @Override // com.meituan.mmp.lib.api.share.BaseShareApi
    public final void b(ApiFunction<?, ?> apiFunction, BaseShareApi.e eVar, IApiCallback iApiCallback) {
        Object[] objArr = {apiFunction, eVar, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37b4bde000ecc321273d6c12d9bd3f05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37b4bde000ecc321273d6c12d9bd3f05");
        } else {
            a(apiFunction, eVar, new C1027a(iApiCallback));
        }
    }

    @Override // com.meituan.mmp.lib.api.share.BaseShareApi
    public final void a(ApiFunction<?, ?> apiFunction, BaseShareApi.d dVar, IApiCallback iApiCallback) {
        Object[] objArr = {apiFunction, dVar, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09ffa07718923aea4469dc3b6f16e8bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09ffa07718923aea4469dc3b6f16e8bf");
        } else {
            iApiCallback.onFail(AbsApi.codeJson(-1, "not support"));
        }
    }

    private static Activity a(ApiFunction<?, ?> apiFunction) {
        Object[] objArr = {apiFunction};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "882a3722ed870600e643c00fff5a183e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "882a3722ed870600e643c00fff5a183e");
        }
        if (apiFunction == null) {
            return null;
        }
        return apiFunction.getActivity();
    }

    private static void a(@NonNull ApiFunction apiFunction, @NonNull BaseShareApi.b bVar, C1027a c1027a) {
        Object[] objArr = {apiFunction, bVar, c1027a};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb41c64696c32f514201f951e316acb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb41c64696c32f514201f951e316acb2");
            return;
        }
        Activity a = a((ApiFunction<?, ?>) apiFunction);
        if (a == null) {
            return;
        }
        ShareTip a2 = a(bVar);
        a2.setMiniProgramId(bVar.g);
        a2.setWeixinUrl(bVar.h);
        a2.setMiniprogramType(bVar.j);
        com.sankuai.waimai.share.b.a(a, a2, (com.sankuai.waimai.foundation.core.service.share.listener.a) null, c1027a, (Bundle) null);
    }

    private static void a(@NonNull ApiFunction apiFunction, @NonNull BaseShareApi.e eVar, C1027a c1027a) {
        Object[] objArr = {apiFunction, eVar, c1027a};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cae1b18eca8df8a759cbeab42ebc494c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cae1b18eca8df8a759cbeab42ebc494c");
            return;
        }
        Activity a = a((ApiFunction<?, ?>) apiFunction);
        if (a == null || eVar == null || TextUtils.isEmpty(eVar.a)) {
            return;
        }
        com.sankuai.waimai.share.b.a(a, eVar.b, eVar.a, 1, 1, c1027a, "c_group_fv80awch");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mmp.modules.share.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1027a implements com.sankuai.waimai.foundation.core.service.share.listener.b {
        public static ChangeQuickRedirect a;
        private final IApiCallback b;

        private C1027a(IApiCallback iApiCallback) {
            Object[] objArr = {iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0120504eb7d0d5c52e2de4848806118", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0120504eb7d0d5c52e2de4848806118");
            } else {
                this.b = iApiCallback;
            }
        }

        @Override // com.sankuai.waimai.foundation.core.service.share.listener.b
        public final void a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dec4954925a07f023bf462bc487e8bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dec4954925a07f023bf462bc487e8bd");
            } else if (this.b == null) {
            } else {
                if (i2 == 1) {
                    this.b.onSuccess(null);
                } else if (i2 == 2) {
                    this.b.onFail(AbsApi.codeJson(-1, "failed"));
                }
            }
        }
    }

    private static ShareTip a(@NonNull BaseShareApi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2848f1756ebe6373d1e681c30347457", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShareTip) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2848f1756ebe6373d1e681c30347457");
        }
        ShareTip shareTip = new ShareTip();
        shareTip.setCid(aVar.e);
        shareTip.setTitle(aVar.b);
        shareTip.setContent(aVar.c);
        if (!TextUtils.isEmpty(aVar.d) && !aVar.d.startsWith("wdfile://")) {
            shareTip.setIcon(aVar.d);
        }
        shareTip.setUrl(aVar.a);
        shareTip.channels = new ArrayList();
        shareTip.channels.add(2);
        shareTip.channels.add(1);
        shareTip.channels.add(4);
        return shareTip;
    }
}
