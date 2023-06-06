package com.sankuai.xm.im.cache.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.SyncRead;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Id;
import com.sankuai.xm.tinyormapt.annotation.Index;
import com.sankuai.xm.tinyormapt.annotation.NotNull;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
/* compiled from: ProGuard */
@Entity(indexes = {@Index(name = "read_unique_index", unique = true, value = "chat_key")}, name = DBSyncRead.TABLE_NAME)
/* loaded from: classes6.dex */
public final class DBSyncRead extends SyncRead {
    public static final String CHANNEL = "channel";
    public static final String CHAT_KEY = "chat_key";
    public static final String PEER_APPID = "peerAppid";
    public static final String TABLE_NAME = "msg_sync_read";
    public static final long UPDATE_TIME_DEFAULT = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @Property(name = "channel")
    private short mChannel;
    @Id
    @Property(name = "chat_key")
    @NotNull
    private String mChatKey;
    @Property(name = PEER_APPID)
    private short mPeerAppId;

    public DBSyncRead() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb89da6c0b9327512af5a171ab973c46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb89da6c0b9327512af5a171ab973c46");
            return;
        }
        this.mChannel = (short) 0;
        this.mPeerAppId = (short) 0;
    }

    @Override // com.sankuai.xm.im.message.bean.SyncRead
    @GetM(property = "mChatKey")
    public final String getChatKey() {
        return this.mChatKey;
    }

    @SetM(property = "mChatKey")
    public final void setChatKey(String str) {
        this.mChatKey = str;
    }

    @Override // com.sankuai.xm.im.message.bean.SyncRead
    @GetM(property = "mChannel")
    public final short getChannel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9b806b416aba9b6d62f025a1f4056d6", 6917529027641081856L) ? ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9b806b416aba9b6d62f025a1f4056d6")).shortValue() : this.mChannel == 0 ? super.getChannel() : this.mChannel;
    }

    @Override // com.sankuai.xm.im.message.bean.SyncRead
    @SetM(property = "mChannel")
    public final void setChannel(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb498c3d0189b2894d9f97af4dc77868", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb498c3d0189b2894d9f97af4dc77868");
            return;
        }
        this.mChannel = s;
        super.setChannel(s);
    }

    @Override // com.sankuai.xm.im.message.bean.SyncRead
    @GetM(property = "mPeerAppId")
    public final short getPeerAppid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5dab22e97e7546d61377f40998c70ed", 6917529027641081856L) ? ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5dab22e97e7546d61377f40998c70ed")).shortValue() : this.mPeerAppId == 0 ? super.getPeerAppid() : this.mPeerAppId;
    }

    @Override // com.sankuai.xm.im.message.bean.SyncRead
    @SetM(property = "mPeerAppId")
    public final void setPeerAppid(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1891a39178b0d3591b432287bdef33a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1891a39178b0d3591b432287bdef33a8");
            return;
        }
        this.mPeerAppId = s;
        super.setPeerAppid(s);
    }

    public final void parseSessionId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6a3bddb715493dd7ed5939a85c2631f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6a3bddb715493dd7ed5939a85c2631f");
        } else {
            setSessionId(SessionId.a(this.mChatKey));
        }
    }
}
