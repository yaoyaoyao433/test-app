package com.sankuai.waimai.store.im.monitor;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.monitor.IMessageVerificationService;
import com.sankuai.waimai.imbase.monitor.c;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.xm.im.message.bean.IMMessage;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMInquiryMessageVerificationImpl implements IMessageVerificationService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.imbase.monitor.IMessageVerificationService
    public String getSnifferBizName() {
        return DefaultHeaderService.KEY_STORE;
    }

    @Override // com.sankuai.waimai.imbase.monitor.IMessageVerificationService
    @NonNull
    public c doVerify(@NonNull IMMessage iMMessage, boolean z, int i) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ebb3f5c36e50cdb3ae0dc45d6b839ee", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ebb3f5c36e50cdb3ae0dc45d6b839ee") : c.b();
    }
}
