package com.sankuai.xm.imextra.impl.sessionpresent.db;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Index;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
/* compiled from: ProGuard */
@Entity(indexes = {@Index(name = "msg_uuid_index", value = "msgUuid"), @Index(name = "channel_index", value = "channel"), @Index(name = "chat_index", value = DBSessionMsgSpecialTag.CHAT)}, name = DBSessionMsgSpecialTag.TABLE)
/* loaded from: classes6.dex */
public class DBSessionMsgSpecialTag extends com.sankuai.xm.imextra.service.chatpresent.a<SessionId> {
    public static final String CHANNEL = "channel";
    public static final String CHAT = "chat";
    public static final String TABLE = "chat_msg_tag";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Property(name = "channel")
    private short mChannel;
    @Property(name = CHAT)
    private String mChatKey;

    public DBSessionMsgSpecialTag() {
    }

    public DBSessionMsgSpecialTag(com.sankuai.xm.imextra.service.chatpresent.a<SessionId> aVar) {
        super(aVar, aVar.getSession());
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "941f9a0e1b2a3d95708e25f6f55afa5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "941f9a0e1b2a3d95708e25f6f55afa5b");
            return;
        }
        this.mChannel = aVar.getSession().g;
        this.mChatKey = aVar.getSession().f();
        this.mSts = aVar.getSts();
    }

    @GetM(property = "mChatKey")
    public String getChatKey() {
        return this.mChatKey;
    }

    @SetM(property = "mChatKey")
    public void setChatKey(String str) {
        this.mChatKey = str;
    }

    @GetM(property = "mChannel")
    public short getChannel() {
        return this.mChannel;
    }

    @SetM(property = "mChannel")
    public void setChannel(short s) {
        this.mChannel = s;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, com.sankuai.xm.im.session.SessionId] */
    @Override // com.sankuai.xm.imextra.service.chatpresent.a
    public SessionId getSession() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a9c279183b21442a5e956b7feb9937c", 6917529027641081856L)) {
            return (SessionId) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a9c279183b21442a5e956b7feb9937c");
        }
        if (this.mSession == 0 && !ac.a(this.mChatKey)) {
            ?? a = SessionId.a(this.mChatKey);
            this.mSession = a;
            return (SessionId) a;
        }
        return (SessionId) this.mSession;
    }
}
