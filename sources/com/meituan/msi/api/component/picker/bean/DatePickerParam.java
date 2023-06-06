package com.meituan.msi.api.component.picker.bean;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class DatePickerParam {
    public static final String FIELD_DAY = "day";
    public static final String FIELD_MONTH = "month";
    public static final String FIELD_YEAR = "year";
    public static ChangeQuickRedirect changeQuickRedirect;
    public String current;
    public String fields;
    public Range range;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class Range {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String end;
        public String start;
    }
}
