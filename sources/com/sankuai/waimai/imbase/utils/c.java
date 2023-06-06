package com.sankuai.waimai.imbase.utils;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.Message;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static Uri.Builder a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b011fd15ff09409cedd03668c59d24b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri.Builder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b011fd15ff09409cedd03668c59d24b");
        }
        Uri.Builder buildUpon = Uri.parse(com.sankuai.waimai.imbase.constant.b.a + "://" + com.sankuai.waimai.imbase.constant.b.b + "/chat").buildUpon();
        buildUpon.appendPath(String.valueOf((int) iMMessage.getChannel()));
        buildUpon.appendQueryParameter("chatID", String.valueOf(iMMessage.getChatId()));
        buildUpon.appendQueryParameter(Message.PEER_UID, String.valueOf(iMMessage.getPeerUid()));
        buildUpon.appendQueryParameter("category", String.valueOf(iMMessage.getCategory()));
        buildUpon.appendQueryParameter(Message.PEER_APPID, String.valueOf((int) iMMessage.getPeerAppId()));
        return buildUpon;
    }
}
