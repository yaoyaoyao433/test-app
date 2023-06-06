package com.sankuai.waimai.business.im.common.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.runtime.b;
import com.meituan.roodesign.resfetcher.runtime.c;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.im.model.IMRedPacketData;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.r;
import java.math.BigDecimal;
import java.text.DecimalFormat;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMIMRedPacketDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public IMRedPacketData b;
    public boolean c;
    public a d;
    private final Context e;
    private ViewGroup f;
    private ImageView g;
    private TextView h;
    private ViewGroup i;
    private TextView j;
    private TextView k;
    private TextView l;
    private Button m;
    private ImageView n;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public WMIMRedPacketDialog(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "510218899b0524108b7e2738f67394d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "510218899b0524108b7e2738f67394d9");
        } else {
            this.e = context;
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28caf24f8b5600290ed26828a3a782e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28caf24f8b5600290ed26828a3a782e4");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.wm_im_receive_red_packet_dialog_layout);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e81dd3e5e7a031b4abf54c74bdcb1fc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e81dd3e5e7a031b4abf54c74bdcb1fc8");
        } else {
            this.f = (ViewGroup) findViewById(R.id.rl_red_packet_bg);
            this.g = (ImageView) findViewById(R.id.iv_poi_image);
            this.h = (TextView) findViewById(R.id.tv_content);
            this.i = (ViewGroup) findViewById(R.id.ll_amount);
            this.j = (TextView) findViewById(R.id.tv_amount);
            this.k = (TextView) findViewById(R.id.tv_unit);
            this.l = (TextView) findViewById(R.id.tv_expired_time);
            this.m = (Button) findViewById(R.id.btn_receive);
            this.m.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.view.WMIMRedPacketDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "94a771e7529e5b506d2a77b66cbfee69", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "94a771e7529e5b506d2a77b66cbfee69");
                    } else if (WMIMRedPacketDialog.this.d != null) {
                        WMIMRedPacketDialog.this.d.a();
                    }
                }
            });
            this.n = (ImageView) findViewById(R.id.close_dialog);
            this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.view.WMIMRedPacketDialog.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "09e4218821a9464fa85d6a4467c2bd43", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "09e4218821a9464fa85d6a4467c2bd43");
                    } else {
                        WMIMRedPacketDialog.this.dismiss();
                    }
                }
            });
        }
        a(this.b);
    }

    public final void a(IMRedPacketData iMRedPacketData) {
        Object[] objArr = {iMRedPacketData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1457be8fd7afedd91bafe755540831b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1457be8fd7afedd91bafe755540831b");
        } else if (iMRedPacketData == null) {
        } else {
            this.b = iMRedPacketData;
            try {
                c.a(this.e, this.c ? "waimai_c_waimai_c_im_safe_food_poi_red_packet_read" : "waimai_c_waimai_c_im_safe_food_poi_red_packet_unread", new b() { // from class: com.sankuai.waimai.business.im.common.view.WMIMRedPacketDialog.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.roodesign.resfetcher.runtime.b
                    public final void a(Drawable drawable, boolean z) {
                        Object[] objArr2 = {drawable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f40638ba7fa2ed6a310fdc36db989380", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f40638ba7fa2ed6a310fdc36db989380");
                        } else if (z) {
                        } else {
                            WMIMRedPacketDialog.this.f.setBackground(drawable);
                        }
                    }
                });
                TextView textView = this.h;
                textView.setText(this.b.poi_name + "的心意红包");
                String str = this.b.poi_url;
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = this.e;
                a2.c = str;
                a2.i = R.drawable.wm_im_poi_default_avatar;
                a2.j = R.drawable.wm_im_poi_default_avatar;
                a2.a(this.g);
                if (this.c) {
                    this.m.setVisibility(8);
                    this.i.setVisibility(8);
                    this.l.setVisibility(0);
                    this.l.setText(TextUtils.concat("已于", com.meituan.android.base.util.a.a(r.a(this.b.expire_time, 0L)), "\n过期").toString());
                    return;
                }
                this.m.setVisibility(0);
                this.i.setVisibility(0);
                this.j.setText(new DecimalFormat("0.00").format(new BigDecimal(this.b.amount).divide(new BigDecimal(100), 2, 4).doubleValue()));
                this.k.setText("元");
                this.l.setVisibility(8);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eafae76ead3cd3433c77b207fd6e59e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eafae76ead3cd3433c77b207fd6e59e");
            return;
        }
        super.onStart();
        ae.a(getWindow());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033d4c1e0df5b1bb1e8eed2f1d4b0240", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033d4c1e0df5b1bb1e8eed2f1d4b0240");
            return;
        }
        super.dismiss();
        ae.a();
    }
}
