package com.sankuai.eh.plugins.fupTab;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BlockItemView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private a e;

    public BlockItemView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c10ac79d9e4fed5324c121c3e79a4eda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c10ac79d9e4fed5324c121c3e79a4eda");
        }
    }

    public BlockItemView(Context context, a aVar) {
        this(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "611fa93e85a69b8bb6d151dd564ba32c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "611fa93e85a69b8bb6d151dd564ba32c");
            return;
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7495b375c76dc3f0c5aa5b917538906d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7495b375c76dc3f0c5aa5b917538906d");
            return;
        }
        this.e = aVar;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ehc_plugin_tab_item, (ViewGroup) this, true);
        inflate.setClickable(true);
        this.d = (TextView) inflate.findViewById(R.id.tv_ehc_tab_item_name);
        this.b = (ImageView) inflate.findViewById(R.id.iv_ehc_tab_item_icon);
        this.c = (TextView) inflate.findViewById(R.id.tv_ehc_tab_item_bubble);
        a aVar2 = this.e;
        Object[] objArr3 = {aVar2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d44cb4d5aa735661629eb27dd5386e54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d44cb4d5aa735661629eb27dd5386e54");
            return;
        }
        this.d.setText(aVar2.c);
        Picasso.g(getContext()).d(aVar2.e).a(this.b);
    }

    public BlockItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7282742d153435f06ce0455273b9538a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7282742d153435f06ce0455273b9538a");
        }
    }

    public a getBlockItem() {
        return this.e;
    }

    public void setPressedState(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e7741f6990587e1126a859092f86390", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e7741f6990587e1126a859092f86390");
        } else if (z) {
            this.d.setTextColor(Color.parseColor("#222222"));
            this.d.setAlpha(1.0f);
            this.d.setTypeface(Typeface.DEFAULT_BOLD);
            Picasso.g(getContext()).d(this.e.d).a(this.b);
        } else {
            this.d.setTextColor(Color.parseColor("#333333"));
            this.d.setTypeface(Typeface.DEFAULT);
            Picasso.g(getContext()).d(this.e.e).a(this.b);
        }
    }
}
