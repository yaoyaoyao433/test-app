package com.meituan.msi.api.component.picker.bean;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class TimePickerParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String current;
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
