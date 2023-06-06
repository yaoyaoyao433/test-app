package com.sankuai.waimai.store.im.poi;

import android.text.Html;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.im.api.IGeneralMsgDigest;
import com.sankuai.waimai.business.im.prepare.h;
import com.sankuai.waimai.store.im.poi.model.ImSGTip;
import com.sankuai.waimai.store.im.poi.model.SGIMRobotReplyData;
import com.sankuai.waimai.store.im.util.b;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.GeneralMessage;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGIMGeneralMsgDigest implements IGeneralMsgDigest {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.business.im.api.IGeneralMsgDigest
    public String getBrief(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "667e519840e80f65c1eb08c3fcda529e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "667e519840e80f65c1eb08c3fcda529e");
        }
        int a = h.a(generalMessage);
        if (a == 7) {
            ImSGTip convert = ImSGTip.convert(generalMessage);
            if (convert == null || TextUtils.isEmpty(convert.tipContent)) {
                return "";
            }
            return "[" + convert.tipContent + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
        } else if (a != 107) {
            switch (a) {
                case 101:
                    return "[您发送了一个催单]";
                case 102:
                    return generalMessage.getFromUid() == IMClient.a().k() ? "[您发送了一个订单]" : "[您收到了一个订单]";
                case 103:
                    return "[商家优惠券列表]";
                case 104:
                    return "您收到一张优惠券";
                default:
                    switch (a) {
                        case 125:
                        case 128:
                            return "亲，为您推荐以下商品";
                        case 126:
                        case 129:
                            return "亲，送您一些优惠券";
                        case 127:
                            SGIMRobotReplyData sGIMRobotReplyData = (SGIMRobotReplyData) b.a(generalMessage, SGIMRobotReplyData.class);
                            if (sGIMRobotReplyData == null || t.a(sGIMRobotReplyData.content)) {
                                return "";
                            }
                            try {
                                String obj = Html.fromHtml(sGIMRobotReplyData.content).toString();
                                return t.a(obj) ? "" : obj;
                            } catch (Exception unused) {
                                return "";
                            }
                        default:
                            return "";
                    }
            }
        } else {
            return "邀您加入粉丝群";
        }
    }
}
