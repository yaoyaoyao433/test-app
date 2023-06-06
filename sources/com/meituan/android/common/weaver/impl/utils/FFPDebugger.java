package com.meituan.android.common.weaver.impl.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.common.weaver.impl.natives.PagePathHelper;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FFPDebugger {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static FFPDebugger debuger;
    private static final FFPDebugger sEmpty = new FFPDebugger();

    public void detectBlank(@NonNull PagePathHelper pagePathHelper, boolean z, @Nullable Bitmap bitmap) {
    }

    public void hideDebugView(Activity activity) {
    }

    public void highLightView(Context context, HashSet<View> hashSet) {
    }

    public boolean isBlanksDebug() {
        return false;
    }

    public void onStartActivity(long j) {
    }

    public void showDebugView(Activity activity, Object... objArr) {
    }

    public static FFPDebugger getFFPDebugger() {
        return debuger == null ? sEmpty : debuger;
    }

    public static boolean isDebug() {
        return (debuger == null && Weaver.sTracer == null) ? false : true;
    }
}
