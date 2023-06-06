package com.sankuai.xm.imextra.service.chatpresent;

import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(Map<com.sankuai.xm.im.session.entry.a, List<com.sankuai.xm.imextra.service.chatpresent.a<com.sankuai.xm.im.session.entry.a>>> map);

        void b(Map<com.sankuai.xm.im.session.entry.a, List<com.sankuai.xm.imextra.service.chatpresent.a<com.sankuai.xm.im.session.entry.a>>> map);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.imextra.service.chatpresent.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC1397b {
        com.sankuai.xm.imextra.service.chatpresent.a<SessionId> a(IMMessage iMMessage);
    }

    List<com.sankuai.xm.im.session.entry.a> a(long j, short s, Set<String> set);

    Map<SessionId, List<com.sankuai.xm.imextra.service.chatpresent.a<SessionId>>> a(long j, List<SessionId> list);

    void a(short s, a aVar);

    void b(short s, a aVar);
}
