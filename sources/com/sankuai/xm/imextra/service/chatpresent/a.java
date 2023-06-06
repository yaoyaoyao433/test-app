package com.sankuai.xm.imextra.service.chatpresent;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Id;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a<T> {
    public static final String EXTEN = "extension";
    public static final String MSG_UUID = "msgUuid";
    public static final String SOURCE = "source";
    public static final int SOURCE_ALL = -1;
    public static final int SOURCE_MSG = 0;
    public static final int SOURCE_SESSION_EXT = 1;
    public static final String STS = "sts";
    public static final String TAG = "tag";
    public static final String TERMINAL = "tts";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Property(name = "extension")
    protected String mExtension;
    @Id(multikey = true)
    @Property(name = "msgUuid")
    protected String mMsgUuid;
    protected T mSession;
    @Property(name = "source")
    protected int mSource;
    @Property(name = "sts")
    protected long mSts;
    @Id(multikey = true)
    @Property(name = "tag")
    protected String mTag;
    @Property(name = TERMINAL)
    protected long mTerminalTs;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3975b724b4a56f0569028255296a9d66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3975b724b4a56f0569028255296a9d66");
            return;
        }
        this.mTerminalTs = Long.MAX_VALUE;
        this.mSource = 0;
    }

    public a(@NonNull String str, @NonNull String str2, long j, @NonNull T t) {
        Object[] objArr = {str, str2, new Long(j), t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac14a0bfa1832261250fa5305edaeded", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac14a0bfa1832261250fa5305edaeded");
            return;
        }
        this.mTerminalTs = Long.MAX_VALUE;
        this.mSource = 0;
        this.mTag = str;
        this.mMsgUuid = str2;
        this.mSession = t;
        this.mSts = j;
    }

    public a(a<?> aVar, T t) {
        Object[] objArr = {aVar, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91e38e28bbd943b442fbc41c9b9d3a59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91e38e28bbd943b442fbc41c9b9d3a59");
            return;
        }
        this.mTerminalTs = Long.MAX_VALUE;
        this.mSource = 0;
        this.mTag = aVar.mTag;
        this.mMsgUuid = aVar.mMsgUuid;
        this.mSts = aVar.mSts;
        this.mSession = t;
        this.mSource = aVar.mSource;
        this.mExtension = aVar.mExtension;
        if (aVar.mTerminalTs > 0) {
            this.mTerminalTs = aVar.mTerminalTs;
        }
    }

    @GetM(property = "mMsgUuid")
    public String getMsgUuid() {
        return this.mMsgUuid;
    }

    @SetM(property = "mMsgUuid")
    public void setMsgUuid(String str) {
        this.mMsgUuid = str;
    }

    @GetM(property = "mTag")
    public String getTag() {
        return this.mTag;
    }

    @SetM(property = "mTag")
    public void setTag(String str) {
        this.mTag = str;
    }

    @GetM(property = "mSts")
    public long getSts() {
        return this.mSts;
    }

    @SetM(property = "mSts")
    public void setSts(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bf9cc576901b2d452c1eb31707b5a2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bf9cc576901b2d452c1eb31707b5a2c");
        } else {
            this.mSts = j;
        }
    }

    @GetM(property = "mExtension")
    public String getExtension() {
        return this.mExtension;
    }

    @SetM(property = "mExtension")
    public void setExtension(String str) {
        this.mExtension = str;
    }

    @GetM(property = "mTerminalTs")
    public long getTerminalTs() {
        return this.mTerminalTs;
    }

    @SetM(property = "mTerminalTs")
    public void setTerminalTs(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64ea17b9aa82b5173d1aef8dddbe9a6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64ea17b9aa82b5173d1aef8dddbe9a6a");
        } else if (j > 0) {
            this.mTerminalTs = j;
        }
    }

    @GetM(property = "mSource")
    public int getSource() {
        return this.mSource;
    }

    @SetM(property = "mSource")
    public void setSource(int i) {
        this.mSource = i;
    }

    public T getSession() {
        return this.mSession;
    }

    public void setSession(T t) {
        this.mSession = t;
    }

    public SessionId getSessionId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f73726c98ff8fe71de275f3b969a01b", 6917529027641081856L)) {
            return (SessionId) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f73726c98ff8fe71de275f3b969a01b");
        }
        if (this.mSession instanceof com.sankuai.xm.im.session.entry.a) {
            return ((com.sankuai.xm.im.session.entry.a) this.mSession).c();
        }
        if (this.mSession instanceof SessionId) {
            return (SessionId) this.mSession;
        }
        return null;
    }

    public static boolean isValid(a<?> aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd7bf368967eabab410ce0e9a15551ab", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd7bf368967eabab410ce0e9a15551ab")).booleanValue() : (aVar == null || ac.a(aVar.mTag) || ac.a(aVar.mMsgUuid) || aVar.mSession == null || aVar.mSts <= 0) ? false : true;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d75f7b10247f45a70930d9b225334f08", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d75f7b10247f45a70930d9b225334f08");
        }
        return "ChatMsgSpecialTag{mTag='" + this.mTag + "', mMsgUuid='" + this.mMsgUuid + "', mChat=" + getSessionId() + '}';
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ed501e10484533dcb9c8264cf3af186", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ed501e10484533dcb9c8264cf3af186")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.mSource == aVar.mSource && Objects.equals(this.mTag, aVar.mTag) && Objects.equals(this.mMsgUuid, aVar.mMsgUuid) && Objects.equals(this.mSession, aVar.mSession);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bd0a38a84fb814f1de10f5a242bfad0", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bd0a38a84fb814f1de10f5a242bfad0")).intValue() : Objects.hash(this.mTag, this.mMsgUuid, this.mSession, Integer.valueOf(this.mSource));
    }
}
