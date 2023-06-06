package com.sankuai.waimai.business.restaurant.poicontainer.comment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.c;
import com.sankuai.waimai.business.restaurant.poicontainer.comment.h;
import com.sankuai.waimai.business.restaurant.poicontainer.comment.widget.PoiTagGroup;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.comment.BasePoiCommentResponse;
import com.sankuai.waimai.platform.domain.core.comment.CommentLabel;
import com.sankuai.waimai.platform.domain.core.comment.PoiCommentTypeInfo;
import com.sankuai.waimai.platform.widget.PoiCommentLabelView;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    PoiTagGroup b;
    final com.sankuai.waimai.log.judas.b c;
    h.a d;
    private final com.sankuai.waimai.business.restaurant.base.manager.order.g e;

    public static /* synthetic */ void a(c cVar, PoiCommentLabelView poiCommentLabelView, CommentLabel commentLabel, int i) {
        Object[] objArr = {poiCommentLabelView, commentLabel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "06ca72eb4e057dcca663b36e1b592932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "06ca72eb4e057dcca663b36e1b592932");
            return;
        }
        if (!poiCommentLabelView.isSelected()) {
            String f = cVar.e.f();
            JudasManualManager.a a2 = JudasManualManager.a("b_z0cks95o").a("poi_id", f).a("dim_labelid", String.valueOf(commentLabel.labelId)).a("dp_score", "").a("label_index", String.valueOf(i)).a("tag_type", "");
            a2.b = AppUtil.generatePageInfoKey(cVar.y);
            a2.a("c_CijEL").a();
        }
        cVar.b.a();
        if (cVar.d != null) {
            cVar.d.a(poiCommentLabelView, commentLabel);
        }
    }

    public static /* synthetic */ void a(c cVar, PoiCommentLabelView poiCommentLabelView, PoiCommentTypeInfo poiCommentTypeInfo) {
        Object[] objArr = {poiCommentLabelView, poiCommentTypeInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "808ca2a2c53d98048225f101115911e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "808ca2a2c53d98048225f101115911e9");
            return;
        }
        if (!poiCommentLabelView.isSelected()) {
            JudasManualManager.a a2 = JudasManualManager.a("b_z0cks95o").a("poi_id", cVar.e.f()).a("dim_labelid", "").a("dp_score", "").a("label_index", "").a("tag_type", String.valueOf(poiCommentTypeInfo.commentScoreType));
            a2.b = AppUtil.generatePageInfoKey(cVar.y);
            a2.a("c_CijEL").a();
        }
        cVar.b.a();
        if (cVar.d != null) {
            cVar.d.a(poiCommentLabelView, poiCommentTypeInfo);
        }
    }

    public c(@NonNull Context context, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) {
        super(context);
        Object[] objArr = {context, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2890462e9f69914c994ee51e0243d539", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2890462e9f69914c994ee51e0243d539");
            return;
        }
        this.c = new com.sankuai.waimai.log.judas.b();
        this.e = gVar;
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee71c6d6c5b28b5a5de39feacf383811", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee71c6d6c5b28b5a5de39feacf383811");
        }
        this.b = new PoiTagGroup(viewGroup.getContext());
        return this.b;
    }

    public final void a(@NonNull BasePoiCommentResponse basePoiCommentResponse, com.sankuai.waimai.business.restaurant.poicontainer.helper.g gVar) {
        Object[] objArr = {basePoiCommentResponse, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaeeac307885727bc93bafeca909ab81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaeeac307885727bc93bafeca909ab81");
            return;
        }
        PoiTagGroup poiTagGroup = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = PoiTagGroup.a;
        if (PatchProxy.isSupport(objArr2, poiTagGroup, changeQuickRedirect2, false, "c7e3f4c49b3d26dc3318e25ca8a0c982", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, poiTagGroup, changeQuickRedirect2, false, "c7e3f4c49b3d26dc3318e25ca8a0c982");
        } else {
            poiTagGroup.b.removeAllViews();
        }
        if (com.sankuai.waimai.foundation.utils.b.a(basePoiCommentResponse.scoreTypeInfos)) {
            List<PoiCommentTypeInfo> list = basePoiCommentResponse.scoreTypeInfos;
            Object[] objArr3 = {list, gVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9adcb69c6baab98119bc4c7b9f43573b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9adcb69c6baab98119bc4c7b9f43573b");
            } else {
                for (final PoiCommentTypeInfo poiCommentTypeInfo : list) {
                    if (poiCommentTypeInfo != null) {
                        final PoiCommentLabelView a2 = a(this.b, poiCommentTypeInfo.commentScoreType != 3, gVar.a(poiCommentTypeInfo));
                        if (poiCommentTypeInfo.commentScoreType == 5) {
                            c.a aVar = new c.a(f());
                            aVar.b = R.string.wm_c_iconfont_54xiangce;
                            aVar.h = R.color.roo_color_black;
                            aVar.f = 12;
                            a2.setIcon(aVar.a());
                        }
                        if (poiCommentTypeInfo.commentScoreType == 22 || poiCommentTypeInfo.commentScoreType == 8) {
                            a2.setText(poiCommentTypeInfo.commentScoreTitle);
                            a2.setContentDescription("显示" + poiCommentTypeInfo.commentScoreTitle + "评价");
                        } else {
                            a2.setText(poiCommentTypeInfo.commentScoreTitle + StringUtil.SPACE + poiCommentTypeInfo.totalCount);
                            a2.setContentDescription("显示" + poiCommentTypeInfo.commentScoreTitle + "评价，共" + poiCommentTypeInfo.totalCount + "条");
                        }
                        if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
                            a2.setTextSize(18.0f);
                        }
                        a2.setTag(poiCommentTypeInfo);
                        a2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.c.2
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr4 = {view};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5e15859466d1a8e8ab9ebbe5128b0994", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5e15859466d1a8e8ab9ebbe5128b0994");
                                } else {
                                    c.a(c.this, a2, poiCommentTypeInfo);
                                }
                            }
                        });
                        this.b.a(a2);
                    }
                }
            }
        }
        if (com.sankuai.waimai.foundation.utils.b.a(basePoiCommentResponse.labels)) {
            a(basePoiCommentResponse.labels, gVar);
        }
        this.b.post(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d495c11e623b30b2e9a7f571ec87ba12", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d495c11e623b30b2e9a7f571ec87ba12");
                } else {
                    c.this.b.b();
                }
            }
        });
        if (this.b.getChildCount() > 0) {
            this.c.a();
        }
    }

    private void a(@NonNull List<CommentLabel> list, @NonNull com.sankuai.waimai.business.restaurant.poicontainer.helper.g gVar) {
        Object[] objArr = {list, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e610d9d42ef193e181021908962cd6c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e610d9d42ef193e181021908962cd6c0");
            return;
        }
        for (final int i = 0; i < list.size(); i++) {
            final CommentLabel commentLabel = list.get(i);
            if (commentLabel != null) {
                final PoiCommentLabelView a2 = a(this.b, commentLabel.isGoodTag(), gVar.b(commentLabel.labelId));
                a2.setText(commentLabel.content + StringUtil.SPACE + commentLabel.labelCount);
                a2.setContentDescription("显示" + commentLabel.content + "评价，共" + commentLabel.labelCount + "条");
                if (com.sankuai.waimai.business.restaurant.poicontainer.b.P()) {
                    a2.setTextSize(18.0f);
                }
                a2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.comment.c.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bdb5d181ad7edeeaa1b07a8828959c6f", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bdb5d181ad7edeeaa1b07a8828959c6f");
                        } else {
                            c.a(c.this, a2, commentLabel, i);
                        }
                    }
                });
                a2.setTag(commentLabel);
                this.b.a(a2);
            }
        }
    }

    private PoiCommentLabelView a(ViewGroup viewGroup, boolean z, boolean z2) {
        Object[] objArr = {viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0efe9584b825c443e89ebc43cc78124b", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiCommentLabelView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0efe9584b825c443e89ebc43cc78124b");
        }
        PoiCommentLabelView poiCommentLabelView = (PoiCommentLabelView) g().inflate(R.layout.wm_comment_poi_tag, viewGroup, false);
        poiCommentLabelView.setBackgroundResource(z ? R.drawable.wm_comment_poi_tag_background : R.drawable.wm_comment_poi_tag_backgournd_negative);
        poiCommentLabelView.setSelected(z2);
        return poiCommentLabelView;
    }

    public final void a(Object obj) {
        int i = 0;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4282355ee6f054792d13067c27332355", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4282355ee6f054792d13067c27332355");
            return;
        }
        PoiTagGroup poiTagGroup = this.b;
        Object[] objArr2 = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = PoiTagGroup.a;
        if (PatchProxy.isSupport(objArr2, poiTagGroup, changeQuickRedirect2, false, "db5ef51e61dc600b043933e186246f59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, poiTagGroup, changeQuickRedirect2, false, "db5ef51e61dc600b043933e186246f59");
            return;
        }
        int childCount = poiTagGroup.b.getChildCount();
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = poiTagGroup.b.getChildAt(i);
            if (childAt.getTag() == obj) {
                childAt.setSelected(true);
                break;
            }
            i++;
        }
        poiTagGroup.b();
    }
}
