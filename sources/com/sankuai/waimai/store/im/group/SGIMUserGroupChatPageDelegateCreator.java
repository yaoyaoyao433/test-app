package com.sankuai.waimai.store.im.group;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.base.SGIMSessionFragment;
import com.sankuai.waimai.store.im.base.i.ISGIMChatPageDelegateCreator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMUserGroupChatPageDelegateCreator implements ISGIMChatPageDelegateCreator {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.store.im.base.i.ISGIMChatPageDelegateCreator
    public com.sankuai.waimai.store.im.base.i.a newInstance(SGIMSessionFragment sGIMSessionFragment, Bundle bundle) {
        Object[] objArr = {sGIMSessionFragment, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "561d6b226f61658ff7687eb3bd57ae63", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.im.base.i.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "561d6b226f61658ff7687eb3bd57ae63") : new SGIMUserGroupChatPageDelegateImpl(sGIMSessionFragment, bundle);
    }
}
