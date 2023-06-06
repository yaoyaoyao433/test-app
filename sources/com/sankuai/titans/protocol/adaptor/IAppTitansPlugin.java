package com.sankuai.titans.protocol.adaptor;

import android.support.annotation.NonNull;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IAppTitansPlugin {
    Map<String, ITitansPlugin> getBusinessPlugins();

    @NonNull
    List<ITitansPlugin> getTailPlugins();

    @NonNull
    List<ITitansPlugin> getTopPlugins();
}
