package com.sankuai.xm.imui.session.widget;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.SyncRead;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.common.widget.ListViewWidgetPanel;
import com.sankuai.xm.imui.controller.group.bean.AtMeInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends com.sankuai.xm.imui.common.widget.a<com.sankuai.xm.imui.session.entity.b> {
    public static ChangeQuickRedirect c;
    boolean i;
    long j;
    long k;
    String l;
    List<com.sankuai.xm.imui.session.entity.b> m;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8313f779f25e9afaed00365d5b8826e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8313f779f25e9afaed00365d5b8826e5");
            return;
        }
        this.i = false;
        this.j = 0L;
        this.k = Long.MAX_VALUE;
        com.sankuai.xm.threadpool.scheduler.a.b().b(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.widget.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27b1f389d815dacbf3ded7cbe13f5d14", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27b1f389d815dacbf3ded7cbe13f5d14");
                    return;
                }
                SessionId f = com.sankuai.xm.imui.b.a().f();
                SyncRead c2 = IMClient.a().c(f);
                if (c2 != null) {
                    a.this.j = c2.getRsts();
                    com.sankuai.xm.im.utils.a.a("AtWidget got mSdkReadLine=" + a.this.j, new Object[0]);
                }
                final a aVar = a.this;
                Object[] objArr3 = {f};
                ChangeQuickRedirect changeQuickRedirect3 = a.c;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "045b8ad8331e90288ad8e429475d5b2d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "045b8ad8331e90288ad8e429475d5b2d");
                } else {
                    ((com.sankuai.xm.ui.service.c) m.a(com.sankuai.xm.ui.service.c.class)).a(f, new com.sankuai.xm.im.f<List<AtMeInfo>>() { // from class: com.sankuai.xm.imui.session.widget.a.3
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.xm.im.f
                        public final /* synthetic */ void a(List<AtMeInfo> list) {
                            com.sankuai.xm.imui.session.entity.b a2;
                            List<AtMeInfo> list2 = list;
                            Object[] objArr4 = {list2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "efa77ab29b37168d21df5b15f0497049", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "efa77ab29b37168d21df5b15f0497049");
                            } else if (!com.sankuai.xm.base.util.b.a(list2)) {
                                a.this.m = new ArrayList();
                                for (AtMeInfo atMeInfo : list2) {
                                    if (atMeInfo != null && atMeInfo.getTimeStamp() > a.this.j && atMeInfo.getMsgId() != 0) {
                                        List<com.sankuai.xm.imui.session.entity.b> list3 = a.this.m;
                                        Object[] objArr5 = {atMeInfo};
                                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.xm.imui.common.util.e.a;
                                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "e63b669e04d50ea2065f0014689ee9d5", 6917529027641081856L)) {
                                            a2 = (com.sankuai.xm.imui.session.entity.b) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "e63b669e04d50ea2065f0014689ee9d5");
                                        } else {
                                            TextMessage textMessage = new TextMessage();
                                            textMessage.setMsgUuid(atMeInfo.getUuid());
                                            textMessage.setMsgId(atMeInfo.getMsgId());
                                            textMessage.setChatId(atMeInfo.getGid());
                                            textMessage.setFromUid(atMeInfo.getFromUid());
                                            textMessage.setFromName(atMeInfo.getFromName());
                                            textMessage.setSts(atMeInfo.getTimeStamp());
                                            textMessage.setCategory(2);
                                            a2 = com.sankuai.xm.imui.common.util.e.a(textMessage);
                                        }
                                        list3.add(a2);
                                    }
                                }
                                com.sankuai.xm.im.utils.a.b("AtWidget::findAtMessages at me list size = %s", Integer.valueOf(com.sankuai.xm.base.util.b.b(a.this.m)));
                                if (a.this.m.size() > 0) {
                                    Collections.sort(a.this.m);
                                    if (a.this.b()) {
                                        a.this.a(a.this.c(), a.this.d());
                                    }
                                }
                            }
                        }

                        @Override // com.sankuai.xm.im.f
                        public final void a(int i, String str) {
                            Object[] objArr4 = {Integer.valueOf(i), str};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4eacf45d39b1e5a8ca619bfbb2d490f5", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4eacf45d39b1e5a8ca619bfbb2d490f5");
                            } else {
                                com.sankuai.xm.imui.common.util.d.d("AtWidget::findAtMessages::onFailureOnUIThread code %s, msg: %s", Integer.valueOf(i), str);
                            }
                        }
                    });
                }
                com.sankuai.xm.im.utils.a.b("AtWidget::AtWidget at me list size = %s", Integer.valueOf(com.sankuai.xm.base.util.b.b(a.this.m)));
                com.sankuai.xm.ui.service.c cVar = (com.sankuai.xm.ui.service.c) m.a(com.sankuai.xm.ui.service.c.class);
                if (cVar != null) {
                    cVar.a(f);
                }
            }
        }));
    }

    @Override // com.sankuai.xm.imui.common.widget.b
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8121a5262c95894e9d1fd21951515321", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8121a5262c95894e9d1fd21951515321");
        }
        View inflate = layoutInflater.inflate(R.layout.xm_sdk_widget_at, viewGroup, false);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.session.widget.a.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2eb0722553a86dc65c987444962f122f", 6917529027641081858L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2eb0722553a86dc65c987444962f122f");
                    return;
                }
                a aVar = a.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.c;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "d3661ea2c9f2ef25474280930a8fc415", 6917529027641081856L)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "d3661ea2c9f2ef25474280930a8fc415")).booleanValue();
                } else {
                    String charSequence = ((TextView) aVar.g).getText().toString();
                    if (aVar.l == null || !TextUtils.equals(aVar.l, charSequence)) {
                        aVar.l = charSequence;
                        z = true;
                    } else {
                        com.sankuai.xm.imui.common.util.d.d("AtWidget::onClickCheck: state equal on click", new Object[0]);
                        aVar.a(false);
                        z = false;
                    }
                }
                if (z && a.this.a() > 0 && a.this.m != null && a.this.m.size() > 0) {
                    com.sankuai.xm.imui.session.entity.b bVar = a.this.m.get(0);
                    long g = a.this.g();
                    if (g > bVar.b.getMsgId()) {
                        a.this.i = true;
                        a.this.k = g;
                        com.sankuai.xm.imui.common.util.d.b("AtWidget::onClick, start pulling with line %d", Long.valueOf(a.this.k));
                        a.this.a(a.this.b);
                        return;
                    }
                    int indexOf = ((ListViewWidgetPanel.a) a.this.h).b().indexOf(bVar) + 1;
                    if (indexOf > 0) {
                        a.this.b(indexOf);
                    }
                }
            }
        });
        return inflate;
    }

    @Override // com.sankuai.xm.imui.common.widget.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0341f90b6571674cef16cca96e0765fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0341f90b6571674cef16cca96e0765fd");
            return;
        }
        com.sankuai.xm.ui.service.c cVar = (com.sankuai.xm.ui.service.c) m.a(com.sankuai.xm.ui.service.c.class);
        if (cVar != null) {
            cVar.a(com.sankuai.xm.imui.b.a().f());
        }
        super.f();
    }

    @Override // com.sankuai.xm.imui.common.widget.a
    public final void a(ListViewWidgetPanel.b<com.sankuai.xm.imui.session.entity.b> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "141c450ca1b510a1e269c11de85ccdfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "141c450ca1b510a1e269c11de85ccdfe");
            return;
        }
        super.a(bVar);
        int i = bVar.d;
        if (i == 1) {
            if (com.sankuai.xm.base.util.b.a(this.m)) {
                return;
            }
            a(c(), d());
            return;
        }
        switch (i) {
            case 3:
                if (com.sankuai.xm.base.util.b.a(this.m) || !this.m.removeAll(bVar.b)) {
                    return;
                }
                h();
                return;
            case 4:
                if (com.sankuai.xm.base.util.b.a(this.m) || !this.i) {
                    return;
                }
                com.sankuai.xm.imui.session.entity.b bVar2 = this.m.get(0);
                long g = g();
                if (g > bVar2.b.getMsgId() && !com.sankuai.xm.base.util.b.a(bVar.b)) {
                    if (this.k > g) {
                        this.k = g;
                        a(this.b);
                        return;
                    }
                    return;
                }
                this.i = false;
                int indexOf = ((ListViewWidgetPanel.a) this.h).b().indexOf(bVar2) + 1;
                if (indexOf > 0) {
                    b(indexOf);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d0e2e3aea156e6f11be5ac0ca1663b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d0e2e3aea156e6f11be5ac0ca1663b5");
        } else {
            com.sankuai.xm.threadpool.scheduler.a.b().a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.widget.a.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "133cbe54411681e3a246293c6bbe847a", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "133cbe54411681e3a246293c6bbe847a");
                        return;
                    }
                    Context context = a.this.f;
                    if (context == null) {
                        return;
                    }
                    if (a.this.m != null && a.this.m.size() > 0) {
                        a.this.a(true);
                        ((TextView) a.this.g).setText(context.getString(R.string.xm_sdk_msg_shoot_me, Integer.valueOf(a.this.m.size())));
                        return;
                    }
                    a.this.a(false);
                }
            }));
        }
    }

    @Override // com.sankuai.xm.imui.common.widget.b
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "951a504990fd1cad58d6374ce9656c1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "951a504990fd1cad58d6374ce9656c1c");
        } else if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f, R.anim.xm_sdk_push_left_in);
            loadAnimation.setDuration(500L);
            loadAnimation.setStartOffset(500L);
            this.g.startAnimation(loadAnimation);
        } else {
            Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f, R.anim.xm_sdk_push_right_out);
            loadAnimation2.setDuration(400L);
            loadAnimation2.setStartOffset(100L);
            this.g.startAnimation(loadAnimation2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8de4f46db6850c02f54a8a63f85a667a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8de4f46db6850c02f54a8a63f85a667a");
            return;
        }
        List b = ((ListViewWidgetPanel.a) this.h).b();
        if (com.sankuai.xm.base.util.b.a((Collection<?>) b) || i < 0 || i2 > b.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int min = Math.min(i2, b.size());
        while (i < min) {
            arrayList.add(b.get(i));
            i++;
        }
        if (arrayList.size() > 0) {
            this.m.removeAll(arrayList);
        }
        h();
    }

    long g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b82e6526c382287ff2022bd3309c956", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b82e6526c382287ff2022bd3309c956")).longValue();
        }
        List<com.sankuai.xm.imui.session.entity.b> b = ((ListViewWidgetPanel.a) this.h).b();
        if (com.sankuai.xm.base.util.b.a((Collection<?>) b)) {
            return Long.MAX_VALUE;
        }
        for (com.sankuai.xm.imui.session.entity.b bVar : b) {
            if (bVar != null && bVar.b.getMsgId() != 0 && bVar.b.getMsgStatus() != 4) {
                return bVar.b.getMsgId();
            }
        }
        return Long.MAX_VALUE;
    }
}
