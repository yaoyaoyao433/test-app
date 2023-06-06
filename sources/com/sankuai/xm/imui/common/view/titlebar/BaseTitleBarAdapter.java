package com.sankuai.xm.imui.common.view.titlebar;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.sankuai.xm.imui.theme.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface BaseTitleBarAdapter {
    View createView(Context context, ViewGroup viewGroup);

    void onAttach(Activity activity);

    void onDetach();

    void onThemeChanged(b bVar);
}
