package com.meituan.msc.jse.bridge;

import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
@DoNotStrip
@Deprecated
/* loaded from: classes3.dex */
public class ReactSoftException {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final List<ReactSoftExceptionListener> sListeners = new CopyOnWriteArrayList();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface ReactSoftExceptionListener {
        void logSoftException(String str, Throwable th);
    }

    @DoNotStrip
    public static void addListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        Object[] objArr = {reactSoftExceptionListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d2427bbff68be5d2af44c95a2566e97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d2427bbff68be5d2af44c95a2566e97");
        } else if (sListeners.contains(reactSoftExceptionListener)) {
        } else {
            sListeners.add(reactSoftExceptionListener);
        }
    }

    @DoNotStrip
    public static void removeListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        Object[] objArr = {reactSoftExceptionListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f4819e166459941e72897c680ac23b0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f4819e166459941e72897c680ac23b0b");
        } else {
            sListeners.remove(reactSoftExceptionListener);
        }
    }

    @DoNotStrip
    public static void clearListeners() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d4bc3d37f66655b30582c441500cd455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d4bc3d37f66655b30582c441500cd455");
        } else {
            sListeners.clear();
        }
    }

    @DoNotStrip
    public static void logSoftException(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9ba3396879861064574a3ca9ba36052", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9ba3396879861064574a3ca9ba36052");
        } else if (sListeners.size() <= 0) {
            g.d(str, "Unhandled SoftException", th);
        } else {
            for (ReactSoftExceptionListener reactSoftExceptionListener : sListeners) {
                reactSoftExceptionListener.logSoftException(str, th);
            }
        }
    }
}
