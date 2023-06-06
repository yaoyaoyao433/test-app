package com.meituan.android.customerservice.callbase.bean.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class InnerNotifyMer implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private MeetingItem[] inviting;
    private MeetingItem[] joined;
    private MeetingCodeItems[] leaved;
    private MeetingStatusItems[] mbers;

    public MeetingStatusItems[] getMbers() {
        return this.mbers;
    }

    public MeetingCodeItems[] getLeaved() {
        return this.leaved;
    }

    public MeetingItem[] getInviting() {
        return this.inviting;
    }

    public MeetingItem[] getJoined() {
        return this.joined;
    }
}
