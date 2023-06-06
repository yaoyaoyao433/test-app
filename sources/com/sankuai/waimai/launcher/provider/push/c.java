package com.sankuai.waimai.launcher.provider.push;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.base.push.medusa.d;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.meituan.uuid.UUIDListener;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static c b;
    public com.dianping.base.push.medusa.b c;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends d implements com.sankuai.waimai.foundation.location.v2.listener.c {
        public static ChangeQuickRedirect c;
        final Object d;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c767de6b56e289ec24f6e53f5aa058bd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c767de6b56e289ec24f6e53f5aa058bd");
                return;
            }
            this.d = new Object();
            if (TextUtils.isEmpty(GetUUID.getInstance().loadUUIDFromSelfCache(com.meituan.android.singleton.b.a))) {
                GetUUID.getInstance().registerUUIDListener(new UUIDListener() { // from class: com.sankuai.waimai.launcher.provider.push.c.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.uuid.UUIDListener
                    public final void notify(Context context, String str) {
                        Object[] objArr2 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ee1cad45297382c8e500324209db6d4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ee1cad45297382c8e500324209db6d4");
                        } else if (TextUtils.isEmpty(str)) {
                        } else {
                            GetUUID.getInstance().unregisterUUIDListener(this);
                            synchronized (b.this.d) {
                                b.this.d.notifyAll();
                            }
                        }
                    }
                });
            }
        }

        @Override // com.dianping.base.push.medusa.d
        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a927735df83d4d309154d0624c9df30", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a927735df83d4d309154d0624c9df30") : g.a().n().getCityCode();
        }

        @Override // com.dianping.base.push.medusa.d
        public final String c() {
            String loadUUIDFromSelfCache;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76577d82b28661326c8b5f12dc5ed0e4", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76577d82b28661326c8b5f12dc5ed0e4");
            }
            String loadUUIDFromSelfCache2 = GetUUID.getInstance().loadUUIDFromSelfCache(com.meituan.android.singleton.b.a);
            if (TextUtils.isEmpty(loadUUIDFromSelfCache2)) {
                synchronized (this.d) {
                    try {
                        loadUUIDFromSelfCache = GetUUID.getInstance().loadUUIDFromSelfCache(com.meituan.android.singleton.b.a);
                    } catch (InterruptedException unused) {
                    }
                    if (TextUtils.isEmpty(loadUUIDFromSelfCache)) {
                        Object obj = this.d;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = d.a;
                        obj.wait(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a50b262eaf1ad072e54c6b00446bc3a", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a50b262eaf1ad072e54c6b00446bc3a")).longValue() : 120000L);
                        return GetUUID.getInstance().loadUUIDFromSelfCache(com.meituan.android.singleton.b.a);
                    }
                    return loadUUIDFromSelfCache;
                }
            }
            return loadUUIDFromSelfCache2;
        }

        @Override // com.dianping.base.push.medusa.d
        public final void e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef5e319aa733f6b29320b32e8ee177bd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef5e319aa733f6b29320b32e8ee177bd");
            } else {
                com.sankuai.waimai.platform.domain.manager.user.a.i().a(new com.sankuai.waimai.foundation.core.service.user.b() { // from class: com.sankuai.waimai.launcher.provider.push.c.b.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.foundation.core.service.user.b
                    public final void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
                    }

                    @Override // com.sankuai.waimai.foundation.core.service.user.b
                    public final void onChanged(b.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "026796642aa780f19da50d3dc0eb2376", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "026796642aa780f19da50d3dc0eb2376");
                        } else {
                            b.this.g();
                        }
                    }
                });
            }
        }

        @Override // com.dianping.base.push.medusa.d
        public final void f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61fad2c34da50cec321383f555c7a267", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61fad2c34da50cec321383f555c7a267");
            } else {
                GetUUID.getInstance().registerUUIDListener(new UUIDListener() { // from class: com.sankuai.waimai.launcher.provider.push.c.b.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.uuid.UUIDListener
                    public final void notify(Context context, String str) {
                        Object[] objArr2 = {context, str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "259c228c84253c637346486c095bd095", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "259c228c84253c637346486c095bd095");
                        } else if (TextUtils.isEmpty(str)) {
                        } else {
                            b.this.g();
                        }
                    }
                });
            }
        }

        @Override // com.dianping.base.push.medusa.d
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4b6d489d78a1064b79249d8a7673073", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4b6d489d78a1064b79249d8a7673073");
            } else {
                g.a().a(this, "PushMappingHelper");
            }
        }

        @Override // com.sankuai.waimai.foundation.location.v2.listener.c
        public final void onPoiChange(@Nullable WmAddress wmAddress, boolean z) {
            Object[] objArr = {wmAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7225642fcfd2f7a011fdcf6a99722efc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7225642fcfd2f7a011fdcf6a99722efc");
            } else if (wmAddress == null || wmAddress.getMeitaunCity() == null) {
            } else {
                g();
            }
        }

        @Override // com.dianping.base.push.medusa.d
        public final String b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "368ea9297933d54eecd0cb679ca0142d", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "368ea9297933d54eecd0cb679ca0142d");
            }
            UserCenter userCenter = UserCenter.getInstance(com.meituan.android.singleton.b.a);
            return (userCenter == null || !userCenter.isLogin()) ? "-1" : String.valueOf(userCenter.getUser().id);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends Lifecycle implements com.sankuai.waimai.foundation.core.lifecycle.a {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.foundation.core.init.a
        public final String tag() {
            return "MedusaLifeCycle";
        }

        @Override // com.sankuai.waimai.foundation.core.lifecycle.a
        public final void onAppToForeground(@Nullable Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0906feadc3079d58c869d0a690a857d7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0906feadc3079d58c869d0a690a857d7");
                return;
            }
            com.dianping.base.push.medusa.c a2 = com.dianping.base.push.medusa.c.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.base.push.medusa.c.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "638071e09275476fc171e24b0f453e76", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "638071e09275476fc171e24b0f453e76");
                return;
            }
            for (com.dianping.base.push.medusa.a aVar : a2.b) {
                aVar.b();
            }
        }

        @Override // com.sankuai.waimai.foundation.core.lifecycle.a
        public final void onAppToBackground(@Nullable Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35188435b7f8ab19e870821de69abe0a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35188435b7f8ab19e870821de69abe0a");
                return;
            }
            com.dianping.base.push.medusa.c a2 = com.dianping.base.push.medusa.c.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.base.push.medusa.c.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "7b82d2ca6bf91dc324df6e0b296a6c9a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "7b82d2ca6bf91dc324df6e0b296a6c9a");
                return;
            }
            for (com.dianping.base.push.medusa.a aVar : a2.b) {
                aVar.a();
            }
        }
    }
}
