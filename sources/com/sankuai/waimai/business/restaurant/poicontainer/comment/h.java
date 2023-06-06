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
import com.sankuai.waimai.platform.domain.core.comment.CommentLabel;
import com.sankuai.waimai.platform.domain.core.comment.PoiCommentTypeInfo;
import com.sankuai.waimai.platform.widget.PoiCommentLabelView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.log.judas.b b;
    a c;
    ViewGroup d;
    com.sankuai.waimai.business.restaurant.base.manager.order.g e;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(@NonNull PoiCommentLabelView poiCommentLabelView, @NonNull CommentLabel commentLabel);

        void a(@NonNull PoiCommentLabelView poiCommentLabelView, @NonNull PoiCommentTypeInfo poiCommentTypeInfo);
    }

    public h(Context context, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) {
        super(context);
        Object[] objArr = {context, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2583f92704da88b3b31aa22966dc2b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2583f92704da88b3b31aa22966dc2b1");
            return;
        }
        this.b = new com.sankuai.waimai.log.judas.b();
        this.e = gVar;
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d76ba22285928dc3981f18500203304a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d76ba22285928dc3981f18500203304a");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_comment_poi_layout_tags, viewGroup, false);
        this.d = (ViewGroup) inflate.findViewById(R.id.container_tags);
        return inflate;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fff31cf93af0456b8e4d81976df443f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fff31cf93af0456b8e4d81976df443f");
            return;
        }
        int childCount = this.d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.d.getChildAt(i);
            if (childAt != null) {
                childAt.setSelected(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PoiCommentLabelView a(ViewGroup viewGroup, boolean z) {
        Object[] objArr = {viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7b480aeb382cf0dad08042329612b51", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiCommentLabelView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7b480aeb382cf0dad08042329612b51");
        }
        PoiCommentLabelView poiCommentLabelView = (PoiCommentLabelView) g().inflate(R.layout.wm_comment_poi_tag, viewGroup, false);
        poiCommentLabelView.setBackgroundResource(z ? R.drawable.wm_comment_poi_tag_background : R.drawable.wm_comment_poi_tag_backgournd_negative);
        return poiCommentLabelView;
    }

    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1a722e492e9b0ee663f7334766922e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1a722e492e9b0ee663f7334766922e5");
            return;
        }
        int childCount = this.d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.d.getChildAt(i);
            if (childAt.getTag() == obj) {
                childAt.setSelected(true);
                return;
            }
        }
    }
}
