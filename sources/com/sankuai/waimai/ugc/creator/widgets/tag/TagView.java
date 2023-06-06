package com.sankuai.waimai.ugc.creator.widgets.tag;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.widgets.RooImageView;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.ugc.creator.utils.n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class TagView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private int A;
    private String B;
    private int C;
    private TagData D;
    private int E;
    private int F;
    private int G;
    private a H;
    int b;
    int c;
    TagBoard d;
    Guideline e;
    int f;
    int g;
    int h;
    private ImageView i;
    private LinearLayout j;
    private RooImageView k;
    private TextView l;
    private RooImageView m;
    private ImageView n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private String v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface TagDirection {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(TagView tagView, TagData tagData);

        void b(TagView tagView, TagData tagData);
    }

    public static /* synthetic */ void a(TagView tagView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, tagView, changeQuickRedirect, false, "46352056673226c08515a961a2f29154", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, tagView, changeQuickRedirect, false, "46352056673226c08515a961a2f29154");
            return;
        }
        ViewParent parent = tagView.getParent();
        if (parent instanceof TagBoard) {
            ((TagBoard) parent).removeView(tagView);
            if (tagView.H != null) {
                tagView.H.a(tagView, tagView.D);
            }
        }
    }

    public static /* synthetic */ void b(TagView tagView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, tagView, changeQuickRedirect, false, "72a432a1bc709050559c39f31bea0e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, tagView, changeQuickRedirect, false, "72a432a1bc709050559c39f31bea0e51");
        } else {
            tagView.a(tagView.b == 1 ? 2 : 1, ((tagView.b == 1 ? tagView.getLeft() : tagView.d.getWidth() - tagView.getRight()) + tagView.p) - tagView.h);
        }
    }

    public TagView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67b374a7c2a3d80e5104329d10e65641", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67b374a7c2a3d80e5104329d10e65641");
        }
    }

    private TagView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30490495b8324b6e9ad548d079dfa4c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30490495b8324b6e9ad548d079dfa4c1");
        }
    }

    public TagView(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98e4c6b98450cf1e52d3723d8fb314ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98e4c6b98450cf1e52d3723d8fb314ff");
        }
    }

    private TagView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96a8868ae0251f68d8782197d18794f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96a8868ae0251f68d8782197d18794f8");
            return;
        }
        this.b = 1;
        setOrientation(0);
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58387389c2d42c2e05570bc2bcddf34a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58387389c2d42c2e05570bc2bcddf34a");
        } else {
            this.h = g.a(context, 20.0f);
            this.o = g.a(context, 5.5f);
            this.p = this.o * 2;
            this.q = g.a(context, 17.0f);
            this.r = g.a(context, 12.0f);
            this.s = g.a(context, 25.0f);
            this.u = g.a(context, 15.0f);
            this.t = this.u * 2;
        }
        try {
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cb7affa77c1939123d500107883b931f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cb7affa77c1939123d500107883b931f");
                return;
            }
            int i3 = this.q - this.p;
            int a2 = g.a(context, 12.0f);
            int a3 = g.a(context, 5.0f);
            this.i = new ImageView(context);
            this.i.setImageResource(R.drawable.wm_ugc_creator_tag_anchor_bg);
            this.i.setPaddingRelative(0, 0, i3, 0);
            addView(this.i, new LinearLayout.LayoutParams(this.q, -1));
            this.j = new LinearLayout(context);
            this.j.setOrientation(0);
            this.j.setBackgroundResource(R.drawable.wm_ugc_creator_tag_bg);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            addView(this.j, layoutParams);
            this.k = new RooImageView(context);
            this.k.setImageResourceByResName("ugccreator_waimai_c_ugc_media_tag_del");
            this.k.setPaddingRelative(a2, 0, a3, 0);
            this.j.addView(this.k, new LinearLayout.LayoutParams(this.s, -1));
            this.l = new TextView(context);
            this.l.setGravity(16);
            this.l.setMaxLines(1);
            this.l.setSingleLine(true);
            this.l.setEllipsize(TextUtils.TruncateAt.END);
            this.l.setTextColor(-1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
            layoutParams2.weight = 1.0f;
            this.j.addView(this.l, layoutParams2);
            this.m = new RooImageView(context);
            this.m.setImageResourceByResName("ugccreator_waimai_c_ugc_media_tag_del");
            this.m.setPaddingRelative(a3, 0, a2, 0);
            this.j.addView(this.m, new LinearLayout.LayoutParams(this.s, -1));
            this.n = new ImageView(context);
            this.n.setImageResource(R.drawable.wm_ugc_creator_tag_anchor_bg);
            this.n.setPaddingRelative(i3, 0, 0, 0);
            addView(this.n, new LinearLayout.LayoutParams(this.q, -1));
            this.k.setVisibility(8);
            this.n.setVisibility(8);
            this.l.setPaddingRelative(this.r, 0, 0, 0);
            this.k.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.widgets.tag.TagView.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a5e1ff70ebb722634f2ac33c8a929cb1", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a5e1ff70ebb722634f2ac33c8a929cb1");
                    } else {
                        TagView.a(TagView.this);
                    }
                }
            });
            this.m.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.widgets.tag.TagView.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d16b769fcdc872c8bbf4093f6ee0fa31", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d16b769fcdc872c8bbf4093f6ee0fa31");
                    } else {
                        TagView.a(TagView.this);
                    }
                }
            });
            this.l.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.ugc.creator.widgets.tag.TagView.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6150d667acc41482ab8a002ef31ebffa", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6150d667acc41482ab8a002ef31ebffa");
                    } else {
                        TagView.b(TagView.this);
                    }
                }
            });
        } catch (Exception e) {
            String exc = e.toString();
            Object[] objArr4 = {exc};
            ChangeQuickRedirect changeQuickRedirect4 = n.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "940bea42b30528fb50a5c5698a37f971", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "940bea42b30528fb50a5c5698a37f971");
            } else {
                n.a(exc, "error");
            }
        }
    }

    public final void a(TagBoard tagBoard, TagData tagData) {
        Object[] objArr = {tagBoard, tagData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4aa10093c8aeab9ceb288cf0ee6e862", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4aa10093c8aeab9ceb288cf0ee6e862");
        } else if (getParent() != null || tagData == null || TextUtils.isEmpty(tagData.d)) {
        } else {
            this.D = tagData;
            this.d = tagBoard;
            this.F = this.d.getId();
            if (this.F < 0) {
                this.F = generateViewId();
                this.d.setId(this.F);
            }
            this.E = generateViewId();
            setId(this.E);
            this.f = (int) (this.d.getWidth() * tagData.f);
            this.g = (int) (this.d.getHeight() * tagData.g);
            if (this.f - this.o < this.h) {
                this.f = this.h + this.o;
            }
            if (this.f + this.o + this.h > this.d.getWidth()) {
                this.f = (this.d.getWidth() - this.h) - this.o;
            }
            if (this.g - this.u < this.h) {
                this.g = this.h + this.u;
            }
            if (this.g + this.u + this.h > this.d.getHeight()) {
                this.g = (this.d.getHeight() - this.h) - this.u;
            }
            int i = tagData.c == 2 ? this.f + this.o : this.f - this.o;
            int width = tagData.c == 2 ? i - this.h : (this.d.getWidth() - i) - this.h;
            this.e = new Guideline(getContext());
            this.G = generateViewId();
            this.e.setId(this.G);
            ConstraintLayout.a aVar = new ConstraintLayout.a(-2, -2);
            aVar.S = 1;
            aVar.a = i;
            this.d.addView(this.e, aVar);
            ConstraintLayout.a aVar2 = new ConstraintLayout.a(0, this.t);
            aVar2.h = this.F;
            aVar2.topMargin = this.g - this.u;
            if (tagData.c == 2) {
                aVar2.r = this.G;
            } else {
                aVar2.p = this.G;
            }
            this.d.addView(this, aVar2);
            setTagText(tagData.d);
            b(tagData.c, width);
        }
    }

    public final void setCallback(a aVar) {
        this.H = aVar;
    }

    public final void setTagText(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a39596e52ecca297ec2e0c0d53158c64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a39596e52ecca297ec2e0c0d53158c64");
            return;
        }
        Object[] objArr2 = {str, 4, 12};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d129456a974c535fe041a8ab7b781353", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d129456a974c535fe041a8ab7b781353");
        } else if (str != null) {
            this.v = str;
            this.w = 4;
            this.x = 12;
            this.y = str.length();
            this.z = this.v.codePointCount(0, this.y);
            String str2 = this.v;
            if (this.x > 0 && this.x < this.z) {
                str2 = a(this.v, 0, this.x) + "…";
            }
            this.B = "";
            if (this.w > 0) {
                if (this.w >= this.z) {
                    this.B = this.v;
                } else {
                    this.B = a(this.v, 0, this.w) + "…";
                }
            }
            this.C = (int) Math.ceil(this.l.getPaint().measureText(this.B));
            this.A = this.s + this.q + ((int) Math.ceil(this.l.getPaint().measureText(str2))) + this.r;
            this.c = this.s + this.q + this.C + this.r;
            this.A = Math.min(this.d.getWidth() - (this.h * 2), this.A);
            this.c = Math.min(this.c, this.A);
            this.l.setText(str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da5ff9865d428933acfab1c2b0a5bd36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da5ff9865d428933acfab1c2b0a5bd36");
        } else {
            c(i2, a(i));
        }
    }

    private void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0722ea9e9ddaff3970997e0a8032e7f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0722ea9e9ddaff3970997e0a8032e7f1");
            return;
        }
        a(i);
        c(i2, 0);
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10ea8b11b91235cdfb6a1b23ad42b491", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10ea8b11b91235cdfb6a1b23ad42b491")).intValue();
        }
        if (this.b != i) {
            this.b = i;
            if (this.b == 2) {
                this.i.setVisibility(8);
                this.k.setVisibility(0);
                this.n.setVisibility(0);
                this.m.setVisibility(8);
                this.l.setPaddingRelative(0, 0, this.r, 0);
            } else {
                this.i.setVisibility(0);
                this.k.setVisibility(8);
                this.n.setVisibility(8);
                this.m.setVisibility(0);
                this.l.setPaddingRelative(this.r, 0, 0, 0);
            }
            ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
            if (this.b == 2) {
                aVar.r = this.G;
                aVar.p = -1;
            } else {
                aVar.p = this.G;
                aVar.r = -1;
            }
            setLayoutParams(aVar);
            return 0 + (this.b == 2 ? this.p : -this.p);
        }
        return 0;
    }

    private void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "726f890a265d92f9d572ae8da6e04dcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "726f890a265d92f9d572ae8da6e04dcd");
            return;
        }
        if (i >= this.A) {
            setTagWidth(this.A);
        } else if (i >= this.c) {
            setTagWidth(i);
        } else {
            int i3 = this.c - i;
            if (this.b != 2) {
                i3 = -i3;
            }
            i2 += i3;
            setTagWidth(this.c);
        }
        if (i2 != 0) {
            this.f += i2;
            ConstraintLayout.a aVar = (ConstraintLayout.a) this.e.getLayoutParams();
            aVar.a += i2;
            this.e.setLayoutParams(aVar);
        }
        a();
    }

    private void setTagWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23b51267362d83e02ea8bcc82ae7de91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23b51267362d83e02ea8bcc82ae7de91");
        } else {
            ah.b(this, i, Integer.MIN_VALUE);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21866b980f16d28e49c04bc5af928563", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21866b980f16d28e49c04bc5af928563");
            return;
        }
        float width = this.f / this.d.getWidth();
        float height = this.g / this.d.getHeight();
        this.D.f = width;
        this.D.g = height;
        this.D.c = this.b;
        if (this.H != null) {
            this.H.b(this, this.D);
        }
    }

    public final int getTagDirection() {
        return this.b;
    }

    public final int getAnchorRadius() {
        return this.o;
    }

    private static String a(String str, int i, int i2) {
        Object[] objArr = {str, 0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "895160dd9a167c44b49148970a822db7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "895160dd9a167c44b49148970a822db7");
        }
        try {
            return str.substring(str.offsetByCodePoints(0, 0), str.offsetByCodePoints(0, i2));
        } catch (Exception unused) {
            return "";
        }
    }
}
