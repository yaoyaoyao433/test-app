package com.meituan.msi.api.calendar;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class AddPhoneCalendarParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public MtParam _mt;
    public int alarmOffset;
    public boolean allDay;
    public String description;
    public long endTime;
    public String location;
    @MsiParamChecker(required = true)
    public long startTime;
    @MsiParamChecker(required = true)
    public String title;
    public boolean switchToCalendar = true;
    public boolean alarm = true;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class MtParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String sceneToken;
    }
}
