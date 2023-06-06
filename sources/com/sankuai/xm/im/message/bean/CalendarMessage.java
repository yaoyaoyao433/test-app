package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CalendarMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long mCalendarId;
    private long mDateEnd;
    private long mDateStart;
    private String mLocation;
    private String mParticipant;
    private String mRemark;
    private String mSummary;
    private String mTrigger;

    public CalendarMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f675873052080304ca17b410469b9450", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f675873052080304ca17b410469b9450");
            return;
        }
        this.mDateStart = 0L;
        this.mDateEnd = 0L;
        this.mSummary = "";
        this.mLocation = "";
        this.mTrigger = "";
        this.mParticipant = "";
        this.mRemark = "";
        this.mCalendarId = 0L;
        setMsgType(5);
    }

    public long getDateStart() {
        return this.mDateStart;
    }

    public void setDateStart(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d7449090271b65af129c6a100385463", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d7449090271b65af129c6a100385463");
        } else {
            this.mDateStart = j;
        }
    }

    public long getDateEnd() {
        return this.mDateEnd;
    }

    public void setDateEnd(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bab53b539474cceb092cfa613d85b580", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bab53b539474cceb092cfa613d85b580");
        } else {
            this.mDateEnd = j;
        }
    }

    public String getSummary() {
        return this.mSummary;
    }

    public void setSummary(String str) {
        this.mSummary = str;
    }

    public String getLocation() {
        return this.mLocation;
    }

    public void setLocation(String str) {
        this.mLocation = str;
    }

    public String getTrigger() {
        return this.mTrigger;
    }

    public void setTrigger(String str) {
        this.mTrigger = str;
    }

    public String getParticipant() {
        return this.mParticipant;
    }

    public void setParticipant(String str) {
        this.mParticipant = str;
    }

    public String getRemark() {
        return this.mRemark;
    }

    public void setRemark(String str) {
        this.mRemark = str;
    }

    public long getCalendarId() {
        return this.mCalendarId;
    }

    public void setCalendarId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1145b68fcbb61ffb71d9bedcff13622a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1145b68fcbb61ffb71d9bedcff13622a");
        } else {
            this.mCalendarId = j;
        }
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd118fe1b9f97438c4152f09a0deef92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd118fe1b9f97438c4152f09a0deef92");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof CalendarMessage) {
            CalendarMessage calendarMessage = (CalendarMessage) iMMessage;
            calendarMessage.mDateStart = this.mDateStart;
            calendarMessage.mDateEnd = this.mDateEnd;
            calendarMessage.mSummary = this.mSummary;
            calendarMessage.mLocation = this.mLocation;
            calendarMessage.mTrigger = this.mTrigger;
            calendarMessage.mParticipant = this.mParticipant;
            calendarMessage.mRemark = this.mRemark;
            calendarMessage.mCalendarId = this.mCalendarId;
        }
    }
}
