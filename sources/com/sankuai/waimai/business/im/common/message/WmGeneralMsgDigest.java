package com.sankuai.waimai.business.im.common.message;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.IGeneralMsgDigest;
import com.sankuai.waimai.business.im.model.TipMessageData;
import com.sankuai.waimai.business.im.model.p;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmGeneralMsgDigest implements IGeneralMsgDigest {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.business.im.api.IGeneralMsgDigest
    public String getBrief(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e523b19c963d4cfaec6beb5dda74f25", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e523b19c963d4cfaec6beb5dda74f25");
        }
        int a = com.sankuai.waimai.business.im.prepare.h.a(generalMessage);
        if (a == 0) {
            return generalMessage.getFromUid() == IMClient.a().k() ? "[您发送了一个商品]" : "[您收到了一个商品]";
        } else if (a != 5) {
            if (a == 401) {
                return generalMessage.getChannel() == 1025 ? "[订单评价]" : "";
            } else if (a != 551) {
                if (a != 1001) {
                    if (a != 2020) {
                        if (a != 4001) {
                            try {
                                switch (a) {
                                    case 2:
                                        if (generalMessage.getData() != null) {
                                            TipMessageData fromJson = TipMessageData.fromJson(new JSONObject(new String(generalMessage.getData(), "utf-8")).optJSONObject("data"));
                                            return "[" + fromJson.title + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + fromJson.content;
                                        }
                                        return "";
                                    case 3:
                                        return "[收到一条消息，App版本过低无法展示，请升级后查看]";
                                    default:
                                        switch (a) {
                                            case 301:
                                                return "[您收到了一个地址信息卡片]";
                                            case 302:
                                                return "[您收到了一个营业时间信息卡片]";
                                            default:
                                                switch (a) {
                                                    case 2001:
                                                        return String.format("【%s】邀您加入福利粉丝群，群内每日专属优惠，问题咨询优先服务，更多特权等你解锁", p.a(new JSONObject(new String(generalMessage.getData(), "utf-8")).optJSONObject("data")).d);
                                                    case 2002:
                                                        return "您有一笔心意红包待领取";
                                                    case 2003:
                                                        return "红包还有1小时过期，请尽快领取";
                                                    default:
                                                        return "";
                                                }
                                        }
                                }
                            } catch (Exception unused) {
                                return "";
                            }
                        }
                        return "您是不是想要修改收货位置？";
                    }
                    return "您成功领取了优惠券 去使用";
                }
                return getRiderRequestLocationMsgBrief(generalMessage);
            } else {
                return "[您收到了一个商品]";
            }
        } else {
            return "[位置请求]";
        }
    }

    private String getRiderRequestLocationMsgBrief(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e985b37d74971f46ceeb167cede9c004", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e985b37d74971f46ceeb167cede9c004");
        }
        try {
            byte[] data = generalMessage.getData();
            return data != null ? new JSONObject(new String(data, "utf-8")).optJSONObject("data").optString("message") : "";
        } catch (Exception unused) {
            return "";
        }
    }
}
