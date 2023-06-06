package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CancelMessage extends EventMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long mActionSts;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class Type {
        public static final int ADMIN = 2;
        public static final int FORCE = 1;
        public static final int NORMAL = 0;
        public static ChangeQuickRedirect changeQuickRedirect;

        public Type() {
        }
    }

    public long getActionSts() {
        return this.mActionSts;
    }

    public void setActionSts(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "211cc4a4cf5bce679f3b90e408ff3497", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "211cc4a4cf5bce679f3b90e408ff3497");
        } else {
            this.mActionSts = j;
        }
    }

    public int getRecallType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d4070782ad2e56e3fc2c90bf238d601", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d4070782ad2e56e3fc2c90bf238d601")).intValue();
        }
        if (getAdminUid() > 0) {
            return 2;
        }
        return this instanceof ForceCancelMessage ? 1 : 0;
    }

    @Override // com.sankuai.xm.im.message.bean.EventMessage, com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6e5aa23d933eef06a7182b48c7837a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6e5aa23d933eef06a7182b48c7837a5");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof CancelMessage) {
            ((CancelMessage) iMMessage).mActionSts = this.mActionSts;
        }
    }
}
