package com.sankuai.waimai.imbase.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.imui.IMUIManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a481adc04c6b6d5dcb7604c07201ec66", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a481adc04c6b6d5dcb7604c07201ec66");
        }
        if (obj instanceof TextMessage) {
            return ((TextMessage) obj).getText();
        }
        if (obj instanceof EventMessage) {
            return ((EventMessage) obj).getText();
        }
        return obj instanceof AudioMessage ? "[语音]" : obj instanceof ImageMessage ? "[图片]" : obj instanceof VideoMessage ? "[视频]" : obj instanceof GeneralMessage ? "[自定义消息]" : "[未知消息]";
    }

    public static void a(IMMessage iMMessage, boolean z) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b47df7b3eceac618ba05b53c22a8fd8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b47df7b3eceac618ba05b53c22a8fd8a");
        } else if (iMMessage == null) {
        } else {
            iMMessage.setFromUid(com.sankuai.xm.imui.b.a().d());
            iMMessage.setChatId(com.sankuai.xm.imui.b.a().d());
            iMMessage.setCategory(com.sankuai.xm.imui.b.a().e());
            iMMessage.setPeerUid(com.sankuai.xm.imui.b.a().f().c);
            iMMessage.setToUid(com.sankuai.xm.imui.b.a().d());
            iMMessage.setToAppId(com.sankuai.xm.imui.b.a().g());
            iMMessage.setPeerAppId(com.sankuai.xm.imui.b.a().g());
            iMMessage.setMsgStatus(9);
            iMMessage.setChannel(com.sankuai.xm.imui.b.a().f().g);
            if (z) {
                IMUIManager.a().c(iMMessage);
            } else {
                com.sankuai.waimai.imbase.configuration.a.a().a(iMMessage, false, (IMClient.g<Integer>) null);
            }
        }
    }

    public static void b(IMMessage iMMessage, boolean z) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d67176ade9cfd6200fb033c61b159fee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d67176ade9cfd6200fb033c61b159fee");
        } else if (iMMessage == null) {
        } else {
            iMMessage.setFromUid(com.sankuai.xm.imui.b.a().d());
            iMMessage.setChatId(com.sankuai.xm.imui.b.a().d());
            iMMessage.setCategory(com.sankuai.xm.imui.b.a().e());
            iMMessage.setToUid(com.sankuai.xm.imui.b.a().d());
            iMMessage.setToAppId(com.sankuai.xm.imui.b.a().g());
            iMMessage.setPeerAppId(com.sankuai.xm.imui.b.a().g());
            iMMessage.setChannel(com.sankuai.xm.imui.b.a().f().g);
            iMMessage.setMsgStatus(9);
            if (z) {
                IMUIManager.a().c(iMMessage);
            } else {
                com.sankuai.waimai.imbase.configuration.a.a().a(iMMessage, false, (IMClient.g<Integer>) null);
            }
        }
    }
}
