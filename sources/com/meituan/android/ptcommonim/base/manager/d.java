package com.meituan.android.ptcommonim.base.manager;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.ptcommonim.base.bean.PTIMCommonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(List<IMMessage> list, boolean z, PTIMCommonBean.UserType userType) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), userType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84670d2b4d00b916d39558689b459573", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84670d2b4d00b916d39558689b459573");
        } else if (userType == PTIMCommonBean.UserType.TYPE_C && !CollectionUtils.isEmpty(list)) {
            for (IMMessage iMMessage : list) {
                Object[] objArr2 = {iMMessage};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "27f21881f7a699e4e74b9a23a5367034", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "27f21881f7a699e4e74b9a23a5367034");
                } else if (iMMessage instanceof EventMessage) {
                    String valueOf = String.valueOf(iMMessage.getFromUid());
                    String valueOf2 = String.valueOf(IMClient.a().k());
                    EventMessage eventMessage = (EventMessage) iMMessage;
                    if (eventMessage.getCategory() == 3 && eventMessage.getMsgStatus() == 15 && !TextUtils.equals(valueOf2, valueOf)) {
                        JsonObject jsonObject = JsonHelper.toJsonObject(eventMessage.getExtension());
                        String string = JsonHelper.getString(jsonObject, "cancelOperator");
                        String string2 = JsonHelper.getString(jsonObject, AgainManager.EXTRA_POI_NAME);
                        String str = TextUtils.isEmpty(string2) ? "对方" : string2 + "撤回了一条消息";
                        if (TextUtils.equals(string, "USER") && !TextUtils.equals(str, eventMessage.getText())) {
                            eventMessage.setText(str);
                            IMClient.a().a((IMMessage) eventMessage, false, (IMClient.g<IMMessage>) null);
                        }
                    }
                }
            }
        }
    }
}
