package com.sankuai.waimai.business.restaurant.poicontainer.comment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.comment.g;
import com.sankuai.waimai.business.restaurant.poicontainer.comment.h;
import com.sankuai.waimai.platform.domain.core.comment.CommentLabel;
import com.sankuai.waimai.platform.domain.core.comment.PoiCommentTab;
import com.sankuai.waimai.platform.domain.core.comment.PoiCommentTypeInfo;
import com.sankuai.waimai.platform.widget.PoiCommentLabelView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    final g b;
    final h c;
    final c d;
    @NonNull
    final a e;
    final com.sankuai.waimai.business.restaurant.poicontainer.helper.g f;
    private com.sankuai.waimai.business.restaurant.base.manager.order.g g;
    private final f h;
    private final h.a i;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i);

        void a(long j);

        void a(PoiCommentLabelView poiCommentLabelView, CommentLabel commentLabel);

        void a(PoiCommentLabelView poiCommentLabelView, PoiCommentTypeInfo poiCommentTypeInfo);
    }

    public d(@NonNull Context context, @NonNull a aVar, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) {
        super(context);
        Object[] objArr = {context, aVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97b2d318a1d8643c61df1ba4f2c0278d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97b2d318a1d8643c61df1ba4f2c0278d");
            return;
        }
        this.f = new com.sankuai.waimai.business.restaurant.poicontainer.helper.g();
        this.e = aVar;
        this.g = gVar;
        this.h = new f(context);
        this.b = new g(context, gVar);
        this.c = new h(context, gVar);
        this.d = new c(context, gVar);
        this.i = new h.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.comment.h.a
            public final void a(@NonNull PoiCommentLabelView poiCommentLabelView, @NonNull PoiCommentTypeInfo poiCommentTypeInfo) {
                Object[] objArr2 = {poiCommentLabelView, poiCommentTypeInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4cd7e65663a872728b802ba5d5ae9dec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4cd7e65663a872728b802ba5d5ae9dec");
                    return;
                }
                d.this.e.a(poiCommentLabelView, poiCommentTypeInfo);
                d.this.c.a(poiCommentLabelView.getTag());
                d.this.d.a(poiCommentLabelView.getTag());
                if (d.this.f.a(poiCommentTypeInfo)) {
                    return;
                }
                int i = poiCommentTypeInfo.commentScoreType;
                d.this.f.a(i);
                d.this.e.a(i);
            }

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.comment.h.a
            public final void a(@NonNull PoiCommentLabelView poiCommentLabelView, @NonNull CommentLabel commentLabel) {
                boolean z = false;
                Object[] objArr2 = {poiCommentLabelView, commentLabel};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da0d989bbd021246b449fcb2c983023e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da0d989bbd021246b449fcb2c983023e");
                    return;
                }
                d.this.e.a(poiCommentLabelView, commentLabel);
                d.this.c.a(poiCommentLabelView.getTag());
                d.this.d.a(poiCommentLabelView.getTag());
                com.sankuai.waimai.business.restaurant.poicontainer.helper.g gVar2 = d.this.f;
                Object[] objArr3 = {commentLabel};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.poicontainer.helper.g.a;
                if (PatchProxy.isSupport(objArr3, gVar2, changeQuickRedirect3, false, "e7491a224233e553f4b6513596887011", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, gVar2, changeQuickRedirect3, false, "e7491a224233e553f4b6513596887011")).booleanValue();
                } else if (commentLabel != null && gVar2.b(commentLabel.labelId)) {
                    z = true;
                }
                if (z) {
                    return;
                }
                long j = commentLabel.labelId;
                d.this.f.a(j);
                d.this.e.a(j);
            }
        };
        this.b.c = new g.a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.d.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.poicontainer.comment.g.a
            public final void a(View view, int i, @NonNull PoiCommentTab poiCommentTab) {
                Object[] objArr2 = {view, Integer.valueOf(i), poiCommentTab};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eaa249f67e57d6ca3684751f01c08e72", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eaa249f67e57d6ca3684751f01c08e72");
                } else if (view.isSelected()) {
                } else {
                    d.this.f.a(poiCommentTab.commentScoreType);
                    d.this.b.a(i);
                    d.this.c.a();
                    d.this.e.a(poiCommentTab.commentScoreType);
                }
            }
        };
        this.c.c = this.i;
        this.d.d = this.i;
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1716f25d33d4b9c59dd0c11504a9f1b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1716f25d33d4b9c59dd0c11504a9f1b5");
        }
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.wm_comment_poi_layout_header, viewGroup, false);
        viewGroup2.addView(this.h.a(viewGroup2));
        viewGroup2.addView(this.b.a(viewGroup2));
        viewGroup2.addView(this.c.a(viewGroup2));
        this.d.a(viewGroup2);
        return viewGroup2;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3738daf5b0050a5af5f6ade98c4b9439", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3738daf5b0050a5af5f6ade98c4b9439");
            return;
        }
        g gVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "fe1ab940cf25cd725d3cd75b183ac525", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "fe1ab940cf25cd725d3cd75b183ac525");
        } else {
            gVar.b.b();
        }
        h hVar = this.c;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = h.a;
        if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "61793614706300f738e8cb55b6a85c18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "61793614706300f738e8cb55b6a85c18");
        } else {
            hVar.b.b();
        }
        c cVar = this.d;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = c.a;
        if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "cf29e702e1cb39b82f14f5f29503ec22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "cf29e702e1cb39b82f14f5f29503ec22");
        } else {
            cVar.c.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.waimai.platform.domain.core.comment.BasePoiCommentResponse r24) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.poicontainer.comment.d.a(com.sankuai.waimai.platform.domain.core.comment.BasePoiCommentResponse):void");
    }
}
