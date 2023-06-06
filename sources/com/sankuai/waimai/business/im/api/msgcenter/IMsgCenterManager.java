package com.sankuai.waimai.business.im.api.msgcenter;

import android.app.Activity;
import com.sankuai.waimai.business.im.api.msgcenter.a;
import com.sankuai.waimai.business.im.api.msgcenter.model.UnReadMsgEntity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IMsgCenterManager {
    void clickMsgCenter(Activity activity);

    int getUnReadImCount();

    UnReadMsgEntity getUnReadMsgInfo();

    boolean isMsgCenter(Activity activity);

    void refreshMsgCenterImCount(int i);

    void refreshMsgCenterSysCount(int i);

    void refreshMsgCenterUnReadCount();

    void registerMsgCenterUnreadChangeListener(a.b bVar);

    boolean showMsgCenterDot();

    void unregisterMsgCenterUnreadChangeListener(a.b bVar);
}
