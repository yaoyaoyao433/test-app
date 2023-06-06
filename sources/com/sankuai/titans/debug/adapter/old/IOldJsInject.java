package com.sankuai.titans.debug.adapter.old;

import android.app.Activity;
import android.view.View;
import com.sankuai.titans.debug.adapter.plugin.JsInjectEntity;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IOldJsInject {
    View getDebugView(Activity activity, List<JsInjectEntity> list);

    void onPageFinish(boolean z, List<JsInjectEntity> list, ILoadJs iLoadJs);
}
