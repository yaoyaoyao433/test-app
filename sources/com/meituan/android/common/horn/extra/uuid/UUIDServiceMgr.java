package com.meituan.android.common.horn.extra.uuid;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UUIDServiceMgr {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IUUIDService uuidService;

    public UUIDServiceMgr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bf5ce852c8d519da9537f083ff2eda8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bf5ce852c8d519da9537f083ff2eda8");
        } else {
            this.uuidService = new UUIDServiceImpl();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class UUIDServiceHolder {
        private static final UUIDServiceMgr INSTANCE = new UUIDServiceMgr();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static UUIDServiceMgr get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f47fead6034f55549f177d78ff54244c", 6917529027641081856L) ? (UUIDServiceMgr) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f47fead6034f55549f177d78ff54244c") : UUIDServiceHolder.INSTANCE;
    }

    public IUUIDService service() {
        return this.uuidService;
    }
}
