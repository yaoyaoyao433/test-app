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
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.SyncRead;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.common.widget.ListViewWidgetPanel;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k extends com.sankuai.xm.imui.common.widget.a<com.sankuai.xm.imui.session.entity.b> {
    public static ChangeQuickRedirect c;
    int i;
    boolean j;
    long k;
    String l;
    private long m;
    private int n;

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "290c89bd68d1d94724ffdcbd98e81158", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "290c89bd68d1d94724ffdcbd98e81158");
            return;
        }
        this.m = Long.MAX_VALUE;
        this.k = 0L;
        this.n = -1;
    }

    @Override // com.sankuai.xm.imui.common.widget.b
    public final void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbc48158ca455c67b623186ca037831a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbc48158ca455c67b623186ca037831a");
            return;
        }
        super.b(context);
        com.sankuai.xm.threadpool.scheduler.a.b().b(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.widget.k.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a93a32511a5dfa8276c8af8073ff0c1d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a93a32511a5dfa8276c8af8073ff0c1d");
                    return;
                }
                SessionId f = com.sankuai.xm.imui.b.a().f();
                final SyncRead c2 = IMClient.a().c(f);
                final com.sankuai.xm.im.session.entry.a a2 = IMClient.a().a(f, true);
                final k kVar = k.this;
                Object[] objArr3 = {c2, a2};
                ChangeQuickRedirect changeQuickRedirect3 = k.c;
                if (PatchProxy.isSupport(objArr3, kVar, changeQuickRedirect3, false, "69aa5acb8e8a32de07eebaa82cdd4e07", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, kVar, changeQuickRedirect3, false, "69aa5acb8e8a32de07eebaa82cdd4e07");
                } else {
                    com.sankuai.xm.threadpool.scheduler.a.b().a(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.imui.session.widget.k.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e8a2e1442b4fbf62cf5067b5bc3a1859", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e8a2e1442b4fbf62cf5067b5bc3a1859");
                                return;
                            }
                            if (c2 != null) {
                                k.this.k = c2.getRsts();
                                com.sankuai.xm.im.utils.a.a("TopUnreadWidget.onUnreadMessageCount: got mSdkReadLine=" + k.this.k, new Object[0]);
                            }
                            if (a2 != null) {
                                k.this.i = a2.d;
                            } else {
                                k.this.i = 0;
                            }
                            com.sankuai.xm.im.utils.a.b("TopUnreadWidget.onUnreadMessageCount: initWidgetData, mRemain=" + k.this.i, new Object[0]);
                            if (k.this.i > 10) {
                                if (k.this.b()) {
                                    k.this.d(k.this.c());
                                }
                            } else if (k.this.e != null) {
                                k.this.e.a(k.this);
                            }
                        }
                    }));
                }
            }
        }));
    }

    @Override // com.sankuai.xm.imui.common.widget.b
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a25727a25bbb54f9268b810f5938ed6", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a25727a25bbb54f9268b810f5938ed6");
        }
        TextView textView = (TextView) layoutInflater.inflate(R.layout.xm_sdk_widget_unread_top, viewGroup, false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.session.widget.k.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z;
                int i = 0;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65f061516749f088b36b4ef2aa655f17", 6917529027641081858L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65f061516749f088b36b4ef2aa655f17");
                    return;
                }
                int c2 = k.this.c(0);
                if (c2 < 0) {
                    k.this.a(false);
                    return;
                }
                k.this.i -= c2;
                com.sankuai.xm.im.utils.a.a("TopUnreadWidget: onClick, readLen=%d, , mRemain=%d", Integer.valueOf(c2), Integer.valueOf(k.this.i));
                k kVar = k.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = k.c;
                if (PatchProxy.isSupport(objArr3, kVar, changeQuickRedirect3, false, "8c8d4272afb3446217d6343cbf933bad", 6917529027641081856L)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, kVar, changeQuickRedirect3, false, "8c8d4272afb3446217d6343cbf933bad")).booleanValue();
                } else {
                    String charSequence = ((TextView) kVar.g).getText().toString();
                    if (kVar.l != null && TextUtils.equals(kVar.l, charSequence)) {
                        com.sankuai.xm.im.utils.a.d("TopUnreadWidget.onClickCheck: state equal on click", new Object[0]);
                        kVar.a(false);
                        z = false;
                    } else {
                        kVar.l = charSequence;
                        z = true;
                    }
                }
                if (z) {
                    if (k.this.i > 0) {
                        k.this.j = true;
                        ((ListViewWidgetPanel.a) k.this.h).a(k.this.i);
                        return;
                    }
                    k.this.a(false);
                    k kVar2 = k.this;
                    int abs = Math.abs(k.this.i);
                    Object[] objArr4 = {Integer.valueOf(abs)};
                    ChangeQuickRedirect changeQuickRedirect4 = k.c;
                    if (PatchProxy.isSupport(objArr4, kVar2, changeQuickRedirect4, false, "2ca876a053dd3ee15961aa1465390a8a", 6917529027641081856L)) {
                        i = ((Integer) PatchProxy.accessDispatch(objArr4, kVar2, changeQuickRedirect4, false, "2ca876a053dd3ee15961aa1465390a8a")).intValue();
                    } else {
                        List b = ((ListViewWidgetPanel.a) kVar2.h).b();
                        if (!b.isEmpty()) {
                            int size = b.size();
                            int i2 = abs;
                            int i3 = 0;
                            while (true) {
                                if (i3 < size) {
                                    if (((com.sankuai.xm.imui.session.entity.b) b.get(i3)).b.getMsgType() != 12 && i2 - 1 < 0) {
                                        i = i3;
                                        break;
                                    }
                                    i3++;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    k.this.b(i + 1);
                }
            }
        });
        return textView;
    }

    void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9de629ca38ed3202b7a6e195f8b49c1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9de629ca38ed3202b7a6e195f8b49c1a");
        } else if (this.n == i) {
        } else {
            this.n = i;
            int c2 = c(i);
            if (c2 > 0) {
                this.i -= c2;
                com.sankuai.xm.im.utils.a.a("TopUnreadWidget::onScrollCalculate:readLen=%d, mRemain=%d", Integer.valueOf(c2), Integer.valueOf(this.i));
                g();
            }
        }
    }

    @Override // com.sankuai.xm.imui.common.widget.a
    public final void a(ListViewWidgetPanel.b<com.sankuai.xm.imui.session.entity.b> bVar) {
        int c2;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4276d2b73e2380cb1ebc5e62dddb230", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4276d2b73e2380cb1ebc5e62dddb230");
            return;
        }
        int i = bVar.d;
        if (i == 1) {
            if (this.i <= 0 || a() <= 0 || this.j) {
                return;
            }
            d(c());
            return;
        }
        switch (i) {
            case 3:
                if (com.sankuai.xm.base.util.b.a(bVar.b)) {
                    return;
                }
                for (com.sankuai.xm.imui.session.entity.b bVar2 : bVar.b) {
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bec2b3ce77fd4373540af4c841b9d6ab", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bec2b3ce77fd4373540af4c841b9d6ab");
                    } else if (bVar2 != null && bVar2.b != 0 && bVar2.b.getMsgId() != 0) {
                        com.sankuai.xm.im.utils.a.a("TopUnreadWidget: canceled a read msg, stamp=%l ,msgId=%l, @readLine=%l", Long.valueOf(bVar2.i()), Long.valueOf(bVar2.b.getMsgId()), Long.valueOf(this.m));
                        if (bVar2.i() >= this.k && bVar2.b.getMsgId() < this.m) {
                            this.i--;
                            com.sankuai.xm.im.utils.a.a("TopUnreadWidget: onCancelMessage, current mRemain= %d", Integer.valueOf(this.i));
                            g();
                        }
                    }
                }
                return;
            case 4:
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f6b97a6fde2d20c927c15eb97ff538af", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f6b97a6fde2d20c927c15eb97ff538af");
                    return;
                } else if (!this.j || (c2 = c(0)) <= 0) {
                    return;
                } else {
                    this.i -= c2;
                    com.sankuai.xm.im.utils.a.a("TopUnreadWidget::onPullData, readLen=%d, mRemain=%d", Integer.valueOf(c2), Integer.valueOf(this.i));
                    if (this.i >= 0) {
                        b(0);
                        if (this.i > 0) {
                            a(this.i);
                            return;
                        }
                    } else {
                        b(Math.abs(this.i));
                    }
                    com.sankuai.xm.im.utils.a.a("TopUnreadWidget::onPullData, end", new Object[0]);
                    this.j = false;
                    g();
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.sankuai.xm.imui.common.widget.b
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dcce6afd573990c812cbd6b9b2da798", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dcce6afd573990c812cbd6b9b2da798");
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

    int c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9da55abd5cb573c6db006dcc83c8b6c9", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9da55abd5cb573c6db006dcc83c8b6c9")).intValue();
        }
        List b = ((ListViewWidgetPanel.a) this.h).b();
        int i2 = -1;
        if (com.sankuai.xm.base.util.b.a((Collection<?>) b) || i < 0) {
            return -1;
        }
        com.sankuai.xm.im.utils.a.a("TopUnreadWidget.calculateNewlyReadCount: currentPos=%d, message list size =%d", Integer.valueOf(i), Integer.valueOf(b.size()));
        int size = b.size();
        int i3 = size - 1;
        if (i > i3) {
            i = i3;
        }
        com.sankuai.xm.imui.session.entity.b bVar = (com.sankuai.xm.imui.session.entity.b) b.get(i);
        if (this.m > bVar.b.getMsgId()) {
            i2 = 0;
            while (i < size && ((com.sankuai.xm.imui.session.entity.b) b.get(i)).b.getMsgId() != this.m) {
                if (((com.sankuai.xm.imui.session.entity.b) b.get(i)).b.getMsgType() != 12) {
                    i2++;
                }
                i++;
            }
            this.m = bVar.b.getMsgId();
        }
        com.sankuai.xm.im.utils.a.a("TopUnreadWidget.calculateNewlyReadCount: length=%d", Integer.valueOf(i2));
        return i2;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73d905fd540dab4e0c02541793bc2dff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73d905fd540dab4e0c02541793bc2dff");
        } else if (this.g == null || this.f == null) {
        } else {
            if (this.i > 0) {
                ((TextView) this.g).setText(this.f.getString(R.string.xm_sdk_msg_unread, Integer.valueOf(this.i)));
                a(true);
                return;
            }
            a(false);
        }
    }
}
