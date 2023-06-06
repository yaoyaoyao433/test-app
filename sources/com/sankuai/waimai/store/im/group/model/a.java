package com.sankuai.waimai.store.im.group.model;

import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.ag;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements ag<UserGroupNoticeShowData> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.cipstorage.ag
    public final /* synthetic */ UserGroupNoticeShowData deserializeFromString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "922f707ea36fe0b5e2b0b213393505d3", RobustBitConfig.DEFAULT_VALUE) ? (UserGroupNoticeShowData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "922f707ea36fe0b5e2b0b213393505d3") : (UserGroupNoticeShowData) i.a(str, new TypeToken<UserGroupNoticeShowData>() { // from class: com.sankuai.waimai.store.im.group.model.a.1
        }.getType());
    }

    @Override // com.meituan.android.cipstorage.ag
    public final /* synthetic */ String serializeAsString(UserGroupNoticeShowData userGroupNoticeShowData) {
        UserGroupNoticeShowData userGroupNoticeShowData2 = userGroupNoticeShowData;
        Object[] objArr = {userGroupNoticeShowData2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8551d2e3b0de983cbcc90b31365b02b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8551d2e3b0de983cbcc90b31365b02b") : i.a(userGroupNoticeShowData2);
    }
}
