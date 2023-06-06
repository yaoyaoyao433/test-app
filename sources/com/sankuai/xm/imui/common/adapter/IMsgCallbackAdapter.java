package com.sankuai.xm.imui.common.adapter;

import com.sankuai.xm.imui.session.entity.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IMsgCallbackAdapter {
    void onLoadMessageFinished(boolean z);

    boolean onPostSendMessage(int i, b bVar);

    boolean onPreSendMessage(b bVar);

    void onQueryMessageListResult(int i, List<b> list);
}
