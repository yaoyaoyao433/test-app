package com.sankuai.waimai.store.im.group.manager;

import android.content.Context;
import com.meituan.android.cipstorage.ag;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.g;
import com.sankuai.waimai.store.im.group.model.UserGroupNoticeShowData;
import com.sankuai.waimai.store.util.ab;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.im.group.model.a b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static final c a = new c();
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4303b6ec5cdc3e6ed1febf7fc31f02d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4303b6ec5cdc3e6ed1febf7fc31f02d6");
        } else {
            this.b = new com.sankuai.waimai.store.im.group.model.a();
        }
    }

    public final void a(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cea4dd05783cff53fbdf960d59045a58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cea4dd05783cff53fbdf960d59045a58");
            return;
        }
        UserGroupNoticeShowData userGroupNoticeShowData = new UserGroupNoticeShowData();
        userGroupNoticeShowData.mShowDay = g.b();
        userGroupNoticeShowData.isClose = z;
        ab b = ab.b();
        b.a(context, "key_show_user_group_notice_" + str, (String) userGroupNoticeShowData, (ag<String>) this.b);
    }
}
