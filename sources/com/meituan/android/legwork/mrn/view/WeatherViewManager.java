package com.meituan.android.legwork.mrn.view;

import android.support.annotation.NonNull;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ao;
import com.meituan.android.legwork.ui.view.LegworkWeatherView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WeatherViewManager extends ViewGroupManager<LegworkWeatherView> {
    private static final String HOT = "hot";
    private static final String NONE = "none";
    private static final String RAIN = "rain";
    private static final String SAND = "sand";
    private static final String SMOG = "smog";
    private static final String SNOW = "snow";
    private static final String WIND = "wind";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "MRNWeatherView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public LegworkWeatherView createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7609f071a2578fc7b477508b8191091", RobustBitConfig.DEFAULT_VALUE)) {
            return (LegworkWeatherView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7609f071a2578fc7b477508b8191091");
        }
        com.meituan.android.legwork.utils.j.a(aoVar.getApplicationContext());
        LegworkWeatherView legworkWeatherView = new LegworkWeatherView(aoVar);
        aoVar.addLifecycleEventListener(legworkWeatherView);
        return legworkWeatherView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull LegworkWeatherView legworkWeatherView) {
        Object[] objArr = {legworkWeatherView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d2d40b0a42ee067af5ef78503ba50b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d2d40b0a42ee067af5ef78503ba50b2");
            return;
        }
        super.onDropViewInstance((WeatherViewManager) legworkWeatherView);
        if (legworkWeatherView.getContext() instanceof ao) {
            ((ao) legworkWeatherView.getContext()).removeLifecycleEventListener(legworkWeatherView);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r21.equals(com.meituan.android.legwork.mrn.view.WeatherViewManager.SAND) != false) goto L11;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "weatherType")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setWeather(@javax.annotation.Nonnull com.meituan.android.legwork.ui.view.LegworkWeatherView r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.mrn.view.WeatherViewManager.setWeather(com.meituan.android.legwork.ui.view.LegworkWeatherView, java.lang.String):void");
    }
}
