package com.sankuai.xm.imui.session;

import android.content.Context;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import com.sankuai.xm.base.db.b;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.common.panel.SendPanel;
import com.sankuai.xm.imui.session.view.MsgViewAdapterDecorator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        int a(String str);

        com.sankuai.xm.imui.session.entity.b a(IMMessage iMMessage);

        void a(int i, com.sankuai.xm.imui.session.entity.a aVar, int i2);

        void a(IMMessage iMMessage, com.sankuai.xm.im.a<Integer> aVar);

        void b();

        List<com.sankuai.xm.imui.session.entity.b> c();

        void ca_();

        b d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b extends com.sankuai.xm.imui.base.b<a> {
        void a(int i, String str, List<com.sankuai.xm.imui.session.entity.b> list, int i2, boolean z);

        void a(b.a aVar);

        void a(IMMessage iMMessage, com.sankuai.xm.im.a<Integer> aVar);

        @Deprecated
        void a(com.sankuai.xm.imui.session.entity.b bVar, int i);

        void a(String str, String str2, int i, @IntRange(from = 0, to = 100) int i2);

        void a(List<com.sankuai.xm.imui.session.entity.b> list);

        @Deprecated
        void b(int i, com.sankuai.xm.imui.session.entity.b bVar);

        void b(List<com.sankuai.xm.imui.session.entity.b> list);

        boolean b(com.sankuai.xm.imui.session.entity.b bVar);

        Context getContext();

        @NonNull
        MsgViewAdapterDecorator u();

        SendPanel v();

        com.sankuai.xm.imui.session.entity.a w();

        void x();
    }
}
