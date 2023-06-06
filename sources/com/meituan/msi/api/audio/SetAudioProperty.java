package com.meituan.msi.api.audio;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class SetAudioProperty {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean autoplay;
    public boolean loop;
    public String src;
    public float startTime;
    public float volume = 1.0f;
    public float playbackRate = -1.0f;
}
