package com.meituan.android.common.aidata.data;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class DBStatus {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String auto_vacuum_mode;
    public float db_disk_size_after_delete;
    public float db_disk_size_after_vacuum;
    public float db_disk_size_before_delete;
    public long db_vacuum_duration;
    public long total_event_data_count_before_delete;
    public long total_gesture_data_count_before_delete;
    public int vacuum_executed;
    public long total_event_data_count_after_delete = -1;
    public long total_gesture_data_count_after_delete = -1;
}
