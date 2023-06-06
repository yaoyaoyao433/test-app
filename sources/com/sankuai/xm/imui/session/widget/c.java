package com.sankuai.xm.imui.session.widget;

import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.widget.ListViewWidgetPanel;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends com.sankuai.xm.imui.common.widget.a<com.sankuai.xm.imui.session.entity.b> {
    public static ChangeQuickRedirect c;
    private int i;
    private long j;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcaf3d9f4505f98117053b05f8dbf22d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcaf3d9f4505f98117053b05f8dbf22d");
            return;
        }
        this.i = 0;
        this.j = -1L;
    }

    @Override // com.sankuai.xm.imui.common.widget.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c19b887b5f32d282c749c00e372bcbc8", 6917529027641081856L)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c19b887b5f32d282c749c00e372bcbc8");
        }
        TextView textView = (TextView) layoutInflater.inflate(R.layout.xm_sdk_widget_unread_bottom, viewGroup, false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.session.widget.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e40aa37fcc5b5ab0d711c3ca14f8891b", 6917529027641081858L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e40aa37fcc5b5ab0d711c3ca14f8891b");
                    return;
                }
                c.this.a(false);
                if (c.this.h == 0) {
                    return;
                }
                c.this.b(c.this.a());
            }
        });
        return textView;
    }

    @Override // com.sankuai.xm.imui.common.widget.b
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24b5dc0c2f2640f67616b42df63a34fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24b5dc0c2f2640f67616b42df63a34fe");
        } else if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.g.getContext(), R.anim.xm_sdk_push_up_in);
            loadAnimation.setDuration(500L);
            this.g.startAnimation(loadAnimation);
        }
    }

    @Override // com.sankuai.xm.imui.common.widget.a
    public final void a(ListViewWidgetPanel.b<com.sankuai.xm.imui.session.entity.b> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42f852fbe9f28caa9a7221d696d030c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42f852fbe9f28caa9a7221d696d030c5");
            return;
        }
        switch (bVar.d) {
            case 1:
            case 2:
                int d = d();
                Object[] objArr2 = {Integer.valueOf(d)};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1fb34f5414736d02b83b5919974e4720", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1fb34f5414736d02b83b5919974e4720");
                    return;
                }
                c(d);
                if (this.i > 0) {
                    com.sankuai.xm.imui.common.util.d.a("BottomUnreadWidget", "onListScroll, mTotalNumber=" + this.i);
                    a(true);
                    ((TextView) this.g).setText(this.i > 99 ? "99+" : String.valueOf(this.i));
                    return;
                }
                a(false);
                return;
            default:
                return;
        }
    }

    private void c(int i) {
        int i2 = 0;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e14fb812fd5ad5954b9aaafd67336ad7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e14fb812fd5ad5954b9aaafd67336ad7");
        } else if (i < 0 || this.h == 0) {
        } else {
            List b = ((ListViewWidgetPanel.a) this.h).b();
            if (com.sankuai.xm.base.util.b.a((Collection<?>) b)) {
                return;
            }
            int size = b.size();
            if (this.j == -1) {
                com.sankuai.xm.imui.common.util.d.a("BottomUnreadWidget", "init var mReadIdLine, size=" + b.size() + ", currentPos=" + i);
                int i3 = 1;
                do {
                    this.j = ((com.sankuai.xm.imui.session.entity.b) b.get(size - i3)).b.getMsgId();
                    i3++;
                    if (this.j > 0) {
                        break;
                    }
                } while (i3 <= size);
            }
            int i4 = size - 1;
            if (i > i4) {
                i = i4;
            }
            com.sankuai.xm.imui.session.entity.b bVar = (com.sankuai.xm.imui.session.entity.b) b.get(i);
            if (this.j < bVar.b.getMsgId()) {
                int i5 = i + 1;
                if (i5 < size) {
                    while (i5 < size) {
                        M m = ((com.sankuai.xm.imui.session.entity.b) b.get(i5)).b;
                        if (m.getMsgType() != 12 && m.getFromUid() != IMUIManager.a().e() && m.getMsgId() != 0) {
                            i2++;
                        }
                        i5++;
                    }
                }
                this.j = bVar.b.getMsgId();
            } else {
                while (i < size) {
                    M m2 = ((com.sankuai.xm.imui.session.entity.b) b.get(i)).b;
                    if (m2.getMsgId() > this.j && m2.getMsgType() != 12 && m2.getFromUid() != IMUIManager.a().e() && m2.getMsgId() != 0) {
                        i2++;
                    }
                    i++;
                }
            }
            this.i = i2;
        }
    }
}
