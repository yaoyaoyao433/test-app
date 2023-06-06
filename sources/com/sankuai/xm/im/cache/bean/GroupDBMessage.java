package com.sankuai.xm.im.cache.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.Index;
/* compiled from: ProGuard */
@Entity(indexes = {@Index(name = "grp_message_uuid_index", unique = true, value = "msgUuid"), @Index(name = "grp_message_sender_index", value = "fromUid"), @Index(name = "grp_message_session_cts_index", value = "chatId, channel, cts"), @Index(name = "grp_message_session_sts_index", value = "chatId, channel, sts"), @Index(name = "grp_message_cts_index", value = Message.CTS), @Index(name = "grp_msgid_index", value = "msgid")}, name = GroupDBMessage.TABLE_NAME)
/* loaded from: classes6.dex */
public class GroupDBMessage extends DBMessage {
    public static final String TABLE_NAME = "grp_msg_info";
    public static ChangeQuickRedirect changeQuickRedirect;

    public GroupDBMessage() {
        setCategory(2);
    }
}
