package com.sankuai.xm.imui.common.adapter;

import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.group.b;
import com.sankuai.xm.im.f;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.controller.group.a;
import com.sankuai.xm.imui.controller.group.bean.GroupAnnouncement;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GroupAnnouncementAdapter implements IBannerAdapter, a {
    public static ChangeQuickRedirect a;
    View b;
    SessionId c;
    GroupAnnouncement d;
    b e;
    private TextView f;

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public boolean isOverlay() {
        return true;
    }

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "926057460c027ef64375c0021b714272", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "926057460c027ef64375c0021b714272");
        }
        this.b = layoutInflater.inflate(R.layout.xm_sdk_widget_group_announcement, viewGroup, false);
        this.f = (TextView) this.b.findViewById(R.id.text);
        this.b.setVisibility(8);
        ImageView imageView = (ImageView) this.b.findViewById(R.id.close);
        this.c = com.sankuai.xm.imui.b.a().f();
        this.e = (b) m.a(b.class);
        if (this.c != null && this.e != null) {
            this.e.a(this.c.g, this);
        }
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.common.adapter.GroupAnnouncementAdapter.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed6654be01fd338c72b0bac8288ac1d2", 6917529027641081858L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed6654be01fd338c72b0bac8288ac1d2");
                    return;
                }
                GroupAnnouncementAdapter groupAnnouncementAdapter = GroupAnnouncementAdapter.this;
                View view2 = GroupAnnouncementAdapter.this.b;
                GroupAnnouncement groupAnnouncement = GroupAnnouncementAdapter.this.d;
                Object[] objArr3 = {view2, groupAnnouncement};
                ChangeQuickRedirect changeQuickRedirect3 = GroupAnnouncementAdapter.a;
                if (PatchProxy.isSupport(objArr3, groupAnnouncementAdapter, changeQuickRedirect3, false, "fcd3a1985d34635fa383b016fa737734", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, groupAnnouncementAdapter, changeQuickRedirect3, false, "fcd3a1985d34635fa383b016fa737734");
                } else if (groupAnnouncementAdapter.e != null) {
                    groupAnnouncementAdapter.e.a(groupAnnouncementAdapter.c, groupAnnouncement);
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.common.adapter.GroupAnnouncementAdapter.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "525405c00f9944e0a18314bb68f1d0d3", 6917529027641081858L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "525405c00f9944e0a18314bb68f1d0d3");
                    return;
                }
                GroupAnnouncementAdapter groupAnnouncementAdapter = GroupAnnouncementAdapter.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = GroupAnnouncementAdapter.a;
                if (PatchProxy.isSupport(objArr3, groupAnnouncementAdapter, changeQuickRedirect3, false, "3e1ce65676b7aaac9c84b2bb7af5ed2a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr3, groupAnnouncementAdapter, changeQuickRedirect3, false, "3e1ce65676b7aaac9c84b2bb7af5ed2a");
                    return;
                }
                if (groupAnnouncementAdapter.e != null) {
                    groupAnnouncementAdapter.e.a(com.sankuai.xm.imui.b.a().f(), (GroupAnnouncement) null);
                }
                groupAnnouncementAdapter.b.setVisibility(8);
            }
        });
        a();
        return this.b;
    }

    @Override // com.sankuai.xm.imui.common.adapter.IBannerAdapter
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "210b084e8d43d3cc3acb168cab661a32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "210b084e8d43d3cc3acb168cab661a32");
        } else if (this.c == null || this.e == null) {
        } else {
            this.e.b(this.c.g, this);
        }
    }

    @Override // com.sankuai.xm.imui.controller.group.a
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc6437c4c519badb98726ed170331d83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc6437c4c519badb98726ed170331d83");
        } else if (this.c == null || j != this.c.b) {
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e32e391ad8af5c2ef4b20bbd1f6a698b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e32e391ad8af5c2ef4b20bbd1f6a698b");
        } else if (this.c == null || this.c.e != 2 || this.e == null) {
        } else {
            this.e.b(this.c, false, new f<GroupAnnouncement>() { // from class: com.sankuai.xm.imui.common.adapter.GroupAnnouncementAdapter.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.f
                public final /* synthetic */ void a(GroupAnnouncement groupAnnouncement) {
                    GroupAnnouncement groupAnnouncement2 = groupAnnouncement;
                    Object[] objArr2 = {groupAnnouncement2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aeafde323366be75ddb97790b7030f41", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aeafde323366be75ddb97790b7030f41");
                        return;
                    }
                    GroupAnnouncementAdapter.this.d = groupAnnouncement2;
                    if (groupAnnouncement2 == null || groupAnnouncement2.isRead() || TextUtils.isEmpty(groupAnnouncement2.getContent())) {
                        GroupAnnouncementAdapter.this.b.setVisibility(8);
                        return;
                    }
                    GroupAnnouncementAdapter.this.f.setText(groupAnnouncement2.getContent());
                    GroupAnnouncementAdapter.this.b.setVisibility(0);
                }

                @Override // com.sankuai.xm.im.f
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a3d5e10769a02691efa4a6d6a1229ce", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a3d5e10769a02691efa4a6d6a1229ce");
                        return;
                    }
                    GroupAnnouncementAdapter.this.d = null;
                    GroupAnnouncementAdapter.this.b.setVisibility(8);
                }
            });
        }
    }
}
