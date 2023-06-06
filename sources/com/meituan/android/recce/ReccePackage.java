package com.meituan.android.recce;

import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.recce.bridge.RecceCustomApi;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface ReccePackage {
    Map<String, RecceCustomApi> getCustomApis();

    List<ViewManager> registerViewManagers(b bVar);
}
