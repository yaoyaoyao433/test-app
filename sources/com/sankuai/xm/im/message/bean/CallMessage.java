package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CallMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long mCallDur;
    private long mCallPeerUid;
    private int mCallStatus;
    private int mCallType;
    private long mCallUid;
    private long mEndTs;
    private boolean mHasCallback;
    private int mRoles;
    private long mStartCallTs;
    private long mStartTalkTs;

    public CallMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5402bcd3b39ab709cceb01a90ea229d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5402bcd3b39ab709cceb01a90ea229d0");
            return;
        }
        this.mCallUid = 0L;
        this.mCallPeerUid = 0L;
        this.mRoles = 0;
        this.mCallStatus = 0;
        this.mCallType = 0;
        this.mStartCallTs = 0L;
        this.mStartTalkTs = 0L;
        this.mEndTs = 0L;
        this.mCallDur = 0L;
        this.mHasCallback = false;
        setMsgType(15);
    }

    public long getCallUid() {
        return this.mCallUid;
    }

    public void setCallUid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c682237c944c2ae69f054b9ca684b0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c682237c944c2ae69f054b9ca684b0b");
        } else {
            this.mCallUid = j;
        }
    }

    public long getCallPeerUid() {
        return this.mCallPeerUid;
    }

    public void setCallPeerUid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fded8dc2deeec5d7c00446941cf04545", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fded8dc2deeec5d7c00446941cf04545");
        } else {
            this.mCallPeerUid = j;
        }
    }

    public int getRoles() {
        return this.mRoles;
    }

    public void setRoles(int i) {
        this.mRoles = i;
    }

    public int getCallStatus() {
        return this.mCallStatus;
    }

    public void setCallStatus(int i) {
        this.mCallStatus = i;
    }

    public int getCallType() {
        return this.mCallType;
    }

    public void setCallType(int i) {
        this.mCallType = i;
    }

    public long getStartCallTs() {
        return this.mStartCallTs;
    }

    public void setStartCallTs(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06fe47a3ed95ce37e61a58e7f694e4d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06fe47a3ed95ce37e61a58e7f694e4d0");
        } else {
            this.mStartCallTs = j;
        }
    }

    public long getStartTalkTs() {
        return this.mStartTalkTs;
    }

    public void setStartTalkTs(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90227054fdf05a1d398fafbe1f44b5f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90227054fdf05a1d398fafbe1f44b5f0");
        } else {
            this.mStartTalkTs = j;
        }
    }

    public long getEndTs() {
        return this.mEndTs;
    }

    public void setEndTs(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7df070377b797595736072f569698567", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7df070377b797595736072f569698567");
        } else {
            this.mEndTs = j;
        }
    }

    public long getCallDur() {
        return this.mCallDur;
    }

    public void setCallDur(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5000b794031242a5255b3bc224af5c1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5000b794031242a5255b3bc224af5c1c");
        } else {
            this.mCallDur = j;
        }
    }

    public boolean isHasCallback() {
        return this.mHasCallback;
    }

    public void setHasCallback(boolean z) {
        this.mHasCallback = z;
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fd2c1913b2c4fdea2a82e9b3aac7ebb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fd2c1913b2c4fdea2a82e9b3aac7ebb");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof CallMessage) {
            CallMessage callMessage = (CallMessage) iMMessage;
            callMessage.mCallUid = this.mCallUid;
            callMessage.mCallPeerUid = this.mCallPeerUid;
            callMessage.mRoles = this.mRoles;
            callMessage.mCallStatus = this.mCallStatus;
            callMessage.mCallType = this.mCallType;
            callMessage.mStartCallTs = this.mStartCallTs;
            callMessage.mStartTalkTs = this.mStartTalkTs;
            callMessage.mEndTs = this.mEndTs;
            callMessage.mCallDur = this.mCallDur;
            callMessage.mHasCallback = this.mHasCallback;
        }
    }
}
