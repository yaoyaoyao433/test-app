package com.meituan.msc;

import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.metrics.traffic.trace.TraceSQLHelper;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.views.ReactRootView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final Map<Integer, String> b = com.meituan.msc.jse.common.a.c().a(23, Constants.SQLConstants.KEY_SELECT).a(66, Constants.SQLConstants.KEY_SELECT).a(62, Constants.SQLConstants.KEY_SELECT).a(85, "playPause").a(89, "rewind").a(90, "fastForward").a(19, TraceSQLHelper.KEY_UP).a(22, "right").a(20, TraceSQLHelper.KEY_DOWN).a(21, "left").a();
    public int c;
    private final ReactRootView d;

    public a(ReactRootView reactRootView) {
        Object[] objArr = {reactRootView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "349f98ab4381fc3cf92bba5b0520ceb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "349f98ab4381fc3cf92bba5b0520ceb2");
            return;
        }
        this.c = -1;
        this.d = reactRootView;
    }

    public void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2e3181c44b7bc44773e1cb52800e735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2e3181c44b7bc44773e1cb52800e735");
        } else {
            a(str, i, -1);
        }
    }

    public void a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30f3cde800262e473eb880abb5f7651c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30f3cde800262e473eb880abb5f7651c");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("eventType", str);
        createMap.putInt("eventKeyAction", i2);
        if (i != -1) {
            createMap.putInt("tag", i);
        }
        this.d.sendEvent("onHWKeyEvent", createMap);
    }
}
