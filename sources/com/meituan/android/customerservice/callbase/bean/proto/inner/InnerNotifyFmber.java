package com.meituan.android.customerservice.callbase.bean.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class InnerNotifyFmber implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private MeetingFmber[] followme;

    public void setFmber(MeetingFmber[] meetingFmberArr) {
        this.followme = meetingFmberArr;
    }

    public MeetingFmber[] getFmber() {
        return this.followme;
    }
}
