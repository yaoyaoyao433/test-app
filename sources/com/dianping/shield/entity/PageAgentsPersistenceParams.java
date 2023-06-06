package com.dianping.shield.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface PageAgentsPersistenceParams {
    boolean isReserveUnUsedModule();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private boolean reserveUnUsedModule;

        public final Builder reserveUnUsedModule(boolean z) {
            this.reserveUnUsedModule = z;
            return this;
        }

        public final PageAgentsPersistenceParams build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "526fece386e628c9711ce0fd5841c412", RobustBitConfig.DEFAULT_VALUE) ? (PageAgentsPersistenceParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "526fece386e628c9711ce0fd5841c412") : new PageAgentsPersistenceParams() { // from class: com.dianping.shield.entity.PageAgentsPersistenceParams.Builder.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.shield.entity.PageAgentsPersistenceParams
                public boolean isReserveUnUsedModule() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6c8d25ff51c711a58afaba4705f8a019", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6c8d25ff51c711a58afaba4705f8a019")).booleanValue() : Builder.this.reserveUnUsedModule;
                }
            };
        }
    }
}
