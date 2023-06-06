package com.sankuai.waimai.store.drug.home.refactor.card.float_card;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    SCBaseActivity b;
    InterfaceC1159a c;
    public long d;
    private com.sankuai.waimai.store.expose.v2.entity.b e;
    private com.sankuai.waimai.platform.utils.time.a f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.home.refactor.card.float_card.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1159a {
        void a(boolean z);
    }

    public a(@NonNull SCBaseActivity sCBaseActivity) {
        super(sCBaseActivity);
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d008d88676dc4c50003a76ad121ef605", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d008d88676dc4c50003a76ad121ef605");
        } else {
            this.b = sCBaseActivity;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfb59b0edfb804bd88cb6fa0ab2bea8e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfb59b0edfb804bd88cb6fa0ab2bea8e");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_drug_channel_float_drug_packets, viewGroup, false);
        this.e = new com.sankuai.waimai.store.expose.v2.entity.b(this.b.b(), "b_waimai_mgvescfm_mv", AppUtil.generatePageInfoKey(inflate.getContext()), inflate);
        com.sankuai.waimai.store.expose.v2.b.a().a(this.b, this.e);
        return inflate;
    }

    public final void a(String str, final com.sankuai.waimai.store.manager.marketing.action.d dVar) {
        boolean z = true;
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1ac8d496d02d19466c758c0e0269479", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1ac8d496d02d19466c758c0e0269479");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("coupon_value");
            String optString2 = jSONObject.optString("valid_time");
            String optString3 = jSONObject.optString("bg_pic");
            final int optInt = jSONObject.optInt("type");
            UniversalImageView universalImageView = (UniversalImageView) findView(R.id.drug_packet_of_channel_float);
            TextView textView = (TextView) findView(R.id.tv_packet_float_value);
            TextView textView2 = (TextView) findView(R.id.tv_packet_float_time);
            View findView = findView(R.id.ll_max_value_tag);
            View findView2 = findView(R.id.ll_amount_value);
            if (optInt == 1) {
                u.c(findView2, findView);
            } else {
                u.a(findView2, findView);
                findView.setBackground(new e.a().c(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_sg_color_FFD349)).a(3.0f, 3.0f, 3.0f, 0.0f).a());
            }
            int a2 = h.a(this.b, 60.0f);
            b.C0608b a3 = m.a(optString3, a2, a2, ImageQualityUtil.c());
            a3.j = R.drawable.wm_sc_comment_img_load_placeholder;
            a3.a((ImageView) universalImageView);
            textView.setText(optString);
            long a4 = r.a(optString2, 0L);
            if (this.f != null) {
                this.f.cancel();
                this.f = null;
            }
            this.d = (a4 * 1000) - com.meituan.android.time.c.b();
            if (dVar != null) {
                if (!(dVar.b() == 1) || this.d <= 0) {
                    z = false;
                }
                setVisible(z);
            } else {
                if (this.d <= 0) {
                    z = false;
                }
                setVisible(z);
            }
            this.f = new com.sankuai.waimai.platform.utils.time.a(this.d, 1000L, textView2) { // from class: com.sankuai.waimai.store.drug.home.refactor.card.float_card.a.1
                public static ChangeQuickRedirect a;
                public final /* synthetic */ TextView b;

                {
                    this.b = textView2;
                }

                @Override // com.sankuai.waimai.platform.utils.time.a
                public final void a(long j) {
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "454d91fe05328dc9ecf13adc47192993", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "454d91fe05328dc9ecf13adc47192993");
                    } else {
                        this.b.setText(com.sankuai.waimai.platform.utils.time.b.a(j / 1000));
                    }
                }

                @Override // com.sankuai.waimai.platform.utils.time.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dae7508df1723d1c862c741a47cab790", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dae7508df1723d1c862c741a47cab790");
                    } else {
                        a.this.setVisible(false);
                    }
                }
            };
            this.f.b();
            final String optString4 = jSONObject.optString(PushConstants.TASK_ID);
            this.e.a("type", Integer.valueOf(optInt)).a(PushConstants.TASK_ID, optString4);
            this.mView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.home.refactor.card.float_card.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4217bf8664a55f78c7992ced1cfc662a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4217bf8664a55f78c7992ced1cfc662a");
                        return;
                    }
                    if (com.sankuai.waimai.store.manager.user.a.a().b()) {
                        a.this.setVisible(false);
                        if (dVar != null) {
                            dVar.a();
                        }
                    } else {
                        com.sankuai.waimai.store.manager.user.a.a(view.getContext());
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(a.this.b.b(), com.sankuai.waimai.store.manager.judas.b.a((Object) a.this.mContext), "b_waimai_mgvescfm_mc").a("type", Integer.valueOf(optInt)).a(PushConstants.TASK_ID, optString4).a();
                }
            });
        } catch (JSONException e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07a5e7fea6d89557c4217b0805d73d74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07a5e7fea6d89557c4217b0805d73d74");
            return;
        }
        super.onDestroy();
        if (this.f != null) {
            this.f.cancel();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d234aacf655b2c50c898e5fb96237ffb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d234aacf655b2c50c898e5fb96237ffb");
            return;
        }
        View view = (View) this.mView.getParent();
        if (z) {
            u.a(view);
            if (this.f != null) {
                this.f.b();
            }
        } else {
            if (this.f != null) {
                this.f.cancel();
            }
            u.c(view);
        }
        super.setVisible(z);
        if (this.c != null) {
            this.c.a(!z ? 1 : 0);
        }
    }
}
