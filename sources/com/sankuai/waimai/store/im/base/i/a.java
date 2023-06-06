package com.sankuai.waimai.store.im.base.i;

import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a extends b {
    void a(int i, String str, List<com.sankuai.xm.imui.session.entity.b> list, int i2, boolean z);

    void a(List<com.sankuai.xm.imui.session.entity.b> list);

    boolean a(int i, com.sankuai.xm.imui.session.entity.b bVar);

    boolean a(com.sankuai.xm.imui.session.entity.b bVar);

    TitleBarAdapter f();

    IBannerAdapter g();

    IMsgViewAdapter j();

    ISendPanelAdapter l();
}
