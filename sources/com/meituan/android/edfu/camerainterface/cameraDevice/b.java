package com.meituan.android.edfu.camerainterface.cameraDevice;

import android.hardware.Camera;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final Pattern b = Pattern.compile(";");

    public static void a(Camera.Parameters parameters, boolean z, boolean z2, boolean z3) {
        Object[] objArr = {parameters, (byte) 1, (byte) 1, Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fec57418d020f753da6cc616a03ffb94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fec57418d020f753da6cc616a03ffb94");
            return;
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String a2 = a("focus mode", supportedFocusModes, FpsEvent.TYPE_SCROLL_AUTO);
        if (!z3 && a2 == null) {
            a2 = a("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (a2 != null) {
            if (a2.equals(parameters.getFocusMode())) {
                new StringBuilder("Focus mode already set to ").append(a2);
            } else {
                parameters.setFocusMode(a2);
            }
        }
    }

    private static String a(String str, Collection<String> collection, String... strArr) {
        Object[] objArr = {str, collection, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "889e31610b3e92fed66c7196fd4e969e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "889e31610b3e92fed66c7196fd4e969e");
        }
        StringBuilder sb = new StringBuilder("Requesting ");
        sb.append(str);
        sb.append(" value from among: ");
        sb.append(Arrays.toString(strArr));
        StringBuilder sb2 = new StringBuilder("Supported ");
        sb2.append(str);
        sb2.append(" values: ");
        sb2.append(collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    StringBuilder sb3 = new StringBuilder("Can set ");
                    sb3.append(str);
                    sb3.append(" to: ");
                    sb3.append(str2);
                    return str2;
                }
            }
        }
        return null;
    }
}
