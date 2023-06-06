package com.sankuai.xm.group;

import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.controller.group.bean.GroupAnnouncement;
import com.sankuai.xm.imui.controller.group.bean.GroupMember;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface b {
    void a(SessionId sessionId, long j, List<String> list, boolean z, Callback<Boolean> callback);

    void a(SessionId sessionId, GroupAnnouncement groupAnnouncement);

    void a(SessionId sessionId, boolean z, Callback<List<GroupMember>> callback);

    void a(short s, com.sankuai.xm.imui.controller.group.a aVar);

    void a(short s, com.sankuai.xm.imui.controller.group.b bVar);

    void b(SessionId sessionId, boolean z, Callback<GroupAnnouncement> callback);

    void b(short s, com.sankuai.xm.imui.controller.group.a aVar);

    void b(short s, com.sankuai.xm.imui.controller.group.b bVar);
}
