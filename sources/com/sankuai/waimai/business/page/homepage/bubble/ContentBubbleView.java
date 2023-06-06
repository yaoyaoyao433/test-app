package com.sankuai.waimai.business.page.homepage.bubble;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.tencent.rtmp.TXLiveConstants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ContentBubbleView extends RelativeLayout implements a {
    public static ChangeQuickRedirect a = null;
    private static final String b = "ContentBubbleView";
    private Context c;
    private ViewGroup d;
    private ViewGroup e;
    private TagCanvasView f;
    private View g;
    private ImageView h;
    private View i;
    private TextView j;
    private View k;
    private ImageView l;
    private ImageView m;
    private View n;
    private ImageView o;
    private com.sankuai.waimai.platform.widget.tag.virtualtag.g p;
    private final int q;

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public final void b() {
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public View getView() {
        return this;
    }

    public ContentBubbleView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69807cd35ceed66bde2a17837f5259ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69807cd35ceed66bde2a17837f5259ee");
        }
    }

    public ContentBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "055374a7e7daa86a5323ff87993418c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "055374a7e7daa86a5323ff87993418c2");
        }
    }

    public ContentBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c0efabc13b182ef2381ec16433eabff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c0efabc13b182ef2381ec16433eabff");
            return;
        }
        this.c = context;
        this.q = a(160.0f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "264b3808f9a32d73b7fd4f570ba8f0f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "264b3808f9a32d73b7fd4f570ba8f0f4");
            return;
        }
        super.onFinishInflate();
        this.d = (ViewGroup) findViewById(R.id.big_bubble_layout);
        this.e = (ViewGroup) findViewById(R.id.message_layout);
        this.f = (TagCanvasView) findViewById(R.id.big_bubble_content);
        this.g = findViewById(R.id.small_bubble_layout);
        this.h = (ImageView) findViewById(R.id.small_bubble_view);
        this.i = findViewById(R.id.small_bubble_text_layout);
        this.n = findViewById(R.id.fill_bubble_layout);
        this.j = (TextView) findViewById(R.id.small_bubble_text_view);
        this.k = findViewById(R.id.icon_layout);
        this.l = (ImageView) findViewById(R.id.view_red_dot);
        this.m = (ImageView) findViewById(R.id.icon_dynamic);
        this.o = (ImageView) findViewById(R.id.fill_bubble_img_view);
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public final void a(int[] iArr, View view) {
        Object[] objArr = {iArr, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0044e25054aa693674505c3cb4d4dcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0044e25054aa693674505c3cb4d4dcc");
            return;
        }
        view.getLocationInWindow(iArr);
        measure(0, 0);
        DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
        int bubbleWidth = getBubbleWidth();
        int bubbledHeight = getBubbledHeight();
        int min = Math.min(Math.max((iArr[0] + (view.getWidth() / 2)) - (bubbleWidth / 2), a(8.0f)), (displayMetrics.widthPixels - bubbleWidth) - a(8.0f));
        int max = Math.max((iArr[1] + view.getHeight()) - bubbledHeight, 0);
        if (!com.sankuai.waimai.foundation.core.a.d()) {
            max += com.sankuai.waimai.foundation.utils.g.a(this.c, 8.0f);
        }
        iArr[0] = min;
        iArr[1] = max;
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public int getBubbleWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d224784c2cd92e1b673735bff8d185f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d224784c2cd92e1b673735bff8d185f9")).intValue();
        }
        return Math.min(this.q, getWidth() != 0 ? getWidth() : getMeasuredWidth());
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public int getBubbledHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1df28057f1e80e2f869a263ed1bce80", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1df28057f1e80e2f869a263ed1bce80")).intValue() : getHeight() != 0 ? getHeight() : getMeasuredHeight();
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public int getBigBubbleMeasuredHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b16514b2f302a8a34f3b551b2cf59b1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b16514b2f302a8a34f3b551b2cf59b1")).intValue() : this.d.getMeasuredHeight();
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public final void a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64eaf37d7e0d24314f4cdcb13d3454ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64eaf37d7e0d24314f4cdcb13d3454ca");
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            JSONObject jSONObject = null;
            try {
                jSONObject = new JSONObject((String) charSequence);
            } catch (JSONException unused) {
            }
            if (jSONObject != null) {
                this.d.setVisibility(0);
                List<com.sankuai.waimai.platform.widget.tag.model.d> a2 = com.sankuai.waimai.platform.widget.tag.util.a.a(this.c, (List) k.a().fromJson(jSONObject.optString("tags", ""), new TypeToken<List<com.sankuai.waimai.platform.widget.tag.api.d>>() { // from class: com.sankuai.waimai.business.page.homepage.bubble.ContentBubbleView.1
                }.getType()));
                if (this.p == null) {
                    this.p = new com.sankuai.waimai.platform.widget.tag.virtualtag.g(this.c, a2);
                } else {
                    this.p.b(a2);
                    this.p.notifyChanged();
                }
                this.f.setAdapter(this.p);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(Color.parseColor("#FF4A26"));
                gradientDrawable.setCornerRadius(a(50.0f));
                this.e.setBackground(gradientDrawable);
            }
        }
        measure(0, 0);
    }

    @Override // com.sankuai.waimai.business.page.homepage.bubble.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "623504814e9c1b26ab31c4a5da0d2486", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "623504814e9c1b26ab31c4a5da0d2486");
            return;
        }
        com.sankuai.waimai.business.page.home.model.a aVar = b.a().c;
        if (aVar != null) {
            this.d.setVisibility(8);
            this.l.setVisibility(8);
            this.g.setVisibility(8);
            this.i.setVisibility(8);
            this.n.setVisibility(8);
            if (aVar.d == 1) {
                this.l.setVisibility(0);
            } else if (aVar.d == 2) {
                this.g.setVisibility(0);
                RequestCreator h = Picasso.g(getContext()).d(aVar.f).h();
                h.d = true;
                h.a(this.h);
            } else if (aVar.d == 4) {
                if (!TextUtils.isEmpty(aVar.e)) {
                    this.i.setVisibility(0);
                    this.j.setText(aVar.e);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(Color.parseColor("#FF4A26"));
                    gradientDrawable.setCornerRadius(a(50.0f));
                    gradientDrawable.setStroke(a(0.5f), -1);
                    this.j.setBackground(gradientDrawable);
                }
            } else if (aVar.d == 5 && !TextUtils.isEmpty(aVar.f)) {
                this.n.setVisibility(0);
                RequestCreator h2 = Picasso.g(getContext()).d(aVar.f).h();
                h2.d = true;
                h2.a(this.o);
            }
            if (TextUtils.isEmpty(aVar.c)) {
                this.k.setBackgroundColor(0);
                this.m.setVisibility(8);
            } else {
                String str = aVar.c;
                this.m.setVisibility(0);
                Picasso.g(getContext()).d(str).h().e().a(new com.meituan.android.base.transformation.a(getContext(), TXLiveConstants.RENDER_ROTATION_180, 0)).a(this.m, new Callback() { // from class: com.sankuai.waimai.business.page.homepage.bubble.ContentBubbleView.2
                    public static ChangeQuickRedirect a;

                    @Override // com.squareup.picasso.Callback
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74fd0a87244fe817f448e1b9a5f655c5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74fd0a87244fe817f448e1b9a5f655c5");
                        } else {
                            ContentBubbleView.this.k.setBackgroundColor(-1);
                        }
                    }

                    @Override // com.squareup.picasso.Callback
                    public final void b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d37c506da417bb1e913f84287601678b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d37c506da417bb1e913f84287601678b");
                        } else {
                            ContentBubbleView.this.k.setBackgroundColor(0);
                        }
                    }
                });
            }
        }
        measure(0, 0);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6fd1e117fac025219827afaed77a6f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6fd1e117fac025219827afaed77a6f5");
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.q), View.MeasureSpec.getMode(i)), i2);
        }
    }

    private int a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451c85646ce3afba9ce83146c6b24e48", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451c85646ce3afba9ce83146c6b24e48")).intValue() : (int) ((f * this.c.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
