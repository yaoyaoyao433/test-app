package com.sankuai.xm.im.session.entry;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Id;
import com.sankuai.xm.tinyormapt.annotation.Index;
import com.sankuai.xm.tinyormapt.annotation.NotNull;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Entity(indexes = {@Index(name = "chat_stamp_unique_index", unique = true, value = "chat_key")}, name = SessionStamp.TABLE_NAME)
/* loaded from: classes6.dex */
public class SessionStamp {
    public static final String CHAT_KEY = "chat_key";
    public static final String EARLIEST_STS = "earliest_sts";
    public static final String EXTEN = "extension";
    public static final String TABLE_NAME = "chat_stamp";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Id
    @Property(name = "chat_key")
    @NotNull
    private String chatKey;
    @Property(name = EARLIEST_STS)
    private long earliestSts;
    @Property(name = "extension")
    private String extension;
    private long extensionUts;
    @Property(name = "max_msg_id")
    private long maxMsgId;
    @Property(name = "max_my_cts")
    private long maxMyCts;
    @Property(name = "max_other_cts")
    private long maxOthCts;
    @Property(name = "max_sts")
    private long maxSts;

    public SessionStamp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "074b099844d533286fbdad9db484cfc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "074b099844d533286fbdad9db484cfc7");
            return;
        }
        this.earliestSts = -1L;
        this.extension = "";
    }

    @GetM(property = "chatKey")
    public String getChatKey() {
        return this.chatKey;
    }

    @SetM(property = "chatKey")
    public void setChatKey(String str) {
        this.chatKey = str;
    }

    @GetM(property = "maxSts")
    public long getMaxSts() {
        return this.maxSts;
    }

    @SetM(property = "maxSts")
    public void setMaxSts(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef6ade3e20a1d16b3c33a8334d78b4cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef6ade3e20a1d16b3c33a8334d78b4cd");
        } else {
            this.maxSts = j;
        }
    }

    @GetM(property = "maxMsgId")
    public long getMaxMsgId() {
        return this.maxMsgId;
    }

    @SetM(property = "maxMsgId")
    public void setMaxMsgId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cd506f8eaf1ec3aba3740fdc2e80409", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cd506f8eaf1ec3aba3740fdc2e80409");
        } else {
            this.maxMsgId = j;
        }
    }

    @GetM(property = "maxMyCts")
    public long getMaxMyCts() {
        return this.maxMyCts;
    }

    @SetM(property = "maxMyCts")
    public void setMaxMyCts(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "354d4d15d2dcec308d6521c2a52c4133", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "354d4d15d2dcec308d6521c2a52c4133");
        } else {
            this.maxMyCts = j;
        }
    }

    @GetM(property = "maxOthCts")
    public long getMaxOthCts() {
        return this.maxOthCts;
    }

    @SetM(property = "maxOthCts")
    public void setMaxOthCts(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7658a364d304ca8217afeb8905ab2164", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7658a364d304ca8217afeb8905ab2164");
        } else {
            this.maxOthCts = j;
        }
    }

    @GetM(property = "earliestSts")
    public long getEarliestSts() {
        return this.earliestSts;
    }

    @SetM(property = "earliestSts")
    public void setEarliestSts(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fb518f71b494fdae411796882dd37ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fb518f71b494fdae411796882dd37ae");
        } else {
            this.earliestSts = j;
        }
    }

    @GetM(property = "extension")
    public String getExtension() {
        return this.extension;
    }

    @SetM(property = "extension")
    public void setExtension(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e176b535606216043a164444d1dc80aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e176b535606216043a164444d1dc80aa");
            return;
        }
        this.extension = str;
        if (!ac.a(str)) {
            try {
                this.extensionUts = new JSONObject(str).optLong("extTs");
                return;
            } catch (JSONException unused) {
                return;
            }
        }
        this.extensionUts = 0L;
    }

    public long getExtensionUts() {
        return this.extensionUts;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d832645a928d6fe73c05e4869a39df89", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d832645a928d6fe73c05e4869a39df89");
        }
        return "SessionStamp{chatKey='" + this.chatKey + "', maxSts=" + this.maxSts + ", maxMsgId=" + this.maxMsgId + ", maxMyCts=" + this.maxMyCts + ", maxOthCts=" + this.maxOthCts + ", earliestSts=" + this.earliestSts + '}';
    }
}
