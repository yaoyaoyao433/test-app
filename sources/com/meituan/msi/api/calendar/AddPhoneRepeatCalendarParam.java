package com.meituan.msi.api.calendar;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.api.component.picker.bean.DatePickerParam;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class AddPhoneRepeatCalendarParam extends AddPhoneCalendarParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Long repeatEndTime;
    public String repeatInterval = DatePickerParam.FIELD_MONTH;
}
