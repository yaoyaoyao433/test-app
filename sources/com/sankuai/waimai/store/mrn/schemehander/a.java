package com.sankuai.waimai.store.mrn.schemehander;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.store.router.d;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends h {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull j jVar) {
        return true;
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03e168858d225c745a95dd1b617e8996", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03e168858d225c745a95dd1b617e8996");
            return;
        }
        String encodedPath = jVar.d.getEncodedPath();
        if (!TextUtils.isEmpty(encodedPath)) {
            String replace = encodedPath.replace("/chat/", "");
            if (!TextUtils.isEmpty(replace)) {
                HashMap hashMap = new HashMap();
                hashMap.put(RemoteMessageConst.Notification.CHANNEL_ID, replace);
                d.a(jVar.c, com.sankuai.waimai.store.router.a.a(com.sankuai.waimai.store.router.a.a(com.sankuai.waimai.store.router.a.a(false, "flashbuy-im-chat-common-page", "flashbuy-im-chat"), jVar.d.getEncodedQuery()), com.sankuai.waimai.store.router.a.a(hashMap)));
            }
        }
        gVar.a(200);
    }
}
