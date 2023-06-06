package com.sankuai.waimai.touchmatrix.rebuild.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.monitor.j;
import io.agora.rtc.internal.RtcEngineEvent;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static boolean a(com.sankuai.waimai.touchmatrix.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08ebead4417239a0f176610e52c61168", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08ebead4417239a0f176610e52c61168")).booleanValue();
        }
        if (aVar == null) {
            c.e("DataUtils 校验失败 msg == null", new Object[0]);
            return false;
        } else if (aVar.k == null) {
            c.e("DataUtils 校验失败 msg.showInfo == null", new Object[0]);
            return false;
        } else if (TextUtils.isEmpty(aVar.k.bizId)) {
            c.e("DataUtils 校验失败 msg.showInfo.biz == null", new Object[0]);
            HashMap hashMap = new HashMap();
            hashMap.put("msg_id", aVar.c);
            j.a().a(RtcEngineEvent.EvtType.EVT_LEAVE_CHANNEL, "wmtm_msg_biz_invalid", "触达消息中的biz无效时不符合展示条件", hashMap);
            return false;
        } else if (aVar.k.businessData == null) {
            c.e("DataUtils 校验失败 showInfo.businessData == null", new Object[0]);
            return false;
        } else if (com.sankuai.waimai.foundation.utils.b.b(aVar.k.businessData.modules)) {
            c.e("DataUtils 校验失败 msg.showInfo.businessData.modules 为空", new Object[0]);
            return false;
        } else {
            return true;
        }
    }
}
