package com.facebook.debug.tags;

import android.graphics.Color;
import com.tencent.smtt.sdk.TbsListener;
import io.agora.rtc.Constants;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static final com.facebook.debug.debugoverlay.model.a a = new com.facebook.debug.debugoverlay.model.a("Performance", "Markers for Performance", -16711936);
    public static final com.facebook.debug.debugoverlay.model.a b = new com.facebook.debug.debugoverlay.model.a("Navigation", "Tag for navigation", Color.rgb((int) Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED, 39, (int) TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_6));
    public static final com.facebook.debug.debugoverlay.model.a c = new com.facebook.debug.debugoverlay.model.a("RN Core", "Tag for React Native Core", -16777216);
    public static final com.facebook.debug.debugoverlay.model.a d = new com.facebook.debug.debugoverlay.model.a("Bridge Calls", "JS to Java calls (warning: this is spammy)", -65281);
    public static final com.facebook.debug.debugoverlay.model.a e = new com.facebook.debug.debugoverlay.model.a("Native Module", "Native Module init", Color.rgb(128, 0, 128));
    public static final com.facebook.debug.debugoverlay.model.a f = new com.facebook.debug.debugoverlay.model.a("UI Manager", "UI Manager View Operations (requires restart\nwarning: this is spammy)", -16711681);
    public static final com.facebook.debug.debugoverlay.model.a g = new com.facebook.debug.debugoverlay.model.a("FabricUIManager", "Fabric UI Manager View Operations", -16711681);
    public static final com.facebook.debug.debugoverlay.model.a h = new com.facebook.debug.debugoverlay.model.a("FabricReconciler", "Reconciler for Fabric", -16711681);
    public static final com.facebook.debug.debugoverlay.model.a i = new com.facebook.debug.debugoverlay.model.a("Relay", "including prefetching", Color.rgb(255, (int) Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED, 0));
}
