package com.sankuai.waimai.store.order.detail.blockview;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.store.order.detail.model.ImGroupChatEntranceInfo;
import com.sankuai.waimai.store.util.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    ImageView e;
    com.sankuai.waimai.store.im.group.join.b f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private TextView j;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_sc_order_im_group_chat_entrance;
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d491fff0334fbe512e0b84c217229386", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d491fff0334fbe512e0b84c217229386");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "303c89bc8906527f173f66757b5d6126", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "303c89bc8906527f173f66757b5d6126");
            return;
        }
        super.b();
        this.g = (ImageView) this.b.findViewById(R.id.group_header_img);
        this.h = (TextView) this.b.findViewById(R.id.group_chat_desc);
        this.i = (TextView) this.b.findViewById(R.id.group_chat_name);
        this.e = (ImageView) this.b.findViewById(R.id.group_chat_service_info);
        this.j = (TextView) this.b.findViewById(R.id.group_chat_entrance);
    }

    public final void a(String str, final Long l, final String str2) {
        Object[] objArr = {str, l, str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e8d5c3f45331e23e47c1a24fadb2b88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e8d5c3f45331e23e47c1a24fadb2b88");
            return;
        }
        ImGroupChatEntranceInfo imGroupChatEntranceInfo = (ImGroupChatEntranceInfo) com.sankuai.waimai.store.util.i.a(str, ImGroupChatEntranceInfo.class);
        if (imGroupChatEntranceInfo != null && imGroupChatEntranceInfo.groupType == 1) {
            b.C0608b b = m.b(imGroupChatEntranceInfo.groupProfilePhoto);
            b.j = R.drawable.wm_sc_comment_img_load_placeholder;
            b.a(this.g);
            this.h.setText(imGroupChatEntranceInfo.guideLanguage);
            this.i.setText(imGroupChatEntranceInfo.groupName);
            this.j.setText(imGroupChatEntranceInfo.buttonText);
            b.C0608b b2 = m.b(imGroupChatEntranceInfo.guideImage);
            b2.g = false;
            b2.a(new b.a() { // from class: com.sankuai.waimai.store.order.detail.blockview.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db628dc0eb8d72cf9fa45cf66af6d2f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db628dc0eb8d72cf9fa45cf66af6d2f1");
                        return;
                    }
                    b.this.e.setImageBitmap(bitmap);
                    int a2 = com.sankuai.shangou.stone.util.h.a(b.this.c) - com.sankuai.shangou.stone.util.h.a(b.this.c, 24.0f);
                    b.this.e.getLayoutParams().width = a2;
                    b.this.e.getLayoutParams().height = (a2 * bitmap.getHeight()) / bitmap.getWidth();
                }
            });
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.order.detail.blockview.b.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str3;
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf776541596002ecbc138146b74ebae0", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf776541596002ecbc138146b74ebae0");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a("c_hgowsqb", "b_waimai_pu9jm6ss_mc").a("poi_id", l).a();
                    if (b.this.f == null) {
                        b.this.f = new com.sankuai.waimai.store.im.group.join.b();
                    }
                    com.sankuai.waimai.store.im.group.join.b bVar = b.this.f;
                    b bVar2 = b.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b.d;
                    if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "8d7dd49d31c129e81f0b70d502413090", RobustBitConfig.DEFAULT_VALUE)) {
                        str3 = (String) PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "8d7dd49d31c129e81f0b70d502413090");
                    } else {
                        str3 = bVar2.getClass().getSimpleName() + System.currentTimeMillis();
                    }
                    bVar.a(str3, b.this.c, l.longValue(), str2, null);
                }
            });
            com.sankuai.waimai.store.manager.judas.b.b("c_hgowsqb", "b_waimai_3cb5ram8_mv").a("poi_id", l).a();
            this.b.setVisibility(0);
            return;
        }
        this.b.setVisibility(8);
    }
}
