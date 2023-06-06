package com.sankuai.xm.im.cache.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.Index;
/* compiled from: ProGuard */
@Entity(indexes = {@Index(name = "pub_message_uuid_index", unique = true, value = "msgUuid"), @Index(name = "pub_message_sender_index", value = "fromUid"), @Index(name = "pub_message_session_cts_index", value = "chatId,peerUid,channel,cts"), @Index(name = "pub_message_session_sts_index", value = "chatId,peerUid,channel,sts"), @Index(name = "pub_message_cts_index", value = Message.CTS), @Index(name = "pub_msgid_index", value = "msgid")}, name = PubDBMessage.TABLE_NAME)
/* loaded from: classes6.dex */
public class PubDBMessage extends DBMessage {
    public static final String TABLE_NAME = "pub_msg_info";
    public static ChangeQuickRedirect changeQuickRedirect;

    public PubDBMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc7e1021b1dd9a2b88f94bbe06e74bdd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc7e1021b1dd9a2b88f94bbe06e74bdd");
        } else {
            setCategory(3);
        }
    }

    public PubDBMessage(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "928f5fa65a249b9d92e3ba47d3122300", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "928f5fa65a249b9d92e3ba47d3122300");
        } else {
            setCategory(i);
        }
    }

    @Override // com.sankuai.xm.im.message.bean.Message
    public int getCategory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b31a53ee82224b7710e8773e23b3acf", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b31a53ee82224b7710e8773e23b3acf")).intValue();
        }
        if (this.mCategory == 3 && !ac.a(this.mSID)) {
            setCategory(this.mPeerUid == 0 ? 10 : 11);
        }
        return super.getCategory();
    }
}
