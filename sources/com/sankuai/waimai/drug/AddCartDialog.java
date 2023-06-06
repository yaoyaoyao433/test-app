package com.sankuai.waimai.drug;

import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.am;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AddCartDialog extends CustomDialog {
    public static ChangeQuickRedirect a;
    private int b;
    private boolean c;
    private EditText d;
    private com.sankuai.waimai.drug.model.f e;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a f;
    private final String h;

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
    }

    public static /* synthetic */ boolean a(AddCartDialog addCartDialog, boolean z) {
        addCartDialog.c = false;
        return false;
    }

    public AddCartDialog(Context context, String str) {
        super(context, LayoutInflater.from(context).inflate(R.layout.wm_st_shopcart_dialog_drug_add, (ViewGroup) null, false));
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd545e9d70b4a11d1a34c80ec873d779", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd545e9d70b4a11d1a34c80ec873d779");
            return;
        }
        this.b = 4;
        this.c = false;
        this.h = str;
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.WmStNoneAnimation);
        }
        setOnShowListener(this);
        setCanceledOnTouchOutside(false);
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a95370a7429d3db51617850b43441ddc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a95370a7429d3db51617850b43441ddc");
        } else if (view != null) {
            View c = c(R.id.wm_st_dlg_tv_proceed);
            c.setOnClickListener(com.sankuai.waimai.drug.a.a(this));
            c.setBackground(com.sankuai.waimai.store.util.e.a(view.getContext(), new int[]{R.color.wm_sg_color_FFE14D, R.color.wm_sg_color_FFC34D}, (int) R.dimen.wm_sc_common_dimen_20));
            View c2 = c(R.id.wm_st_dlg_tv_cancel);
            c2.setOnClickListener(b.a(this));
            c2.setBackground(com.sankuai.waimai.store.util.e.b(getContext(), (int) R.color.wm_sg_color_F5F5F6, (int) R.dimen.wm_sc_common_dimen_20));
            this.d = (EditText) c(R.id.wm_st_dlg_tv_auth_content);
            this.d.addTextChangedListener(new TextWatcher() { // from class: com.sankuai.waimai.drug.AddCartDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    Object[] objArr2 = {editable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79ca2454b530ba3385801cba930cb937", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79ca2454b530ba3385801cba930cb937");
                        return;
                    }
                    if (!AddCartDialog.this.c) {
                        AddCartDialog.this.b(2);
                    }
                    AddCartDialog.a(AddCartDialog.this, false);
                }
            });
            c(R.id.btn_add).setOnClickListener(c.a(this));
            c(R.id.btn_reduce).setOnClickListener(d.a(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01ed A[Catch: Exception -> 0x02b7, TryCatch #0 {Exception -> 0x02b7, blocks: (B:61:0x01ab, B:65:0x01b8, B:67:0x01cc, B:76:0x01ed, B:79:0x01f8, B:81:0x023c, B:82:0x0241, B:83:0x0256, B:85:0x029e, B:86:0x02a2, B:69:0x01d9, B:73:0x01e6), top: B:92:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void d(com.sankuai.waimai.drug.AddCartDialog r23, android.view.View r24) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.drug.AddCartDialog.d(com.sankuai.waimai.drug.AddCartDialog, android.view.View):void");
    }

    public static /* synthetic */ void c(AddCartDialog addCartDialog, View view) {
        Object[] objArr = {addCartDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9eaa50e9a268b3cf216883baf5c7c239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9eaa50e9a268b3cf216883baf5c7c239");
        } else {
            addCartDialog.dismiss();
        }
    }

    public static /* synthetic */ void b(AddCartDialog addCartDialog, View view) {
        Object[] objArr = {addCartDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5897fc437bc3833f21efbd00083a45a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5897fc437bc3833f21efbd00083a45a4");
            return;
        }
        addCartDialog.a(String.valueOf(addCartDialog.a(0) + 1));
        addCartDialog.b(1);
    }

    public static /* synthetic */ void a(AddCartDialog addCartDialog, View view) {
        Object[] objArr = {addCartDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d803febbb60e852fa83b49df1ee1819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d803febbb60e852fa83b49df1ee1819");
            return;
        }
        int a2 = addCartDialog.a(0);
        if (a2 > 0) {
            addCartDialog.a(String.valueOf(a2 - 1));
            addCartDialog.b(1);
        }
    }

    private void a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a257f5f2345c0dfe6fd47c936c22116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a257f5f2345c0dfe6fd47c936c22116");
            return;
        }
        this.c = true;
        this.d.setText(charSequence);
        Editable text = this.d.getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        this.d.setSelection(text.length());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {AddCartDialog.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbb54b94cae554767e9b2ad45a1c7001", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbb54b94cae554767e9b2ad45a1c7001");
            }
        }

        @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
        public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d8181bda1b4ef8953a92eb448c6c7da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d8181bda1b4ef8953a92eb448c6c7da");
            } else {
                AddCartDialog.this.dismiss();
            }
        }

        @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
        public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2710740947851deb1649af92d7a7c8e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2710740947851deb1649af92d7a7c8e");
                return;
            }
            AddCartDialog.this.dismiss();
            if (TextUtils.isEmpty(aVar.getMessage())) {
                return;
            }
            am.a(AddCartDialog.this.bB_(), aVar.getMessage());
        }
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c99b7f450b13abd2240f88fb6ea23855", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c99b7f450b13abd2240f88fb6ea23855")).intValue();
        }
        Editable text = this.d.getText();
        return text == null ? i : r.a(text.toString(), i);
    }

    private String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17a2a6fb3259bf0e5d99507c7baf7ad2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17a2a6fb3259bf0e5d99507c7baf7ad2") : this.f == null ? "" : this.f.d();
    }

    private GoodsSpu b() {
        if (this.e == null || this.e.h == null || this.e.h.food == null) {
            return null;
        }
        return this.e.h.food.spu;
    }

    private GoodsSku d() {
        if (this.e == null || this.e.h == null || this.e.h.food == null) {
            return null;
        }
        return this.e.h.food.sku;
    }

    private GoodsAttr[] e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d452131e4cee3aabde3d4037e3de82fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d452131e4cee3aabde3d4037e3de82fb");
        }
        if (this.e == null || this.e.h == null || this.e.h.food == null) {
            return null;
        }
        return this.e.h.food.getAttrIds();
    }

    public final void a(com.sankuai.waimai.drug.model.f fVar, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        GoodsSku d;
        Object[] objArr = {fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0427fe1f5bd06fc4c53905bd1fb39c9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0427fe1f5bd06fc4c53905bd1fb39c9a");
            return;
        }
        this.e = fVar;
        this.f = aVar;
        super.show();
        this.d.requestFocus();
        a(String.valueOf(f()));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97bca0129ba779381b5865149cace94a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97bca0129ba779381b5865149cace94a");
            return;
        }
        GoodsSpu b = b();
        if (b == null || (d = d()) == null || this.f == null) {
            return;
        }
        com.sankuai.waimai.store.manager.judas.b.b(this.h, com.sankuai.waimai.store.manager.judas.b.a((Object) getContext()), "b_waimai_j6o7xclj_mv").a("poi_id", this.f.d()).a("spu_id", Long.valueOf(b.id)).a("sku_id", Long.valueOf(d.id)).a();
    }

    private int f() {
        GoodsSku d;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e57dfeb8606b0ea1b6dd06cebeb600fd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e57dfeb8606b0ea1b6dd06cebeb600fd")).intValue();
        }
        GoodsSpu b = b();
        if (b == null || (d = d()) == null) {
            return 0;
        }
        return com.sankuai.waimai.store.order.a.e().a(a(), b.id, d.id, e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1cff43f5f31d9ad41a8b958191ed1dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1cff43f5f31d9ad41a8b958191ed1dd");
        } else if (this.b == 3) {
        } else {
            if (i == 2) {
                if (this.b == 1) {
                    this.b = 3;
                } else {
                    this.b = 2;
                }
            } else if (i == 1) {
                if (this.b == 2) {
                    this.b = 3;
                } else {
                    this.b = 1;
                }
            }
        }
    }
}
