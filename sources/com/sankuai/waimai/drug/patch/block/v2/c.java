package com.sankuai.waimai.drug.patch.block.v2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    final g b;
    public final List<f> c;
    com.sankuai.waimai.drug.model.g d;
    @NonNull
    protected final com.sankuai.waimai.store.expose.a<Integer> e;
    a f;
    private LinearLayout g;
    private View h;
    private TextView i;
    private ImageView j;
    private TextView k;
    private TextView l;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public c(@NonNull @NotNull Context context, g gVar) {
        super(context);
        Object[] objArr = {context, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18caffba46fc28cfcd6965be13fb0b03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18caffba46fc28cfcd6965be13fb0b03");
            return;
        }
        this.c = new ArrayList();
        this.b = gVar;
        this.e = new com.sankuai.waimai.store.expose.a<Integer>() { // from class: com.sankuai.waimai.drug.patch.block.v2.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.expose.a
            public final /* synthetic */ boolean a(View view, Integer num) {
                com.sankuai.waimai.drug.model.a aVar;
                Integer num2 = num;
                Object[] objArr2 = {view, num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9adce8b0d7172a8b18b52dfb6f27de3e", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9adce8b0d7172a8b18b52dfb6f27de3e")).booleanValue();
                }
                if (view == null || num2 == null || c.this.d == null || (aVar = (com.sankuai.waimai.drug.model.a) com.sankuai.shangou.stone.util.a.a((List<Object>) c.this.d.c, num2.intValue())) == null) {
                    return true;
                }
                c.this.b.b().a(aVar, num2.intValue());
                return true;
            }
        };
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull @NotNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ddadca364d932499c4513587a7971df", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ddadca364d932499c4513587a7971df") : layoutInflater.inflate(R.layout.wm_drug_shopcart_patchwork_layout_combination_root_view, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8e42d71d54f36ebf21628f67722f99e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8e42d71d54f36ebf21628f67722f99e");
            return;
        }
        View view = this.mView;
        this.g = (LinearLayout) view.findViewById(R.id.root_view);
        this.h = view.findViewById(R.id.expand_btn);
        this.i = (TextView) view.findViewById(R.id.tv_expand_btn_text);
        this.j = (ImageView) view.findViewById(R.id.iv_expand_btn_arrow);
        this.k = (TextView) view.findViewById(R.id.title);
        this.l = (TextView) view.findViewById(R.id.legal_text);
        view.findViewById(R.id.background).setBackground(com.sankuai.waimai.store.util.e.b(view.getContext(), (int) R.color.wm_st_common_white, (int) R.dimen.wm_sc_common_dimen_12));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.waimai.drug.model.g r29) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.drug.patch.block.v2.c.a(com.sankuai.waimai.drug.model.g):void");
    }

    public static /* synthetic */ void b(c cVar, com.sankuai.waimai.drug.model.g gVar, View view) {
        Object[] objArr = {cVar, gVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44f4be84b2cc53c28c4fc10b41de8c4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44f4be84b2cc53c28c4fc10b41de8c4a");
            return;
        }
        if (cVar.f != null) {
            cVar.f.a();
        }
        gVar.e = false;
        cVar.a(gVar);
    }

    public static /* synthetic */ void a(c cVar, com.sankuai.waimai.drug.model.g gVar, View view) {
        Object[] objArr = {cVar, gVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6add005c8df9f2ce3f0185118ca7341f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6add005c8df9f2ce3f0185118ca7341f");
            return;
        }
        gVar.e = true;
        cVar.a(gVar);
        cVar.b.b().i();
    }

    @Nullable
    private Drawable a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3f9144ec472050a9af47359cc9991bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3f9144ec472050a9af47359cc9991bd");
        }
        if (drawable == null) {
            return null;
        }
        try {
            Bitmap a2 = com.sankuai.shangou.stone.util.b.a(drawable);
            if (a2 != null) {
                return new BitmapDrawable(this.mView.getResources(), com.sankuai.shangou.stone.util.b.a(a2, 180.0f));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
