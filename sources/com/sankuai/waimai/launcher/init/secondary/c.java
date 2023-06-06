package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.text.TextUtils;
import com.meituan.android.common.badge.BadgeEngine;
import com.meituan.android.common.badge.BadgeProducer;
import com.meituan.android.common.badge.CustomizedProvider;
import com.meituan.android.common.badge.Strategy;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.common.unionid.oneid.cache.IOneIdCallback;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.launcher.model.AppInfo;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "BadgeInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9498c3bb02c683ac4b83122fca94f3cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9498c3bb02c683ac4b83122fca94f3cd");
        } else {
            BadgeEngine.register(application, new BadgeProducer() { // from class: com.sankuai.waimai.launcher.init.secondary.c.1
                public static ChangeQuickRedirect a;
                private String d;

                @Override // com.meituan.android.common.badge.BadgeProducer
                public final List<CustomizedProvider> customizedInfo() {
                    return null;
                }

                @Override // com.meituan.android.common.badge.BadgeProducer
                public final String dpId() {
                    return null;
                }

                @Override // com.meituan.android.common.badge.BadgeProducer
                public final String dxId() {
                    return null;
                }

                @Override // com.meituan.android.common.badge.BadgeProducer
                public final String posSN() {
                    return null;
                }

                @Override // com.meituan.android.common.badge.BadgeProducer
                public final String uuId() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "418cdb7e3219ad07efaa37d22fa4c726", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "418cdb7e3219ad07efaa37d22fa4c726") : com.sankuai.waimai.platform.b.A().c();
                }

                @Override // com.meituan.android.common.badge.BadgeProducer
                public final String oneId() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d768708e03361524bb53efd8b772fd8d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d768708e03361524bb53efd8b772fd8d");
                    }
                    if (!TextUtils.isEmpty(this.d)) {
                        return this.d;
                    }
                    OneIdHandler oneIdHandler = OneIdHandler.getInstance(application);
                    oneIdHandler.init();
                    oneIdHandler.getOneId(new IOneIdCallback() { // from class: com.sankuai.waimai.launcher.init.secondary.c.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.common.unionid.oneid.cache.IOneIdCallback
                        public final void call(String str) {
                            Object[] objArr3 = {str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "803d1c88c57ae33bad17674e3e586909", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "803d1c88c57ae33bad17674e3e586909");
                            } else {
                                AnonymousClass1.this.d = str;
                            }
                        }
                    });
                    return this.d;
                }

                @Override // com.meituan.android.common.badge.BadgeProducer
                public final String userId() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fcc41b53116c124720b1faeed490f848", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fcc41b53116c124720b1faeed490f848") : com.sankuai.waimai.platform.b.A().B();
                }

                @Override // com.meituan.android.common.badge.BadgeProducer
                public final String cityId() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff7af16cc604ba4fde6101370d5ed27d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff7af16cc604ba4fde6101370d5ed27d") : String.valueOf(AppInfo.getCityID());
                }

                @Override // com.meituan.android.common.badge.BadgeProducer
                public final String accountPhone() {
                    User user;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1e7577af8086a08126c9eab3a2a4986", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1e7577af8086a08126c9eab3a2a4986");
                    }
                    UserCenter userCenter = UserCenter.getInstance(application);
                    return (userCenter == null || (user = userCenter.getUser()) == null || user.isBindedMobile != 1) ? "" : user.mobile;
                }

                @Override // com.meituan.android.common.badge.BadgeProducer
                public final String pushToken() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c2e08668227c62ec83316e475e14ecc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c2e08668227c62ec83316e475e14ecc") : com.sankuai.waimai.platform.b.A().D();
                }

                @Override // com.meituan.android.common.badge.BadgeProducer
                public final String channel() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60ffdb5e75fae5be6ccb467ddb812e88", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60ffdb5e75fae5be6ccb467ddb812e88") : com.sankuai.waimai.platform.b.A().d();
                }

                @Override // com.meituan.android.common.badge.BadgeProducer
                public final String appHash() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3955657bd9bae29fa358c9bc209c67af", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3955657bd9bae29fa358c9bc209c67af") : com.sankuai.waimai.platform.b.A().G();
                }

                @Override // com.meituan.android.common.badge.BadgeProducer
                public final String unionId() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e94d4128230eae21a61624b54145a8e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e94d4128230eae21a61624b54145a8e") : OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId();
                }
            }, new Strategy.Builder().logLevel(com.sankuai.meituan.takeoutnew.a.a ? 1 : 3).strictMode(com.sankuai.meituan.takeoutnew.a.a).build());
        }
    }
}
