package com.sankuai.xm.im.cache.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.message.bean.Message;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.Index;
/* compiled from: ProGuard */
@Entity(indexes = {@Index(name = "message_uuid_index", unique = true, value = "msgUuid"), @Index(name = "message_sender_index", value = "fromUid"), @Index(name = "message_session_cts_index", value = "chatId, channel, cts"), @Index(name = "message_session_sts_index", value = "chatId, channel, sts"), @Index(name = "message_cts_index", value = Message.CTS), @Index(name = "msgid_index", value = "msgid")}, name = PersonalDBMessage.TABLE_NAME)
/* loaded from: classes6.dex */
public class PersonalDBMessage extends DBMessage {
    public static final String TABLE_NAME = "msg_info";
    public static ChangeQuickRedirect changeQuickRedirect;

    public PersonalDBMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cbb03d8a2d5b9479c95fd6c4837d9f45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cbb03d8a2d5b9479c95fd6c4837d9f45");
        } else {
            setCategory(1);
        }
    }

    public PersonalDBMessage(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c302aa0a188382d8abf83ccd2d7ebb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c302aa0a188382d8abf83ccd2d7ebb0");
        } else {
            setCategory(i);
        }
    }

    @Override // com.sankuai.xm.im.message.bean.Message
    public int getCategory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1adcee059cb90d3ed0709506a39dae01", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1adcee059cb90d3ed0709506a39dae01")).intValue();
        }
        if (this.mCategory == 1 && !ac.a(this.mSID)) {
            setCategory(9);
        }
        return super.getCategory();
    }
}
