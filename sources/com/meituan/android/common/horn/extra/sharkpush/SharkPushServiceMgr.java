package com.meituan.android.common.horn.extra.sharkpush;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SharkPushServiceMgr {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ISharkPushService sharkPushService;

    public SharkPushServiceMgr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3157a178ae932f1b688dbbdd9de458c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3157a178ae932f1b688dbbdd9de458c4");
        } else {
            this.sharkPushService = new SharkPushServiceImpl();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class SharkPushServiceHolder {
        private static final SharkPushServiceMgr INSTANCE = new SharkPushServiceMgr();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static SharkPushServiceMgr get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5ea6355e74eb335d4acb9250a0c32b05", 6917529027641081856L) ? (SharkPushServiceMgr) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5ea6355e74eb335d4acb9250a0c32b05") : SharkPushServiceHolder.INSTANCE;
    }

    public ISharkPushService service() {
        return this.sharkPushService;
    }
}
