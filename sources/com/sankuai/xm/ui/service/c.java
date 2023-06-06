package com.sankuai.xm.ui.service;

import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.controller.group.bean.AtMeInfo;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface c {
    void a(SessionId sessionId);

    void a(SessionId sessionId, Callback<List<AtMeInfo>> callback);

    void a(SessionId sessionId, String str);

    void a(AtMeInfo atMeInfo);

    void a(short s, List<IMMessage> list);
}
