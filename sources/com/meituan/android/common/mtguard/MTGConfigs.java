package com.meituan.android.common.mtguard;

import android.content.Context;
import com.meituan.android.common.dfingerprint.DFPInfoProvider;
import com.meituan.android.common.dfingerprint.DFPManager;
import com.meituan.android.common.mtguard.collect.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public final class MTGConfigs {
    public static final int a = 30;
    public static final String b = "mtguard";
    public static final String c = "mtgsig";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static final String d = "mtgver";
    public static final String e = "v5";

    /* loaded from: classes2.dex */
    public static class MTGInterfaces {
        public static ChangeQuickRedirect changeQuickRedirect;
        private DFPManager defaultDfpManager;
        private DFPInfoProvider dfpInfoProvider;

        public MTGInterfaces(final Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f17a06d2375f8ebd81d813336ba0b3b5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f17a06d2375f8ebd81d813336ba0b3b5");
                return;
            }
            this.dfpInfoProvider = new DFPInfoProvider() { // from class: com.meituan.android.common.mtguard.MTGConfigs.MTGInterfaces.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
                public final String business() {
                    return "bus";
                }

                @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
                public final String dpid() {
                    return null;
                }

                @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
                public final String getChannel() {
                    return null;
                }

                @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
                public final String getMagicNumber() {
                    return null;
                }

                @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
                public final String getPushToken() {
                    return null;
                }

                @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
                public final String getUUID() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "86cb1ddf9945d6be140f41d0e07c0def", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "86cb1ddf9945d6be140f41d0e07c0def") : p.a(context).a();
                }

                @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
                public final String optional() {
                    return null;
                }

                @Override // com.meituan.android.common.dfingerprint.DFPInfoProvider
                public final String source() {
                    return MTGConfigs.b;
                }
            };
            this.defaultDfpManager = new DFPManager(context);
        }

        public DFPManager getDefaultDfpManager() {
            return this.defaultDfpManager;
        }

        public DFPInfoProvider getDfpInfoProvider() {
            return this.dfpInfoProvider;
        }
    }
}
