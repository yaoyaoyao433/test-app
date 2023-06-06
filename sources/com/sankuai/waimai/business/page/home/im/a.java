package com.sankuai.waimai.business.page.home.im;

import android.app.Activity;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.msgcenter.a;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.imbase.manager.b;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements a.b, d.a {
    public static ChangeQuickRedirect a;
    Activity b;
    ImageView c;
    public int d;
    private String e;
    private View f;
    private TextView g;
    private ImageView h;
    private int i;

    public a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbd81bb1b4d41b5834bd3ef9f7c73f68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbd81bb1b4d41b5834bd3ef9f7c73f68");
            return;
        }
        this.d = 0;
        this.i = 0;
        this.b = activity;
        this.e = str;
        com.sankuai.waimai.business.im.api.msgcenter.a.a().registerMsgCenterUnreadChangeListener(this);
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5b077f4e14d161d27f795589de026c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5b077f4e14d161d27f795589de026c6");
            return;
        }
        this.f = view.findViewById(R.id.message_center_home_layout);
        this.c = (ImageView) view.findViewById(R.id.message_center_home_icon);
        this.h = (ImageView) view.findViewById(R.id.message_center_home_bubble);
        this.g = (TextView) view.findViewById(R.id.message_center_home_bubble_count);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.im.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75ddbb00625f1fe15f915cf260bd9281", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75ddbb00625f1fe15f915cf260bd9281");
                } else if (a.this.c.getAlpha() == 0.0f) {
                } else {
                    a.this.a("click");
                    com.sankuai.waimai.business.im.api.msgcenter.a.a().clickMsgCenter(a.this.b);
                }
            }
        });
    }

    public final void a(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4834ac6deec0ae33156e2e186d63c1bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4834ac6deec0ae33156e2e186d63c1bb");
        } else if (z) {
            if (i == 2) {
                this.c.setImageResource(R.drawable.wm_page_message_center_icon_white);
            } else {
                this.c.setImageResource(R.drawable.wm_page_message_center_icon_black);
            }
        } else if (this.d == 2) {
            this.c.setImageResource(R.drawable.wm_page_message_center_icon_white);
        } else {
            this.c.setImageResource(R.drawable.wm_page_message_center_icon_black);
        }
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.a.b
    public final void a(boolean z, boolean z2, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5468100e568056ed961e335988ee038", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5468100e568056ed961e335988ee038");
            return;
        }
        this.f.setVisibility(z ? 0 : 8);
        if (this.b != null && !f.a(this.b) && z && ah.a(this.f, this.b)) {
            a(Constants.EventType.VIEW);
        }
        if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
            this.f.post(new Runnable() { // from class: com.sankuai.waimai.business.page.home.im.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f99ef9afffc4c549db33e10392ca62e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f99ef9afffc4c549db33e10392ca62e");
                    } else {
                        b.a().a(a.this);
                    }
                }
            });
        } else {
            a(0L, false);
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32192fae0b632e9cf29f5b26734015b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32192fae0b632e9cf29f5b26734015b7");
        } else {
            a(i, com.sankuai.waimai.business.im.api.msgcenter.a.a().showMsgCenterDot());
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5953acaee16d3351418ba5aa742c9c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5953acaee16d3351418ba5aa742c9c10");
        } else {
            com.sankuai.waimai.business.im.api.msgcenter.a.a().refreshMsgCenterUnReadCount();
        }
    }

    void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07c77eaec1c02575c76bc63eef971045", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07c77eaec1c02575c76bc63eef971045");
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("new_message_badge", Integer.valueOf(this.i));
        hashMap2.put("type", Integer.valueOf(com.sankuai.waimai.business.page.home.helper.b.a().c ? 1 : 0));
        hashMap.put("custom", hashMap2);
        if ("click".equals(str)) {
            JudasManualManager.a a2 = JudasManualManager.a("b_w3qnt2ua").a("c_m84bv26");
            a2.b = this.e;
            a2.a((Map<String, Object>) hashMap).a();
        }
    }

    private void a(long j, boolean z) {
        String str;
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1716917ed66a36ea7c9777b7ea571fa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1716917ed66a36ea7c9777b7ea571fa1");
            return;
        }
        View view = this.f;
        StringBuilder sb = new StringBuilder("消息按钮");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i > 0) {
            str = ",未读消息数：" + j;
        } else {
            str = "";
        }
        sb.append(str);
        view.setContentDescription(sb.toString());
        this.h.setVisibility(8);
        this.g.setVisibility(8);
        this.i = 0;
        if (i <= 0) {
            if (z) {
                this.h.setVisibility(0);
                this.i = 1;
                return;
            }
            return;
        }
        if (j < 100) {
            this.g.setText(String.valueOf(j));
        } else {
            this.g.setText("99+");
        }
        this.g.setVisibility(0);
        this.i = 2;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "432f960767995bbcb194a34f9933dcf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "432f960767995bbcb194a34f9933dcf5");
        } else {
            com.sankuai.waimai.business.im.api.msgcenter.a.a().unregisterMsgCenterUnreadChangeListener(this);
        }
    }
}
