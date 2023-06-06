package com.meituan.msi.api.capturescreen;

import com.dianping.titans.js.jshandler.CaptureJsHandler;
import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class CaptureScreenParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Area area;
    @MsiParamChecker(in = {CaptureJsHandler.CAPTURE_TYPE_DEFAULT, "part"})
    public String mode = CaptureJsHandler.CAPTURE_TYPE_DEFAULT;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public class Area {
        public static ChangeQuickRedirect changeQuickRedirect;
        public double bottom;
        public double left;
        public double right;
        public double top;

        public Area() {
        }
    }
}
