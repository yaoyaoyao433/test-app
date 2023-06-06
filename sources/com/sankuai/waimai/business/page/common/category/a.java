package com.sankuai.waimai.business.page.common.category;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.page.common.model.ChannelSubCategory;
import com.sankuai.waimai.business.page.common.util.CircleBitmapTransformation;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.c;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a<T extends ChannelSubCategory> extends c<C0757a> {
    public static ChangeQuickRedirect a;
    protected List<T> b;
    protected int c;
    protected boolean d;
    public float e;
    public float f;
    CircleBitmapTransformation g;

    @Override // com.sankuai.waimai.log.judas.c
    /* renamed from: b */
    public a<T>.C0757a a(ViewGroup viewGroup, int i) {
        return null;
    }

    public void b(int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // android.support.v7.widget.RecyclerView.a
    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.s sVar, int i) {
        C0757a c0757a = (C0757a) sVar;
        Object[] objArr = {c0757a, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69306c95165c1265ebca406653559895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69306c95165c1265ebca406653559895");
            return;
        }
        T t = this.b.get(i);
        ?? r8 = this.c == i ? 1 : 0;
        Object[] objArr2 = {t, Byte.valueOf((byte) r8)};
        ChangeQuickRedirect changeQuickRedirect2 = C0757a.a;
        if (PatchProxy.isSupport(objArr2, c0757a, changeQuickRedirect2, false, "49ae23e23173589756baf699ca37ce96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c0757a, changeQuickRedirect2, false, "49ae23e23173589756baf699ca37ce96");
            return;
        }
        c0757a.d.setText(t.name);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = C0757a.a;
        if (PatchProxy.isSupport(objArr3, c0757a, changeQuickRedirect3, false, "f2c06438880d692d606a0fbace78d355", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, c0757a, changeQuickRedirect3, false, "f2c06438880d692d606a0fbace78d355");
        } else {
            c0757a.d.setScaleX(a.this.f);
            c0757a.d.setScaleY(a.this.f);
        }
        int a2 = g.a(c0757a.itemView.getContext(), 42.0f);
        String a3 = ImageQualityUtil.a(c0757a.itemView.getContext(), t.iconUrl, 2, a2, a2);
        b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
        c.c = a3;
        c.k = 4;
        c.i = r8 != 0 ? 0 : R.drawable.wm_page_transparent_loading;
        c.j = R.drawable.wm_page_transparent_loading;
        c.a(a.this.g).a(c0757a.c);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = C0757a.a;
        if (PatchProxy.isSupport(objArr4, c0757a, changeQuickRedirect4, false, "6cd66eec3dc370775209757f945358ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, c0757a, changeQuickRedirect4, false, "6cd66eec3dc370775209757f945358ca");
        } else {
            if (c0757a.b != null) {
                c0757a.b.setAlpha(a.this.e);
            }
            if (c0757a.c != null) {
                c0757a.c.setAlpha(a.this.e);
            }
            if (c0757a.e != null) {
                c0757a.e.setAlpha(1.0f - a.this.e);
            }
        }
        c0757a.a(r8);
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "844b2aa6ced6805c6ae0c772b2367178", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "844b2aa6ced6805c6ae0c772b2367178");
            return;
        }
        this.b = new ArrayList();
        this.d = false;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = new CircleBitmapTransformation(g.a(context, 45.0f), 0);
    }

    public final void a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79613b5312f3a94eb830c5ed4dd6acee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79613b5312f3a94eb830c5ed4dd6acee");
            return;
        }
        this.b.clear();
        if (d.a(list)) {
            return;
        }
        this.b.addAll(list);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6df0b9e3466a626bf768e82a95926bd9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6df0b9e3466a626bf768e82a95926bd9")).intValue() : this.b.size();
    }

    public final void a(int i) {
        this.c = i;
    }

    public final int a() {
        return this.c;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.common.category.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0757a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public ImageView b;
        public ImageView c;
        public TextView d;
        public View e;
        public int f;
        public int g;

        public C0757a(View view) {
            super(view);
            Object[] objArr = {a.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07dc9eb78e443d9ea4fbba9ee5d1191b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07dc9eb78e443d9ea4fbba9ee5d1191b");
                return;
            }
            this.f = 0;
            this.g = 0;
            this.b = (ImageView) view.findViewById(R.id.item_selected);
            this.c = (ImageView) view.findViewById(R.id.cat_image);
            this.d = (TextView) view.findViewById(R.id.cat_title);
            this.e = view.findViewById(R.id.item_selected_bottom);
        }

        private void b(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "616761ca52132e658e00ec0fdf32cdb5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "616761ca52132e658e00ec0fdf32cdb5");
            } else if (z) {
                if (this.b != null) {
                    this.b.setImageResource(R.drawable.wm_page_kingkong_category_item_selected_bg);
                }
            } else if (this.b != null) {
                this.b.setImageResource(R.drawable.wm_page_kingkong_category_item_normal_bg);
            }
        }

        void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "632ff4118748589eeae414b0f644b7ae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "632ff4118748589eeae414b0f644b7ae");
                return;
            }
            b(z);
            if (z) {
                this.d.setTypeface(Typeface.DEFAULT_BOLD);
                TextView textView = this.d;
                Context context = this.itemView.getContext();
                int i = this.g;
                int i2 = R.color.wm_page_kingkong_category_text_highlight;
                textView.setTextColor(ContextCompat.getColor(context, i > 0 ? this.g : R.color.wm_page_kingkong_category_text_highlight));
                this.e.setVisibility(0);
                this.e.setBackgroundColor(ContextCompat.getColor(this.itemView.getContext(), this.g > 0 ? this.g : R.color.wm_page_kingkong_category_text_highlight));
                if (a.this.d) {
                    this.e.setVisibility(0);
                    View view = this.e;
                    Context context2 = this.itemView.getContext();
                    if (this.g > 0) {
                        i2 = this.g;
                    }
                    view.setBackgroundColor(ContextCompat.getColor(context2, i2));
                    return;
                }
                return;
            }
            this.d.setTypeface(Typeface.DEFAULT);
            this.d.setTextColor(ContextCompat.getColor(this.itemView.getContext(), this.f > 0 ? this.f : R.color.wm_page_kingkong_category_normal_txt_colot));
            this.e.setVisibility(4);
        }
    }
}
