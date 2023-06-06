package com.sankuai.waimai.store.poi.list.newp.sg;

import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ad;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.q;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.sg.a;
import com.sankuai.waimai.store.poi.list.widget.kingkong.home.HomeScrollKingKongView;
import com.sankuai.waimai.store.repository.model.PoiUserSpuScrollKingKong;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.PrimaryFilterCondList;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.widgets.HorizontalScrollBarView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.poi.list.newp.sg.a<com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String>> {
    public static ChangeQuickRedirect a;
    RecyclerView i;
    HorizontalScrollBarView j;
    a k;
    int l;
    int m;
    int n;
    private ViewGroup o;
    private ImageView p;
    private LinearLayout q;
    private LinearLayout r;
    private int s;

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final int b() {
        return R.layout.wm_sc_channel_user_scroll_kingkong_view_block;
    }

    public static /* synthetic */ void a(d dVar, List list) {
        int i;
        int i2;
        TextView textView;
        int i3;
        int desiredWidth;
        ImageView imageView;
        List list2 = list;
        int i4 = 1;
        char c = 0;
        Object[] objArr = {list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "6fec6f641928852bd27109a1b523dfb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "6fec6f641928852bd27109a1b523dfb8");
            return;
        }
        int a2 = h.a(dVar.getContext(), 25.0f);
        int width = dVar.q.getWidth();
        if (com.sankuai.shangou.stone.util.a.a(list) > 0) {
            dVar.q.removeAllViews();
            int i5 = 0;
            int i6 = 0;
            while (i5 < list.size()) {
                String str = (String) list2.get(i5);
                if (t.a(str)) {
                    i = a2;
                } else {
                    Object[] objArr2 = new Object[i4];
                    objArr2[c] = str;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "4d1cddf2d7cd0e2744bc0a2b71d95a6a", RobustBitConfig.DEFAULT_VALUE)) {
                        textView = (TextView) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "4d1cddf2d7cd0e2744bc0a2b71d95a6a");
                        i2 = 1;
                    } else {
                        TextView textView2 = new TextView(dVar.getContext());
                        textView2.setText(str);
                        i2 = 1;
                        textView2.setMaxLines(1);
                        textView2.setTextSize(1, 12.0f);
                        textView2.setTextColor(-32768);
                        textView = textView2;
                    }
                    Object[] objArr3 = new Object[i2];
                    objArr3[0] = textView;
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "0a3c440c637d0c71bbb5822bebe3fac2", RobustBitConfig.DEFAULT_VALUE)) {
                        i3 = 0;
                        desiredWidth = ((Integer) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "0a3c440c637d0c71bbb5822bebe3fac2")).intValue();
                    } else {
                        i3 = 0;
                        desiredWidth = (int) Layout.getDesiredWidth(textView.getText().toString(), 0, textView.getText().length(), textView.getPaint());
                    }
                    i6 += desiredWidth + a2;
                    if (i6 < width) {
                        LinearLayout linearLayout = dVar.q;
                        Object[] objArr4 = new Object[i3];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        i = a2;
                        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "53e606427f024ab284cc7c616e45671e", RobustBitConfig.DEFAULT_VALUE)) {
                            imageView = (View) PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "53e606427f024ab284cc7c616e45671e");
                        } else {
                            ImageView imageView2 = new ImageView(dVar.getContext());
                            imageView2.setImageResource(R.drawable.wm_sc_user_scroll_dot);
                            int a3 = h.a(dVar.getContext(), 6.0f);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(h.a(dVar.getContext(), 3.0f), h.a(dVar.getContext(), 3.0f));
                            layoutParams.leftMargin = h.a(dVar.getContext(), 16.0f);
                            layoutParams.rightMargin = a3;
                            imageView2.setLayoutParams(layoutParams);
                            imageView = imageView2;
                        }
                        linearLayout.addView(imageView);
                        dVar.q.addView(textView);
                    } else {
                        i = a2;
                    }
                }
                i5++;
                a2 = i;
                list2 = list;
                i4 = 1;
                c = 0;
            }
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final /* synthetic */ void a(@NonNull com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar) {
        com.sankuai.waimai.store.base.idata.b<PoiVerticalityDataResponse, String> bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61df5e00e1a89ec07ed62d73d36121f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61df5e00e1a89ec07ed62d73d36121f9");
            return;
        }
        BaseModuleDesc a2 = a(this, bVar2, this.f);
        if (this.c.aa && o.f()) {
            ((LinearLayout.LayoutParams) this.o.getLayoutParams()).setMargins(h.a(this.mContext, 12.0f), 0, h.a(this.mContext, 12.0f), 0);
            this.i.setPadding(0, 0, 0, 0);
            this.o.setBackground(this.mContext.getDrawable(R.drawable.wm_sc_user_scroll_kingkong_promotion_bg));
        }
        final PoiVerticalityDataResponse a3 = bVar2.a(this.f);
        PoiUserSpuScrollKingKong poiUserSpuScrollKingKong = a2.bizJsonData instanceof PoiUserSpuScrollKingKong ? (PoiUserSpuScrollKingKong) a2.bizJsonData : null;
        if (poiUserSpuScrollKingKong != null) {
            ArrayList<PrimaryFilterCondList> arrayList = poiUserSpuScrollKingKong.primaryFilterList;
            final ArrayList<String> arrayList2 = poiUserSpuScrollKingKong.textList;
            String str = poiUserSpuScrollKingKong.picUrl;
            if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                e();
            } else {
                show();
                a aVar = this.k;
                Object[] objArr2 = {arrayList};
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "c5ed392a68c8f1681127a7f741bd1012", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "c5ed392a68c8f1681127a7f741bd1012");
                } else {
                    aVar.b.clear();
                    if (arrayList != null) {
                        aVar.b.addAll(arrayList);
                    }
                    aVar.notifyDataSetChanged();
                }
                this.i.post(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.d.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        PoiVerticalityDataResponse.ButtonArea buttonArea;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7bd835ade06ec39850f9c4367311f70d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7bd835ade06ec39850f9c4367311f70d");
                            return;
                        }
                        d.this.j.setRecyclerWidth(d.this.d());
                        d dVar = d.this;
                        PoiVerticalityDataResponse poiVerticalityDataResponse = a3;
                        Object[] objArr4 = {poiVerticalityDataResponse};
                        ChangeQuickRedirect changeQuickRedirect4 = d.a;
                        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "1127e40cb8bcd6be64b75ae1568edc05", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "1127e40cb8bcd6be64b75ae1568edc05");
                            return;
                        }
                        dVar.d();
                        if (dVar.k.getItemCount() <= 1) {
                            u.b(dVar.j);
                            return;
                        }
                        u.a(dVar.j);
                        int width = (int) (dVar.j.getWidth() * 0.5f);
                        int a4 = com.sankuai.shangou.stone.util.d.a("#FFCC33", dVar.j.getContext().getResources().getColor(R.color.wm_sg_color_00C692));
                        PoiVerticalityDataResponse.Promotion backgroundPromotion = poiVerticalityDataResponse.getBackgroundPromotion();
                        if (backgroundPromotion != null && (buttonArea = backgroundPromotion.buttonArea) != null && !t.a(buttonArea.endColor)) {
                            a4 = com.sankuai.shangou.stone.util.d.a(buttonArea.endColor, a4);
                        }
                        HorizontalScrollBarView horizontalScrollBarView = dVar.j;
                        Object[] objArr5 = {Integer.valueOf(width), Integer.valueOf(a4)};
                        ChangeQuickRedirect changeQuickRedirect5 = HorizontalScrollBarView.a;
                        if (PatchProxy.isSupport(objArr5, horizontalScrollBarView, changeQuickRedirect5, false, "9f132ce61ef8cc66bac6bf0093aa1617", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, horizontalScrollBarView, changeQuickRedirect5, false, "9f132ce61ef8cc66bac6bf0093aa1617");
                            return;
                        }
                        horizontalScrollBarView.b = width;
                        horizontalScrollBarView.c = a4;
                        horizontalScrollBarView.d.setColor(horizontalScrollBarView.c);
                        horizontalScrollBarView.invalidate();
                    }
                });
                if (this.s != arrayList.hashCode()) {
                    this.i.scrollToPosition(0);
                }
                this.s = arrayList.hashCode();
                if (!com.sankuai.shangou.stone.util.a.b(arrayList2) && !t.a(str)) {
                    Object[] objArr3 = {arrayList2, str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bd922bf15fc78ecfd4a646cb8b2a9410", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bd922bf15fc78ecfd4a646cb8b2a9410");
                    } else {
                        this.mView.setPadding(this.mView.getPaddingLeft(), 0, this.mView.getPaddingRight(), this.mView.getPaddingBottom());
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "30a48e767844eb7bca0b7cce1382a75c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "30a48e767844eb7bca0b7cce1382a75c");
                        } else if (this.p == null || this.q == null) {
                            View inflate = ((ViewStub) findView(R.id.stub_selling_points_container)).inflate();
                            this.p = (ImageView) inflate.findViewById(R.id.iv_selling_points_icon);
                            this.q = (LinearLayout) inflate.findViewById(R.id.ll_selling_points_desc_container);
                        }
                        m.b(str, h.a(getContext(), 42.0f), ImageQualityUtil.a()).a(new b.d() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.d.6
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.mtimageloader.config.b.d
                            public final void a() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "493a1c6571f03d971effeb6af8ef7e80", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "493a1c6571f03d971effeb6af8ef7e80");
                                } else {
                                    d.a(d.this, arrayList2);
                                }
                            }

                            @Override // com.sankuai.meituan.mtimageloader.config.b.d
                            public final void a(int i, Exception exc) {
                                Object[] objArr5 = {Integer.valueOf(i), exc};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f8dcc13b704092360b9548badbd2f096", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f8dcc13b704092360b9548badbd2f096");
                                } else {
                                    d.a(d.this, arrayList2);
                                }
                            }
                        }).a(this.p);
                    }
                }
            }
            boolean b2 = ab.b().b(this.i.getContext(), "SHOW_USER_SCROLL", true);
            if ((this.i.getContext() instanceof SCBaseActivity) && b2 && com.sankuai.shangou.stone.util.a.a((List) arrayList) > 10) {
                String w = ((SCBaseActivity) this.i.getContext()).w();
                final ad adVar = new ad(this.i.getContext()) { // from class: com.sankuai.waimai.store.poi.list.newp.sg.d.3
                    @Override // android.support.v7.widget.ad
                    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                        return 1000.0f / displayMetrics.densityDpi;
                    }
                };
                adVar.setTargetPosition(1);
                ab.b().a(this.i.getContext(), "SHOW_USER_SCROLL", false);
                al.a(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.d.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "998ff877a6431574aa7ac2ae3af65114", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "998ff877a6431574aa7ac2ae3af65114");
                        } else {
                            d.this.i.getLayoutManager().startSmoothScroll(adVar);
                        }
                    }
                }, 500, w);
                al.a(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.d.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "788c78d6a82447e609f4180d58dc8f66", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "788c78d6a82447e609f4180d58dc8f66");
                            return;
                        }
                        adVar.setTargetPosition(0);
                        d.this.i.getLayoutManager().startSmoothScroll(adVar);
                    }
                }, 2500, w);
                return;
            }
            return;
        }
        e();
    }

    public d(@NonNull ViewGroup viewGroup, @NonNull com.sankuai.waimai.store.param.a aVar) {
        super(viewGroup, aVar);
        Object[] objArr = {viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6ca8bb57574d5d711d045bbf518cd38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6ca8bb57574d5d711d045bbf518cd38");
        } else {
            this.s = -1;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11ccd45c527b3949e4c88eb5d7a3a970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11ccd45c527b3949e4c88eb5d7a3a970");
            return;
        }
        this.o = (ViewGroup) findView(R.id.scroll_kingkong_root);
        this.i = (RecyclerView) findView(R.id.kingkong_content);
        this.j = (HorizontalScrollBarView) findView(R.id.scrollbar);
        this.r = (LinearLayout) findView(R.id.kingkong_end_layout);
        this.k = new a();
        this.i.setAdapter(this.k);
        this.i.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.l = h.a(getContext());
        this.m = h.a(getContext(), 10.0f);
        this.n = (this.l - this.m) / 5;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c716887110451d5c07094dcda2e13cd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c716887110451d5c07094dcda2e13cd6");
        } else {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_2));
            gradientDrawable.setColor(getContext().getResources().getColor(R.color.wm_sg_color_F1F1F2));
            this.j.setBackground(gradientDrawable);
            this.i.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.poi.list.newp.sg.d.1
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    LinearLayoutManager h;
                    int findFirstVisibleItemPosition;
                    View findViewByPosition;
                    Object[] objArr3 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c2bd6221a43888d24688932d2f3cb529", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c2bd6221a43888d24688932d2f3cb529");
                    } else if (d.this.j.getVisibility() == 8 || (h = q.h(recyclerView)) == null || (findViewByPosition = h.findViewByPosition((findFirstVisibleItemPosition = h.findFirstVisibleItemPosition()))) == null) {
                    } else {
                        int i3 = (-findViewByPosition.getLeft()) + d.this.m;
                        if (findFirstVisibleItemPosition > 0) {
                            i3 = ((d.this.n * 5) - findViewByPosition.getLeft()) + (findFirstVisibleItemPosition > 1 ? d.this.n * (findFirstVisibleItemPosition - 1) : 0);
                        }
                        int a2 = d.this.k.a();
                        Object[] objArr4 = {Integer.valueOf(a2), Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "955d84aa5f2075045d9f20eb3faeee1f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "955d84aa5f2075045d9f20eb3faeee1f");
                            return;
                        }
                        com.sankuai.shangou.stone.util.log.a.b("ChannelScrollKingkongViewBlock,scrollX=%d", Integer.valueOf(i3));
                        d.this.j.a(Math.min(1.0f, (i3 * 1.0f) / ((d.this.n * a2) - d.this.l)));
                    }
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e528cd636609bd095a142f40e17fc92b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e528cd636609bd095a142f40e17fc92b");
        } else if (this.c.aa) {
        } else {
            this.r.setVisibility(0);
            this.r.setBackground(new e.a().a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ContextCompat.getColor(getContext(), R.color.wm_sg_color_FFFFFE), ContextCompat.getColor(getContext(), R.color.wm_sg_color_F5F5F6)}).a());
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.sg.a
    public final void a(@NonNull a.C1279a c1279a) {
        Object[] objArr = {c1279a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ad536db890e6361d7385aa14fb8a6b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ad536db890e6361d7385aa14fb8a6b7");
            return;
        }
        int a2 = c1279a.a(getContext());
        int b2 = c1279a.b(getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
        if (a2 > 0 && a2 != marginLayoutParams.topMargin) {
            marginLayoutParams.topMargin = a2;
        }
        if (b2 > 0 && b2 != marginLayoutParams.bottomMargin) {
            marginLayoutParams.bottomMargin = b2;
        }
        this.o.setLayoutParams(marginLayoutParams);
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34edc2b2d880ee23ae195f2fb97f5543", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34edc2b2d880ee23ae195f2fb97f5543");
            return;
        }
        hide();
        this.s = -1;
    }

    int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b784bdd0432fcef0466e335e35fbfa14", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b784bdd0432fcef0466e335e35fbfa14")).intValue() : this.k.a() * this.n;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class b extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        HomeScrollKingKongView b;

        public b(View view, int i) {
            super(view);
            Object[] objArr = {d.this, view, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccbb60a1f8480f2928792b0043700344", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccbb60a1f8480f2928792b0043700344");
                return;
            }
            this.b = (HomeScrollKingKongView) view;
            this.b.setKingKongColumns(i);
            if (i == 1) {
                this.b.setLayoutParams(new ViewGroup.LayoutParams(d.this.n, -2));
            } else {
                this.b.setLayoutParams(new ViewGroup.LayoutParams(d.this.n * 5, -2));
            }
            this.b.setItemWidth(d.this.n);
            this.b.setVerticalSpace(8);
            this.b.setItemLayoutId(R.layout.wm_sg_poi_list_scroll_king_kong_item_view);
            this.b.setKingKongEventListener(new com.sankuai.waimai.store.poi.list.logreport.b((com.sankuai.waimai.store.expose.v2.a) d.this.getContext(), d.this.c.G, d.this.c.T, d.this.c.c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends RecyclerView.a<b> {
        public static ChangeQuickRedirect a;
        final List<PrimaryFilterCondList> b;

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        public a() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ad309c8366271f5d4f966eab890f119", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ad309c8366271f5d4f966eab890f119");
            } else {
                this.b = new ArrayList();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(@NonNull b bVar, int i) {
            int i2;
            int min;
            b bVar2 = bVar;
            Object[] objArr = {bVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1665039a29a1ac93adee0bb4bc0a7bfa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1665039a29a1ac93adee0bb4bc0a7bfa");
                return;
            }
            if (i == 0) {
                min = Math.min(10, com.sankuai.shangou.stone.util.a.a((List) this.b));
                i2 = 0;
            } else {
                i2 = ((i - 1) * 2) + 10;
                min = Math.min(i2 + 2, com.sankuai.shangou.stone.util.a.a((List) this.b));
            }
            List<PrimaryFilterCondList> a2 = com.sankuai.shangou.stone.util.a.a(this.b, i2, min);
            Object[] objArr2 = {a2, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "9b4c42d30a79fc5566a6ac486be885e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "9b4c42d30a79fc5566a6ac486be885e7");
            } else {
                bVar2.b.a(a2, i2);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        @NonNull
        public final /* synthetic */ b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5dc17766080e6c5cb2c40228e9b6e0c", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5dc17766080e6c5cb2c40228e9b6e0c");
            }
            return new b(new HomeScrollKingKongView(viewGroup.getContext()), i == 0 ? 5 : 1);
        }

        int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55046f58c8ec08a068239e611819797f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55046f58c8ec08a068239e611819797f")).intValue() : (int) Math.ceil((this.b.size() * 1.0d) / 2.0d);
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09f16eb94db0eb90bcf587161d6b1728", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09f16eb94db0eb90bcf587161d6b1728")).intValue();
            }
            int a2 = com.sankuai.shangou.stone.util.a.a((List) this.b);
            if (a2 <= 10) {
                return 1;
            }
            return ((int) Math.ceil(((a2 - 10) * 1.0d) / 2.0d)) + 1;
        }
    }
}
