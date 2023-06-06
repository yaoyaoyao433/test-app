package com.sankuai.waimai.business.im.api.msgcenter;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.msgcenter.model.UnReadMsgEntity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements IMsgCenterManager {
    public static ChangeQuickRedirect a;
    private static final a c = new a();
    private static final C0729a d = new C0729a();
    private IMsgCenterManager b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(boolean z, boolean z2, int i);
    }

    public static a a() {
        return c;
    }

    private IMsgCenterManager b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae721252b23aa3f985e1f90272a1d8f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (IMsgCenterManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae721252b23aa3f985e1f90272a1d8f2");
        }
        if (this.b != null) {
            return this.b;
        }
        this.b = (IMsgCenterManager) com.sankuai.waimai.router.a.a(IMsgCenterManager.class, "IMsgCenterManager");
        if (this.b == null) {
            return d;
        }
        return this.b;
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public final boolean showMsgCenterDot() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb9bf4a1c9aeb97e6c4836a321c263b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb9bf4a1c9aeb97e6c4836a321c263b")).booleanValue() : b().showMsgCenterDot();
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public final boolean isMsgCenter(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b838d19f899bc64dea2aafc526b918b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b838d19f899bc64dea2aafc526b918b")).booleanValue() : b().isMsgCenter(activity);
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public final void clickMsgCenter(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2abc3fa0944d1423f5401288c31400a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2abc3fa0944d1423f5401288c31400a");
        } else {
            b().clickMsgCenter(activity);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public final void registerMsgCenterUnreadChangeListener(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7930dd46ebadddd186d01603cd58a2ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7930dd46ebadddd186d01603cd58a2ec");
        } else {
            b().registerMsgCenterUnreadChangeListener(bVar);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public final void unregisterMsgCenterUnreadChangeListener(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f07a2252e66879ed1ab773f931c8f8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f07a2252e66879ed1ab773f931c8f8f");
        } else {
            b().unregisterMsgCenterUnreadChangeListener(bVar);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public final void refreshMsgCenterUnReadCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "221101d5bb4b66251b1530c0c0d1e5ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "221101d5bb4b66251b1530c0c0d1e5ba");
        } else {
            b().refreshMsgCenterUnReadCount();
        }
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public final void refreshMsgCenterSysCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8aca5e6cd93c21765af0e0f231a5692", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8aca5e6cd93c21765af0e0f231a5692");
        } else {
            b().refreshMsgCenterSysCount(i);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public final void refreshMsgCenterImCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5714bf46005650b9153c9a7c938a9e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5714bf46005650b9153c9a7c938a9e9");
        } else {
            b().refreshMsgCenterImCount(i);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public final UnReadMsgEntity getUnReadMsgInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e56f82a0d12c463961d39e20954f5d4", RobustBitConfig.DEFAULT_VALUE) ? (UnReadMsgEntity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e56f82a0d12c463961d39e20954f5d4") : b().getUnReadMsgInfo();
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
    public final int getUnReadImCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "680c2373baa0683949b5ea46c3e03670", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "680c2373baa0683949b5ea46c3e03670")).intValue() : b().getUnReadImCount();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.im.api.msgcenter.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0729a implements IMsgCenterManager {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
        public final void clickMsgCenter(Activity activity) {
        }

        @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
        public final int getUnReadImCount() {
            return 0;
        }

        @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
        public final boolean isMsgCenter(Activity activity) {
            return false;
        }

        @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
        public final void refreshMsgCenterImCount(int i) {
        }

        @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
        public final void refreshMsgCenterSysCount(int i) {
        }

        @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
        public final void refreshMsgCenterUnReadCount() {
        }

        @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
        public final void registerMsgCenterUnreadChangeListener(b bVar) {
        }

        @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
        public final boolean showMsgCenterDot() {
            return false;
        }

        @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
        public final void unregisterMsgCenterUnreadChangeListener(b bVar) {
        }

        public C0729a() {
        }

        @Override // com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager
        public final UnReadMsgEntity getUnReadMsgInfo() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5b1c6cc3a656c9b395424312e7efaef", RobustBitConfig.DEFAULT_VALUE) ? (UnReadMsgEntity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5b1c6cc3a656c9b395424312e7efaef") : new UnReadMsgEntity();
        }
    }
}
