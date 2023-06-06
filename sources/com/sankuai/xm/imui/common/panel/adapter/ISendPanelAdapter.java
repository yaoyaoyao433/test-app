package com.sankuai.xm.imui.common.panel.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface ISendPanelAdapter {
    public static final int INPUT_STATE_FORBIDDEN = 2;
    public static final int INPUT_STATE_NORMAL = 1;

    View createView(Context context, ViewGroup viewGroup);

    void destroy();

    void onInputStateChange(int i, Object obj);

    boolean onPluginEvent(Plugin plugin, int i, Object obj);
}
