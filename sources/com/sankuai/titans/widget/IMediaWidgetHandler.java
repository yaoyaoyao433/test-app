package com.sankuai.titans.widget;

import android.app.Activity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IMediaWidgetHandler {
    public static final String WIDGET_MEDIA_PICKER = "MediaPicker";
    public static final String WIDGET_MEDIA_PLAYER = "MediaPlayer";

    boolean isWidgetEnabled(String str);

    void openMediaPicker(Activity activity, PickerBuilder pickerBuilder);

    void openMediaPlayer(Activity activity, PlayerBuilder playerBuilder);
}
