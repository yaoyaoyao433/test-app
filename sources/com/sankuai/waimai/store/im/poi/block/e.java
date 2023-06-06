package com.sankuai.waimai.store.im.poi.block;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.im.base.h;
import com.sankuai.waimai.store.im.poi.model.SGIMRobotReplyData;
import com.sankuai.waimai.store.util.am;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends h {
    public static ChangeQuickRedirect g;
    public a h;
    private View i;
    private View j;
    private String k;
    private SGIMRobotReplyData l;
    private ImageView m;
    private ImageView n;
    private TextView o;
    private TextView p;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);
    }

    @Override // com.sankuai.waimai.store.im.base.d
    public final void a(Object obj, int i, Map<String, Object> map, View view) {
    }

    public static /* synthetic */ void a(e eVar, final int i) {
        Map<String, Object> hashMap;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "cbd284e29251f946667e8bd0615be5b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "cbd284e29251f946667e8bd0615be5b3");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "999ce7cf4b0f921a20ea350f350adea1", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "999ce7cf4b0f921a20ea350f350adea1");
        } else {
            hashMap = new HashMap<>();
            if (eVar.l != null) {
                hashMap.put("poi_id", Long.valueOf(eVar.l.mPoiId));
                hashMap.put("message_id", Long.valueOf(eVar.l.msgId));
                hashMap.put("is_like", Integer.valueOf(i));
            }
        }
        eVar.a(hashMap);
        if (eVar.l != null) {
            com.sankuai.waimai.store.im.base.net.b.a(eVar.k).a(eVar.l.mPoiId, eVar.a(), eVar.l.msgId, i, new j<Object>() { // from class: com.sankuai.waimai.store.im.poi.block.e.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "55e8d19eb737c8e1da8899455e11ae1d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "55e8d19eb737c8e1da8899455e11ae1d");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(Object obj) {
                    Object[] objArr3 = {obj};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "359844de63908399f58f60fdb1f1beb6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "359844de63908399f58f60fdb1f1beb6");
                    } else if (com.sankuai.waimai.store.util.b.a(e.this.mContext)) {
                    } else {
                        if (i == 1) {
                            am.a((Activity) e.this.mContext, (int) R.string.wm_sg_im_praise_great);
                        } else {
                            am.a((Activity) e.this.mContext, (int) R.string.wm_sg_im_praise_low);
                        }
                        if (e.this.h != null) {
                            e.this.h.a(i);
                        }
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr3 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b0f6d4519ea4d0606db8785d63993c5b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b0f6d4519ea4d0606db8785d63993c5b");
                    } else if (t.a(bVar.getMessage()) || com.sankuai.waimai.store.util.b.a(e.this.mContext)) {
                        am.a((Activity) e.this.mContext, "网络连接异常");
                    } else {
                        am.a((Activity) e.this.mContext, bVar.getMessage());
                    }
                }
            });
        }
    }

    public e(@NonNull Context context, @NonNull com.sankuai.waimai.store.expose.v2.a aVar) {
        super(context, aVar);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d9cdf4e5e6c43b493b72fb3bf0fbb17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d9cdf4e5e6c43b493b72fb3bf0fbb17");
        } else {
            this.k = "SG_WM_CHAT";
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21c24d9fe13f7eefd5d2300cc1926a38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21c24d9fe13f7eefd5d2300cc1926a38");
            return;
        }
        super.onViewCreated();
        this.i = findView(R.id.sg_im_robot_praise_grate);
        this.j = findView(R.id.sg_im_robot_praise_low);
        this.m = (ImageView) findView(R.id.iv_robot_praise_grate);
        this.n = (ImageView) findView(R.id.iv_robot_praise_low);
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.block.e.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4ef4a01cb7f5b26f1922a4caa84360f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4ef4a01cb7f5b26f1922a4caa84360f");
                } else {
                    e.a(e.this, 1);
                }
            }
        });
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.im.poi.block.e.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62fa7a9769f6817c0cf842cac887aa17", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62fa7a9769f6817c0cf842cac887aa17");
                } else {
                    e.a(e.this, 2);
                }
            }
        });
        this.o = (TextView) findView(R.id.tv_robot_grate);
        this.p = (TextView) findView(R.id.tv_robot_low);
    }

    public final void a(SGIMRobotReplyData sGIMRobotReplyData) {
        Object[] objArr = {sGIMRobotReplyData};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7a8b1531141bb8cd0c64c18ebf8ff86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7a8b1531141bb8cd0c64c18ebf8ff86");
            return;
        }
        this.l = sGIMRobotReplyData;
        if (this.n == null || this.m == null || this.p == null || this.o == null || com.sankuai.waimai.store.util.b.a(this.mContext)) {
            return;
        }
        if (sGIMRobotReplyData.robotPraiseOperation == 1) {
            this.m.setImageResource(R.drawable.wm_sg_im_praise_greate_selected);
            this.n.setImageResource(R.drawable.wm_sg_im_praise_low);
            this.o.setTextColor(this.mContext.getResources().getColor(R.color.wm_sg_color_FFA600));
            this.p.setTextColor(this.mContext.getResources().getColor(R.color.wm_sg_color_666666));
            u.a(this.o, true);
            u.a(this.p, false);
        } else if (sGIMRobotReplyData.robotPraiseOperation == 2) {
            this.m.setImageResource(R.drawable.wm_sg_im_praise_great);
            this.n.setImageResource(R.drawable.wm_sg_im_praise_low_selected);
            this.o.setTextColor(this.mContext.getResources().getColor(R.color.wm_sg_color_666666));
            this.p.setTextColor(this.mContext.getResources().getColor(R.color.wm_sg_color_222222));
            u.a(this.o, false);
            u.a(this.p, true);
        } else {
            this.m.setImageResource(R.drawable.wm_sg_im_praise_great);
            this.n.setImageResource(R.drawable.wm_sg_im_praise_low);
            this.o.setTextColor(this.mContext.getResources().getColor(R.color.wm_sg_color_666666));
            this.p.setTextColor(this.mContext.getResources().getColor(R.color.wm_sg_color_666666));
            u.a(this.o, false);
            u.a(this.p, false);
        }
    }

    @Override // com.sankuai.waimai.store.im.base.d
    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d67d7615494d3bac1f58e4846d4d274", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d67d7615494d3bac1f58e4846d4d274");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(com.sankuai.waimai.business.im.utils.d.a, "b_waimai_u2onel9i_mc").b(map).a();
        }
    }
}
