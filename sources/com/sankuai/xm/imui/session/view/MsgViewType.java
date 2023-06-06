package com.sankuai.xm.imui.session.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.CalendarMessage;
import com.sankuai.xm.im.message.bean.CustomEmotionMessage;
import com.sankuai.xm.im.message.bean.EmotionMessage;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.FileMessage;
import com.sankuai.xm.im.message.bean.GPSMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.LinkMessage;
import com.sankuai.xm.im.message.bean.MultiLinkMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.im.utils.MessageUtils;
import com.sankuai.xm.imui.common.util.e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class MsgViewType {
    public static ChangeQuickRedirect a;
    public static final Set<Integer> b = new HashSet(b.a(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 20, 21, 22, 18}));

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface ViewType {
    }

    public static int a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "981a6404977d58de5659563e90b89cd2", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "981a6404977d58de5659563e90b89cd2")).intValue();
        }
        int msgType = iMMessage.getMsgType();
        if (msgType != 17) {
            if (msgType != 19) {
                switch (msgType) {
                    case 1:
                        if (iMMessage instanceof TextMessage) {
                            return 0;
                        }
                        break;
                    case 2:
                        if (iMMessage instanceof AudioMessage) {
                            return 1;
                        }
                        break;
                    case 3:
                        if (iMMessage instanceof VideoMessage) {
                            return 2;
                        }
                        break;
                    case 4:
                        if (iMMessage instanceof ImageMessage) {
                            return 3;
                        }
                        break;
                    case 5:
                        if (iMMessage instanceof CalendarMessage) {
                            return 4;
                        }
                        break;
                    case 6:
                        if (iMMessage instanceof LinkMessage) {
                            return (MessageUtils.isPubService(iMMessage.getCategory()) && iMMessage.getFromUid() == iMMessage.getChatId()) ? 20 : 5;
                        }
                        break;
                    case 7:
                        if (iMMessage instanceof MultiLinkMessage) {
                            return MessageUtils.isPubService(iMMessage.getCategory()) ? 21 : 6;
                        }
                        break;
                    case 8:
                        if (iMMessage instanceof FileMessage) {
                            return e.a((FileMessage) iMMessage) ? 19 : 7;
                        }
                        break;
                    case 9:
                        if (iMMessage instanceof GPSMessage) {
                            return 8;
                        }
                        break;
                    default:
                        switch (msgType) {
                            case 11:
                                if (iMMessage instanceof EmotionMessage) {
                                    return 10;
                                }
                                break;
                            case 12:
                                if (iMMessage instanceof EventMessage) {
                                    return 11;
                                }
                                break;
                        }
                }
            } else if (iMMessage instanceof CustomEmotionMessage) {
                return 22;
            }
        } else if (iMMessage instanceof GeneralMessage) {
            return 16;
        }
        return 18;
    }
}
