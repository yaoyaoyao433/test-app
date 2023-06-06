package com.sankuai.waimai.business.im.prepare;

import android.support.constraint.R;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.IGeneralMsgDigest;
import com.sankuai.waimai.business.im.model.TipMessageData;
import com.sankuai.waimai.imbase.constant.a;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.CustomEmotionMessage;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GPSMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.imui.common.processors.LinkProcessor;
import java.math.BigDecimal;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac9f0e05a7c43f2a4f0848fcfb34dd44", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac9f0e05a7c43f2a4f0848fcfb34dd44");
        }
        if (obj instanceof TextMessage) {
            return ((TextMessage) obj).getText();
        }
        if (obj instanceof EventMessage) {
            String text = ((EventMessage) obj).getText();
            com.sankuai.xm.imui.common.processors.d dVar = new com.sankuai.xm.imui.common.processors.d();
            LinkProcessor linkProcessor = new LinkProcessor();
            linkProcessor.c = false;
            dVar.a(linkProcessor);
            return dVar.a(text).toString();
        } else if (obj instanceof AudioMessage) {
            return com.meituan.android.singleton.b.a.getString(R.string.wm_im_voice);
        } else {
            if (obj instanceof ImageMessage) {
                return com.meituan.android.singleton.b.a.getString(R.string.wm_im_pic);
            }
            if (obj instanceof VideoMessage) {
                return com.meituan.android.singleton.b.a.getString(R.string.wm_im_video);
            }
            if (obj instanceof GPSMessage) {
                try {
                    if (new JSONObject(((GPSMessage) obj).getExtension()).optInt("new_modify_address") == 1) {
                        return "已成功修改收货位置";
                    }
                } catch (Exception unused) {
                }
                return com.meituan.android.singleton.b.a.getString(R.string.wm_im_gps);
            } else if (obj instanceof GeneralMessage) {
                GeneralMessage generalMessage = (GeneralMessage) obj;
                if (!TextUtils.isEmpty(generalMessage.getSummary())) {
                    return generalMessage.getSummary();
                }
                IGeneralMsgDigest iGeneralMsgDigest = (IGeneralMsgDigest) com.sankuai.waimai.router.a.a(IGeneralMsgDigest.class, ((int) generalMessage.getChannel()) + "/" + a(generalMessage));
                if (iGeneralMsgDigest != null) {
                    String brief = iGeneralMsgDigest.getBrief(generalMessage);
                    if (!TextUtils.isEmpty(brief)) {
                        return brief;
                    }
                }
                if (generalMessage.getData() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(generalMessage.getData(), "utf-8"));
                        int i = jSONObject.getInt("type");
                        if (i == 2) {
                            TipMessageData fromJson = TipMessageData.fromJson(jSONObject.optJSONObject("data"));
                            return "[" + fromJson.title + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + fromJson.content;
                        }
                        if (i != 561 && i != 562) {
                            if (i == 601) {
                                return a(jSONObject.optJSONObject("data"));
                            }
                        }
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ee15dcf65b14df62be030c2db7a2cff9", RobustBitConfig.DEFAULT_VALUE)) {
                            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ee15dcf65b14df62be030c2db7a2cff9");
                        }
                        com.sankuai.waimai.imbase.manager.f a2 = com.sankuai.waimai.imbase.manager.f.a();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.imbase.manager.f.a;
                        String b = PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "17756eb4ae788559fb1b154bd8ea808b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "17756eb4ae788559fb1b154bd8ea808b") : a2.g.b((com.sankuai.waimai.foundation.utils.e) a.EnumC0958a.IM_ACTIVITY_MESSAGE, "");
                        return !TextUtils.isEmpty(b) ? b : "[限时抢购商品]";
                    } catch (Exception unused2) {
                    }
                }
                return com.meituan.android.singleton.b.a.getString(R.string.wm_im_custom_msg);
            } else if (obj instanceof CustomEmotionMessage) {
                CustomEmotionMessage customEmotionMessage = (CustomEmotionMessage) obj;
                if (!TextUtils.isEmpty(customEmotionMessage.getName())) {
                    return "[" + customEmotionMessage.getName() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
                }
                return com.meituan.android.singleton.b.a.getString(R.string.wm_im_custom_emotion);
            } else if (obj instanceof Message) {
                String compatible = ((Message) obj).getCompatible();
                if (TextUtils.isEmpty(compatible)) {
                    return com.meituan.android.singleton.b.a.getString(R.string.wm_im_unknown_msg);
                }
                return "[" + compatible + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
            } else {
                return com.meituan.android.singleton.b.a.getString(R.string.wm_im_unknown_msg);
            }
        }
    }

    public static int a(GeneralMessage generalMessage) {
        Object[] objArr = {generalMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1959b26c626544d6670310612410e8d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1959b26c626544d6670310612410e8d")).intValue();
        }
        try {
            byte[] data = generalMessage.getData();
            if (data != null) {
                return new JSONObject(new String(data, "utf-8")).optInt("type");
            }
            return 3;
        } catch (Exception unused) {
            return 3;
        }
    }

    private static String a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2757dabcf3f03a71616334d2a73f7c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2757dabcf3f03a71616334d2a73f7c9");
        }
        if (jSONObject != null) {
            try {
                com.sankuai.waimai.business.im.model.l lVar = (com.sankuai.waimai.business.im.model.l) new Gson().fromJson(jSONObject.toString(), (Class<Object>) com.sankuai.waimai.business.im.model.l.class);
                if (lVar.c == 1) {
                    return com.meituan.android.singleton.b.a.getString(R.string.wm_im_poi_coupon_message_digest, String.valueOf(lVar.e), String.valueOf(lVar.d));
                }
                if (lVar.c == 2) {
                    return com.meituan.android.singleton.b.a.getString(R.string.wm_im_sku_poi_coupon_message_digest, lVar.g, BigDecimal.valueOf(lVar.d / 10.0d).setScale(1, 4).stripTrailingZeros().toPlainString());
                }
                return "[商家优惠券]";
            } catch (Exception unused) {
                return "[商家优惠券]";
            }
        }
        return "[商家优惠券]";
    }
}
