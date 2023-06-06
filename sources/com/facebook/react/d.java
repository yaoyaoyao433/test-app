package com.facebook.react;

import com.facebook.react.bridge.WritableNativeMap;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.metrics.traffic.trace.TraceSQLHelper;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    static final Map<Integer, String> a = com.facebook.react.common.c.b().a(23, Constants.SQLConstants.KEY_SELECT).a(66, Constants.SQLConstants.KEY_SELECT).a(62, Constants.SQLConstants.KEY_SELECT).a(85, "playPause").a(89, "rewind").a(90, "fastForward").a(19, TraceSQLHelper.KEY_UP).a(22, "right").a(20, TraceSQLHelper.KEY_DOWN).a(21, "left").a();
    int b = -1;
    private final ReactRootView c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(ReactRootView reactRootView) {
        this.c = reactRootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, int i, int i2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        writableNativeMap.putInt("eventKeyAction", i2);
        if (i != -1) {
            writableNativeMap.putInt("tag", i);
        }
        this.c.sendEvent("onHWKeyEvent", writableNativeMap);
    }
}
