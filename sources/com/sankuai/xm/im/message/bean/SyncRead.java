package com.sankuai.xm.im.message.bean;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.cache.bean.DBSyncRead;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SyncRead {
    public static final String LOCAL_CLIENT_STAMP = "lcts";
    public static final String LOCAL_SERVER_STAMP = "lsts";
    public static final String REMOTE_CLIENT_STAMP = "rcts";
    public static final String REMOTE_SERVER_STAMP = "rsts";
    public static final String TIMES = "times";
    public static final String UPDATE_TIME = "uts";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Property(deprecated = true, name = LOCAL_CLIENT_STAMP)
    @Deprecated
    private long mLcts;
    @Property(name = LOCAL_SERVER_STAMP)
    private long mLsts;
    @Property(deprecated = true, name = REMOTE_CLIENT_STAMP)
    @Deprecated
    private long mRcts;
    @Property(name = REMOTE_SERVER_STAMP)
    private long mRsts;
    private SessionId mSessionId;
    @Property(deprecated = true, name = "times")
    @Deprecated
    private int mTimes;
    @Property(name = "uts")
    private long mUpdateStamp;

    public SyncRead() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ce7e3d6d326b8c8febfd16e5e6be0aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ce7e3d6d326b8c8febfd16e5e6be0aa");
            return;
        }
        this.mLcts = 0L;
        this.mRcts = 0L;
        this.mSessionId = new SessionId();
    }

    public SyncRead(@NonNull SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e47fec694be10ea489da2634a4089f72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e47fec694be10ea489da2634a4089f72");
            return;
        }
        this.mLcts = 0L;
        this.mRcts = 0L;
        this.mSessionId = sessionId;
    }

    public DBSyncRead transfer2DBObj() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e272e642ec99279ac462516fa6f6acf", 6917529027641081856L)) {
            return (DBSyncRead) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e272e642ec99279ac462516fa6f6acf");
        }
        DBSyncRead dBSyncRead = new DBSyncRead();
        dBSyncRead.setSessionId(getSessionId());
        dBSyncRead.setPeerAppid(getPeerAppid());
        dBSyncRead.setChatKey(getChatKey());
        dBSyncRead.setChannel(getChannel());
        dBSyncRead.setRsts(this.mRsts);
        dBSyncRead.setLsts(this.mLsts);
        dBSyncRead.setUpdateStamp(this.mUpdateStamp);
        return dBSyncRead;
    }

    public long getChatMainId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10ada20d5d161e828705444a8081ce97", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10ada20d5d161e828705444a8081ce97")).longValue() : this.mSessionId.b;
    }

    public void setChatMainId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8ff77409facda2b6150e4a97a75019a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8ff77409facda2b6150e4a97a75019a");
        } else {
            this.mSessionId.a(j);
        }
    }

    public long getSubChatID() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eead6a937ade0d27c320d41fbfc0ca0a", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eead6a937ade0d27c320d41fbfc0ca0a")).longValue() : this.mSessionId.c;
    }

    public void setSubChatID(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ed09487bb59600cf1725368fe8fd669", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ed09487bb59600cf1725368fe8fd669");
            return;
        }
        SessionId sessionId = this.mSessionId;
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect3 = SessionId.a;
        if (PatchProxy.isSupport(objArr2, sessionId, changeQuickRedirect3, false, "e2a35be16296e3f4cf7ca9b957c65683", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, sessionId, changeQuickRedirect3, false, "e2a35be16296e3f4cf7ca9b957c65683");
        } else {
            sessionId.c = j;
        }
    }

    public int getChatType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd9d39c655a25216ac781636ce96cf27", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd9d39c655a25216ac781636ce96cf27")).intValue() : this.mSessionId.e;
    }

    public void setChatType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ab6965da24a3f273f88a23b93f1b130", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ab6965da24a3f273f88a23b93f1b130");
        } else {
            this.mSessionId.e = i;
        }
    }

    public short getPeerAppid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8906423369ec36a776aa041e99823fd1", 6917529027641081856L) ? ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8906423369ec36a776aa041e99823fd1")).shortValue() : this.mSessionId.d;
    }

    public void setPeerAppid(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96162d6668f065e0e5413e03a1170772", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96162d6668f065e0e5413e03a1170772");
        } else {
            this.mSessionId.d = s;
        }
    }

    public short getChannel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ada0b5264ed93bec2c333657db8053a", 6917529027641081856L) ? ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ada0b5264ed93bec2c333657db8053a")).shortValue() : this.mSessionId.g;
    }

    public void setChannel(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c86eb6c6e75e638dc2f83217b96e94f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c86eb6c6e75e638dc2f83217b96e94f");
        } else {
            this.mSessionId.g = s;
        }
    }

    @GetM(property = "mLsts")
    public long getLsts() {
        return this.mLsts;
    }

    @SetM(property = "mLsts")
    public void setLsts(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e318bcd3f2d26d30f32c1dac3d62f245", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e318bcd3f2d26d30f32c1dac3d62f245");
        } else {
            this.mLsts = j;
        }
    }

    @GetM(property = "mRsts")
    public long getRsts() {
        return this.mRsts;
    }

    @SetM(property = "mRsts")
    public void setRsts(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c966eabf89a18d2e1f35d671278c495e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c966eabf89a18d2e1f35d671278c495e");
        } else {
            this.mRsts = j;
        }
    }

    public String getChatKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8b6c59bbb1334fe3b17509727acb853", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8b6c59bbb1334fe3b17509727acb853") : this.mSessionId.f();
    }

    public SessionId getSessionId() {
        return this.mSessionId;
    }

    public void setSessionId(SessionId sessionId) {
        Object[] objArr = {sessionId};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d5729951b8ea982f8173607d0aac528", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d5729951b8ea982f8173607d0aac528");
            return;
        }
        if (sessionId == null) {
            sessionId = new SessionId();
        }
        this.mSessionId = sessionId;
    }

    @GetM(property = "mLcts")
    public long getLcts() {
        return this.mLcts;
    }

    @SetM(property = "mLcts")
    public void setLcts(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bb9a5a56647e6a38715a1c873f5d466", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bb9a5a56647e6a38715a1c873f5d466");
        } else {
            this.mLcts = j;
        }
    }

    @GetM(property = "mRcts")
    public long getRcts() {
        return this.mRcts;
    }

    @SetM(property = "mRcts")
    public void setRcts(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7f6746186c15310fb9237abbc767ae9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7f6746186c15310fb9237abbc767ae9");
        } else {
            this.mRcts = j;
        }
    }

    @GetM(property = "mTimes")
    public int getTimes() {
        return this.mTimes;
    }

    @SetM(property = "mTimes")
    public void setTimes(int i) {
        this.mTimes = i;
    }

    @GetM(property = "mUpdateStamp")
    public long getUpdateStamp() {
        return this.mUpdateStamp;
    }

    @SetM(property = "mUpdateStamp")
    public void setUpdateStamp(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a6957eb5ad0502bd83bf03f5d556691", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a6957eb5ad0502bd83bf03f5d556691");
        } else {
            this.mUpdateStamp = j;
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c5f1649bd89eb8a49f215f5f45f1e2f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c5f1649bd89eb8a49f215f5f45f1e2f");
        }
        return "SyncRead{mSid=" + this.mSessionId.f() + ", mLsts=" + this.mLsts + ", mRsts=" + this.mRsts + ", mUts=" + this.mUpdateStamp + '}';
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95c78c272b0a531acad4c51deb08367d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95c78c272b0a531acad4c51deb08367d")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SyncRead syncRead = (SyncRead) obj;
        return this.mSessionId != null ? this.mSessionId.equals(syncRead.mSessionId) : syncRead.mSessionId == null;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "157e857069075f53460d0916b024556d", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "157e857069075f53460d0916b024556d")).intValue();
        }
        if (this.mSessionId != null) {
            return this.mSessionId.hashCode();
        }
        return 0;
    }

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4c0a89bfd98de646d1665a6143a8b2e", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4c0a89bfd98de646d1665a6143a8b2e")).booleanValue() : getChatMainId() > 0 && getChatType() > 0 && getRsts() != 0;
    }
}
