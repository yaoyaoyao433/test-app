package com.sankuai.waimai.ugc.creator.component;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.widgets.RooImageView;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.ugc.creator.utils.o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class FlowLineActionBarBlock extends com.sankuai.waimai.ugc.creator.base.b implements com.sankuai.waimai.ugc.creator.handler.a {
    public static ChangeQuickRedirect a;
    private RooImageView A;
    private int B;
    public int b;
    public Button c;
    public View d;
    public TextView e;
    public TextView f;
    public TextView g;
    boolean h;
    boolean i;
    public a j;
    public b k;
    private RooImageView l;
    private RooImageView m;
    private View z;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface ActionBarMode {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void i();

        void j();
    }

    public FlowLineActionBarBlock(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "598a3f187d2396b7e1de33cc8c8a4f14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "598a3f187d2396b7e1de33cc8c8a4f14");
            return;
        }
        this.h = false;
        this.i = false;
        this.b = i;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f331d5d91681752a52466475b2510d59", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f331d5d91681752a52466475b2510d59") : layoutInflater.inflate(R.layout.wm_ugc_media_flowline_actionbar_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.b
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dbb89bfa03df5c5af7f8687fc544034", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dbb89bfa03df5c5af7f8687fc544034");
            return;
        }
        super.a(view);
        this.l = (RooImageView) b(R.id.flow_line_actionbar_back_btn);
        this.m = (RooImageView) b(R.id.flow_line_actionbar_right_icon_btn);
        this.c = (Button) b(R.id.flow_line_actionbar_confirm_btn);
        if (this.b == 2) {
            this.l.setImageResourceByResName("ugccreator_ugc_media_edit_close");
            this.m.setVisibility(0);
            this.c.setVisibility(8);
            this.z = this.m;
        } else {
            this.l.setImageResourceByResName("ugccreator_ugc_media_back_btn_icon");
            this.m.setVisibility(8);
            if (this.b == 0) {
                ah.b(this.c, com.sankuai.waimai.foundation.utils.g.a(view.getContext(), 78.0f), Integer.MIN_VALUE);
                this.c.setVisibility(0);
            } else {
                ah.b(this.c, com.sankuai.waimai.foundation.utils.g.a(view.getContext(), 84.0f), Integer.MIN_VALUE);
                this.c.setVisibility(8);
            }
            this.z = this.c;
        }
        this.l.setOnClickListener(new com.sankuai.waimai.ugc.creator.widgets.a() { // from class: com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.widgets.a
            public final void a(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6364cc0386b24d1a21434829a39af2fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6364cc0386b24d1a21434829a39af2fe");
                } else if (FlowLineActionBarBlock.this.j != null) {
                    FlowLineActionBarBlock.this.j.a();
                } else {
                    FlowLineActionBarBlock.this.B().onBackPressed();
                }
            }
        });
        this.z.setOnClickListener(new com.sankuai.waimai.ugc.creator.widgets.a() { // from class: com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.widgets.a
            public final void a(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e34be09935e45ef3cc6e987ebe49084", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e34be09935e45ef3cc6e987ebe49084");
                } else if (FlowLineActionBarBlock.this.j != null) {
                    FlowLineActionBarBlock.this.j.b();
                } else {
                    FlowLineActionBarBlock.this.x();
                }
            }
        });
        this.d = b(R.id.ll_number_indicator);
        this.e = (TextView) b(R.id.tv_indicator_cur_num);
        this.f = (TextView) b(R.id.tv_indicator_total_num);
        this.g = (TextView) b(R.id.tv_actionbar_title);
        this.g.setOnClickListener(new com.sankuai.waimai.ugc.creator.widgets.a() { // from class: com.sankuai.waimai.ugc.creator.component.FlowLineActionBarBlock.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.widgets.a
            public final void a(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62924f60a94e1bce24f872d52fdf1ff7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62924f60a94e1bce24f872d52fdf1ff7");
                } else if (FlowLineActionBarBlock.this.h) {
                    FlowLineActionBarBlock.this.d();
                } else {
                    FlowLineActionBarBlock flowLineActionBarBlock = FlowLineActionBarBlock.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = FlowLineActionBarBlock.a;
                    if (PatchProxy.isSupport(objArr3, flowLineActionBarBlock, changeQuickRedirect3, false, "03f8f0e0a73e7c4ca99def74a089e263", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, flowLineActionBarBlock, changeQuickRedirect3, false, "03f8f0e0a73e7c4ca99def74a089e263");
                    } else if (flowLineActionBarBlock.i) {
                        if (flowLineActionBarBlock.k != null) {
                            flowLineActionBarBlock.k.i();
                        }
                        flowLineActionBarBlock.b(true);
                    }
                }
            }
        });
        this.A = (RooImageView) b(R.id.iv_title_arrow);
        e(this.h);
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aac1da9b81717b2b4d38d97847db0614", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aac1da9b81717b2b4d38d97847db0614");
        } else if (this.b == 1) {
            this.B = i;
            this.c.setEnabled(i > 0);
            this.c.setVisibility(i > 0 ? 0 : 8);
            this.c.setText(B().getString(R.string.wm_ugc_media_picker_done_with_count, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
    }

    private void c(boolean z) {
        int i = 0;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c126f256a08470e98809329a59042a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c126f256a08470e98809329a59042a5");
        } else {
            this.c.setVisibility((!z || this.B <= 0) ? 8 : 8);
        }
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e05f4340184fea68feb6881e9ecdb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e05f4340184fea68feb6881e9ecdb6");
        } else {
            this.l.setVisibility(z ? 0 : 4);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50764bfd6064a53199db64b4b8c8202f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50764bfd6064a53199db64b4b8c8202f");
            return;
        }
        this.g.setText(str);
        this.g.setVisibility(0);
        this.d.setVisibility(8);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b794c6bd218ff760aa941e51070a9f8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b794c6bd218ff760aa941e51070a9f8d");
        } else if (o.a(A())) {
            a(A().getString(i));
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c1f96371324cf0d19dae8e4993f03e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c1f96371324cf0d19dae8e4993f03e9");
            return;
        }
        this.i = z;
        if (this.i) {
            this.A.setVisibility(0);
        } else {
            this.A.setVisibility(8);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7353d7946bf7625bd590a3a11f2a7b2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7353d7946bf7625bd590a3a11f2a7b2f");
        } else if (this.i) {
            if (this.k != null) {
                this.k.j();
            }
            b(false);
        }
    }

    void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b350f891bbe8a444472f55206174eff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b350f891bbe8a444472f55206174eff");
        } else if (z) {
            e(true);
            c(false);
            d(false);
        } else {
            e(false);
            c(true);
            d(true);
        }
    }

    private void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04a2534fc2c67ceb3835c985d7288827", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04a2534fc2c67ceb3835c985d7288827");
            return;
        }
        this.h = z;
        this.A.setImageResourceByResName(z ? "ugccreator_ugc_icon_mediapicker_uparrow" : "ugccreator_ugc_icon_mediapicker_downarrow");
    }
}
